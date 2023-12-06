package com.misuan.xxh.activity;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.misuan.base_module.util.BaseActivity;
import com.misuan.base_module.util.BaseContent;
import com.misuan.xxh.R;
import com.misuan.xxh.databinding.ActivityShowMusicBinding;
@Route(path = BaseContent.RouteShowMusic)
public class ShowMusicActivity extends BaseActivity<ActivityShowMusicBinding> {
    @Override
    protected int getId() {
        return R.layout.activity_show_music;
    }

    @Override
    public void init() {
        super.init();
        mBinding.setHandleClick(new HandleClick());
    }

    public class HandleClick{
        public void onClick(View view){
            int id = view.getId();
            if (id == R.id.second_Thread){

                new Thread(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            mBinding.secondThread.setText("aaaaaa");
                        }
                    });
                }).start();
            }
        }
    }
}
