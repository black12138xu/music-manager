package com.misuan.xxh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.misuan.base_module.util.BaseActivity;
import com.misuan.base_module.util.BaseContent;
import com.misuan.xxh.adapter.ViewPagerAdapter;
import com.misuan.xxh.databinding.ActivityMainBinding;
import com.misuan.xxh.fragement.MainFragment;

import java.util.ArrayList;
import java.util.List;
@Route(path = BaseContent.RouteMain)
public class MainActivity extends BaseActivity<ActivityMainBinding> {
    @Override
    protected int getId() {
        return R.layout.activity_main;
    }
    @Override
    public void init() {
        super.init();
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new MainFragment());
        mBinding.mainVp.setAdapter(new ViewPagerAdapter(this,fragmentList));
    }
}