package com.spotify.connectivity.http.HttpLifecycleListener;

public interface abstract HttpLifecycleListener	// class@00072e from classes.dex
{

    void onForgetCredentials();
    void onSessionStart();
    void onSessionStop();
    void onStart();
    void onStop();
}
