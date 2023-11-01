package com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.connectivity.auth.LoginControllerDelegate;
import p.wf2;
import io.reactivex.rxjava3.core.Single;

public interface abstract ConnectivityApi	// class@0006c4 from classes.dex
{

    NativeSession adoptNativeSession();
    void blockingLogout();
    NativeConnectionTypeProvider getNativeConnectionTypeProvider();
    NativeApplicationScope getNativeConnectivityApplicationScope();
    NativeConnectivityManager getNativeConnectivityManager();
    NativeConnectivityPolicyProvider getNativeConnectivityPolicyProvider();
    NativeCredentialsStorage getNativeCredentialsStorage();
    NativeLoginController getNativeLoginController();
    void setLoginControllerDelegate(LoginControllerDelegate p0);
    void setPreShutdownHook(wf2 p0);
    Single storedCredentials();
}
