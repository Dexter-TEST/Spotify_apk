package p.g16;
import p.b5;
import java.lang.Object;
import p.t35;
import p.c35;
import java.lang.String;
import p.w86;
import p.y56;
import java.lang.Class;
import p.an5;
import p.z56;
import p.b76;
import p.yg5;
import p.aq6;
import p.yp6;
import p.dp;
import p.a90;
import p.z80;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import p.zg5;
import p.wm;
import p.a66;
import p.c76;
import p.ow0;
import p.mo;
import p.gv0;
import p.or7;
import p.r44;
import android.support.v4.media.MediaMetadataCompat;
import android.content.Context;
import p.wu;
import p.mi;
import p.sa1;
import java.lang.Boolean;
import p.oa1;
import p.wh2;
import p.fn0;
import p.pa1;
import p.ra1;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import io.reactivex.rxjava3.core.Scheduler;
import p.na1;
import p.mb;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bo3;
import p.vn3;
import com.google.common.collect.d;
import p.t00;
import p.eq3;
import java.lang.Iterable;
import java.util.Iterator;
import java.io.File;
import p.l32;
import com.spotify.base.java.logging.Logger;
import p.al5;
import p.jg2;
import p.sv;
import p.jq3;
import p.je7;
import p.ce7;
import com.spotify.lite.database.room.UserRoomDatabase;
import p.xy5;
import p.rn1;
import p.np3;
import p.nq5;
import com.spotify.lite.database.room.RecentSearchRoomDatabase;
import p.mq5;
import p.kg4;
import p.mp3;
import p.jq5;
import p.lq5;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import p.dp3;
import p.zh4;
import p.si4;
import com.spotify.lite.database.room.NetworkRoomDatabase;
import p.tc3;
import p.vc3;
import p.y87;
import p.q97;
import p.rb4;
import p.gw;
import java.util.Collection;
import com.google.common.collect.c;
import p.o11;
import p.bm;
import p.s36;
import p.ox7;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.g97;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import p.a97;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.s81;
import p.d97;
import p.e97;
import p.c97;
import p.f97;
import p.n74;
import p.z87;
import p.mg1;
import p.b97;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.xk5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.p97;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.o16;
import p.qb4;
import p.hr0;
import java.lang.NullPointerException;

