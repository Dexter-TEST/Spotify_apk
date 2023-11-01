package com.spotify.webapi.service.models.ArtistJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.webapi.service.models.Followers;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.webapi.service.models.Image;
import java.lang.Integer;
import java.util.Map;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Artist;
import com.spotify.webapi.service.models.ArtistSimple;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ArtistJsonAdapter extends JsonAdapter	// class@000c6b from classes.dex
{
    private final JsonAdapter nullableFollowersAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ArtistJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"followers","genres","images","popularity","external_urls","href","id","name","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"followers\", \"genres\"…", \"name\", \"uri\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Followers.class, a, "followers");
       co5.l(jsonAdapter, "moshi.adapter\(Followers:… emptySet\(\), \"followers\"\)");
       this.nullableFollowersAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "genres");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"genres\"\)");
       this.nullableListOfStringAdapter = jsonAdapter1;
       typeArray = new Type[]{Image.class};
       jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter1;
       jsonAdapter1 = p0.f(Integer.class, a, "popularity");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…emptySet\(\), \"popularity\"\)");
       this.nullableIntAdapter = jsonAdapter1;
       typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter2 = p0.f(String.class, a, "href");
       co5.l(jsonAdapter2, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter2;
    }
    public Artist fromJson(b p0){
       String str4;
       ArtistJsonAdapter uArtistJsonA = this;
       Artist obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Followers uFollowers = null;
       List list = uFollowers;
       List list1 = list;
       Integer integer = list1;
       Map map = integer;
       String str = map;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       int i = str3;
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
          str4 = i;
          switch (obj.v0(uArtistJsonA.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00c0 :
                i = str4;
                break;
              case 0:
                uFollowers = uArtistJsonA.nullableFollowersAdapter.fromJson(obj);
                i = str4;
                i1 = 1;
                break;
              case 1:
                list = uArtistJsonA.nullableListOfStringAdapter.fromJson(obj);
                i = str4;
                i2 = 1;
                break;
              case 2:
                list1 = uArtistJsonA.nullableListOfImageAdapter.fromJson(obj);
                i = str4;
                i3 = 1;
                break;
              case 3:
                integer = uArtistJsonA.nullableIntAdapter.fromJson(obj);
                i = str4;
                i4 = 1;
                break;
              case 4:
                map = uArtistJsonA.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str4;
                i5 = 1;
                break;
              case 5:
                str = uArtistJsonA.nullableStringAdapter.fromJson(obj);
                i = str4;
                i6 = 1;
                break;
              case 6:
                str1 = uArtistJsonA.nullableStringAdapter.fromJson(obj);
                i = str4;
                i7 = 1;
                break;
              case 7:
                str2 = uArtistJsonA.nullableStringAdapter.fromJson(obj);
                i = str4;
                i8 = 1;
                break;
              case 8:
                str3 = uArtistJsonA.nullableStringAdapter.fromJson(obj);
                i = str4;
                i9 = 1;
                break;
              case 9:
                i = uArtistJsonA.nullableStringAdapter.fromJson(obj);
                i10 = 1;
                break;
              default:
                goto label_00c0 ;
          }
       }
       str4 = i;
       p0.y();
       obj = new Artist();
       if (i1) {
          obj.followers = uFollowers;
       }
       if (i2) {
          obj.genres = list;
       }
       if (i3) {
          obj.images = list1;
       }
       if (i4) {
          obj.popularity = integer;
       }
       if (i5) {
          obj.external_urls = map;
       }
       if (i6) {
          obj.href = str;
       }
       if (i7) {
          obj.id = str1;
       }
       if (i8) {
          obj.name = str2;
       }
       if (i9) {
          obj.uri = str3;
       }
       if (i10) {
          obj.type = str4;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Artist p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("followers");
       this.nullableFollowersAdapter.toJson(p0, p1.followers);
       p0.l0("genres");
       this.nullableListOfStringAdapter.toJson(p0, p1.genres);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("popularity");
       this.nullableIntAdapter.toJson(p0, p1.popularity);
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
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
       return et0.o(28, "GeneratedJsonAdapter\(Artist\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
