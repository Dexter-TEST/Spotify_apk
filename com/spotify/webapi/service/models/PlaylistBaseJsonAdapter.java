package com.spotify.webapi.service.models.PlaylistBaseJsonAdapter;
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
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import com.spotify.webapi.service.models.UserPublic;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.PlaylistBase;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlaylistBaseJsonAdapter extends JsonAdapter	// class@000c9b from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableUserPublicAdapter;
    private final b$b options;

    public void PlaylistBaseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"collaborative","description","external_urls","href","id","images","public","name","owner","snapshot_id","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"collaborative\", \"des…id\", \"uri\",\n      \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Boolean.class, a, "collaborative");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…tySet\(\), \"collaborative\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "description");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…mptySet\(\), \"description\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       typeArray = new Type[]{Image.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(UserPublic.class, a, "owner");
       co5.l(jsonAdapter1, "moshi.adapter\(UserPublic…ava, emptySet\(\), \"owner\"\)");
       this.nullableUserPublicAdapter = jsonAdapter1;
    }
    public PlaylistBase fromJson(b p0){
       String str6;
       PlaylistBaseJsonAdapter playlistBase = this;
       PlaylistBase obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Boolean uBoolean = null;
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
       while (p0.T()) {
          str6 = i;
          switch (obj.v0(playlistBase.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00e6 :
                i = str6;
                break;
              case 0:
                uBoolean = playlistBase.nullableBooleanAdapter.fromJson(obj);
                i = str6;
                i1 = 1;
                break;
              case 1:
                str = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i2 = 1;
                break;
              case 2:
                map = playlistBase.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str6;
                i3 = 1;
                break;
              case 3:
                str1 = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i4 = 1;
                break;
              case 4:
                str2 = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i5 = 1;
                break;
              case 5:
                list = playlistBase.nullableListOfImageAdapter.fromJson(obj);
                i = str6;
                i6 = 1;
                break;
              case 6:
                uBoolean1 = playlistBase.nullableBooleanAdapter.fromJson(obj);
                i = str6;
                i7 = 1;
                break;
              case 7:
                str3 = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i8 = 1;
                break;
              case 8:
                userPublic = playlistBase.nullableUserPublicAdapter.fromJson(obj);
                i = str6;
                i9 = 1;
                break;
              case 9:
                str4 = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i10 = 1;
                break;
              case 10:
                str5 = playlistBase.nullableStringAdapter.fromJson(obj);
                i = str6;
                i11 = 1;
                break;
              case 11:
                i = playlistBase.nullableStringAdapter.fromJson(obj);
                i12 = 1;
                break;
              default:
                goto label_00e6 ;
          }
       }
       str6 = i;
       p0.y();
       obj = new PlaylistBase();
       if (i1) {
          obj.collaborative = uBoolean;
       }
       if (i2) {
          obj.description = str;
       }
       if (i3) {
          obj.external_urls = map;
       }
       if (i4) {
          obj.href = str1;
       }
       if (i5) {
          obj.id = str2;
       }
       if (i6) {
          obj.images = list;
       }
       if (i7) {
          obj.is_public = uBoolean1;
       }
       if (i8) {
          obj.name = str3;
       }
       if (i9) {
          obj.owner = userPublic;
       }
       if (i10) {
          obj.snapshot_id = str4;
       }
       if (i11) {
          obj.uri = str5;
       }
       if (i12) {
          obj.type = str6;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlaylistBase p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
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
       return et0.o(34, "GeneratedJsonAdapter\(PlaylistBase\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
