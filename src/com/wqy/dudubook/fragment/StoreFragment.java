package com.wqy.dudubook.fragment;

import java.util.ArrayList;
import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import com.wqy.dudubook.activity.BookDetailActivity;
import com.wqy.dudubook.adapter.StoreAdapter;
import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.presenter.IStorePresenter;
import com.wqy.dudubook.presenter.impl.StorePresenterImpl;
import com.wqy.dudubook.utils.ToastUtil;
import com.wqy.dudubook.view.IStoreView;
import com.wqy.dumusic.R;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：书城fragment
 */
@SuppressLint("InflateParams")
public class StoreFragment extends Fragment implements IStoreView {
	@ViewInject(R.id.gv_recommend)
	private GridView gvRecommend;
	@ViewInject(R.id.gv_hot)
	private GridView gvHot;
	@ViewInject(R.id.gv_new)
	private GridView gvNew;

	private StoreAdapter recommendAdapter;
	private StoreAdapter hotAdapter;
	private StoreAdapter newAdapter;

	private IStorePresenter storePresenter;

	private List<Book> recommendBooks;
	private List<Book> hotBooks;
	private List<Book> newBooks;

	public StoreFragment() {
		storePresenter = new StorePresenterImpl(this);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_store, null);
		x.view().inject(this, view);

		storePresenter.getRecommendBookList();
		storePresenter.getHotBookList();
		storePresenter.getNewList();

		setListener();

		return view;
	}

	/**
	 * 设置监听器
	 */
	private void setListener() {
		final Intent intent = new Intent(DDBookApp.getApp(),
				BookDetailActivity.class);

		gvRecommend.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Book book = recommendBooks.get(position);
				intent.putExtra("book", book);
				startActivity(intent);
			}
		});

		gvHot.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Book book = hotBooks.get(position);
				intent.putExtra("book", book);
				startActivity(intent);
			}
		});

		gvNew.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Book book = newBooks.get(position);
				intent.putExtra("book", book);
				startActivity(intent);
			}
		});
	}

	@Override
	public void showRecommendBookList(List<Book> books) {
		this.recommendBooks = books;
		if (books != null) {
			recommendAdapter = new StoreAdapter(DDBookApp.getApp(),
					this.recommendBooks);
			gvRecommend.setAdapter(recommendAdapter);
			recommendAdapter.notifyDataSetChanged();
		}
	}

	@Override
	public void showHotBookList(List<Book> books) {
		this.hotBooks = books;
		if (books != null) {
			hotAdapter = new StoreAdapter(DDBookApp.getApp(), this.hotBooks);
			gvHot.setAdapter(hotAdapter);
			hotAdapter.notifyDataSetChanged();
		}
	}

	@Override
	public void showNewBookList(List<Book> books) {
		this.newBooks = books;
		if (books != null) {
			newAdapter = new StoreAdapter(DDBookApp.getApp(), this.newBooks);
			gvNew.setAdapter(newAdapter);
			newAdapter.notifyDataSetChanged();
		}
	}

}
