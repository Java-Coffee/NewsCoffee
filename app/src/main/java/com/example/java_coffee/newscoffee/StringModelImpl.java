package com.example.java_coffee.newscoffee;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Java-Coffee on 2017/4/11.
 */
public class StringModelImpl {
    private Context context;
    public StringModelImpl(Context context) {
        this.context = context;
    }
    public void load(String url, final OnStringListener listener) {
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                listener.onSuccess(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                listener.onError(volleyError);
            }
        });
        VolleySingleton.getVolleySingleton(context).addToRequestQueue(request);
    }
}
