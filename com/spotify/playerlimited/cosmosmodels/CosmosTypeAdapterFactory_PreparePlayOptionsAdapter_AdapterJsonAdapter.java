package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.util.Set;
import p.to;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.yf5;
import p.ni5;
import java.lang.Long;
import p.rl6;
import p.vw6;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b60 from classes.dex
{
    private final JsonAdapter nullableAudioStreamAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableMapOfStringAnyAdapter;
    private final JsonAdapter nullablePlayerOptionOverridesAdapter;
    private final JsonAdapter nullablePrefetchLevelAdapter;
    private final JsonAdapter nullableSkipToTrackAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableSuppressionsAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"always_play_something","audio_stream","configuration_override","initially_paused","license","playback_id","player_options_override","prefetch_level","seek_to","session_id","skip_to","suppressions","system_initiated"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"always_play_somethin…ons\", \"system_initiated\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Boolean.class, a, "alwaysPlaySomething");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…), \"alwaysPlaySomething\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
       jsonAdapter = p0.f(to.class, a, "audioStream");
       co5.l(jsonAdapter, "moshi.adapter\(AudioStrea…mptySet\(\), \"audioStream\"\)");
       this.nullableAudioStreamAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,Object.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "configurationOverride");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP… \"configurationOverride\"\)");
       this.nullableMapOfStringAnyAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "license");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…   emptySet\(\), \"license\"\)");
       this.nullableStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(yf5.class, a, "playerOptionsOverride");
       co5.l(jsonAdapter, "moshi.adapter\(PlayerOpti… \"playerOptionsOverride\"\)");
       this.nullablePlayerOptionOverridesAdapter = jsonAdapter;
       jsonAdapter = p0.f(ni5.class, a, "prefetchLevel");
       co5.l(jsonAdapter, "moshi.adapter\(PrefetchLe…tySet\(\), \"prefetchLevel\"\)");
       this.nullablePrefetchLevelAdapter = jsonAdapter;
       jsonAdapter = p0.f(Long.class, a, "seekTo");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…    emptySet\(\), \"seekTo\"\)");
       this.nullableLongAdapter = jsonAdapter;
       jsonAdapter = p0.f(rl6.class, a, "skipTo");
       co5.l(jsonAdapter, "moshi.adapter\(SkipToTrac…va, emptySet\(\), \"skipTo\"\)");
       this.nullableSkipToTrackAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(vw6.class, a, "suppressions");
       co5.l(jsonAdapter1, "moshi.adapter\(Suppressio…ptySet\(\), \"suppressions\"\)");
       this.nullableSuppressionsAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter fromJson(b p0){
       Boolean uBoolean2;
       CosmosTypeAdapterFactory_PreparePlayOptionsAdapter_AdapterJsonAdapter uCosmosTypeA = this;
       CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Boolean uBoolean = null;
       to oto = uBoolean;
       Map map = oto;
       Boolean uBoolean1 = map;
       String str = uBoolean1;
       String str1 = str;
       yf5 oyf5 = str1;
       ni5 oni5 = oyf5;
       Long longx = oni5;
       String str2 = longx;
       rl6 orl6 = str2;
       vw6 ovw6 = orl6;
       int i = ovw6;
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
       int i11 = 0;
       int i12 = 0;
       int i13 = 0;
       while (p0.T()) {
          uBoolean2 = i;
          switch (obj.v0(uCosmosTypeA.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00f9 :
                i = uBoolean2;
                break;
              case 0:
                uBoolean = uCosmosTypeA.nullableBooleanAdapter.fromJson(obj);
                i = uBoolean2;
                i1 = 1;
                break;
              case 1:
                oto = uCosmosTypeA.nullableAudioStreamAdapter.fromJson(obj);
                i = uBoolean2;
                i2 = 1;
                break;
              case 2:
                map = uCosmosTypeA.nullableMapOfStringAnyAdapter.fromJson(obj);
                i = uBoolean2;
                i3 = 1;
                break;
              case 3:
                uBoolean1 = uCosmosTypeA.nullableBooleanAdapter.fromJson(obj);
                i = uBoolean2;
                i4 = 1;
                break;
              case 4:
                str = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = uBoolean2;
                i5 = 1;
                break;
              case 5:
                str1 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = uBoolean2;
                i6 = 1;
                break;
              case 6:
                oyf5 = uCosmosTypeA.nullablePlayerOptionOverridesAdapter.fromJson(obj);
                i = uBoolean2;
                i7 = 1;
                break;
              case 7:
                oni5 = uCosmosTypeA.nullablePrefetchLevelAdapter.fromJson(obj);
                i = uBoolean2;
                i8 = 1;
                break;
              case 8:
                longx = uCosmosTypeA.nullableLongAdapter.fromJson(obj);
                i = uBoolean2;
                i9 = 1;
                break;
              case 9:
                str2 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = uBoolean2;
                i10 = 1;
                break;
              case 10:
                orl6 = uCosmosTypeA.nullableSkipToTrackAdapter.fromJson(obj);
                i = uBoolean2;
                i11 = 1;
                break;
              case 11:
                ovw6 = uCosmosTypeA.nullableSuppressionsAdapter.fromJson(obj);
                i = uBoolean2;
                i12 = 1;
                break;
              case 12:
                i = uCosmosTypeA.nullableBooleanAdapter.fromJson(obj);
                i13 = 1;
                break;
              default:
                goto label_00f9 ;
          }
       }
       uBoolean2 = i;
       p0.y();
       obj = new CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter();
       if (i1) {
          obj.b = uBoolean;
       }
       if (i2) {
          obj.j = oto;
       }
       if (i3) {
          obj.m = map;
       }
       if (i4) {
          obj.e = uBoolean1;
       }
       if (i5) {
          obj.l = str;
       }
       if (i6) {
          obj.a = str1;
       }
       if (i7) {
          obj.g = oyf5;
       }
       if (i8) {
          obj.i = oni5;
       }
       if (i9) {
          obj.d = longx;
       }
       if (i10) {
          obj.k = str2;
       }
       if (i11) {
          obj.c = orl6;
       }
       if (i12) {
          obj.h = ovw6;
       }
       if (i13) {
          obj.f = uBoolean2;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PreparePlayOptionsAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("always_play_something");
       this.nullableBooleanAdapter.toJson(p0, p1.b);
       p0.l0("audio_stream");
       this.nullableAudioStreamAdapter.toJson(p0, p1.j);
       p0.l0("configuration_override");
       this.nullableMapOfStringAnyAdapter.toJson(p0, p1.m);
       p0.l0("initially_paused");
       this.nullableBooleanAdapter.toJson(p0, p1.e);
       p0.l0("license");
       this.nullableStringAdapter.toJson(p0, p1.l);
       p0.l0("playback_id");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("player_options_override");
       this.nullablePlayerOptionOverridesAdapter.toJson(p0, p1.g);
       p0.l0("prefetch_level");
       this.nullablePrefetchLevelAdapter.toJson(p0, p1.i);
       p0.l0("seek_to");
       this.nullableLongAdapter.toJson(p0, p1.d);
       p0.l0("session_id");
       this.nullableStringAdapter.toJson(p0, p1.k);
       p0.l0("skip_to");
       this.nullableSkipToTrackAdapter.toJson(p0, p1.c);
       p0.l0("suppressions");
       this.nullableSuppressionsAdapter.toJson(p0, p1.h);
       p0.l0("system_initiated");
       this.nullableBooleanAdapter.toJson(p0, p1.f);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(80, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PreparePlayOptionsAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
