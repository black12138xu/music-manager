package com.misuan.base_module.util;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        boolean isDebug = true;
        if (isDebug){
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(BaseApplication.this);
    }
}
