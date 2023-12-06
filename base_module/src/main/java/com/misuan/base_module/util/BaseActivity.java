package com.misuan.base_module.util;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.gyf.immersionbar.ImmersionBar;

public abstract class BaseActivity<K extends ViewDataBinding> extends AppCompatActivity {
    private ImmersionBar mImmersionBar;
    public K mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,getId());
        if (fullScreen()){
            mImmersionBar = ImmersionBar.with(this);
            mImmersionBar.transparentBar().init();
            if (heightCompensation()){
                ViewGroup rootView = findViewById(android.R.id.content);
                rootView.setPadding(0,ImmersionBar.getStatusBarHeight(this),0,0);
            }
        }
        init();
    }

    /**
     * 用来不同的activity加载不同的初始化
     */
    public void init(){}

    /**
     * 获取布局文件id
     * @return 布局文件id
     */
    protected abstract int getId();
    public boolean fullScreen(){
        return true;
    }
    public boolean heightCompensation(){
        return true;
    }
}
