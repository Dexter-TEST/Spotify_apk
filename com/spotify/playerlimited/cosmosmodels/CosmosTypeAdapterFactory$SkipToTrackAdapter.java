package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SkipToTrackAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.rl6;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter;
import java.lang.Class;
import p.pv;
import p.jj5;
import java.lang.Long;
import p.qv;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import p.r45;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$SkipToTrackAdapter extends JsonAdapter	// class@000b4d from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$SkipToTrackAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public rl6 fromJson(b p0){
       String str1;
       CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter e;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       pv opv = new pv(0);
       CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter a = p0.a;
       String str = "";
       if (a == null) {
          a = str;
       }
       opv.a = new jj5(a);
       a = p0.b;
       long l = 0;
       long l1 = (a != null)? a.longValue(): l;
       Long longx = Long.valueOf(l1);
       longx.getClass();
       opv.b = new jj5(longx);
       if ((a = p0.c) == null) {
          str1 = str;
       }
       opv.c = new jj5(str1);
       if ((a = p0.d) != null) {
          str = a;
       }
       opv.d = new jj5(str);
       if ((e = p0.e) != null) {
          l = e.longValue();
       }
       Long longx1 = Long.valueOf(l);
       longx1.getClass();
       opv.e = new jj5(longx1);
       return opv.c();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,rl6 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter skipToTrackA = new CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter();
       skipToTrackA.a = p1.b.f();
       skipToTrackA.b = p1.c.f();
       skipToTrackA.c = p1.d.f();
       skipToTrackA.d = p1.e.f();
       skipToTrackA.e = p1.f.f();
       this.moshi.c(CosmosTypeAdapterFactory$SkipToTrackAdapter$Adapter.class).toJson(p0, skipToTrackA);
       return;
    }
}
