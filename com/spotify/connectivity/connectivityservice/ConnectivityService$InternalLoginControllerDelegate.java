package com.spotify.connectivity.connectivityservice.ConnectivityService$InternalLoginControllerDelegate;
import com.spotify.connectivity.auth.LoginControllerDelegate;
import com.spotify.connectivity.auth.NativeLoginController;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.NativeSession;
import p.ej4;
import java.lang.IllegalStateException;
import com.spotify.base.java.logging.Logger;

public final class ConnectivityService$InternalLoginControllerDelegate implements LoginControllerDelegate	// class@0006ce from classes.dex
{
    private LoginControllerDelegate externalLoginControllerDelegate;
    private final NativeLoginController nativeLoginController;
    private NativeSession nativeSession;

    public void ConnectivityService$InternalLoginControllerDelegate(NativeLoginController p0){
       co5.o(p0, "nativeLoginController");
       super();
       this.nativeLoginController = p0;
    }
    public final NativeSession adoptNativeSession(){
       ConnectivityService$InternalLoginControllerDelegate tnativeSessi;
       ej4.g("Called on main looper");
       if ((tnativeSessi = this.nativeSession) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       this.nativeSession = null;
       return tnativeSessi;
    }
    public final void maybeDestroyNativeSession$src_main_java_com_spotify_connectivity_connectivityservice_connectivityservice_kt(){
       ConnectivityService$InternalLoginControllerDelegate tnativeSessi;
       ej4.g("Called on main looper");
       if ((tnativeSessi = this.nativeSession) != null) {
          tnativeSessi.destroy();
       }
       this.nativeSession = null;
       return;
    }
    public void onLogin(){
       NativeSession nativeSessio;
       ConnectivityService$InternalLoginControllerDelegate texternalLog;
       Object[] objArray = new Object[0];
       Logger.e("InternalLoginControllerDelegate::onLogin", objArray);
       ej4.g("Called on main looper");
       if ((nativeSessio = this.nativeLoginController.stealNativeSession()) == null) {
          throw new IllegalStateException("stealNativeSession must never return null".toString());
       }
       this.nativeSession = nativeSessio;
       _monitor_enter(this);
       if ((texternalLog = this.externalLoginControllerDelegate) != null) {
          texternalLog.onLogin();
       }
       _monitor_exit(this);
       return;
    }
    public void onLogout(){
       ConnectivityService$InternalLoginControllerDelegate texternalLog;
       Object[] objArray = new Object[0];
       Logger.e("InternalLoginControllerDelegate::onLogout", objArray);
       _monitor_enter(this);
       if ((texternalLog = this.externalLoginControllerDelegate) != null) {
          texternalLog.onLogout();
       }
       _monitor_exit(this);
       this.maybeDestroyNativeSession$src_main_java_com_spotify_connectivity_connectivityservice_connectivityservice_kt();
       return;
    }
    public final void setExternalLoginControllerDelegate(LoginControllerDelegate p0){
       co5.o(p0, "delegate");
       _monitor_enter(this);
       this.externalLoginControllerDelegate = p0;
       _monitor_exit(this);
    }
}
