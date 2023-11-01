package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorImpl;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.ContentResolver;
import android.provider.Settings$Global;

public final class FlightModeEnabledMonitorImpl extends FlightModeEnabledMonitorAbstract	// class@000794 from classes.dex
{

    public void FlightModeEnabledMonitorImpl(Context p0){
       co5.o(p0, "context");
       super(p0);
    }
    public boolean isFlightModeEnabledCurrently(){
       Context appContext$s = this.getAppContext$src_main_java_com_spotify_connectivity_platformconnectiontype_platformconnectiontype_kt();
       co5.i(appContext$s);
       int i = 0;
       if (Settings$Global.getInt(appContext$s.getContentResolver(), "airplane_mode_on", i)) {
          i = true;
       }
       return i;
    }
}
