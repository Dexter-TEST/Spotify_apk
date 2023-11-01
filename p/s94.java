package p.s94;
import p.r94;
import java.lang.Integer;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.m94;
import java.lang.Object;
import p.aq6;
import io.reactivex.rxjava3.core.Flowable;
import p.yp6;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Throwable;
import p.f72;
import p.j8;
import java.lang.Class;
import p.zy5;
import p.xy5;
import p.i8;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import io.reactivex.rxjava3.core.Completable;
import java.util.Objects;
import p.u82;
import p.zk;
import p.yk;
import p.te5;
import p.g12;
import p.e12;
import p.i77;
import p.f77;
import p.fh5;
import p.eh5;

public final class s94 implements r94	// class@0025e4 from classes.dex
{
    public final MetadataRoomDatabase a;
    public final m94 b;
    public static final Integer c;
    public static final Integer d;

    static {
       s94.c = Integer.valueOf(-1);
       s94.d = Integer.valueOf(5);
    }
    public void s94(MetadataRoomDatabase p0,m94 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Flowable a(aq6 p0){
       if (p0.b != yp6.t) {
          return Flowable.h(new IllegalArgumentException(p0.toString()));
       }
       j8 oj8 = this.a.t();
       String str = p0.toString();
       oj8.getClass();
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT \n    albums.uri,\n    albums.name,\n    albums.created,\n    albums.tag\nFROM albums WHERE albums.uri = ?");
       if (str == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, str);
       }
       String[] stringArray = new String[]{"images","album_artists","artists","albums"};
       Completable uCompletable = this.b.a(p0);
       Objects.requireNonNull(uCompletable, "other is null");
       return new u82(h16.a(oj8.b, i, stringArray, new i8(oj8, ozy5, i)), uCompletable, 0);
    }
    public final Flowable b(aq6 p0){
       if (p0.b != yp6.b) {
          return Flowable.h(new IllegalArgumentException(p0.toString()));
       }
       zk ozk = this.a.u();
       String str = p0.toString();
       ozk.getClass();
       zy5 ozy5 = zy5.x(1, "SELECT \n    artists.uri,\n    artists.name,\n    artists.created,\n    artists.tag\nFROM artists WHERE artists.uri = ?");
       if (str == null) {
          ozy5.z(1);
       }else {
          ozy5.s(1, str);
       }
       String[] stringArray = new String[]{"images","artists"};
       return h16.a(ozk.a, 1, stringArray, new yk(ozk, ozy5, 1));
    }
    public final Flowable c(aq6 p0,int p1){
       if (p0.b != yp6.y0 || te5.a(p0.c)) {
          return Flowable.h(new IllegalArgumentException(p0.toString()));
       }
       g12 og12 = this.a.w();
       String str = p0.toString();
       og12.getClass();
       int i = 2;
       zy5 ozy5 = zy5.x(i, "SELECT\n    track_rows.track_uri,\n    track_rows.uid,\n    track_rows.position,\n    tracks.uri as t_uri,\n    tracks.album_uri as t_album_uri,\n    tracks.name as t_name,\n    tracks.preview_id as t_preview_id,\n    tracks.explicit as t_explicit,\n    tracks.playable as t_playable,\n    tracks.created as t_created,\n    tracks.album_name as t_album_name,\n    tracks.album_image as t_album_image,\n    tracks.artist_names as t_artist_names,\n    tracks.artist_uri as t_artist_uri,\n    tracks.tag as t_tag\nFROM track_rows\nINNER JOIN favorite_tracks ON track_rows.track_uri = favorite_tracks.uri\nLEFT JOIN tracks ON tracks.uri = track_rows.track_uri\nWHERE track_rows.parent_uri = ?\nLIMIT ?");
       int i1 = 1;
       if (str == null) {
          ozy5.z(i1);
       }else {
          ozy5.s(i1, str);
       }
       ozy5.P(i, (long)p1);
       String[] stringArray = new String[]{"track_rows","favorite_tracks","tracks"};
       Completable uCompletable = this.b.a(p0);
       Objects.requireNonNull(uCompletable, "other is null");
       return new u82(h16.a(og12.a, false, stringArray, new e12(og12, ozy5, 6)), uCompletable, false);
    }
    public final v72 d(aq6 p0){
       i77 oi77 = this.a.B();
       String str = p0.toString();
       oi77.getClass();
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT\n    track_rows.track_uri,\n    track_rows.uid,\n    track_rows.position,\n    episodes.uri as e_uri,\n    episodes.podcast_uri as e_podcast_uri,\n    episodes.name as e_name,\n    episodes.description as e_description,\n    episodes.podcast_name as e_podcast_name,\n    episodes.release_date as e_release_date,\n    episodes.duration as e_duration,\n    episodes.playable as e_playable,\n    episodes.explicit as e_explicit,\n    episodes.created as e_created,\n    episodes.preview_id as e_preview_id,\n    episodes.image as e_image,\n    episodes.tag as e_tag,\n    episode_progress.episode_uri as e_episode_uri,\n    episode_progress.position as e_position,\n    episode_progress.fully_played as e_fully_played\nFROM track_rows\nLEFT JOIN episodes ON episodes.uri = track_rows.track_uri\nLEFT JOIN episode_progress ON episodes.uri = episode_progress.episode_uri\nWHERE track_rows.parent_uri = ?\nORDER BY track_rows.position DESC");
       if (str == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, str);
       }
       String[] stringArray = new String[]{"track_rows","episodes","episode_progress"};
       return h16.a(oi77.a, false, stringArray, new f77(oi77, ozy5, 5));
    }
    public final Flowable e(aq6 p0){
       aq6 b = p0.b;
       yp6 b1 = yp6.B;
       if (b != b1 && b != yp6.A) {
          return Flowable.h(new IllegalArgumentException(p0.toString()));
       }
       b = p0.t;
       if (te5.a(b)) {
          return Flowable.h(new IllegalArgumentException(b));
       }
       aq6 uoaq6 = new aq6(b1, b, null);
       fh5 uofh5 = this.a.y();
       String str = p0.toString();
       uofh5.getClass();
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT \n    playlists.uri,\n    playlists.name,\n    playlists.user_uri,\n    playlists.created,\n    playlists.tag,\n    users.uri AS u_uri,\n    users.username AS u_username,\n    users.display_name AS u_display_name\nFROM playlists INNER JOIN users ON playlists.user_uri = users.uri\nWHERE playlists.uri = ?");
       if (str == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, str);
       }
       String[] stringArray = new String[]{"images","playlists","users"};
       Completable uCompletable = this.b.a(uoaq6);
       Objects.requireNonNull(uCompletable, "other is null");
       return new u82(h16.a(uofh5.b, i, stringArray, new eh5(uofh5, ozy5, i)), uCompletable, 0);
    }
    public final v72 f(aq6 p0){
       return this.a.B().B(s94.c.intValue(), p0.toString());
    }
    public final v72 g(aq6 p0){
       return this.a.B().C(s94.c.intValue(), p0.toString());
    }
}
