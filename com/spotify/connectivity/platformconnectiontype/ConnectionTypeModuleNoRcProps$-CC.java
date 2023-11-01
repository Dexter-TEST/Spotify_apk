package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps$-CC;
import android.app.Application;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import android.content.Context;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerSingletonFactory;
import android.os.Build$VERSION;
import com.spotify.connectivity.platformconnectiontype.ConnectivityUtilImpl;
import com.spotify.connectivity.platformconnectiontype.ConnectivityUtilImplLegacy;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.platformconnectiontype.InternetMonitorImpl;
import com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModuleNoRcProps$1;
import io.reactivex.rxjava3.core.Scheduler;
import p.r45;
import com.spotify.connectivity.platformconnectiontype.SpotifyConnectivityManagerImpl;
import p.jj5;
import java.lang.Object;
import p.c0;

public abstract class ConnectionTypeModuleNoRcProps$-CC	// class@000775 from classes.dex
{

    public static ConnectivityListener a(Application p0,ConnectivityUtil p1,PlatformConnectionTypeProperties p2){
       return ConnectivityListenerSingletonFactory.createConnectivityListener(p0, p1, p2);
    }
    public static ConnectivityUtil b(PlatformConnectionTypeProperties p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return new ConnectivityUtilImpl(p0);
       }
       return new ConnectivityUtilImplLegacy();
    }
    public static InternetMonitor c(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       return new InternetMonitorImpl(new ConnectivityMonitorImpl(p0), p1, p2);
    }
    public static PlatformConnectionTypeProperties d(){
       return new ConnectionTypeModuleNoRcProps$1();
    }
    public static r45 e(Context p0,ConnectivityUtil p1,Scheduler p2){
       if (Build$VERSION.SDK_INT >= 24) {
          return new jj5(new SpotifyConnectivityManagerImpl(p0, p1, p2));
       }
       return c0.a;
    }
}
