package com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import java.lang.String;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse$Status$Error;
import p.ml1;
import java.lang.StringBuilder;

public final class EmailValidationAndDisplayNameSuggestionResponse	// class@0009a7 from classes.dex
{
    private final String displayNameSuggestion;
    private final Map errors;
    private final int statusCode;

    public void EmailValidationAndDisplayNameSuggestionResponse(){
       super(0, null, null, 7, null);
    }
    public void EmailValidationAndDisplayNameSuggestionResponse(int p0,String p1,Map p2){
       super();
       this.statusCode = p0;
       this.displayNameSuggestion = p1;
       this.errors = p2;
    }
    public void EmailValidationAndDisplayNameSuggestionResponse(int p0,String p1,Map p2,int p3,DefaultConstructorMarker p4){
       if ((p3 & 0x01)) {
          p0 = 0;
       }
       if ((p3 & 0x02)) {
          p1 = null;
       }
       if ((p3 & 0x04)) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static EmailValidationAndDisplayNameSuggestionResponse copy$default(EmailValidationAndDisplayNameSuggestionResponse p0,int p1,String p2,Map p3,int p4,Object p5){
       EmailValidationAndDisplayNameSuggestionResponse statusCode;
       EmailValidationAndDisplayNameSuggestionResponse displayNameS;
       EmailValidationAndDisplayNameSuggestionResponse errors;
       if ((p4 & 0x01)) {
          statusCode = p0.statusCode;
       }
       if ((p4 & 0x02)) {
          displayNameS = p0.displayNameSuggestion;
       }
       if ((p4 & 0x04)) {
          errors = p0.errors;
       }
       return p0.copy(statusCode, displayNameS, errors);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final String component2(){
       return this.displayNameSuggestion;
    }
    public final Map component3(){
       return this.errors;
    }
    public final EmailValidationAndDisplayNameSuggestionResponse copy(int p0,String p1,Map p2){
       return new EmailValidationAndDisplayNameSuggestionResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailValidationAndDisplayNameSuggestionResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       if (!co5.c(this.displayNameSuggestion, p0.displayNameSuggestion)) {
          return false;
       }
       if (!co5.c(this.errors, p0.errors)) {
          return false;
       }
       return true;
    }
    public final String getDisplayNameSuggestion(){
       return this.displayNameSuggestion;
    }
    public final Map getErrors(){
       return this.errors;
    }
    public final EmailValidationAndDisplayNameSuggestionResponse$Status getStatus(){
       EmailValidationAndDisplayNameSuggestionResponse tstatusCode;
       EmailValidationAndDisplayNameSuggestionResponse tdisplayName;
       EmailValidationAndDisplayNameSuggestionResponse$Status$Ok status$Ok;
       EmailValidationAndDisplayNameSuggestionResponse terrors;
       if ((tstatusCode = this.statusCode) == 1) {
          if ((tdisplayName = this.displayNameSuggestion) == null) {
             tdisplayName = "";
          }
          status$Ok = new EmailValidationAndDisplayNameSuggestionResponse$Status$Ok(tdisplayName);
       }else if((terrors = this.errors) == null){
          terrors = ml1.a;
       }
       status$Ok = new EmailValidationAndDisplayNameSuggestionResponse$Status$Error(tstatusCode, terrors);
       return status$Ok;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public int hashCode(){
       int i = this.statusCode * 31;
       EmailValidationAndDisplayNameSuggestionResponse tdisplayName = this.displayNameSuggestion;
       int i1 = 0;
       int i2 = (tdisplayName == null)? 0: tdisplayName.hashCode();
       i = (i + i2) * 31;
       if ((tdisplayName = this.errors) != null) {
          i1 = tdisplayName.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return "EmailValidationAndDisplayNameSuggestionResponse\(statusCode="+this.statusCode+", displayNameSuggestion="+this.displayNameSuggestion+", errors="+this.errors+')';
    }
}
