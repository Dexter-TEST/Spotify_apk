package com.spotify.playerlimited.player.models.LoginCredentials;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class LoginCredentials	// class@000b6c from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public void LoginCredentials(){
       super();
    }
    public static void getAuthenticationType$annotations(){
    }
    public static void getBlob$annotations(){
    }
    public static void getPassword$annotations(){
    }
    public static void getRefreshToken$annotations(){
    }
    public static void getUsername$annotations(){
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof LoginCredentials) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || (!io2.j(this.c, p0.c) || (!io2.j(this.d, p0.d) || !io2.j(this.e, p0.e))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c,this.d,this.e};
       return Arrays.hashCode(objArray);
    }
}
