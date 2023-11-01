package com.spotify.connectivity.authtoken.TokenResult$Failure$UnexpectedError;
import com.spotify.connectivity.authtoken.TokenResult$Failure;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class TokenResult$Failure$UnexpectedError extends TokenResult$Failure	// class@000684 from classes.dex
{
    private final String message;

    public void TokenResult$Failure$UnexpectedError(String p0){
       co5.o(p0, "message");
       super(false, null);
       this.message = p0;
    }
    public static TokenResult$Failure$UnexpectedError copy$default(TokenResult$Failure$UnexpectedError p0,String p1,int p2,Object p3){
       TokenResult$Failure$UnexpectedError message;
       if ((p2 & 0x01)) {
          message = p0.message;
       }
       return p0.copy(message);
    }
    public final String component1(){
       return this.message;
    }
    public final TokenResult$Failure$UnexpectedError copy(String p0){
       co5.o(p0, "message");
       return new TokenResult$Failure$UnexpectedError(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TokenResult$Failure$UnexpectedError) {
          return false;
       }
       if (!co5.c(this.message, p0.message)) {
          return false;
       }
       return true;
    }
    public String getMessage(){
       return this.message;
    }
    public int hashCode(){
       return this.message.hashCode();
    }
    public String toString(){
       return hr7.a("UnexpectedError\(message=", this.message, ')');
    }
}
