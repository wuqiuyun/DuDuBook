package com.wqy.dudubook.utils;

import com.google.gson.Gson;
/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description����װ��GSON���������࣬�ṩ���Ͳ���
 */
public class GsonUtil {
	// ��Json���ݽ�������Ӧ��ӳ�����
	public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
		Gson gson = new Gson();
		T result = gson.fromJson(jsonData, type);
		return result;
	}
}