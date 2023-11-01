package com.spotify.connectivity.auth.AccessTokenClient;
import io.reactivex.rxjava3.core.Single;

public interface abstract AccessTokenClient	// class@0005cb from classes.dex
{

    Single getAuthUserInfo();
}
