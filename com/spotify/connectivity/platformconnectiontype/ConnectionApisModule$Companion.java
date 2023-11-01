package com.spotify.connectivity.platformconnectiontype.ConnectionApisModule$Companion;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.r45;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl;
import com.spotify.connectivity.connectiontype.SpotifyConnectivityManager;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImplLegacy;
import io.reactivex.rxjava3.core.Observable;

public final class ConnectionApisModule$Companion	// class@000761 from classes.dex
{
    static final ConnectionApisModule$Companion $$INSTANCE;

    static {
       ConnectionApisModule$Companion.$$INSTANCE = new ConnectionApisModule$Companion();
    }
    private void ConnectionApisModule$Companion(){
       super();
    }
    public final ConnectionApis provideConnectionApis(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2,InternetMonitor p3,r45 p4){
       ConnectionApisImpl uConnectionA;
       co5.o(p0, "connectivityListener");
       co5.o(p1, "flightModeEnabledMonitor");
       co5.o(p2, "mobileDataDisabledMonitor");
       co5.o(p3, "internetMonitor");
       co5.o(p4, "spotifyConnectivityManager");
       if (p4.c()) {
          p4 = p4.b();
          co5.l(p4, "spotifyConnectivityManager.get\(\)");
          uConnectionA = new ConnectionApisImpl(p1, p2, p3, p4);
       }else {
          uConnectionA = new ConnectionApisImplLegacy(p0, p1, p2, p3);
       }
       return uConnectionA;
    }
    public final Observable provideConnectionTypeObservable(ConnectionApis p0){
       co5.o(p0, "connectionApis");
       return p0.getConnectionTypeObservable();
    }
}
