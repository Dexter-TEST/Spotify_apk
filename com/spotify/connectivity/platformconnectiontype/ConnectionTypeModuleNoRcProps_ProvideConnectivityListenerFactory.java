package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.app.Application;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps$-CC;
import p.co5;

public final class ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory implements a02	// class@000778 from classes.dex
{
    private final tm5 applicationProvider;
    private final tm5 connectivityUtilProvider;
    private final tm5 propertiesProvider;

    public void ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.applicationProvider = p0;
       this.connectivityUtilProvider = p1;
       this.propertiesProvider = p2;
    }
    public static ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory(p0, p1, p2);
    }
    public static ConnectivityListener provideConnectivityListener(Application p0,ConnectivityUtil p1,PlatformConnectionTypeProperties p2){
       ConnectivityListener uConnectivit = ConnectionTypeModuleNoRcProps$-CC.a(p0, p1, p2);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityListener get(){
       return ConnectionTypeModuleNoRcProps_ProvideConnectivityListenerFactory.provideConnectivityListener(this.applicationProvider.get(), this.connectivityUtilProvider.get(), this.propertiesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
