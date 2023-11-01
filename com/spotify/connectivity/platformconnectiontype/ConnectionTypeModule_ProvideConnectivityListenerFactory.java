package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideConnectivityListenerFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.app.Application;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$-CC;
import p.co5;

public final class ConnectionTypeModule_ProvideConnectivityListenerFactory implements a02	// class@00077e from classes.dex
{
    private final tm5 applicationProvider;
    private final tm5 connectivityUtilProvider;
    private final tm5 propertiesProvider;

    public void ConnectionTypeModule_ProvideConnectivityListenerFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.applicationProvider = p0;
       this.connectivityUtilProvider = p1;
       this.propertiesProvider = p2;
    }
    public static ConnectionTypeModule_ProvideConnectivityListenerFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ConnectionTypeModule_ProvideConnectivityListenerFactory(p0, p1, p2);
    }
    public static ConnectivityListener provideConnectivityListener(Application p0,ConnectivityUtil p1,PlatformConnectionTypeProperties p2){
       ConnectivityListener uConnectivit = ConnectionTypeModule$-CC.a(p0, p1, p2);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityListener get(){
       return ConnectionTypeModule_ProvideConnectivityListenerFactory.provideConnectivityListener(this.applicationProvider.get(), this.connectivityUtilProvider.get(), this.propertiesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
