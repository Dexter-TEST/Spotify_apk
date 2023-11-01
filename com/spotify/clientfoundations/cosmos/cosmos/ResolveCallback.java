package com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import java.lang.Throwable;
import com.spotify.clientfoundations.cosmos.cosmos.Response;

public interface abstract ResolveCallback	// class@00056e from classes.dex
{

    void onError(Throwable p0);
    void onResolved(Response p0);
}
