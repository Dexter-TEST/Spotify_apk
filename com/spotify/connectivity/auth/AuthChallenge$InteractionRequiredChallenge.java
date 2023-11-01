package com.spotify.connectivity.auth.AuthChallenge$InteractionRequiredChallenge;
import com.spotify.connectivity.auth.AuthChallenge;
import java.lang.String;
import p.ng2;
import p.wf2;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthChallenge$InteractionRequiredChallenge extends AuthChallenge	// class@0005cf from classes.dex
{
    private final wf2 abort;
    private final String interactionUrl;
    private final ng2 proceed;

    public void AuthChallenge$InteractionRequiredChallenge(String p0,ng2 p1,wf2 p2){
       co5.o(p0, "interactionUrl");
       co5.o(p1, "proceed");
       co5.o(p2, "abort");
       super(null);
       this.interactionUrl = p0;
       this.proceed = p1;
       this.abort = p2;
    }
    public static AuthChallenge$InteractionRequiredChallenge copy$default(AuthChallenge$InteractionRequiredChallenge p0,String p1,ng2 p2,wf2 p3,int p4,Object p5){
       AuthChallenge$InteractionRequiredChallenge interactionU;
       AuthChallenge$InteractionRequiredChallenge proceed;
       AuthChallenge$InteractionRequiredChallenge abort;
       if ((p4 & 0x01)) {
          interactionU = p0.interactionUrl;
       }
       if ((p4 & 0x02)) {
          proceed = p0.proceed;
       }
       if ((p4 & 0x04)) {
          abort = p0.abort;
       }
       return p0.copy(interactionU, proceed, abort);
    }
    public final String component1(){
       return this.interactionUrl;
    }
    public final ng2 component2(){
       return this.proceed;
    }
    public final wf2 component3(){
       return this.abort;
    }
    public final AuthChallenge$InteractionRequiredChallenge copy(String p0,ng2 p1,wf2 p2){
       co5.o(p0, "interactionUrl");
       co5.o(p1, "proceed");
       co5.o(p2, "abort");
       return new AuthChallenge$InteractionRequiredChallenge(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthChallenge$InteractionRequiredChallenge) {
          return false;
       }
       if (!co5.c(this.interactionUrl, p0.interactionUrl)) {
          return false;
       }
       if (!co5.c(this.proceed, p0.proceed)) {
          return false;
       }
       if (!co5.c(this.abort, p0.abort)) {
          return false;
       }
       return true;
    }
    public final wf2 getAbort(){
       return this.abort;
    }
    public final String getInteractionUrl(){
       return this.interactionUrl;
    }
    public final ng2 getProceed(){
       return this.proceed;
    }
    public int hashCode(){
       return (this.abort.hashCode() + ((this.proceed.hashCode() + (this.interactionUrl.hashCode() * 31)) * 31));
    }
    public String toString(){
       return "InteractionRequiredChallenge\(interactionUrl="+this.interactionUrl+", proceed="+this.proceed+", abort="+this.abort+')';
    }
}
