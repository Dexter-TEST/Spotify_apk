package com.spotify.connectivity.auth.AuthRequest;
import com.spotify.connectivity.auth.AuthCredentials;
import com.spotify.connectivity.auth.AuthRequestConfiguration;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class AuthRequest	// class@0005dd from classes.dex
{
    private final AuthRequestConfiguration configuration;
    private final AuthCredentials credentials;

    public void AuthRequest(AuthCredentials p0,AuthRequestConfiguration p1){
       co5.o(p0, "credentials");
       co5.o(p1, "configuration");
       super();
       this.credentials = p0;
       this.configuration = p1;
    }
    public static AuthRequest copy$default(AuthRequest p0,AuthCredentials p1,AuthRequestConfiguration p2,int p3,Object p4){
       AuthRequest credentials;
       AuthRequest configuratio;
       if ((p3 & 0x01)) {
          credentials = p0.credentials;
       }
       if ((p3 & 0x02)) {
          configuratio = p0.configuration;
       }
       return p0.copy(credentials, configuratio);
    }
    public final AuthCredentials component1(){
       return this.credentials;
    }
    public final AuthRequestConfiguration component2(){
       return this.configuration;
    }
    public final AuthRequest copy(AuthCredentials p0,AuthRequestConfiguration p1){
       co5.o(p0, "credentials");
       co5.o(p1, "configuration");
       return new AuthRequest(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthRequest) {
          return false;
       }
       if (!co5.c(this.credentials, p0.credentials)) {
          return false;
       }
       if (!co5.c(this.configuration, p0.configuration)) {
          return false;
       }
       return true;
    }
    public final AuthRequestConfiguration getConfiguration(){
       return this.configuration;
    }
    public final AuthCredentials getCredentials(){
       return this.credentials;
    }
    public int hashCode(){
       return (this.configuration.hashCode() + (this.credentials.hashCode() * 31));
    }
    public String toString(){
       return "AuthRequest\(credentials="+this.credentials+", configuration="+this.configuration+')';
    }
}
