package com.malinskiy.sofa.example;

import com.malinskiy.sofa.Sofa;

import android.app.Application;

public class MainApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        Sofa.install();
    }
}
