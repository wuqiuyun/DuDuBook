package com.wqy.dudubook.utils;

import com.wqy.dudubook.app.DDBookApp;

import android.widget.Toast;
/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：Toast工具类
 */
public class ToastUtil {
	public static void show(String msg) {
		Toast.makeText(DDBookApp.getApp(), msg, Toast.LENGTH_SHORT).show();
	}
}
