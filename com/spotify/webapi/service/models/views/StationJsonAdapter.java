package com.spotify.webapi.service.models.views.StationJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.Image;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.views.Station;
import com.spotify.webapi.service.models.Entity;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class StationJsonAdapter extends JsonAdapter	// class@000cd6 from classes.dex
{
    private final JsonAdapter nullableListOfImageAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void StationJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"images","name","subtitle","title","uri","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"images\", \"name\", \"su…  \"title\", \"uri\", \"type\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Image.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "images");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"images\"\)");
       this.nullableListOfImageAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "name");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…      emptySet\(\), \"name\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public Station fromJson(b p0){
       co5.o(p0, "reader");
       p0.f();
       List list = null;
       String str = list;
       String str1 = str;
       String str2 = str1;
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
                list = this.nullableListOfImageAdapter.fromJson(p0);
                i = 1;
                break;
              case 1:
                str = this.nullableStringAdapter.fromJson(p0);
                i1 = 1;
                break;
              case 2:
                str1 = this.nullableStringAdapter.fromJson(p0);
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
       Station station = new Station();
       if (i) {
          station.images = list;
       }
       if (i1) {
          station.name = str;
       }
       if (i2) {
          station.subtitle = str1;
       }
       if (i3) {
          station.title = str2;
       }
       if (i4) {
          station.uri = str3;
       }
       if (i5) {
          station.type = str4;
       }
       return station;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Station p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("images");
       this.nullableListOfImageAdapter.toJson(p0, p1.images);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.name);
       p0.l0("subtitle");
       this.nullableStringAdapter.toJson(p0, p1.subtitle);
       p0.l0("title");
       this.nullableStringAdapter.toJson(p0, p1.title);
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
       return et0.o(29, "GeneratedJsonAdapter\(Station\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
