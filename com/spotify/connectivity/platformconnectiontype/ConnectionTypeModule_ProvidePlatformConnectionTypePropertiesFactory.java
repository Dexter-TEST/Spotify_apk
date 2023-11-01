package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$-CC;
import p.co5;
import java.lang.Boolean;

public final class ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory implements a02	// class@000781 from classes.dex
{
    private final tm5 netCapabilitiesValidatedDisabledProvider;
    private final tm5 shouldUseSingleThreadProvider;

    public void ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory(tm5 p0,tm5 p1){
       super();
       this.netCapabilitiesValidatedDisabledProvider = p0;
       this.shouldUseSingleThreadProvider = p1;
    }
    public static ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory create(tm5 p0,tm5 p1){
       return new ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory(p0, p1);
    }
    public static PlatformConnectionTypeProperties providePlatformConnectionTypeProperties(boolean p0,boolean p1){
       PlatformConnectionTypeProperties platformConn = ConnectionTypeModule$-CC.d(p0, p1);
       co5.n(platformConn);
       return platformConn;
    }
    public PlatformConnectionTypeProperties get(){
       return ConnectionTypeModule_ProvidePlatformConnectionTypePropertiesFactory.providePlatformConnectionTypeProperties(this.netCapabilitiesValidatedDisabledProvider.get().booleanValue(), this.shouldUseSingleThreadProvider.get().booleanValue());
    }
    public Object get(){
       return this.get();
    }
}
