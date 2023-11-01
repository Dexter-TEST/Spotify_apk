package com.spotify.connectivity.connectiontype.ConnectionState$Online;
import com.spotify.connectivity.connectiontype.ConnectionState;
import java.lang.Object;
import p.qg2;
import p.gr0;
import java.lang.String;

public final class ConnectionState$Online extends ConnectionState	// class@00068f from classes.dex
{

    public void ConnectionState$Online(){
       super();
    }
    public boolean equals(Object p0){
       return p0 instanceof ConnectionState$Online;
    }
    public int hashCode(){
       return 0;
    }
    public final Object map(qg2 p0,qg2 p1,qg2 p2){
       return p0.apply(this);
    }
    public final void match(gr0 p0,gr0 p1,gr0 p2){
       p0.accept(this);
    }
    public String toString(){
       return "Online{}";
    }
}
