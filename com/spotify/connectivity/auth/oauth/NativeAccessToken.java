package com.spotify.connectivity.auth.oauth.NativeAccessToken;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class NativeAccessToken	// class@000646 from classes.dex
{
    private String accessToken;
    private long expiresAt;
    private String tokenType;

    public void NativeAccessToken(){
       super();
       this.tokenType = "";
       this.accessToken = "";
    }
    public final String getAccessToken(){
       return this.accessToken;
    }
    public final long getExpiresAt(){
       return this.expiresAt;
    }
    public final String getTokenType(){
       return this.tokenType;
    }
    public final void setAccessToken(String p0){
       co5.o(p0, "<set-?>");
       this.accessToken = p0;
    }
    public final void setExpiresAt(long p0){
       this.expiresAt = p0;
    }
    public final void setTokenType(String p0){
       co5.o(p0, "<set-?>");
       this.tokenType = p0;
    }
}
