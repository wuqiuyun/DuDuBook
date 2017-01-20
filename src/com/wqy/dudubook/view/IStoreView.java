package com.wqy.dudubook.view;

import java.util.List;

import com.wqy.dudubook.entity.Book;
/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：书城界面接口
 */
public interface IStoreView {
	void showRecommendBookList(List<Book> books);

	void showHotBookList(List<Book> books);

	void showNewBookList(List<Book> books);
}
