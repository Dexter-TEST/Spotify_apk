package com.spotify.connectivity.platformconnectiontype.b;
import java.lang.Runnable;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$2;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.Object;

public final class b implements Runnable	// class@0007a3 from classes.dex
{
    public final ConnectivityListenerImpl$2 a;
    public final Network b;
    public final NetworkCapabilities c;

    public void b(ConnectivityListenerImpl$2 p0,Network p1,NetworkCapabilities p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void run(){
       ConnectivityListenerImpl$2.b(this.a, this.b, this.c);
    }
}
