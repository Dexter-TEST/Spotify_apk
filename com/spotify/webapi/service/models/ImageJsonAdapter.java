package com.spotify.webapi.service.models.ImageJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Integer;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Image;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ImageJsonAdapter extends JsonAdapter	// class@000c91 from classes.dex
{
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ImageJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"height","url","width"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"height\", \"url\", \"width\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.class, a, "height");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…    emptySet\(\), \"height\"\)");
       this.nullableIntAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "url");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…
          emptySet\(\), \"url\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public Image fromJson(b p0){
       int i3;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       String str = integer;
       Integer integer1 = str;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (p0.T()) {
          if ((i3 = p0.v0(this.options)) != -1) {
             int i4 = 1;
             if (i3) {
                if (i3 != i4) {
                   if (i3 != 2) {
                      continue ;
                   }
                }else {
                   str = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                integer = this.nullableIntAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          integer1 = this.nullableIntAdapter.fromJson(p0);
          i2 = 1;
       }
       p0.y();
       Image image = new Image();
       if (i) {
          image.height = integer;
       }
       if (i1) {
          image.url = str;
       }
       if (i2) {
          image.width = integer1;
       }
       return image;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Image p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("height");
       this.nullableIntAdapter.toJson(p0, p1.height);
       p0.l0("url");
       this.nullableStringAdapter.toJson(p0, p1.url);
       p0.l0("width");
       this.nullableIntAdapter.toJson(p0, p1.width);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(27, "GeneratedJsonAdapter\(Image\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
