package com.wqy.dudubook.presenter.impl;

import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.model.ICartModel;
import com.wqy.dudubook.model.impl.CartModelImpl;
import com.wqy.dudubook.presenter.ICartPresenter;
import com.wqy.dudubook.view.ICartView;

public class CartPresenterImpl implements ICartPresenter {

	private ICartView view;
	private ICartModel model;

	public CartPresenterImpl(ICartView view) {
		this.model = new CartModelImpl();
		this.view = view;
	}

	@Override
	public boolean addBook(Book book) {
		model.addBook(book);
		return false;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyNum(int bookId, int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadTotalPrice() {
		double price = model.getTotalPrice();
		view.updateTotalPrice(price);
	}

}
