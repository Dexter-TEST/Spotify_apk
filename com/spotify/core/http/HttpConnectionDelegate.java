package com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.http.HttpOptions;

public interface abstract HttpConnectionDelegate	// class@000872 from classes.dex
{

    void abort();
    boolean isRequestStarted();
    void send(HttpConnection p0,HttpRequest p1,HttpOptions p2);
}
