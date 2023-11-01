package com.spotify.connectivity.ConnectivityPolicyProvider$NativeObserver;
import com.spotify.connectivity.ConnectivityPolicyProvider$Observer;
import java.lang.Object;
import com.spotify.connectivity.ConnectivityPolicy;

public final class ConnectivityPolicyProvider$NativeObserver implements ConnectivityPolicyProvider$Observer	// class@0005b3 from classes.dex
{
    private long nThis;

    private void ConnectivityPolicyProvider$NativeObserver(){
       super();
    }
    public native void connectivityPolicyChanged(ConnectivityPolicy p0,ConnectivityPolicy p1);
}
