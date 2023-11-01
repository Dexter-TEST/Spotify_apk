package com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.ConnectionTypeProvider$Observer;
import com.spotify.connectivity.ConnectionType;

public interface abstract ConnectionTypeProvider	// class@0005b0 from classes.dex
{

    void addObserver(ConnectionTypeProvider$Observer p0);
    ConnectionType getConnectionType();
    void removeObserver(ConnectionTypeProvider$Observer p0);
}
