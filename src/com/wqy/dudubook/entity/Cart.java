package com.wqy.dudubook.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.wqy.dudubook.utils.LogUtil;
import com.wqy.dudubook.utils.ToastUtil;

/**
 * @date：2017年1月19日
 * @author：Qiuyun.Wu
 * @description：购物车实体类
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
	 * 添加购物车
	 * 
	 * @param book
	 * @return
	 */
	public boolean add(Book book) {
		for (CartItem item : items) {
			if (book.equals(item.getBook())) {
				ToastUtil.show("添加相同的图书");
				item.setCount(item.getCount() + 1);
				return false;
			}
		}
		ToastUtil.show("添加不同的图书");
		CartItem cartItem = new CartItem(book, 1);
		items.add(cartItem);
		LogUtil.info("Cart$add()$添加购物车-->items:  " + items);
		return true;
	}

	/**
	 * 删除购物车选项
	 * 
	 * @param id
	 */
	public void delete(int id) {

	}

	/**
	 * 修改购物车列表图书数量
	 * 
	 * @param id
	 * @param num
	 */
	public void modifyNum(int id, int num) {

	}

	/**
	 * 获取购物车所有书本总价
	 * 
	 * @return 返回购物车所有书本总价
	 */
	public double getTotalPrice() {
		double totalPrice = 0;
		for (CartItem iten : items) {
			totalPrice += iten.getBook().getDangPrice() * iten.getCount();
		}
		return totalPrice;
	}

}
