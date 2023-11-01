package com.spotify.connectivity.http.TokenResponse;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public class TokenResponse	// class@000733 from classes.dex
{
    public final String accessToken;
    public final int errorCode;
    public final String errorDescription;
    public final int expiresIn;
    public final String refreshToken;
    public final List scope;
    public final String tokenType;

    public void TokenResponse(String p0,String p1,int p2,String p3,List p4,int p5,String p6){
       super();
       this.refreshToken = p0;
       this.accessToken = p1;
       this.expiresIn = p2;
       this.tokenType = p3;
       this.scope = p4;
       this.errorCode = p5;
       this.errorDescription = p6;
    }
}
