package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayOptionsAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Boolean;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import p.hf5;
import p.if5;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import java.lang.Long;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import p.jf5;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayOptionsAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b55 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableAudioStreamAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableOperationAdapter;
    private final JsonAdapter nullablePlayOptionsSkipToAdapter;
    private final JsonAdapter nullablePlayerOptionsOverridesAdapter;
    private final JsonAdapter nullablePlayerSuppressionsAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTriggerAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayOptionsAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"allow_seeking","always_play_something","audio_stream","initially_paused","operation","override_restrictions","playback_id","player_options_override","seek_to","skip_to","suppressions","system_initiated","trigger"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"allow_seeking\",\n    …em_initiated\", \"trigger\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Boolean.TYPE, a, "allowSeeking");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…(\),\n      \"allowSeeking\"\)");
       this.booleanAdapter = jsonAdapter;
       jsonAdapter = p0.f(hf5.class, a, "audioStream");
       co5.l(jsonAdapter, "moshi.adapter\(PlayOption…mptySet\(\), \"audioStream\"\)");
       this.nullableAudioStreamAdapter = jsonAdapter;
       jsonAdapter = p0.f(if5.class, a, "operation");
       co5.l(jsonAdapter, "moshi.adapter\(PlayOption… emptySet\(\), \"operation\"\)");
       this.nullableOperationAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "playbackId");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\), \"playbackId\"\)");
       this.nullableStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(PlayerOptionsOverrides.class, a, "playerOptionsOverride");
       co5.l(jsonAdapter, "moshi.adapter\(PlayerOpti… \"playerOptionsOverride\"\)");
       this.nullablePlayerOptionsOverridesAdapter = jsonAdapter;
       jsonAdapter = p0.f(Long.class, a, "seekTo");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…    emptySet\(\), \"seekTo\"\)");
       this.nullableLongAdapter = jsonAdapter;
       jsonAdapter = p0.f(PlayOptionsSkipTo.class, a, "skipTo");
       co5.l(jsonAdapter, "moshi.adapter\(PlayOption…va, emptySet\(\), \"skipTo\"\)");
       this.nullablePlayOptionsSkipToAdapter = jsonAdapter;
       jsonAdapter = p0.f(PlayerSuppressions.class, a, "suppressions");
       co5.l(jsonAdapter, "moshi.adapter\(PlayerSupp…ptySet\(\), \"suppressions\"\)");
       this.nullablePlayerSuppressionsAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(jf5.class, a, "trigger");
       co5.l(jsonAdapter1, "moshi.adapter\(PlayOption…a, emptySet\(\), \"trigger\"\)");
       this.nullableTriggerAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter fromJson(b p0){
       jf5 ojf5;
       CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter playOptionsA;
       CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter j;
       CosmosTypeAdapterFactory_PlayOptionsAdapter_AdapterJsonAdapter uCosmosTypeA = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Boolean uBoolean = null;
       Boolean uBoolean1 = uBoolean;
       hf5 ohf5 = uBoolean1;
       Boolean uBoolean2 = ohf5;
       if5 oif5 = uBoolean2;
       Boolean uBoolean3 = oif5;
       String str = uBoolean3;
       PlayerOptionsOverrides playerOption = str;
       Long longx = playerOption;
       PlayOptionsSkipTo playOptionsS = longx;
       PlayerSuppressions playerSuppre = playOptionsS;
       Boolean uBoolean4 = playerSuppre;
       int i = uBoolean4;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       while (true) {
          if (p0.T()) {
             ojf5 = i;
             switch (obj.v0(uCosmosTypeA.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_012a :
                   i = ojf5;
                   break;
                 case 0:
                   if ((uBoolean = uCosmosTypeA.booleanAdapter.fromJson(obj)) != null) {
                      goto label_012a ;
                   }else {
                      obj = ve7.w("allowSeeking", "allow_seeking", obj);
                      co5.l(obj, "unexpectedNull\(\"allowSee… \"allow_seeking\", reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   if ((uBoolean1 = uCosmosTypeA.booleanAdapter.fromJson(obj)) != null) {
                      goto label_012a ;
                   }else {
                      obj = ve7.w("alwaysPlaySomething", "always_play_something", obj);
                      co5.l(obj, "unexpectedNull\(\"alwaysPl…_play_something\", reader\)");
                      throw obj;
                   }
                   break;
                 case 2:
                   ohf5 = uCosmosTypeA.nullableAudioStreamAdapter.fromJson(obj);
                   i = ojf5;
                   i1 = 1;
                   break;
                 case 3:
                   if ((uBoolean2 = uCosmosTypeA.booleanAdapter.fromJson(obj)) != null) {
                      goto label_012a ;
                   }else {
                      obj = ve7.w("initiallyPaused", "initially_paused", obj);
                      co5.l(obj, "unexpectedNull\(\"initiall…nitially_paused\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   oif5 = uCosmosTypeA.nullableOperationAdapter.fromJson(obj);
                   i = ojf5;
                   i2 = 1;
                   break;
                 case 5:
                   if ((uBoolean3 = uCosmosTypeA.booleanAdapter.fromJson(obj)) != null) {
                      goto label_012a ;
                   }else {
                      obj = ve7.w("overrideRestrictions", "override_restrictions", obj);
                      co5.l(obj, "unexpectedNull\(\"override…de_restrictions\", reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   str = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                   i = ojf5;
                   i3 = 1;
                   break;
                 case 7:
                   playerOption = uCosmosTypeA.nullablePlayerOptionsOverridesAdapter.fromJson(obj);
                   i = ojf5;
                   i4 = 1;
                   break;
                 case 8:
                   longx = uCosmosTypeA.nullableLongAdapter.fromJson(obj);
                   i = ojf5;
                   i5 = 1;
                   break;
                 case 9:
                   playOptionsS = uCosmosTypeA.nullablePlayOptionsSkipToAdapter.fromJson(obj);
                   i = ojf5;
                   i6 = 1;
                   break;
                 case 10:
                   playerSuppre = uCosmosTypeA.nullablePlayerSuppressionsAdapter.fromJson(obj);
                   i = ojf5;
                   i7 = 1;
                   break;
                 case 11:
                   if ((uBoolean4 = uCosmosTypeA.booleanAdapter.fromJson(obj)) != null) {
                      goto label_012a ;
                   }else {
                      obj = ve7.w("systemInitiated", "system_initiated", obj);
                      co5.l(obj, "unexpectedNull\(\"systemIn…ystem_initiated\", reader\)");
                      throw obj;
                   }
                   break;
                 case 12:
                   i = uCosmosTypeA.nullableTriggerAdapter.fromJson(obj);
                   i8 = 1;
                   break;
                 default:
                   goto label_012a ;
             }
          }else {
             ojf5 = i;
             p0.y();
             playOptionsA = new CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter();
             boolean b = (uBoolean != null)? uBoolean.booleanValue(): playOptionsA.f;
             playOptionsA.f = b;
             b = (uBoolean1 != null)? uBoolean1.booleanValue(): playOptionsA.m;
             playOptionsA.m = b;
             if (i1) {
                playOptionsA.k = ohf5;
             }
             b = (uBoolean2 != null)? uBoolean2.booleanValue(): playOptionsA.c;
             playOptionsA.c = b;
             if (i2) {
                playOptionsA.g = oif5;
             }
             b = (uBoolean3 != null)? uBoolean3.booleanValue(): playOptionsA.l;
             playOptionsA.l = b;
             if (i3) {
                playOptionsA.i = str;
             }
             if (i4) {
                playOptionsA.d = playerOption;
             }
             if (i5) {
                playOptionsA.b = longx;
             }
             if (i6) {
                playOptionsA.a = playOptionsS;
             }
             if (i7) {
                playOptionsA.e = playerSuppre;
             }
             b = (uBoolean4 != null)? uBoolean4.booleanValue(): playOptionsA.j;
             playOptionsA.j = b;
             if (i8) {
                playOptionsA.h = ojf5;
                break ;
             }
             break ;
          }
       }
       return playOptionsA;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayOptionsAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("allow_seeking");
       kg4.x(p1.f, this.booleanAdapter, p0, "always_play_something");
       kg4.x(p1.m, this.booleanAdapter, p0, "audio_stream");
       this.nullableAudioStreamAdapter.toJson(p0, p1.k);
       p0.l0("initially_paused");
       kg4.x(p1.c, this.booleanAdapter, p0, "operation");
       this.nullableOperationAdapter.toJson(p0, p1.g);
       p0.l0("override_restrictions");
       kg4.x(p1.l, this.booleanAdapter, p0, "playback_id");
       this.nullableStringAdapter.toJson(p0, p1.i);
       p0.l0("player_options_override");
       this.nullablePlayerOptionsOverridesAdapter.toJson(p0, p1.d);
       p0.l0("seek_to");
       this.nullableLongAdapter.toJson(p0, p1.b);
       p0.l0("skip_to");
       this.nullablePlayOptionsSkipToAdapter.toJson(p0, p1.a);
       p0.l0("suppressions");
       this.nullablePlayerSuppressionsAdapter.toJson(p0, p1.e);
       p0.l0("system_initiated");
       kg4.x(p1.j, this.booleanAdapter, p0, "trigger");
       this.nullableTriggerAdapter.toJson(p0, p1.h);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(73, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayOptionsAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
