package com.spotify.connectivity.sessionstate.$AutoValue_SessionState;
import com.spotify.connectivity.sessionstate.SessionState;
import java.lang.String;
import com.spotify.connectivity.sessionstate.PaymentState;
import java.lang.NullPointerException;
import java.lang.Object;
import com.spotify.connectivity.sessionstate.SessionState$Builder;
import com.spotify.connectivity.sessionstate.$AutoValue_SessionState$Builder;
import com.spotify.connectivity.sessionstate.$AutoValue_SessionState$1;
import java.lang.StringBuilder;
import p.en6;

abstract class $AutoValue_SessionState extends SessionState	// class@000826 from classes.dex
{
    private final boolean canStream;
    private final boolean connected;
    private final String countryCode;
    private final int currentAccountType;
    private final String currentUser;
    private final boolean loggedIn;
    private final boolean loggingIn;
    private final boolean loggingOut;
    private final PaymentState paymentState;
    private final String productType;

    public void $AutoValue_SessionState(String p0,boolean p1,boolean p2,boolean p3,int p4,String p5,boolean p6,boolean p7,PaymentState p8,String p9){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null currentUser");
       }
       this.currentUser = p0;
       this.loggedIn = p1;
       this.loggingIn = p2;
       this.loggingOut = p3;
       this.currentAccountType = p4;
       if (p5 == null) {
          throw new NullPointerException("Null countryCode");
       }
       this.countryCode = p5;
       this.connected = p6;
       this.canStream = p7;
       if (p8 == null) {
          throw new NullPointerException("Null paymentState");
       }
       this.paymentState = p8;
       if (p9 == null) {
          throw new NullPointerException("Null productType");
       }
       this.productType = p9;
       return;
    }
    public boolean canStream(){
       return this.canStream;
    }
    public boolean connected(){
       return this.connected;
    }
    public String countryCode(){
       return this.countryCode;
    }
    public int currentAccountType(){
       return this.currentAccountType;
    }
    public String currentUser(){
       return this.currentUser;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof SessionState) {
          return false;
       }
       if (!this.currentUser.equals(p0.currentUser()) || (this.loggedIn != p0.loggedIn() || (this.loggingIn != p0.loggingIn() || (this.loggingOut != p0.loggingOut() || (this.currentAccountType != p0.currentAccountType() || (!this.countryCode.equals(p0.countryCode()) || (this.connected != p0.connected() || (this.canStream != p0.canStream() || (!this.paymentState.equals(p0.paymentState()) || !this.productType.equals(p0.productType())))))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       int i = 0xf4243;
       int i1 = (this.currentUser.hashCode() ^ i) * i;
       int i2 = 1231;
       int i3 = (this.loggedIn != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.loggingIn != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.loggingOut != null)? 1231: 1237;
       i1 = (((((i1 ^ i3) * i) ^ this.currentAccountType) * i) ^ this.countryCode.hashCode()) * i;
       i3 = (this.connected != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.canStream == null) {
          i2 = 1237;
       }
       return (((((i1 ^ i2) * i) ^ this.paymentState.hashCode()) * i) ^ this.productType.hashCode());
    }
    public boolean loggedIn(){
       return this.loggedIn;
    }
    public boolean loggingIn(){
       return this.loggingIn;
    }
    public boolean loggingOut(){
       return this.loggingOut;
    }
    public PaymentState paymentState(){
       return this.paymentState;
    }
    public String productType(){
       return this.productType;
    }
    public SessionState$Builder toBuilder(){
       return new $AutoValue_SessionState$Builder(this, null);
    }
    public String toString(){
       return en6.p("SessionState{currentUser="+this.currentUser+", loggedIn="+this.loggedIn+", loggingIn="+this.loggingIn+", loggingOut="+this.loggingOut+", currentAccountType="+this.currentAccountType+", countryCode="+this.countryCode+", connected="+this.connected+", canStream="+this.canStream+", paymentState="+this.paymentState+", productType=", this.productType, "}");
    }
}
