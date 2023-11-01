package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b53 from classes.dex
{
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_ContextTrackAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"metadata","provider","uid","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"metadata\", \"provider\", \"uid\",\n      \"uri\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{String.class,String.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "provider");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…  emptySet\(\), \"provider\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter fromJson(b p0){
       int i4;
       co5.o(p0, "reader");
       p0.f();
       Map map = null;
       String str = map;
       String str1 = str;
       String str2 = str1;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (p0.T()) {
          if ((i4 = p0.v0(this.options)) != -1) {
             int i5 = 1;
             if (i4) {
                if (i4 != i5) {
                   if (i4 != 2) {
                      if (i4 != 3) {
                         continue ;
                      }
                   }else {
                      str1 = this.nullableStringAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   str = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                map = this.nullableMapOfStringStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str2 = this.nullableStringAdapter.fromJson(p0);
          i3 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter uContextTrac = new CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter();
       if (i) {
          uContextTrac.c = map;
       }
       if (i1) {
          uContextTrac.d = str;
       }
       if (i2) {
          uContextTrac.b = str1;
       }
       if (i3) {
          uContextTrac.a = str2;
       }
       return uContextTrac;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("metadata");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.c);
       p0.l0("provider");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("uid");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(74, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.ContextTrackAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
