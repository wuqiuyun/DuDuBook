package com.wqy.dudubook.utils;


/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description��URL��ַ������
 */
public class GlobalConsts {

	public static final String BASEURI = "http://45.78.24.178:8080/dang/";
	/** ��ȡ�༭�Ƽ�ͼ���б� */
	public static final String URL_LOAD_RECOMMEND_BOOK_LIST = BASEURI
			+ "main/getrecommend.action";
	/** ��ȡ����ͼ���б� */
	public static final String URL_LOAD_HOT_BOOK_LIST = BASEURI
			+ "main/gethot.action";
	/** ��ȡ�����ϼ�ͼ���б� */
	public static final String URL_LOAD_NEW_BOOK_LIST = BASEURI
			+ "main/getnew.action";
	/** ͨ��id��ѯ�鱾���� */
	public static final String URL_QUERY_BOOK_DETAIL_BY_ID = BASEURI
			+ "main/qbook.action";
	/** ͨ��id��ȡͼ��ͼƬ */
	public static final String URL_GET_PIC_BY_ID = BASEURI + "productImages/";

}
