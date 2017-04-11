package com.example.java_coffee.newscoffee;

import android.view.View;

/**
 * Created by Java-Coffee on 2017/4/11.
 */
public interface BaseView<T> {
    // 为View设置Presenter
    void setPresenter(T presenter);
    // 初始化界面控件
    void initViews(View view);
}
