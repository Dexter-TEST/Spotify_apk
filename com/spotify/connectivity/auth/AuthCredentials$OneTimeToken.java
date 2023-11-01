package com.spotify.connectivity.auth.AuthCredentials$OneTimeToken;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$OneTimeToken extends AuthCredentials	// class@0005d6 from classes.dex
{
    private final String ott;

    public void AuthCredentials$OneTimeToken(String p0){
       co5.o(p0, "ott");
       super(null);
       this.ott = p0;
    }
    public static AuthCredentials$OneTimeToken copy$default(AuthCredentials$OneTimeToken p0,String p1,int p2,Object p3){
       AuthCredentials$OneTimeToken ott;
       if ((p2 & 0x01)) {
          ott = p0.ott;
       }
       return p0.copy(ott);
    }
    public final String component1(){
       return this.ott;
    }
    public final AuthCredentials$OneTimeToken copy(String p0){
       co5.o(p0, "ott");
       return new AuthCredentials$OneTimeToken(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$OneTimeToken) {
          return false;
       }
       if (!co5.c(this.ott, p0.ott)) {
          return false;
       }
       return true;
    }
    public final String getOtt(){
       return this.ott;
    }
    public int hashCode(){
       return this.ott.hashCode();
    }
    public String toString(){
       return hr7.a("OneTimeToken\(ott=", this.ott, ')');
    }
}
