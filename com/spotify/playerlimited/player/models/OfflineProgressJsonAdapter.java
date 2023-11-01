package com.spotify.playerlimited.player.models.OfflineProgressJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Integer;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Float;
import java.lang.Long;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.OfflineProgress;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class OfflineProgressJsonAdapter extends JsonAdapter	// class@000b77 from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableFloatAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final b$b options;

    public void OfflineProgressJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"download_speed","percent_complete","queued_bytes","queued_tracks","seconds_left","synced_bytes","synced_tracks","syncing","total_bytes","total_tracks"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"download_speed\",\n   …l_bytes\", \"total_tracks\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.class, a, "downloadSpeed");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…tySet\(\), \"downloadSpeed\"\)");
       this.nullableIntAdapter = jsonAdapter;
       jsonAdapter = p0.f(Float.class, a, "percentComplete");
       co5.l(jsonAdapter, "moshi.adapter\(Float::cla…Set\(\), \"percentComplete\"\)");
       this.nullableFloatAdapter = jsonAdapter;
       jsonAdapter = p0.f(Long.class, a, "queuedBytes");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…mptySet\(\), \"queuedBytes\"\)");
       this.nullableLongAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.class, a, "syncing");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…e, emptySet\(\), \"syncing\"\)");
       this.nullableBooleanAdapter = jsonAdapter1;
    }
    public OfflineProgress fromJson(b p0){
       Integer integer3;
       OfflineProgressJsonAdapter offlineProgr = this;
       OfflineProgress obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Integer integer = null;
       Float uFloat = integer;
       Long longx = uFloat;
       Integer integer1 = longx;
       Long longx1 = integer1;
       Long longx2 = longx1;
       Integer integer2 = longx2;
       Boolean uBoolean = integer2;
       Long longx3 = uBoolean;
       int i = longx3;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       int i10 = 0;
       while (p0.T()) {
          integer3 = i;
          switch (obj.v0(offlineProgr.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00c0 :
                i = integer3;
                break;
              case 0:
                integer = offlineProgr.nullableIntAdapter.fromJson(obj);
                i = integer3;
                i1 = 1;
                break;
              case 1:
                uFloat = offlineProgr.nullableFloatAdapter.fromJson(obj);
                i = integer3;
                i2 = 1;
                break;
              case 2:
                longx = offlineProgr.nullableLongAdapter.fromJson(obj);
                i = integer3;
                i3 = 1;
                break;
              case 3:
                integer1 = offlineProgr.nullableIntAdapter.fromJson(obj);
                i = integer3;
                i4 = 1;
                break;
              case 4:
                longx1 = offlineProgr.nullableLongAdapter.fromJson(obj);
                i = integer3;
                i5 = 1;
                break;
              case 5:
                longx2 = offlineProgr.nullableLongAdapter.fromJson(obj);
                i = integer3;
                i6 = 1;
                break;
              case 6:
                integer2 = offlineProgr.nullableIntAdapter.fromJson(obj);
                i = integer3;
                i7 = 1;
                break;
              case 7:
                uBoolean = offlineProgr.nullableBooleanAdapter.fromJson(obj);
                i = integer3;
                i8 = 1;
                break;
              case 8:
                longx3 = offlineProgr.nullableLongAdapter.fromJson(obj);
                i = integer3;
                i9 = 1;
                break;
              case 9:
                i = offlineProgr.nullableIntAdapter.fromJson(obj);
                i10 = 1;
                break;
              default:
                goto label_00c0 ;
          }
       }
       integer3 = i;
       p0.y();
       obj = new OfflineProgress();
       if (i1) {
          obj.h = integer;
       }
       if (i2) {
          obj.i = uFloat;
       }
       if (i3) {
          obj.b = longx;
       }
       if (i4) {
          obj.a = integer1;
       }
       if (i5) {
          obj.j = longx1;
       }
       if (i6) {
          obj.d = longx2;
       }
       if (i7) {
          obj.c = integer2;
       }
       if (i8) {
          obj.g = uBoolean;
       }
       if (i9) {
          obj.f = longx3;
       }
       if (i10) {
          obj.e = integer3;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,OfflineProgress p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("download_speed");
       this.nullableIntAdapter.toJson(p0, p1.h);
       p0.l0("percent_complete");
       this.nullableFloatAdapter.toJson(p0, p1.i);
       p0.l0("queued_bytes");
       this.nullableLongAdapter.toJson(p0, p1.b);
       p0.l0("queued_tracks");
       this.nullableIntAdapter.toJson(p0, p1.a);
       p0.l0("seconds_left");
       this.nullableLongAdapter.toJson(p0, p1.j);
       p0.l0("synced_bytes");
       this.nullableLongAdapter.toJson(p0, p1.d);
       p0.l0("synced_tracks");
       this.nullableIntAdapter.toJson(p0, p1.c);
       p0.l0("syncing");
       this.nullableBooleanAdapter.toJson(p0, p1.g);
       p0.l0("total_bytes");
       this.nullableLongAdapter.toJson(p0, p1.f);
       p0.l0("total_tracks");
       this.nullableIntAdapter.toJson(p0, p1.e);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(37, "GeneratedJsonAdapter\(OfflineProgress\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
