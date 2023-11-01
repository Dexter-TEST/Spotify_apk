package com.spotify.notifications.models.message.QuickActionJsonAdapter;
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
import com.spotify.notifications.models.message.QuickAction;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class QuickActionJsonAdapter extends JsonAdapter	// class@000aa0 from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void QuickActionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"actionIdentifier","actionTitle","actionData"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"actionIdentifier\", \"…tle\",\n      \"actionData\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "actionIdentifier");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      \"actionIdentifier\"\)");
       this.stringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "actionData");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…emptySet\(\), \"actionData\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public QuickAction fromJson(b p0){
       String str3;
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       while (true) {
          str3 = "actionTitle";
          String str4 = "actionIdentifier";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         continue ;
                      }else {
                         str2 = this.nullableStringAdapter.fromJson(p0);
                      }
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      break ;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str4, str4, p0);
                   co5.l(ohf3, "unexpectedNull\(\"actionId…ctionIdentifier\", reader\)");
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
                   return new QuickAction(str, str1, str2);
                }
                ohf3 = ve7.o(str3, str3, p0);
                co5.l(ohf3, "missingProperty\(\"actionT…tle\",\n            reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o(str4, str4, p0);
                co5.l(ohf3, "missingProperty\(\"actionI…ctionIdentifier\", reader\)");
                throw ohf3;
             }
          }
       }
       ohf3 = ve7.w(str3, str3, p0);
       co5.l(ohf3, "unexpectedNull\(\"actionTi…", \"actionTitle\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,QuickAction p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("actionIdentifier");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("actionTitle");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("actionData");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(QuickAction\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
