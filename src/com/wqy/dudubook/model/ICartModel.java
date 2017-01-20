package com.wqy.dudubook.model;

import com.wqy.dudubook.entity.Book;

/**
 * @date：2017年1月19日
 * @author：Qiuyun.Wu
 * @description：购物车相关操作的model接口
 */
public interface ICartModel {
	/**
	 *添加图书
	 */
	public boolean addBook(Book book);

	/**
	 *删除图书
	 */
	public void deleteBook(int bookId);

	/**
	 *修改购物车中某一本书的数量
	 */
	public void modifyNum(int bookId, int num);

	/**
	 *获取总价格
	 */
	public double getTotalPrice();
}
