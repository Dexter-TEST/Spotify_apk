package com.spotify.connectivity.auth.AuthResponse$Failure$UnexpectedError;
import com.spotify.connectivity.auth.AuthResponse$Failure;
import com.spotify.connectivity.auth.AuthError;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthResponse$Failure$UnexpectedError extends AuthResponse$Failure	// class@0005e3 from classes.dex
{
    private final AuthError error;

    public void AuthResponse$Failure$UnexpectedError(AuthError p0){
       co5.o(p0, "error");
       super(null);
       this.error = p0;
    }
    public static AuthResponse$Failure$UnexpectedError copy$default(AuthResponse$Failure$UnexpectedError p0,AuthError p1,int p2,Object p3){
       AuthResponse$Failure$UnexpectedError error;
       if ((p2 & 0x01)) {
          error = p0.error;
       }
       return p0.copy(error);
    }
    public final AuthError component1(){
       return this.error;
    }
    public final AuthResponse$Failure$UnexpectedError copy(AuthError p0){
       co5.o(p0, "error");
       return new AuthResponse$Failure$UnexpectedError(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthResponse$Failure$UnexpectedError) {
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
       return "UnexpectedError\(error="+this.error+')';
    }
}
