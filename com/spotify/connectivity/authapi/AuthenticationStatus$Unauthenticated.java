package com.spotify.connectivity.authapi.AuthenticationStatus$Unauthenticated;
import com.spotify.connectivity.authapi.AuthenticationStatus;
import com.spotify.connectivity.authapi.AuthLogoutReason;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthenticationStatus$Unauthenticated extends AuthenticationStatus	// class@000668 from classes.dex
{
    private final AuthLogoutReason logoutReason;

    public void AuthenticationStatus$Unauthenticated(AuthLogoutReason p0){
       co5.o(p0, "logoutReason");
       super(null);
       this.logoutReason = p0;
    }
    public static AuthenticationStatus$Unauthenticated copy$default(AuthenticationStatus$Unauthenticated p0,AuthLogoutReason p1,int p2,Object p3){
       AuthenticationStatus$Unauthenticated logoutReason;
       if ((p2 & 0x01)) {
          logoutReason = p0.logoutReason;
       }
       return p0.copy(logoutReason);
    }
    public final AuthLogoutReason component1(){
       return this.logoutReason;
    }
    public final AuthenticationStatus$Unauthenticated copy(AuthLogoutReason p0){
       co5.o(p0, "logoutReason");
       return new AuthenticationStatus$Unauthenticated(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthenticationStatus$Unauthenticated) {
          return false;
       }
       if (this.logoutReason != p0.logoutReason) {
          return false;
       }
       return true;
    }
    public final AuthLogoutReason getLogoutReason(){
       return this.logoutReason;
    }
    public int hashCode(){
       return this.logoutReason.hashCode();
    }
    public String toString(){
       return "Unauthenticated\(logoutReason="+this.logoutReason+')';
    }
}
