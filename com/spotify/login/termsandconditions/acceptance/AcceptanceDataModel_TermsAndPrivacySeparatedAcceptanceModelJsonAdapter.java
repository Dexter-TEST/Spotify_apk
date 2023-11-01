package com.spotify.login.termsandconditions.acceptance.AcceptanceDataModel_TermsAndPrivacySeparatedAcceptanceModelJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import p.x2;
import java.lang.reflect.Type;
import java.util.Set;
import p.w2;
import p.v2;
import p.u2;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.login.termsandconditions.acceptance.AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel;
import p.hf3;
import p.ve7;
import p.tp2;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class AcceptanceDataModel_TermsAndPrivacySeparatedAcceptanceModelJsonAdapter extends JsonAdapter	// class@0009cd from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private Constructor constructorRef;
    private final JsonAdapter contentSharingTypeAdapter;
    private final JsonAdapter marketingMessageTypeAdapter;
    private final b$b options;
    private final JsonAdapter privacyPolicyTypeAdapter;
    private final JsonAdapter termsTypeAdapter;

    public void AcceptanceDataModel_TermsAndPrivacySeparatedAcceptanceModelJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"termsType","privacyPolicyType","marketingMessageType","contentSharingType","showOptionalBadge"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"termsType\", \"privacy…pe\", \"showOptionalBadge\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(x2.class, a, "termsType");
       co5.l(jsonAdapter, "moshi.adapter\(Acceptance… emptySet\(\), \"termsType\"\)");
       this.termsTypeAdapter = jsonAdapter;
       jsonAdapter = p0.f(w2.class, a, "privacyPolicyType");
       co5.l(jsonAdapter, "moshi.adapter\(Acceptance…     \"privacyPolicyType\"\)");
       this.privacyPolicyTypeAdapter = jsonAdapter;
       jsonAdapter = p0.f(v2.class, a, "marketingMessageType");
       co5.l(jsonAdapter, "moshi.adapter\(Acceptance…  \"marketingMessageType\"\)");
       this.marketingMessageTypeAdapter = jsonAdapter;
       jsonAdapter = p0.f(u2.class, a, "contentSharingType");
       co5.l(jsonAdapter, "moshi.adapter\(Acceptance…    \"contentSharingType\"\)");
       this.contentSharingTypeAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "showOptionalBadge");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…     \"showOptionalBadge\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel fromJson(b p0){
       int i3;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       int i = -1;
       int i1 = -1;
       while (true) {
          int i2 = 4;
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i) {
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         if (i3 != 3) {
                            if (i3 != i2) {
                               continue ;
                            }else if(this.booleanAdapter.fromJson(p0) != null){
                               i1 = i1 & 0xef;
                            }else {
                               ohf3 = ve7.w("showOptionalBadge", "showOptionalBadge", p0);
                               co5.l(ohf3, "unexpectedNull\(\"showOpti…owOptionalBadge\", reader\)");
                               throw ohf3;
                            }
                         }else {
                            tp2.v(this.contentSharingTypeAdapter.fromJson(p0));
                            ohf3 = ve7.w("contentSharingType", "contentSharingType", p0);
                            co5.l(ohf3, "unexpectedNull\(\"contentS…tentSharingType\", reader\)");
                            throw ohf3;
                         }
                      }else {
                         tp2.v(this.marketingMessageTypeAdapter.fromJson(p0));
                         ohf3 = ve7.w("marketingMessageType", "marketingMessageType", p0);
                         co5.l(ohf3, "unexpectedNull\(\"marketin…tingMessageType\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      tp2.v(this.privacyPolicyTypeAdapter.fromJson(p0));
                      ohf3 = ve7.w("privacyPolicyType", "privacyPolicyType", p0);
                      co5.l(ohf3, "unexpectedNull\(\"privacyP…ivacyPolicyType\", reader\)");
                      throw ohf3;
                   }
                }else {
                   tp2.v(this.termsTypeAdapter.fromJson(p0));
                   ohf3 = ve7.w("termsType", "termsType", p0);
                   co5.l(ohf3, "unexpectedNull\(\"termsTyp…     \"termsType\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (i1 != -17) {
                if (this.constructorRef == null) {
                   Class[] uClassArray = new Class[]{x2.class,w2.class,v2.class,u2.class,Boolean.TYPE,Integer.TYPE,ve7.c};
                   Constructor declaredCons = AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.class.getDeclaredConstructor(uClassArray);
                   this.constructorRef = declaredCons;
                   co5.l(declaredCons, "AcceptanceDataModel.Term…his.constructorRef = it }");
                   break ;
                }
                break ;
             }else {
                ohf3 = ve7.o("termsType", "termsType", p0);
                co5.l(ohf3, "missingProperty\(\"termsType\", \"termsType\", reader\)");
                throw ohf3;
             }
          }
       }
       ohf3 = ve7.o("termsType", "termsType", p0);
       co5.l(ohf3, "missingProperty\(\"termsType\", \"termsType\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("termsType");
       this.termsTypeAdapter.toJson(p0, null);
       p0.l0("privacyPolicyType");
       this.privacyPolicyTypeAdapter.toJson(p0, null);
       p0.l0("marketingMessageType");
       this.marketingMessageTypeAdapter.toJson(p0, null);
       p0.l0("contentSharingType");
       this.contentSharingTypeAdapter.toJson(p0, null);
       p0.l0("showOptionalBadge");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(81, "GeneratedJsonAdapter\(AcceptanceDataModel.TermsAndPrivacySeparatedAcceptanceModel\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
