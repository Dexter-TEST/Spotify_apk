package com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule$Companion;
import p.co5;

public final class ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory implements a02	// class@00076a from classes.dex
{
    private final tm5 contextProvider;

    public void ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory(tm5 p0){
       super();
       this.contextProvider = p0;
    }
    public static ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory create(tm5 p0){
       return new ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory(p0);
    }
    public static FlightModeEnabledMonitor provideFlightModeEnabledMonitor(Context p0){
       FlightModeEnabledMonitor uFlightModeE = ConnectionApisServiceScopeModule.Companion.provideFlightModeEnabledMonitor(p0);
       co5.n(uFlightModeE);
       return uFlightModeE;
    }
    public FlightModeEnabledMonitor get(){
       return ConnectionApisServiceScopeModule_Companion_ProvideFlightModeEnabledMonitorFactory.provideFlightModeEnabledMonitor(this.contextProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
