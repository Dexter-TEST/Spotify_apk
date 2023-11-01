package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1$1;
import p.yf2;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract;
import java.lang.Object;
import android.content.Intent;
import java.lang.Boolean;

final class FlightModeEnabledMonitorAbstract$1$1 implements yf2	// class@000790 from classes.dex
{
    final FlightModeEnabledMonitorAbstract this$0;

    public void FlightModeEnabledMonitorAbstract$1$1(FlightModeEnabledMonitorAbstract p0){
       this.this$0 = p0;
       super();
    }
    public final Boolean apply(Intent p0){
       return Boolean.valueOf(this.this$0.isFlightModeEnabledCurrently());
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
