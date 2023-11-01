package com.spotify.webapi.service.models.UserPrivateJsonAdapter;
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
import com.spotify.webapi.service.models.UserPrivate;
import com.spotify.webapi.service.models.UserPublic;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class UserPrivateJsonAdapter extends JsonAdapter	// class@000cd0 from classes.dex
{
    private final JsonAdapter nullableFollowersAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void UserPrivateJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"birthdate","country","email","product","display_name","external_urls","followers","href","id","images","type","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"birthdate\", \"country…es\", \"type\",\n      \"uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "birthdate");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl… emptySet\(\), \"birthdate\"\)");
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
    public UserPrivate fromJson(b p0){
       String str8;
       UserPrivateJsonAdapter userPrivateJ = this;
       UserPrivate obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       String str4 = str3;
       Map map = str4;
       Followers uFollowers = map;
       String str5 = uFollowers;
       String str6 = str5;
       List list = str6;
       String str7 = list;
       int i = str7;
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
          str8 = i;
          switch (obj.v0(userPrivateJ.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00e6 :
                i = str8;
                break;
              case 0:
                str = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i1 = 1;
                break;
              case 1:
                str1 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i2 = 1;
                break;
              case 2:
                str2 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i3 = 1;
                break;
              case 3:
                str3 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i4 = 1;
                break;
              case 4:
                str4 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i5 = 1;
                break;
              case 5:
                map = userPrivateJ.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str8;
                i6 = 1;
                break;
              case 6:
                uFollowers = userPrivateJ.nullableFollowersAdapter.fromJson(obj);
                i = str8;
                i7 = 1;
                break;
              case 7:
                str5 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i8 = 1;
                break;
              case 8:
                str6 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i9 = 1;
                break;
              case 9:
                list = userPrivateJ.nullableListOfImageAdapter.fromJson(obj);
                i = str8;
                i10 = 1;
                break;
              case 10:
                str7 = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i = str8;
                i11 = 1;
                break;
              case 11:
                i = userPrivateJ.nullableStringAdapter.fromJson(obj);
                i12 = 1;
                break;
              default:
                goto label_00e6 ;
          }
       }
       str8 = i;
       p0.y();
       obj = new UserPrivate();
       if (i1) {
          obj.birthdate = str;
       }
       if (i2) {
          obj.country = str1;
       }
       if (i3) {
          obj.email = str2;
       }
       if (i4) {
          obj.product = str3;
       }
       if (i5) {
          obj.display_name = str4;
       }
       if (i6) {
          obj.external_urls = map;
       }
       if (i7) {
          obj.followers = uFollowers;
       }
       if (i8) {
          obj.href = str5;
       }
       if (i9) {
          obj.id = str6;
       }
       if (i10) {
          obj.images = list;
       }
       if (i11) {
          obj.type = str7;
       }
       if (i12) {
          obj.uri = str8;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,UserPrivate p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("birthdate");
       this.nullableStringAdapter.toJson(p0, p1.birthdate);
       p0.l0("country");
       this.nullableStringAdapter.toJson(p0, p1.country);
       p0.l0("email");
       this.nullableStringAdapter.toJson(p0, p1.email);
       p0.l0("product");
       this.nullableStringAdapter.toJson(p0, p1.product);
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
       return et0.o(33, "GeneratedJsonAdapter\(UserPrivate\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
