package com.example.admin.week3daily4.main;

import android.view.View;

import com.example.admin.week3daily4.base.BasePresenter;
import com.example.admin.week3daily4.base.BaseView;

public interface MainContract {
    interface MvpView extends BaseView {
        public static final String CHANNEL_ID = "ServiceChannel";

    }
    interface Presenter extends BasePresenter<View> {

    }
}
