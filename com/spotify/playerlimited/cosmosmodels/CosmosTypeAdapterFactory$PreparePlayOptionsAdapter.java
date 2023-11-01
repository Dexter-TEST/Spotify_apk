package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PreparePlayOptionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.hj5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;
import java.lang.Class;
import p.p25;
import p.dt5;
import p.jj5;
import java.lang.Boolean;
import p.r45;
import p.rl6;
import java.lang.Long;
import p.yf5;
import p.vw6;
import p.ni5;
import p.to;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Double;
import java.lang.Number;
import p.m73;
import p.av;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PreparePlayOptionsAdapter extends JsonAdapter	// class@000b49 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PreparePlayOptionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public hj5 fromJson(b p0){
       qv a1;
       tu a2;
       uv a3;
       ni5 a4;
       to a5;
       String str1;
       CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter m;
       CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter value;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       p25 op25 = new p25(3);
       op25.m = dt5.x;
       CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter a = p0.a;
       String str = "";
       if (a == null) {
          a = str;
       }
       op25.a = new jj5(a);
       a = p0.b;
       boolean b = false;
       boolean b1 = (a != null)? a.booleanValue(): false;
       op25.b = r45.d(Boolean.valueOf(b1));
       if ((a = p0.c) == null) {
          a1 = rl6.a;
       }
       a1.getClass();
       op25.c = new jj5(a1);
       long l = ((a = p0.d) != null)? a.longValue(): 0;
       Long longx = Long.valueOf(l);
       longx.getClass();
       op25.d = new jj5(longx);
       b1 = ((a = p0.e) != null)? a.booleanValue(): false;
       op25.e = r45.d(Boolean.valueOf(b1));
       if ((a = p0.f) != null) {
          b = a.booleanValue();
       }
       op25.f = r45.d(Boolean.valueOf(b));
       if ((a = p0.g) == null) {
          a2 = yf5.a;
       }
       a2.getClass();
       op25.g = new jj5(a2);
       if ((a = p0.h) == null) {
          a3 = vw6.a;
       }
       a3.getClass();
       op25.h = new jj5(a3);
       if ((a = p0.i) == null) {
          a4 = ni5.a;
       }
       op25.i = new jj5(a4);
       if ((a = p0.j) == null) {
          a5 = to.a;
       }
       op25.j = new jj5(a5);
       if ((a = p0.k) == null) {
          str1 = str;
       }
       op25.k = new jj5(str1);
       if ((a = p0.l) != null) {
          value = a;
       }
       op25.l = new jj5(str);
       if (p0.m != null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          if ((m = p0.m) != null) {
             Iterator iterator = m.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                value = uEntry.getValue();
                if (value instanceof Double) {
                   try{
                      linkedHashMa.put(key, String.valueOf((int)value.doubleValue()));
                   }catch(java.lang.NumberFormatException e0){
                      linkedHashMa.put(key, value.toString());
                   }
                }else {
                   linkedHashMa.put(key, value.toString());
                }
             }
          }
          op25.m = m73.b(linkedHashMa);
       }
       return op25.b();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,hj5 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter preparePlayO = new CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter();
       preparePlayO.a = p1.b.f();
       preparePlayO.b = p1.c.f();
       preparePlayO.c = p1.d.f();
       preparePlayO.d = p1.e.f();
       preparePlayO.e = p1.f.f();
       preparePlayO.f = p1.g.f();
       preparePlayO.g = p1.h.f();
       preparePlayO.h = p1.i.f();
       preparePlayO.i = p1.j.f();
       preparePlayO.j = p1.k.f();
       preparePlayO.k = p1.l.f();
       preparePlayO.l = p1.m.f();
       preparePlayO.m = p1.n;
       this.moshi.c(CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter.class).toJson(p0, preparePlayO);
       return;
    }
}
