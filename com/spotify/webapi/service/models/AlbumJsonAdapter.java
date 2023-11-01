package com.spotify.webapi.service.models.AlbumJsonAdapter;
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
import com.spotify.webapi.service.models.AlbumCopyright;
import java.util.Map;
import java.lang.Integer;
import com.spotify.webapi.service.models.TrackSimple;
import com.spotify.webapi.service.models.Pager;
import com.spotify.webapi.service.models.Image;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Album;
import com.spotify.webapi.service.models.AlbumSimple;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class AlbumJsonAdapter extends JsonAdapter	// class@000c63 from classes.dex
{
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableListOfAlbumCopyrightAdapter;
    private final JsonAdapter nullableListOfArtistSimpleAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullablePagerOfTrackSimpleAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void AlbumJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"artists","copyrights","external_ids","genres","popularity","release_date","release_date_precision","tracks","album_type","available_markets","external_urls","href","id","images","name","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"artists\", \"copyright…me\", \"uri\",\n      \"type\"\)");
       i.options = uob;
       Type[] typeArray = new Type[]{ArtistSimple.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…), emptySet\(\), \"artists\"\)");
       i.nullableListOfArtistSimpleAdapter = jsonAdapter;
       typeArray = new Type[]{AlbumCopyright.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "copyrights");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…emptySet\(\), \"copyrights\"\)");
       i.nullableListOfAlbumCopyrightAdapter = jsonAdapter;
       typeArray = new Type[]{String.class,String.class};
       jsonAdapter = obj.f(ya7.j(Map.class, typeArray), a, "external_ids");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\), \"external_ids\"\)");
       i.nullableMapOfStringStringAdapter = jsonAdapter;
       typeArray = new Type[]{String.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray), a, "genres");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"genres\"\)");
       i.nullableListOfStringAdapter = jsonAdapter;
       jsonAdapter = obj.f(Integer.class, a, "popularity");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…emptySet\(\), \"popularity\"\)");
       i.nullableIntAdapter = jsonAdapter;
       jsonAdapter = obj.f(String.class, a, "release_date");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ptySet\(\), \"release_date\"\)");
       i.nullableStringAdapter = jsonAdapter;
       typeArray = new Type[]{TrackSimple.class};
       jsonAdapter = obj.f(ya7.j(Pager.class, typeArray), a, "tracks");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…    emptySet\(\), \"tracks\"\)");
       i.nullablePagerOfTrackSimpleAdapter = jsonAdapter;
       Type[] typeArray1 = new Type[]{Image.class};
       obj = obj.f(ya7.j(List.class, typeArray1), a, "images");
       co5.l(obj, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       i.nullableListOfImageAdapter = obj;
    }
    public Album fromJson(b p0){
       List list4;
       AlbumJsonAdapter uAlbumJsonAd = this;
       Album obj = p0;
       co5.o(obj, "reader");
       p0.f();
       List list = null;
       List list1 = list;
       Map map = list1;
       List list2 = map;
       Integer integer = list2;
       String str = integer;
       String str1 = str;
       Pager pager = str1;
       String str2 = pager;
       List list3 = str2;
       Map map1 = list3;
       String str3 = map1;
       String str4 = str3;
       int i = str4;
       int i1 = i;
       int i2 = i1;
       int i3 = i2;
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
       int i16 = 0;
       int i17 = 0;
       int i18 = 0;
       int i19 = 0;
       int i20 = 0;
       while (p0.T()) {
          list4 = i;
          switch (obj.v0(uAlbumJsonAd.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_0149 :
                i = list4;
                break;
              case 0:
                list = uAlbumJsonAd.nullableListOfArtistSimpleAdapter.fromJson(obj);
                i = list4;
                i4 = 1;
                break;
              case 1:
                list1 = uAlbumJsonAd.nullableListOfAlbumCopyrightAdapter.fromJson(obj);
                i = list4;
                i5 = 1;
                break;
              case 2:
                map = uAlbumJsonAd.nullableMapOfStringStringAdapter.fromJson(obj);
                i = list4;
                i6 = 1;
                break;
              case 3:
                list2 = uAlbumJsonAd.nullableListOfStringAdapter.fromJson(obj);
                i = list4;
                i7 = 1;
                break;
              case 4:
                integer = uAlbumJsonAd.nullableIntAdapter.fromJson(obj);
                i = list4;
                i8 = 1;
                break;
              case 5:
                str = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i9 = 1;
                break;
              case 6:
                str1 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i10 = 1;
                break;
              case 7:
                pager = uAlbumJsonAd.nullablePagerOfTrackSimpleAdapter.fromJson(obj);
                i = list4;
                i11 = 1;
                break;
              case 8:
                str2 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i12 = 1;
                break;
              case 9:
                list3 = uAlbumJsonAd.nullableListOfStringAdapter.fromJson(obj);
                i = list4;
                i13 = 1;
                break;
              case 10:
                map1 = uAlbumJsonAd.nullableMapOfStringStringAdapter.fromJson(obj);
                i = list4;
                i14 = 1;
                break;
              case 11:
                str3 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i15 = 1;
                break;
              case 12:
                str4 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i16 = 1;
                break;
              case 13:
                i = uAlbumJsonAd.nullableListOfImageAdapter.fromJson(obj);
                i17 = 1;
                break;
              case 14:
                i1 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i18 = 1;
                break;
              case 15:
                i2 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i19 = 1;
                break;
              case 16:
                i3 = uAlbumJsonAd.nullableStringAdapter.fromJson(obj);
                i = list4;
                i20 = 1;
                break;
              default:
                goto label_0149 ;
          }
       }
       list4 = i;
       p0.y();
       obj = new Album();
       if (i4) {
          obj.artists = list;
       }
       if (i5) {
          obj.copyrights = list1;
       }
       if (i6) {
          obj.external_ids = map;
       }
       if (i7) {
          obj.genres = list2;
       }
       if (i8) {
          obj.popularity = integer;
       }
       if (i9) {
          obj.release_date = str;
       }
       if (i10) {
          obj.release_date_precision = str1;
       }
       if (i11) {
          obj.tracks = pager;
       }
       if (i12) {
          obj.album_type = str2;
       }
       if (i13) {
          obj.available_markets = list3;
       }
       if (i14) {
          obj.external_urls = map1;
       }
       if (i15) {
          obj.href = str3;
       }
       if (i16) {
          obj.id = str4;
       }
       if (i17) {
          obj.images = list4;
       }
       if (i18) {
          obj.name = i1;
       }
       if (i19) {
          obj.uri = i2;
       }
       if (i20) {
          obj.type = i3;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Album p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("artists");
       this.nullableListOfArtistSimpleAdapter.toJson(p0, p1.artists);
       p0.l0("copyrights");
       this.nullableListOfAlbumCopyrightAdapter.toJson(p0, p1.copyrights);
       p0.l0("external_ids");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_ids);
       p0.l0("genres");
       this.nullableListOfStringAdapter.toJson(p0, p1.genres);
       p0.l0("popularity");
       this.nullableIntAdapter.toJson(p0, p1.popularity);
       p0.l0("release_date");
       this.nullableStringAdapter.toJson(p0, p1.release_date);
       p0.l0("release_date_precision");
       this.nullableStringAdapter.toJson(p0, p1.release_date_precision);
       p0.l0("tracks");
       this.nullablePagerOfTrackSimpleAdapter.toJson(p0, p1.tracks);
       p0.l0("album_type");
       this.nullableStringAdapter.toJson(p0, p1.album_type);
       p0.l0("available_markets");
       this.nullableListOfStringAdapter.toJson(p0, p1.available_markets);
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
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
       return et0.o(27, "GeneratedJsonAdapter\(Album\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
