package com.spotify.connectivity.platformconnectiontype.ConnectionApisModule_ProvideConnectionApisFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.r45;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.bp0;
import p.co5;

public final class ConnectionApisModule_ProvideConnectionApisFactory implements a02	// class@000765 from classes.dex
{
    private final tm5 connectivityListenerProvider;
    private final tm5 flightModeEnabledMonitorProvider;
    private final tm5 internetMonitorProvider;
    private final tm5 mobileDataDisabledMonitorProvider;
    private final tm5 spotifyConnectivityManagerProvider;

    public void ConnectionApisModule_ProvideConnectionApisFactory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4){
       super();
       this.connectivityListenerProvider = p0;
       this.flightModeEnabledMonitorProvider = p1;
       this.mobileDataDisabledMonitorProvider = p2;
       this.internetMonitorProvider = p3;
       this.spotifyConnectivityManagerProvider = p4;
    }
    public static ConnectionApisModule_ProvideConnectionApisFactory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4){
       ConnectionApisModule_ProvideConnectionApisFactory v6 = new ConnectionApisModule_ProvideConnectionApisFactory(p0, p1, p2, p3, p4);
       return v6;
    }
    public static ConnectionApis provideConnectionApis(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2,InternetMonitor p3,r45 p4){
       ConnectionApis uConnectionA = bp0.a(p0, p1, p2, p3, p4);
       co5.n(uConnectionA);
       return uConnectionA;
    }
    public ConnectionApis get(){
       return ConnectionApisModule_ProvideConnectionApisFactory.provideConnectionApis(this.connectivityListenerProvider.get(), this.flightModeEnabledMonitorProvider.get(), this.mobileDataDisabledMonitorProvider.get(), this.internetMonitorProvider.get(), this.spotifyConnectivityManagerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
