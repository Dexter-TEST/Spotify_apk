package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService;
import java.lang.Object;
import com.spotify.connectivity.NativeAuthenticatedScope;

final class ConnectivitySessionService$1 implements Runnable	// class@0006ea from classes.dex
{
    final ConnectivitySessionService this$0;

    public void ConnectivitySessionService$1(ConnectivitySessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       ConnectivitySessionService$1 tthis$0 = this.this$0;
       tthis$0.setAuthenticatedScope(tthis$0.initInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt());
    }
}
