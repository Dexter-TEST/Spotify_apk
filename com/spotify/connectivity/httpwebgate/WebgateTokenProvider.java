package com.spotify.connectivity.httpwebgate.WebgateTokenProvider;
import java.lang.String;

public interface abstract WebgateTokenProvider	// class@00074d from classes.dex
{

    void onSessionStart();
    void onStart();
    void onStop();
    String requestAccessToken(int p0);
    String requestAccessToken(int p0,boolean p1);
    void reset();
    void resetAndStopServingTokens();
}
