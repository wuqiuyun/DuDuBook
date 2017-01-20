package com.wqy.dudubook.utils;


/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：URL地址工具类
 */
public class GlobalConsts {

	public static final String BASEURI = "http://45.78.24.178:8080/dang/";
	/** 获取编辑推荐图书列表 */
	public static final String URL_LOAD_RECOMMEND_BOOK_LIST = BASEURI
			+ "main/getrecommend.action";
	/** 获取热销图书列表 */
	public static final String URL_LOAD_HOT_BOOK_LIST = BASEURI
			+ "main/gethot.action";
	/** 获取最新上架图书列表 */
	public static final String URL_LOAD_NEW_BOOK_LIST = BASEURI
			+ "main/getnew.action";
	/** 通过id查询书本详情 */
	public static final String URL_QUERY_BOOK_DETAIL_BY_ID = BASEURI
			+ "main/qbook.action";
	/** 通过id获取图书图片 */
	public static final String URL_GET_PIC_BY_ID = BASEURI + "productImages/";

}
