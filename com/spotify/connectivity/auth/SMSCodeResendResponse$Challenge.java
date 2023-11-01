package com.spotify.connectivity.auth.SMSCodeResendResponse$Challenge;
import com.spotify.connectivity.auth.SMSCodeResendResponse;
import com.spotify.connectivity.auth.AuthChallenge$SMSCodeChallenge;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class SMSCodeResendResponse$Challenge extends SMSCodeResendResponse	// class@00060c from classes.dex
{
    private final AuthChallenge$SMSCodeChallenge challenge;

    public void SMSCodeResendResponse$Challenge(AuthChallenge$SMSCodeChallenge p0){
       co5.o(p0, "challenge");
       super(null);
       this.challenge = p0;
    }
    public static SMSCodeResendResponse$Challenge copy$default(SMSCodeResendResponse$Challenge p0,AuthChallenge$SMSCodeChallenge p1,int p2,Object p3){
       SMSCodeResendResponse$Challenge challenge;
       if ((p2 & 0x01)) {
          challenge = p0.challenge;
       }
       return p0.copy(challenge);
    }
    public final AuthChallenge$SMSCodeChallenge component1(){
       return this.challenge;
    }
    public final SMSCodeResendResponse$Challenge copy(AuthChallenge$SMSCodeChallenge p0){
       co5.o(p0, "challenge");
       return new SMSCodeResendResponse$Challenge(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SMSCodeResendResponse$Challenge) {
          return false;
       }
       if (!co5.c(this.challenge, p0.challenge)) {
          return false;
       }
       return true;
    }
    public final AuthChallenge$SMSCodeChallenge getChallenge(){
       return this.challenge;
    }
    public int hashCode(){
       return this.challenge.hashCode();
    }
    public String toString(){
       return "Challenge\(challenge="+this.challenge+')';
    }
}
