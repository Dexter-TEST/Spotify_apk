package com.spotify.webapi.service.models.ArtistsJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.Artist;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Artists;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ArtistsJsonAdapter extends JsonAdapter	// class@000c71 from classes.dex
{
    private final JsonAdapter nullableListOfArtistAdapter;
    private final b$b options;

    public void ArtistsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"artists"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"artists\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Artist.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), pl1.a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\),\n      \"artists\"\)");
       this.nullableListOfArtistAdapter = jsonAdapter;
    }
    public Artists fromJson(b p0){
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
          list = this.nullableListOfArtistAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       Artists uArtists = new Artists();
       if (i) {
          uArtists.artists = list;
       }
       return uArtists;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Artists p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("artists");
       this.nullableListOfArtistAdapter.toJson(p0, p1.artists);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(29, "GeneratedJsonAdapter\(Artists\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
