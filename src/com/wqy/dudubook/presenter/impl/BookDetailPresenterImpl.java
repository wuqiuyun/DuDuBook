package com.wqy.dudubook.presenter.impl;

import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.model.ICartModel;
import com.wqy.dudubook.model.impl.CartModelImpl;
import com.wqy.dudubook.presenter.IBookDetailPresenter;
import com.wqy.dudubook.view.IBookDetailView;

public class BookDetailPresenterImpl implements IBookDetailPresenter {
	private ICartModel cartModel;
	private IBookDetailView view;

	public BookDetailPresenterImpl(IBookDetailView view) {
		this.cartModel = new CartModelImpl();
		this.view = view;
	}

	@Override
	public void addToCart(Book book) {
		cartModel.addBook(book);
		view.AddToCartSuccess();
	}

}
