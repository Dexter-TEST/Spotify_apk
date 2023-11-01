package com.spotify.core.http.HttpOptions;
import java.lang.Object;

public final class HttpOptions	// class@000874 from classes.dex
{
    private final long connectTimeout;
    private final boolean isFollowRedirects;
    private final long timeout;

    public void HttpOptions(long p0,long p1){
       super(p0, p1, true);
    }
    public void HttpOptions(long p0,long p1,boolean p2){
       super();
       this.timeout = p0;
       this.connectTimeout = p1;
       this.isFollowRedirects = p2;
    }
    public final long getConnectTimeout(){
       return this.connectTimeout;
    }
    public final long getTimeout(){
       return this.timeout;
    }
    public final boolean isFollowRedirects(){
       return this.isFollowRedirects;
    }
}
