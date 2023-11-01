package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy$1;
import android.content.BroadcastReceiver;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy;
import android.content.Context;
import android.content.Intent;

class ConnectivityListenerImplLegacy$1 extends BroadcastReceiver	// class@000787 from classes.dex
{
    final ConnectivityListenerImplLegacy this$0;

    public void ConnectivityListenerImplLegacy$1(ConnectivityListenerImplLegacy p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       this.this$0.notifyObservers();
    }
}
