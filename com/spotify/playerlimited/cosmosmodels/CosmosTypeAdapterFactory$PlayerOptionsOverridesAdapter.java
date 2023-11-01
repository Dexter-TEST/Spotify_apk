package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter$Adapter;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter extends JsonAdapter	// class@000b40 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerOptionsOverrides fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter$Adapter.class).fromJson(p0)) != null) {
          return PlayerOptionsOverrides.a(p0.a, p0.b, p0.c);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerOptionsOverrides p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter$Adapter playerOption = new CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter$Adapter();
       playerOption.a = p1.d();
       playerOption.b = p1.b();
       playerOption.c = p1.c();
       this.moshi.c(CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter$Adapter.class).toJson(p0, playerOption);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
