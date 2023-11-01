package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import io.reactivex.rxjava3.core.Scheduler;
import p.r45;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$-CC;
import p.co5;

public final class ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory implements a02	// class@000782 from classes.dex
{
    private final tm5 connectivityUtilProvider;
    private final tm5 contextProvider;
    private final tm5 debounceSchedulerProvider;

    public void ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.contextProvider = p0;
       this.connectivityUtilProvider = p1;
       this.debounceSchedulerProvider = p2;
    }
    public static ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory(p0, p1, p2);
    }
    public static r45 provideSpotifyConnectivityManager(Context p0,ConnectivityUtil p1,Scheduler p2){
       r45 or45 = ConnectionTypeModule$-CC.e(p0, p1, p2);
       co5.n(or45);
       return or45;
    }
    public Object get(){
       return this.get();
    }
    public r45 get(){
       return ConnectionTypeModule_ProvideSpotifyConnectivityManagerFactory.provideSpotifyConnectivityManager(this.contextProvider.get(), this.connectivityUtilProvider.get(), this.debounceSchedulerProvider.get());
    }
}
