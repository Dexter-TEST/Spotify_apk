package com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl$isConnectedObservable$1;
import p.yf2;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImpl;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Boolean;
import java.lang.String;
import p.co5;

final class ConnectionApisImpl$isConnectedObservable$1 implements yf2	// class@00075c from classes.dex
{
    final ConnectionApisImpl this$0;

    public void ConnectionApisImpl$isConnectedObservable$1(ConnectionApisImpl p0){
       this.this$0 = p0;
       super();
    }
    public final Boolean apply(ConnectionType p0){
       co5.l(p0, "it");
       return Boolean.valueOf(ConnectionApisImpl.access$isConnected(this.this$0, p0));
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
