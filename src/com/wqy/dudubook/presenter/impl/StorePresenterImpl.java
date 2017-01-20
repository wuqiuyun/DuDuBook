package com.wqy.dudubook.presenter.impl;

import java.util.List;

import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.model.IModel;
import com.wqy.dudubook.model.IStoreModel;
import com.wqy.dudubook.model.impl.StoreModelImpl;
import com.wqy.dudubook.presenter.IStorePresenter;
import com.wqy.dudubook.utils.ToastUtil;
import com.wqy.dudubook.view.IStoreView;
/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description��ͼ������presenterʵ����
 */
public class StorePresenterImpl implements IStorePresenter {
	private IStoreModel storeModel;
	private IStoreView storeView;

	public StorePresenterImpl(IStoreView view) {
		this.storeModel = new StoreModelImpl();
		this.storeView = view;
	}

	@Override
	public void getRecommendBookList() {
		storeModel.loadRecommentBookList(new IModel.AsyncCallback() {

			@Override
			public void onSuccess(Object obj) {
				List<Book> books = (List<Book>) obj;
				storeView.showRecommendBookList(books);
			}

			@Override
			public void onError(Object obj) {
				ToastUtil.show("����ʧ��");
			}
		});
	}

	@Override
	public void getHotBookList() {
		storeModel.loadHotBookList(new IModel.AsyncCallback() {

			@Override
			public void onSuccess(Object obj) {
				List<Book> books = (List<Book>) obj;
				storeView.showHotBookList(books);
			}

			@Override
			public void onError(Object obj) {
				ToastUtil.show("����ʧ�ܣ�");
			}
		});
	}

	@Override
	public void getNewList() {
		storeModel.loadNewBookList(new IModel.AsyncCallback() {

			@Override
			public void onSuccess(Object obj) {
				List<Book> books = (List<Book>) obj;
				storeView.showNewBookList(books);
			}

			@Override
			public void onError(Object obj) {
				ToastUtil.show("����ʧ�ܣ�");
			}
		});
	}

}
