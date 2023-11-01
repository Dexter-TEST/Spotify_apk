package com.spotify.webapi.service.models.AudioFeaturesTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Float;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Integer;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.AudioFeaturesTrack;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class AudioFeaturesTrackJsonAdapter extends JsonAdapter	// class@000c75 from classes.dex
{
    private final JsonAdapter floatAdapter;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void AudioFeaturesTrackJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"acousticness","analysis_url","danceability","duration_ms","energy","id","instrumentalness","key","liveness","loudness","mode","speechiness","tempo","time_signature","track_href","type","uri","valence"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"acousticness\", \"anal…, \"uri\",\n      \"valence\"\)");
       i.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(Float.TYPE, a, "acousticness");
       co5.l(jsonAdapter, "moshi.adapter\(Float::cla…(\),\n      \"acousticness\"\)");
       i.floatAdapter = jsonAdapter;
       jsonAdapter = obj.f(String.class, a, "analysis_url");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ptySet\(\), \"analysis_url\"\)");
       i.nullableStringAdapter = jsonAdapter;
       obj = obj.f(Integer.TYPE, a, "duration_ms");
       co5.l(obj, "moshi.adapter\(Int::class…t\(\),\n      \"duration_ms\"\)");
       i.intAdapter = obj;
    }
    public AudioFeaturesTrack fromJson(b p0){
       Integer integer3;
       AudioFeaturesTrack uAudioFeatur1;
       float f;
       AudioFeaturesTrack valence;
       AudioFeaturesTrackJsonAdapter uAudioFeatur = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Float uFloat = null;
       String str = uFloat;
       Float uFloat1 = str;
       Integer integer = uFloat1;
       Float uFloat2 = integer;
       String str1 = uFloat2;
       Float uFloat3 = str1;
       Integer integer1 = uFloat3;
       Float uFloat4 = integer1;
       Float uFloat5 = uFloat4;
       Integer integer2 = uFloat5;
       Float uFloat6 = integer2;
       Float uFloat7 = uFloat6;
       int i = uFloat7;
       int i1 = i;
       int i2 = i1;
       int i3 = i2;
       Float uFloat8 = i3;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       while (true) {
          if (p0.T()) {
             integer3 = i;
             switch (obj.v0(uAudioFeatur.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_01c6 :
                   i = integer3;
                   break;
                 case 0:
                   if ((uFloat = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("acousticness", "acousticness", obj);
                      co5.l(obj, "unexpectedNull\(\"acoustic…, \"acousticness\", reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   str = uAudioFeatur.nullableStringAdapter.fromJson(obj);
                   i = integer3;
                   i4 = 1;
                   break;
                 case 2:
                   if ((uFloat1 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("danceability", "danceability", obj);
                      co5.l(obj, "unexpectedNull\(\"danceabi…, \"danceability\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   if ((integer = uAudioFeatur.intAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("duration_ms", "duration_ms", obj);
                      co5.l(obj, "unexpectedNull\(\"duration…   \"duration_ms\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   if ((uFloat2 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("energy", "energy", obj);
                      co5.l(obj, "unexpectedNull\(\"energy\",…rgy\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 5:
                   str1 = uAudioFeatur.nullableStringAdapter.fromJson(obj);
                   i = integer3;
                   i5 = 1;
                   break;
                 case 6:
                   if ((uFloat3 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("instrumentalness", "instrumentalness", obj);
                      co5.l(obj, "unexpectedNull\(\"instrume…nstrumentalness\", reader\)");
                      throw obj;
                   }
                   break;
                 case 7:
                   if ((integer1 = uAudioFeatur.intAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("key", "key", obj);
                      co5.l(obj, "unexpectedNull\(\"key\", \"key\", reader\)");
                      throw obj;
                   }
                   break;
                 case 8:
                   if ((uFloat4 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("liveness", "liveness", obj);
                      co5.l(obj, "unexpectedNull\(\"liveness…      \"liveness\", reader\)");
                      throw obj;
                   }
                   break;
                 case 9:
                   if ((uFloat5 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("loudness", "loudness", obj);
                      co5.l(obj, "unexpectedNull\(\"loudness…      \"loudness\", reader\)");
                      throw obj;
                   }
                   break;
                 case 10:
                   if ((integer2 = uAudioFeatur.intAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("mode", "mode", obj);
                      co5.l(obj, "unexpectedNull\(\"mode\", \"mode\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 11:
                   if ((uFloat6 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("speechiness", "speechiness", obj);
                      co5.l(obj, "unexpectedNull\(\"speechin…", \"speechiness\", reader\)");
                      throw obj;
                   }
                   break;
                 case 12:
                   if ((uFloat7 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("tempo", "tempo", obj);
                      co5.l(obj, "unexpectedNull\(\"tempo\", …mpo\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 13:
                   if ((i = uAudioFeatur.intAdapter.fromJson(obj)) != null) {
                      continue ;
                   }else {
                      obj = ve7.w("time_signature", "time_signature", obj);
                      co5.l(obj, "unexpectedNull\(\"time_sig…"time_signature\", reader\)");
                      throw obj;
                   }
                   break;
                 case 14:
                   i1 = uAudioFeatur.nullableStringAdapter.fromJson(obj);
                   i = integer3;
                   i6 = 1;
                   break;
                 case 15:
                   i2 = uAudioFeatur.nullableStringAdapter.fromJson(obj);
                   i = integer3;
                   i7 = 1;
                   break;
                 case 16:
                   i3 = uAudioFeatur.nullableStringAdapter.fromJson(obj);
                   i = integer3;
                   i8 = 1;
                   break;
                 case 17:
                   if ((uFloat8 = uAudioFeatur.floatAdapter.fromJson(obj)) != null) {
                      goto label_01c6 ;
                   }else {
                      obj = ve7.w("valence", "valence", obj);
                      co5.l(obj, "unexpectedNull\(\"valence\"…       \"valence\", reader\)");
                      throw obj;
                   }
                   break;
                 default:
                   goto label_01c6 ;
             }
          }else {
             integer3 = i;
             p0.y();
             uAudioFeatur1 = new AudioFeaturesTrack();
             f = (uFloat != null)? uFloat.floatValue(): uAudioFeatur1.acousticness;
             uAudioFeatur1.acousticness = f;
             if (i4) {
                uAudioFeatur1.analysis_url = str;
             }
             f = (uFloat1 != null)? uFloat1.floatValue(): uAudioFeatur1.danceability;
             uAudioFeatur1.danceability = f;
             int i9 = (integer != null)? integer.intValue(): uAudioFeatur1.duration_ms;
             uAudioFeatur1.duration_ms = i9;
             f = (uFloat2 != null)? uFloat2.floatValue(): uAudioFeatur1.energy;
             uAudioFeatur1.energy = f;
             if (i5) {
                uAudioFeatur1.id = str1;
             }
             f = (uFloat3 != null)? uFloat3.floatValue(): uAudioFeatur1.instrumentalness;
             uAudioFeatur1.instrumentalness = f;
             i9 = (integer1 != null)? integer1.intValue(): uAudioFeatur1.key;
             uAudioFeatur1.key = i9;
             f = (uFloat4 != null)? uFloat4.floatValue(): uAudioFeatur1.liveness;
             uAudioFeatur1.liveness = f;
             f = (uFloat5 != null)? uFloat5.floatValue(): uAudioFeatur1.loudness;
             uAudioFeatur1.loudness = f;
             i9 = (integer2 != null)? integer2.intValue(): uAudioFeatur1.mode;
             uAudioFeatur1.mode = i9;
             f = (uFloat6 != null)? uFloat6.floatValue(): uAudioFeatur1.speechiness;
             uAudioFeatur1.speechiness = f;
             f = (uFloat7 != null)? uFloat7.floatValue(): uAudioFeatur1.tempo;
             uAudioFeatur1.tempo = f;
             i9 = (integer3 != null)? integer3.intValue(): uAudioFeatur1.time_signature;
             uAudioFeatur1.time_signature = i9;
             if (i6) {
                uAudioFeatur1.track_href = i1;
             }
             if (i7) {
                uAudioFeatur1.type = i2;
             }
             if (i8) {
                uAudioFeatur1.uri = i3;
             }
             f = (uFloat8 != null)? uFloat8.floatValue(): uAudioFeatur1.valence;
             break ;
          }
       }
       uAudioFeatur1.valence = f;
       return uAudioFeatur1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,AudioFeaturesTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("acousticness");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.acousticness));
       p0.l0("analysis_url");
       this.nullableStringAdapter.toJson(p0, p1.analysis_url);
       p0.l0("danceability");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.danceability));
       p0.l0("duration_ms");
       tp2.q(p1.duration_ms, this.intAdapter, p0, "energy");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.energy));
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("instrumentalness");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.instrumentalness));
       p0.l0("key");
       tp2.q(p1.key, this.intAdapter, p0, "liveness");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.liveness));
       p0.l0("loudness");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.loudness));
       p0.l0("mode");
       tp2.q(p1.mode, this.intAdapter, p0, "speechiness");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.speechiness));
       p0.l0("tempo");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.tempo));
       p0.l0("time_signature");
       tp2.q(p1.time_signature, this.intAdapter, p0, "track_href");
       this.nullableStringAdapter.toJson(p0, p1.track_href);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.type);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.uri);
       p0.l0("valence");
       this.floatAdapter.toJson(p0, Float.valueOf(p1.valence));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(40, "GeneratedJsonAdapter\(AudioFeaturesTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
