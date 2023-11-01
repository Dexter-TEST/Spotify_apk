package com.spotify.connectivity.connectivityservice.ConnectivityService$2;
import p.ir0;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectivityservice.ServiceConnectivityObserver;
import java.lang.String;
import p.co5;

final class ConnectivityService$2 implements ir0	// class@0006ca from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$2(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public final void accept(ConnectionType p0){
       co5.l(p0, "it");
       ConnectivityService.access$getConnectivityObserver$p(this.this$0).setConnectivityType(p0);
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
