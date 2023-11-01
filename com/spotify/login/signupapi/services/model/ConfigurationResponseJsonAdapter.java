package com.spotify.login.signupapi.services.model.ConfigurationResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Boolean;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Integer;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.squareup.moshi.b;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ConfigurationResponseJsonAdapter extends JsonAdapter	// class@00099a from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter listOfCallingCodeAdapter;
    private final JsonAdapter marketingMessagesOptionAdapter;
    private final b$b options;
    private final JsonAdapter privacyPolicyAcceptanceAdapter;
    private final JsonAdapter stringAdapter;
    private final JsonAdapter termsConditionAcceptanceAdapter;

    public void ConfigurationResponseJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"can_accept_licenses_in_one_step","use_all_genders","use_other_gender","use_prefer_not_to_say_gender","pretick_eula","requires_marketing_opt_in","requires_marketing_opt_in_text","show_collect_personal_info","minimum_age","country","specific_licenses","allowed_calling_codes","terms_conditions_acceptance","privacy_policy_acceptance","spotify_marketing_messages_option","show_non_required_fields_as_optional"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"can_accept_licenses_…ired_fields_as_optional\"\)");
       i.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(Boolean.TYPE, a, "canAcceptTermsAndPrivacyPolicyTogether");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…ndPrivacyPolicyTogether\"\)");
       i.booleanAdapter = jsonAdapter;
       jsonAdapter = obj.f(Integer.TYPE, a, "minimumAge");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"minimumAge\"\)");
       i.intAdapter = jsonAdapter;
       jsonAdapter = obj.f(String.class, a, "country");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…tySet\(\),\n      \"country\"\)");
       i.stringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{CallingCode.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "allowedCallingCodes");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…), \"allowedCallingCodes\"\)");
       i.listOfCallingCodeAdapter = jsonAdapter;
       jsonAdapter = obj.f(TermsConditionAcceptance.class, a, "termsAndConditionAcceptance");
       co5.l(jsonAdapter, "moshi.adapter\(TermsCondi…sAndConditionAcceptance\"\)");
       i.termsConditionAcceptanceAdapter = jsonAdapter;
       jsonAdapter = obj.f(PrivacyPolicyAcceptance.class, a, "privacyPolicyAcceptance");
       co5.l(jsonAdapter, "moshi.adapter\(PrivacyPol…privacyPolicyAcceptance\"\)");
       i.privacyPolicyAcceptanceAdapter = jsonAdapter;
       obj = obj.f(MarketingMessagesOption.class, a, "marketingMessagesOption");
       co5.l(obj, "moshi.adapter\(MarketingM…marketingMessagesOption\"\)");
       i.marketingMessagesOptionAdapter = obj;
    }
    public ConfigurationResponse fromJson(b p0){
       TermsConditionAcceptance termsConditi;
       TermsConditionAcceptance termsConditi1;
       ConfigurationResponseJsonAdapter constructorR;
       int i2;
       ConfigurationResponseJsonAdapter uConfigurati = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       Boolean fALSE = Boolean.FALSE;
       p0.f();
       Boolean uBoolean = fALSE;
       Boolean uBoolean1 = uBoolean;
       Boolean uBoolean2 = uBoolean1;
       Boolean uBoolean3 = uBoolean2;
       Boolean uBoolean4 = uBoolean3;
       Boolean uBoolean5 = uBoolean4;
       Boolean uBoolean6 = uBoolean5;
       Boolean uBoolean7 = uBoolean6;
       Integer integer = Integer.valueOf(0);
       List list = null;
       String str = null;
       int i = 0;
       int i1 = -1;
       object oobject = null;
       object oobject1 = null;
       Boolean uBoolean8 = uBoolean7;
       while (true) {
          if (p0.T()) {
             termsConditi = i;
             switch (obj.v0(uConfigurati.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_0203 :
                   i = termsConditi;
                   break;
                 case 0:
                   if ((fALSE = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfe;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("canAcceptTermsAndPrivacyPolicyTogether", "can_accept_licenses_in_one_step", obj);
                      co5.l(obj, "unexpectedNull\(\"canAccep…ses_in_one_step\", reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   if ((uBoolean8 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfd;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("canSignupWithAllGenders", "use_all_genders", obj);
                      co5.l(obj, "unexpectedNull\(\"canSignu…use_all_genders\", reader\)");
                      throw obj;
                   }
                   break;
                 case 2:
                   if ((uBoolean = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfb;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("canSignupWithOtherGender", "use_other_gender", obj);
                      co5.l(obj, "unexpectedNull\(\"canSignu…se_other_gender\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   if ((uBoolean1 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xf7;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("canSignupWithPreferNotToSayGender", "use_prefer_not_to_say_gender", obj);
                      co5.l(obj, "unexpectedNull\(\"canSignu…t_to_say_gender\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   if ((uBoolean2 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xef;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("canImplicitlyAcceptTermsAndCondition", "pretick_eula", obj);
                      co5.l(obj, "unexpectedNull\(\"canImpli…a\",\n              reader\)");
                      throw obj;
                   }
                   break;
                 case 5:
                   if ((uBoolean3 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xdf;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("requiresMarketingOptIn", "requires_marketing_opt_in", obj);
                      co5.l(obj, "unexpectedNull\(\"requires…n\",\n              reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   if ((uBoolean4 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xbf;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("requiresMarketingOptInText", "requires_marketing_opt_in_text", obj);
                      co5.l(obj, "unexpectedNull\(\"requires…ing_opt_in_text\", reader\)");
                      throw obj;
                   }
                   break;
                 case 7:
                   if ((uBoolean5 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xff7f;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("showCollectPersonalInfo", "show_collect_personal_info", obj);
                      co5.l(obj, "unexpectedNull\(\"showColl…o\",\n              reader\)");
                      throw obj;
                   }
                   break;
                 case 8:
                   if ((integer = uConfigurati.intAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfeff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("minimumAge", "minimum_age", obj);
                      co5.l(obj, "unexpectedNull\(\"minimumA…   \"minimum_age\", reader\)");
                      throw obj;
                   }
                   break;
                 case 9:
                   if ((str = uConfigurati.stringAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfdff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("country", "country", obj);
                      co5.l(obj, "unexpectedNull\(\"country\"…       \"country\", reader\)");
                      throw obj;
                   }
                   break;
                 case 10:
                   if ((uBoolean6 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xfbff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("requiresSpecificLicenses", "specific_licenses", obj);
                      co5.l(obj, "unexpectedNull\(\"requires…ecific_licenses\", reader\)");
                      throw obj;
                   }
                   break;
                 case 11:
                   if ((list = uConfigurati.listOfCallingCodeAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xf7ff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("allowedCallingCodes", "allowed_calling_codes", obj);
                      co5.l(obj, "unexpectedNull\(\"allowedC…d_calling_codes\", reader\)");
                      throw obj;
                   }
                   break;
                 case 12:
                   if ((i = uConfigurati.termsConditionAcceptanceAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xefff;
                   }else {
                      obj = ve7.w("termsAndConditionAcceptance", "terms_conditions_acceptance", obj);
                      co5.l(obj, "unexpectedNull\(\"termsAnd…ions_acceptance\", reader\)");
                      throw obj;
                   }
                   break;
                 case 13:
                   if ((oobject = uConfigurati.privacyPolicyAcceptanceAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xdfff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("privacyPolicyAcceptance", "privacy_policy_acceptance", obj);
                      co5.l(obj, "unexpectedNull\(\"privacyP…e\",\n              reader\)");
                      throw obj;
                   }
                   break;
                 case 14:
                   if ((oobject1 = uConfigurati.marketingMessagesOptionAdapter.fromJson(obj)) != null) {
                      i1 = i1 & 0xbfff;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("marketingMessagesOption", "spotify_marketing_messages_option", obj);
                      co5.l(obj, "unexpectedNull\(\"marketin…messages_option\", reader\)");
                      throw obj;
                   }
                   break;
                 case 15:
                   if ((uBoolean7 = uConfigurati.booleanAdapter.fromJson(obj)) != null) {
                      i1 = i1 & -32769;
                      goto label_0203 ;
                   }else {
                      obj = ve7.w("showNonRequiredFieldsAsOption", "show_non_required_fields_as_optional", obj);
                      co5.l(obj, "unexpectedNull\(\"showNonR…lds_as_optional\", reader\)");
                      throw obj;
                   }
                   break;
                 default:
                   goto label_0203 ;
             }
          }else {
             termsConditi = i;
             p0.y();
             if (i1 == 0xffff0000) {
                co5.j(str, "null cannot be cast to non-null type kotlin.String");
                co5.j(list, "null cannot be cast to non-null type kotlin.collections.List<com.spotify.login.signupapi.services.model.CallingCode>");
                co5.j(termsConditi, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.TermsConditionAcceptance");
                Object obj1 = oobject;
                co5.j(obj1, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance");
                Object obj2 = oobject1;
                co5.j(obj2, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.MarketingMessagesOption");
                ConfigurationResponse obj3 = new ConfigurationResponse(fALSE.booleanValue(), uBoolean8.booleanValue(), uBoolean.booleanValue(), uBoolean1.booleanValue(), uBoolean2.booleanValue(), uBoolean3.booleanValue(), uBoolean4.booleanValue(), uBoolean5.booleanValue(), integer.intValue(), str, uBoolean6.booleanValue(), list, termsConditi, obj1, obj2, uBoolean7.booleanValue());
                return obj;
             }else {
                termsConditi1 = termsConditi;
                constructorR = uConfigurati.constructorRef;
                i2 = i1;
                i1 = 18;
                if (constructorR == null) {
                   Class[] uClassArray = new Class[i1];
                   Class tYPE = Boolean.TYPE;
                   uClassArray[0] = tYPE;
                   uClassArray[1] = tYPE;
                   uClassArray[2] = tYPE;
                   uClassArray[3] = tYPE;
                   uClassArray[4] = tYPE;
                   uClassArray[5] = tYPE;
                   uClassArray[6] = tYPE;
                   uClassArray[7] = tYPE;
                   Class tYPE1 = Integer.TYPE;
                   uClassArray[8] = tYPE1;
                   uClassArray[9] = String.class;
                   uClassArray[10] = tYPE;
                   uClassArray[11] = List.class;
                   uClassArray[12] = TermsConditionAcceptance.class;
                   uClassArray[13] = PrivacyPolicyAcceptance.class;
                   uClassArray[14] = MarketingMessagesOption.class;
                   uClassArray[15] = tYPE;
                   uClassArray[16] = tYPE1;
                   uClassArray[17] = ve7.c;
                   constructorR = ConfigurationResponse.class.getDeclaredConstructor(uClassArray);
                   uConfigurati.constructorRef = constructorR;
                   co5.l(constructorR, "ConfigurationResponse::c…his.constructorRef = it }");
                   i1 = 18;
                   break ;
                }
                break ;
             }
          }
       }
       Object[] objArray = new Object[i1];
       objArray[0] = fALSE;
       objArray[1] = uBoolean8;
       objArray[2] = uBoolean;
       objArray[3] = uBoolean1;
       objArray[4] = uBoolean2;
       objArray[5] = uBoolean3;
       objArray[6] = uBoolean4;
       objArray[7] = uBoolean5;
       objArray[8] = integer;
       objArray[9] = str;
       objArray[10] = uBoolean6;
       objArray[11] = list;
       objArray[12] = termsConditi1;
       objArray[13] = oobject;
       objArray[14] = oobject1;
       objArray[15] = uBoolean7;
       objArray[16] = Integer.valueOf(i2);
       objArray[17] = null;
       Object obj4 = constructorR.newInstance(objArray);
       co5.l(obj4, "localConstructor.newInst…torMarker */ null\n      \)");
       return obj4;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ConfigurationResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("can_accept_licenses_in_one_step");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getCanAcceptTermsAndPrivacyPolicyTogether()));
       p0.l0("use_all_genders");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getCanSignupWithAllGenders()));
       p0.l0("use_other_gender");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getCanSignupWithOtherGender()));
       p0.l0("use_prefer_not_to_say_gender");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getCanSignupWithPreferNotToSayGender()));
       p0.l0("pretick_eula");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getCanImplicitlyAcceptTermsAndCondition()));
       p0.l0("requires_marketing_opt_in");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getRequiresMarketingOptIn()));
       p0.l0("requires_marketing_opt_in_text");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getRequiresMarketingOptInText()));
       p0.l0("show_collect_personal_info");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getShowCollectPersonalInfo()));
       p0.l0("minimum_age");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getMinimumAge()));
       p0.l0("country");
       this.stringAdapter.toJson(p0, p1.getCountry());
       p0.l0("specific_licenses");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getRequiresSpecificLicenses()));
       p0.l0("allowed_calling_codes");
       this.listOfCallingCodeAdapter.toJson(p0, p1.getAllowedCallingCodes());
       p0.l0("terms_conditions_acceptance");
       this.termsConditionAcceptanceAdapter.toJson(p0, p1.getTermsAndConditionAcceptance());
       p0.l0("privacy_policy_acceptance");
       this.privacyPolicyAcceptanceAdapter.toJson(p0, p1.getPrivacyPolicyAcceptance());
       p0.l0("spotify_marketing_messages_option");
       this.marketingMessagesOptionAdapter.toJson(p0, p1.getMarketingMessagesOption());
       p0.l0("show_non_required_fields_as_optional");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.getShowNonRequiredFieldsAsOption()));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(ConfigurationResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
