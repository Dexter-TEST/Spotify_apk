package com.spotify.login.signupapi.services.model.PasswordValidationResponse;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation$Ok;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation$Error;
import p.ml1;
import java.lang.String;
import java.lang.StringBuilder;

public final class PasswordValidationResponse	// class@0009bd from classes.dex
{
    private final Map errors;
    private final int statusCode;

    public void PasswordValidationResponse(){
       super(0, null, 3, null);
    }
    public void PasswordValidationResponse(int p0,Map p1){
       super();
       this.statusCode = p0;
       this.errors = p1;
    }
    public void PasswordValidationResponse(int p0,Map p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x01)) {
          p0 = 0;
       }
       if ((p2 & 0x02)) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static PasswordValidationResponse copy$default(PasswordValidationResponse p0,int p1,Map p2,int p3,Object p4){
       PasswordValidationResponse statusCode;
       PasswordValidationResponse errors;
       if ((p3 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p3 & 0x02)) {
          errors = p0.errors;
       }
       return p0.copy(statusCode, errors);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final Map component2(){
       return this.errors;
    }
    public final PasswordValidationResponse copy(int p0,Map p1){
       return new PasswordValidationResponse(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PasswordValidationResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
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
    public final PasswordValidationResponse$PasswordValidation getStatus(){
       PasswordValidationResponse tstatusCode;
       PasswordValidationResponse$PasswordValidation$Ok iNSTANCE;
       PasswordValidationResponse terrors;
       if ((tstatusCode = this.statusCode) == 1) {
          iNSTANCE = PasswordValidationResponse$PasswordValidation$Ok.INSTANCE;
       }else if((terrors = this.errors) == null){
          terrors = ml1.a;
       }
       iNSTANCE = new PasswordValidationResponse$PasswordValidation$Error(tstatusCode, terrors);
       return iNSTANCE;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public int hashCode(){
       PasswordValidationResponse terrors;
       int i = this.statusCode * 31;
       int i1 = ((terrors = this.errors) == null)? 0: terrors.hashCode();
       return (i + i1);
    }
    public String toString(){
       return "PasswordValidationResponse\(statusCode="+this.statusCode+", errors="+this.errors+')';
    }
}
