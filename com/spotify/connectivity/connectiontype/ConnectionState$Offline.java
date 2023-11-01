package com.spotify.connectivity.connectiontype.ConnectionState$Offline;
import com.spotify.connectivity.connectiontype.ConnectionState;
import com.spotify.connectivity.connectiontype.OfflineReason;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.gr0;
import java.lang.String;
import java.lang.StringBuilder;

public final class ConnectionState$Offline extends ConnectionState	// class@00068e from classes.dex
{
    private final OfflineReason reason;

    public void ConnectionState$Offline(OfflineReason p0){
       super();
       p0.getClass();
       this.reason = p0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ConnectionState$Offline) {
          return false;
       }
       if (p0.reason != this.reason) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (this.reason.hashCode() + 0);
    }
    public final Object map(qg2 p0,qg2 p1,qg2 p2){
       return p1.apply(this);
    }
    public final void match(gr0 p0,gr0 p1,gr0 p2){
       p1.accept(this);
    }
    public final OfflineReason reason(){
       return this.reason;
    }
    public String toString(){
       return "Offline{reason="+this.reason+'}';
    }
}
