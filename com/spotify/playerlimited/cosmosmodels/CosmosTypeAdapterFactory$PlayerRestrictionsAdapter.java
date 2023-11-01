package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerRestrictionsAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter;
import java.lang.Class;
import java.util.Set;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;

public final class CosmosTypeAdapterFactory$PlayerRestrictionsAdapter extends JsonAdapter	// class@000b44 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayerRestrictionsAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayerRestrictions fromJson(b p0){
       Object obj = p0;
       co5.o(obj, "reader");
       if ((obj = this.moshi.c(CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter.class).fromJson(obj)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       PlayerRestrictions v24 = new PlayerRestrictions(obj.a, obj.b, obj.c, obj.d, obj.e, obj.f, obj.g, obj.h, obj.i, obj.j, obj.k, obj.l, obj.m, obj.n, obj.o, obj.p, obj.q, obj.r, obj.s, obj.t, obj.u);
       return v24;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerRestrictions p1){
       co5.o(p0, "writer");
       this.moshi.c(CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter.class).toJson(p0, new CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter());
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
