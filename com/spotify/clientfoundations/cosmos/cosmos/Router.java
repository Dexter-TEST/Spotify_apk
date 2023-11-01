package com.spotify.clientfoundations.cosmos.cosmos.Router;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;

public interface abstract Router	// class@000571 from classes.dex
{

    void destroy();
    Lifetime resolve(Request p0,ResolveCallback p1);
}
