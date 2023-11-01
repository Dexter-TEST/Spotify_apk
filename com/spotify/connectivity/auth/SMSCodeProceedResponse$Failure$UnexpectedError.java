package com.spotify.connectivity.auth.SMSCodeProceedResponse$Failure$UnexpectedError;
import com.spotify.connectivity.auth.SMSCodeProceedResponse$Failure;
import com.spotify.connectivity.auth.AuthError;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class SMSCodeProceedResponse$Failure$UnexpectedError extends SMSCodeProceedResponse$Failure	// class@000607 from classes.dex
{
    private final AuthError error;

    public void SMSCodeProceedResponse$Failure$UnexpectedError(AuthError p0){
       co5.o(p0, "error");
       super(null);
       this.error = p0;
    }
    public static SMSCodeProceedResponse$Failure$UnexpectedError copy$default(SMSCodeProceedResponse$Failure$UnexpectedError p0,AuthError p1,int p2,Object p3){
       SMSCodeProceedResponse$Failure$UnexpectedError error;
       if ((p2 & 0x01)) {
          error = p0.error;
       }
       return p0.copy(error);
    }
    public final AuthError component1(){
       return this.error;
    }
    public final SMSCodeProceedResponse$Failure$UnexpectedError copy(AuthError p0){
       co5.o(p0, "error");
       return new SMSCodeProceedResponse$Failure$UnexpectedError(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SMSCodeProceedResponse$Failure$UnexpectedError) {
          return false;
       }
       if (!co5.c(this.error, p0.error)) {
          return false;
       }
       return true;
    }
    public final AuthError getError(){
       return this.error;
    }
    public int hashCode(){
       return this.error.hashCode();
    }
    public String toString(){
       return "UnexpectedError\(error="+this.error+')';
    }
}
