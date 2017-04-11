package com.example.java_coffee.newscoffee;

import com.android.volley.VolleyError;

/**
 * Created by Java-Coffee on 2017/4/11.
 */
    public interface OnStringListener {
        /**
         * 请求成功时回调
         * @param result
         */
        void onSuccess(String result);
        /**
         * 请求失败时回调
         * @param error
         */
        void onError(VolleyError error);
    }
