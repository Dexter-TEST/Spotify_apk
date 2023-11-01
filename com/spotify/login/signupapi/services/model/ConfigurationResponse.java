package com.spotify.login.signupapi.services.model.ConfigurationResponse;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Creator;
import java.lang.String;
import java.util.List;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.lang.Enum;

public final class ConfigurationResponse implements Parcelable	// class@000999 from classes.dex
{
    private final List allowedCallingCodes;
    private final boolean canAcceptTermsAndPrivacyPolicyTogether;
    private final boolean canImplicitlyAcceptTermsAndCondition;
    private final boolean canSignupWithAllGenders;
    private final boolean canSignupWithOtherGender;
    private final boolean canSignupWithPreferNotToSayGender;
    private final String country;
    private final MarketingMessagesOption marketingMessagesOption;
    private final int minimumAge;
    private final PrivacyPolicyAcceptance privacyPolicyAcceptance;
    private final boolean requiresMarketingOptIn;
    private final boolean requiresMarketingOptInText;
    private final boolean requiresSpecificLicenses;
    private final boolean showCollectPersonalInfo;
    private final boolean showNonRequiredFieldsAsOption;
    private final TermsConditionAcceptance termsAndConditionAcceptance;
    public static final Parcelable$Creator CREATOR;
    public static final ConfigurationResponse$Companion Companion;
    public static final int MIN_AGE;
    private static final ConfigurationResponse default;

