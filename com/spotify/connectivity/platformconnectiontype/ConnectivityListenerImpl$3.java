package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$3;
import android.telephony.PhoneStateListener;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl;

class ConnectivityListenerImpl$3 extends PhoneStateListener	// class@000785 from classes.dex
{
    final ConnectivityListenerImpl this$0;

    public void ConnectivityListenerImpl$3(ConnectivityListenerImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onDataConnectionStateChanged(int p0,int p1){
       super.onDataConnectionStateChanged(p0, p1);
       this.this$0.notifyObservers();
    }
}
