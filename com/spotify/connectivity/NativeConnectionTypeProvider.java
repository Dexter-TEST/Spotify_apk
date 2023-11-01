package com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.ConnectionTypeProvider;
import java.lang.Object;
import com.spotify.connectivity.ConnectionTypeProvider$Observer;
import com.spotify.connectivity.ConnectionType;

public final class NativeConnectionTypeProvider implements ConnectionTypeProvider	// class@0005bd from classes.dex
{
    private long nThis;

    private void NativeConnectionTypeProvider(){
       super();
    }
    public native void addObserver(ConnectionTypeProvider$Observer p0);
    public native final void destroy();
    public native ConnectionType getConnectionType();
    public native void removeObserver(ConnectionTypeProvider$Observer p0);
}
