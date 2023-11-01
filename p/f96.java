package p.f96;
import p.k73;
import p.m73;
import p.yp6;
import p.d96;
import java.lang.Object;
import android.content.Context;
import com.spotify.searchview.proto.Entity;
import java.util.List;
import java.lang.String;
import p.aq6;
import p.td7;
import p.iu2;
import p.ty0;
import java.lang.StringBuilder;
import p.c03;
import p.fu2;
import p.su2;
import p.rm;
import com.spotify.searchview.proto.Track;
import p.bc3;
import java.lang.Iterable;
import p.ab2;
import p.pq5;
import p.jg2;
import p.vf;
import p.xe3;
import com.spotify.searchview.proto.AudioShow;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Album;
import p.gu2;
import p.j13;
import p.st2;
import java.io.Serializable;
import p.k23;
import java.util.Collections;
import p.i13;
import java.lang.Enum;
import p.au2;
import p.s23;

public abstract class f96	// class@001585 from classes.dex
{
    public static final m73 a;

    static {
       k73 ok73 = m73.a();
       ok73.d(yp6.t, d96.t);
       ok73.d(yp6.b, d96.v);
       ok73.d(yp6.m0, d96.w);
       ok73.d(yp6.z, d96.x);
       d96 y = d96.y;
       ok73.d(yp6.A, y);
       ok73.d(yp6.B, y);
       ok73.d(yp6.l0, d96.z);
       ok73.d(yp6.w, d96.A);
       f96.a = ok73.a();
    }
    public static List a(Context p0,int p1,Entity p2){
       aq6 uoaq6;
       d96 uod96;
       Object[] objArray;
       bc3 uobc3;
       String str2;
       ab2 uoab2;
       if ((uoaq6 = td7.d(p2.k())) != null) {
          int i = 0;
          int i1 = 1;
          int i2 = ((uoaq6 = uoaq6.b) == yp6.G)? 1: 0;
          if (!i2) {
             iu2 oiu2 = ty0.k().o("top-results-"+p1).k(c03.b);
             su2 osu2 = ty0.z().d(p2.getName());
             if ((uod96 = f96.a.get(uoaq6)) == null) {
                uod96 = d96.B;
             }
             String str = "";
             String str1 = ", ";
             switch (uod96.c.a){
                 case 8:
                   objArray = new Object[i1];
                   if ((uobc3 = p2.f().f()) != null) {
                      str = new xe3(new vf(str1), new vf(str1)).r(uobc3);
                   }
                   objArray[i] = str;
                   str2 = p0.getString(R.string.search_hit_subtitle_album, objArray);
                   break;
                 case 9:
                   str2 = p0.getString(R.string.search_hit_subtitle_artist);
                   break;
                 case 10:
                   objArray = new Object[i1];
                   objArray[i] = p2.g().g();
                   str2 = p0.getString(R.string.search_hit_subtitle_episode, objArray);
                   break;
                 case 11:
                   str2 = p0.getString(R.string.search_hit_subtitle_genre);
                   break;
                 case 12:
                   str2 = p0.getString(R.string.search_hit_subtitle_playlist);
                   break;
                 case 13:
                   objArray = new Object[i1];
                   objArray[i] = p2.h().g();
                   str2 = p0.getString(R.string.search_hit_subtitle_show, objArray);
                   break;
                 case 14:
                   objArray = new Object[i1];
                   if ((uoab2 = ab2.b(p2.j().g()).m(new pq5(2))) != null) {
                      str = new xe3(new vf(str1), new vf(str1)).r(uoab2);
                   }
                   objArray[i] = str;
                   str2 = p0.getString(R.string.search_hit_subtitle_track, objArray);
                   break;
                 default:
                   str2 = null;
             }
             return Collections.singletonList(oiu2.s(osu2.a(str2)).p(ty0.o().d(f96.b(uoaq6, p2))).d("click", ty0.j().d("navigate").a("uri", p2.k())).g());
          }
       }
       return Collections.emptyList();
    }
    public static j13 b(yp6 p0,Entity p1){
       d96 uod96;
       if ((uod96 = f96.a.get(p0)) == null) {
          uod96 = d96.B;
       }
       return ty0.n().g(p1.i()).e(uod96.a).b(uod96.b).c();
    }
}
