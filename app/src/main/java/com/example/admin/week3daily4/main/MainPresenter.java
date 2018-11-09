package com.example.admin.week3daily4.main;

public class MainPresenter implements  MainContract.Presenter {
    private MainContract.MvpView mvpView;
    public static final String CHANNEL_ID = "ServiceChannel";

    MainPresenter(MainContract.MvpView view){
        mvpView = view;
    }
}
