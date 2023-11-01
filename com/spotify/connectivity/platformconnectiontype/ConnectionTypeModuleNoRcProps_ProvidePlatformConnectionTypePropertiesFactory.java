package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory;
import p.a02;
import java.lang.Object;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory$InstanceHolder;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps$-CC;
import p.co5;

public final class ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory implements a02	// class@00077c from classes.dex
{

    public void ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory(){
       super();
    }
    public static ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory create(){
       return ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory$InstanceHolder.access$000();
    }
    public static PlatformConnectionTypeProperties providePlatformConnectionTypeProperties(){
       PlatformConnectionTypeProperties platformConn = ConnectionTypeModuleNoRcProps$-CC.d();
       co5.n(platformConn);
       return platformConn;
    }
    public PlatformConnectionTypeProperties get(){
       return ConnectionTypeModuleNoRcProps_ProvidePlatformConnectionTypePropertiesFactory.providePlatformConnectionTypeProperties();
    }
    public Object get(){
       return this.get();
    }
}
