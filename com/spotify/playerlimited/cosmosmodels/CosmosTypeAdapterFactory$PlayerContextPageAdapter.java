package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextPageAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerContextPage;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextPageAdapter$Adapter;
import java.lang.Class;
import com.spotify.player.legacyplayer.PlayerTrack;
import java.util.Map;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerContextPageAdapter extends JsonAdapter	// class@000b3a from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerContextPageAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerContextPage fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerContextPageAdapter$Adapter.class).fromJson(p0)) != null) {
          return new PlayerContextPage(p0.a, p0.b, p0.c, p0.d);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerContextPage p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerContextPageAdapter$Adapter playerContex = new CosmosTypeAdapterFactory$PlayerContextPageAdapter$Adapter();
       playerContex.a = p1.a;
       playerContex.b = p1.b;
       playerContex.c = p1.c;
       playerContex.d = p1.t;
       this.moshi.c(CosmosTypeAdapterFactory$PlayerContextPageAdapter$Adapter.class).toJson(p0, playerContex);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
