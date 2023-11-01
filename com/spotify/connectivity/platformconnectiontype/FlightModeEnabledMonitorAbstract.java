package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.IntentFilter;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;

public abstract class FlightModeEnabledMonitorAbstract extends FlightModeEnabledMonitor	// class@000793 from classes.dex
{
    private Context appContext;
    private Observable observable;

    public void FlightModeEnabledMonitorAbstract(Context p0){
       co5.o(p0, "context");
       super();
       p0 = p0.getApplicationContext();
       co5.l(p0, "context.applicationContext");
       this.appContext = p0;
       this.observable = Observable.defer(new FlightModeEnabledMonitorAbstract$1(this, new IntentFilter("android.intent.action.AIRPLANE_MODE")));
    }
    public final Context getAppContext$src_main_java_com_spotify_connectivity_platformconnectiontype_platformconnectiontype_kt(){
       return this.appContext;
    }
    public Observable isFlightModeEnabled(){
       return this.observable;
    }
    public abstract boolean isFlightModeEnabledCurrently();
    public final void setAppContext$src_main_java_com_spotify_connectivity_platformconnectiontype_platformconnectiontype_kt(Context p0){
       co5.o(p0, "<set-?>");
       this.appContext = p0;
    }
}
