package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_SkipToTrackAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Long;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_SkipToTrackAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b62 from classes.dex
{
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_SkipToTrackAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"page_index","page_url","track_index","track_uid","track_uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"page_index\", \"page_u…"track_uid\", \"track_uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Long.class, a, "pageIndex");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas… emptySet\(\), \"pageIndex\"\)");
       this.nullableLongAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "pageUrl");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…   emptySet\(\), \"pageUrl\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter fromJson(b p0){
       int i5;
       co5.o(p0, "reader");
       p0.f();
       Long longx = null;
       String str = longx;
       Long longx1 = str;
       String str1 = longx1;
       String str2 = str1;
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
                         str1 = this.nullableStringAdapter.fromJson(p0);
                         i3 = 1;
                      }
                   }else {
                      longx1 = this.nullableLongAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   str = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                longx = this.nullableLongAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str2 = this.nullableStringAdapter.fromJson(p0);
          i4 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter skipToTrackA = new CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter();
       if (i) {
          skipToTrackA.b = longx;
       }
       if (i1) {
          skipToTrackA.a = str;
       }
       if (i2) {
          skipToTrackA.e = longx1;
       }
       if (i3) {
          skipToTrackA.c = str1;
       }
       if (i4) {
          skipToTrackA.d = str2;
       }
       return skipToTrackA;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("page_index");
       this.nullableLongAdapter.toJson(p0, p1.b);
       p0.l0("page_url");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("track_index");
       this.nullableLongAdapter.toJson(p0, p1.e);
       p0.l0("track_uid");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("track_uri");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(73, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.SkipToTrackAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
