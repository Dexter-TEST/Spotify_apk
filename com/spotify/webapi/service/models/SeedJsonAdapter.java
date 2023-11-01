package com.spotify.webapi.service.models.SeedJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Integer;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Seed;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class SeedJsonAdapter extends JsonAdapter	// class@000cb7 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void SeedJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"afterFilteringSize","afterRelinkingSize","href","id","initialPoolSize","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"afterFilteringSize\",…initialPoolSize\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "afterFilteringSize");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…    \"afterFilteringSize\"\)");
       this.intAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "href");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public Seed fromJson(b p0){
       hf3 ohf3;
       Seed seed;
       Seed initialPoolS;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       Integer integer1 = integer;
       String str = integer1;
       String str1 = str;
       Integer integer2 = str1;
       String str2 = integer2;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (p0.T()) {
             switch (p0.v0(this.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   if ((integer = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("afterFilteringSize", "afterFilteringSize", p0);
                      co5.l(ohf3, "unexpectedNull\(\"afterFil…erFilteringSize\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 1:
                   if ((integer1 = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("afterRelinkingSize", "afterRelinkingSize", p0);
                      co5.l(ohf3, "unexpectedNull\(\"afterRel…erRelinkingSize\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 2:
                   str = this.nullableStringAdapter.fromJson(p0);
                   i = 1;
                   break;
                 case 3:
                   str1 = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                   break;
                 case 4:
                   if ((integer2 = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("initialPoolSize", "initialPoolSize", p0);
                      co5.l(ohf3, "unexpectedNull\(\"initialP…initialPoolSize\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 5:
                   str2 = this.nullableStringAdapter.fromJson(p0);
                   i2 = 1;
                   break;
                 default:
             }
          }else {
             p0.y();
             seed = new Seed();
             int i3 = (integer != null)? integer.intValue(): seed.afterFilteringSize;
             seed.afterFilteringSize = i3;
             i3 = (integer1 != null)? integer1.intValue(): seed.afterRelinkingSize;
             seed.afterRelinkingSize = i3;
             if (i) {
                seed.href = str;
             }
             if (i1) {
                seed.id = str1;
             }
             i3 = (integer2 != null)? integer2.intValue(): seed.initialPoolSize;
             seed.initialPoolSize = i3;
             if (i2) {
                seed.type = str2;
                break ;
             }
             break ;
          }
       }
       return seed;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Seed p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("afterFilteringSize");
       tp2.q(p1.afterFilteringSize, this.intAdapter, p0, "afterRelinkingSize");
       tp2.q(p1.afterRelinkingSize, this.intAdapter, p0, "href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("initialPoolSize");
       tp2.q(p1.initialPoolSize, this.intAdapter, p0, "type");
       this.nullableStringAdapter.toJson(p0, p1.type);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(26, "GeneratedJsonAdapter\(Seed\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
