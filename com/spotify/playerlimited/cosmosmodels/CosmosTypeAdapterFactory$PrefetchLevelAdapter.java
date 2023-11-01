package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PrefetchLevelAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.ni5;
import com.squareup.moshi.i;
import p.ox0;
import java.lang.Enum;

public final class CosmosTypeAdapterFactory$PrefetchLevelAdapter extends JsonAdapter	// class@000b47 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PrefetchLevelAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public ni5 fromJson(b p0){
       co5.o(p0, "reader");
       return this.fromString$src_main_java_com_spotify_playerlimited_cosmosmodels_cosmosmodels_kt(p0.o0());
    }
    public final ni5 fromString$src_main_java_com_spotify_playerlimited_cosmosmodels_cosmosmodels_kt(String p0){
       ni5 a = ni5.a;
       if (co5.c(p0, "none")) {
       }else if(co5.c(p0, "media")){
          a = ni5.b;
       }
       return a;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,ni5 p1){
       co5.o(p0, "writer");
       int i = (p1 == null)? -1: ox0.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             p0.y0("media");
          }
       }else {
          p0.y0("none");
       }
       return;
    }
}
