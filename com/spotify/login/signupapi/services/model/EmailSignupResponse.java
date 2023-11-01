package com.spotify.login.signupapi.services.model.EmailSignupResponse;
import java.lang.String;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status;
import p.kg6;
import p.fv1;
import java.lang.Enum;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Error;
import p.ml1;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Unknown;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Ok;
import java.lang.StringBuilder;

public final class EmailSignupResponse	// class@0009a2 from classes.dex
{
    private final Map errors;
    private final int statusCode;
    private final String username;

    public void EmailSignupResponse(){
       super(0, null, null, 7, null);
    }
    public void EmailSignupResponse(int p0,String p1,Map p2){
       super();
       this.statusCode = p0;
       this.username = p1;
       this.errors = p2;
    }
    public void EmailSignupResponse(int p0,String p1,Map p2,int p3,DefaultConstructorMarker p4){
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
    public static EmailSignupResponse copy$default(EmailSignupResponse p0,int p1,String p2,Map p3,int p4,Object p5){
       EmailSignupResponse statusCode;
       EmailSignupResponse username;
       EmailSignupResponse errors;
       if ((p4 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p4 & 0x02)) {
          username = p0.username;
       }
       if ((p4 & 0x04)) {
          errors = p0.errors;
       }
       return p0.copy(statusCode, username, errors);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final String component2(){
       return this.username;
    }
    public final Map component3(){
       return this.errors;
    }
    public final EmailSignupResponse copy(int p0,String p1,Map p2){
       return new EmailSignupResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailSignupResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.errors, p0.errors)) {
          return false;
       }
       return true;
    }
    public final Map getErrors(){
       return this.errors;
    }
    public final EmailSignupResponse$Status getStatus(){
       int i;
       EmailSignupResponse terrors;
       EmailSignupResponse$Status$Error status$Error;
       EmailSignupResponse tusername;
       kg6 okg6 = fv1.v(this.statusCode);
       if (i = okg6.ordinal()) {
          if (i != 1) {
             if ((terrors = this.errors) == null) {
                terrors = ml1.a;
             }
             status$Error = new EmailSignupResponse$Status$Error(okg6, terrors);
          }else {
             status$Error = EmailSignupResponse$Status$Unknown.INSTANCE;
          }
       }else if((tusername = this.username) == null){
          tusername = "";
       }
       status$Error = new EmailSignupResponse$Status$Ok(tusername);
       return status$Error;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       int i = this.statusCode * 31;
       EmailSignupResponse tusername = this.username;
       int i1 = 0;
       int i2 = (tusername == null)? 0: tusername.hashCode();
       i = (i + i2) * 31;
       if ((tusername = this.errors) != null) {
          i1 = tusername.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return "EmailSignupResponse\(statusCode="+this.statusCode+", username="+this.username+", errors="+this.errors+')';
    }
}
