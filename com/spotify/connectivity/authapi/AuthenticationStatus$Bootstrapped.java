package com.spotify.connectivity.authapi.AuthenticationStatus$Bootstrapped;
import com.spotify.connectivity.authapi.AuthenticationStatus;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthenticationStatus$Bootstrapped extends AuthenticationStatus	// class@000667 from classes.dex
{
    private final Map productState;
    private final String username;

    public void AuthenticationStatus$Bootstrapped(Map p0,String p1){
       co5.o(p0, "productState");
       co5.o(p1, "username");
       super(null);
       this.productState = p0;
       this.username = p1;
    }
    public static AuthenticationStatus$Bootstrapped copy$default(AuthenticationStatus$Bootstrapped p0,Map p1,String p2,int p3,Object p4){
       AuthenticationStatus$Bootstrapped productState;
       AuthenticationStatus$Bootstrapped username;
       if ((p3 & 0x01)) {
          productState = p0.productState;
       }
       if ((p3 & 0x02)) {
          username = p0.username;
       }
       return p0.copy(productState, username);
    }
    public final Map component1(){
       return this.productState;
    }
    public final String component2(){
       return this.username;
    }
    public final AuthenticationStatus$Bootstrapped copy(Map p0,String p1){
       co5.o(p0, "productState");
       co5.o(p1, "username");
       return new AuthenticationStatus$Bootstrapped(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthenticationStatus$Bootstrapped) {
          return false;
       }
       if (!co5.c(this.productState, p0.productState)) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       return true;
    }
    public final Map getProductState(){
       return this.productState;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       return (this.username.hashCode() + (this.productState.hashCode() * 31));
    }
    public String toString(){
       return hr7.a("Bootstrapped\(productState="+this.productState+", username=", this.username, ')');
    }
}
