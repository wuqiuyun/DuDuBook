package com.wqy.dudubook.fragment;

import com.wqy.dumusic.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * @date��2017��1��18��
 * @author��Qiuyun.Wu
 * @description�� �ҵ�DuDuBook Fragment
 */
public class MineFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_mine, null);
		return view;
	}
}
