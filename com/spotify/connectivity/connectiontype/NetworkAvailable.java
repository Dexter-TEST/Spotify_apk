package com.spotify.connectivity.connectiontype.NetworkAvailable;
import com.spotify.connectivity.connectiontype.NetworkCallbackEvent;
import android.net.Network;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class NetworkAvailable extends NetworkCallbackEvent	// class@0006a1 from classes.dex
{
    private final Network network;

    public void NetworkAvailable(Network p0){
       co5.o(p0, "network");
       super(null);
       this.network = p0;
    }
    public static NetworkAvailable copy$default(NetworkAvailable p0,Network p1,int p2,Object p3){
       NetworkAvailable network;
       if ((p2 & 0x01)) {
          network = p0.network;
       }
       return p0.copy(network);
    }
    public final Network component1(){
       return this.network;
    }
    public final NetworkAvailable copy(Network p0){
       co5.o(p0, "network");
       return new NetworkAvailable(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof NetworkAvailable) {
          return false;
       }
       if (!co5.c(this.network, p0.network)) {
          return false;
       }
       return true;
    }
    public final Network getNetwork(){
       return this.network;
    }
    public int hashCode(){
       return this.network.hashCode();
    }
    public String toString(){
       return "NetworkAvailable\(network="+this.network+')';
    }
}
