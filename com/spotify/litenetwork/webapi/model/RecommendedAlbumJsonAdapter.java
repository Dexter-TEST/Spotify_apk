package com.spotify.litenetwork.webapi.model.RecommendedAlbumJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.litenetwork.webapi.model.RecommendedAlbum;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class RecommendedAlbumJsonAdapter extends JsonAdapter	// class@00094c from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void RecommendedAlbumJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"id","image_url","name"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"id\", \"image_url\", \"name\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "id");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…,\n      emptySet\(\), \"id\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public RecommendedAlbum fromJson(b p0){
       int i3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
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
                   str1 = this.nullableStringAdapter.fromJson(p0);
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
          str2 = this.nullableStringAdapter.fromJson(p0);
          i2 = 1;
       }
       p0.y();
       RecommendedAlbum recommendedA = new RecommendedAlbum();
       if (i) {
          recommendedA.a = str;
       }
       if (i1) {
          recommendedA.c = str1;
       }
       if (i2) {
          recommendedA.b = str2;
       }
       return recommendedA;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,RecommendedAlbum p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("id");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("image_url");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("name");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(RecommendedAlbum\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
