package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy$2;
import android.telephony.PhoneStateListener;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy;

class ConnectivityListenerImplLegacy$2 extends PhoneStateListener	// class@000788 from classes.dex
{
    final ConnectivityListenerImplLegacy this$0;

    public void ConnectivityListenerImplLegacy$2(ConnectivityListenerImplLegacy p0){
       this.this$0 = p0;
       super();
    }
    public void onDataConnectionStateChanged(int p0,int p1){
       super.onDataConnectionStateChanged(p0, p1);
       this.this$0.notifyObservers();
    }
}
