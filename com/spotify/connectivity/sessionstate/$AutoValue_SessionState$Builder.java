package com.spotify.connectivity.sessionstate.$AutoValue_SessionState$Builder;
import com.spotify.connectivity.sessionstate.SessionState$Builder;
import com.spotify.connectivity.sessionstate.SessionState;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import com.spotify.connectivity.sessionstate.PaymentState;
import com.spotify.connectivity.sessionstate.$AutoValue_SessionState$1;
import p.kg4;
import com.spotify.connectivity.sessionstate.AutoValue_SessionState;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;

class $AutoValue_SessionState$Builder extends SessionState$Builder	// class@000825 from classes.dex
{
    private Boolean canStream;
    private Boolean connected;
    private String countryCode;
    private Integer currentAccountType;
    private String currentUser;
    private Boolean loggedIn;
    private Boolean loggingIn;
    private Boolean loggingOut;
    private PaymentState paymentState;
    private String productType;

    public void $AutoValue_SessionState$Builder(){
       super();
    }
    private void $AutoValue_SessionState$Builder(SessionState p0){
       super();
       this.currentUser = p0.currentUser();
       this.loggedIn = Boolean.valueOf(p0.loggedIn());
       this.loggingIn = Boolean.valueOf(p0.loggingIn());
       this.loggingOut = Boolean.valueOf(p0.loggingOut());
       this.currentAccountType = Integer.valueOf(p0.currentAccountType());
       this.countryCode = p0.countryCode();
       this.connected = Boolean.valueOf(p0.connected());
       this.canStream = Boolean.valueOf(p0.canStream());
       this.paymentState = p0.paymentState();
       this.productType = p0.productType();
    }
    public void $AutoValue_SessionState$Builder(SessionState p0,$AutoValue_SessionState$1 p1){
       super(p0);
    }
    public SessionState build(){
       String str = (this.currentUser == null)? " currentUser": "";
       if (this.loggedIn == null) {
          str = kg4.l(str, " loggedIn");
       }
       if (this.loggingIn == null) {
          str = kg4.l(str, " loggingIn");
       }
       if (this.loggingOut == null) {
          str = kg4.l(str, " loggingOut");
       }
       if (this.currentAccountType == null) {
          str = kg4.l(str, " currentAccountType");
       }
       if (this.countryCode == null) {
          str = kg4.l(str, " countryCode");
       }
       if (this.connected == null) {
          str = kg4.l(str, " connected");
       }
       if (this.canStream == null) {
          str = kg4.l(str, " canStream");
       }
       if (this.paymentState == null) {
          str = kg4.l(str, " paymentState");
       }
       if (this.productType == null) {
          str = kg4.l(str, " productType");
       }
       if (str.isEmpty()) {
          AutoValue_SessionState str1 = new AutoValue_SessionState(this.currentUser, this.loggedIn.booleanValue(), this.loggingIn.booleanValue(), this.loggingOut.booleanValue(), this.currentAccountType.intValue(), this.countryCode, this.connected.booleanValue(), this.canStream.booleanValue(), this.paymentState, this.productType);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public SessionState$Builder canStream(boolean p0){
       this.canStream = Boolean.valueOf(p0);
       return this;
    }
    public SessionState$Builder connected(boolean p0){
       this.connected = Boolean.valueOf(p0);
       return this;
    }
    public SessionState$Builder countryCode(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null countryCode");
       }
       this.countryCode = p0;
       return this;
    }
    public SessionState$Builder currentAccountType(int p0){
       this.currentAccountType = Integer.valueOf(p0);
       return this;
    }
    public SessionState$Builder currentUser(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null currentUser");
       }
       this.currentUser = p0;
       return this;
    }
    public SessionState$Builder loggedIn(boolean p0){
       this.loggedIn = Boolean.valueOf(p0);
       return this;
    }
    public SessionState$Builder loggingIn(boolean p0){
       this.loggingIn = Boolean.valueOf(p0);
       return this;
    }
    public SessionState$Builder loggingOut(boolean p0){
       this.loggingOut = Boolean.valueOf(p0);
       return this;
    }
    public SessionState$Builder paymentState(PaymentState p0){
       if (p0 == null) {
          throw new NullPointerException("Null paymentState");
       }
       this.paymentState = p0;
       return this;
    }
    public SessionState$Builder productType(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null productType");
       }
       this.productType = p0;
       return this;
    }
}
