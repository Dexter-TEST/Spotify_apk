package com.spotify.notifications.models.message.RichPushDataJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.notifications.models.message.RichPushFields;
import com.squareup.moshi.b;
import com.spotify.notifications.models.message.RichPushData;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class RichPushDataJsonAdapter extends JsonAdapter	// class@000aa4 from classes.dex
{
    private final b$b options;
    private final JsonAdapter richPushFieldsAdapter;
    private final JsonAdapter stringAdapter;

    public void RichPushDataJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"type","version","fields"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"type\", \"version\", \"fields\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "type");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\),\n      \"type\"\)");
       this.stringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(RichPushFields.class, a, "fields");
       co5.l(jsonAdapter1, "moshi.adapter\(RichPushFi…va, emptySet\(\), \"fields\"\)");
       this.richPushFieldsAdapter = jsonAdapter1;
    }
    public RichPushData fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       RichPushFields richPushFiel = str1;
       do {
          String str2 = "version";
          String str3 = "type";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str2, str2, p0);
                      co5.l(ohf3, "unexpectedNull\(\"version\"…       \"version\", reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str3, str3, p0);
                   co5.l(ohf3, "unexpectedNull\(\"type\", \"type\",\n            reader\)");
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
                   if (richPushFiel != null) {
                      return new RichPushData(str, str1, richPushFiel);
                   }
                   ohf3 = ve7.o("fields", "fields", p0);
                   co5.l(ohf3, "missingProperty\(\"fields\", \"fields\", reader\)");
                   throw ohf3;
                }else {
                   ohf3 = ve7.o(str2, str2, p0);
                   co5.l(ohf3, "missingProperty\(\"version\", \"version\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str3, str3, p0);
                co5.l(ohf3, "missingProperty\(\"type\", \"type\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 2 || (richPushFiel = this.richPushFieldsAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("fields", "fields", p0);
       co5.l(ohf3, "unexpectedNull\(\"fields\",…        \"fields\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,RichPushData p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("type");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("version");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("fields");
       this.richPushFieldsAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(RichPushData\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
