package com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl;
import com.spotify.connectivity.connectiontype.SpotifyConnectivityManager;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.net.ConnectivityManager;
import com.spotify.connectivity.platformconnectiontype.NetworkCallbackEventToConnectionTypeTransformer;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl$connectivityObservable$1;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.util.concurrent.TimeUnit;
import p.zo0;
import java.lang.Class;
import p.tv4;

public final class SpotifyConnectivityManagerImpl implements SpotifyConnectivityManager	// class@0007a0 from classes.dex
{
    private final Context applicationContext;
    private final ConnectivityManager connectivityManager;
    private final Observable connectivityObservable;
    private final NetworkCallbackEventToConnectionTypeTransformer networkCallbackEventToConnectionTypeTransformer;

    public void SpotifyConnectivityManagerImpl(Context p0,ConnectivityUtil p1,Scheduler p2){
       co5.o(p0, "context");
       co5.o(p1, "connectivityUtil");
       co5.o(p2, "debounceScheduler");
       super();
       Context applicationC = p0.getApplicationContext();
       co5.l(applicationC, "checkNotNull\(context\).applicationContext");
       this.applicationContext = applicationC;
       NetworkCallbackEventToConnectionTypeTransformer systemServic = applicationC.getSystemService("connectivity");
       co5.j(systemServic, "null cannot be cast to non-null type android.net.ConnectivityManager");
       this.connectivityManager = systemServic;
       systemServic = new NetworkCallbackEventToConnectionTypeTransformer(p0, p1);
       this.networkCallbackEventToConnectionTypeTransformer = systemServic;
       zo0 ozo0 = Observable.create(new SpotifyConnectivityManagerImpl$connectivityObservable$1(this)).compose(systemServic).startWithItem(ConnectionType.CONNECTION_TYPE_NONE).debounce(1, TimeUnit.SECONDS, p2).distinctUntilChanged().replay(1);
       ozo0.getClass();
       this.connectivityObservable = new tv4(ozo0);
    }
    public static final ConnectivityManager access$getConnectivityManager$p(SpotifyConnectivityManagerImpl p0){
       return p0.connectivityManager;
    }
    public ConnectionType getConnectionType(){
       return this.networkCallbackEventToConnectionTypeTransformer.getCurrentConnectionType();
    }
    public Observable getConnectionTypeObservable(){
       SpotifyConnectivityManagerImpl tconnectivit = this.connectivityObservable;
       co5.l(tconnectivit, "connectivityObservable");
       return tconnectivit;
    }
}
