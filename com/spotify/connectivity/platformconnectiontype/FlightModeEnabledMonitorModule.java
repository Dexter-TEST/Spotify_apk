package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorModule;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorImpl;

public final class FlightModeEnabledMonitorModule	// class@000795 from classes.dex
{
    public static final FlightModeEnabledMonitorModule INSTANCE;

    static {
       FlightModeEnabledMonitorModule.INSTANCE = new FlightModeEnabledMonitorModule();
    }
    private void FlightModeEnabledMonitorModule(){
       super();
    }
    public final FlightModeEnabledMonitor provideFlightModeEnabledMonitor(Context p0){
       co5.o(p0, "context");
       return new FlightModeEnabledMonitorImpl(p0);
    }
}
