package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$TriggerAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.b;
import java.lang.Object;
import p.jf5;
import java.lang.String;
import p.co5;
import com.squareup.moshi.i;
import p.px0;
import java.lang.Enum;

public final class CosmosTypeAdapterFactory$TriggerAdapter extends JsonAdapter	// class@000b50 from classes.dex
{

    public void CosmosTypeAdapterFactory$TriggerAdapter(){
       super();
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public jf5 fromJson(b p0){
       co5.o(p0, "reader");
       String str = p0.o0();
       jf5 a = jf5.a;
       if (str != null) {
          if (!str.equals("advanced_past_track")) {
             if (str.equals("advanced_past_context")) {
                a = jf5.c;
             }
          }else {
             a = jf5.b;
          }
       }
       return a;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,jf5 p1){
       co5.o(p0, "writer");
       int i = (p1 == null)? -1: px0.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                p0.y0("advanced_past_context");
             }
          }else {
             p0.y0("advanced_past_track");
          }
       }else {
          p0.y0("immediately");
       }
       return;
    }
}
