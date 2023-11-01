package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerOptions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter;
import java.lang.Class;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerOptionsAdapter extends JsonAdapter	// class@000b3e from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerOptionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerOptions fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter.class).fromJson(p0)) != null) {
          return PlayerOptions.a(p0.a, p0.b, p0.c);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerOptions p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter playerOption = new CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter();
       playerOption.a = p1.d();
       playerOption.b = p1.b();
       playerOption.c = p1.c();
       this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter.class).toJson(p0, playerOption);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
