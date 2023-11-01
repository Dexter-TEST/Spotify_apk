package com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;

public final class ConnectivityMonitorImpl_Factory implements a02	// class@00078c from classes.dex
{
    private final tm5 connectivityListenerProvider;

    public void ConnectivityMonitorImpl_Factory(tm5 p0){
       super();
       this.connectivityListenerProvider = p0;
    }
    public static ConnectivityMonitorImpl_Factory create(tm5 p0){
       return new ConnectivityMonitorImpl_Factory(p0);
    }
    public static ConnectivityMonitorImpl newInstance(ConnectivityListener p0){
       return new ConnectivityMonitorImpl(p0);
    }
    public ConnectivityMonitorImpl get(){
       return ConnectivityMonitorImpl_Factory.newInstance(this.connectivityListenerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
