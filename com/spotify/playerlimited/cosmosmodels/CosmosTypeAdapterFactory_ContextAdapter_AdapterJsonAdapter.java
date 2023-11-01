package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_ContextAdapter_AdapterJsonAdapter;
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
import p.gt0;
import java.util.List;
import p.qx5;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_ContextAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b51 from classes.dex
{
    private final JsonAdapter nullableListOfContextPageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableRestrictionsAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_ContextAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"metadata","pages","restrictions","uri","url"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"metadata\", \"pages\",\n…trictions\", \"uri\", \"url\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{String.class,String.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       typeArray = new Type[]{gt0.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "pages");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…     emptySet\(\), \"pages\"\)");
       this.nullableListOfContextPageAdapter = jsonAdapter;
       jsonAdapter = p0.f(qx5.class, a, "restrictions");
       co5.l(jsonAdapter, "moshi.adapter\(Restrictio…ptySet\(\), \"restrictions\"\)");
       this.nullableRestrictionsAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "uri");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…
          emptySet\(\), \"uri\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$ContextAdapter$Adapter fromJson(b p0){
       int i5;
       co5.o(p0, "reader");
       p0.f();
       Map map = null;
       List list = map;
       qx5 oqx5 = list;
       String str = oqx5;
       String str1 = str;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (p0.T()) {
          if ((i5 = p0.v0(this.options)) != -1) {
             int i6 = 1;
             if (i5) {
                if (i5 != i6) {
                   if (i5 != 2) {
                      if (i5 != 3) {
                         if (i5 != 4) {
                            continue ;
                         }
                      }else {
                         str = this.nullableStringAdapter.fromJson(p0);
                         i3 = 1;
                      }
                   }else {
                      oqx5 = this.nullableRestrictionsAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   list = this.nullableListOfContextPageAdapter.fromJson(p0);
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
          str1 = this.nullableStringAdapter.fromJson(p0);
          i4 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$ContextAdapter$Adapter uContextAdap = new CosmosTypeAdapterFactory$ContextAdapter$Adapter();
       if (i) {
          uContextAdap.c = map;
       }
       if (i1) {
          uContextAdap.e = list;
       }
       if (i2) {
          uContextAdap.d = oqx5;
       }
       if (i3) {
          uContextAdap.a = str;
       }
       if (i4) {
          uContextAdap.b = str1;
       }
       return uContextAdap;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$ContextAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("metadata");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.c);
       p0.l0("pages");
       this.nullableListOfContextPageAdapter.toJson(p0, p1.e);
       p0.l0("restrictions");
       this.nullableRestrictionsAdapter.toJson(p0, p1.d);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("url");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(69, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.ContextAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
