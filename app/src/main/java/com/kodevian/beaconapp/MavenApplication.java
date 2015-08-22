package com.kodevian.beaconapp;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

public class MavenApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //sutentificacion
        EstimoteSDK.initialize(this, "bederr", "b9f3309d5f77b2f5d1b5682c7f8bf9b1");
        EstimoteSDK.enableDebugLogging(true);
    }
}
