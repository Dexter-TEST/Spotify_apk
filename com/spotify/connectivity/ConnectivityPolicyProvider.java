package com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider$Observer;
import com.spotify.connectivity.ConnectivityPolicy;

public interface abstract ConnectivityPolicyProvider	// class@0005b5 from classes.dex
{

    void addObserver(ConnectivityPolicyProvider$Observer p0);
    ConnectivityPolicy getConnectivityPolicy();
    void removeObserver(ConnectivityPolicyProvider$Observer p0);
}
