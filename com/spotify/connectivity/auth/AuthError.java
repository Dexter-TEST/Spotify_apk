package com.spotify.connectivity.auth.AuthError;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthError	// class@0005dc from classes.dex
{
    private final Integer code;
    private final String message;

    public void AuthError(Integer p0,String p1){
       super();
       this.code = p0;
       this.message = p1;
    }
    public static AuthError copy$default(AuthError p0,Integer p1,String p2,int p3,Object p4){
       AuthError code;
       AuthError message;
       if ((p3 & 0x01)) {
          code = p0.code;
       }
       if ((p3 & 0x02)) {
          message = p0.message;
       }
       return p0.copy(code, message);
    }
    public final Integer component1(){
       return this.code;
    }
    public final String component2(){
       return this.message;
    }
    public final AuthError copy(Integer p0,String p1){
       return new AuthError(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthError) {
          return false;
       }
       if (!co5.c(this.code, p0.code)) {
          return false;
       }
       if (!co5.c(this.message, p0.message)) {
          return false;
       }
       return true;
    }
    public final Integer getCode(){
       return this.code;
    }
    public final String getMessage(){
       return this.message;
    }
    public int hashCode(){
       AuthError tmessage;
       AuthError tcode = this.code;
       int i = 0;
       int i1 = (tcode == null)? 0: tcode.hashCode();
       i1 = i1 * 31;
       if ((tmessage = this.message) != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return hr7.a("AuthError\(code="+this.code+", message=", this.message, ')');
    }
}
