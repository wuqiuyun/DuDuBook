package com.wqy.dudubook.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.wqy.dudubook.utils.LogUtil;
import com.wqy.dudubook.utils.ToastUtil;

/**
 * @date��2017��1��19��
 * @author��Qiuyun.Wu
 * @description�����ﳵʵ����
 */
public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CartItem> items = new ArrayList<CartItem>();

	public List<CartItem> getItems() {
		return this.items;

	}

	/**
	 * ��ӹ��ﳵ
	 * 
	 * @param book
	 * @return
	 */
	public boolean add(Book book) {
		for (CartItem item : items) {
			if (book.equals(item.getBook())) {
				ToastUtil.show("�����ͬ��ͼ��");
				item.setCount(item.getCount() + 1);
				return false;
			}
		}
		ToastUtil.show("��Ӳ�ͬ��ͼ��");
		CartItem cartItem = new CartItem(book, 1);
		items.add(cartItem);
		LogUtil.info("Cart$add()$��ӹ��ﳵ-->items:  " + items);
		return true;
	}

	/**
	 * ɾ�����ﳵѡ��
	 * 
	 * @param id
	 */
	public void delete(int id) {

	}

	/**
	 * �޸Ĺ��ﳵ�б�ͼ������
	 * 
	 * @param id
	 * @param num
	 */
	public void modifyNum(int id, int num) {

	}

	/**
	 * ��ȡ���ﳵ�����鱾�ܼ�
	 * 
	 * @return ���ع��ﳵ�����鱾�ܼ�
	 */
	public double getTotalPrice() {
		double totalPrice = 0;
		for (CartItem iten : items) {
			totalPrice += iten.getBook().getDangPrice() * iten.getCount();
		}
		return totalPrice;
	}

}
