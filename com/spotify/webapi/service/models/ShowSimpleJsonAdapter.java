package com.spotify.webapi.service.models.ShowSimpleJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.webapi.service.models.Entity;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Boolean;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import com.spotify.webapi.service.models.ShowSimple$MediaType;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.ShowSimple;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ShowSimpleJsonAdapter extends JsonAdapter	// class@000cbc from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMediaTypeAdapter;
    private final JsonAdapter nullablePagerOfEntityAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ShowSimpleJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"description","episodes","explicit","href","id","images","media_type","name","publisher","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"description\", \"episo…ublisher\", \"uri\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "description");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…mptySet\(\), \"description\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{Entity.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Pager.class, typeArray), a, "episodes");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ySet\(\),\n      \"episodes\"\)");
       this.nullablePagerOfEntityAdapter = jsonAdapter1;
       jsonAdapter1 = p0.f(Boolean.class, a, "explicit");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…, emptySet\(\), \"explicit\"\)");
       this.nullableBooleanAdapter = jsonAdapter1;
       Type[] typeArray1 = new Type[]{Image.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray1), a, "images");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter;
       JsonAdapter jsonAdapter2 = p0.f(ShowSimple$MediaType.class, a, "mediaType");
       co5.l(jsonAdapter2, "moshi.adapter\(ShowSimple… emptySet\(\), \"mediaType\"\)");
       this.nullableMediaTypeAdapter = jsonAdapter2;
    }
    public ShowSimple fromJson(b p0){
       String str6;
       ShowSimpleJsonAdapter showSimpleJs = this;
       ShowSimple obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       Pager pager = str;
       Boolean uBoolean = pager;
       String str1 = uBoolean;
       String str2 = str1;
       List list = str2;
       ShowSimple$MediaType mediaType = list;
       String str3 = mediaType;
       String str4 = str3;
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
       while (p0.T()) {
          str6 = i;
          switch (obj.v0(showSimpleJs.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00d3 :
                i = str6;
                break;
              case 0:
                str = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i1 = 1;
                break;
              case 1:
                pager = showSimpleJs.nullablePagerOfEntityAdapter.fromJson(obj);
                i = str6;
                i2 = 1;
                break;
              case 2:
                uBoolean = showSimpleJs.nullableBooleanAdapter.fromJson(obj);
                i = str6;
                i3 = 1;
                break;
              case 3:
                str1 = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i4 = 1;
                break;
              case 4:
                str2 = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i5 = 1;
                break;
              case 5:
                list = showSimpleJs.nullableListOfImageAdapter.fromJson(obj);
                i = str6;
                i6 = 1;
                break;
              case 6:
                mediaType = showSimpleJs.nullableMediaTypeAdapter.fromJson(obj);
                i = str6;
                i7 = 1;
                break;
              case 7:
                str3 = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i8 = 1;
                break;
              case 8:
                str4 = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i9 = 1;
                break;
              case 9:
                str5 = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i = str6;
                i10 = 1;
                break;
              case 10:
                i = showSimpleJs.nullableStringAdapter.fromJson(obj);
                i11 = 1;
                break;
              default:
                goto label_00d3 ;
          }
       }
       str6 = i;
       p0.y();
       obj = new ShowSimple();
       if (i1) {
          obj.description = str;
       }
       if (i2) {
          obj.episodes = pager;
       }
       if (i3) {
          obj.explicit = uBoolean;
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
          obj.mediaType = mediaType;
       }
       if (i8) {
          obj.name = str3;
       }
       if (i9) {
          obj.publisher = str4;
       }
       if (i10) {
          obj.uri = str5;
       }
       if (i11) {
          obj.type = str6;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ShowSimple p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("description");
       this.nullableStringAdapter.toJson(p0, p1.description);
       p0.l0("episodes");
       this.nullablePagerOfEntityAdapter.toJson(p0, p1.episodes);
       p0.l0("explicit");
       this.nullableBooleanAdapter.toJson(p0, p1.explicit);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("media_type");
       this.nullableMediaTypeAdapter.toJson(p0, p1.mediaType);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
       p0.l0("publisher");
       this.nullableStringAdapter.toJson(p0, p1.publisher);
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
       return et0.o(32, "GeneratedJsonAdapter\(ShowSimple\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
