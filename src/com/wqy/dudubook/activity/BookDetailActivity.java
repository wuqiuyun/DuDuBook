package com.wqy.dudubook.activity;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.model.IModel.BitmapCallback;
import com.wqy.dudubook.presenter.IBookDetailPresenter;
import com.wqy.dudubook.presenter.ICartPresenter;
import com.wqy.dudubook.presenter.impl.BookDetailPresenterImpl;
import com.wqy.dudubook.presenter.impl.CartPresenterImpl;
import com.wqy.dudubook.utils.BitmapUtil;
import com.wqy.dudubook.utils.GlobalConsts;
import com.wqy.dudubook.utils.ToastUtil;
import com.wqy.dudubook.view.IBookDetailView;
import com.wqy.dumusic.R;

public class BookDetailActivity extends Activity implements IBookDetailView {

	@ViewInject(R.id.tv_book_name)
	private TextView tvBookName;
	@ViewInject(R.id.tv_author)
	private TextView tvAuthor;
	@ViewInject(R.id.tv_category)
	private TextView tvCategory;
	@ViewInject(R.id.tv_date)
	private TextView tvDate;
	@ViewInject(R.id.tv_publish)
	private TextView tvPublish;
	@ViewInject(R.id.tv_description)
	private TextView tvDescription;
	@ViewInject(R.id.tv_price)
	private TextView tvPrice;
	@ViewInject(R.id.iv_bg_pic)
	private ImageView ivBgPic;
	@ViewInject(R.id.iv_book_pic)
	private ImageView ivBookPic;
	@ViewInject(R.id.btn_add_to_cart)
	private Button btnAddCart;

	private IBookDetailPresenter presenter;
	private Book book;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_detail);
		x.view().inject(this);

		Intent intent = getIntent();
		book = (Book) intent.getSerializableExtra("book");
		setBookInfo(book);

		presenter = new BookDetailPresenterImpl(this);
		setListener();
	}

	/**
	 * 
	 */
	private void setListener() {
		btnAddCart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AddToCart();
			}
		});
	}

	/**
	 * 设置图书详情信息
	 * @param book
	 */
	private void setBookInfo(Book book) {
		tvBookName.setText(book.getProductName().toString());
		tvAuthor.setText(book.getAuthor().toString());
		tvCategory.setText(book.getCatalogue().toString());
		tvDate.setText(book.getPublishedTime().toString());
		tvPublish.setText(book.getPublishing().toString());
		tvDescription.setText(book.getDescription().toString());
		tvPrice.setText("￥ " + book.getDangPrice());

		String url = GlobalConsts.URL_GET_PIC_BY_ID + book.getProduct_pic();
		Bitmap bm = BitmapUtil.getBitmap(ivBookPic, url);
		BitmapUtil.loadBluredBitmap(bm, 10, new BitmapCallback() {

			@Override
			public void onBitmapLoaded(Bitmap bitmap) {
				ivBgPic.setImageBitmap(bitmap);
			}
		});
	}

	/**
	 * 添加购物车
	 */
	public void AddToCart() {
		btnAddCart.setEnabled(false);
		presenter.addToCart(book);
	}

	@Override
	public void AddToCartSuccess() {
		btnAddCart.setEnabled(false);
		btnAddCart.setText("已添加");
		ToastUtil.show("添加成功！ ");
	}

	@Override
	public void AddToCartFail() {
		btnAddCart.setEnabled(true);
		ToastUtil.show("添加失败！ ");
	}
}
