package com.alobot.dummymvppattern.presenter;

public interface Presenter {
    void onCreate();

    void onPause();

    void onResume();

    void onDestroy();
}