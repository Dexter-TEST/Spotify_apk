package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$AudioStreamAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.b;
import java.lang.Object;
import p.hf5;
import java.lang.String;
import p.co5;
import com.squareup.moshi.i;
import p.lx0;
import java.lang.Enum;

public final class CosmosTypeAdapterFactory$AudioStreamAdapter extends JsonAdapter	// class@000b26 from classes.dex
{

    public void CosmosTypeAdapterFactory$AudioStreamAdapter(){
       super();
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public hf5 fromJson(b p0){
       co5.o(p0, "reader");
       String str = p0.o0();
       hf5 a = hf5.a;
       if (str != null) {
          if (!str.equals("alarm")) {
             str.equals("default");
          }else {
             a = hf5.b;
          }
       }
       return a;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,hf5 p1){
       co5.o(p0, "writer");
       int i = (p1 == null)? -1: lx0.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             p0.y0("default");
          }
       }else {
          p0.y0("alarm");
       }
       return;
    }
}
