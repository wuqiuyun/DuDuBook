package com.wqy.dudubook.model.impl;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.entity.StoreBean;
import com.wqy.dudubook.model.IModel.AsyncCallback;
import com.wqy.dudubook.model.IStoreModel;
import com.wqy.dudubook.utils.GlobalConsts;
import com.wqy.dudubook.utils.GsonUtil;
import com.wqy.dudubook.utils.LogUtil;
import com.wqy.dudubook.utils.ToastUtil;

public class StoreModelImpl implements IStoreModel {

	@Override
	public void loadRecommentBookList(final AsyncCallback callback) {
		RequestQueue queue = DDBookApp.getRequestQueue();
		String url = GlobalConsts.URL_LOAD_RECOMMEND_BOOK_LIST;
		StringRequest request = new StringRequest(url, new Listener<String>() {

			@SuppressWarnings("unchecked")
			@Override
			public void onResponse(String response) {
				List<Book> books = new ArrayList<Book>();
				StoreBean storeBean = GsonUtil.parseJsonWithGson(response,
						StoreBean.class);
				books = storeBean.getData();
				LogUtil.info("StoreModelImpl$loadRecommentBookList-->books:"
						+ books);
				callback.onSuccess(books);
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				callback.onError(error);
			}
		});
		queue.add(request);
	}

	@Override
	public void loadHotBookList(final AsyncCallback callback) {
		RequestQueue queue = DDBookApp.getRequestQueue();
		String url = GlobalConsts.URL_LOAD_HOT_BOOK_LIST;
		StringRequest request = new StringRequest(url, new Listener<String>() {

			@SuppressWarnings("unchecked")
			@Override
			public void onResponse(String response) {
				List<Book> books = new ArrayList<Book>();
				StoreBean storeBean = GsonUtil.parseJsonWithGson(response,
						StoreBean.class);
				books = storeBean.getData();
				LogUtil.info("StoreModelImpl$loadHotBookList-->books:"
						+ books);
				callback.onSuccess(books);
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				callback.onError(error);
			}
		});
		queue.add(request);
	}

	@Override
	public void loadNewBookList(final AsyncCallback callback) {
		RequestQueue queue = DDBookApp.getRequestQueue();
		String url = GlobalConsts.URL_LOAD_NEW_BOOK_LIST;
		StringRequest request = new StringRequest(url, new Listener<String>() {

			@SuppressWarnings("unchecked")
			@Override
			public void onResponse(String response) {
				List<Book> books = new ArrayList<Book>();
				StoreBean storeBean = GsonUtil.parseJsonWithGson(response,
						StoreBean.class);
				books = storeBean.getData();
				LogUtil.info("StoreModelImpl$loadNewBookList-->books:"
						+ books);
				callback.onSuccess(books);
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				callback.onError(error);
			}
		});
		queue.add(request);
	}

}
