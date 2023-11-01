package com.spotify.login.signupapi.services.model.ReferralData$Builder;
import com.spotify.login.signupapi.services.model.ReferralData;
import java.lang.Object;
import java.lang.String;

public final class ReferralData$Builder	// class@0009c2 from classes.dex
{
    private String mobileProductTest;
    private String partnerId;
    private String referralCode;

    public void ReferralData$Builder(ReferralData p0){
       super();
       String str = null;
       String partnerId = (p0 != null)? p0.getPartnerId(): str;
       this.partnerId = partnerId;
       partnerId = (p0 != null)? p0.getReferralCode(): str;
       this.referralCode = partnerId;
       if (p0 != null) {
          str = p0.getMobileProductTest();
       }
       this.mobileProductTest = str;
       return;
    }
    public final ReferralData build(){
       return new ReferralData(this.partnerId, this.referralCode, this.mobileProductTest);
    }
    public final ReferralData$Builder mobileProductTest(String p0){
       this.mobileProductTest = p0;
       return this;
    }
    public final ReferralData$Builder partnerId(String p0){
       this.partnerId = p0;
       return this;
    }
    public final ReferralData$Builder referralCode(String p0){
       this.referralCode = p0;
       return this;
    }
}
