package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1$2;
import java.util.concurrent.Callable;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract;
import java.lang.Object;
import java.lang.Boolean;

final class FlightModeEnabledMonitorAbstract$1$2 implements Callable	// class@000791 from classes.dex
{
    final FlightModeEnabledMonitorAbstract this$0;

    public void FlightModeEnabledMonitorAbstract$1$2(FlightModeEnabledMonitorAbstract p0){
       this.this$0 = p0;
       super();
    }
    public final Boolean call(){
       return Boolean.valueOf(this.this$0.isFlightModeEnabledCurrently());
    }
    public Object call(){
       return this.call();
    }
}
