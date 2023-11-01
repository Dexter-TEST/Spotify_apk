package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.ks0;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextAdapter$Adapter;
import java.lang.Class;
import p.o11;
import p.ml1;
import java.util.Map;
import p.m73;
import java.util.Collection;
import com.google.common.collect.c;
import p.jj5;
import p.rr;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import p.r45;
import p.qx5;
import java.util.List;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$ContextAdapter extends JsonAdapter	// class@000b28 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$ContextAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public ks0 fromJson(b p0){
       CosmosTypeAdapterFactory$ContextAdapter$Adapter b;
       CosmosTypeAdapterFactory$ContextAdapter$Adapter c;
       CosmosTypeAdapterFactory$ContextAdapter$Adapter d;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$ContextAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$ContextAdapter$Adapter a = p0.a;
       String str = "";
       if (a == null) {
          a = str;
       }
       o11 oo11 = ks0.a(a);
       if ((b = p0.b) != null) {
          c = b;
       }
       oo11.s(str);
       if ((c = p0.c) == null) {
          c = ml1.a;
       }
       oo11.t = m73.b(c);
       if ((c = p0.e) != null) {
          c uoc = c.o(c);
          uoc.getClass();
          oo11.v = new jj5(uoc);
       }
       if ((d = p0.d) != null) {
          oo11.w = new jj5(d);
       }
       return oo11.d();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,ks0 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$ContextAdapter$Adapter uContextAdap = new CosmosTypeAdapterFactory$ContextAdapter$Adapter();
       uContextAdap.a = p1.a;
       uContextAdap.b = p1.b;
       uContextAdap.c = p1.c;
       uContextAdap.d = p1.e.f();
       uContextAdap.e = p1.d.f();
       this.moshi.c(CosmosTypeAdapterFactory$ContextAdapter$Adapter.class).toJson(p0, uContextAdap);
       return;
    }
}
