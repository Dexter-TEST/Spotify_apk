package com.spotify.localfiles.localfiles.LocalSourceJsonAdapter;
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
import com.spotify.localfiles.localfiles.LocalSource;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class LocalSourceJsonAdapter extends JsonAdapter	// class@00097e from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void LocalSourceJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"id","path","name","enabled","found"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"id\", \"path\", \"name\", \"enabled\",\n      \"found\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "id");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…, emptySet\(\),\n      \"id\"\)");
       this.stringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "enabled");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…tySet\(\),\n      \"enabled\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public LocalSource fromJson(b p0){
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
          str3 = "found";
          String str4 = "enabled";
          String str5 = "name";
          String str6 = "path";
          String str7 = "id";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                         }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                            continue ;
                         }else {
                            ohf3 = ve7.w(str4, str4, p0);
                            co5.l(ohf3, "unexpectedNull\(\"enabled\"…       \"enabled\", reader\)");
                            throw ohf3;
                         }
                      }else if((str2 = this.stringAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         ohf3 = ve7.w(str5, str5, p0);
                         co5.l(ohf3, "unexpectedNull\(\"name\", \"name\",\n            reader\)");
                         throw ohf3;
                      }
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str6, str6, p0);
                      co5.l(ohf3, "unexpectedNull\(\"path\", \"path\",\n            reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str7, str7, p0);
                   co5.l(ohf3, "unexpectedNull\(\"id\", \"id\", reader\)");
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
                            LocalSource v11 = new LocalSource(str, str1, str2, i, uBoolean1.booleanValue());
                            return v11;
                         }else {
                            ohf3 = ve7.o(str3, str3, p0);
                            co5.l(ohf3, "missingProperty\(\"found\", \"found\", reader\)");
                            throw ohf3;
                         }
                      }else {
                         ohf3 = ve7.o(str4, str4, p0);
                         co5.l(ohf3, "missingProperty\(\"enabled\", \"enabled\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      ohf3 = ve7.o(str5, str5, p0);
                      co5.l(ohf3, "missingProperty\(\"name\", \"name\", reader\)");
                      throw ohf3;
                   }
                }else {
                   ohf3 = ve7.o(str6, str6, p0);
                   co5.l(ohf3, "missingProperty\(\"path\", \"path\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str7, str7, p0);
                co5.l(ohf3, "missingProperty\(\"id\", \"id\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 4 || (uBoolean1 = this.booleanAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w(str3, str3, p0);
       co5.l(ohf3, "unexpectedNull\(\"found\", …und\",\n            reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LocalSource p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("id");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("path");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("enabled");
       kg4.x(p1.d, this.booleanAdapter, p0, "found");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.e));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(LocalSource\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
