package com.spotify.connectivity.pubsub.PubSubStats;
import java.lang.String;

public interface abstract PubSubStats	// class@00080b from classes.dex
{

    void onSessionLogout();
    void registerFailedConversion(String p0);
    void registerMessage(String p0);
}
