package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorModule;
import p.co5;

public final class FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory implements a02	// class@000796 from classes.dex
{
    private final tm5 contextProvider;

    public void FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory create(tm5 p0){
       return new FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory(p0);
    }
    public static FlightModeEnabledMonitor provideFlightModeEnabledMonitor(Context p0){
       FlightModeEnabledMonitor uFlightModeE = FlightModeEnabledMonitorModule.INSTANCE.provideFlightModeEnabledMonitor(p0);
       co5.n(uFlightModeE);
       return uFlightModeE;
    }
    public FlightModeEnabledMonitor get(){
       return FlightModeEnabledMonitorModule_ProvideFlightModeEnabledMonitorFactory.provideFlightModeEnabledMonitor(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
