package com.spotify.connectivity.sessionstate.PaymentState;
import android.os.Parcelable;
import com.spotify.connectivity.sessionstate.PaymentState$1;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Throwable;
import p.jl;
import java.lang.Long;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PaymentState implements Parcelable	// class@00082d from classes.dex
{
    private final String[] mSegments;
    public static final Parcelable$Creator CREATOR;
    private static final String CREDITCARD_FUNDS;
    private static final String CREDITCARD_REFUSED;
    private static final String MANAGED_GRACE_START;
    private static final String MANAGED_PROVIDER_GPB;
    private static final String OPT_IN_TRIAL;
    private static final String PAYPAL_REFUSED;

    static {
       PaymentState.CREATOR = new PaymentState$1();
    }
    private void PaymentState(Parcel p0){
       super();
       this.mSegments = p0.createStringArray();
    }
    public void PaymentState(Parcel p0,PaymentState$1 p1){
       super(p0);
    }
    public void PaymentState(String p0){
       super();
       if (p0 != null && !p0.isEmpty()) {
          this.mSegments = p0.split(";");
          this.trimSegments();
       }else {
          String[] stringArray = new String[0];
          this.mSegments = stringArray;
       }
       return;
    }
    private void trimSegments(){
       int i = 0;
       while (true) {
          PaymentState tmSegments = this.mSegments;
          if (i < tmSegments.length) {
             tmSegments[i] = tmSegments[i].trim();
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PaymentState) {
          return false;
       }
       return Arrays.equals(this.mSegments, p0.mSegments);
    }
    public int getActiveOptInTrialDurationInHours(){
       if (!this.hasActiveOptInTrial()) {
          return -1;
       }
       try{
          return Math.round(((float)Integer.parseInt(this.mSegments[1]) / 3600.00f));
       }catch(java.lang.NumberFormatException e0){
          jl.f("Caught a NumberFormatException when parsing trial length", e0);
          return v1;
       }
    }
    public long getActiveOptInTrialExpiryTimestamp(){
       if (!this.hasActiveOptInTrial()) {
          return -1;
       }
       try{
          return Long.parseLong(this.mSegments[2]);
       }catch(java.lang.NumberFormatException e0){
          jl.f("Caught a NumberFormatException when parsing trial expiry", e0);
          return v1;
       }
    }
    public int getPaymentFailureRetryNumber(){
       if (this.hasPaymentFailure()) {
          PaymentState tmSegments = this.mSegments;
          if (tmSegments.length >= 2) {
             object oobject = tmSegments[1];
             try{
                return Integer.parseInt(oobject);
             }catch(java.lang.NumberFormatException e0){
                jl.f("Failed to parse retry number of \'"+this.toString()+''', e0);
             }
          }
       }
       return -1;
    }
    public boolean hasActiveOptInTrial(){
       PaymentState tmSegments = this.mSegments;
       int i = 0;
       if (tmSegments.length == 3 && "opt-in-trial".equals(tmSegments[i])) {
          i = true;
       }
       return i;
    }
    public boolean hasCreditCardInsufficientFunds(){
       PaymentState tmSegments = this.mSegments;
       int i = 0;
       if (tmSegments.length == 2 && "creditcard_funds".equals(tmSegments[i])) {
          i = true;
       }
       return i;
    }
    public boolean hasCreditCardRefused(){
       PaymentState tmSegments = this.mSegments;
       int i = 0;
       if (tmSegments.length == 2 && "creditcard_refused".equals(tmSegments[i])) {
          i = true;
       }
       return i;
    }
    public boolean hasGooglePayFailure(){
       PaymentState tmSegments = this.mSegments;
       int i = 0;
       if (tmSegments.length == 2 && ("managed_grace_start".equals(tmSegments[i]) && "GPB".equals(this.mSegments[1]))) {
          i = true;
       }
       return i;
    }
    public boolean hasPaymentFailure(){
       boolean b = (!this.hasCreditCardInsufficientFunds() && (!this.hasCreditCardRefused() && (!this.hasPaypalRefused() && !this.hasGooglePayFailure())))? false: true;
       return b;
    }
    public boolean hasPaypalRefused(){
       PaymentState tmSegments = this.mSegments;
       int i = 0;
       if (tmSegments.length == 2 && "paypal_refused".equals(tmSegments[i])) {
          i = true;
       }
       return i;
    }
    public int hashCode(){
       return Arrays.hashCode(this.mSegments);
    }
    public String toString(){
       return TextUtils.join(";", this.mSegments);
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeStringArray(this.mSegments);
    }
}
