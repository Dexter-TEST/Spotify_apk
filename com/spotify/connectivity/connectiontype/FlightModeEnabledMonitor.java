package com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;

public abstract class FlightModeEnabledMonitor	// class@000698 from classes.dex
{

    public void FlightModeEnabledMonitor(){
       super();
    }
    public abstract Observable isFlightModeEnabled();
    public abstract boolean isFlightModeEnabledCurrently();
}
