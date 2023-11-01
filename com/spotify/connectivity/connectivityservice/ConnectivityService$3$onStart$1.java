package com.spotify.connectivity.connectivityservice.ConnectivityService$3$onStart$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeLoginController;

final class ConnectivityService$3$onStart$1 implements Runnable	// class@0006cb from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$3$onStart$1(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (ConnectivityService.access$getShouldTryReconnectNow$p(this.this$0)) {
          this.this$0.getNativeLoginController().tryReconnectNow(false);
       }
       return;
    }
}
