package com.wqy.dudubook.model;

import android.graphics.Bitmap;

/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description���ص��ӿ�
 */
public interface IModel {
	
	public interface AsyncCallback {
		/**
		 * ����ȡͼ���б�ɹ���ִ�еĻص��ӿ�
		 * @param obj
		 */
		void onSuccess(Object obj);

		void onError(Object obj);
	}
	
	public interface BitmapCallback {

		/**
		 * ��ͼƬ������Ϻ� ִ�еĻص��ӿ�
		 * @param bitmap
		 */
		public void onBitmapLoaded(Bitmap bitmap);
	}
	
}
