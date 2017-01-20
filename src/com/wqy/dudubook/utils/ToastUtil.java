package com.wqy.dudubook.utils;

import com.wqy.dudubook.app.DDBookApp;

import android.widget.Toast;
/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description��Toast������
 */
public class ToastUtil {
	public static void show(String msg) {
		Toast.makeText(DDBookApp.getApp(), msg, Toast.LENGTH_SHORT).show();
	}
}
