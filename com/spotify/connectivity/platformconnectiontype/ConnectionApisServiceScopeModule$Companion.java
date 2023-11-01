package com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule$Companion;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorImpl;

public final class ConnectionApisServiceScopeModule$Companion	// class@000767 from classes.dex
{
    static final ConnectionApisServiceScopeModule$Companion $$INSTANCE;

    static {
       ConnectionApisServiceScopeModule$Companion.$$INSTANCE = new ConnectionApisServiceScopeModule$Companion();
    }
    private void ConnectionApisServiceScopeModule$Companion(){
       super();
    }
    public final Observable provideConnectionTypeObservable(ConnectionApis p0){
       co5.o(p0, "connectionApis");
       return p0.getConnectionTypeObservable();
    }
    public final FlightModeEnabledMonitor provideFlightModeEnabledMonitor(Context p0){
       co5.o(p0, "context");
       return new FlightModeEnabledMonitorImpl(p0);
    }
}
