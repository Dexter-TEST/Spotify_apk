package com.spotify.webapi.service.models.TrackSimpleJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.ArtistSimple;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Map;
import com.spotify.webapi.service.models.LinkedTrack;
import java.lang.reflect.GenericArrayType;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.TrackSimple;
import p.hf3;
import p.ve7;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class TrackSimpleJsonAdapter extends JsonAdapter	// class@000cc2 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final JsonAdapter nullableArrayOfStringAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableLinkedTrackAdapter;
    private final JsonAdapter nullableListOfArtistSimpleAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void TrackSimpleJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"artists","available_markets","disc_number","duration_ms","explicit","external_urls","href","id","is_playable","linked_from","name","preview_url","tags","track_number","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"artists\", \"available…k_number\", \"uri\", \"type\"\)");
       i.options = uob;
       Type[] typeArray = new Type[]{ArtistSimple.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…), emptySet\(\), \"artists\"\)");
       i.nullableListOfArtistSimpleAdapter = jsonAdapter;
       typeArray = new Type[]{String.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "available_markets");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…     \"available_markets\"\)");
       i.nullableListOfStringAdapter = jsonAdapter;
       jsonAdapter = obj.f(Integer.TYPE, a, "disc_number");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…t\(\),\n      \"disc_number\"\)");
       i.intAdapter = jsonAdapter;
       jsonAdapter = obj.f(Long.TYPE, a, "duration_ms");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…t\(\),\n      \"duration_ms\"\)");
       i.longAdapter = jsonAdapter;
       jsonAdapter = obj.f(Boolean.class, a, "explicit");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…, emptySet\(\), \"explicit\"\)");
       i.nullableBooleanAdapter = jsonAdapter;
       typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = obj.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       i.nullableMapOfStringStringAdapter = jsonAdapter1;
       jsonAdapter1 = obj.f(String.class, a, "href");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       i.nullableStringAdapter = jsonAdapter1;
       jsonAdapter1 = obj.f(LinkedTrack.class, a, "linked_from");
       co5.l(jsonAdapter1, "moshi.adapter\(LinkedTrac…mptySet\(\), \"linked_from\"\)");
       i.nullableLinkedTrackAdapter = jsonAdapter1;
       obj = obj.f(ya7.b(String.class), a, "tags");
       co5.l(obj, "moshi.adapter\(Types.arra…ava\), emptySet\(\), \"tags\"\)");
       i.nullableArrayOfStringAdapter = obj;
    }
    public TrackSimple fromJson(b p0){
       Integer integer1;
       TrackSimple trackSimple;
       TrackSimple track_number;
       TrackSimpleJsonAdapter trackSimpleJ = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       List list = null;
       List list1 = list;
       Integer integer = list1;
       Long longx = integer;
       Boolean uBoolean = longx;
       Map map = uBoolean;
       String str = map;
       String str1 = str;
       Boolean uBoolean1 = str1;
       LinkedTrack linkedTrack = uBoolean1;
       String str2 = linkedTrack;
       String str3 = str2;
       String[] stringArray = str3;
       int i = stringArray;
       int i1 = i;
       int i2 = i1;
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
       int i14 = 0;
       int i15 = 0;
       while (true) {
          if (p0.T()) {
             integer1 = i;
             switch (obj.v0(trackSimpleJ.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_014d :
                   i = integer1;
                   break;
                 case 0:
                   list = trackSimpleJ.nullableListOfArtistSimpleAdapter.fromJson(obj);
                   i = integer1;
                   i3 = 1;
                   break;
                 case 1:
                   list1 = trackSimpleJ.nullableListOfStringAdapter.fromJson(obj);
                   i = integer1;
                   i4 = 1;
                   break;
                 case 2:
                   if ((integer = trackSimpleJ.intAdapter.fromJson(obj)) != null) {
                      goto label_014d ;
                   }else {
                      obj = ve7.w("disc_number", "disc_number", obj);
                      co5.l(obj, "unexpectedNull\(\"disc_num…   \"disc_number\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   if ((longx = trackSimpleJ.longAdapter.fromJson(obj)) != null) {
                      goto label_014d ;
                   }else {
                      obj = ve7.w("duration_ms", "duration_ms", obj);
                      co5.l(obj, "unexpectedNull\(\"duration…   \"duration_ms\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   uBoolean = trackSimpleJ.nullableBooleanAdapter.fromJson(obj);
                   i = integer1;
                   i5 = 1;
                   break;
                 case 5:
                   map = trackSimpleJ.nullableMapOfStringStringAdapter.fromJson(obj);
                   i = integer1;
                   i6 = 1;
                   break;
                 case 6:
                   str = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i7 = 1;
                   break;
                 case 7:
                   str1 = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i8 = 1;
                   break;
                 case 8:
                   uBoolean1 = trackSimpleJ.nullableBooleanAdapter.fromJson(obj);
                   i = integer1;
                   i9 = 1;
                   break;
                 case 9:
                   linkedTrack = trackSimpleJ.nullableLinkedTrackAdapter.fromJson(obj);
                   i = integer1;
                   i10 = 1;
                   break;
                 case 10:
                   str2 = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i11 = 1;
                   break;
                 case 11:
                   str3 = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i12 = 1;
                   break;
                 case 12:
                   stringArray = trackSimpleJ.nullableArrayOfStringAdapter.fromJson(obj);
                   i = integer1;
                   i13 = 1;
                   break;
                 case 13:
                   if ((i = trackSimpleJ.intAdapter.fromJson(obj)) != null) {
                      continue ;
                   }else {
                      obj = ve7.w("track_number", "track_number", obj);
                      co5.l(obj, "unexpectedNull\(\"track_nu…, \"track_number\", reader\)");
                      throw obj;
                   }
                   break;
                 case 14:
                   i1 = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i14 = 1;
                   break;
                 case 15:
                   i2 = trackSimpleJ.nullableStringAdapter.fromJson(obj);
                   i = integer1;
                   i15 = 1;
                   break;
                 default:
                   goto label_014d ;
             }
          }else {
             integer1 = i;
             p0.y();
             trackSimple = new TrackSimple();
             if (i3) {
                trackSimple.artists = list;
             }
             if (i4) {
                trackSimple.available_markets = list1;
             }
             int i16 = (integer != null)? integer.intValue(): trackSimple.disc_number;
             trackSimple.disc_number = i16;
             long l = (longx != null)? longx.longValue(): trackSimple.duration_ms;
             trackSimple.duration_ms = l;
             if (i5) {
                trackSimple.explicit = uBoolean;
             }
             if (i6) {
                trackSimple.external_urls = map;
             }
             if (i7) {
                trackSimple.href = str;
             }
             if (i8) {
                trackSimple.id = str1;
             }
             if (i9) {
                trackSimple.is_playable = uBoolean1;
             }
             if (i10) {
                trackSimple.linked_from = linkedTrack;
             }
             if (i11) {
                trackSimple.name = str2;
             }
             if (i12) {
                trackSimple.preview_url = str3;
             }
             if (i13) {
                trackSimple.tags = stringArray;
             }
             i16 = (integer1 != null)? integer1.intValue(): trackSimple.track_number;
             trackSimple.track_number = i16;
             if (i14) {
                trackSimple.uri = i1;
             }
             if (i15) {
                trackSimple.type = i2;
                break ;
             }
             break ;
          }
       }
       return trackSimple;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,TrackSimple p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("artists");
       this.nullableListOfArtistSimpleAdapter.toJson(p0, p1.artists);
       p0.l0("available_markets");
       this.nullableListOfStringAdapter.toJson(p0, p1.available_markets);
       p0.l0("disc_number");
       tp2.q(p1.disc_number, this.intAdapter, p0, "duration_ms");
       this.longAdapter.toJson(p0, Long.valueOf(p1.duration_ms));
       p0.l0("explicit");
       this.nullableBooleanAdapter.toJson(p0, p1.explicit);
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("is_playable");
       this.nullableBooleanAdapter.toJson(p0, p1.is_playable);
       p0.l0("linked_from");
       this.nullableLinkedTrackAdapter.toJson(p0, p1.linked_from);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
       p0.l0("preview_url");
       this.nullableStringAdapter.toJson(p0, p1.preview_url);
       p0.l0("tags");
       this.nullableArrayOfStringAdapter.toJson(p0, p1.tags);
       p0.l0("track_number");
       tp2.q(p1.track_number, this.intAdapter, p0, "uri");
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
       return et0.o(33, "GeneratedJsonAdapter\(TrackSimple\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
