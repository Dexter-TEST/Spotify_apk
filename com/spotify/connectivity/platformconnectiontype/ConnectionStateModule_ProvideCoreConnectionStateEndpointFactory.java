package com.spotify.connectivity.platformconnectiontype.ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.connectivity.connectiontype.CoreConnectionState;
import com.spotify.connectivity.platformconnectiontype.ConnectionStateModule;
import p.co5;

public final class ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory implements a02	// class@00076f from classes.dex
{
    private final tm5 cosmonautProvider;

    public void ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory(tm5 p0){
       super();
       this.cosmonautProvider = p0;
    }
    public static ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory create(tm5 p0){
       return new ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory(p0);
    }
    public static CoreConnectionState provideCoreConnectionStateEndpoint(Cosmonaut p0){
       CoreConnectionState uCoreConnect = ConnectionStateModule.provideCoreConnectionStateEndpoint(p0);
       co5.n(uCoreConnect);
       return uCoreConnect;
    }
    public CoreConnectionState get(){
       return ConnectionStateModule_ProvideCoreConnectionStateEndpointFactory.provideCoreConnectionStateEndpoint(this.cosmonautProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
