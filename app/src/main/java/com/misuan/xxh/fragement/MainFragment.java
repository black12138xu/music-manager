package com.misuan.xxh.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.misuan.base_module.util.BaseContent;
import com.misuan.base_module.util.BaseFragment;
import com.misuan.xxh.R;
import com.misuan.xxh.databinding.FragmentMainBinding;

public class MainFragment extends BaseFragment<FragmentMainBinding> {
    @Override
    public int getResId() {
        return R.layout.fragment_main;
    }
    @Override
    public void init() {
        super.init();
        mBinding.setHandleClick(new HandleClick());
    }
    public class HandleClick{
        public void onClick(View view){
            int id = view.getId();
            if (id == R.id.jumpToMusic){
                ARouter.getInstance().build(BaseContent.RouteShowMusic).navigation();
            }
        }
    }
}
