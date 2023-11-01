package com.spotify.connectivity.http.KeymasterTokenAuthenticatedEndpoint;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;

public interface abstract KeymasterTokenAuthenticatedEndpoint	// class@00072f from classes.dex
{

    Single fetchToken(String p0,String p1,String p2);
}
