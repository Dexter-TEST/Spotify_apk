package com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.connectiontype.SpotifyConnectivityManager;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectiontype.ConnectionType;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl$isConnectedObservable$1;
import p.yf2;
import p.zo0;
import java.lang.Class;
import p.tv4;

public final class ConnectionApisImpl implements ConnectionApis	// class@00075d from classes.dex
{
    private final FlightModeEnabledMonitor flightModeEnabledMonitor;
    private final InternetMonitor internetMonitor;
    private final MobileDataDisabledMonitor mobileDataDisabledMonitor;
    private final SpotifyConnectivityManager spotifyConnectivityManager;

    public void ConnectionApisImpl(FlightModeEnabledMonitor p0,MobileDataDisabledMonitor p1,InternetMonitor p2,SpotifyConnectivityManager p3){
       co5.o(p0, "flightModeEnabledMonitor");
       co5.o(p1, "mobileDataDisabledMonitor");
       co5.o(p2, "internetMonitor");
       co5.o(p3, "spotifyConnectivityManager");
       super();
       this.flightModeEnabledMonitor = p0;
       this.mobileDataDisabledMonitor = p1;
       this.internetMonitor = p2;
       this.spotifyConnectivityManager = p3;
    }
    public static final boolean access$isConnected(ConnectionApisImpl p0,ConnectionType p1){
       return p0.isConnected(p1);
    }
    private final boolean isConnected(ConnectionType p0){
       boolean b = (p0 != ConnectionType.CONNECTION_TYPE_NONE)? true: false;
       return b;
    }
    public ConnectionType getConnectionType(){
       ConnectionType connectionTy = this.spotifyConnectivityManager.getConnectionType();
       co5.l(connectionTy, "spotifyConnectivityManager.connectionType");
       return connectionTy;
    }
    public Observable getConnectionTypeObservable(){
       Observable connectionTy = this.spotifyConnectivityManager.getConnectionTypeObservable();
       co5.l(connectionTy, "spotifyConnectivityManag….connectionTypeObservable");
       return connectionTy;
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
    public final SpotifyConnectivityManager getSpotifyConnectivityManager(){
       return this.spotifyConnectivityManager;
    }
    public boolean isConnected(){
       return this.isConnected(this.getConnectionType());
    }
    public Observable isConnectedObservable(){
       zo0 ozo0 = this.getConnectionTypeObservable().map(new ConnectionApisImpl$isConnectedObservable$1(this)).distinctUntilChanged().replay(1);
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
