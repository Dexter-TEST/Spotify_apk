package com.spotify.connectivity.authapi.AuthTriggerApi;
import p.t00;
import com.spotify.connectivity.authapi.AuthLogoutReason;
import com.spotify.connectivity.auth.AuthUserInfo;

public interface abstract AuthTriggerApi	// class@000665 from classes.dex
{

    t00 getAuthenticationResult();
    void logoutUser(AuthLogoutReason p0);
    void setAuthUserInfo(AuthUserInfo p0,boolean p1);
}
