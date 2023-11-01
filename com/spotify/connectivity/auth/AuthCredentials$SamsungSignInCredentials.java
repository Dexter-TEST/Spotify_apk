package com.spotify.connectivity.auth.AuthCredentials$SamsungSignInCredentials;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$SamsungSignInCredentials extends AuthCredentials	// class@0005da from classes.dex
{
    private final String authCode;
    private final String redirectUri;
    private final String tokenEndpointUrl;

    public void AuthCredentials$SamsungSignInCredentials(String p0,String p1,String p2){
       co5.o(p0, "authCode");
       co5.o(p1, "redirectUri");
       co5.o(p2, "tokenEndpointUrl");
       super(null);
       this.authCode = p0;
       this.redirectUri = p1;
       this.tokenEndpointUrl = p2;
    }
    public static AuthCredentials$SamsungSignInCredentials copy$default(AuthCredentials$SamsungSignInCredentials p0,String p1,String p2,String p3,int p4,Object p5){
       AuthCredentials$SamsungSignInCredentials authCode;
       AuthCredentials$SamsungSignInCredentials redirectUri;
       AuthCredentials$SamsungSignInCredentials tokenEndpoin;
       if ((p4 & 0x01)) {
          authCode = p0.authCode;
       }
       if ((p4 & 0x02)) {
          redirectUri = p0.redirectUri;
       }
       if ((p4 & 0x04)) {
          tokenEndpoin = p0.tokenEndpointUrl;
       }
       return p0.copy(authCode, redirectUri, tokenEndpoin);
    }
    public final String component1(){
       return this.authCode;
    }
    public final String component2(){
       return this.redirectUri;
    }
    public final String component3(){
       return this.tokenEndpointUrl;
    }
    public final AuthCredentials$SamsungSignInCredentials copy(String p0,String p1,String p2){
       co5.o(p0, "authCode");
       co5.o(p1, "redirectUri");
       co5.o(p2, "tokenEndpointUrl");
       return new AuthCredentials$SamsungSignInCredentials(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$SamsungSignInCredentials) {
          return false;
       }
       if (!co5.c(this.authCode, p0.authCode)) {
          return false;
       }
       if (!co5.c(this.redirectUri, p0.redirectUri)) {
          return false;
       }
       if (!co5.c(this.tokenEndpointUrl, p0.tokenEndpointUrl)) {
          return false;
       }
       return true;
    }
    public final String getAuthCode(){
       return this.authCode;
    }
    public final String getRedirectUri(){
       return this.redirectUri;
    }
    public final String getTokenEndpointUrl(){
       return this.tokenEndpointUrl;
    }
    public int hashCode(){
       return (this.tokenEndpointUrl.hashCode() + tp2.g(this.redirectUri, (this.authCode.hashCode() * 31), 31));
    }
    public String toString(){
       return hr7.a("SamsungSignInCredentials\(authCode="+this.authCode+", redirectUri="+this.redirectUri+", tokenEndpointUrl=", this.tokenEndpointUrl, ')');
    }
}
