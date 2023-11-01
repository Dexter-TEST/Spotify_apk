package com.spotify.litenetwork.webapi.model.RecommendedTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.litenetwork.webapi.model.RecommendedAlbum;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.litenetwork.webapi.model.RecommendedArtist;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.litenetwork.webapi.model.RecommendedTrack;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class RecommendedTrackJsonAdapter extends JsonAdapter	// class@000954 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableListOfRecommendedArtistAdapter;
    private final JsonAdapter nullableRecommendedAlbumAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void RecommendedTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"album","artists","explicit","name","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"album\", \"artists\", \"…it\",\n      \"name\", \"uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(RecommendedAlbum.class, a, "album");
       co5.l(jsonAdapter, "moshi.adapter\(Recommende…ava, emptySet\(\), \"album\"\)");
       this.nullableRecommendedAlbumAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{RecommendedArtist.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…   emptySet\(\), \"artists\"\)");
       this.nullableListOfRecommendedArtistAdapter = jsonAdapter;
       jsonAdapter = p0.f(Boolean.TYPE, a, "explicit");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…ySet\(\),\n      \"explicit\"\)");
       this.booleanAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "name");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…      emptySet\(\), \"name\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public RecommendedTrack fromJson(b p0){
       int i4;
       RecommendedTrack recommendedT;
       co5.o(p0, "reader");
       p0.f();
       RecommendedAlbum recommendedA = null;
       List list = recommendedA;
       Boolean uBoolean = list;
       String str = uBoolean;
       String str1 = str;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (p0.T()) {
             if ((i4 = p0.v0(this.options)) != -1) {
                int i5 = 1;
                if (i4) {
                   if (i4 != i5) {
                      if (i4 != 2) {
                         if (i4 != 3) {
                            if (i4 != 4) {
                               continue ;
                            }else {
                               str1 = this.nullableStringAdapter.fromJson(p0);
                               i3 = 1;
                            }
                         }else {
                            str = this.nullableStringAdapter.fromJson(p0);
                            i2 = 1;
                         }
                      }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         hf3 ohf3 = ve7.w("explicit", "explicit", p0);
                         co5.l(ohf3, "unexpectedNull\(\"explicit…      \"explicit\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      list = this.nullableListOfRecommendedArtistAdapter.fromJson(p0);
                      i1 = 1;
                   }
                }else {
                   recommendedA = this.nullableRecommendedAlbumAdapter.fromJson(p0);
                   i = 1;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             recommendedT = new RecommendedTrack();
             if (i) {
                recommendedT.d = recommendedA;
             }
             if (i1) {
                recommendedT.e = list;
             }
             boolean b = (uBoolean != null)? uBoolean.booleanValue(): recommendedT.c;
             recommendedT.c = b;
             if (i2) {
                recommendedT.b = str;
             }
             if (i3) {
                recommendedT.a = str1;
                break ;
             }
             break ;
          }
       }
       return recommendedT;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,RecommendedTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("album");
       this.nullableRecommendedAlbumAdapter.toJson(p0, p1.d);
       p0.l0("artists");
       this.nullableListOfRecommendedArtistAdapter.toJson(p0, p1.e);
       p0.l0("explicit");
       kg4.x(p1.c, this.booleanAdapter, p0, "name");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(RecommendedTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