    static {
       ConfigurationResponse.Companion = new ConfigurationResponse$Companion(null);
       ConfigurationResponse.CREATOR = new ConfigurationResponse$Creator();
       ConfigurationResponse v0 = new ConfigurationResponse(false, false, false, false, false, false, false, false, 0, null, false, null, null, null, null, false, 0xffff, null);
       ConfigurationResponse.default = v0;
    }
    public void ConfigurationResponse(){
       super(false, false, false, false, false, false, false, false, 0, null, false, null, null, null, null, false, 0xffff, null);
    }
    public void ConfigurationResponse(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,String p9,boolean p10,List p11,TermsConditionAcceptance p12,PrivacyPolicyAcceptance p13,MarketingMessagesOption p14,boolean p15){
       int i = this;
       Object obj = p9;
       Object obj1 = p11;
       Object obj2 = p12;
       Object obj3 = p13;
       Object obj4 = p14;
       co5.o(obj, "country");
       co5.o(obj1, "allowedCallingCodes");
       co5.o(obj2, "termsAndConditionAcceptance");
       co5.o(obj3, "privacyPolicyAcceptance");
       co5.o(obj4, "marketingMessagesOption");
       super();
       i.canAcceptTermsAndPrivacyPolicyTogether = p0;
       i.canSignupWithAllGenders = p1;
       i.canSignupWithOtherGender = p2;
       i.canSignupWithPreferNotToSayGender = p3;
       i.canImplicitlyAcceptTermsAndCondition = p4;
       i.requiresMarketingOptIn = p5;
       i.requiresMarketingOptInText = p6;
       i.showCollectPersonalInfo = p7;
       i.minimumAge = p8;
       i.country = obj;
       i.requiresSpecificLicenses = p10;
       i.allowedCallingCodes = obj1;
       i.termsAndConditionAcceptance = obj2;
       i.privacyPolicyAcceptance = obj3;
       i.marketingMessagesOption = obj4;
       i.showNonRequiredFieldsAsOption = p15;
    }
    public void ConfigurationResponse(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,String p9,boolean p10,List p11,TermsConditionAcceptance p12,PrivacyPolicyAcceptance p13,MarketingMessagesOption p14,boolean p15,int p16,DefaultConstructorMarker p17){
       int i = p16;
       int i1 = ((i & 0x01))? 0: p0;
       int i2 = ((i & 0x02))? 0: p1;
       int i3 = ((i & 0x04))? 0: p2;
       int i4 = ((i & 0x08))? 0: p3;
       int i5 = ((i & 0x10))? 0: p4;
       int i6 = ((i & 0x20))? 0: p5;
       int i7 = ((i & 0x40))? 0: p6;
       int i8 = ((i & 0x0080))? 0: p7;
       int i9 = ((i & 0x0100))? 13: p8;
       String str = ((i & 0x0200))? "": p9;
       int i10 = ((i & 0x0400))? 0: p10;
       ArrayList uArrayList = ((i & 0x0800))? new ArrayList(): p11;
       TermsConditionAcceptance eXPLICIT = ((i & 0x1000))? TermsConditionAcceptance.EXPLICIT: p12;
       PrivacyPolicyAcceptance eXPLICIT1 = ((i & 0x2000))? PrivacyPolicyAcceptance.EXPLICIT: p13;
       MarketingMessagesOption oPT_IN = ((i & 0x4000))? MarketingMessagesOption.OPT_IN: p14;
       i = ((i & 0x8000))? 0: p15;
       super(i1, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, uArrayList, eXPLICIT, eXPLICIT1, oPT_IN, i);
       return;
    }
    public static final ConfigurationResponse access$getDefault$cp(){
       return ConfigurationResponse.default;
    }
    public static ConfigurationResponse copy$default(ConfigurationResponse p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8,int p9,String p10,boolean p11,List p12,TermsConditionAcceptance p13,PrivacyPolicyAcceptance p14,MarketingMessagesOption p15,boolean p16,int p17,Object p18){
       int i1;
       ConfigurationResponse uConfigurati = p0;
       int i = p17;
       ConfigurationResponse canAcceptTer = ((i & 0x01))? uConfigurati.canAcceptTermsAndPrivacyPolicyTogether: p1;
       ConfigurationResponse canSignupWit = ((i & 0x02))? uConfigurati.canSignupWithAllGenders: p2;
       ConfigurationResponse canSignupWit1 = ((i & 0x04))? uConfigurati.canSignupWithOtherGender: p3;
       ConfigurationResponse canSignupWit2 = ((i & 0x08))? uConfigurati.canSignupWithPreferNotToSayGender: p4;
       ConfigurationResponse canImplicitl = ((i & 0x10))? uConfigurati.canImplicitlyAcceptTermsAndCondition: p5;
       ConfigurationResponse requiresMark = ((i & 0x20))? uConfigurati.requiresMarketingOptIn: p6;
       ConfigurationResponse requiresMark1 = ((i & 0x40))? uConfigurati.requiresMarketingOptInText: p7;
       ConfigurationResponse showCollectP = ((i & 0x0080))? uConfigurati.showCollectPersonalInfo: p8;
       ConfigurationResponse minimumAge = ((i & 0x0100))? uConfigurati.minimumAge: p9;
       ConfigurationResponse country = ((i & 0x0200))? uConfigurati.country: p10;
       ConfigurationResponse requiresSpec = ((i & 0x0400))? uConfigurati.requiresSpecificLicenses: p11;
       ConfigurationResponse allowedCalli = ((i & 0x0800))? uConfigurati.allowedCallingCodes: p12;
       ConfigurationResponse termsAndCond = ((i & 0x1000))? uConfigurati.termsAndConditionAcceptance: p13;
       ConfigurationResponse privacyPolic = ((i & 0x2000))? uConfigurati.privacyPolicyAcceptance: p14;
       ConfigurationResponse uConfigurati1 = privacyPolic;
       privacyPolic = ((i & 0x4000))? uConfigurati.marketingMessagesOption: p15;
       ConfigurationResponse showNonRequi = ((i & 0x8000))? uConfigurati.showNonRequiredFieldsAsOption: p16;
       return p0.copy(canAcceptTer, canSignupWit, canSignupWit1, canSignupWit2, canImplicitl, requiresMark, requiresMark1, showCollectP, minimumAge, country, requiresSpec, allowedCalli, termsAndCond, uConfigurati1, privacyPolic, showNonRequi);
    }
    public static void getCanImplicitlyAcceptTermsAndCondition$annotations(){
    }
    public static void getRequiresMarketingOptIn$annotations(){
    }
    public static void getRequiresSpecificLicenses$annotations(){
    }
    public final boolean component1(){
       return this.canAcceptTermsAndPrivacyPolicyTogether;
    }
    public final String component10(){
       return this.country;
    }
    public final boolean component11(){
       return this.requiresSpecificLicenses;
    }
    public final List component12(){
       return this.allowedCallingCodes;
    }
    public final TermsConditionAcceptance component13(){
       return this.termsAndConditionAcceptance;
    }
    public final PrivacyPolicyAcceptance component14(){
       return this.privacyPolicyAcceptance;
    }
    public final MarketingMessagesOption component15(){
       return this.marketingMessagesOption;
    }
    public final boolean component16(){
       return this.showNonRequiredFieldsAsOption;
    }
    public final boolean component2(){
       return this.canSignupWithAllGenders;
    }
    public final boolean component3(){
       return this.canSignupWithOtherGender;
    }
    public final boolean component4(){
       return this.canSignupWithPreferNotToSayGender;
    }
    public final boolean component5(){
       return this.canImplicitlyAcceptTermsAndCondition;
    }
    public final boolean component6(){
       return this.requiresMarketingOptIn;
    }
    public final boolean component7(){
       return this.requiresMarketingOptInText;
    }
    public final boolean component8(){
       return this.showCollectPersonalInfo;
    }
    public final int component9(){
       return this.minimumAge;
    }
    public final ConfigurationResponse copy(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,String p9,boolean p10,List p11,TermsConditionAcceptance p12,PrivacyPolicyAcceptance p13,MarketingMessagesOption p14,boolean p15){
       co5.o(p9, "country");
       co5.o(p11, "allowedCallingCodes");
       co5.o(p12, "termsAndConditionAcceptance");
       co5.o(p13, "privacyPolicyAcceptance");
       co5.o(p14, "marketingMessagesOption");
       ConfigurationResponse v17 = new ConfigurationResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       return v17;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ConfigurationResponse) {
          return false;
       }
       if (this.canAcceptTermsAndPrivacyPolicyTogether != p0.canAcceptTermsAndPrivacyPolicyTogether) {
          return false;
       }
       if (this.canSignupWithAllGenders != p0.canSignupWithAllGenders) {
          return false;
       }
       if (this.canSignupWithOtherGender != p0.canSignupWithOtherGender) {
          return false;
       }
       if (this.canSignupWithPreferNotToSayGender != p0.canSignupWithPreferNotToSayGender) {
          return false;
       }
       if (this.canImplicitlyAcceptTermsAndCondition != p0.canImplicitlyAcceptTermsAndCondition) {
          return false;
       }
       if (this.requiresMarketingOptIn != p0.requiresMarketingOptIn) {
          return false;
       }
       if (this.requiresMarketingOptInText != p0.requiresMarketingOptInText) {
          return false;
       }
       if (this.showCollectPersonalInfo != p0.showCollectPersonalInfo) {
          return false;
       }
       if (this.minimumAge != p0.minimumAge) {
          return false;
       }
       if (!co5.c(this.country, p0.country)) {
          return false;
       }
       if (this.requiresSpecificLicenses != p0.requiresSpecificLicenses) {
          return false;
       }
       if (!co5.c(this.allowedCallingCodes, p0.allowedCallingCodes)) {
          return false;
       }
       if (this.termsAndConditionAcceptance != p0.termsAndConditionAcceptance) {
          return false;
       }
       if (this.privacyPolicyAcceptance != p0.privacyPolicyAcceptance) {
          return false;
       }
       if (this.marketingMessagesOption != p0.marketingMessagesOption) {
          return false;
       }
       if (this.showNonRequiredFieldsAsOption != p0.showNonRequiredFieldsAsOption) {
          return false;
       }
       return true;
    }
    public final List getAllowedCallingCodes(){
       return this.allowedCallingCodes;
    }
    public final boolean getCanAcceptTermsAndPrivacyPolicyTogether(){
       return this.canAcceptTermsAndPrivacyPolicyTogether;
    }
    public final boolean getCanImplicitlyAcceptTermsAndCondition(){
       return this.canImplicitlyAcceptTermsAndCondition;
    }
    public final boolean getCanSignupWithAllGenders(){
       return this.canSignupWithAllGenders;
    }
    public final boolean getCanSignupWithOtherGender(){
       return this.canSignupWithOtherGender;
    }
    public final boolean getCanSignupWithPreferNotToSayGender(){
       return this.canSignupWithPreferNotToSayGender;
    }
    public final String getCountry(){
       return this.country;
    }
    public final MarketingMessagesOption getMarketingMessagesOption(){
       return this.marketingMessagesOption;
    }
    public final int getMinimumAge(){
       return this.minimumAge;
    }
    public final PrivacyPolicyAcceptance getPrivacyPolicyAcceptance(){
       return this.privacyPolicyAcceptance;
    }
    public final boolean getRequiresMarketingOptIn(){
       return this.requiresMarketingOptIn;
    }
    public final boolean getRequiresMarketingOptInText(){
       return this.requiresMarketingOptInText;
    }
    public final boolean getRequiresSpecificLicenses(){
       return this.requiresSpecificLicenses;
    }
    public final boolean getShowCollectPersonalInfo(){
       return this.showCollectPersonalInfo;
    }
    public final boolean getShowNonRequiredFieldsAsOption(){
       return this.showNonRequiredFieldsAsOption;
    }
    public final TermsConditionAcceptance getTermsAndConditionAcceptance(){
       return this.termsAndConditionAcceptance;
    }
    public int hashCode(){
       ConfigurationResponse tcanSignupWi;
       int i2;
       ConfigurationResponse tcanAcceptTe = this.canAcceptTermsAndPrivacyPolicyTogether;
       int i = 1;
       if (tcanAcceptTe != null) {
          tcanAcceptTe = 1;
       }
       int i1 = tcanAcceptTe * 31;
       if ((tcanSignupWi = this.canSignupWithAllGenders) != null) {
          tcanSignupWi = 1;
       }
       i1 = (i1 + tcanSignupWi) * 31;
       if ((tcanSignupWi = this.canSignupWithOtherGender) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tcanSignupWi = this.canSignupWithPreferNotToSayGender) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tcanSignupWi = this.canImplicitlyAcceptTermsAndCondition) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tcanSignupWi = this.requiresMarketingOptIn) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tcanSignupWi = this.requiresMarketingOptInText) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tcanSignupWi = this.showCollectPersonalInfo) != null) {
          i2 = 1;
       }
       i1 = tp2.g(this.country, ((((i1 + i2) * 31) + this.minimumAge) * 31), 31);
       if ((tcanSignupWi = this.requiresSpecificLicenses) != null) {
          i2 = 1;
       }
       i2 = (this.marketingMessagesOption.hashCode() + ((this.privacyPolicyAcceptance.hashCode() + ((this.termsAndConditionAcceptance.hashCode() + kg4.j(this.allowedCallingCodes, ((i1 + i2) * 31), 31)) * 31)) * 31)) * 31;
       if ((tcanAcceptTe = this.showNonRequiredFieldsAsOption) == null) {
          i = tcanAcceptTe;
       }
       return (i2 + i);
    }
    public String toString(){
       return kg4.p("ConfigurationResponse\(canAcceptTermsAndPrivacyPolicyTogether="+this.canAcceptTermsAndPrivacyPolicyTogether+", canSignupWithAllGenders="+this.canSignupWithAllGenders+", canSignupWithOtherGender="+this.canSignupWithOtherGender+", canSignupWithPreferNotToSayGender="+this.canSignupWithPreferNotToSayGender+", canImplicitlyAcceptTermsAndCondition="+this.canImplicitlyAcceptTermsAndCondition+", requiresMarketingOptIn="+this.requiresMarketingOptIn+", requiresMarketingOptInText="+this.requiresMarketingOptInText+", showCollectPersonalInfo="+this.showCollectPersonalInfo+", minimumAge="+this.minimumAge+", country="+this.country+", requiresSpecificLicenses="+this.requiresSpecificLicenses+", allowedCallingCodes="+this.allowedCallingCodes+", termsAndConditionAcceptance="+this.termsAndConditionAcceptance+", privacyPolicyAcceptance="+this.privacyPolicyAcceptance+", marketingMessagesOption="+this.marketingMessagesOption+", showNonRequiredFieldsAsOption=", this.showNonRequiredFieldsAsOption, ')');
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.canAcceptTermsAndPrivacyPolicyTogether);
       p0.writeInt(this.canSignupWithAllGenders);
       p0.writeInt(this.canSignupWithOtherGender);
       p0.writeInt(this.canSignupWithPreferNotToSayGender);
       p0.writeInt(this.canImplicitlyAcceptTermsAndCondition);
       p0.writeInt(this.requiresMarketingOptIn);
       p0.writeInt(this.requiresMarketingOptInText);
       p0.writeInt(this.showCollectPersonalInfo);
       p0.writeInt(this.minimumAge);
       p0.writeString(this.country);
       p0.writeInt(this.requiresSpecificLicenses);
       ConfigurationResponse tallowedCall = this.allowedCallingCodes;
       p0.writeInt(tallowedCall.size());
       Iterator iterator = tallowedCall.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       p0.writeString(this.termsAndConditionAcceptance.name());
       p0.writeString(this.privacyPolicyAcceptance.name());
       p0.writeString(this.marketingMessagesOption.name());
       p0.writeInt(this.showNonRequiredFieldsAsOption);
       return;
    }
}
