package com.wqy.dudubook.activity;

import java.util.ArrayList;
import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.wqy.dudubook.fragment.CartFragment;
import com.wqy.dudubook.fragment.MineFragment;
import com.wqy.dudubook.fragment.StoreFragment;
import com.wqy.dumusic.R;

public class MainActivity extends FragmentActivity {
	@ViewInject(R.id.radioGroup)
	private RadioGroup radioGroup;
	@ViewInject(R.id.rb_store)
	private RadioButton rbStore;
	@ViewInject(R.id.rb_cart)
	private RadioButton rbCart;
	@ViewInject(R.id.rb_mine)
	private RadioButton rbMine;
	@ViewInject(R.id.viewPager)
	private ViewPager viewPager;

	private MainPagerAdapter pagerAdapter;
	private List<Fragment> fragments;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		x.view().inject(this);
		setAdapter();
		setListener();
	}

	@SuppressWarnings("deprecation")
	private void setListener() {
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.rb_store:
					viewPager.setCurrentItem(0);
					break;
				case R.id.rb_cart:
					viewPager.setCurrentItem(1);
					break;
				case R.id.rb_mine:
					viewPager.setCurrentItem(2);
					break;
				default:
					break;
				}
			}
		});

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				switch (position) {
				case 0:
					rbStore.setChecked(true);
					break;
				case 1:
					rbCart.setChecked(true);
					break;
				case 2:
					rbMine.setChecked(true);
					break;

				default:
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});
	}

	private void setAdapter() {
		if (pagerAdapter == null) {
			pagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
			if (fragments == null) {
				fragments = new ArrayList<Fragment>();
			}
			fragments.add(new StoreFragment());
			fragments.add(new CartFragment());
			fragments.add(new MineFragment());
			viewPager.setAdapter(pagerAdapter);
			viewPager.setOffscreenPageLimit(3);
		}
	}

	private class MainPagerAdapter extends FragmentPagerAdapter {

		public MainPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			return fragments.get(position);
		}

		@Override
		public int getCount() {
			return fragments.size();
		}

	}
}
