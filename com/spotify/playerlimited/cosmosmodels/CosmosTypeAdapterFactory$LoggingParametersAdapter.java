package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$LoggingParametersAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.LoggingParameters;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$LoggingParametersAdapter$Adapter;
import java.lang.Class;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$LoggingParametersAdapter extends JsonAdapter	// class@000b2e from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$LoggingParametersAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public LoggingParameters fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$LoggingParametersAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       LoggingParameters loggingParam = new LoggingParameters();
       loggingParam.a = p0.a;
       return loggingParam;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoggingParameters p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$LoggingParametersAdapter$Adapter loggingParam = new CosmosTypeAdapterFactory$LoggingParametersAdapter$Adapter();
       loggingParam.a = p1.a;
       this.moshi.c(CosmosTypeAdapterFactory$LoggingParametersAdapter$Adapter.class).toJson(p0, loggingParam);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
