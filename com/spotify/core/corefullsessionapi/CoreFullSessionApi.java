package com.spotify.core.corefullsessionapi.CoreFullSessionApi;
import com.spotify.clientfoundations.core.corefull.NativeFullAuthenticatedScope;
import com.spotify.connectivity.sessionapi.SessionClient;

public interface abstract CoreFullSessionApi	// class@00083f from classes.dex
{

    NativeFullAuthenticatedScope getAuthenticatedScope();
    SessionClient getSessionClient();
}
