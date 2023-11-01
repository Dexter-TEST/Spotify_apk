package com.spotify.webapi.service.models.TrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.webapi.service.models.AlbumSimple;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Integer;
import com.spotify.webapi.service.models.ArtistSimple;
import java.util.List;
import java.lang.Long;
import java.lang.Boolean;
import com.spotify.webapi.service.models.LinkedTrack;
import java.lang.reflect.GenericArrayType;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Track;
import p.hf3;
import p.ve7;
import com.spotify.webapi.service.models.TrackSimple;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class TrackJsonAdapter extends JsonAdapter	// class@000cc0 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final JsonAdapter nullableAlbumSimpleAdapter;
    private final JsonAdapter nullableArrayOfStringAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableLinkedTrackAdapter;
    private final JsonAdapter nullableListOfArtistSimpleAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void TrackJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"album","external_ids","popularity","artists","available_markets","disc_number","duration_ms","explicit","external_urls","href","id","is_playable","linked_from","name","preview_url","tags","track_number","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"album\", \"external_id…k_number\", \"uri\", \"type\"\)");
       i.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(AlbumSimple.class, a, "album");
       co5.l(jsonAdapter, "moshi.adapter\(AlbumSimpl…ava, emptySet\(\), \"album\"\)");
       i.nullableAlbumSimpleAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       jsonAdapter = obj.f(ya7.j(Map.class, typeArray), a, "external_ids");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\), \"external_ids\"\)");
       i.nullableMapOfStringStringAdapter = jsonAdapter;
       jsonAdapter = obj.f(Integer.class, a, "popularity");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…emptySet\(\), \"popularity\"\)");
       i.nullableIntAdapter = jsonAdapter;
       typeArray = new Type[]{ArtistSimple.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "artists");
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
       jsonAdapter = obj.f(String.class, a, "href");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       i.nullableStringAdapter = jsonAdapter;
       jsonAdapter = obj.f(LinkedTrack.class, a, "linked_from");
       co5.l(jsonAdapter, "moshi.adapter\(LinkedTrac…mptySet\(\), \"linked_from\"\)");
       i.nullableLinkedTrackAdapter = jsonAdapter;
       obj = obj.f(ya7.b(String.class), a, "tags");
       co5.l(obj, "moshi.adapter\(Types.arra…ava\), emptySet\(\), \"tags\"\)");
       i.nullableArrayOfStringAdapter = obj;
    }
    public Track fromJson(b p0){
       String str2;
       Track track;
       TrackSimple track_number;
       TrackJsonAdapter trackJsonAda = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       AlbumSimple uAlbumSimple = null;
       Map map = uAlbumSimple;
       Integer integer = map;
       List list = integer;
       List list1 = list;
       Integer integer1 = list1;
       Long longx = integer1;
       Boolean uBoolean = longx;
       Map map1 = uBoolean;
       String str = map1;
       String str1 = str;
       Boolean uBoolean1 = str1;
       LinkedTrack linkedTrack = uBoolean1;
       int i = linkedTrack;
       int i1 = i;
       int i2 = i1;
       Integer integer2 = i2;
       int i3 = integer2;
       int i4 = i3;
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
       int i16 = 0;
       int i17 = 0;
       int i18 = 0;
       int i19 = 0;
       int i20 = 0;
       while (true) {
          if (p0.T()) {
             str2 = i;
             switch (obj.v0(trackJsonAda.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_0189 :
                   i = str2;
                   break;
                 case 0:
                   uAlbumSimple = trackJsonAda.nullableAlbumSimpleAdapter.fromJson(obj);
                   i = str2;
                   i5 = 1;
                   break;
                 case 1:
                   map = trackJsonAda.nullableMapOfStringStringAdapter.fromJson(obj);
                   i = str2;
                   i6 = 1;
                   break;
                 case 2:
                   integer = trackJsonAda.nullableIntAdapter.fromJson(obj);
                   i = str2;
                   i7 = 1;
                   break;
                 case 3:
                   list = trackJsonAda.nullableListOfArtistSimpleAdapter.fromJson(obj);
                   i = str2;
                   i8 = 1;
                   break;
                 case 4:
                   list1 = trackJsonAda.nullableListOfStringAdapter.fromJson(obj);
                   i = str2;
                   i9 = 1;
                   break;
                 case 5:
                   if ((integer1 = trackJsonAda.intAdapter.fromJson(obj)) != null) {
                      goto label_0189 ;
                   }else {
                      obj = ve7.w("disc_number", "disc_number", obj);
                      co5.l(obj, "unexpectedNull\(\"disc_num…   \"disc_number\", reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   if ((longx = trackJsonAda.longAdapter.fromJson(obj)) != null) {
                      goto label_0189 ;
                   }else {
                      obj = ve7.w("duration_ms", "duration_ms", obj);
                      co5.l(obj, "unexpectedNull\(\"duration…   \"duration_ms\", reader\)");
                      throw obj;
                   }
                   break;
                 case 7:
                   uBoolean = trackJsonAda.nullableBooleanAdapter.fromJson(obj);
                   i = str2;
                   i10 = 1;
                   break;
                 case 8:
                   map1 = trackJsonAda.nullableMapOfStringStringAdapter.fromJson(obj);
                   i = str2;
                   i11 = 1;
                   break;
                 case 9:
                   str = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i = str2;
                   i12 = 1;
                   break;
                 case 10:
                   str1 = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i = str2;
                   i13 = 1;
                   break;
                 case 11:
                   uBoolean1 = trackJsonAda.nullableBooleanAdapter.fromJson(obj);
                   i = str2;
                   i14 = 1;
                   break;
                 case 12:
                   linkedTrack = trackJsonAda.nullableLinkedTrackAdapter.fromJson(obj);
                   i = str2;
                   i15 = 1;
                   break;
                 case 13:
                   i = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i16 = 1;
                   break;
                 case 14:
                   i1 = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i = str2;
                   i17 = 1;
                   break;
                 case 15:
                   i2 = trackJsonAda.nullableArrayOfStringAdapter.fromJson(obj);
                   i = str2;
                   i18 = 1;
                   break;
                 case 16:
                   if ((integer2 = trackJsonAda.intAdapter.fromJson(obj)) != null) {
                      goto label_0189 ;
                   }else {
                      obj = ve7.w("track_number", "track_number", obj);
                      co5.l(obj, "unexpectedNull\(\"track_nu…, \"track_number\", reader\)");
                      throw obj;
                   }
                   break;
                 case 17:
                   i3 = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i = str2;
                   i19 = 1;
                   break;
                 case 18:
                   i4 = trackJsonAda.nullableStringAdapter.fromJson(obj);
                   i = str2;
                   i20 = 1;
                   break;
                 default:
                   goto label_0189 ;
             }
          }else {
             str2 = i;
             p0.y();
             track = new Track();
             if (i5) {
                track.album = uAlbumSimple;
             }
             if (i6) {
                track.external_ids = map;
             }
             if (i7) {
                track.popularity = integer;
             }
             if (i8) {
                track.artists = list;
             }
             if (i9) {
                track.available_markets = list1;
             }
             int i21 = (integer1 != null)? integer1.intValue(): track.disc_number;
             track.disc_number = i21;
             long l = (longx != null)? longx.longValue(): track.duration_ms;
             track.duration_ms = l;
             if (i10) {
                track.explicit = uBoolean;
             }
             if (i11) {
                track.external_urls = map1;
             }
             if (i12) {
                track.href = str;
             }
             if (i13) {
                track.id = str1;
             }
             if (i14) {
                track.is_playable = uBoolean1;
             }
             if (i15) {
                track.linked_from = linkedTrack;
             }
             if (i16) {
                track.name = str2;
             }
             if (i17) {
                track.preview_url = i1;
             }
             if (i18) {
                track.tags = i2;
             }
             i21 = (integer2 != null)? integer2.intValue(): track.track_number;
             track.track_number = i21;
             if (i19) {
                track.uri = i3;
             }
             if (i20) {
                track.type = i4;
                break ;
             }
             break ;
          }
       }
       return track;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Track p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("album");
       this.nullableAlbumSimpleAdapter.toJson(p0, p1.album);
       p0.l0("external_ids");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_ids);
       p0.l0("popularity");
       this.nullableIntAdapter.toJson(p0, p1.popularity);
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
       return et0.o(27, "GeneratedJsonAdapter\(Track\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
