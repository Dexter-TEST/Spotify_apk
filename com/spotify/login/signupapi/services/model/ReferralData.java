package com.spotify.login.signupapi.services.model.ReferralData;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import p.k73;
import java.lang.StringBuilder;
import p.hr7;

public final class ReferralData	// class@0009c3 from classes.dex
{
    private final String mobileProductTest;
    private final String partnerId;
    private final String referralCode;

    public void ReferralData(){
       super(null, null, null, 7, null);
    }
    public void ReferralData(String p0,String p1,String p2){
       super();
       this.partnerId = p0;
       this.referralCode = p1;
       this.mobileProductTest = p2;
    }
    public void ReferralData(String p0,String p1,String p2,int p3,DefaultConstructorMarker p4){
       if ((p3 & 0x01)) {
          p0 = null;
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
    public static ReferralData copy$default(ReferralData p0,String p1,String p2,String p3,int p4,Object p5){
       ReferralData partnerId;
       ReferralData referralCode;
       ReferralData mobileProduc;
       if ((p4 & 0x01)) {
          partnerId = p0.partnerId;
       }
       if ((p4 & 0x02)) {
          referralCode = p0.referralCode;
       }
       if ((p4 & 0x04)) {
          mobileProduc = p0.mobileProductTest;
       }
       return p0.copy(partnerId, referralCode, mobileProduc);
    }
    public final String component1(){
       return this.partnerId;
    }
    public final String component2(){
       return this.referralCode;
    }
    public final String component3(){
       return this.mobileProductTest;
    }
    public final ReferralData copy(String p0,String p1,String p2){
       return new ReferralData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ReferralData) {
          return false;
       }
       if (!co5.c(this.partnerId, p0.partnerId)) {
          return false;
       }
       if (!co5.c(this.referralCode, p0.referralCode)) {
          return false;
       }
       if (!co5.c(this.mobileProductTest, p0.mobileProductTest)) {
          return false;
       }
       return true;
    }
    public final String getMobileProductTest(){
       return this.mobileProductTest;
    }
    public final String getPartnerId(){
       return this.partnerId;
    }
    public final String getReferralCode(){
       return this.referralCode;
    }
    public int hashCode(){
       ReferralData treferralCod;
       ReferralData tpartnerId = this.partnerId;
       int i = 0;
       int i1 = (tpartnerId == null)? 0: tpartnerId.hashCode();
       i1 = i1 * 31;
       int i2 = ((treferralCod = this.referralCode) == null)? 0: treferralCod.hashCode();
       i1 = (i1 + i2) * 31;
       if ((treferralCod = this.mobileProductTest) != null) {
          i = treferralCod.hashCode();
       }
       return (i1 + i);
    }
    public final void setFields(k73 p0){
       ReferralData tpartnerId;
       co5.o(p0, "paramBuilder");
       if ((tpartnerId = this.partnerId) != null) {
          p0.d("created_by_partner", tpartnerId);
       }
       if ((tpartnerId = this.referralCode) != null) {
          p0.d("referral", tpartnerId);
       }
       if ((tpartnerId = this.mobileProductTest) != null) {
          p0.d("mobile-product-test", tpartnerId);
       }
       return;
    }
    public String toString(){
       return hr7.a("ReferralData\(partnerId="+this.partnerId+", referralCode="+this.referralCode+", mobileProductTest=", this.mobileProductTest, ')');
    }
}
