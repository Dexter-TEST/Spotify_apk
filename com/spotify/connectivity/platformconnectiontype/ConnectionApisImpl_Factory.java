package com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.connectiontype.SpotifyConnectivityManager;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl;

public final class ConnectionApisImpl_Factory implements a02	// class@000760 from classes.dex
{
    private final tm5 flightModeEnabledMonitorProvider;
    private final tm5 internetMonitorProvider;
    private final tm5 mobileDataDisabledMonitorProvider;
    private final tm5 spotifyConnectivityManagerProvider;

    public void ConnectionApisImpl_Factory(tm5 p0,tm5 p1,tm5 p2,tm5 p3){
       super();
       this.flightModeEnabledMonitorProvider = p0;
       this.mobileDataDisabledMonitorProvider = p1;
       this.internetMonitorProvider = p2;
       this.spotifyConnectivityManagerProvider = p3;
    }
    public static ConnectionApisImpl_Factory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3){
       return new ConnectionApisImpl_Factory(p0, p1, p2, p3);
    }
    public static ConnectionApisImpl newInstance(FlightModeEnabledMonitor p0,MobileDataDisabledMonitor p1,InternetMonitor p2,SpotifyConnectivityManager p3){
       return new ConnectionApisImpl(p0, p1, p2, p3);
    }
    public ConnectionApisImpl get(){
       return ConnectionApisImpl_Factory.newInstance(this.flightModeEnabledMonitorProvider.get(), this.mobileDataDisabledMonitorProvider.get(), this.internetMonitorProvider.get(), this.spotifyConnectivityManagerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
