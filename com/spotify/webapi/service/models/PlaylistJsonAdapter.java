package com.spotify.webapi.service.models.PlaylistJsonAdapter;
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
import com.spotify.webapi.service.models.PlaylistTrack;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Boolean;
import java.util.Map;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import com.spotify.webapi.service.models.UserPublic;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Playlist;
import com.spotify.webapi.service.models.PlaylistBase;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlaylistJsonAdapter extends JsonAdapter	// class@000c9e from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableFollowersAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullablePagerOfPlaylistTrackAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableUserPublicAdapter;
    private final b$b options;

    public void PlaylistJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"followers","tracks","collaborative","description","external_urls","href","id","images","public","name","owner","snapshot_id","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"followers\", \"tracks\"…pshot_id\", \"uri\", \"type\"\)");
       i.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = obj.f(Followers.class, a, "followers");
       co5.l(jsonAdapter, "moshi.adapter\(Followers:… emptySet\(\), \"followers\"\)");
       i.nullableFollowersAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{PlaylistTrack.class};
       JsonAdapter jsonAdapter1 = obj.f(ya7.j(Pager.class, typeArray), a, "tracks");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…    emptySet\(\), \"tracks\"\)");
       i.nullablePagerOfPlaylistTrackAdapter = jsonAdapter1;
       jsonAdapter1 = obj.f(Boolean.class, a, "collaborative");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…tySet\(\), \"collaborative\"\)");
       i.nullableBooleanAdapter = jsonAdapter1;
       jsonAdapter1 = obj.f(String.class, a, "description");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…mptySet\(\), \"description\"\)");
       i.nullableStringAdapter = jsonAdapter1;
       typeArray = new Type[]{String.class,String.class};
       jsonAdapter1 = obj.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       i.nullableMapOfStringStringAdapter = jsonAdapter1;
       Type[] typeArray1 = new Type[]{Image.class};
       jsonAdapter = obj.f(ya7.j(List.class, typeArray1), a, "images");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       i.nullableListOfImageAdapter = jsonAdapter;
       obj = obj.f(UserPublic.class, a, "owner");
       co5.l(obj, "moshi.adapter\(UserPublic…ava, emptySet\(\), \"owner\"\)");
       i.nullableUserPublicAdapter = obj;
    }
    public Playlist fromJson(b p0){
       String str6;
       PlaylistJsonAdapter playlistJson = this;
       Playlist obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Followers uFollowers = null;
       Pager pager = uFollowers;
       Boolean uBoolean = pager;
       String str = uBoolean;
       Map map = str;
       String str1 = map;
       String str2 = str1;
       List list = str2;
       Boolean uBoolean1 = list;
       String str3 = uBoolean1;
       UserPublic userPublic = str3;
       String str4 = userPublic;
       String str5 = str4;
       int i = str5;
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
       int i14 = 0;
       while (p0.T()) {
          str6 = i;
          switch (obj.v0(playlistJson.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_010c :
                i = str6;
                break;
              case 0:
                uFollowers = playlistJson.nullableFollowersAdapter.fromJson(obj);
                i = str6;
                i1 = 1;
                break;
              case 1:
                pager = playlistJson.nullablePagerOfPlaylistTrackAdapter.fromJson(obj);
                i = str6;
                i2 = 1;
                break;
              case 2:
                uBoolean = playlistJson.nullableBooleanAdapter.fromJson(obj);
                i = str6;
                i3 = 1;
                break;
              case 3:
                str = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i4 = 1;
                break;
              case 4:
                map = playlistJson.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str6;
                i5 = 1;
                break;
              case 5:
                str1 = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i6 = 1;
                break;
              case 6:
                str2 = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i7 = 1;
                break;
              case 7:
                list = playlistJson.nullableListOfImageAdapter.fromJson(obj);
                i = str6;
                i8 = 1;
                break;
              case 8:
                uBoolean1 = playlistJson.nullableBooleanAdapter.fromJson(obj);
                i = str6;
                i9 = 1;
                break;
              case 9:
                str3 = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i10 = 1;
                break;
              case 10:
                userPublic = playlistJson.nullableUserPublicAdapter.fromJson(obj);
                i = str6;
                i11 = 1;
                break;
              case 11:
                str4 = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i12 = 1;
                break;
              case 12:
                str5 = playlistJson.nullableStringAdapter.fromJson(obj);
                i = str6;
                i13 = 1;
                break;
              case 13:
                i = playlistJson.nullableStringAdapter.fromJson(obj);
                i14 = 1;
                break;
              default:
                goto label_010c ;
          }
       }
       str6 = i;
       p0.y();
       obj = new Playlist();
       if (i1) {
          obj.followers = uFollowers;
       }
       if (i2) {
          obj.tracks = pager;
       }
       if (i3) {
          obj.collaborative = uBoolean;
       }
       if (i4) {
          obj.description = str;
       }
       if (i5) {
          obj.external_urls = map;
       }
       if (i6) {
          obj.href = str1;
       }
       if (i7) {
          obj.id = str2;
       }
       if (i8) {
          obj.images = list;
       }
       if (i9) {
          obj.is_public = uBoolean1;
       }
       if (i10) {
          obj.name = str3;
       }
       if (i11) {
          obj.owner = userPublic;
       }
       if (i12) {
          obj.snapshot_id = str4;
       }
       if (i13) {
          obj.uri = str5;
       }
       if (i14) {
          obj.type = str6;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Playlist p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("followers");
       this.nullableFollowersAdapter.toJson(p0, p1.followers);
       p0.l0("tracks");
       this.nullablePagerOfPlaylistTrackAdapter.toJson(p0, p1.tracks);
       p0.l0("collaborative");
       this.nullableBooleanAdapter.toJson(p0, p1.collaborative);
       p0.l0("description");
       this.nullableStringAdapter.toJson(p0, p1.description);
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("public");
       this.nullableBooleanAdapter.toJson(p0, p1.is_public);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
       p0.l0("owner");
       this.nullableUserPublicAdapter.toJson(p0, p1.owner);
       p0.l0("snapshot_id");
       this.nullableStringAdapter.toJson(p0, p1.snapshot_id);
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
       return et0.o(30, "GeneratedJsonAdapter\(Playlist\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
