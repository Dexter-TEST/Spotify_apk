package com.spotify.webapi.service.models.views.LinkJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.views.Link;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LinkJsonAdapter extends JsonAdapter	// class@000cd4 from classes.dex
{
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void LinkJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"href","images","name","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"href\", \"images\", \"name\", \"uri\",\n      \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "href");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{Image.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter1;
    }
    public Link fromJson(b p0){
       int i5;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       List list = str;
       String str1 = list;
       String str2 = str1;
       String str3 = str2;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (p0.T()) {
          if ((i5 = p0.v0(this.options)) != -1) {
             int i6 = 1;
             if (i5) {
                if (i5 != i6) {
                   if (i5 != 2) {
                      if (i5 != 3) {
                         if (i5 != 4) {
                            continue ;
                         }
                      }else {
                         str2 = this.nullableStringAdapter.fromJson(p0);
                         i3 = 1;
                      }
                   }else {
                      str1 = this.nullableStringAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   list = this.nullableListOfImageAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str3 = this.nullableStringAdapter.fromJson(p0);
          i4 = 1;
       }
       p0.y();
       Link link = new Link();
       if (i) {
          link.href = str;
       }
       if (i1) {
          link.images = list;
       }
       if (i2) {
          link.name = str1;
       }
       if (i3) {
          link.uri = str2;
       }
       if (i4) {
          link.type = str3;
       }
       return link;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Link p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
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
       return et0.o(26, "GeneratedJsonAdapter\(Link\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
