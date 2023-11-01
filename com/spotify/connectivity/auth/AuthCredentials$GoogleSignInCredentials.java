package com.spotify.connectivity.auth.AuthCredentials$GoogleSignInCredentials;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$GoogleSignInCredentials extends AuthCredentials	// class@0005d4 from classes.dex
{
    private final String authCode;
    private final String redirectUri;

    public void AuthCredentials$GoogleSignInCredentials(String p0,String p1){
       co5.o(p0, "authCode");
       super(null);
       this.authCode = p0;
       this.redirectUri = p1;
    }
    public static AuthCredentials$GoogleSignInCredentials copy$default(AuthCredentials$GoogleSignInCredentials p0,String p1,String p2,int p3,Object p4){
       AuthCredentials$GoogleSignInCredentials authCode;
       AuthCredentials$GoogleSignInCredentials redirectUri;
       if ((p3 & 0x01)) {
          authCode = p0.authCode;
       }
       if ((p3 & 0x02)) {
          redirectUri = p0.redirectUri;
       }
       return p0.copy(authCode, redirectUri);
    }
    public final String component1(){
       return this.authCode;
    }
    public final String component2(){
       return this.redirectUri;
    }
    public final AuthCredentials$GoogleSignInCredentials copy(String p0,String p1){
       co5.o(p0, "authCode");
       return new AuthCredentials$GoogleSignInCredentials(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$GoogleSignInCredentials) {
          return false;
       }
       if (!co5.c(this.authCode, p0.authCode)) {
          return false;
       }
       if (!co5.c(this.redirectUri, p0.redirectUri)) {
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
    public int hashCode(){
       AuthCredentials$GoogleSignInCredentials tredirectUri;
       int i = this.authCode.hashCode() * 31;
       int i1 = ((tredirectUri = this.redirectUri) == null)? 0: tredirectUri.hashCode();
       return (i + i1);
    }
    public String toString(){
       return hr7.a("GoogleSignInCredentials\(authCode="+this.authCode+", redirectUri=", this.redirectUri, ')');
    }
}
