package com.wqy.dudubook.model.impl;

import java.util.List;

import com.wqy.dudubook.app.DDBookApp;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.entity.Cart;
import com.wqy.dudubook.entity.CartItem;
import com.wqy.dudubook.model.ICartModel;

/**
 * @date：2017年1月19日
 * @author：Qiuyun.Wu
 * @description：购物车相关操作的model实现类
 */
public class CartModelImpl implements ICartModel {
	private Cart cart;

	public CartModelImpl() {
		this.cart = DDBookApp.getApp().getCart();
	}

	@Override
	public boolean addBook(Book book) {
		// 调用cart的add方法
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