public final class g16 implements b5	// class@00167f from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void g16(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void run(){
       al5 c;
       File uFile;
       gv0 l;
       gv0 i2;
       zg5 d1;
       aq6 t;
       aq6 b1;
       z80 oz80;
       aq6 t1;
       aq6 b2;
       q97 a2;
       int i = 0;
       int i1 = 1;
       g16 tc = this.c;
       g16 tb = this.b;
       switch (this.a){
           case 0:
             tb.e.c(tc);
             return;
           case 1:
             si4 osi4 = tb.a.t();
             osi4.a.b();
             osi4.a.c();
             osi4.b.h(tc);
             osi4.a.r();
             osi4.a.m();
             return;
           case 2:
             lq5 olq5 = tb.a.t();
             olq5.b.c();
             kg4.a(olq5, tc);
             olq5.b.r();
             olq5.b.m();
             return;
           case 3:
             nq5 onq5 = tb.a.t();
             onq5.a.c();
             kg4.b(onq5, tc);
             onq5.a.r();
             onq5.a.m();
             return;
           case 4:
             tb.a.t().d(tc);
             return;
           case 5:
             ce7 uoce7 = tb.a.t();
             uoce7.a.b();
             uoce7.a.c();
             uoce7.b.h(tc);
             uoce7.a.r();
             uoce7.a.m();
             return;
           case 6:
             c = tb.c;
             c.onNext(tc.apply(c.c()));
             return;
           case 7:
             tb.accept(tc);
             return;
           case 8:
             tb.getClass();
             Iterator iterator = tc.iterator();
             while (iterator.hasNext()) {
                if ((uFile = iterator.next()) != null) {
                   tb.c.getClass();
                   l32.b(uFile);
                   if (uFile.mkdirs()) {
                      Object[] objArray = new Object[i1];
                      objArray[i] = uFile;
                      Logger.b("Could not re-create %s", objArray);
                   }
                }
             }
             return;
             break;
           case 9:
             tb.a.onNext(tc);
             return;
           case 10:
             tb.i.onNext(tc);
             return;
           case 11:
             tb.getClass();
             boolean b = tc.booleanValue();
             sa1 a = tb.a;
             a.a.b = b;
             oa1 d = a.d;
             if (b && !d.isDisposed()) {
                oa1 c1 = a.c;
                c1.getClass();
                Single single = Single.create(new pa1(c1));
                co5.l(single, "override fun collectStor…        \)\n        }\n    }");
                d.c(single.subscribeOn(a.b).subscribe(new na1(a), mb.w));
             }else {
                d.dispose();
             }
             return;
             break;
           case 12:
             ow0 m = tb.m;
             if (tc != m.j) {
                m.j = tc;
                if ((l = m.l) != null && (i2 = m.i) != null) {
                   i2.o(mi.h(m.a, l, i2.b.b(), tc));
                }
             }
             return;
             break;
           case 13:
             tb.A.onNext(tc);
             return;
           case 14:
             tb.C.onNext(tc);
             return;
           case 15:
             if ((d1 = tb.d) != null) {
                if ((t = tc.t) != null && ((b1 = tc.b) == yp6.A && b1 != yp6.B)) {
                   a90 uoa90 = d1.get();
                   uoa90.getClass();
                   oz80 = new z80(uoa90);
                   while (oz80.hasNext()) {
                      if (oz80.next().contains(t)) {
                         oz80.remove();
                      }
                   }
                }else {
                   throw new IllegalArgumentException(String.valueOf(tc));
                }
             }
             return;
             break;
           case 16:
             tb.getClass();
             if ((t1 = tc.t) != null && ((b2 = tc.b) == yp6.A && b2 != yp6.B)) {
                a90 uoa901 = tb.a.get();
                uoa901.getClass();
                oz80 = new z80(uoa901);
                while (oz80.hasNext()) {
                   if (oz80.next().contains(t1)) {
                      oz80.remove();
                   }
                }
                return;
             }else {
                throw new IllegalArgumentException(String.valueOf(tc));
             }
             break;
           case 17:
             tb.y.onNext(tc);
             return;
           case 18:
             tb.getClass();
             tb.A.onNext(tc.H);
             return;
           case 19:
             tb.getClass();
             tb.z.onNext(tc.H);
             return;
           case 20:
             tb.setOneTimePass(tc.a);
             return;
           default:
             y87 a1 = tb.a;
             if ((a2 = a1.a) != null) {
                a2.dispose();
                a1.a = null;
             }
             ArrayList e = y87.e;
             ArrayList g = y87.g;
             ArrayList f = y87.f;
             boolean b3 = tc.booleanValue();
             if (a1.a == null) {
                gw f1 = gw.f;
                c uoc = c.o(e);
                f1.getClass();
                o11 oo11 = new o11(f1, i);
                if (uoc != null) {
                   oo11.c = uoc;
                   c uoc1 = c.o(f);
                   o11 oo111 = new o11(oo11.m(), i);
                   if (uoc1 != null) {
                      oo111.v = uoc1;
                      c uoc2 = c.o(g);
                      o11 oo112 = new o11(oo111.m(), i);
                      if (uoc2 != null) {
                         oo112.t = uoc2;
                         RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
                         subtypeEffec.g(a97.class, new g97(a1.b, b3));
                         subtypeEffec.g(d97.class, new s81(14, s36.b));
                         subtypeEffec.g(c97.class, new e97(a1.c, a1.i, ox7.j(), b3));
                         subtypeEffec.c(z87.class, new f97(a1.e, i));
                         subtypeEffec.c(b97.class, new mg1(18, a1.h));
                         ObservableSource[] observableSo = new ObservableSource[i1];
                         observableSo[i] = a1.d.a;
                         rb4 orb4 = mi.A(new bm(13), RxConnectables.a(subtypeEffec.h())).a(new bm(2)).b(new bm(3)).d(new bm(7)).c(RxEventSources.a(observableSo)).e(new o16("InAppMessaging")).f(oo112.m());
                         a1.a = orb4;
                         orb4.b(a1.f);
                      }else {
                         throw new NullPointerException("Null actionCapabilities");
                      }
                   }else {
                      throw new NullPointerException("Null triggerTypes");
                   }
                }else {
                   throw new NullPointerException("Null formatCapabilities");
                }
             }
             return;
       }
    }
}
