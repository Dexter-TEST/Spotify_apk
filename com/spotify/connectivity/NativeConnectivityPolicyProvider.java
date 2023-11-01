package com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import java.lang.Object;
import com.spotify.connectivity.ConnectivityPolicyProvider$Observer;
import com.spotify.connectivity.ConnectivityPolicy;

public final class NativeConnectivityPolicyProvider implements ConnectivityPolicyProvider	// class@0005be from classes.dex
{
    private long nThis;

    private void NativeConnectivityPolicyProvider(){
       super();
    }
    public native void addObserver(ConnectivityPolicyProvider$Observer p0);
    public native final void destroy();
    public native ConnectivityPolicy getConnectivityPolicy();
    public native void removeObserver(ConnectivityPolicyProvider$Observer p0);
}
