package com.spotify.login.signupapi.services.model.TermsData;
import java.lang.Boolean;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.co5;
import p.k73;
import java.lang.String;
import java.lang.StringBuilder;

public final class TermsData	// class@0009c9 from classes.dex
{
    private final Boolean collectPersonalInformation;
    private final Boolean emailConsent;
    private final boolean iAgree;
    private final Boolean pushConsent;
    private final Boolean thirdPartyDataProvision;

    public void TermsData(boolean p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4){
       super();
       this.iAgree = p0;
       this.collectPersonalInformation = p1;
       this.thirdPartyDataProvision = p2;
       this.emailConsent = p3;
       this.pushConsent = p4;
    }
    public void TermsData(boolean p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4,int p5,DefaultConstructorMarker p6){
       Boolean uBoolean = ((p5 & 0x02))? null: p1;
       Boolean uBoolean1 = ((p5 & 0x04))? null: p2;
       Boolean uBoolean2 = ((p5 & 0x08))? null: p3;
       Boolean uBoolean3 = ((p5 & 0x10))? null: p4;
       super(p0, uBoolean, uBoolean1, uBoolean2, uBoolean3);
       return;
    }
    public static TermsData copy$default(TermsData p0,boolean p1,Boolean p2,Boolean p3,Boolean p4,Boolean p5,int p6,Object p7){
       TermsData iAgree;
       TermsData collectPerso;
       TermsData thirdPartyDa;
       TermsData emailConsent;
       TermsData pushConsent;
       if ((p6 & 0x01)) {
          iAgree = p0.iAgree;
       }
       if ((p6 & 0x02)) {
          collectPerso = p0.collectPersonalInformation;
       }
       p7 = collectPerso;
       if ((p6 & 0x04)) {
          thirdPartyDa = p0.thirdPartyDataProvision;
       }
       TermsData termsData = thirdPartyDa;
       if ((p6 & 0x08)) {
          emailConsent = p0.emailConsent;
       }
       TermsData termsData1 = emailConsent;
       if ((p6 & 0x10)) {
          pushConsent = p0.pushConsent;
       }
       return p0.copy(iAgree, p7, termsData, termsData1, pushConsent);
    }
    public final boolean component1(){
       return this.iAgree;
    }
    public final Boolean component2(){
       return this.collectPersonalInformation;
    }
    public final Boolean component3(){
       return this.thirdPartyDataProvision;
    }
    public final Boolean component4(){
       return this.emailConsent;
    }
    public final Boolean component5(){
       return this.pushConsent;
    }
    public final TermsData copy(boolean p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4){
       TermsData v6 = new TermsData(p0, p1, p2, p3, p4);
       return v6;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TermsData) {
          return false;
       }
       if (this.iAgree != p0.iAgree) {
          return false;
       }
       if (!co5.c(this.collectPersonalInformation, p0.collectPersonalInformation)) {
          return false;
       }
       if (!co5.c(this.thirdPartyDataProvision, p0.thirdPartyDataProvision)) {
          return false;
       }
       if (!co5.c(this.emailConsent, p0.emailConsent)) {
          return false;
       }
       if (!co5.c(this.pushConsent, p0.pushConsent)) {
          return false;
       }
       return true;
    }
    public final Boolean getCollectPersonalInformation(){
       return this.collectPersonalInformation;
    }
    public final Boolean getEmailConsent(){
       return this.emailConsent;
    }
    public final boolean getIAgree(){
       return this.iAgree;
    }
    public final Boolean getPushConsent(){
       return this.pushConsent;
    }
    public final Boolean getThirdPartyDataProvision(){
       return this.thirdPartyDataProvision;
    }
    public int hashCode(){
       TermsData tiAgree;
       if ((tiAgree = this.iAgree) != null) {
          tiAgree = 1;
       }
       int i = tiAgree * 31;
       TermsData tcollectPers = this.collectPersonalInformation;
       int i1 = 0;
       int i2 = (tcollectPers == null)? 0: tcollectPers.hashCode();
       i = (i + i2) * 31;
       i2 = ((tcollectPers = this.thirdPartyDataProvision) == null)? 0: tcollectPers.hashCode();
       i = (i + i2) * 31;
       i2 = ((tcollectPers = this.emailConsent) == null)? 0: tcollectPers.hashCode();
       i = (i + i2) * 31;
       if ((tcollectPers = this.pushConsent) != null) {
          i1 = tcollectPers.hashCode();
       }
       return (i + i1);
    }
    public final void setFields(k73 p0){
       TermsData tcollectPers;
       co5.o(p0, "paramBuilder");
       p0.d("iagree", Boolean.valueOf(this.iAgree));
       if ((tcollectPers = this.collectPersonalInformation) != null) {
          p0.d("collect_personal_info", Boolean.valueOf(tcollectPers.booleanValue()));
       }
       if ((tcollectPers = this.thirdPartyDataProvision) != null) {
          p0.d("thirdpartyemail", Boolean.valueOf(tcollectPers.booleanValue()));
       }
       if ((tcollectPers = this.emailConsent) != null) {
          p0.d("send-email", Boolean.valueOf(tcollectPers.booleanValue()));
       }
       if ((tcollectPers = this.pushConsent) != null) {
          p0.d("push-notifications", Boolean.valueOf(tcollectPers.booleanValue()));
       }
       return;
    }
    public String toString(){
       return "TermsData\(iAgree="+this.iAgree+", collectPersonalInformation="+this.collectPersonalInformation+", thirdPartyDataProvision="+this.thirdPartyDataProvision+", emailConsent="+this.emailConsent+", pushConsent="+this.pushConsent+')';
    }
}
