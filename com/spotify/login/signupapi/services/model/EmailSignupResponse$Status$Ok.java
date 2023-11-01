package com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class EmailSignupResponse$Status$Ok extends EmailSignupResponse$Status	// class@00099e from classes.dex
{
    private final String username;

    public void EmailSignupResponse$Status$Ok(String p0){
       co5.o(p0, "username");
       super(null);
       this.username = p0;
    }
    public static EmailSignupResponse$Status$Ok copy$default(EmailSignupResponse$Status$Ok p0,String p1,int p2,Object p3){
       EmailSignupResponse$Status$Ok username;
       if ((p2 & 0x01)) {
          username = p0.username;
       }
       return p0.copy(username);
    }
    public final String component1(){
       return this.username;
    }
    public final EmailSignupResponse$Status$Ok copy(String p0){
       co5.o(p0, "username");
       return new EmailSignupResponse$Status$Ok(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailSignupResponse$Status$Ok) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       return true;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       return this.username.hashCode();
    }
    public String toString(){
       return hr7.a("Ok\(username=", this.username, ')');
    }
}
