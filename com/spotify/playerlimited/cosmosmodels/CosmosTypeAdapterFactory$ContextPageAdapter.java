package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextPageAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.gt0;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextPageAdapter$Adapter;
import java.lang.Class;
import p.j8;
import p.ll1;
import java.util.Collection;
import com.google.common.collect.c;
import p.jj5;
import p.ml1;
import java.util.Map;
import p.m73;
import p.tr;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import p.r45;
import java.util.List;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$ContextPageAdapter extends JsonAdapter	// class@000b2a from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$ContextPageAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public gt0 fromJson(b p0){
       ll1 a1;
       CosmosTypeAdapterFactory$ContextPageAdapter$Adapter d;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$ContextPageAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       j8 oj8 = gt0.a();
       CosmosTypeAdapterFactory$ContextPageAdapter$Adapter a = p0.a;
       String str = "";
       if (a == null) {
          a = str;
       }
       oj8.b = a;
       if ((a = p0.b) != null) {
          str = a;
       }
       oj8.c = str;
       if ((a = p0.c) == null) {
          a1 = ll1.a;
       }
       c uoc = c.o(a1);
       uoc.getClass();
       oj8.t = new jj5(uoc);
       if ((d = p0.d) == null) {
          d = ml1.a;
       }
       oj8.v = m73.b(d);
       return oj8.d();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,gt0 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$ContextPageAdapter$Adapter uContextPage = new CosmosTypeAdapterFactory$ContextPageAdapter$Adapter();
       uContextPage.a = p1.a;
       uContextPage.b = p1.b;
       uContextPage.c = p1.c.f();
       uContextPage.d = p1.d;
       this.moshi.c(CosmosTypeAdapterFactory$ContextPageAdapter$Adapter.class).toJson(p0, uContextPage);
       return;
    }
}
