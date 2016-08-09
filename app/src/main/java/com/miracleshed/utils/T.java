package com.miracleshed.utils;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;

/**
 * Toast统一管理类
 */
public class T {

    private T() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("T cannot be instantiated");
    }

    public static boolean isShow = true;
    public static Toast mToast = null;
    public static long mDuration;


    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (isShow)
            showT(context, message, Toast.LENGTH_SHORT);
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {
        if (isShow)
            showT(context, context.getString(message), Toast.LENGTH_SHORT);
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (isShow)
            showT(context, message, Toast.LENGTH_LONG);
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {
        if (isShow)
            showT(context, context.getString(message), Toast.LENGTH_LONG);
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     */
    public static void show(Context context, CharSequence message, int duration) {
        if (isShow)
            showT(context, message, duration);
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration) {
        if (isShow)
            showT(context, context.getString(message), duration);
    }

    /**
     * @param context
     * @param message
     * @param duration
     */
    public static void showT(Context context, CharSequence message, int duration) {
        mDuration = duration;
        if (mToast == null) {
            mToast = Toast.makeText(context, message, duration);
        } else {
            mToast.setText(message);
        }
        mToast.show();
    }

}
