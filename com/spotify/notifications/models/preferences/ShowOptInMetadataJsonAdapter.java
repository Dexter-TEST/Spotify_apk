package com.spotify.notifications.models.preferences.ShowOptInMetadataJsonAdapter;
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
import com.spotify.notifications.models.preferences.ShowOptInMetadata;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ShowOptInMetadataJsonAdapter extends JsonAdapter	// class@000aad from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void ShowOptInMetadataJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"showUri","title","publisher","showImageId","optedIn"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"showUri\", \"title\", \"…"showImageId\", \"optedIn\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "showUri");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…tySet\(\),\n      \"showUri\"\)");
       this.stringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "optedIn");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…tySet\(\),\n      \"optedIn\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public ShowOptInMetadata fromJson(b p0){
       String str4;
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       String str = uBoolean;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       do {
          str4 = "optedIn";
          String str5 = "showImageId";
          String str6 = "publisher";
          String str7 = "title";
          String str8 = "showUri";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                         }else if((str3 = this.stringAdapter.fromJson(p0)) != null){
                            continue ;
                         }else {
                            ohf3 = ve7.w(str5, str5, p0);
                            co5.l(ohf3, "unexpectedNull\(\"showImag…", \"showImageId\", reader\)");
                            throw ohf3;
                         }
                      }else if((str2 = this.stringAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         ohf3 = ve7.w(str6, str6, p0);
                         co5.l(ohf3, "unexpectedNull\(\"publishe…     \"publisher\", reader\)");
                         throw ohf3;
                      }
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str7, str7, p0);
                      co5.l(ohf3, "unexpectedNull\(\"title\", …tle\",\n            reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str8, str8, p0);
                   co5.l(ohf3, "unexpectedNull\(\"showUri\"…       \"showUri\", reader\)");
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
                      if (str3 != null) {
                         if (uBoolean != null) {
                            ShowOptInMetadata v11 = new ShowOptInMetadata(str, str1, str2, str3, uBoolean.booleanValue());
                            return v11;
                         }else {
                            ohf3 = ve7.o(str4, str4, p0);
                            co5.l(ohf3, "missingProperty\(\"optedIn\", \"optedIn\", reader\)");
                            throw ohf3;
                         }
                      }else {
                         ohf3 = ve7.o(str5, str5, p0);
                         co5.l(ohf3, "missingProperty\(\"showIma…eId\",\n            reader\)");
                         throw ohf3;
                      }
                   }else {
                      ohf3 = ve7.o(str6, str6, p0);
                      co5.l(ohf3, "missingProperty\(\"publisher\", \"publisher\", reader\)");
                      throw ohf3;
                   }
                }else {
                   ohf3 = ve7.o(str7, str7, p0);
                   co5.l(ohf3, "missingProperty\(\"title\", \"title\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str8, str8, p0);
                co5.l(ohf3, "missingProperty\(\"showUri\", \"showUri\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 4 || (uBoolean = this.booleanAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w(str4, str4, p0);
       co5.l(ohf3, "unexpectedNull\(\"optedIn\"…       \"optedIn\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ShowOptInMetadata p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("showUri");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("title");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("publisher");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("showImageId");
       this.stringAdapter.toJson(p0, p1.d);
       p0.l0("optedIn");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.e));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(ShowOptInMetadata\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
