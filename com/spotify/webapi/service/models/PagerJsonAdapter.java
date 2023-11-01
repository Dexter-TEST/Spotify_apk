package com.spotify.webapi.service.models.PagerJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.util.Set;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Pager;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class PagerJsonAdapter extends JsonAdapter	// class@000c98 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableMutableListOfTNullableAnyAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void PagerJsonAdapter(Moshi p0,Type[] p1){
       co5.o(p0, "moshi");
       co5.o(p1, "types");
       super();
       int i = 0;
       int i1 = 1;
       int i2 = (p1.length == i1)? 1: 0;
       if (i2) {
          String[] stringArray = new String[]{"href","items","limit","next","offset","previous","total"};
          b$b uob = b$b.a(stringArray);
          co5.l(uob, "of\(\"href\", \"items\", \"lim…et\", \"previous\", \"total\"\)");
          this.options = uob;
          pl1 a = pl1.a;
          JsonAdapter jsonAdapter = p0.f(String.class, a, "href");
          co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
          this.nullableStringAdapter = jsonAdapter;
          Type[] typeArray = new Type[i1];
          typeArray[i] = p1[i];
          JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "items");
          co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…mptySet\(\),\n      \"items\"\)");
          this.nullableMutableListOfTNullableAnyAdapter = jsonAdapter1;
          JsonAdapter jsonAdapter2 = p0.f(Integer.TYPE, a, "limit");
          co5.l(jsonAdapter2, "moshi.adapter\(Int::class…ava, emptySet\(\), \"limit\"\)");
          this.intAdapter = jsonAdapter2;
          return;
       }else {
          String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received "+p1.length;
          co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          throw new IllegalArgumentException(str.toString());
       }
    }
    public Pager fromJson(b p0){
       hf3 ohf3;
       Pager pager;
       int i4;
       Pager total;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       List list = str;
       Integer integer = list;
       String str1 = integer;
       Integer integer1 = str1;
       String str2 = integer1;
       Integer integer2 = str2;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (p0.T()) {
             switch (p0.v0(this.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   str = this.nullableStringAdapter.fromJson(p0);
                   i = 1;
                   break;
                 case 1:
                   list = this.nullableMutableListOfTNullableAnyAdapter.fromJson(p0);
                   i1 = 1;
                   break;
                 case 2:
                   if ((integer = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("limit", "limit", p0);
                      co5.l(ohf3, "unexpectedNull\(\"limit\", …mit\",\n            reader\)");
                      throw ohf3;
                   }
                   break;
                 case 3:
                   str1 = this.nullableStringAdapter.fromJson(p0);
                   i2 = 1;
                   break;
                 case 4:
                   if ((integer1 = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("offset", "offset", p0);
                      co5.l(ohf3, "unexpectedNull\(\"offset\",…set\",\n            reader\)");
                      throw ohf3;
                   }
                   break;
                 case 5:
                   str2 = this.nullableStringAdapter.fromJson(p0);
                   i3 = 1;
                   break;
                 case 6:
                   if ((integer2 = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("total", "total", p0);
                      co5.l(ohf3, "unexpectedNull\(\"total\", …tal\",\n            reader\)");
                      throw ohf3;
                   }
                   break;
                 default:
             }
          }else {
             p0.y();
             pager = new Pager();
             if (i) {
                pager.href = str;
             }
             if (i1) {
                pager.items = list;
             }
             i4 = (integer != null)? integer.intValue(): pager.limit;
             pager.limit = i4;
             if (i2) {
                pager.next = str1;
             }
             i4 = (integer1 != null)? integer1.intValue(): pager.offset;
             pager.offset = i4;
             if (i3) {
                pager.previous = str2;
             }
             i4 = (integer2 != null)? integer2.intValue(): pager.total;
             break ;
          }
       }
       pager.total = i4;
       return pager;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Pager p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("items");
       this.nullableMutableListOfTNullableAnyAdapter.toJson(p0, p1.items);
       p0.l0("limit");
       tp2.q(p1.limit, this.intAdapter, p0, "next");
       this.nullableStringAdapter.toJson(p0, p1.next);
       p0.l0("offset");
       tp2.q(p1.offset, this.intAdapter, p0, "previous");
       this.nullableStringAdapter.toJson(p0, p1.previous);
       p0.l0("total");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.total));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(27, "GeneratedJsonAdapter\(Pager\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
