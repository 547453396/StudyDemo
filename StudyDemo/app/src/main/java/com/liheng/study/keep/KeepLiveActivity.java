package com.liheng.study.keep;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.liheng.study.utils.LogUtils;

public class KeepLiveActivity extends Activity {

    public static KeepLiveActivity mInstance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.setGravity(Gravity.LEFT | Gravity.TOP);
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = 0;
        params.y = 0;
        params.width = 1;
        params.height = 1;
        window.setAttributes(params);
        mInstance = this;
        LogUtils.printlog("i", "liheng", "KeepLiveActivity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.printlog("i", "liheng", "KeepLiveActivity onDestroy");
    }
}
