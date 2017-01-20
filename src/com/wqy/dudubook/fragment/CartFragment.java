package com.wqy.dudubook.fragment;

import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.wqy.dudubook.activity.OrderInfoActivity;
import com.wqy.dudubook.adapter.CartItemAdapter;
import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.presenter.ICartPresenter;
import com.wqy.dudubook.presenter.impl.CartPresenterImpl;
import com.wqy.dudubook.view.ICartView;
import com.wqy.dumusic.R;

/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：购物车fragment
 */
public class CartFragment extends Fragment implements ICartView {

	@ViewInject(R.id.lv_cart)
	private ListView lvCartItem;
	@ViewInject(R.id.tv_empty)
	private TextView tvEmpty;
	@ViewInject(R.id.tv_total)
	private TextView tvTotal;
	@ViewInject(R.id.btn_edit)
	private TextView BtnEdit;
	@ViewInject(R.id.btn_submit)
	private Button btnSubmit;

	private CartItemAdapter cartAdapter;
	private List<CartItem> items;
	private ICartPresenter presenter;

	private boolean show = false;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_cart, null);
		presenter = new CartPresenterImpl(this);
		this.items = DDBookApp.getApp().getCart().getItems();
		x.view().inject(this, view);

		setListener();

		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
		setCartAdapter();
		presenter.loadTotalPrice();
	}

	/**
	 * 设置购物车列表的适配器
	 */
	private void setCartAdapter() {
		cartAdapter = new CartItemAdapter(getActivity(), items, lvCartItem);
		// LogUtil.info("CartFragment$setCartAdapteritems-->传值items： " + items);
		lvCartItem.setAdapter(cartAdapter);
		lvCartItem.setEmptyView(tvEmpty);
		cartAdapter.notifyDataSetChanged();
	}

	private void setListener() {
		btnSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),
						OrderInfoActivity.class);
				startActivity(intent);
			}
		});

		BtnEdit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// if(show){
				// cartAdapter.deleteToggle(show);
				// ToastUtil.show("show-->flse");
				// show = true;
				// ToastUtil.show("show-->flse,置true");
				//
				// }else {
				// cartAdapter.deleteToggle(show);
				// ToastUtil.show("show-->true");
				//
				// show = false;
				// ToastUtil.show("show-->true,置flse");
				// }
			}
		});
	}

	@Override
	public void updateTotalPrice(double price) {
		tvTotal.setText("￥" + price);
	}

}
