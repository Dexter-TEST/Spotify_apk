package com.spotify.webapi.service.models.RecommendationsJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.Seed;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.spotify.webapi.service.models.Track;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Recommendations;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class RecommendationsJsonAdapter extends JsonAdapter	// class@000ca8 from classes.dex
{
    private final JsonAdapter nullableListOfSeedAdapter;
    private final JsonAdapter nullableListOfTrackAdapter;
    private final b$b options;

    public void RecommendationsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"seeds","tracks"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"seeds\", \"tracks\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Seed.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "seeds");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…mptySet\(\),\n      \"seeds\"\)");
       this.nullableListOfSeedAdapter = jsonAdapter;
       Type[] typeArray1 = new Type[]{Track.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray1), a, "tracks");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"tracks\"\)");
       this.nullableListOfTrackAdapter = jsonAdapter1;
    }
    public Recommendations fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       List list = null;
       List list1 = list;
       int i = 0;
       int i1 = 0;
       while (p0.T()) {
          if ((i2 = p0.v0(this.options)) != -1) {
             int i3 = 1;
             if (i2) {
                if (i2 != i3) {
                   continue ;
                }
             }else {
                list = this.nullableListOfSeedAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          list1 = this.nullableListOfTrackAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       Recommendations recommendati = new Recommendations();
       if (i) {
          recommendati.seeds = list;
       }
       if (i1) {
          recommendati.tracks = list1;
       }
       return recommendati;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Recommendations p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("seeds");
       this.nullableListOfSeedAdapter.toJson(p0, p1.seeds);
       p0.l0("tracks");
       this.nullableListOfTrackAdapter.toJson(p0, p1.tracks);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(37, "GeneratedJsonAdapter\(Recommendations\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
