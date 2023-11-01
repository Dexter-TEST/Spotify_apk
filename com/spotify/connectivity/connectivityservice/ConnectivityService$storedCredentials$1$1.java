package com.spotify.connectivity.connectivityservice.ConnectivityService$storedCredentials$1$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.auth.CredentialsStorage$StoredCredentialsAndUsername;
import com.spotify.connectivity.connectivityapi.StoredCredentials$NonAuthenticated;
import p.hi6;
import com.spotify.connectivity.connectivityapi.StoredCredentials$Authenticated;
import java.lang.String;

final class ConnectivityService$storedCredentials$1$1 implements Runnable	// class@0006d1 from classes.dex
{
    final SingleEmitter $emitter;
    final ConnectivityService this$0;

    public void ConnectivityService$storedCredentials$1$1(ConnectivityService p0,SingleEmitter p1){
       this.this$0 = p0;
       this.$emitter = p1;
       super();
    }
    public final void run(){
       CredentialsStorage$StoredCredentialsAndUsername storedCreden;
       if ((storedCreden = this.this$0.getNativeCredentialsStorage().getStoredCredentials()) == null) {
          this.$emitter.onSuccess(StoredCredentials$NonAuthenticated.INSTANCE);
       }else {
          this.$emitter.onSuccess(new StoredCredentials$Authenticated(storedCreden.getCanonicalUsername()));
       }
       return;
    }
}
