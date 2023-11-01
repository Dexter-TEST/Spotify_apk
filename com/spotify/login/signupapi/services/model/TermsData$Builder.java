package com.spotify.login.signupapi.services.model.TermsData$Builder;
import com.spotify.login.signupapi.services.model.TermsData;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Boolean;

public final class TermsData$Builder	// class@0009c8 from classes.dex
{
    private Boolean collectPersonalInformation;
    private Boolean emailConsent;
    private boolean iAgree;
    private Boolean pushConsent;
    private Boolean thirdPartyDataProvision;

    public void TermsData$Builder(TermsData p0){
       co5.o(p0, "origin");
       super();
       this.iAgree = p0.getIAgree();
       this.collectPersonalInformation = p0.getCollectPersonalInformation();
       this.thirdPartyDataProvision = p0.getThirdPartyDataProvision();
       this.emailConsent = p0.getEmailConsent();
       this.pushConsent = p0.getPushConsent();
    }
    public final TermsData build(){
       TermsData v6 = new TermsData(this.iAgree, this.collectPersonalInformation, this.thirdPartyDataProvision, this.emailConsent, this.pushConsent);
       return v6;
    }
    public final TermsData$Builder collectPersonalInformation(Boolean p0){
       this.collectPersonalInformation = p0;
       return this;
    }
    public final TermsData$Builder emailConsent(Boolean p0){
       this.emailConsent = p0;
       return this;
    }
    public final TermsData$Builder iAgree(boolean p0){
       this.iAgree = p0;
       return this;
    }
    public final TermsData$Builder pushConsent(Boolean p0){
       this.pushConsent = p0;
       return this;
    }
    public final TermsData$Builder thirdPartyDataProvision(Boolean p0){
       this.thirdPartyDataProvision = p0;
       return this;
    }
}
