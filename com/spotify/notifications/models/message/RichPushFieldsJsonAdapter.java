package com.spotify.notifications.models.message.RichPushFieldsJsonAdapter;
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
import com.spotify.notifications.models.message.RichPushFields;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class RichPushFieldsJsonAdapter extends JsonAdapter	// class@000aa6 from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void RichPushFieldsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"image_url","title","subtitle","description","duration_ms"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"image_url\", \"title\",…cription\", \"duration_ms\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "imageUrl");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…  emptySet\(\), \"imageUrl\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public RichPushFields fromJson(b p0){
       int i;
       RichPushFields p0;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       String str4 = str3;
       while (p0.T()) {
          if ((i = p0.v0(this.options)) != -1) {
             if (i) {
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i != 4) {
                            continue ;
                         }else {
                            str4 = this.nullableStringAdapter.fromJson(p0);
                         }
                      }else {
                         str3 = this.nullableStringAdapter.fromJson(p0);
                      }
                   }else {
                      str2 = this.nullableStringAdapter.fromJson(p0);
                   }
                }else {
                   str1 = this.nullableStringAdapter.fromJson(p0);
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
             }
          }else {
             p0.z0();
             p0.A0();
          }
       }
       p0.y();
       p0 = new RichPushFields(str, str1, str2, str3, str4);
       return p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,RichPushFields p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("image_url");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("title");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("subtitle");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("description");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("duration_ms");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(36, "GeneratedJsonAdapter\(RichPushFields\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
