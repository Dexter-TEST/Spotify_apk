package com.spotify.litenetwork.webapi.model.RecommendedGenresJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.litenetwork.webapi.model.RecommendedGenre;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.litenetwork.webapi.model.RecommendedGenres;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class RecommendedGenresJsonAdapter extends JsonAdapter	// class@000952 from classes.dex
{
    private final JsonAdapter nullableListOfRecommendedGenreAdapter;
    private final b$b options;

    public void RecommendedGenresJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"genres"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"genres\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{RecommendedGenre.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), pl1.a, "genres");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…    emptySet\(\), \"genres\"\)");
       this.nullableListOfRecommendedGenreAdapter = jsonAdapter;
    }
    public RecommendedGenres fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       List list = null;
       int i = 0;
       while (p0.T()) {
          if ((i1 = p0.v0(this.options)) != -1) {
             if (i1) {
                continue ;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          list = this.nullableListOfRecommendedGenreAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       RecommendedGenres recommendedG = new RecommendedGenres();
       if (i) {
          recommendedG.a = list;
       }
       return recommendedG;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,RecommendedGenres p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("genres");
       this.nullableListOfRecommendedGenreAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(RecommendedGenres\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
