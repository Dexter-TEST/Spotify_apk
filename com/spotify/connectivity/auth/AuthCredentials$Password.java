package com.spotify.connectivity.auth.AuthCredentials$Password;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$Password extends AuthCredentials	// class@0005d8 from classes.dex
{
    private final String hint;

    public void AuthCredentials$Password(String p0){
       this.hint = p0;
    }
    public static AuthCredentials$Password copy$default(AuthCredentials$Password p0,String p1,int p2,Object p3){
       AuthCredentials$Password hint;
       if ((p2 & 0x01)) {
          hint = p0.hint;
       }
       return p0.copy(hint);
    }
    public final String component1(){
       return this.hint;
    }
    public final AuthCredentials$Password copy(String p0){
       return new AuthCredentials$Password(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$Password) {
          return false;
       }
       if (!co5.c(this.hint, p0.hint)) {
          return false;
       }
       return true;
    }
    public final String getHint(){
       return this.hint;
    }
    public int hashCode(){
       AuthCredentials$Password thint;
       int i = ((thint = this.hint) == null)? 0: thint.hashCode();
       return i;
    }
    public String toString(){
       return hr7.a("Password\(hint=", this.hint, ')');
    }
}
