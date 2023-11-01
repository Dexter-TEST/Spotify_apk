package com.spotify.connectivity.connectivityservice.ConnectivityService$3;
import p.r71;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import p.ek3;
import java.lang.String;
import p.co5;
import p.sw0;
import p.tw0;
import com.spotify.connectivity.connectivityservice.ConnectivityService$3$onStart$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.concurrency.async.Scheduler;

public final class ConnectivityService$3 implements r71	// class@0006cc from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$3(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public void onCreate(ek3 p0){
       co5.o(p0, "owner");
    }
    public void onDestroy(ek3 p0){
       co5.o(p0, "owner");
    }
    public void onPause(ek3 p0){
       co5.o(p0, "owner");
    }
    public void onResume(ek3 p0){
       co5.o(p0, "owner");
    }
    public void onStart(ek3 p0){
       co5.o(p0, "owner");
       if (ConnectivityService.access$getShouldTryReconnectNow$p(this.this$0)) {
          ConnectivityService.access$getCoreThreadingApi$p(this.this$0).a.post(new ConnectivityService$3$onStart$1(this.this$0));
       }
       return;
    }
    public void onStop(ek3 p0){
       co5.o(p0, "owner");
    }
}
