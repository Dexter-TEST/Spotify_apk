package com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.connectiontype.ConnectionType;
import io.reactivex.rxjava3.core.Observable;

public interface abstract ConnectionApis	// class@00068c from classes.dex
{

    ConnectionType getConnectionType();
    Observable getConnectionTypeObservable();
    boolean isConnected();
    Observable isConnectedObservable();
    boolean isFlightModeEnabled();
    Observable isFlightModeEnabledObservable();
    boolean isMobileDataDisabled();
    Observable isMobileDataDisabledObservable();
    boolean isPermanentlyOffline();
    Observable isPermanentlyOfflineObservable();
}
