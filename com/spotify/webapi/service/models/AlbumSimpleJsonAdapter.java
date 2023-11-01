package com.spotify.webapi.service.models.AlbumSimpleJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.util.Map;
import com.spotify.webapi.service.models.Image;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.AlbumSimple;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class AlbumSimpleJsonAdapter extends JsonAdapter	// class@000c65 from classes.dex
{
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void AlbumSimpleJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"album_type","available_markets","external_urls","href","id","images","name","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"album_type\", \"availa…", \"name\", \"uri\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "album_type");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\), \"album_type\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "available_markets");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…     \"available_markets\"\)");
       this.nullableListOfStringAdapter = jsonAdapter1;
       typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter2 = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter2, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter2;
       Type[] typeArray1 = new Type[]{Image.class};
       JsonAdapter jsonAdapter3 = p0.f(ya7.j(List.class, typeArray1), a, "images");
       co5.l(jsonAdapter3, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter3;
    }
    public AlbumSimple fromJson(b p0){
       String str5;
       AlbumSimpleJsonAdapter uAlbumSimple = this;
       AlbumSimple obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       List list = str;
       Map map = list;
       String str1 = map;
       String str2 = str1;
       List list1 = str2;
       String str3 = list1;
       String str4 = str3;
       int i = str4;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       while (p0.T()) {
          str5 = i;
          switch (obj.v0(uAlbumSimple.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00ad :
                i = str5;
                break;
              case 0:
                str = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i = str5;
                i1 = 1;
                break;
              case 1:
                list = uAlbumSimple.nullableListOfStringAdapter.fromJson(obj);
                i = str5;
                i2 = 1;
                break;
              case 2:
                map = uAlbumSimple.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str5;
                i3 = 1;
                break;
              case 3:
                str1 = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i = str5;
                i4 = 1;
                break;
              case 4:
                str2 = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i = str5;
                i5 = 1;
                break;
              case 5:
                list1 = uAlbumSimple.nullableListOfImageAdapter.fromJson(obj);
                i = str5;
                i6 = 1;
                break;
              case 6:
                str3 = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i = str5;
                i7 = 1;
                break;
              case 7:
                str4 = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i = str5;
                i8 = 1;
                break;
              case 8:
                i = uAlbumSimple.nullableStringAdapter.fromJson(obj);
                i9 = 1;
                break;
              default:
                goto label_00ad ;
          }
       }
       str5 = i;
       p0.y();
       obj = new AlbumSimple();
       if (i1) {
          obj.album_type = str;
       }
       if (i2) {
          obj.available_markets = list;
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
          obj.images = list1;
       }
       if (i7) {
          obj.name = str3;
       }
       if (i8) {
          obj.uri = str4;
       }
       if (i9) {
          obj.type = str5;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,AlbumSimple p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
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
       return et0.o(33, "GeneratedJsonAdapter\(AlbumSimple\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
