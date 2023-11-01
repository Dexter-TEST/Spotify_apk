package com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import p.cp0;
import p.co5;

public final class ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory implements a02	// class@00076c from classes.dex
{
    private final tm5 contextProvider;

    public void ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory create(tm5 p0){
       return new ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory(p0);
    }
    public static FlightModeEnabledMonitor provideFlightModeEnabledMonitor(Context p0){
       FlightModeEnabledMonitor uFlightModeE = cp0.b(p0);
       co5.n(uFlightModeE);
       return uFlightModeE;
    }
    public FlightModeEnabledMonitor get(){
       return ConnectionApisServiceScopeModule_ProvideFlightModeEnabledMonitorFactory.provideFlightModeEnabledMonitor(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
