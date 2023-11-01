package p.wn3;
import p.h12;
import p.m12;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.vn3;
import p.ko1;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.zy5;
import p.xy5;
import p.jo1;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.bo3;
import p.zn3;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.aq6;
import p.td7;
import java.lang.Enum;
import java.lang.Boolean;
import p.g12;
import p.e12;
import p.qn3;
import p.yf2;
import p.g16;
import io.reactivex.rxjava3.core.CompletableSource;
import p.rn3;
import p.rk0;
import p.yp6;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Exception;
import p.jk0;

public final class wn3	// class@002b6e from classes.dex
{
    public final h12 a;
    public final m12 b;

    public void wn3(h12 p0,m12 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Observable a(){
       ko1 oko1 = this.a.b.v();
       oko1.getClass();
       String[] stringArray = new String[]{"images","episodes","favorite_episodes","track_rows","episode_progress"};
       jo1 ojo1 = new jo1(oko1, zy5.x(0, "SELECT \n    episodes.uri,\n    episodes.podcast_uri,\n    episodes.name,\n    episodes.description,\n    episodes.podcast_name,\n    episodes.release_date,\n    episodes.duration,\n    episodes.playable,\n    episodes.explicit,\n    episodes.created,\n    episodes.preview_id,\n    episodes.image,\n    episodes.tag,\n    track_rows.track_uri as t_track_uri,\n    track_rows.parent_uri as t_parent_uri,\n    track_rows.uid as t_uid,\n    track_rows.position as t_position,\n    episode_progress.episode_uri as e_episode_uri,\n    episode_progress.position as e_position,\n    episode_progress.fully_played as e_fully_played\nFROM episodes INNER JOIN favorite_episodes ON episodes.uri = favorite_episodes.uri\nLEFT JOIN track_rows ON episodes.podcast_uri = track_rows.parent_uri AND episodes.uri = track_rows.track_uri\nLEFT JOIN episode_progress ON episodes.uri = episode_progress.episode_uri"), 0);
       Scheduler c = s36.c;
       wn3 tb = this.b;
       tb.getClass();
       return Observable.merge(h16.a(oko1.b, true, stringArray, ojo1).v(c).y(c).x(), Completable.i(new zn3(tb, 6)).s()).distinctUntilChanged();
    }
    public final Observable b(aq6 p0){
       Observable observable;
       g12 og12;
       String str;
       zy5 ozy5;
       String[] stringArray;
       Scheduler c;
       p0 = td7.c(p0);
       wn3 ta = this.a;
       ta.getClass();
       int i = p0.b.ordinal();
       vn3 b = ta.b;
       int i1 = 1;
       if (i != i1) {
          int i2 = 3;
          if (i != i2) {
             i2 = 5;
             if (i != i2) {
                if (i != 16) {
                   if (i != 51) {
                      if (i != 9 && i != 10) {
                         observable = Observable.just(Boolean.FALSE);
                      }else {
                         og12 = b.w();
                         str = p0.toString();
                         og12.getClass();
                         ozy5 = zy5.x(i1, "SELECT COUNT\(*\)\nFROM favorite_playlists\nWHERE uri = ?");
                         if (str == null) {
                            ozy5.z(i1);
                         }else {
                            ozy5.s(i1, str);
                         }
                         stringArray = new String[]{"favorite_playlists"};
                         c = s36.c;
                         observable = h16.a(og12.a, false, stringArray, new e12(og12, ozy5, 2)).v(c).y(c).x();
                      }
                   }else {
                      og12 = b.w();
                      str = p0.toString();
                      og12.getClass();
                      ozy5 = zy5.x(i1, "SELECT COUNT\(*\)\nFROM favorite_shows\nWHERE uri = ?");
                      if (str == null) {
                         ozy5.z(i1);
                      }else {
                         ozy5.s(i1, str);
                      }
                      stringArray = new String[]{"favorite_shows"};
                      c = s36.c;
                      observable = h16.a(og12.a, false, stringArray, new e12(og12, ozy5, i2)).v(c).y(c).x();
                   }
                }else {
                   observable = ta.a.map(new qn3(p0, false));
                }
             }else {
                og12 = b.w();
                str = p0.toString();
                og12.getClass();
                ozy5 = zy5.x(i1, "SELECT COUNT\(*\)\nFROM favorite_tracks\nWHERE uri = ?");
                if (str == null) {
                   ozy5.z(i1);
                }else {
                   ozy5.s(i1, str);
                }
                stringArray = new String[]{"favorite_tracks"};
                c = s36.c;
                observable = h16.a(og12.a, false, stringArray, new e12(og12, ozy5, i1)).v(c).y(c).x();
             }
          }else {
             og12 = b.w();
             str = p0.toString();
             og12.getClass();
             ozy5 = zy5.x(i1, "SELECT COUNT\(*\)\nFROM favorite_albums\nWHERE uri = ?");
             if (str == null) {
                ozy5.z(i1);
             }else {
                ozy5.s(i1, str);
             }
             stringArray = new String[]{"favorite_albums"};
             c = s36.c;
             observable = h16.a(og12.a, false, stringArray, new e12(og12, ozy5, i2)).v(c).y(c).x();
          }
       }else {
          og12 = b.w();
          str = p0.toString();
          og12.getClass();
          ozy5 = zy5.x(i1, "SELECT COUNT\(*\)\nFROM favorite_artists\nWHERE uri = ?");
          if (str == null) {
             ozy5.z(i1);
          }else {
             ozy5.s(i1, str);
          }
          stringArray = new String[]{"favorite_artists"};
          c = s36.c;
          observable = h16.a(og12.a, false, stringArray, new e12(og12, ozy5, 4)).v(c).y(c).x();
       }
       wn3 tb = this.b;
       tb.getClass();
       return Observable.merge(observable, Completable.i(new g16(tb, 10, p0)).s()).distinctUntilChanged();
    }
    public final Completable c(aq6 p0,boolean p1){
       wn3 ta;
       p0 = td7.c(p0);
       CompletableSource[] uCompletable = new CompletableSource[]{Completable.i(new rn3(ta, p0, p1, 1)).p(s36.c),this.b.c(p0, p1)};
       ta = this.a;
       ta.getClass();
       return Completable.l(uCompletable);
    }
    public final Completable d(aq6 p0,boolean p1){
       yp6 m0 = yp6.m0;
       if (p0.b != m0) {
          return Completable.h(new IllegalArgumentException("Invalid uri, "+p0));
       }
       CompletableSource[] uCompletable = new CompletableSource[2];
       wn3 ta = this.a;
       ta.getClass();
       uCompletable[0] = Completable.i(new rn3(ta, p0, p1, 0)).p(s36.c);
       wn3 tb = this.b;
       tb.getClass();
       ok0 ook0 = (p0.b != m0)? Completable.h(new IllegalArgumentException("Unsupported uri: "+p0)): tb.a();
       uCompletable[1] = ook0;
       return Completable.l(uCompletable);
    }
}
