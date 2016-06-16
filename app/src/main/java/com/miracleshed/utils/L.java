package com.miracleshed.utils;

import android.util.Log;

import com.orhanobut.logger.Logger;

/**
 * Log统一管理类
 */
public class L {

    private L() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isDebug = true;// 是否需要打印bug，可以在application的onCreate函数里面初始化
    private static final String TAG = "TAG";

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (isDebug)
            Logger.i(TAG, msg);
    }

    public static void d(String msg) {
        if (isDebug)
            Logger.d(TAG, msg);
    }

    public static void e(String msg) {
        if (isDebug)
            Logger.e(TAG, msg);
    }

    public static void v(String msg) {
        if (isDebug)
            Logger.v(TAG, msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (isDebug)
            Logger.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            Logger.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            Logger.e(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            Logger.v(tag, msg);
    }

    public static void wtf(String message, Object... args) {
        if (isDebug)
            Logger.wtf(message, args);
    }

    public static void json(String json) {
        if (isDebug)
            Logger.json(json);
    }

    public static void xml(String xml) {
        if (isDebug)
            Logger.xml(xml);
    }
}