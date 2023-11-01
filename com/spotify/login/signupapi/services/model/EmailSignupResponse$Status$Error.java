package com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Error;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status;
import p.kg6;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class EmailSignupResponse$Status$Error extends EmailSignupResponse$Status	// class@00099d from classes.dex
{
    private final Map errors;
    private final kg6 status;

    public void EmailSignupResponse$Status$Error(kg6 p0,Map p1){
       co5.o(p0, "status");
       co5.o(p1, "errors");
       super(null);
       this.status = p0;
       this.errors = p1;
    }
    public static EmailSignupResponse$Status$Error copy$default(EmailSignupResponse$Status$Error p0,kg6 p1,Map p2,int p3,Object p4){
       EmailSignupResponse$Status$Error status;
       EmailSignupResponse$Status$Error errors;
       if ((p3 & 0x01)) {
          status = p0.status;
       }
       if ((p3 & 0x02)) {
          errors = p0.errors;
       }
       return p0.copy(status, errors);
    }
    public final kg6 component1(){
       return this.status;
    }
    public final Map component2(){
       return this.errors;
    }
    public final EmailSignupResponse$Status$Error copy(kg6 p0,Map p1){
       co5.o(p0, "status");
       co5.o(p1, "errors");
       return new EmailSignupResponse$Status$Error(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailSignupResponse$Status$Error) {
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
    public final kg6 getStatus(){
       return this.status;
    }
    public int hashCode(){
       return (this.errors.hashCode() + (this.status.hashCode() * 31));
    }
    public String toString(){
       return "Error\(status="+this.status+", errors="+this.errors+')';
    }
}
