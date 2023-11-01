package com.spotify.connectivity.connectivityservice.ConnectivityService$shutdown$2;
import java.lang.Runnable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import com.spotify.connectivity.connectivityservice.ConnectivityService$InternalLoginControllerDelegate;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import java.lang.String;
import p.co5;

final class ConnectivityService$shutdown$2 implements Runnable	// class@0006d0 from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$shutdown$2(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       ConnectivityService$InternalLoginControllerDelegate internalLogi;
       if ((internalLogi = ConnectivityService.access$getLoginControllerDelegate$p(this.this$0)) != null) {
          internalLogi.maybeDestroyNativeSession$src_main_java_com_spotify_connectivity_connectivityservice_connectivityservice_kt();
          this.this$0.getNativeLoginController().prepareForShutdown();
          this.this$0.getNativeConnectivityApplicationScope().prepareForShutdown();
          this.this$0.getNativeLoginController().destroy();
          this.this$0.getNativeConnectivityApplicationScope().destroy();
          this.this$0.getNativeConnectivityPolicyProvider().destroy();
          this.this$0.getNativeConnectionTypeProvider().destroy();
          this.this$0.getNativeCredentialsStorage().destroy();
          this.this$0.getNativeConnectivityManager().destroy();
          return;
       }else {
          co5.N("loginControllerDelegate");
          throw null;
       }
    }
}
