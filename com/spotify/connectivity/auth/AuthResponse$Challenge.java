package com.spotify.connectivity.auth.AuthResponse$Challenge;
import com.spotify.connectivity.auth.AuthResponse;
import com.spotify.connectivity.auth.AuthChallenge;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthResponse$Challenge extends AuthResponse	// class@0005df from classes.dex
{
    private final AuthChallenge authChallenge;

    public void AuthResponse$Challenge(AuthChallenge p0){
       co5.o(p0, "authChallenge");
       super(null);
       this.authChallenge = p0;
    }
    public static AuthResponse$Challenge copy$default(AuthResponse$Challenge p0,AuthChallenge p1,int p2,Object p3){
       AuthResponse$Challenge authChalleng;
       if ((p2 & 0x01)) {
          authChalleng = p0.authChallenge;
       }
       return p0.copy(authChalleng);
    }
    public final AuthChallenge component1(){
       return this.authChallenge;
    }
    public final AuthResponse$Challenge copy(AuthChallenge p0){
       co5.o(p0, "authChallenge");
       return new AuthResponse$Challenge(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthResponse$Challenge) {
          return false;
       }
       if (!co5.c(this.authChallenge, p0.authChallenge)) {
          return false;
       }
       return true;
    }
    public final AuthChallenge getAuthChallenge(){
       return this.authChallenge;
    }
    public int hashCode(){
       return this.authChallenge.hashCode();
    }
    public String toString(){
       return "Challenge\(authChallenge="+this.authChallenge+')';
    }
}
