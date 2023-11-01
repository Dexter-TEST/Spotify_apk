package com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1;
import android.net.ConnectivityManager;
import p.zo4;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1$1;
import p.tb0;

final class SpotifyConnectivityManagerImpl$connectivityObservable$1 implements ObservableOnSubscribe	// class@00079f from classes.dex
{
    final SpotifyConnectivityManagerImpl this$0;

    public void SpotifyConnectivityManagerImpl$connectivityObservable$1(SpotifyConnectivityManagerImpl p0){
       this.this$0 = p0;
       super();
    }
    public final void subscribe(ObservableEmitter p0){
       co5.o(p0, "emitter");
       SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1 uoconnectivi = new SpotifyConnectivityManagerImpl$connectivityObservable$1$callback$1(p0);
       zo4.t(SpotifyConnectivityManagerImpl.access$getConnectivityManager$p(this.this$0), uoconnectivi);
       p0.setCancellable(new SpotifyConnectivityManagerImpl$connectivityObservable$1$1(this.this$0, uoconnectivi));
    }
}
