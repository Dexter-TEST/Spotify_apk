package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideConnectivityUtilFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$-CC;
import p.co5;

public final class ConnectionTypeModule_ProvideConnectivityUtilFactory implements a02	// class@00077f from classes.dex
{
    private final tm5 propertiesProvider;

    public void ConnectionTypeModule_ProvideConnectivityUtilFactory(tm5 p0){
       super();
       this.propertiesProvider = p0;
    }
    public static ConnectionTypeModule_ProvideConnectivityUtilFactory create(tm5 p0){
       return new ConnectionTypeModule_ProvideConnectivityUtilFactory(p0);
    }
    public static ConnectivityUtil provideConnectivityUtil(PlatformConnectionTypeProperties p0){
       ConnectivityUtil uConnectivit = ConnectionTypeModule$-CC.b(p0);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityUtil get(){
       return ConnectionTypeModule_ProvideConnectivityUtilFactory.provideConnectivityUtil(this.propertiesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
