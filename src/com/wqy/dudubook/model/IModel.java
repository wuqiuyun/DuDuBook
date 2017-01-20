package com.wqy.dudubook.model;

import android.graphics.Bitmap;

/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：回调接口
 */
public interface IModel {
	
	public interface AsyncCallback {
		/**
		 * 当获取图书列表成功后执行的回调接口
		 * @param obj
		 */
		void onSuccess(Object obj);

		void onError(Object obj);
	}
	
	public interface BitmapCallback {

		/**
		 * 当图片加载完毕后 执行的回调接口
		 * @param bitmap
		 */
		public void onBitmapLoaded(Bitmap bitmap);
	}
	
}
