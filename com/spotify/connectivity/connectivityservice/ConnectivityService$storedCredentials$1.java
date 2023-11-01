package com.spotify.connectivity.connectivityservice.ConnectivityService$storedCredentials$1;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleEmitter;
import p.sw0;
import p.tw0;
import com.spotify.connectivity.connectivityservice.ConnectivityService$storedCredentials$1$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.concurrency.async.Scheduler;

final class ConnectivityService$storedCredentials$1 implements SingleOnSubscribe	// class@0006d2 from classes.dex
{
    final ConnectivityService this$0;

    public void ConnectivityService$storedCredentials$1(ConnectivityService p0){
       this.this$0 = p0;
       super();
    }
    public final void subscribe(SingleEmitter p0){
       ConnectivityService.access$getCoreThreadingApi$p(this.this$0).a.runBlocking(new ConnectivityService$storedCredentials$1$1(this.this$0, p0));
    }
}
