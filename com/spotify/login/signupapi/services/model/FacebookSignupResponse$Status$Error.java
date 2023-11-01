package com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Error;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class FacebookSignupResponse$Status$Error extends FacebookSignupResponse$Status	// class@0009aa from classes.dex
{
    private final String message;
    private final int statusCode;

    public void FacebookSignupResponse$Status$Error(int p0,String p1){
       super(null);
       this.statusCode = p0;
       this.message = p1;
    }
    public static FacebookSignupResponse$Status$Error copy$default(FacebookSignupResponse$Status$Error p0,int p1,String p2,int p3,Object p4){
       FacebookSignupResponse$Status$Error statusCode;
       FacebookSignupResponse$Status$Error message;
       if ((p3 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p3 & 0x02)) {
          message = p0.message;
       }
       return p0.copy(statusCode, message);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final String component2(){
       return this.message;
    }
    public final FacebookSignupResponse$Status$Error copy(int p0,String p1){
       return new FacebookSignupResponse$Status$Error(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FacebookSignupResponse$Status$Error) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       if (!co5.c(this.message, p0.message)) {
          return false;
       }
       return true;
    }
    public final String getMessage(){
       return this.message;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public int hashCode(){
       FacebookSignupResponse$Status$Error tmessage;
       int i = this.statusCode * 31;
       int i1 = ((tmessage = this.message) == null)? 0: tmessage.hashCode();
       return (i + i1);
    }
    public String toString(){
       return hr7.a("Error\(statusCode="+this.statusCode+", message=", this.message, ')');
    }
}
