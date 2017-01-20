package com.wqy.dudubook.adapter;

import java.util.List;

import javax.security.auth.PrivateCredentialPermission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.utils.BitmapUtil;
import com.wqy.dudubook.utils.GlobalConsts;
import com.wqy.dudubook.utils.LogUtil;
import com.wqy.dumusic.R;

public class CartItemAdapter extends BaseAdapter {
	private Context context;
	private List<CartItem> items;
	private LayoutInflater Inflater;
	private ListView listView;

	public CartItemAdapter(Context context, List<CartItem> items,
			ListView listView) {
		super();
		this.items = items;
		this.context = context;
		this.Inflater = LayoutInflater.from(context);
		this.listView = listView;
		LogUtil.info("CartItemAdapter-->获取购物车列表： " + this.items);
	}

	// private boolean show = false;
	/**
	 * 
	 */
	public void deleteToggle(boolean showDel) {
		int maxPosition = getCount() - 1;
		if (showDel = false) {
			for (int i = 0; i <= maxPosition; i++) {
				ImageButton ibDel = (ImageButton) listView
						.findViewWithTag("ibDel" + i);
				ibDel.setVisibility(View.VISIBLE);
			}
		} else {
			for (int i = 0; i <= maxPosition; i++) {
				ImageButton ibDel = (ImageButton) listView
						.findViewWithTag("ibDel" + i);
				ibDel.setVisibility(View.INVISIBLE);
			}
		}
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
			convertView = Inflater
					.inflate(R.layout.item_cart_lv_cartitem, null);
			holder = new ViewHolder();
			holder.ivBookPic = (ImageView) convertView
					.findViewById(R.id.iv_cart_book_pic);
			holder.ibDel = (ImageButton) convertView
					.findViewById(R.id.ib_icon_del);
			holder.ibM = (ImageButton) convertView.findViewById(R.id.ib_icon_m);
			holder.ibP = (ImageButton) convertView.findViewById(R.id.ib_icon_p);
			holder.tvBookName = (TextView) convertView
					.findViewById(R.id.tv_book_name);
			holder.tvCount = (TextView) convertView.findViewById(R.id.tv_count);
			holder.tvNumber = (TextView) convertView
					.findViewById(R.id.tv_number);
			holder.tvPrice = (TextView) convertView.findViewById(R.id.tv_price);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		CartItem cartItem = getItem(position);
		holder.tvBookName.setText(cartItem.getBook().getProductName()
				.toString());
		holder.tvCount.setText("x " + cartItem.getCount());
		holder.tvCount.setTag("tvCount" + position);
		holder.tvNumber.setText(cartItem.getCount() + "");
		holder.tvNumber.setTag("tvnum" + position);
		holder.tvPrice.setText(cartItem.getBook().getDangPrice() + "");
		holder.ibDel.setTag("ibDel" + position);
		BitmapUtil.getBitmap(holder.ivBookPic, GlobalConsts.URL_GET_PIC_BY_ID
				+ cartItem.getBook().getProduct_pic());

		return convertView;
	}

	class ViewHolder {
		ImageView ivBookPic;
		ImageButton ibDel, ibM, ibP;
		TextView tvBookName, tvPrice, tvCount, tvNumber;
	}

}
