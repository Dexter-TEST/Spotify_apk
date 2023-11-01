package com.spotify.connectivity.auth.LoginControllerAnalyticsDelegate;

public interface abstract LoginControllerAnalyticsDelegate	// class@0005fa from classes.dex
{

    void onBeforeLogout();
    void onBeforeLogoutForced();
    void onBeforeLogoutRemote();
    void onLogoutDone();
    void onOfflineUserRemoved();
    void onStoredCredentialsRemoved();
}
