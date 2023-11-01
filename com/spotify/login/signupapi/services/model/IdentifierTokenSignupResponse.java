package com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse;
import java.lang.String;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status;
import p.kg6;
import p.fv1;
import java.lang.Enum;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Error;
import p.ml1;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Unknown;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Ok;
import java.lang.StringBuilder;

public final class IdentifierTokenSignupResponse	// class@0009b5 from classes.dex
{
    private final Map errors;
    private final String oneTimeToken;
    private final int statusCode;
    private final String userName;

    public void IdentifierTokenSignupResponse(){
       super(0, null, null, null, 15, null);
    }
    public void IdentifierTokenSignupResponse(int p0,String p1,String p2,Map p3){
       super();
       this.statusCode = p0;
       this.userName = p1;
       this.oneTimeToken = p2;
       this.errors = p3;
    }
    public void IdentifierTokenSignupResponse(int p0,String p1,String p2,Map p3,int p4,DefaultConstructorMarker p5){
       if ((p4 & 0x01)) {
          p0 = 0;
       }
       if ((p4 & 0x02)) {
          p1 = null;
       }
       if ((p4 & 0x04)) {
          p2 = null;
       }
       if ((p4 & 0x08)) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static IdentifierTokenSignupResponse copy$default(IdentifierTokenSignupResponse p0,int p1,String p2,String p3,Map p4,int p5,Object p6){
       IdentifierTokenSignupResponse statusCode;
       IdentifierTokenSignupResponse userName;
       IdentifierTokenSignupResponse oneTimeToken;
       IdentifierTokenSignupResponse errors;
       if ((p5 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p5 & 0x02)) {
          userName = p0.userName;
       }
       if ((p5 & 0x04)) {
          oneTimeToken = p0.oneTimeToken;
       }
       if ((p5 & 0x08)) {
          errors = p0.errors;
       }
       return p0.copy(statusCode, userName, oneTimeToken, errors);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final String component2(){
       return this.userName;
    }
    public final String component3(){
       return this.oneTimeToken;
    }
    public final Map component4(){
       return this.errors;
    }
    public final IdentifierTokenSignupResponse copy(int p0,String p1,String p2,Map p3){
       return new IdentifierTokenSignupResponse(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof IdentifierTokenSignupResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       if (!co5.c(this.userName, p0.userName)) {
          return false;
       }
       if (!co5.c(this.oneTimeToken, p0.oneTimeToken)) {
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
    public final String getOneTimeToken(){
       return this.oneTimeToken;
    }
    public final IdentifierTokenSignupResponse$Status getStatus(){
       int i;
       IdentifierTokenSignupResponse terrors;
       IdentifierTokenSignupResponse$Status$Error status$Error;
       IdentifierTokenSignupResponse toneTimeToke;
       kg6 okg6 = fv1.v(this.statusCode);
       if (i = okg6.ordinal()) {
          if (i != 1) {
             if ((terrors = this.errors) == null) {
                terrors = ml1.a;
             }
             status$Error = new IdentifierTokenSignupResponse$Status$Error(okg6, terrors);
          }else {
             status$Error = IdentifierTokenSignupResponse$Status$Unknown.INSTANCE;
          }
       }else {
          IdentifierTokenSignupResponse tuserName = this.userName;
          String str = "";
          if (tuserName == null) {
             tuserName = str;
          }
          if ((toneTimeToke = this.oneTimeToken) != null) {
             str = toneTimeToke;
          }
          status$Error = new IdentifierTokenSignupResponse$Status$Ok(tuserName, str);
       }
       return status$Error;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public final String getUserName(){
       return this.userName;
    }
    public int hashCode(){
       int i = this.statusCode * 31;
       IdentifierTokenSignupResponse tuserName = this.userName;
       int i1 = 0;
       int i2 = (tuserName == null)? 0: tuserName.hashCode();
       i = (i + i2) * 31;
       i2 = ((tuserName = this.oneTimeToken) == null)? 0: tuserName.hashCode();
       i = (i + i2) * 31;
       if ((tuserName = this.errors) != null) {
          i1 = tuserName.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return "IdentifierTokenSignupResponse\(statusCode="+this.statusCode+", userName="+this.userName+", oneTimeToken="+this.oneTimeToken+", errors="+this.errors+')';
    }
}
