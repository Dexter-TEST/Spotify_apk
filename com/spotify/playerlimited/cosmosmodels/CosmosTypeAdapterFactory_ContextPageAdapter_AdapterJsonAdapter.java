package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_ContextPageAdapter_AdapterJsonAdapter;
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
import p.nt0;
import java.util.List;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextPageAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_ContextPageAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b52 from classes.dex
{
    private final JsonAdapter nullableListOfContextTrackAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_ContextPageAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"metadata","next_page_url","page_url","tracks"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"metadata\", \"next_pag�    \"page_url\", \"tracks\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{String.class,String.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP�, emptySet\(\), \"metadata\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "nextPageUrl");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl�mptySet\(\), \"nextPageUrl\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray1 = new Type[]{nt0.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray1), a, "tracks");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP�    emptySet\(\), \"tracks\"\)");
       this.nullableListOfContextTrackAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$ContextPageAdapter$Adapter fromJson(b p0){
       int i4;
       co5.o(p0, "reader");
       p0.f();
       Map map = null;
       String str = map;
       String str1 = str;
       List list = str1;
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
          list = this.nullableListOfContextTrackAdapter.fromJson(p0);
          i3 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$ContextPageAdapter$Adapter uContextPage = new CosmosTypeAdapterFactory$ContextPageAdapter$Adapter();
       if (i) {
          uContextPage.d = map;
       }
       if (i1) {
          uContextPage.b = str;
       }
       if (i2) {
          uContextPage.a = str1;
       }
       if (i3) {
          uContextPage.c = list;
       }
       return uContextPage;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$ContextPageAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("metadata");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.d);
       p0.l0("next_page_url");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("page_url");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("tracks");
       this.nullableListOfContextTrackAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(73, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.ContextPageAdapter.Adapter\)", "StringBuilder\(capacity\).�builderAction\).toString\(\)");
    }
}
