package com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import io.reactivex.rxjava3.core.Scheduler;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl;

public final class SpotifyConnectivityManagerImpl_Factory implements a02	// class@0007a1 from classes.dex
{
    private final tm5 connectivityUtilProvider;
    private final tm5 contextProvider;
    private final tm5 debounceSchedulerProvider;

    public void SpotifyConnectivityManagerImpl_Factory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.contextProvider = p0;
       this.connectivityUtilProvider = p1;
       this.debounceSchedulerProvider = p2;
    }
    public static SpotifyConnectivityManagerImpl_Factory create(tm5 p0,tm5 p1,tm5 p2){
       return new SpotifyConnectivityManagerImpl_Factory(p0, p1, p2);
    }
    public static SpotifyConnectivityManagerImpl newInstance(Context p0,ConnectivityUtil p1,Scheduler p2){
       return new SpotifyConnectivityManagerImpl(p0, p1, p2);
    }
    public SpotifyConnectivityManagerImpl get(){
       return SpotifyConnectivityManagerImpl_Factory.newInstance(this.contextProvider.get(), this.connectivityUtilProvider.get(), this.debounceSchedulerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
