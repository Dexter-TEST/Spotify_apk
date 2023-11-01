package com.spotify.webapi.service.models.views.ViewsBestMatchJsonAdapter;
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
import com.spotify.webapi.service.models.views.ViewsBestMatch;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ViewsBestMatchJsonAdapter extends JsonAdapter	// class@000cda from classes.dex
{
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ViewsBestMatchJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"href","id","images","name","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"href\", \"id\", \"images…me\",\n      \"uri\", \"type\"\)");
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
    public ViewsBestMatch fromJson(b p0){
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       List list = str1;
       String str2 = list;
       String str3 = str2;
       String str4 = str3;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       while (p0.T()) {
          switch (p0.v0(this.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
                break;
              case 0:
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
                break;
              case 1:
                str1 = this.nullableStringAdapter.fromJson(p0);
                i1 = 1;
                break;
              case 2:
                list = this.nullableListOfImageAdapter.fromJson(p0);
                i2 = 1;
                break;
              case 3:
                str2 = this.nullableStringAdapter.fromJson(p0);
                i3 = 1;
                break;
              case 4:
                str3 = this.nullableStringAdapter.fromJson(p0);
                i4 = 1;
                break;
              case 5:
                str4 = this.nullableStringAdapter.fromJson(p0);
                i5 = 1;
                break;
              default:
          }
       }
       p0.y();
       ViewsBestMatch viewsBestMat = new ViewsBestMatch();
       if (i) {
          viewsBestMat.href = str;
       }
       if (i1) {
          viewsBestMat.id = str1;
       }
       if (i2) {
          viewsBestMat.images = list;
       }
       if (i3) {
          viewsBestMat.name = str2;
       }
       if (i4) {
          viewsBestMat.uri = str3;
       }
       if (i5) {
          viewsBestMat.type = str4;
       }
       return viewsBestMat;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ViewsBestMatch p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
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
       return et0.o(36, "GeneratedJsonAdapter\(ViewsBestMatch\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
