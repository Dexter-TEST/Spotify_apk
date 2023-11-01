package com.spotify.connectivity.ConnectionTypeProvider$NativeObserver;
import com.spotify.connectivity.ConnectionTypeProvider$Observer;
import java.lang.Object;
import com.spotify.connectivity.ConnectionType;

public final class ConnectionTypeProvider$NativeObserver implements ConnectionTypeProvider$Observer	// class@0005ae from classes.dex
{
    private long nThis;

    private void ConnectionTypeProvider$NativeObserver(){
       super();
    }
    public native void connectionTypeChanged(ConnectionType p0,ConnectionType p1);
}
