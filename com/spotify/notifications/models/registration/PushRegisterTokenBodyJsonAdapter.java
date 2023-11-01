package com.spotify.notifications.models.registration.PushRegisterTokenBodyJsonAdapter;
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
import com.spotify.notifications.models.registration.PushRegisterTokenBody;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PushRegisterTokenBodyJsonAdapter extends JsonAdapter	// class@000aaf from classes.dex
{
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void PushRegisterTokenBodyJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"platform","token","environment","appId","osVersion","appVersion"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"platform\", \"token\",\n…osVersion\", \"appVersion\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "platform");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ySet\(\),\n      \"platform\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public PushRegisterTokenBody fromJson(b p0){
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       String str4 = str3;
       String str5 = str4;
       while (true) {
          String str6 = "appVersion";
          if (p0.T()) {
             switch (p0.v0(this.options)){
                 case 0xffffffff:
                   break;
                 case 0:
                   if ((str = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("platform", "platform", p0);
                      co5.l(ohf3, "unexpectedNull\(\"platform…      \"platform\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 1:
                   if ((str1 = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("token", "token", p0);
                      co5.l(ohf3, "unexpectedNull\(\"token\", …ken\",\n            reader\)");
                      throw ohf3;
                   }
                   break;
                 case 2:
                   if ((str2 = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("environment", "environment", p0);
                      co5.l(ohf3, "unexpectedNull\(\"environm…", \"environment\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 3:
                   if ((str3 = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("appId", "appId", p0);
                      co5.l(ohf3, "unexpectedNull\(\"appId\", …pId\",\n            reader\)");
                      throw ohf3;
                   }
                   break;
                 case 4:
                   if ((str4 = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("osVersion", "osVersion", p0);
                      co5.l(ohf3, "unexpectedNull\(\"osVersio…     \"osVersion\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 5:
                   if ((str5 = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w(str6, str6, p0);
                      co5.l(ohf3, "unexpectedNull\(\"appVersi…    \"appVersion\", reader\)");
                      throw ohf3;
                   }
                   break;
                 default:
             }
             p0.z0();
             p0.A0();
          }else {
             p0.y();
             if (str != null) {
                if (str1 != null) {
                   if (str2 != null) {
                      if (str3 != null) {
                         if (str4 != null) {
                            if (str5 != null) {
                               PushRegisterTokenBody v0 = new PushRegisterTokenBody(str, str1, str2, str3, str4, str5);
                               return v0;
                            }else {
                               ohf3 = ve7.o(str6, str6, p0);
                               co5.l(ohf3, "missingProperty\(\"appVers…n\", \"appVersion\", reader\)");
                               throw ohf3;
                            }
                         }else {
                            ohf3 = ve7.o("osVersion", "osVersion", p0);
                            co5.l(ohf3, "missingProperty\(\"osVersion\", \"osVersion\", reader\)");
                            throw ohf3;
                         }
                      }else {
                         ohf3 = ve7.o("appId", "appId", p0);
                         co5.l(ohf3, "missingProperty\(\"appId\", \"appId\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      ohf3 = ve7.o("environment", "environment", p0);
                      co5.l(ohf3, "missingProperty\(\"environ…ent\",\n            reader\)");
                      throw ohf3;
                   }
                }else {
                   ohf3 = ve7.o("token", "token", p0);
                   co5.l(ohf3, "missingProperty\(\"token\", \"token\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o("platform", "platform", p0);
                co5.l(ohf3, "missingProperty\(\"platform\", \"platform\", reader\)");
                throw ohf3;
             }
          }
       }
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PushRegisterTokenBody p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("platform");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("token");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("environment");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("appId");
       this.stringAdapter.toJson(p0, p1.d);
       p0.l0("osVersion");
       this.stringAdapter.toJson(p0, p1.e);
       p0.l0("appVersion");
       this.stringAdapter.toJson(p0, p1.f);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(PushRegisterTokenBody\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
