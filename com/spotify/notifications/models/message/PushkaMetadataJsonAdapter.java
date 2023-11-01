package com.spotify.notifications.models.message.PushkaMetadataJsonAdapter;
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
import com.spotify.notifications.models.message.PushkaMetadata;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PushkaMetadataJsonAdapter extends JsonAdapter	// class@000a9e from classes.dex
{
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void PushkaMetadataJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"uuid","messageId","appDeviceId"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"uuid\", \"messageId\",\n      \"appDeviceId\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "uuid");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\),\n      \"uuid\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public PushkaMetadata fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       do {
          String str3 = "messageId";
          String str4 = "uuid";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str3, str3, p0);
                      co5.l(ohf3, "unexpectedNull\(\"messageI…     \"messageId\", reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str4, str4, p0);
                   co5.l(ohf3, "unexpectedNull\(\"uuid\", \"uuid\",\n            reader\)");
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
                      return new PushkaMetadata(str, str1, str2);
                   }
                   ohf3 = ve7.o("appDeviceId", "appDeviceId", p0);
                   co5.l(ohf3, "missingProperty\(\"appDevi…eId\",\n            reader\)");
                   throw ohf3;
                }else {
                   ohf3 = ve7.o(str3, str3, p0);
                   co5.l(ohf3, "missingProperty\(\"messageId\", \"messageId\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str4, str4, p0);
                co5.l(ohf3, "missingProperty\(\"uuid\", \"uuid\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 2 || (str2 = this.stringAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("appDeviceId", "appDeviceId", p0);
       co5.l(ohf3, "unexpectedNull\(\"appDevic…", \"appDeviceId\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PushkaMetadata p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("uuid");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("messageId");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("appDeviceId");
       this.stringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(36, "GeneratedJsonAdapter\(PushkaMetadata\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
