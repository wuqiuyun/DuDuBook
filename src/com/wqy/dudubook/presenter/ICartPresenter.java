package com.wqy.dudubook.presenter;

import com.wqy.dudubook.entity.Book;

/**
 * @date：2017年1月19日
 * @author：Qiuyun.Wu
 * @description：图书详情presenter接口
 */
public interface ICartPresenter {
	/**
	 * 添加图书
	 */
	public boolean addBook(Book book);

	/**
	 * 删除图书
	 */
	public void deleteBook(int bookId);

	/**
	 * 修改谋一本书的数量
	 */
	public void modifyNum(int bookId, int num);

	/**
	 * 加载总价
	 */
	public void loadTotalPrice();
}
