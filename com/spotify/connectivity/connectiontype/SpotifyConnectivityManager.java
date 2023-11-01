package com.spotify.connectivity.connectiontype.SpotifyConnectivityManager;
import com.spotify.connectivity.connectiontype.ConnectionType;
import io.reactivex.rxjava3.core.Observable;

public interface abstract SpotifyConnectivityManager	// class@0006af from classes.dex
{

    ConnectionType getConnectionType();
    Observable getConnectionTypeObservable();
}
