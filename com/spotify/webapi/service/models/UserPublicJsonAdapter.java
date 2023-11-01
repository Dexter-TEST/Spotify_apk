package com.spotify.webapi.service.models.UserPublicJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.spotify.webapi.service.models.Followers;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.UserPublic;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class UserPublicJsonAdapter extends JsonAdapter	// class@000cd2 from classes.dex
{
    private final JsonAdapter nullableFollowersAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void UserPublicJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"display_name","external_urls","followers","href","id","images","type","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"display_name\", \"exte… \"images\", \"type\", \"uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "display_name");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ptySet\(\), \"display_name\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(Followers.class, a, "followers");
       co5.l(jsonAdapter, "moshi.adapter\(Followers:… emptySet\(\), \"followers\"\)");
       this.nullableFollowersAdapter = jsonAdapter;
       typeArray = new Type[]{Image.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter1;
    }
    public UserPublic fromJson(b p0){
       String str4;
       UserPublicJsonAdapter userPublicJs = this;
       UserPublic obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       Map map = str;
       Followers uFollowers = map;
       String str1 = uFollowers;
       String str2 = str1;
       List list = str2;
       String str3 = list;
       int i = str3;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       while (p0.T()) {
          str4 = i;
          switch (obj.v0(userPublicJs.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_009a :
                i = str4;
                break;
              case 0:
                str = userPublicJs.nullableStringAdapter.fromJson(obj);
                i = str4;
                i1 = 1;
                break;
              case 1:
                map = userPublicJs.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str4;
                i2 = 1;
                break;
              case 2:
                uFollowers = userPublicJs.nullableFollowersAdapter.fromJson(obj);
                i = str4;
                i3 = 1;
                break;
              case 3:
                str1 = userPublicJs.nullableStringAdapter.fromJson(obj);
                i = str4;
                i4 = 1;
                break;
              case 4:
                str2 = userPublicJs.nullableStringAdapter.fromJson(obj);
                i = str4;
                i5 = 1;
                break;
              case 5:
                list = userPublicJs.nullableListOfImageAdapter.fromJson(obj);
                i = str4;
                i6 = 1;
                break;
              case 6:
                str3 = userPublicJs.nullableStringAdapter.fromJson(obj);
                i = str4;
                i7 = 1;
                break;
              case 7:
                i = userPublicJs.nullableStringAdapter.fromJson(obj);
                i8 = 1;
                break;
              default:
                goto label_009a ;
          }
       }
       str4 = i;
       p0.y();
       obj = new UserPublic();
       if (i1) {
          obj.display_name = str;
       }
       if (i2) {
          obj.external_urls = map;
       }
       if (i3) {
          obj.followers = uFollowers;
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
          obj.type = str3;
       }
       if (i8) {
          obj.uri = str4;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,UserPublic p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("display_name");
       this.nullableStringAdapter.toJson(p0, p1.display_name);
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("followers");
       this.nullableFollowersAdapter.toJson(p0, p1.followers);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.type);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.uri);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(32, "GeneratedJsonAdapter\(UserPublic\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
