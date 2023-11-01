package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerQueueAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerQueue;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter;
import java.lang.Class;
import com.spotify.player.legacyplayer.PlayerTrack;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerQueueAdapter extends JsonAdapter	// class@000b42 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerQueueAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerQueue fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter.class).fromJson(p0)) != null) {
          return new PlayerQueue(p0.a, p0.b, p0.c, p0.d);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerQueue p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter playerQueueA = new CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter();
       playerQueueA.a = p1.t;
       playerQueueA.b = p1.a;
       playerQueueA.c = p1.b;
       playerQueueA.d = p1.c;
       this.moshi.c(CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter.class).toJson(p0, playerQueueA);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
