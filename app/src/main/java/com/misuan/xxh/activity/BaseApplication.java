package com.misuan.xxh.activity;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {
    private boolean isDebug = true;
    @Override
    public void onCreate() {
        ARouter.init(this);
        if (isDebug){
            ARouter.openLog();
            ARouter.openDebug();
        }
        super.onCreate();
    }
}
