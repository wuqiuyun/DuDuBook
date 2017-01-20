package com.wqy.dudubook.presenter;

import com.wqy.dudubook.entity.Book;

/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description��ͼ������presenter�ӿ�
 */
public interface ICartPresenter {
	/**
	 * ���ͼ��
	 */
	public boolean addBook(Book book);

	/**
	 * ɾ��ͼ��
	 */
	public void deleteBook(int bookId);

	/**
	 * �޸�ıһ���������
	 */
	public void modifyNum(int bookId, int num);

	/**
	 * �����ܼ�
	 */
	public void loadTotalPrice();
}
