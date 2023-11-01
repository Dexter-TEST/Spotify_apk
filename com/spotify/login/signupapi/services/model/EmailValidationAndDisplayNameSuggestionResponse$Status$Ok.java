package com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class EmailValidationAndDisplayNameSuggestionResponse$Status$Ok extends EmailValidationAndDisplayNameSuggestionResponse$Status	// class@0009a5 from classes.dex
{
    private final String displayNameSuggestion;

    public void EmailValidationAndDisplayNameSuggestionResponse$Status$Ok(String p0){
       co5.o(p0, "displayNameSuggestion");
       super(null);
       this.displayNameSuggestion = p0;
    }
    public static EmailValidationAndDisplayNameSuggestionResponse$Status$Ok copy$default(EmailValidationAndDisplayNameSuggestionResponse$Status$Ok p0,String p1,int p2,Object p3){
       EmailValidationAndDisplayNameSuggestionResponse$Status$Ok displayNameS;
       if ((p2 & 0x01)) {
          displayNameS = p0.displayNameSuggestion;
       }
       return p0.copy(displayNameS);
    }
    public final String component1(){
       return this.displayNameSuggestion;
    }
    public final EmailValidationAndDisplayNameSuggestionResponse$Status$Ok copy(String p0){
       co5.o(p0, "displayNameSuggestion");
       return new EmailValidationAndDisplayNameSuggestionResponse$Status$Ok(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailValidationAndDisplayNameSuggestionResponse$Status$Ok) {
          return false;
       }
       if (!co5.c(this.displayNameSuggestion, p0.displayNameSuggestion)) {
          return false;
       }
       return true;
    }
    public final String getDisplayNameSuggestion(){
       return this.displayNameSuggestion;
    }
    public int hashCode(){
       return this.displayNameSuggestion.hashCode();
    }
    public String toString(){
       return hr7.a("Ok\(displayNameSuggestion=", this.displayNameSuggestion, ')');
    }
}
