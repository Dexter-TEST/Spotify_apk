package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ModelAudioStreamAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.b;
import java.lang.Object;
import p.to;
import java.lang.String;
import p.co5;
import com.squareup.moshi.i;
import p.mx0;
import java.lang.Enum;

public final class CosmosTypeAdapterFactory$ModelAudioStreamAdapter extends JsonAdapter	// class@000b2f from classes.dex
{

    public void CosmosTypeAdapterFactory$ModelAudioStreamAdapter(){
       super();
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public to fromJson(b p0){
       co5.o(p0, "reader");
       return this.fromString$src_main_java_com_spotify_playerlimited_cosmosmodels_cosmosmodels_kt(p0.o0());
    }
    public final to fromString$src_main_java_com_spotify_playerlimited_cosmosmodels_cosmosmodels_kt(String p0){
       to b;
       if (co5.c(p0, "alarm")) {
          b = to.b;
       }else {
          boolean b1 = co5.c(p0, "default");
          b = to.a;
       }
       return b;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,to p1){
       co5.o(p0, "writer");
       int i = (p1 == null)? -1: mx0.a[p1.ordinal()];
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
