package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOriginAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.kf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;
import java.lang.Class;
import p.ej5;
import p.pl1;
import java.util.Collection;
import com.google.common.collect.d;
import p.qu;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayOriginAdapter extends JsonAdapter	// class@000b36 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayOriginAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public kf5 fromJson(b p0){
       CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter a;
       String str2;
       CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter g;
       co5.o(p0, "reader");
       p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter.class).fromJson(p0);
       String str = "Required value was null.";
       if (p0 == null) {
          throw new IllegalStateException(str.toString());
       }
       if ((a = p0.a) == null) {
          throw new IllegalStateException(str.toString());
       }
       ej5 uoej5 = kf5.a(a);
       a = p0.b;
       String str1 = "";
       if (a == null) {
          str2 = str1;
       }
       uoej5.j(str2);
       if ((a = p0.c) == null) {
          str2 = str1;
       }
       uoej5.c = str2;
       if ((a = p0.d) == null) {
          str2 = str1;
       }
       uoej5.d = str2;
       if ((a = p0.e) == null) {
          str2 = str1;
       }
       uoej5.e = str2;
       if ((a = p0.f) != null) {
          str1 = a;
       }
       uoej5.f = str1;
       if ((g = p0.g) == null) {
          g = pl1.a;
       }
       uoej5.g = d.o(g);
       return uoej5.c();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,kf5 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter playOriginAd = new CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter();
       playOriginAd.a = p1.a;
       playOriginAd.b = p1.b;
       playOriginAd.c = p1.c;
       playOriginAd.d = p1.d;
       playOriginAd.e = p1.e;
       playOriginAd.f = p1.f;
       playOriginAd.g = p1.g;
       this.moshi.c(CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter.class).toJson(p0, playOriginAd);
       return;
    }
}
