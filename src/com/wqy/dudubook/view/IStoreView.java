package com.wqy.dudubook.view;

import java.util.List;

import com.wqy.dudubook.entity.Book;
/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description����ǽ���ӿ�
 */
public interface IStoreView {
	void showRecommendBookList(List<Book> books);

	void showHotBookList(List<Book> books);

	void showNewBookList(List<Book> books);
}
