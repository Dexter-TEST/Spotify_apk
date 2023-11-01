package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SuppressionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.vw6;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter;
import java.lang.Class;
import java.util.Set;
import p.uv;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$SuppressionsAdapter extends JsonAdapter	// class@000b4f from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$SuppressionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public vw6 fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter.class).fromJson(p0)) != null) {
          return vw6.a(p0.a);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,vw6 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter suppressions = new CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter();
       suppressions.a = p1.b;
       this.moshi.c(CosmosTypeAdapterFactory$SuppressionsAdapter$Adapter.class).toJson(p0, suppressions);
       return;
    }
}
