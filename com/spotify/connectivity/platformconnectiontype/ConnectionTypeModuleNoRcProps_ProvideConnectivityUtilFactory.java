package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps$-CC;
import p.co5;

public final class ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory implements a02	// class@000779 from classes.dex
{
    private final tm5 propertiesProvider;

    public void ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory(tm5 p0){
       super();
       this.propertiesProvider = p0;
    }
    public static ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory create(tm5 p0){
       return new ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory(p0);
    }
    public static ConnectivityUtil provideConnectivityUtil(PlatformConnectionTypeProperties p0){
       ConnectivityUtil uConnectivit = ConnectionTypeModuleNoRcProps$-CC.b(p0);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityUtil get(){
       return ConnectionTypeModuleNoRcProps_ProvideConnectivityUtilFactory.provideConnectivityUtil(this.propertiesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
