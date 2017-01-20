package com.wqy.dudubook.app;

import java.util.ArrayList;
import java.util.List;

import org.xutils.x;

import android.app.Application;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.android.volley.toolbox.Volley;
import com.wqy.dudubook.entity.Book;
import com.wqy.dudubook.entity.Cart;
import com.wqy.dudubook.entity.CartItem;

/**
 * @date£º2017Äê1ÔÂ18ÈÕ
 * @author£ºQiuyun.Wu
 * @description£ºDDBookApp
 */
public class DDBookApp extends Application {
	private static DDBookApp app;
	private static RequestQueue queue;
	private static ImageCache cache;
	private static Cart cart;

	private LruCache<String, Bitmap> mCache;

	@Override
	public void onCreate() {
		super.onCreate();
		app = this;
		x.Ext.init(app);
		
		cart = new Cart();
		queue = Volley.newRequestQueue(app);

		int maxSize = 10 * 1024 * 1024;
		mCache = new LruCache<String, Bitmap>(maxSize) {
			@Override
			protected int sizeOf(String key, Bitmap bitmap) {
				return bitmap.getRowBytes() * bitmap.getHeight();
			}
		};
		cache = new ImageCache() {
			@Override
			public void putBitmap(String url, Bitmap bitmap) {
				mCache.put(url, bitmap);
			}

			@Override
			public Bitmap getBitmap(String url) {
				return mCache.get(url);
			}
		};

	}

	public static DDBookApp getApp() {
		return app;
	}

	public static RequestQueue getRequestQueue() {
		return queue;
	}

	public static ImageCache getImagerCache() {
		return cache;
	}

	public Cart getCart() {
		return this.cart;
	}

}
