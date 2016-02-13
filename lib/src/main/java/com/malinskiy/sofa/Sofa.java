package com.malinskiy.sofa;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Sofa implements Thread.UncaughtExceptionHandler {
    public static final String TAG = Sofa.class.getSimpleName();

    @Nullable private static Sofa INSTANCE;
    @Nullable private final Thread.UncaughtExceptionHandler defaultExceptionHandler;

    public Sofa(@Nullable Thread.UncaughtExceptionHandler defaultExceptionHandler) {
        this.defaultExceptionHandler = defaultExceptionHandler;
    }

    public static synchronized void install() {
        if (INSTANCE == null) {
            Thread.UncaughtExceptionHandler defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            INSTANCE = new Sofa(defaultExceptionHandler);
            Thread.setDefaultUncaughtExceptionHandler(INSTANCE);
        }
    }

    @Override public void uncaughtException(@NonNull Thread thread, @NonNull Throwable ex) {
        try {
            Log.e(TAG, createLink(ex));
        } catch (UnsupportedEncodingException e) {
            //Ce la vie
        }
        if (defaultExceptionHandler != null) {
            defaultExceptionHandler.uncaughtException(thread, ex);
        }
    }

    @NonNull private String createLink(@NonNull Throwable ex) throws UnsupportedEncodingException {
        Throwable throwable = ex.getCause() == null ? ex : ex.getCause();
        return "http://stackoverflow.com/search?q=" + URLEncoder.encode(throwable.toString(), "UTF-8");
    }
}
