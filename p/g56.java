package p.g56;
import java.lang.String;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import p.e56;
import java.util.concurrent.Callable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.f56;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.rk0;
import p.c16;
import p.yf2;
import p.j56;
import p.xy5;
import p.uw6;
import p.uy;
import java.lang.Integer;
import com.spotify.base.java.logging.Logger;
import p.hv;
import p.sw6;

public abstract class g56	// class@0016a4 from classes.dex
{
    public final MetadataRoomDatabase a;
    public static final String[] b;

    static {
       String[] stringArray = new String[0];
       g56.b = stringArray;
    }
    public void g56(MetadataRoomDatabase p0){
       super();
       this.a = p0;
    }
    public final Single a(String p0,long p1){
       Scheduler c = s36.c;
       Single single = Single.fromCallable(new e56(this, p0, p1)).subscribeOn(c);
       rk0 ork0 = Completable.i(new f56(this, 0)).p(c);
       return single.flatMap(new c16(ork0, 1, Completable.i(new f56(this, 1)).p(c)));
    }
    public final void b(){
       j56 oj56 = this;
       j56 c = oj56.c;
       c.b();
       oj56 = oj56.M;
       uw6 ouw6 = oj56.c();
       c.c();
       c.r();
       c.m();
       oj56.f(ouw6);
       Object[] objArray = new Object[]{Integer.valueOf(ouw6.u())};
       Logger.e("Scrubbed %d track rows without a matching track or episode", objArray);
    }
    public final hv c(String p0){
       hv "Tagged %d albums, %d artists, %d episodes, %d playlists, %d shows and %d tracks with \"%s\"";
       j56 oj56 = this;
       j56 c = oj56.c;
       c.b();
       j56 d = oj56.d;
       uw6 ouw6 = d.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       c.c();
       int i = ouw6.u();
       c.r();
       c.m();
       d.f(ouw6);
       c.b();
       d = oj56.e;
       ouw6 = d.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       c.c();
       int i1 = ouw6.u();
       c.r();
       c.m();
       d.f(ouw6);
       c.b();
       d = oj56.f;
       ouw6 = d.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       c.c();
       int i2 = ouw6.u();
       c.r();
       c.m();
       d.f(ouw6);
       c.b();
       d = oj56.g;
       ouw6 = d.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       c.c();
       int i3 = ouw6.u();
       c.r();
       c.m();
       d.f(ouw6);
       c.b();
       d = oj56.h;
       ouw6 = d.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       c.c();
       int i4 = ouw6.u();
       c.r();
       c.m();
       d.f(ouw6);
       c.b();
       oj56 = oj56.i;
       uw6 ouw61 = oj56.c();
       if (p0 == null) {
          ouw61.z(1);
       }else {
          ouw61.s(1, p0);
       }
       c.c();
       int i5 = ouw61.u();
       c.r();
       c.m();
       oj56.f(ouw61);
       Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(i3),Integer.valueOf(i4),Integer.valueOf(i5),p0};
       Logger.e("Tagged %d albums, %d artists, %d episodes, %d playlists, %d shows and %d tracks with \"%s\"", objArray);
       "Tagged %d albums, %d artists, %d episodes, %d playlists, %d shows and %d tracks with \"%s\"" = new hv(i, i1, i2, i3, i4, i5);
       return "Tagged %d albums, %d artists, %d episodes, %d playlists, %d shows and %d tracks with \"%s\"";
    }
}
