package com.spotify.connectivity.connectiontype.NetworkCapabilitiesChanged;
import com.spotify.connectivity.connectiontype.NetworkCallbackEvent;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class NetworkCapabilitiesChanged extends NetworkCallbackEvent	// class@0006a3 from classes.dex
{
    private final NetworkCapabilities capabilities;
    private final Network network;

    public void NetworkCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       co5.o(p0, "network");
       co5.o(p1, "capabilities");
       super(null);
       this.network = p0;
       this.capabilities = p1;
    }
    public static NetworkCapabilitiesChanged copy$default(NetworkCapabilitiesChanged p0,Network p1,NetworkCapabilities p2,int p3,Object p4){
       NetworkCapabilitiesChanged network;
       NetworkCapabilitiesChanged capabilities;
       if ((p3 & 0x01)) {
          network = p0.network;
       }
       if ((p3 & 0x02)) {
          capabilities = p0.capabilities;
       }
       return p0.copy(network, capabilities);
    }
    public final Network component1(){
       return this.network;
    }
    public final NetworkCapabilities component2(){
       return this.capabilities;
    }
    public final NetworkCapabilitiesChanged copy(Network p0,NetworkCapabilities p1){
       co5.o(p0, "network");
       co5.o(p1, "capabilities");
       return new NetworkCapabilitiesChanged(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof NetworkCapabilitiesChanged) {
          return false;
       }
       if (!co5.c(this.network, p0.network)) {
          return false;
       }
       if (!co5.c(this.capabilities, p0.capabilities)) {
          return false;
       }
       return true;
    }
    public final NetworkCapabilities getCapabilities(){
       return this.capabilities;
    }
    public final Network getNetwork(){
       return this.network;
    }
    public int hashCode(){
       return (this.capabilities.hashCode() + (this.network.hashCode() * 31));
    }
    public String toString(){
       return "NetworkCapabilitiesChanged\(network="+this.network+", capabilities="+this.capabilities+')';
    }
}
