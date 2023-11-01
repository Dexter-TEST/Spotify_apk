package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$shutdown$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService;
import java.lang.Object;

final class ConnectivitySessionService$shutdown$1 implements Runnable	// class@0006ef from classes.dex
{
    final ConnectivitySessionService this$0;

    public void ConnectivitySessionService$shutdown$1(ConnectivitySessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       this.this$0.shutdownInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt();
    }
}
