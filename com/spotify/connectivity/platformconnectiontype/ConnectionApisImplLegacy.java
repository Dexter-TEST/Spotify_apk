package com.spotify.connectivity.platformconnectiontype.ConnectionApisImplLegacy;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.platformconnectiontype.InternetConnectivityObservableImpl;
import com.spotify.connectivity.connectiontype.ConnectionType;
import io.reactivex.rxjava3.core.Observable;
import p.zo0;
import java.lang.Class;
import p.tv4;

public final class ConnectionApisImplLegacy implements ConnectionApis	// class@00075e from classes.dex
{
    private final ConnectivityListener connectivityListener;
    private final FlightModeEnabledMonitor flightModeEnabledMonitor;
    private final InternetConnectivityObservableImpl internetConnectivityObservable;
    private final InternetMonitor internetMonitor;
    private final MobileDataDisabledMonitor mobileDataDisabledMonitor;

    public void ConnectionApisImplLegacy(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2,InternetMonitor p3){
       co5.o(p0, "connectivityListener");
       co5.o(p1, "flightModeEnabledMonitor");
       co5.o(p2, "mobileDataDisabledMonitor");
       co5.o(p3, "internetMonitor");
       super();
       this.connectivityListener = p0;
       this.flightModeEnabledMonitor = p1;
       this.mobileDataDisabledMonitor = p2;
       this.internetMonitor = p3;
       this.internetConnectivityObservable = new InternetConnectivityObservableImpl(p0);
    }
    public ConnectionType getConnectionType(){
       return this.internetConnectivityObservable.getNetworkConnectivity();
    }
    public Observable getConnectionTypeObservable(){
       zo0 ozo0 = this.internetConnectivityObservable.createConnectionType().distinctUntilChanged().replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
    public final ConnectivityListener getConnectivityListener(){
       return this.connectivityListener;
    }
    public final FlightModeEnabledMonitor getFlightModeEnabledMonitor(){
       return this.flightModeEnabledMonitor;
    }
    public final InternetMonitor getInternetMonitor(){
       return this.internetMonitor;
    }
    public final MobileDataDisabledMonitor getMobileDataDisabledMonitor(){
       return this.mobileDataDisabledMonitor;
    }
    public boolean isConnected(){
       return this.internetConnectivityObservable.isConnected();
    }
    public Observable isConnectedObservable(){
       zo0 ozo0 = this.internetConnectivityObservable.create().distinctUntilChanged().replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
    public boolean isFlightModeEnabled(){
       return this.flightModeEnabledMonitor.isFlightModeEnabledCurrently();
    }
    public Observable isFlightModeEnabledObservable(){
       zo0 ozo0 = this.flightModeEnabledMonitor.isFlightModeEnabled().distinctUntilChanged().replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
    public boolean isMobileDataDisabled(){
       return this.mobileDataDisabledMonitor.getMobileDataDisabled();
    }
    public Observable isMobileDataDisabledObservable(){
       zo0 ozo0 = this.mobileDataDisabledMonitor.isMobileDataDisabled().distinctUntilChanged().replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
    public boolean isPermanentlyOffline(){
       return this.internetMonitor.isPermanentOffline(this.getConnectionType(), this.isMobileDataDisabled(), this.isFlightModeEnabled());
    }
    public Observable isPermanentlyOfflineObservable(){
       zo0 ozo0 = this.internetMonitor.getPermanentOfflineState().distinctUntilChanged().replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
}
