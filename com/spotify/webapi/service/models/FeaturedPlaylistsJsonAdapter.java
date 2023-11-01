package com.spotify.webapi.service.models.FeaturedPlaylistsJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.webapi.service.models.PlaylistSimple;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.FeaturedPlaylists;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class FeaturedPlaylistsJsonAdapter extends JsonAdapter	// class@000c8d from classes.dex
{
    private final JsonAdapter nullablePagerOfPlaylistSimpleAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void FeaturedPlaylistsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"message","playlists"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"message\", \"playlists\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "message");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…   emptySet\(\), \"message\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{PlaylistSimple.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Pager.class, typeArray), a, "playlists");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP… emptySet\(\), \"playlists\"\)");
       this.nullablePagerOfPlaylistSimpleAdapter = jsonAdapter1;
    }
    public FeaturedPlaylists fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       Pager pager = str;
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
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          pager = this.nullablePagerOfPlaylistSimpleAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       FeaturedPlaylists uFeaturedPla = new FeaturedPlaylists();
       if (i) {
          uFeaturedPla.message = str;
       }
       if (i1) {
          uFeaturedPla.playlists = pager;
       }
       return uFeaturedPla;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,FeaturedPlaylists p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("message");
       this.nullableStringAdapter.toJson(p0, p1.message);
       p0.l0("playlists");
       this.nullablePagerOfPlaylistSimpleAdapter.toJson(p0, p1.playlists);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(FeaturedPlaylists\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
