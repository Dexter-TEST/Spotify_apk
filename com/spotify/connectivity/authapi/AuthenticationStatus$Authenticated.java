package com.spotify.connectivity.authapi.AuthenticationStatus$Authenticated;
import com.spotify.connectivity.authapi.AuthenticationStatus;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthenticationStatus$Authenticated extends AuthenticationStatus	// class@000666 from classes.dex
{
    private final AuthUserInfo authUserInfo;

    public void AuthenticationStatus$Authenticated(AuthUserInfo p0){
       co5.o(p0, "authUserInfo");
       super(null);
       this.authUserInfo = p0;
    }
    public static AuthenticationStatus$Authenticated copy$default(AuthenticationStatus$Authenticated p0,AuthUserInfo p1,int p2,Object p3){
       AuthenticationStatus$Authenticated authUserInfo;
       if ((p2 & 0x01)) {
          authUserInfo = p0.authUserInfo;
       }
       return p0.copy(authUserInfo);
    }
    public final AuthUserInfo component1(){
       return this.authUserInfo;
    }
    public final AuthenticationStatus$Authenticated copy(AuthUserInfo p0){
       co5.o(p0, "authUserInfo");
       return new AuthenticationStatus$Authenticated(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthenticationStatus$Authenticated) {
          return false;
       }
       if (!co5.c(this.authUserInfo, p0.authUserInfo)) {
          return false;
       }
       return true;
    }
    public final AuthUserInfo getAuthUserInfo(){
       return this.authUserInfo;
    }
    public int hashCode(){
       return this.authUserInfo.hashCode();
    }
    public String toString(){
       return "Authenticated\(authUserInfo="+this.authUserInfo+')';
    }
}
