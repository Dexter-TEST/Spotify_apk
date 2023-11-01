package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.yf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;
import java.lang.Class;
import java.lang.Boolean;
import p.jj5;
import p.tu;
import p.r45;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter extends JsonAdapter	// class@000b3c from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public yf5 fromJson(b p0){
       CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter c;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter a = p0.a;
       boolean b = false;
       boolean b1 = (a != null)? a.booleanValue(): false;
       Boolean uBoolean = Boolean.valueOf(b1);
       uBoolean.getClass();
       jj5 ojj5 = new jj5(uBoolean);
       b1 = ((a = p0.b) != null)? a.booleanValue(): false;
       uBoolean = Boolean.valueOf(b1);
       uBoolean.getClass();
       jj5 ojj51 = new jj5(uBoolean);
       if ((c = p0.c) != null) {
          b = c.booleanValue();
       }
       Boolean uBoolean1 = Boolean.valueOf(b);
       uBoolean1.getClass();
       jj5 ojj52 = new jj5(uBoolean1);
       return new tu(ojj5, ojj51, ojj52);
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,yf5 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter playerOption = new CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter();
       playerOption.a = p1.b.f();
       playerOption.b = p1.c.f();
       playerOption.c = p1.d.f();
       this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter.class).toJson(p0, playerOption);
       return;
    }
}
