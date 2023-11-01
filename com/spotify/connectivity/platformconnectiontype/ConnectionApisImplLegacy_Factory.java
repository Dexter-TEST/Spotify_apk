package com.spotify.connectivity.platformconnectiontype.ConnectionApisImplLegacy_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImplLegacy;

public final class ConnectionApisImplLegacy_Factory implements a02	// class@00075f from classes.dex
{
    private final tm5 connectivityListenerProvider;
    private final tm5 flightModeEnabledMonitorProvider;
    private final tm5 internetMonitorProvider;
    private final tm5 mobileDataDisabledMonitorProvider;

    public void ConnectionApisImplLegacy_Factory(tm5 p0,tm5 p1,tm5 p2,tm5 p3){
       super();
       this.connectivityListenerProvider = p0;
       this.flightModeEnabledMonitorProvider = p1;
       this.mobileDataDisabledMonitorProvider = p2;
       this.internetMonitorProvider = p3;
    }
    public static ConnectionApisImplLegacy_Factory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3){
       return new ConnectionApisImplLegacy_Factory(p0, p1, p2, p3);
    }
    public static ConnectionApisImplLegacy newInstance(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2,InternetMonitor p3){
       return new ConnectionApisImplLegacy(p0, p1, p2, p3);
    }
    public ConnectionApisImplLegacy get(){
       return ConnectionApisImplLegacy_Factory.newInstance(this.connectivityListenerProvider.get(), this.flightModeEnabledMonitorProvider.get(), this.mobileDataDisabledMonitorProvider.get(), this.internetMonitorProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
