package com.spotify.connectivity.connectivityservice.ConnectivityService$shutdown$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import p.vj3;
import p.dk3;

final class ConnectivityService$shutdown$1 implements Runnable	// class@0006cf from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$shutdown$1(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       ConnectivityService.access$getProcessLifecycle$p(this.this$0).c(ConnectivityService.access$getReconnectObserver$p(this.this$0));
    }
}
