package com.wqy.dudubook.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.utils.BitmapUtil;
import com.wqy.dudubook.utils.GlobalConsts;
import com.wqy.dumusic.R;

public class StoreAdapter extends BaseAdapter {
	private Context context;
	private List<Book> books;
	private LayoutInflater inflater;

	public StoreAdapter(Context context, List<Book> books) {
		super();
		this.context = context;
		this.books = books;
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return books.size();
	}

	@Override
	public Book getItem(int position) {
		return books.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_store_gv_book, null);
			holder = new ViewHolder();
			holder.tvBookName = (TextView) convertView
					.findViewById(R.id.tv_book_name);
			holder.ivBookPic = (ImageView) convertView
					.findViewById(R.id.iv_book_pic);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		Book book = getItem(position);
		holder.tvBookName.setText(book.getProductName());

		String url = GlobalConsts.URL_GET_PIC_BY_ID + book.getProduct_pic();
		BitmapUtil.getBitmap(holder.ivBookPic, url);

		return convertView;
	}

	class ViewHolder {
		ImageView ivBookPic;
		TextView tvBookName;
	}
}
