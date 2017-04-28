package com.coolacharya.application;

import android.app.Application;

import com.coolacharya.broadcastreceiverdemo.MainActivity;
import com.coolacharya.util.ConnectivityReceiver;

/**
 * Created by admin 54 on 4/28/2017.
 */

public class MyApplication extends Application {

    public static Application mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return (MyApplication) mInstance;
    }

    public void setConnectivityListener(MainActivity listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
