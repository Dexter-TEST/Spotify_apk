package com.spotify.connectivity.auth.AuthCredentials$LegacyV3UsernamePassword;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$LegacyV3UsernamePassword extends AuthCredentials	// class@0005d5 from classes.dex
{
    private final String password;
    private final String username;

    public void AuthCredentials$LegacyV3UsernamePassword(String p0,String p1){
       co5.o(p0, "username");
       co5.o(p1, "password");
       super(null);
       this.username = p0;
       this.password = p1;
    }
    public static AuthCredentials$LegacyV3UsernamePassword copy$default(AuthCredentials$LegacyV3UsernamePassword p0,String p1,String p2,int p3,Object p4){
       AuthCredentials$LegacyV3UsernamePassword username;
       AuthCredentials$LegacyV3UsernamePassword password;
       if ((p3 & 0x01)) {
          username = p0.username;
       }
       if ((p3 & 0x02)) {
          password = p0.password;
       }
       return p0.copy(username, password);
    }
    public final String component1(){
       return this.username;
    }
    public final String component2(){
       return this.password;
    }
    public final AuthCredentials$LegacyV3UsernamePassword copy(String p0,String p1){
       co5.o(p0, "username");
       co5.o(p1, "password");
       return new AuthCredentials$LegacyV3UsernamePassword(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$LegacyV3UsernamePassword) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.password, p0.password)) {
          return false;
       }
       return true;
    }
    public final String getPassword(){
       return this.password;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       return (this.password.hashCode() + (this.username.hashCode() * 31));
    }
    public String toString(){
       return hr7.a("LegacyV3UsernamePassword\(username="+this.username+", password=", this.password, ')');
    }
}
