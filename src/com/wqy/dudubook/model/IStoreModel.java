package com.wqy.dudubook.model;

import com.wqy.dudubook.model.IModel.AsyncCallback;

/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：
 */
public interface IStoreModel {
	/** 下载编辑推荐图书列表 */
	void loadRecommentBookList(AsyncCallback callback);
	/** 下载热门图书列表 */
	void loadHotBookList(AsyncCallback callback);
	/** 下载最新上架图书列表 */
	void loadNewBookList(AsyncCallback callback);
}
