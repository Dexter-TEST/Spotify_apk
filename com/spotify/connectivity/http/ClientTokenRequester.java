package com.spotify.connectivity.http.ClientTokenRequester;
import java.lang.Runnable;
import com.spotify.connectivity.httpclienttoken.ClientToken;

public interface abstract ClientTokenRequester	// class@000727 from classes.dex
{

    void cancel();
    void onCoreStarted();
    void onCoreStopped();
    void registerClientTokenClearedCallback(Runnable p0);
    ClientToken requestToken(int p0);
}
