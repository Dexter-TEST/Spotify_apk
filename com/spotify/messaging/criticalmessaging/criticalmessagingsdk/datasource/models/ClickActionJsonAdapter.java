package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.ClickActionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.ClickAction;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ClickActionJsonAdapter extends JsonAdapter	// class@000a0e from classes.dex
{
    private final JsonAdapter mapOfStringStringAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void ClickActionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"id","type","metadata"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"id\", \"type\", \"metadata\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "id");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…, emptySet\(\),\n      \"id\"\)");
       this.stringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.mapOfStringStringAdapter = jsonAdapter1;
    }
    public ClickAction fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       Map map = str1;
       do {
          String str2 = "type";
          String str3 = "id";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                   }else if((str1 = this.stringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str2, str2, p0);
                      co5.l(ohf3, "unexpectedNull\(\"type\", \"type\",\n            reader\)");
                      throw ohf3;
                   }
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str3, str3, p0);
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
                   if (map != null) {
                      return new ClickAction(str, str1, map);
                   }
                   ohf3 = ve7.o("metadata", "metadata", p0);
                   co5.l(ohf3, "missingProperty\(\"metadata\", \"metadata\", reader\)");
                   throw ohf3;
                }else {
                   ohf3 = ve7.o(str2, str2, p0);
                   co5.l(ohf3, "missingProperty\(\"type\", \"type\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str3, str3, p0);
                co5.l(ohf3, "missingProperty\(\"id\", \"id\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 2 || (map = this.mapOfStringStringAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("metadata", "metadata", p0);
       co5.l(ohf3, "unexpectedNull\(\"metadata\", \"metadata\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ClickAction p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("id");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("type");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("metadata");
       this.mapOfStringStringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(ClickAction\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
