package com.wqy.dudubook.model;

import com.wqy.dudubook.entity.Book;

/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description�����ﳵ��ز�����model�ӿ�
 */
public interface ICartModel {
	/**
	 *���ͼ��
	 */
	public boolean addBook(Book book);

	/**
	 *ɾ��ͼ��
	 */
	public void deleteBook(int bookId);

	/**
	 *�޸Ĺ��ﳵ��ĳһ���������
	 */
	public void modifyNum(int bookId, int num);

	/**
	 *��ȡ�ܼ۸�
	 */
	public double getTotalPrice();
}
