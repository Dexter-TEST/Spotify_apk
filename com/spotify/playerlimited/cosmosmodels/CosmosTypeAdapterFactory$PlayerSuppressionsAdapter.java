package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerSuppressionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter;
import java.lang.Class;
import java.util.Set;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayerSuppressionsAdapter extends JsonAdapter	// class@000b46 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerSuppressionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerSuppressions fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter.class).fromJson(p0)) != null) {
          return new PlayerSuppressions(p0.a);
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerSuppressions p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter playerSuppre = new CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter();
       playerSuppre.a = p1.a;
       this.moshi.c(CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter.class).toJson(p0, playerSuppre);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
