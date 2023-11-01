package p.tn3;
import java.lang.Runnable;
import p.vn3;
import java.util.List;
import java.lang.Object;
import p.j8;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zk;
import p.t63;
import p.g12;
import p.ic;
import java.lang.Class;
import java.lang.System;
import p.xy5;
import p.uw6;
import p.uy;
import java.util.Iterator;
import com.spotify.webapi.service.models.SavedAlbum;
import p.q02;
import com.spotify.webapi.service.models.AlbumSimple;
import java.lang.String;
import p.rn1;
import p.hr;
import p.xe7;
import java.lang.Long;
import p.ir;
import p.sw6;
import com.spotify.webapi.service.models.Album;
import com.spotify.webapi.service.models.ArtistSimple;
import p.kr;
import p.d8;
import java.lang.NullPointerException;
import com.spotify.webapi.service.models.Artist;
import p.u02;
import p.c12;
import p.kf6;
import com.spotify.webapi.service.models.SavedShow;
import p.a12;
import com.spotify.webapi.service.models.ShowSimple;
import p.kv;
import java.lang.Boolean;
import p.lv;
import p.fh5;
import p.oe7;
import com.spotify.webapi.service.models.PlaylistSimple;
import com.spotify.webapi.service.models.PlaylistBase;
import p.td7;
import p.y02;
import p.o11;
import com.spotify.webapi.service.models.UserPublic;
import p.kw;
import p.yu;
import p.zu;
import p.ko1;
import com.spotify.webapi.service.models.Episode;
import p.x02;
import com.spotify.webapi.service.models.EpisodeSimple;
import p.te5;
import android.net.Uri;
import p.ys;
import java.lang.Integer;
import p.zs;
import com.spotify.webapi.service.models.ResumePoint;
import p.qo5;
import p.at;

public final class tn3 implements Runnable	// class@0027a5 from classes.dex
{
    public final int a;
    public final vn3 b;
    public final List c;

