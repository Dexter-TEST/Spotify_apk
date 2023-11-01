package com.spotify.connectivity.httpclienttoken.ClientTokenClient;
import io.reactivex.rxjava3.core.Observable;

public interface abstract ClientTokenClient	// class@000735 from classes.dex
{

    Observable encryptedClientTokenSubscription();
    Observable getToken(long p0);
    Observable setDisabled();
    Observable setEnabled();
}
