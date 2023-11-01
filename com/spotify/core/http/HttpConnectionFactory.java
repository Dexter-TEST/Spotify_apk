package com.spotify.core.http.HttpConnectionFactory;
import com.spotify.core.http.HttpConnectionDelegate;

public interface abstract HttpConnectionFactory	// class@000873 from classes.dex
{

    HttpConnectionDelegate createDelegate();
}
