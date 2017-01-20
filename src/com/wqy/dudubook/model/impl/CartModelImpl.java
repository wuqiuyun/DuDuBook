package com.wqy.dudubook.model.impl;

import java.util.List;

import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.entity.Cart;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.model.ICartModel;

/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description�����ﳵ��ز�����modelʵ����
 */
public class CartModelImpl implements ICartModel {
	private Cart cart;

	public CartModelImpl() {
		this.cart = DDBookApp.getApp().getCart();
	}

	@Override
	public boolean addBook(Book book) {
		// ����cart��add����
		boolean add= cart.add(book);
		return add;
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
	public double getTotalPrice() {
		return cart.getTotalPrice();
	}

}
