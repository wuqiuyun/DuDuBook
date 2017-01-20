package com.wqy.dudubook.model;

import com.wqy.dudubook.model.IModel.AsyncCallback;

/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description��
 */
public interface IStoreModel {
	/** ���ر༭�Ƽ�ͼ���б� */
	void loadRecommentBookList(AsyncCallback callback);
	/** ��������ͼ���б� */
	void loadHotBookList(AsyncCallback callback);
	/** ���������ϼ�ͼ���б� */
	void loadNewBookList(AsyncCallback callback);
}
