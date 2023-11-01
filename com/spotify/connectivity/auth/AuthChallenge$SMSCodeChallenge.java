package com.spotify.connectivity.auth.AuthChallenge$SMSCodeChallenge;
import com.spotify.connectivity.auth.AuthChallenge;
import java.lang.String;
import java.util.Date;
import p.wf2;
import p.zf2;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthChallenge$SMSCodeChallenge extends AuthChallenge	// class@0005d0 from classes.dex
{
    private final wf2 abort;
    private final String canonicalPhoneNumber;
    private final int codeLength;
    private final Date expiresAt;
    private final long expiresInSeconds;
    private final zf2 proceed;
    private final wf2 resend;
    private final int retries;

    public void AuthChallenge$SMSCodeChallenge(String p0,int p1,int p2,Date p3,long p4,wf2 p5,zf2 p6,wf2 p7){
       co5.o(p0, "canonicalPhoneNumber");
       co5.o(p3, "expiresAt");
       co5.o(p5, "resend");
       co5.o(p6, "proceed");
       co5.o(p7, "abort");
       super(null);
       this.canonicalPhoneNumber = p0;
       this.codeLength = p1;
       this.retries = p2;
       this.expiresAt = p3;
       this.expiresInSeconds = p4;
       this.resend = p5;
       this.proceed = p6;
       this.abort = p7;
    }
    public static AuthChallenge$SMSCodeChallenge copy$default(AuthChallenge$SMSCodeChallenge p0,String p1,int p2,int p3,Date p4,long p5,wf2 p6,zf2 p7,wf2 p8,int p9,Object p10){
       AuthChallenge$SMSCodeChallenge sMSCodeChall = p0;
       int i = p9;
       AuthChallenge$SMSCodeChallenge canonicalPho = ((i & 0x01))? sMSCodeChall.canonicalPhoneNumber: p1;
       AuthChallenge$SMSCodeChallenge codeLength = ((i & 0x02))? sMSCodeChall.codeLength: p2;
       AuthChallenge$SMSCodeChallenge retries = ((i & 0x04))? sMSCodeChall.retries: p3;
       AuthChallenge$SMSCodeChallenge expiresAt = ((i & 0x08))? sMSCodeChall.expiresAt: p4;
       AuthChallenge$SMSCodeChallenge expiresInSec = ((i & 0x10))? sMSCodeChall.expiresInSeconds: p5;
       AuthChallenge$SMSCodeChallenge resend = ((i & 0x20))? sMSCodeChall.resend: p6;
       AuthChallenge$SMSCodeChallenge proceed = ((i & 0x40))? sMSCodeChall.proceed: p7;
       AuthChallenge$SMSCodeChallenge abort = ((i & 0x0080))? sMSCodeChall.abort: p8;
       return p0.copy(canonicalPho, codeLength, retries, expiresAt, expiresInSec, resend, proceed, abort);
    }
    public final String component1(){
       return this.canonicalPhoneNumber;
    }
    public final int component2(){
       return this.codeLength;
    }
    public final int component3(){
       return this.retries;
    }
    public final Date component4(){
       return this.expiresAt;
    }
    public final long component5(){
       return this.expiresInSeconds;
    }
    public final wf2 component6(){
       return this.resend;
    }
    public final zf2 component7(){
       return this.proceed;
    }
    public final wf2 component8(){
       return this.abort;
    }
    public final AuthChallenge$SMSCodeChallenge copy(String p0,int p1,int p2,Date p3,long p4,wf2 p5,zf2 p6,wf2 p7){
       co5.o(p0, "canonicalPhoneNumber");
       co5.o(p3, "expiresAt");
       Object obj = p5;
       co5.o(obj, "resend");
       Object obj1 = p6;
       co5.o(obj1, "proceed");
       Object obj2 = p7;
       co5.o(obj2, "abort");
       AuthChallenge$SMSCodeChallenge v0 = new AuthChallenge$SMSCodeChallenge(p0, p1, p2, p3, p4, obj, obj1, obj2);
       return v0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthChallenge$SMSCodeChallenge) {
          return false;
       }
       if (!co5.c(this.canonicalPhoneNumber, p0.canonicalPhoneNumber)) {
          return false;
       }
       if (this.codeLength != p0.codeLength) {
          return false;
       }
       if (this.retries != p0.retries) {
          return false;
       }
       if (!co5.c(this.expiresAt, p0.expiresAt)) {
          return false;
       }
       if (this.expiresInSeconds - p0.expiresInSeconds) {
          return false;
       }
       if (!co5.c(this.resend, p0.resend)) {
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
    public final String getCanonicalPhoneNumber(){
       return this.canonicalPhoneNumber;
    }
    public final int getCodeLength(){
       return this.codeLength;
    }
    public final Date getExpiresAt(){
       return this.expiresAt;
    }
    public final long getExpiresInSeconds(){
       return this.expiresInSeconds;
    }
    public final zf2 getProceed(){
       return this.proceed;
    }
    public final wf2 getResend(){
       return this.resend;
    }
    public final int getRetries(){
       return this.retries;
    }
    public int hashCode(){
       AuthChallenge$SMSCodeChallenge texpiresInSe = this.expiresInSeconds;
       return (this.abort.hashCode() + ((this.proceed.hashCode() + ((this.resend.hashCode() + ((((this.expiresAt.hashCode() + (((((this.canonicalPhoneNumber.hashCode() * 31) + this.codeLength) * 31) + this.retries) * 31)) * 31) + (int)(texpiresInSe ^ (texpiresInSe >> 32))) * 31)) * 31)) * 31));
    }
    public String toString(){
       return "SMSCodeChallenge\(canonicalPhoneNumber="+this.canonicalPhoneNumber+", codeLength="+this.codeLength+", retries="+this.retries+", expiresAt="+this.expiresAt+", expiresInSeconds="+this.expiresInSeconds+", resend="+this.resend+", proceed="+this.proceed+", abort="+this.abort+')';
    }
}
