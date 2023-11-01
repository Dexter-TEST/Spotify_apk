package com.spotify.webapi.service.models.SearchJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.Album;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.spotify.webapi.service.models.Artist;
import com.spotify.webapi.service.models.views.ViewsBestMatch;
import com.spotify.webapi.service.models.Episode;
import com.spotify.webapi.service.models.Playlist;
import com.spotify.webapi.service.models.ShowSimple;
import com.spotify.webapi.service.models.Track;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Search;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class SearchJsonAdapter extends JsonAdapter	// class@000cb5 from classes.dex
{
    private final JsonAdapter nullablePagerOfAlbumAdapter;
    private final JsonAdapter nullablePagerOfArtistAdapter;
    private final JsonAdapter nullablePagerOfEpisodeAdapter;
    private final JsonAdapter nullablePagerOfPlaylistAdapter;
    private final JsonAdapter nullablePagerOfShowSimpleAdapter;
    private final JsonAdapter nullablePagerOfTrackAdapter;
    private final JsonAdapter nullablePagerOfViewsBestMatchAdapter;
    private final b$b options;

    public void SearchJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"albums","artists","best_match","episodes","playlists","shows","tracks"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"albums\", \"artists\", …ists\", \"shows\", \"tracks\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Album.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "albums");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"albums\"\)");
       this.nullablePagerOfAlbumAdapter = jsonAdapter;
       typeArray = new Type[]{Artist.class};
       jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…tySet\(\),\n      \"artists\"\)");
       this.nullablePagerOfArtistAdapter = jsonAdapter;
       typeArray = new Type[]{ViewsBestMatch.class};
       jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "bestMatch");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP… emptySet\(\), \"bestMatch\"\)");
       this.nullablePagerOfViewsBestMatchAdapter = jsonAdapter;
       typeArray = new Type[]{Episode.class};
       jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "episodes");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…ySet\(\),\n      \"episodes\"\)");
       this.nullablePagerOfEpisodeAdapter = jsonAdapter;
       typeArray = new Type[]{Playlist.class};
       jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "playlists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…Set\(\),\n      \"playlists\"\)");
       this.nullablePagerOfPlaylistAdapter = jsonAdapter;
       typeArray = new Type[]{ShowSimple.class};
       jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), a, "shows");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…     emptySet\(\), \"shows\"\)");
       this.nullablePagerOfShowSimpleAdapter = jsonAdapter;
       Type[] typeArray1 = new Type[]{Track.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Pager.class, typeArray1), a, "tracks");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…ptySet\(\),\n      \"tracks\"\)");
       this.nullablePagerOfTrackAdapter = jsonAdapter1;
    }
    public Search fromJson(b p0){
       Pager pager6;
       SearchJsonAdapter searchJsonAd = this;
       Search obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Pager pager = null;
       Pager pager1 = pager;
       Pager pager2 = pager1;
       Pager pager3 = pager2;
       Pager pager4 = pager3;
       Pager pager5 = pager4;
       int i = pager5;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       while (p0.T()) {
          pager6 = i;
          switch (obj.v0(searchJsonAd.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_0087 :
                i = pager6;
                break;
              case 0:
                pager = searchJsonAd.nullablePagerOfAlbumAdapter.fromJson(obj);
                i = pager6;
                i1 = 1;
                break;
              case 1:
                pager1 = searchJsonAd.nullablePagerOfArtistAdapter.fromJson(obj);
                i = pager6;
                i2 = 1;
                break;
              case 2:
                pager2 = searchJsonAd.nullablePagerOfViewsBestMatchAdapter.fromJson(obj);
                i = pager6;
                i3 = 1;
                break;
              case 3:
                pager3 = searchJsonAd.nullablePagerOfEpisodeAdapter.fromJson(obj);
                i = pager6;
                i4 = 1;
                break;
              case 4:
                pager4 = searchJsonAd.nullablePagerOfPlaylistAdapter.fromJson(obj);
                i = pager6;
                i5 = 1;
                break;
              case 5:
                pager5 = searchJsonAd.nullablePagerOfShowSimpleAdapter.fromJson(obj);
                i = pager6;
                i6 = 1;
                break;
              case 6:
                i = searchJsonAd.nullablePagerOfTrackAdapter.fromJson(obj);
                i7 = 1;
                break;
              default:
                goto label_0087 ;
          }
       }
       pager6 = i;
       p0.y();
       obj = new Search();
       if (i1) {
          obj.albums = pager;
       }
       if (i2) {
          obj.artists = pager1;
       }
       if (i3) {
          obj.bestMatch = pager2;
       }
       if (i4) {
          obj.episodes = pager3;
       }
       if (i5) {
          obj.playlists = pager4;
       }
       if (i6) {
          obj.shows = pager5;
       }
       if (i7) {
          obj.tracks = pager6;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Search p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("albums");
       this.nullablePagerOfAlbumAdapter.toJson(p0, p1.albums);
       p0.l0("artists");
       this.nullablePagerOfArtistAdapter.toJson(p0, p1.artists);
       p0.l0("best_match");
       this.nullablePagerOfViewsBestMatchAdapter.toJson(p0, p1.bestMatch);
       p0.l0("episodes");
       this.nullablePagerOfEpisodeAdapter.toJson(p0, p1.episodes);
       p0.l0("playlists");
       this.nullablePagerOfPlaylistAdapter.toJson(p0, p1.playlists);
       p0.l0("shows");
       this.nullablePagerOfShowSimpleAdapter.toJson(p0, p1.shows);
       p0.l0("tracks");
       this.nullablePagerOfTrackAdapter.toJson(p0, p1.tracks);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(28, "GeneratedJsonAdapter\(Search\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
