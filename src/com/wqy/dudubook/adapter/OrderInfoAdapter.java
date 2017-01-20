package com.wqy.dudubook.adapter;

import java.util.List;

import org.xutils.x;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.utils.BitmapUtil;
import com.wqy.dudubook.utils.GlobalConsts;
import com.wqy.dumusic.R;

public class OrderInfoAdapter extends BaseAdapter {
	private Context context;
	private List<CartItem> items;
	private LayoutInflater inflater;

	public OrderInfoAdapter() {
		super();
		this.context = DDBookApp.getApp();
		this.items = DDBookApp.getApp().getCart().getItems();
		this.inflater = inflater.from(context);
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public CartItem getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_order_info, null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) convertView
					.findViewById(R.id.ivBookPic);
			holder.tvBookName = (TextView) convertView
					.findViewById(R.id.tvBookName);
			holder.tvPrice = (TextView) convertView.findViewById(R.id.tvPrice);
			holder.tvTotalPrice = (TextView) convertView
					.findViewById(R.id.tvTotalPrice);
			holder.tvCount = (TextView) convertView.findViewById(R.id.tvCount);
			convertView.setTag(holder);
		}
		holder = (ViewHolder) convertView.getTag();
		CartItem item = getItem(position);

		BitmapUtil.getBitmap(holder.imageView, GlobalConsts.URL_GET_PIC_BY_ID
				+ item.getBook().getProduct_pic());
		holder.tvBookName.setText(item.getBook().getProductName());
		holder.tvCount.setText("x" + item.getCount());
		holder.tvPrice.setText(item.getBook().getDangPrice() + "гд");
		holder.tvTotalPrice.setText("гд"
				+ (item.getCount() * item.getBook().getDangPrice()));
		return convertView;
	}

	class ViewHolder {
		ImageView imageView;
		TextView tvBookName;
		TextView tvPrice;
		TextView tvTotalPrice;
		TextView tvCount;
	}
}
