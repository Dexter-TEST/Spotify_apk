package com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1;
import android.net.ConnectivityManager$NetworkCallback;
import io.reactivex.rxjava3.core.ObservableEmitter;
import android.net.Network;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectiontype.NetworkAvailable;
import android.net.NetworkCapabilities;
import com.spotify.connectivity.connectiontype.NetworkCapabilitiesChanged;
import com.spotify.connectivity.connectiontype.NetworkLost;

public final class SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1 extends ConnectivityManager$NetworkCallback	// class@00079e from classes.dex
{
    final ObservableEmitter $emitter;

    public void SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1(ObservableEmitter p0){
       this.$emitter = p0;
       super();
    }
    public void onAvailable(Network p0){
       co5.o(p0, "network");
       this.$emitter.onNext(new NetworkAvailable(p0));
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       co5.o(p0, "network");
       co5.o(p1, "networkCapabilities");
       this.$emitter.onNext(new NetworkCapabilitiesChanged(p0, p1));
    }
    public void onLost(Network p0){
       co5.o(p0, "network");
       this.$emitter.onNext(new NetworkLost(p0));
    }
}
