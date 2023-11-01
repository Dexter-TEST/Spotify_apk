package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$1;
import android.content.BroadcastReceiver;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl;
import android.content.Context;
import android.content.Intent;

class ConnectivityListenerImpl$1 extends BroadcastReceiver	// class@000783 from classes.dex
{
    final ConnectivityListenerImpl this$0;

    public void ConnectivityListenerImpl$1(ConnectivityListenerImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       this.this$0.notifyObservers();
    }
}
