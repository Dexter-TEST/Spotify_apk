package p.v94;
import p.sg2;
import p.r94;
import java.lang.Object;
import p.aq6;
import p.s94;
import p.v72;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Class;
import java.lang.Integer;
import p.yp6;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Throwable;
import p.f72;
import p.ko1;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.xy5;
import p.jo1;
import java.util.concurrent.Callable;
import p.h16;
import io.reactivex.rxjava3.core.Completable;
import p.m94;
import java.util.Objects;
import p.u82;
import p.i77;
import p.f77;
import p.kf6;
import p.jf6;

public final class v94 implements sg2	// class@0029aa from classes.dex
{
    public final int a;
    public final r94 b;

    public void v94(r94 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       String[] stringArray;
       String str = "shows";
       String str1 = "images";
       v94 tb = this.b;
       switch (this.a){
           case 0:
             return tb.a(p0);
           case 1:
             tb.getClass();
             if (p0.b != yp6.l0) {
                p0 = Flowable.h(new IllegalArgumentException(p0.toString()));
             }else {
                kf6 okf6 = tb.a.A();
                p0 = p0.toString();
                okf6.getClass();
                zy5 ozy5 = zy5.x(1, "SELECT \n    shows.uri,\n    shows.name,\n    shows.description,\n    shows.publisher,\n    shows.created,\n    shows.explicit,\n    shows.tag\nFROM shows WHERE shows.uri = ?");
                if (p0 == null) {
                   ozy5.z(1);
                }else {
                   ozy5.s(1, p0);
                }
                stringArray = new String[]{str1,str};
                p0 = h16.a(okf6.b, 1, stringArray, new jf6(okf6, ozy5, 1));
             }
             return p0;
             break;
           case 2:
             return tb.d(p0);
           case 3:
             return tb.d(p0);
           case 4:
             tb.getClass();
             if (p0.b != yp6.w) {
                p0 = Flowable.h(new IllegalArgumentException(p0.toString()));
             }else {
                i77 oi77 = tb.a.B();
                p0 = p0.toString();
                oi77.getClass();
                zy5 ozy51 = zy5.x(1, "SELECT\n    tracks.uri,\n    tracks.album_uri,\n    tracks.name,\n    tracks.preview_id,\n    tracks.explicit,\n    tracks.playable,\n    tracks.created,\n    tracks.album_name,\n    tracks.album_image,\n    tracks.artist_names,\n    tracks.artist_uri,\n    tracks.tag\nFROM tracks WHERE tracks.uri = ?");
                if (p0 == null) {
                   ozy51.z(1);
                }else {
                   ozy51.s(1, p0);
                }
                String[] stringArray1 = new String[]{"images","album_artists","artists","albums","track_artists","tracks"};
                p0 = h16.a(oi77.a, 1, stringArray1, new f77(oi77, ozy51, 2));
             }
             return p0;
             break;
           case 5:
             tb.getClass();
             return tb.c(p0, s94.c.intValue());
           case 6:
             tb.getClass();
             return tb.c(p0, s94.d.intValue());
           case 7:
             return tb.g(p0);
           case 8:
             return tb.a.B().C(s94.d.intValue(), p0.toString());
           case 9:
             return tb.b(p0);
           case 10:
             return tb.g(p0);
           case 11:
             return tb.a.B().C(s94.d.intValue(), p0.toString());
           case 12:
             return tb.e(p0);
           case 13:
             return tb.f(p0);
           case 14:
             return tb.a.B().B(s94.d.intValue(), p0.toString());
           case 15:
             tb.getClass();
             if (p0.b != yp6.m0) {
                p0 = Flowable.h(new IllegalArgumentException(p0.toString()));
             }else {
                ko1 oko1 = tb.a.v();
                String str2 = p0.toString();
                oko1.getClass();
                zy5 ozy52 = zy5.x(1, "SELECT \n    episodes.uri,\n    episodes.podcast_uri,\n    episodes.name,\n    episodes.description,\n    episodes.podcast_name,\n    episodes.release_date,\n    episodes.duration,\n    episodes.playable,\n    episodes.explicit,\n    episodes.created,\n    episodes.preview_id,\n    episodes.image,\n    episodes.tag\nFROM episodes WHERE episodes.uri = ?");
                if (str2 == null) {
                   ozy52.z(1);
                }else {
                   ozy52.s(1, str2);
                }
                stringArray = new String[]{"episode_progress",str,str1,"episodes"};
                p0 = tb.b.a(p0);
                Objects.requireNonNull(p0, "other is null");
                p0 = new u82(h16.a(oko1.b, 1, stringArray, new jo1(oko1, ozy52, 1)), p0, 0);
             }
             return p0;
             break;
           case 16:
             return tb.a(p0);
           case 17:
             tb.getClass();
             return tb.c(p0, s94.c.intValue());
           case 18:
             return tb.g(p0);
           case 19:
             return tb.g(p0);
           case 20:
             return tb.b(p0);
           case 21:
             return tb.g(p0);
           case 22:
             return tb.g(p0);
           case 23:
             return tb.e(p0);
           case 24:
             return tb.f(p0);
           case 25:
             return tb.f(p0);
           default:
             tb.getClass();
             return tb.c(p0, s94.c.intValue());
       }
    }
}
