package com.spotify.webapi.service.models.EpisodeSimpleJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Integer;
import java.lang.Boolean;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.webapi.service.models.ResumePoint;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.EpisodeSimple;
import p.hf3;
import p.ve7;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class EpisodeSimpleJsonAdapter extends JsonAdapter	// class@000c85 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableResumePointAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void EpisodeSimpleJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"audio_preview_url","description","duration_ms","explicit","href","id","images","is_playable","name","release_date","resume_point","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"audio_preview_url\",\n…me_point\", \"uri\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "audioPreviewUrl");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…Set\(\), \"audioPreviewUrl\"\)");
       this.nullableStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(Integer.TYPE, a, "durationMs");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"durationMs\"\)");
       this.intAdapter = jsonAdapter;
       jsonAdapter = p0.f(Boolean.class, a, "explicit");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…, emptySet\(\), \"explicit\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{Image.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(ResumePoint.class, a, "resumePoint");
       co5.l(jsonAdapter1, "moshi.adapter\(ResumePoin…mptySet\(\), \"resumePoint\"\)");
       this.nullableResumePointAdapter = jsonAdapter1;
    }
    public EpisodeSimple fromJson(b p0){
       String str7;
       EpisodeSimple uEpisodeSimp1;
       EpisodeSimpleJsonAdapter uEpisodeSimp = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       Integer integer = str1;
       Boolean uBoolean = integer;
       String str2 = uBoolean;
       String str3 = str2;
       List list = str3;
       Boolean uBoolean1 = list;
       String str4 = uBoolean1;
       String str5 = str4;
       ResumePoint resumePoint = str5;
       String str6 = resumePoint;
       int i = str6;
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
       while (true) {
          if (p0.T()) {
             str7 = i;
             switch (obj.v0(uEpisodeSimp.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_0102 :
                   i = str7;
                   break;
                 case 0:
                   str = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i1 = 1;
                   break;
                 case 1:
                   str1 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i2 = 1;
                   break;
                 case 2:
                   if ((integer = uEpisodeSimp.intAdapter.fromJson(obj)) != null) {
                      goto label_0102 ;
                   }else {
                      obj = ve7.w("durationMs", "duration_ms", obj);
                      co5.l(obj, "unexpectedNull\(\"duration…   \"duration_ms\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   uBoolean = uEpisodeSimp.nullableBooleanAdapter.fromJson(obj);
                   i = str7;
                   i3 = 1;
                   break;
                 case 4:
                   str2 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i4 = 1;
                   break;
                 case 5:
                   str3 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i5 = 1;
                   break;
                 case 6:
                   list = uEpisodeSimp.nullableListOfImageAdapter.fromJson(obj);
                   i = str7;
                   i6 = 1;
                   break;
                 case 7:
                   uBoolean1 = uEpisodeSimp.nullableBooleanAdapter.fromJson(obj);
                   i = str7;
                   i7 = 1;
                   break;
                 case 8:
                   str4 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i8 = 1;
                   break;
                 case 9:
                   str5 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i9 = 1;
                   break;
                 case 10:
                   resumePoint = uEpisodeSimp.nullableResumePointAdapter.fromJson(obj);
                   i = str7;
                   i10 = 1;
                   break;
                 case 11:
                   str6 = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i = str7;
                   i11 = 1;
                   break;
                 case 12:
                   i = uEpisodeSimp.nullableStringAdapter.fromJson(obj);
                   i12 = 1;
                   break;
                 default:
                   goto label_0102 ;
             }
          }else {
             str7 = i;
             p0.y();
             uEpisodeSimp1 = new EpisodeSimple();
             if (i1) {
                uEpisodeSimp1.audioPreviewUrl = str;
             }
             if (i2) {
                uEpisodeSimp1.description = str1;
             }
             int i13 = (integer != null)? integer.intValue(): uEpisodeSimp1.durationMs;
             uEpisodeSimp1.durationMs = i13;
             if (i3) {
                uEpisodeSimp1.explicit = uBoolean;
             }
             if (i4) {
                uEpisodeSimp1.href = str2;
             }
             if (i5) {
                uEpisodeSimp1.id = str3;
             }
             if (i6) {
                uEpisodeSimp1.images = list;
             }
             if (i7) {
                uEpisodeSimp1.is_playable = uBoolean1;
             }
             if (i8) {
                uEpisodeSimp1.name = str4;
             }
             if (i9) {
                uEpisodeSimp1.releaseDate = str5;
             }
             if (i10) {
                uEpisodeSimp1.resumePoint = resumePoint;
             }
             if (i11) {
                uEpisodeSimp1.uri = str6;
             }
             if (i12) {
                uEpisodeSimp1.type = str7;
                break ;
             }
             break ;
          }
       }
       return uEpisodeSimp1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,EpisodeSimple p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("audio_preview_url");
       this.nullableStringAdapter.toJson(p0, p1.audioPreviewUrl);
       p0.l0("description");
       this.nullableStringAdapter.toJson(p0, p1.description);
       p0.l0("duration_ms");
       tp2.q(p1.durationMs, this.intAdapter, p0, "explicit");
       this.nullableBooleanAdapter.toJson(p0, p1.explicit);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("is_playable");
       this.nullableBooleanAdapter.toJson(p0, p1.is_playable);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
       p0.l0("release_date");
       this.nullableStringAdapter.toJson(p0, p1.releaseDate);
       p0.l0("resume_point");
       this.nullableResumePointAdapter.toJson(p0, p1.resumePoint);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.uri);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.type);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(EpisodeSimple\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
