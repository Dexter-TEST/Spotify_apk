package com.spotify.webapi.service.models.views.ViewJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.Entity;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import java.util.Map;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.views.View;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ViewJsonAdapter extends JsonAdapter	// class@000cd8 from classes.dex
{
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableMapOfStringAnyAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullablePagerOfEntityAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ViewJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"content","custom_fields","external_urls","href","id","images","name","rendering","tag_line","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"content\", \"custom_fi…ing\", \"tag_line\", \"type\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Entity.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "content");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\),\n      \"content\"\)");
       this.nullablePagerOfEntityAdapter = jsonAdapter;
       Type[] typeArray1 = new Type[]{String.class,Object.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray1), a, "custom_fields");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…tySet\(\), \"custom_fields\"\)");
       this.nullableMapOfStringAnyAdapter = jsonAdapter1;
       typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "href");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray2 = new Type[]{Image.class};
       JsonAdapter jsonAdapter2 = p0.f(ya7.j(List.class, typeArray2), a, "images");
       co5.l(jsonAdapter2, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter2;
    }
    public View fromJson(b p0){
       String str5;
       ViewJsonAdapter viewJsonAdap = this;
       View obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Pager pager = null;
       Map map = pager;
       Map map1 = map;
       String str = map1;
       String str1 = str;
       List list = str1;
       String str2 = list;
       String str3 = str2;
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
       int i10 = 0;
       while (p0.T()) {
          str5 = i;
          switch (obj.v0(viewJsonAdap.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_00c0 :
                i = str5;
                break;
              case 0:
                pager = viewJsonAdap.nullablePagerOfEntityAdapter.fromJson(obj);
                i = str5;
                i1 = 1;
                break;
              case 1:
                map = viewJsonAdap.nullableMapOfStringAnyAdapter.fromJson(obj);
                i = str5;
                i2 = 1;
                break;
              case 2:
                map1 = viewJsonAdap.nullableMapOfStringStringAdapter.fromJson(obj);
                i = str5;
                i3 = 1;
                break;
              case 3:
                str = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i = str5;
                i4 = 1;
                break;
              case 4:
                str1 = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i = str5;
                i5 = 1;
                break;
              case 5:
                list = viewJsonAdap.nullableListOfImageAdapter.fromJson(obj);
                i = str5;
                i6 = 1;
                break;
              case 6:
                str2 = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i = str5;
                i7 = 1;
                break;
              case 7:
                str3 = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i = str5;
                i8 = 1;
                break;
              case 8:
                str4 = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i = str5;
                i9 = 1;
                break;
              case 9:
                i = viewJsonAdap.nullableStringAdapter.fromJson(obj);
                i10 = 1;
                break;
              default:
                goto label_00c0 ;
          }
       }
       str5 = i;
       p0.y();
       obj = new View();
       if (i1) {
          obj.content = pager;
       }
       if (i2) {
          obj.custom_fields = map;
       }
       if (i3) {
          obj.external_urls = map1;
       }
       if (i4) {
          obj.href = str;
       }
       if (i5) {
          obj.id = str1;
       }
       if (i6) {
          obj.images = list;
       }
       if (i7) {
          obj.name = str2;
       }
       if (i8) {
          obj.rendering = str3;
       }
       if (i9) {
          obj.tag_line = str4;
       }
       if (i10) {
          obj.type = str5;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,View p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("content");
       this.nullablePagerOfEntityAdapter.toJson(p0, p1.content);
       p0.l0("custom_fields");
       this.nullableMapOfStringAnyAdapter.toJson(p0, p1.custom_fields);
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
       p0.l0("rendering");
       this.nullableStringAdapter.toJson(p0, p1.rendering);
       p0.l0("tag_line");
       this.nullableStringAdapter.toJson(p0, p1.tag_line);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.type);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(26, "GeneratedJsonAdapter\(View\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
