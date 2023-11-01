package com.spotify.connectivity.connectiontype.CoreConnectionState;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectiontype.OfflineState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;

public interface abstract CoreConnectionState	// class@000696 from classes.dex
{
    public static final String OFFLINE_CONNECTION_URI = "sp://connectivity-manager/v1/connection";

    Observable connection();
    Single set(OfflineState p0);
    Completable setUsePlatformConnectionStateForIsOnline();
}
