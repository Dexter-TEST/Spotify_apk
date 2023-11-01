package com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.connectivity.auth.LoginController;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.Session;
import com.spotify.connectivity.auth.LoginControllerAnalyticsDelegate;
import com.spotify.connectivity.auth.LoginControllerDelegate;

public final class NativeLoginController implements LoginController	// class@0005fd from classes.dex
{
    private long nThis;

    private void NativeLoginController(){
       super();
    }
    public native void blockingLogout();
    public native final void destroy();
    public native final NativeSession getNativeSession();
    public native final Transport getNativeTransport();
    public native Session getSession();
    public native final void prepareForShutdown();
    public native void setAnalyticsDelegate(LoginControllerAnalyticsDelegate p0);
    public native void setDelegate(LoginControllerDelegate p0);
    public native final NativeSession stealNativeSession();
    public native void tryReconnectNow(boolean p0);
}
