package com.wqy.dudubook.entity;

import java.util.List;

public class StoreBean {
	private int code;
	private List<Book> data;

	public StoreBean() {
		super();
	}

	
	public StoreBean(int code, List<Book> data) {
		super();
		this.code = code;
		this.data = data;
	}


	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}


	/**
	 * @return the data
	 */
	public List<Book> getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(List<Book> data) {
		this.data = data;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JsonBean [code=" + code + ", data=" + data + "]";
	}

}
