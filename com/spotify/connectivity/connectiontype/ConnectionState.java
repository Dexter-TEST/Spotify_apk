package com.spotify.connectivity.connectiontype.ConnectionState;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionState$Connecting;
import com.spotify.connectivity.connectiontype.OfflineReason;
import com.spotify.connectivity.connectiontype.ConnectionState$Offline;
import com.spotify.connectivity.connectiontype.ConnectionState$Online;
import p.qg2;
import p.gr0;

public abstract class ConnectionState	// class@000690 from classes.dex
{

    public void ConnectionState(){
       super();
    }
    public static ConnectionState connecting(){
       return new ConnectionState$Connecting();
    }
    public static ConnectionState offline(OfflineReason p0){
       return new ConnectionState$Offline(p0);
    }
    public static ConnectionState online(){
       return new ConnectionState$Online();
    }
    public final ConnectionState$Connecting asConnecting(){
       return this;
    }
    public final ConnectionState$Offline asOffline(){
       return this;
    }
    public final ConnectionState$Online asOnline(){
       return this;
    }
    public final boolean isConnecting(){
       return this instanceof ConnectionState$Connecting;
    }
    public final boolean isOffline(){
       return this instanceof ConnectionState$Offline;
    }
    public final boolean isOnline(){
       return this instanceof ConnectionState$Online;
    }
    public abstract Object map(qg2 p0,qg2 p1,qg2 p2);
    public abstract void match(gr0 p0,gr0 p1,gr0 p2);
}
