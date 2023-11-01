package com.spotify.connectivity.httpconnection.HttpConnectionFactoryImpl;
import com.spotify.core.http.HttpConnectionFactory;
import p.g15;
import java.lang.Object;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.connectivity.httpconnection.HttpConnectionImpl;

public class HttpConnectionFactoryImpl implements HttpConnectionFactory	// class@00073a from classes.dex
{
    private final g15 mHttpClient;

    public void HttpConnectionFactoryImpl(g15 p0){
       super();
       this.mHttpClient = p0;
    }
    public HttpConnectionDelegate createDelegate(){
       return new HttpConnectionImpl(this.mHttpClient);
    }
}
