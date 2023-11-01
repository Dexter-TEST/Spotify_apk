package com.spotify.playerlimited.player.models.LoginRequest;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class LoginRequest	// class@000b70 from classes.dex
{
    public LoginCredentials a;
    public LoginOptions b;

    public void LoginRequest(){
       super();
    }
    public static void getCredentials$annotations(){
    }
    public static void getLoginOptions$annotations(){
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof LoginRequest) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || !io2.j(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
}
