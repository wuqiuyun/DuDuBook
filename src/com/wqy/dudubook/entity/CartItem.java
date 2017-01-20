package com.wqy.dudubook.entity;

import java.io.Serializable;

/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description�����ﳵѡ��
 */
public class CartItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Book book;
	private int count;
	
	public CartItem() {
		super();
	}

	public CartItem(Book book, int count) {
		super();
		this.book = book;
		this.count = count;
	}


	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	// С��
	public double amount() {
		double subtotal = this.book.getDangPrice() * count;
		return subtotal;
	}
	
	
}
