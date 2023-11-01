package com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation$Error;
import com.spotify.login.signupapi.services.model.PasswordValidationResponse$PasswordValidation;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class PasswordValidationResponse$PasswordValidation$Error extends PasswordValidationResponse$PasswordValidation	// class@0009ba from classes.dex
{
    private final Map errors;
    private final int status;

    public void PasswordValidationResponse$PasswordValidation$Error(int p0,Map p1){
       co5.o(p1, "errors");
       super(null);
       this.status = p0;
       this.errors = p1;
    }
    public static PasswordValidationResponse$PasswordValidation$Error copy$default(PasswordValidationResponse$PasswordValidation$Error p0,int p1,Map p2,int p3,Object p4){
       PasswordValidationResponse$PasswordValidation$Error status;
       PasswordValidationResponse$PasswordValidation$Error errors;
       if ((p3 & 0x01)) {
          status = p0.status;
       }
       if ((p3 & 0x02)) {
          errors = p0.errors;
       }
       return p0.copy(status, errors);
    }
    public final int component1(){
       return this.status;
    }
    public final Map component2(){
       return this.errors;
    }
    public final PasswordValidationResponse$PasswordValidation$Error copy(int p0,Map p1){
       co5.o(p1, "errors");
       return new PasswordValidationResponse$PasswordValidation$Error(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PasswordValidationResponse$PasswordValidation$Error) {
          return false;
       }
       if (this.status != p0.status) {
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
    public final int getStatus(){
       return this.status;
    }
    public int hashCode(){
       return (this.errors.hashCode() + (this.status * 31));
    }
    public String toString(){
       return "Error\(status="+this.status+", errors="+this.errors+')';
    }
}
