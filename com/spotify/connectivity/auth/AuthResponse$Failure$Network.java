package com.spotify.connectivity.auth.AuthResponse$Failure$Network;
import com.spotify.connectivity.auth.AuthResponse$Failure;
import com.spotify.connectivity.auth.AuthError;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthResponse$Failure$Network extends AuthResponse$Failure	// class@0005e2 from classes.dex
{
    private final AuthError error;

    public void AuthResponse$Failure$Network(AuthError p0){
       co5.o(p0, "error");
       super(null);
       this.error = p0;
    }
    public static AuthResponse$Failure$Network copy$default(AuthResponse$Failure$Network p0,AuthError p1,int p2,Object p3){
       AuthResponse$Failure$Network error;
       if ((p2 & 0x01)) {
          error = p0.error;
       }
       return p0.copy(error);
    }
    public final AuthError component1(){
       return this.error;
    }
    public final AuthResponse$Failure$Network copy(AuthError p0){
       co5.o(p0, "error");
       return new AuthResponse$Failure$Network(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthResponse$Failure$Network) {
          return false;
       }
       if (!co5.c(this.error, p0.error)) {
          return false;
       }
       return true;
    }
    public final AuthError getError(){
       return this.error;
    }
    public int hashCode(){
       return this.error.hashCode();
    }
    public String toString(){
       return "Network\(error="+this.error+')';
    }
}
