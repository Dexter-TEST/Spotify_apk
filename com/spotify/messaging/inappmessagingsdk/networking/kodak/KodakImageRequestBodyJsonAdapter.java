package com.spotify.messaging.inappmessagingsdk.networking.kodak.KodakImageRequestBodyJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Long;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Integer;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.messaging.inappmessagingsdk.networking.kodak.KodakImageRequestBody;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class KodakImageRequestBodyJsonAdapter extends JsonAdapter	// class@000a4e from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final b$b options;

    public void KodakImageRequestBodyJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"creative_id","width","height","is_dev"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"creative_id\", \"width…"height\",\n      \"is_dev\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Long.TYPE, a, "creativeId");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…et\(\),\n      \"creativeId\"\)");
       this.longAdapter = jsonAdapter;
       jsonAdapter = p0.f(Integer.TYPE, a, "width");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…ava, emptySet\(\), \"width\"\)");
       this.intAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "isDev");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…mptySet\(\),\n      \"isDev\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public KodakImageRequestBody fromJson(b p0){
       String str;
       String str1;
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Long longx = null;
       Integer integer = longx;
       Integer integer1 = integer;
       Boolean uBoolean = integer1;
       do {
          str = "is_dev";
          str1 = "isDev";
          String str2 = "creative_id";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                      }else if((integer1 = this.intAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         ohf3 = ve7.w("height", "height", p0);
                         co5.l(ohf3, "unexpectedNull\(\"height\",…ght\",\n            reader\)");
                         throw ohf3;
                      }
                   }else if((integer = this.intAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w("width", "width", p0);
                      co5.l(ohf3, "unexpectedNull\(\"width\", …dth\",\n            reader\)");
                      throw ohf3;
                   }
                }else if((longx = this.longAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w("creativeId", str2, p0);
                   co5.l(ohf3, "unexpectedNull\(\"creative…   \"creative_id\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (longx != null) {
                long l = longx.longValue();
                if (integer != null) {
                   i = integer.intValue();
                   if (integer1 != null) {
                      int i1 = integer1.intValue();
                      if (uBoolean != null) {
                         KodakImageRequestBody v11 = new KodakImageRequestBody(l, i, i1, uBoolean.booleanValue());
                         return v11;
                      }else {
                         ohf3 = ve7.o(str1, str, p0);
                         co5.l(ohf3, "missingProperty\(\"isDev\", \"is_dev\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      ohf3 = ve7.o("height", "height", p0);
                      co5.l(ohf3, "missingProperty\(\"height\", \"height\", reader\)");
                      throw ohf3;
                   }
                }else {
                   ohf3 = ve7.o("width", "width", p0);
                   co5.l(ohf3, "missingProperty\(\"width\", \"width\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o("creativeId", str2, p0);
                co5.l(ohf3, "missingProperty\(\"creativ…", \"creative_id\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 3 || (uBoolean = this.booleanAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w(str1, str, p0);
       co5.l(ohf3, "unexpectedNull\(\"isDev\", …dev\",\n            reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,KodakImageRequestBody p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("creative_id");
       this.longAdapter.toJson(p0, Long.valueOf(p1.a));
       p0.l0("width");
       tp2.q(p1.b, this.intAdapter, p0, "height");
       tp2.q(p1.c, this.intAdapter, p0, "is_dev");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.d));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(KodakImageRequestBody\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
