package com.spotify.connectivity.pubsub.PubSubClient;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.zf2;

public interface abstract PubSubClient	// class@00080a from classes.dex
{

    Observable getConnectionIDObservable();
    Observable getObservableOf(String p0,zf2 p1);
    void onSessionLogin();
    void onSessionLogout();
}
