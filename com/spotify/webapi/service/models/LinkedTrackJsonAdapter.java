package com.spotify.webapi.service.models.LinkedTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.LinkedTrack;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LinkedTrackJsonAdapter extends JsonAdapter	// class@000c93 from classes.dex
{
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void LinkedTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"external_urls","href","id","type","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"external_urls\", \"hre…id\",\n      \"type\", \"uri\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{String.class,String.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "external_urls");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\), \"external_urls\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "href");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public LinkedTrack fromJson(b p0){
       int i5;
       co5.o(p0, "reader");
       p0.f();
       Map map = null;
       String str = map;
       String str1 = str;
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
                   str = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                map = this.nullableMapOfStringStringAdapter.fromJson(p0);
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
       LinkedTrack linkedTrack = new LinkedTrack();
       if (i) {
          linkedTrack.external_urls = map;
       }
       if (i1) {
          linkedTrack.href = str;
       }
       if (i2) {
          linkedTrack.id = str1;
       }
       if (i3) {
          linkedTrack.type = str2;
       }
       if (i4) {
          linkedTrack.uri = str3;
       }
       return linkedTrack;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LinkedTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("external_urls");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.external_urls);
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.id);
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
       return et0.o(33, "GeneratedJsonAdapter\(LinkedTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
