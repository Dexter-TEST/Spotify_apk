package p.k12;
import p.yf2;
import java.lang.Object;
import p.cv2;
import java.lang.Class;
import p.vu2;
import p.av2;
import p.tn6;
import p.y15;
import com.google.common.collect.d;
import com.google.common.collect.g;
import p.rn6;
import java.util.Set;
import p.co6;
import java.lang.String;
import p.co5;
import p.nh3;
import p.bo6;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import p.sn6;
import java.lang.Throwable;
import p.ma3;
import p.jl;
import p.ot;
import com.android.installreferrer.api.ReferrerDetails;
import com.android.installreferrer.api.InstallReferrerClient;
import p.b43;
import p.rq2;
import p.ju2;
import java.util.List;
import p.au2;
import p.fu2;
import java.util.HashSet;
import p.tu2;
import p.xe7;
import p.te5;
import p.zt2;
import p.ty0;
import java.lang.Iterable;
import p.ab2;
import p.rd3;
import com.google.common.collect.c;
import p.a43;
import p.a23;
import p.z23;
import p.l51;
import p.do5;
import p.z4;
import com.spotify.webapi.service.models.CursorPager;
import com.spotify.webapi.service.models.Pager;
import p.r45;
import com.spotify.webapi.service.models.Episodes;
import p.bo3;
import com.spotify.webapi.service.models.ArtistsCursorPager;
import p.aq6;
import p.yp6;
import java.util.Collection;
import p.wu2;

public final class k12 implements yf2	// class@001b86 from classes.dex
{
    public final int a;

    public void k12(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       au2 uoau2;
       boolean b = false;
       switch (this.a){
           case 0:
             return p0.a;
           case 1:
             p0.getClass();
             return p0;
           case 2:
             return p0.a;
           case 3:
             return new HashSet(p0);
           case 4:
             return new aq6(yp6.G, null, p0).toString();
           case 5:
             return p0.artists;
           case 6:
             return p0.artists;
           case 7:
             return p0.episodes;
           case 8:
             return p0.b();
           case 9:
             return p0.next;
           case 10:
             return p0.items;
           case 11:
             return p0.next;
           case 12:
             return p0.items;
           case 13:
             return new z4(p0, b);
           case 14:
             return p0.c;
           case 15:
             return Observable.never();
           case 16:
             return do5.u0(p0);
           case 17:
             return do5.s(p0);
           case 18:
             p0.getClass();
             return p0;
           case 19:
             p0.getClass();
             return p0;
           case 20:
             return p0.a;
           case 21:
             int i = 1;
             if (p0.e() == null) {
                boolean b1 = (!p0.m().isEmpty())? p0.m().get(b).b().y("skip-top-bar-transformation", b): false;
                if (!b1) {
                   b1 = (!p0.m().isEmpty())? rq2.a.contains(p0.m().get(b).q().c()): false;
                   if (b1 && !p0.m().isEmpty()) {
                      b1 = 1;
                   label_00e7 :
                      if (b1) {
                         uoau2 = p0.b();
                         au2 uoau21 = uoau2.m("topbar");
                         String str = xe7.J(p0.m().get(b).y().d());
                         if (!te5.a(str)) {
                            zt2 ozt2 = (uoau21 == null)? ty0.b(): uoau21.a();
                            Iterable iterable = ab2.b(p0.m()).c();
                            iterable.getClass();
                            p0 = p0.a().h(uoau2.a().e("topbar", ozt2.r("title", str).d()).d()).e(ab2.b(new rd3(iterable, i, b)).d()).g();
                         }
                      }
                      return p0;
                   }
                }
             }
             uoau2 = 0;
             goto label_00e7 ;
             break;
           case 22:
             return p0.getInstallReferrer();
           case 23:
             return new ot(p0.getInstallReferrer());
           case 24:
             jl.q("Error getting referrer data", p0);
             return new ot("");
           case 25:
             if ((p0 = p0.a) == null) {
                p0 = g.A;
             }else {
             }
             return p0;
             break;
           case 26:
             g a = g.A;
             rn6 b2 = y15.b;
             co6 uoco6 = p0.c(b2, a);
             co5.o(b2, "key");
             p0 = Observable.create(new nh3(p0, b2, bo6.c));
             co5.l(p0, "create\(\n            KeyO…)\n            }\n        \)");
             p0 = p0.map(new k12(25));
             if (uoco6 != null) {
                a = uoco6;
             }
             return p0.startWithItem(a);
             break;
           case 27:
             p0.getClass();
             return p0;
           case 28:
             p0.getClass();
             return p0;
           default:
             return p0.a;
       }
    }
}
