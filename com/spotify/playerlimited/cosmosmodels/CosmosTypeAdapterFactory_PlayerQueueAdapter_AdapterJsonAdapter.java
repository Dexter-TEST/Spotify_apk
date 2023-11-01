package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerQueueAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import com.spotify.player.legacyplayer.PlayerTrack;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerQueueAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b5d from classes.dex
{
    private final JsonAdapter nullableArrayOfPlayerTrackAdapter;
    private final JsonAdapter nullablePlayerTrackAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerQueueAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"next_tracks","prev_tracks","revision","track"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"next_tracks\", \"prev_…     \"revision\", \"track\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.b(PlayerTrack.class), a, "nextTracks");
       co5.l(jsonAdapter, "moshi.adapter\(Types.arra…emptySet\(\), \"nextTracks\"\)");
       this.nullableArrayOfPlayerTrackAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "revision");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…  emptySet\(\), \"revision\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(PlayerTrack.class, a, "track");
       co5.l(jsonAdapter1, "moshi.adapter\(PlayerTrac…ava, emptySet\(\), \"track\"\)");
       this.nullablePlayerTrackAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter fromJson(b p0){
       int i4;
       co5.o(p0, "reader");
       p0.f();
       PlayerTrack[] playerTrackA = null;
       PlayerTrack[] playerTrackA1 = playerTrackA;
       String str = playerTrackA1;
       PlayerTrack playerTrack = str;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (p0.T()) {
          if ((i4 = p0.v0(this.options)) != -1) {
             int i5 = 1;
             if (i4) {
                if (i4 != i5) {
                   if (i4 != 2) {
                      if (i4 != 3) {
                         continue ;
                      }
                   }else {
                      str = this.nullableStringAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   playerTrackA1 = this.nullableArrayOfPlayerTrackAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                playerTrackA = this.nullableArrayOfPlayerTrackAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          playerTrack = this.nullablePlayerTrackAdapter.fromJson(p0);
          i3 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter playerQueueA = new CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter();
       if (i) {
          playerQueueA.c = playerTrackA;
       }
       if (i1) {
          playerQueueA.d = playerTrackA1;
       }
       if (i2) {
          playerQueueA.a = str;
       }
       if (i3) {
          playerQueueA.b = playerTrack;
       }
       return playerQueueA;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerQueueAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("next_tracks");
       this.nullableArrayOfPlayerTrackAdapter.toJson(p0, p1.c);
       p0.l0("prev_tracks");
       this.nullableArrayOfPlayerTrackAdapter.toJson(p0, p1.d);
       p0.l0("revision");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("track");
       this.nullablePlayerTrackAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(73, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerQueueAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
