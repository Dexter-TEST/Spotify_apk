package com.spotify.login.signupapi.services.model.CallingCodeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CallingCodeJsonAdapter extends JsonAdapter	// class@000996 from classes.dex
{
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void CallingCodeJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"country_code","calling_code"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"country_code\", \"calling_code\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "countryCode");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…t\(\),\n      \"countryCode\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public CallingCode fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       do {
          String str2 = "country_code";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w("countryCode", str2, p0);
                   co5.l(ohf3, "unexpectedNull\(\"countryC…, \"country_code\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (str != null) {
                if (str1 != null) {
                   return new CallingCode(str, str1);
                }
                ohf3 = ve7.o("callingCode", "calling_code", p0);
                co5.l(ohf3, "missingProperty\(\"calling…ode\",\n            reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o("countryCode", str2, p0);
                co5.l(ohf3, "missingProperty\(\"country…ode\",\n            reader\)");
                throw ohf3;
             }
          }
       } while (i != 1 || (str1 = this.stringAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("callingCode", "calling_code", p0);
       co5.l(ohf3, "unexpectedNull\(\"callingC…, \"calling_code\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CallingCode p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("country_code");
       this.stringAdapter.toJson(p0, p1.getCountryCode());
       p0.l0("calling_code");
       this.stringAdapter.toJson(p0, p1.getCallingCode());
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(CallingCode\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
