package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$-CC;
import p.co5;

public final class ConnectionTypeModule_ProvideInternetMonitorFactory implements a02	// class@000780 from classes.dex
{
    private final tm5 connectivityListenerProvider;
    private final tm5 flightModeEnabledMonitorProvider;
    private final tm5 mobileDataDisabledMonitorProvider;

    public void ConnectionTypeModule_ProvideInternetMonitorFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.connectivityListenerProvider = p0;
       this.flightModeEnabledMonitorProvider = p1;
       this.mobileDataDisabledMonitorProvider = p2;
    }
    public static ConnectionTypeModule_ProvideInternetMonitorFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ConnectionTypeModule_ProvideInternetMonitorFactory(p0, p1, p2);
    }
    public static InternetMonitor provideInternetMonitor(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       InternetMonitor internetMoni = ConnectionTypeModule$-CC.c(p0, p1, p2);
       co5.n(internetMoni);
       return internetMoni;
    }
    public InternetMonitor get(){
       return ConnectionTypeModule_ProvideInternetMonitorFactory.provideInternetMonitor(this.connectivityListenerProvider.get(), this.flightModeEnabledMonitorProvider.get(), this.mobileDataDisabledMonitorProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
