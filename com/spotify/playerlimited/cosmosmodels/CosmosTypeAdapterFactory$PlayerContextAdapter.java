package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerContext;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter;
import java.lang.Class;
import java.util.Map;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.spotify.player.legacyplayer.PlayerContextPage;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerContextAdapter extends JsonAdapter	// class@000b38 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerContextAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerContext fromJson(b p0){
       CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter a;
       co5.o(p0, "reader");
       p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter.class).fromJson(p0);
       String str = "Required value was null.";
       if (p0 == null) {
          throw new IllegalStateException(str.toString());
       }
       if ((a = p0.a) == null) {
          throw new IllegalStateException(str.toString());
       }
       PlayerContext v8 = new PlayerContext(a, p0.b, p0.c, p0.d, p0.e, p0.f);
       return v8;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerContext p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter playerContex = new CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter();
       playerContex.a = p1.a;
       playerContex.b = p1.c;
       playerContex.c = p1.t;
       playerContex.d = p1.v;
       playerContex.e = p1.w;
       playerContex.f = p1.b;
       this.moshi.c(CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter.class).toJson(p0, playerContex);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
