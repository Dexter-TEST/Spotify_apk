package com.spotify.webapi.service.models.PlaylistsPagerJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.PlaylistSimple;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.PlaylistsPager;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlaylistsPagerJsonAdapter extends JsonAdapter	// class@000ca6 from classes.dex
{
    private final JsonAdapter nullablePagerOfPlaylistSimpleAdapter;
    private final b$b options;

    public void PlaylistsPagerJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"playlists"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"playlists\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{PlaylistSimple.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), pl1.a, "playlists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP… emptySet\(\), \"playlists\"\)");
       this.nullablePagerOfPlaylistSimpleAdapter = jsonAdapter;
    }
    public PlaylistsPager fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       Pager pager = null;
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
          pager = this.nullablePagerOfPlaylistSimpleAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       PlaylistsPager playlistsPag = new PlaylistsPager();
       if (i) {
          playlistsPag.playlists = pager;
       }
       return playlistsPag;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlaylistsPager p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("playlists");
       this.nullablePagerOfPlaylistSimpleAdapter.toJson(p0, p1.playlists);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(36, "GeneratedJsonAdapter\(PlaylistsPager\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
