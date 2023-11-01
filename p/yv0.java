package p.yv0;
import p.yf2;
import p.cw0;
import java.lang.Object;
import p.aq6;
import p.ow0;
import io.reactivex.rxjava3.core.Observable;
import p.wn3;
import p.xv0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.zv0;
import io.reactivex.rxjava3.core.Completable;
import p.m73;
import java.lang.Class;
import com.google.common.collect.c;
import java.lang.String;
import p.w51;
import com.google.common.collect.b;
import p.qc7;
import java.util.Iterator;
import p.s05;
import p.r05;
import p.ok0;
import p.do5;
import java.util.Arrays;
import p.ys5;
import java.util.Objects;
import p.bw0;
import com.spotify.playerlimited.player.models.OfflineTracksResources;
import java.util.List;
import p.ci4;
import p.aw6;
import p.xe7;
import p.k73;
import com.spotify.playerlimited.player.models.OfflineTracksResource;
import com.spotify.playerlimited.player.models.OfflineResource;
import p.te5;
import p.o05;
import java.util.AbstractCollection;
import p.dt5;
import p.q05;

public final class yv0 implements yf2	// class@002e31 from classes.dex
{
    public final int a;
    public final cw0 b;

    public void yv0(cw0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       OfflineTracksResources a1;
       q05 m;
       OfflineTracksResource c;
       int i4;
       OfflineResource a2;
       yv0 oyv0 = this;
       int i = 1;
       int i1 = 0;
       int i2 = 4;
       String str = "initialCapacity";
       yv0 b = oyv0.b;
       switch (oyv0.a){
           case 0:
             b.getClass();
             w51.h(i2, str);
             Object[] objArray = new Object[i2];
             qc7 oqc7 = p0.j().l();
             i2 = 0;
             while (oqc7.hasNext()) {
                ok0 ook0 = b.w(oqc7.next().m.m);
                int i3 = i2 + 1;
                if (objArray.length < i3) {
                   objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i3));
                }
                objArray[i2] = ook0;
                i2 = i3;
             }
             ys5 oys5 = c.m(i2, objArray);
             Objects.requireNonNull(oys5, "sources is null");
             return new ok0(i1, oys5);
             break;
           case 1:
           default:
             bw0 uobw0 = p0;
             b.getClass();
             bw0 a = uobw0.a;
             if ((a1 = a.a) != null && !a1.isEmpty()) {
                aw6 uoaw6 = xe7.I(new ci4(2, b));
                k73 ok73 = m73.a();
                Iterator iterator = a.a.iterator();
                while (iterator.hasNext()) {
                   OfflineTracksResource offlineTrack = iterator.next();
                   if (te5.a(offlineTrack.a)) {
                   }else {
                      o05 oo05 = cw0.A(offlineTrack.a, offlineTrack.b, uobw0, uoaw6);
                      w51.h(i2, str);
                      Object[] objArray1 = new Object[i2];
                      if ((c = offlineTrack.c) != null) {
                         Iterator iterator1 = c.iterator();
                         i4 = 0;
                         while (iterator1.hasNext()) {
                            OfflineResource offlineResou = iterator1.next();
                            if (te5.a(offlineResou.a)) {
                               continue ;
                            }else {
                               r05 or05 = new r05(offlineResou.a, cw0.A(offlineResou.a, offlineResou.b, uobw0, uoaw6));
                               i1 = i4 + 1;
                               if (objArray1.length < i1) {
                                  objArray1 = Arrays.copyOf(objArray1, do5.t(objArray1.length, i1));
                               }
                               objArray1[i4] = or05;
                               i4 = i1;
                               i1 = 0;
                            }
                         }
                      }else {
                         i4 = 0;
                      }
                      if (!c.m(i4, objArray1).isEmpty()) {
                         a2 = offlineTrack.a;
                         ok73.d(a2, new s05(new r05(a2, oo05), c.m(i4, objArray1)));
                      }
                      a2 = 0;
                   }
                }
                m = new q05(ok73.b(i));
             }else {
                m = cw0.M;
             }
             return m;
       }
       aq6 uoaq6 = p0;
       return b.l.b(uoaq6).compose(new xv0(b, 7)).distinctUntilChanged().flatMapCompletable(new zv0(b, uoaq6, i));
    }
}
