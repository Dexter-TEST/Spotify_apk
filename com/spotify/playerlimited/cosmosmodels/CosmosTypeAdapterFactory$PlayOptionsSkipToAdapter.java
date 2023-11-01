package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter;
import java.lang.Class;
import java.lang.Integer;
import java.lang.IllegalStateException;
import com.squareup.moshi.i;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter extends JsonAdapter	// class@000b34 from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public PlayOptionsSkipTo fromJson(b p0){
       co5.o(p0, "reader");
       if ((p0 = this.moshi.c(CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter.class).fromJson(p0)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       PlayOptionsSkipTo v6 = new PlayOptionsSkipTo(p0.a, p0.b, p0.c, p0.d, p0.e);
       return v6;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayOptionsSkipTo p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter playOptionsS = new CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter();
       playOptionsS.a = p1.a;
       playOptionsS.b = p1.b;
       playOptionsS.c = p1.c;
       playOptionsS.d = p1.t;
       playOptionsS.e = p1.v;
       this.moshi.c(CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter.class).toJson(p0, playOptionsS);
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
}
