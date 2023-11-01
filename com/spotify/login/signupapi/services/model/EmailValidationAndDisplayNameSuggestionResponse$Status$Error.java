package com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status$Error;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class EmailValidationAndDisplayNameSuggestionResponse$Status$Error extends EmailValidationAndDisplayNameSuggestionResponse$Status	// class@0009a4 from classes.dex
{
    private final Map errors;
    private final int status;

    public void EmailValidationAndDisplayNameSuggestionResponse$Status$Error(int p0,Map p1){
       co5.o(p1, "errors");
       super(null);
       this.status = p0;
       this.errors = p1;
    }
    public static EmailValidationAndDisplayNameSuggestionResponse$Status$Error copy$default(EmailValidationAndDisplayNameSuggestionResponse$Status$Error p0,int p1,Map p2,int p3,Object p4){
       EmailValidationAndDisplayNameSuggestionResponse$Status$Error status;
       EmailValidationAndDisplayNameSuggestionResponse$Status$Error errors;
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
    public final EmailValidationAndDisplayNameSuggestionResponse$Status$Error copy(int p0,Map p1){
       co5.o(p1, "errors");
       return new EmailValidationAndDisplayNameSuggestionResponse$Status$Error(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailValidationAndDisplayNameSuggestionResponse$Status$Error) {
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
