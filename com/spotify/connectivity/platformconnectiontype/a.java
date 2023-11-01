package com.spotify.connectivity.platformconnectiontype.a;
import java.lang.Runnable;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$2;
import android.net.Network;
import java.lang.Object;

public final class a implements Runnable	// class@0007a2 from classes.dex
{
    public final ConnectivityListenerImpl$2 a;
    public final Network b;

    public void a(ConnectivityListenerImpl$2 p0,Network p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       ConnectivityListenerImpl$2.a(this.a, this.b);
    }
}
