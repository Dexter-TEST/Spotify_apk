package com.spotify.connectivity.auth.AuthResponse$SignupRequired;
import com.spotify.connectivity.auth.AuthResponse;
import com.spotify.connectivity.auth.SignupRequiredInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthResponse$SignupRequired extends AuthResponse	// class@0005e5 from classes.dex
{
    private final SignupRequiredInfo signupRequiredInfo;

    public void AuthResponse$SignupRequired(SignupRequiredInfo p0){
       co5.o(p0, "signupRequiredInfo");
       super(null);
       this.signupRequiredInfo = p0;
    }
    public static AuthResponse$SignupRequired copy$default(AuthResponse$SignupRequired p0,SignupRequiredInfo p1,int p2,Object p3){
       AuthResponse$SignupRequired signupRequir;
       if ((p2 & 0x01)) {
          signupRequir = p0.signupRequiredInfo;
       }
       return p0.copy(signupRequir);
    }
    public final SignupRequiredInfo component1(){
       return this.signupRequiredInfo;
    }
    public final AuthResponse$SignupRequired copy(SignupRequiredInfo p0){
       co5.o(p0, "signupRequiredInfo");
       return new AuthResponse$SignupRequired(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthResponse$SignupRequired) {
          return false;
       }
       if (!co5.c(this.signupRequiredInfo, p0.signupRequiredInfo)) {
          return false;
       }
       return true;
    }
    public final SignupRequiredInfo getSignupRequiredInfo(){
       return this.signupRequiredInfo;
    }
    public int hashCode(){
       return this.signupRequiredInfo.hashCode();
    }
    public String toString(){
       return "SignupRequired\(signupRequiredInfo="+this.signupRequiredInfo+')';
    }
}
