package com.spotify.notifications.models.preferences.PreferenceJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.notifications.models.preferences.Preference;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class PreferenceJsonAdapter extends JsonAdapter	// class@000aa9 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void PreferenceJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"name","description","key","email","push"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"name\", \"description\"…",\n      \"email\", \"push\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "name");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\),\n      \"name\"\)");
       this.stringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "isEmailEnabled");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…,\n      \"isEmailEnabled\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public Preference fromJson(b p0){
       String str3;
       boolean i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       Boolean uBoolean1 = uBoolean;
       String str = uBoolean1;
       String str1 = str;
       String str2 = str1;
       do {
          str3 = "push";
          String str4 = "email";
          String str5 = "key";
          String str6 = "description";
          String str7 = "name";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                         }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                            continue ;
                         }else {
                            ohf3 = ve7.w("isEmailEnabled", str4, p0);
                            co5.l(ohf3, "unexpectedNull\(\"isEmailEnabled\", \"email\", reader\)");
                            throw ohf3;
                         }
                      }else if((str2 = this.stringAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         ohf3 = ve7.w(str5, str5, p0);
                         co5.l(ohf3, "unexpectedNull\(\"key\", \"key\", reader\)");
                         throw ohf3;
                      }
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str6, str6, p0);
                      co5.l(ohf3, "unexpectedNull\(\"descript…", \"description\", reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str7, str7, p0);
                   co5.l(ohf3, "unexpectedNull\(\"name\", \"name\",\n            reader\)");
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
                   if (str2 != null) {
                      if (uBoolean != null) {
                         i = uBoolean.booleanValue();
                         if (uBoolean1 != null) {
                            Preference v13 = new Preference(str, str1, str2, i, uBoolean1.booleanValue());
                            return v13;
                         }else {
                            ohf3 = ve7.o("isPushEnabled", str3, p0);
                            co5.l(ohf3, "missingProperty\(\"isPushEnabled\", \"push\", reader\)");
                            throw ohf3;
                         }
                      }else {
                         ohf3 = ve7.o("isEmailEnabled", str4, p0);
                         co5.l(ohf3, "missingProperty\(\"isEmail…ail\",\n            reader\)");
                         throw ohf3;
                      }
                   }else {
                      ohf3 = ve7.o(str5, str5, p0);
                      co5.l(ohf3, "missingProperty\(\"key\", \"key\", reader\)");
                      throw ohf3;
                   }
                }else {
                   ohf3 = ve7.o(str6, str6, p0);
                   co5.l(ohf3, "missingProperty\(\"descrip…ion\",\n            reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str7, str7, p0);
                co5.l(ohf3, "missingProperty\(\"name\", \"name\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 4 || (uBoolean1 = this.booleanAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("isPushEnabled", str3, p0);
       co5.l(ohf3, "unexpectedNull\(\"isPushEnabled\", \"push\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Preference p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("description");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("key");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("email");
       kg4.x(p1.d, this.booleanAdapter, p0, "push");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.e));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(32, "GeneratedJsonAdapter\(Preference\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
