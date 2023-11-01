package com.spotify.login.signupapi.services.model.FacebookSignupResponse;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Error;
import java.lang.StringBuilder;
import p.hr7;

public final class FacebookSignupResponse	// class@0009ad from classes.dex
{
    private final String message;
    private final int statusCode;
    private final String username;

    public void FacebookSignupResponse(){
       super(0, null, null, 7, null);
    }
    public void FacebookSignupResponse(int p0,String p1,String p2){
       super();
       this.statusCode = p0;
       this.username = p1;
       this.message = p2;
    }
    public void FacebookSignupResponse(int p0,String p1,String p2,int p3,DefaultConstructorMarker p4){
       if ((p3 & 0x01)) {
          p0 = 0;
       }
       if ((p3 & 0x02)) {
          p1 = null;
       }
       if ((p3 & 0x04)) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static FacebookSignupResponse copy$default(FacebookSignupResponse p0,int p1,String p2,String p3,int p4,Object p5){
       FacebookSignupResponse statusCode;
       FacebookSignupResponse username;
       FacebookSignupResponse message;
       if ((p4 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p4 & 0x02)) {
          username = p0.username;
       }
       if ((p4 & 0x04)) {
          message = p0.message;
       }
       return p0.copy(statusCode, username, message);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final String component2(){
       return this.username;
    }
    public final String component3(){
       return this.message;
    }
    public final FacebookSignupResponse copy(int p0,String p1,String p2){
       return new FacebookSignupResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FacebookSignupResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
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
    public final FacebookSignupResponse$Status getStatus(){
       FacebookSignupResponse tstatusCode;
       FacebookSignupResponse tusername;
       FacebookSignupResponse$Status$Ok status$Ok;
       if ((tstatusCode = this.statusCode) == 1) {
          if ((tusername = this.username) == null) {
             tusername = "";
          }
          status$Ok = new FacebookSignupResponse$Status$Ok(tusername);
       }else {
          status$Ok = new FacebookSignupResponse$Status$Error(tstatusCode, this.message);
       }
       return status$Ok;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       int i = this.statusCode * 31;
       FacebookSignupResponse tusername = this.username;
       int i1 = 0;
       int i2 = (tusername == null)? 0: tusername.hashCode();
       i = (i + i2) * 31;
       if ((tusername = this.message) != null) {
          i1 = tusername.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return hr7.a("FacebookSignupResponse\(statusCode="+this.statusCode+", username="+this.username+", message=", this.message, ')');
    }
}
