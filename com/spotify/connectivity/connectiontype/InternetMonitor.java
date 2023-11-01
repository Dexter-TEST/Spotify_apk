package com.spotify.connectivity.connectiontype.InternetMonitor;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectiontype.ConnectionType;
import io.reactivex.rxjava3.core.Single;

public interface abstract InternetMonitor	// class@00069b from classes.dex
{

    Observable getInternetState();
    Observable getPermanentOfflineState();
    boolean isPermanentOffline(ConnectionType p0,boolean p1,boolean p2);
    Single isPermanentlyOffline();
}
