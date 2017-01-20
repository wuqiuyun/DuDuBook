package com.wqy.dudubook.activity;

import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.wqy.dudubook.adapter.OrderInfoAdapter;
import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Cart;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.presenter.ICartPresenter;
import com.wqy.dudubook.presenter.impl.CartPresenterImpl;
import com.wqy.dumusic.R;

/**
 * @date：2017年1月20日
 * @author：Qiuyun.Wu
 * @description：确认订单界面
 */
public class OrderInfoActivity extends Activity {

	@ViewInject(R.id.tvReceiveAddress)
	private TextView tvAddress;
	@ViewInject(R.id.iv_more)
	private ImageView ivMore;
	@ViewInject(R.id.lvCart)
	private ListView lvCart;
	@ViewInject(R.id.tvTotalDesc)
	private TextView tvTotalDesc;
	@ViewInject(R.id.btnSubmitOrder)
	private Button btnSubmitOrder;

	private List<CartItem> items;
	private OrderInfoAdapter adapter;
	private Cart cart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_info);
		this.cart = DDBookApp.getApp().getCart();
		x.view().inject(this);
		setListener();
	}

	private void setListener() {
		btnSubmitOrder.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
		setOrderAdapter();
		updateTotalPrice();
	}

	private void updateTotalPrice() {
		String html="共<font color='red'>"+cart.getItems().size()+"</font>件，总金额：<font color='red'>￥"+cart.getTotalPrice()+"</font>";
		tvTotalDesc.setText(Html.fromHtml(html));
	}

	private void setOrderAdapter() {
		if (adapter == null) {
			adapter = new OrderInfoAdapter();
			lvCart.setAdapter(adapter);
		}
		adapter.notifyDataSetChanged();
	}
}
