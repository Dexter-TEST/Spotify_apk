package com.spotify.connectivity.auth.LoginController;
import com.spotify.connectivity.auth.Session;
import com.spotify.connectivity.auth.LoginControllerAnalyticsDelegate;
import com.spotify.connectivity.auth.LoginControllerDelegate;

public interface abstract LoginController	// class@0005f9 from classes.dex
{

    void blockingLogout();
    Session getSession();
    void setAnalyticsDelegate(LoginControllerAnalyticsDelegate p0);
    void setDelegate(LoginControllerDelegate p0);
    void tryReconnectNow(boolean p0);
}
