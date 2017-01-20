package com.wqy.dudubook.utils;

import android.util.Log;

/**
 * @date：2017年1月18日
 * @author：Qiuyun.Wu
 * @description：Log工具类
 */

public class LogUtil {
	private static final String TAG = "joey";

	public static void debug(String msg) {
		Log.d(TAG, msg);
	}

	public static void info(String msg) {
		Log.i(TAG, msg);
	}

	public static void error(String msg) {
		Log.e(TAG, msg);
	}

	public static void warn(String msg) {
		Log.w(TAG, msg);
	}
}
