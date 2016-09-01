package com.liheng.study.utils;

import android.util.Log;

/**
 * Created by liheng on 16/9/1.
 */
public class LogUtils {

    public static boolean LOG_DEBUG = true;

    public static void printlog(String flag, String tag, String log) {
        if (!LOG_DEBUG) {
            return;
        }
        if (flag.equals("e")) {
            Log.e(tag, log);
        } else if (flag.equals("i")) {
            Log.i(tag, log);
        } else if (flag.equals("d")) {
            Log.d(tag, log);
        }
    }
}
