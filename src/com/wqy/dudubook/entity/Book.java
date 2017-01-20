package com.wqy.dudubook.entity;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long add_time;
	private double dangPrice;
	private double fixedPrice;
	private int has_deleted;
	private int id;
	private long printTime;
	private long publishTime;
	private String author;
	private String author_summary;
	private String catalogue;
	private String description;
	private String isbn;
	private String keywords;
	private String productName;
	private String product_pic;
	private String publishedTime;
	private String publishing;
	private String totalPage;
	private String whichEdtion;
	private String wordNumber;

	public Book() {
		super();
	}

	public Book(long add_time, double dangPrice, double fixedPrice,
			int has_deleted, int id, long printTime, long publishTime,
			String author, String author_summary, String catalogue,
			String description, String isbn, String keywords,
			String productName, String product_pic, String publishedTime,
			String publishing, String totalPage, String whichEdtion,
			String wordNumber) {
		super();
		this.add_time = add_time;
		this.dangPrice = dangPrice;
		this.fixedPrice = fixedPrice;
		this.has_deleted = has_deleted;
		this.id = id;
		this.printTime = printTime;
		this.publishTime = publishTime;
		this.author = author;
		this.author_summary = author_summary;
		this.catalogue = catalogue;
		this.description = description;
		this.isbn = isbn;
		this.keywords = keywords;
		this.productName = productName;
		this.product_pic = product_pic;
		this.publishedTime = publishedTime;
		this.publishing = publishing;
		this.totalPage = totalPage;
		this.whichEdtion = whichEdtion;
		this.wordNumber = wordNumber;
	}

	/**
	 * @return the add_time
	 */
	public long getAdd_time() {
		return add_time;
	}

	/**
	 * @param add_time
	 *            the add_time to set
	 */
	public void setAdd_time(long add_time) {
		this.add_time = add_time;
	}

	/**
	 * @return the dangPrice
	 */
	public double getDangPrice() {
		return dangPrice;
	}

	/**
	 * @param dangPrice
	 *            the dangPrice to set
	 */
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}

	/**
	 * @return the fixedPrice
	 */
	public double getFixedPrice() {
		return fixedPrice;
	}

	/**
	 * @param fixedPrice
	 *            the fixedPrice to set
	 */
	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	/**
	 * @return the has_deleted
	 */
	public int getHas_deleted() {
		return has_deleted;
	}

	/**
	 * @param has_deleted
	 *            the has_deleted to set
	 */
	public void setHas_deleted(int has_deleted) {
		this.has_deleted = has_deleted;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the printTime
	 */
	public long getPrintTime() {
		return printTime;
	}

	/**
	 * @param printTime
	 *            the printTime to set
	 */
	public void setPrintTime(long printTime) {
		this.printTime = printTime;
	}

	/**
	 * @return the publishTime
	 */
	public long getPublishTime() {
		return publishTime;
	}

	/**
	 * @param publishTime
	 *            the publishTime to set
	 */
	public void setPublishTime(long publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the author_summary
	 */
	public String getAuthor_summary() {
		return author_summary;
	}

	/**
	 * @param author_summary
	 *            the author_summary to set
	 */
	public void setAuthor_summary(String author_summary) {
		this.author_summary = author_summary;
	}

	/**
	 * @return the catalogue
	 */
	public String getCatalogue() {
		return catalogue;
	}

	/**
	 * @param catalogue
	 *            the catalogue to set
	 */
	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords
	 *            the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the product_pic
	 */
	public String getProduct_pic() {
		return product_pic;
	}

	/**
	 * @param product_pic
	 *            the product_pic to set
	 */
	public void setProduct_pic(String product_pic) {
		this.product_pic = product_pic;
	}

	/**
	 * @return the publishedTime
	 */
	public String getPublishedTime() {
		return publishedTime;
	}

	/**
	 * @param publishedTime
	 *            the publishedTime to set
	 */
	public void setPublishedTime(String publishedTime) {
		this.publishedTime = publishedTime;
	}

	/**
	 * @return the publishing
	 */
	public String getPublishing() {
		return publishing;
	}

	/**
	 * @param publishing
	 *            the publishing to set
	 */
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	/**
	 * @return the totalPage
	 */
	public String getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage
	 *            the totalPage to set
	 */
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return the whichEdtion
	 */
	public String getWhichEdtion() {
		return whichEdtion;
	}

	/**
	 * @param whichEdtion
	 *            the whichEdtion to set
	 */
	public void setWhichEdtion(String whichEdtion) {
		this.whichEdtion = whichEdtion;
	}

	/**
	 * @return the wordNumber
	 */
	public String getWordNumber() {
		return wordNumber;
	}

	/**
	 * @param wordNumber
	 *            the wordNumber to set
	 */
	public void setWordNumber(String wordNumber) {
		this.wordNumber = wordNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Book book = (Book) o;

		if (id != book.id)
			return false;

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [书名：" + getProductName() + "，作者：" + getAuthor() + "]";
	}

}
