package com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$1;
import p.tb0;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;

final class SpotifyConnectivityManagerImpl$connectivityObservable$1$1 implements tb0	// class@00079d from classes.dex
{
    final SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1 $callback;
    final SpotifyConnectivityManagerImpl this$0;

    public void SpotifyConnectivityManagerImpl$connectivityObservable$1$1(SpotifyConnectivityManagerImpl p0,SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1 p1){
       this.this$0 = p0;
       this.$callback = p1;
       super();
    }
    public final void cancel(){
       SpotifyConnectivityManagerImpl.access$getConnectivityManager$p(this.this$0).unregisterNetworkCallback(this.$callback);
    }
}
