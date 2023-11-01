package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.CreativeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.display.models.CreativeType;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.ClickAction;
import java.util.List;
import com.squareup.moshi.b;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Creative;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CreativeJsonAdapter extends JsonAdapter	// class@000a10 from classes.dex
{
    private final JsonAdapter creativeTypeAdapter;
    private final JsonAdapter listOfClickActionAdapter;
    private final JsonAdapter mapOfStringStringAdapter;
    private final b$b options;

    public void CreativeJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"type","metadata","clickActions"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"type\", \"metadata\",\n      \"clickActions\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(CreativeType.class, a, "type");
       co5.l(jsonAdapter, "moshi.adapter\(CreativeTy…java, emptySet\(\), \"type\"\)");
       this.creativeTypeAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.mapOfStringStringAdapter = jsonAdapter;
       typeArray = new Type[]{ClickAction.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "clickActions");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\), \"clickActions\"\)");
       this.listOfClickActionAdapter = jsonAdapter1;
    }
    public Creative fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       CreativeType uCreativeTyp = null;
       Map map = uCreativeTyp;
       List list = map;
       do {
          String str = "metadata";
          String str1 = "type";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                   }else if((map = this.mapOfStringStringAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w(str, str, p0);
                      co5.l(ohf3, "unexpectedNull\(\"metadata\", \"metadata\", reader\)");
                      throw ohf3;
                   }
                }else if((uCreativeTyp = this.creativeTypeAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str1, str1, p0);
                   co5.l(ohf3, "unexpectedNull\(\"type\",\n            \"type\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (uCreativeTyp != null) {
                if (map != null) {
                   if (list != null) {
                      return new Creative(uCreativeTyp, map, list);
                   }
                   ohf3 = ve7.o("clickActions", "clickActions", p0);
                   co5.l(ohf3, "missingProperty\(\"clickAc…ons\",\n            reader\)");
                   throw ohf3;
                }else {
                   ohf3 = ve7.o(str, str, p0);
                   co5.l(ohf3, "missingProperty\(\"metadata\", \"metadata\", reader\)");
                   throw ohf3;
                }
             }else {
                ohf3 = ve7.o(str1, str1, p0);
                co5.l(ohf3, "missingProperty\(\"type\", \"type\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 2 || (list = this.listOfClickActionAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("clickActions", "clickActions", p0);
       co5.l(ohf3, "unexpectedNull\(\"clickAct…, \"clickActions\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Creative p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("type");
       this.creativeTypeAdapter.toJson(p0, p1.a);
       p0.l0("metadata");
       this.mapOfStringStringAdapter.toJson(p0, p1.b);
       p0.l0("clickActions");
       this.listOfClickActionAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(30, "GeneratedJsonAdapter\(Creative\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
