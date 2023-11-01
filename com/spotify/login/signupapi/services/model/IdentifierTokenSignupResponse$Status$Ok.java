package com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class IdentifierTokenSignupResponse$Status$Ok extends IdentifierTokenSignupResponse$Status	// class@0009b1 from classes.dex
{
    private final String oneTimeToken;
    private final String username;

    public void IdentifierTokenSignupResponse$Status$Ok(String p0,String p1){
       co5.o(p0, "username");
       co5.o(p1, "oneTimeToken");
       super(null);
       this.username = p0;
       this.oneTimeToken = p1;
    }
    public static IdentifierTokenSignupResponse$Status$Ok copy$default(IdentifierTokenSignupResponse$Status$Ok p0,String p1,String p2,int p3,Object p4){
       IdentifierTokenSignupResponse$Status$Ok username;
       IdentifierTokenSignupResponse$Status$Ok oneTimeToken;
       if ((p3 & 0x01)) {
          username = p0.username;
       }
       if ((p3 & 0x02)) {
          oneTimeToken = p0.oneTimeToken;
       }
       return p0.copy(username, oneTimeToken);
    }
    public final String component1(){
       return this.username;
    }
    public final String component2(){
       return this.oneTimeToken;
    }
    public final IdentifierTokenSignupResponse$Status$Ok copy(String p0,String p1){
       co5.o(p0, "username");
       co5.o(p1, "oneTimeToken");
       return new IdentifierTokenSignupResponse$Status$Ok(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof IdentifierTokenSignupResponse$Status$Ok) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.oneTimeToken, p0.oneTimeToken)) {
          return false;
       }
       return true;
    }
    public final String getOneTimeToken(){
       return this.oneTimeToken;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       return (this.oneTimeToken.hashCode() + (this.username.hashCode() * 31));
    }
    public String toString(){
       return hr7.a("Ok\(username="+this.username+", oneTimeToken=", this.oneTimeToken, ')');
    }
}