    public void tn3(vn3 p0,List p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       t63 ot63;
       g12 og12;
       long l;
       g12 a;
       g12 k;
       uw6 ouw6;
       Iterator iterator;
       String str1;
       UserPublic uri;
       vn3 b1;
       t63 ot631;
       g12 og121;
       long l1;
       g12 q;
       uw6 ouw61;
       SavedShow show;
       ShowSimple explicit;
       boolean b2;
       g12 a2;
       AlbumSimple uri1;
       Album artists;
       hr uri1;
       Episode show1;
       EpisodeSimple is_playable;
       EpisodeSimple resumePoint;
       ResumePoint resumePositi;
       boolean b4;
       String str = "Null uri";
       int i = 0;
       int i1 = 1;
       tn3 tc = this.c;
       tn3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           case 1:
             b1 = tb.b;
             kf6 okf6 = b1.A();
             ot631 = b1.x();
             og121 = b1.w();
             tb.c.getClass();
             l1 = System.currentTimeMillis();
             a = og121.a;
             a.b();
             q = og121.q;
             ouw61 = q.c();
             a.c();
             ouw61.u();
             a.r();
             a.m();
             q.f(ouw61);
             iterator = tc.iterator();
             while (iterator.hasNext()) {
                if ((show = iterator.next().show) == null) {
                   continue ;
                }else {
                   k = og121.a;
                   k.b();
                   k.c();
                   og121.f.h(new a12(show.uri));
                   k.r();
                   k.m();
                   kv okv = new kv();
                   okv.e(show.uri);
                   okv.c(xe7.J(show.name));
                   okv.b(xe7.J(show.description));
                   okv.d(xe7.J(show.publisher));
                   okv.f = Long.valueOf(l1);
                   b2 = ((explicit = show.explicit) != null && explicit.booleanValue())? true: false;
                   okv.g = Boolean.valueOf(b2);
                   okf6.j(okv.a());
                   vn3.a(ot631, show.uri, show.images);
                }
             }
             return;
             break;
           case 2:
             og121 = tb.b.w();
             a2 = og121.a;
             a2.b();
             og12 = og121.i;
             uw6 ouw62 = og12.c();
             a2.c();
             ouw62.u();
             a2.r();
             a2.m();
             og12.f(ouw62);
             Iterator iterator1 = tc.iterator();
             while (iterator1.hasNext()) {
                og12 = og121.a;
                og12.b();
                og12.c();
                og121.b.h(new c12(iterator1.next()));
                og12.r();
                og12.m();
             }
             return;
             break;
           case 3:
             b1 = tb.b;
             zk ozk = b1.u();
             t63 ot632 = b1.x();
             og121 = b1.w();
             tb.c.getClass();
             long l2 = System.currentTimeMillis();
             g12 a3 = og121.a;
             a3.b();
             g12 o = og121.o;
             uw6 ouw63 = o.c();
             a3.c();
             ouw63.u();
             a3.r();
             a3.m();
             o.f(ouw63);
             Iterator iterator2 = tc.iterator();
             while (iterator2.hasNext()) {
                Artist uArtist = iterator2.next();
                g12 a4 = og121.a;
                a4.b();
                a4.c();
                og121.e.h(new u02(uArtist.uri));
                a4.r();
                a4.m();
                hr o1 = new hr();
                o1.d(uArtist.uri);
                o1.c(xe7.J(uArtist.name));
                o1.d = Long.valueOf(l2);
                ozk.e(o1.b());
                vn3.a(ot632, uArtist.uri, uArtist.images);
             }
             return;
             break;
           case 4:
             vn3 b3 = tb.b;
             j8 oj8 = b3.t();
             zk ozk1 = b3.u();
             ot63 = b3.x();
             a2 = b3.w();
             tb.c.getClass();
             l = System.currentTimeMillis();
             a = a2.a;
             a.b();
             k = a2.m;
             ouw6 = k.c();
             a.c();
             ouw6.u();
             a.r();
             a.m();
             k.f(ouw6);
             iterator = tc.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return;
                }
                SavedAlbum savedAlbum = iterator.next();
                g12 a5 = a2.a;
                a5.b();
                a5.c();
                a2.d.h(new q02(savedAlbum.album.uri));
                a5.r();
                a5.m();
                hr ohr = new hr();
                SavedAlbum album = savedAlbum.album;
                if ((uri1 = album.uri) != null) {
                   ohr.b = uri1;
                   ohr.c = xe7.J(album.name);
                   ohr.d = Long.valueOf(l);
                   oj8.l(ohr.a());
                   SavedAlbum album1 = savedAlbum.album;
                   vn3.a(ot63, album1.uri, album1.images);
                   AlbumSimple uri2 = savedAlbum.album.uri;
                   oj8.b.b();
                   ouw6 = oj8.v.c();
                   if (uri2 == null) {
                      ouw6.z(i1);
                   }else {
                      ouw6.s(i1, uri2);
                   }
                   oj8.b.c();
                   ouw6.u();
                   oj8.b.r();
                   oj8.b.m();
                   oj8.v.f(ouw6);
                   if ((artists = savedAlbum.album.artists) != null) {
                      Iterator iterator3 = artists.iterator();
                      while (iterator3.hasNext()) {
                         ArtistSimple uArtistSimpl = iterator3.next();
                         uri1 = new hr();
                         uri1.d(uArtistSimpl.uri);
                         uri1.c(xe7.J(uArtistSimpl.name));
                         uri1.d = Long.valueOf(l);
                         ozk1.e(uri1.b());
                         oj8.m(new d8(savedAlbum.album.uri, uArtistSimpl.uri));
                      }
                   }
                }else {
                   break ;
                }
             }
             throw new NullPointerException(str);
             break;
           default:
             b1 = tb.b;
             ko1 oko1 = b1.v();
             ot631 = b1.x();
             og121 = b1.w();
             tb.c.getClass();
             l1 = System.currentTimeMillis();
             a = og121.a;
             a.b();
             q = og121.s;
             ouw61 = q.c();
             a.c();
             ouw61.u();
             a.r();
             a.m();
             q.f(ouw61);
             iterator = tc.iterator();
             while (iterator.hasNext()) {
                Episode uEpisode = iterator.next();
                k = og121.a;
                k.b();
                k.c();
                og121.g.h(new x02(uEpisode.uri));
                k.r();
                k.m();
                str1 = null;
                String lastPathSegm = (!te5.a(uEpisode.audioPreviewUrl))? Uri.parse(uEpisode.audioPreviewUrl).getLastPathSegment(): str1;
                ys oys = new ys();
                oys.g(uEpisode.uri);
                String str2 = ((show1 = uEpisode.show) == null)? str1: show1.uri;
                oys.e(xe7.J(str2));
                oys.c(xe7.J(uEpisode.name));
                oys.b(xe7.J(uEpisode.description));
                if ((show1 = uEpisode.show) != null) {
                   explicit = show1.name;
                }
                oys.d(xe7.J(str1));
                oys.f(xe7.J(uEpisode.releaseDate));
                oys.h = Integer.valueOf(uEpisode.durationMs);
                b2 = ((is_playable = uEpisode.is_playable) != null && !is_playable.booleanValue())? false: true;
                oys.i = Boolean.valueOf(b2);
                b2 = ((is_playable = uEpisode.explicit) != null && is_playable.booleanValue())? true: false;
                oys.j = Boolean.valueOf(b2);
                oys.k = Long.valueOf(l1);
                oys.l = lastPathSegm;
                oko1.o(oys.a());
                if ((resumePoint = uEpisode.resumePoint) != null) {
                   resumePositi = resumePoint.resumePositionMs;
                   b4 = resumePoint.fullyPlayed.booleanValue();
                }else {
                   b4 = false;
                   resumePositi = 0;
                }
                qo5 oqo5 = at.a();
                oqo5.d(uEpisode.uri);
                oqo5.i(resumePositi);
                oqo5.f(b4);
                oko1.p(oqo5.c());
                vn3.a(ot631, uEpisode.uri, uEpisode.images);
             }
             return;
       }
       vn3 b = tb.b;
       fh5 uofh5 = b.y();
       oe7 ooe7 = b.C();
       ot63 = b.x();
       og12 = b.w();
       tb.c.getClass();
       l = System.currentTimeMillis();
       a = og12.a;
       a.b();
       k = og12.k;
       ouw6 = k.c();
       a.c();
       ouw6.u();
       a.r();
       a.m();
       k.f(ouw6);
       iterator = tc.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          PlaylistSimple playlistSimp = iterator.next();
          if (playlistSimp.owner == null) {
             continue ;
          }else {
             str1 = td7.b(playlistSimp.uri);
             g12 a1 = og12.a;
             a1.b();
             a1.c();
             og12.c.h(new y02(str1));
             a1.r();
             a1.m();
             o11 oo11 = new o11(19, i);
             PlaylistBase owner = playlistSimp.owner;
             if ((uri = owner.uri) != null) {
                oo11.c = uri;
                if ((uri = owner.id) != null) {
                   oo11.t = uri;
                   oo11.v = xe7.J(owner.display_name);
                   oo11.w = Long.valueOf(l);
                   ooe7.l(oo11.n());
                   yu oyu = new yu();
                   if (str1 != null) {
                      oyu.b = str1;
                      oyu.c = xe7.J(playlistSimp.name);
                      oyu.d = playlistSimp.owner.uri;
                      oyu.e = Long.valueOf(l);
                      uofh5.g(oyu.a());
                      vn3.a(ot63, str1, playlistSimp.images);
                   }else {
                      break ;
                   }
                }else {
                   throw new NullPointerException("Null username");
                }
             }else {
                throw new NullPointerException(str);
             }
          }
       }
       throw new NullPointerException(str);
    }
}
