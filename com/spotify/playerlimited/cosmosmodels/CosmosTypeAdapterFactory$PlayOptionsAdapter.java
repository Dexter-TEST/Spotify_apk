package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayOptions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter;
import java.lang.Class;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import java.lang.Long;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import p.if5;
import p.jf5;
import p.hf5;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayOptionsAdapter extends JsonAdapter	// class@000b32 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayOptionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayOptions fromJson(b p0){
       PlayOptions p0;
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       p0 = new PlayOptions(p0.a, p0.m, p0.b, p0.c, p0.d, p0.e, p0.f, p0.g, p0.h, p0.i, p0.j, p0.k, p0.l);
       return p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayOptions p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter playOptionsA = new CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter();
       playOptionsA.a = p1.a;
       playOptionsA.b = p1.c;
       playOptionsA.c = p1.d;
       playOptionsA.d = p1.e;
       playOptionsA.e = p1.f;
       playOptionsA.f = p1.g;
       playOptionsA.g = p1.h;
       playOptionsA.h = p1.i;
       playOptionsA.i = p1.j;
       playOptionsA.j = p1.k;
       playOptionsA.k = p1.l;
       playOptionsA.l = p1.m;
       playOptionsA.m = p1.b;
       this.moshi.c(CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter.class).toJson(p0, playOptionsA);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
