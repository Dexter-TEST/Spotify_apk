package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$RestrictionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.qx5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter;
import java.lang.Class;
import p.cv;
import java.util.Collection;
import com.google.common.collect.d;
import p.dv;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$RestrictionsAdapter extends JsonAdapter	// class@000b4b from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$RestrictionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public qx5 fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       cv uocv = qx5.a();
       uocv.a = d.o(p0.e);
       uocv.b = d.o(p0.f);
       uocv.c = d.o(p0.j);
       uocv.d = d.o(p0.a);
       uocv.e = d.o(p0.b);
       uocv.f = d.o(p0.c);
       uocv.g = d.o(p0.d);
       uocv.h = d.o(p0.g);
       uocv.i = d.o(p0.h);
       uocv.j = d.o(p0.i);
       uocv.k = d.o(p0.t);
       uocv.l = d.o(p0.u);
       uocv.m = d.o(p0.v);
       uocv.n = d.o(p0.k);
       uocv.o = d.o(p0.l);
       uocv.p = d.o(p0.m);
       uocv.q = d.o(p0.n);
       uocv.r = d.o(p0.o);
       uocv.s = d.o(p0.p);
       uocv.t = d.o(p0.q);
       uocv.v = d.o(p0.s);
       uocv.u = d.o(p0.r);
       return uocv.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,qx5 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter restrictions = new CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter();
       restrictions.e = p1.b;
       restrictions.f = p1.c;
       restrictions.j = p1.d;
       restrictions.a = p1.e;
       restrictions.b = p1.f;
       restrictions.c = p1.g;
       restrictions.d = p1.h;
       restrictions.g = p1.i;
       restrictions.h = p1.j;
       restrictions.i = p1.k;
       restrictions.t = p1.l;
       restrictions.u = p1.m;
       restrictions.v = p1.n;
       restrictions.k = p1.o;
       restrictions.l = p1.p;
       restrictions.m = p1.q;
       restrictions.n = p1.r;
       restrictions.o = p1.s;
       restrictions.p = p1.t;
       restrictions.q = p1.u;
       restrictions.s = p1.w;
       restrictions.r = p1.v;
       this.moshi.c(CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter.class).toJson(p0, restrictions);
       return;
    }
}
