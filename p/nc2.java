package p.nc2;
import p.su1;
import p.t67;
import p.ou1;
import p.lf1;
import p.si4;
import p.o11;
import p.hs3;
import p.uv1;
import p.i70;
import p.vw1;
import io.reactivex.rxjava3.core.Scheduler;
import p.fv1;
import p.am0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ym5;
import io.reactivex.rxjava3.core.Flowable;
import p.ap5;
import p.a92;
import p.lb;
import p.y82;
import p.mf1;
import p.c36;
import p.l72;
import p.qj6;
import p.yf2;
import p.p62;
import p.mc2;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ba5;
import java.lang.Class;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.util.List;
import java.util.Iterator;
import p.bb3;
import p.vp;
import p.r45;
import p.pv1;
import p.kg4;
import p.et5;
import com.spotify.messages.RejectedClientEventNonAuth;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.s74;
import p.tp2;
import p.av6;
import java.util.Set;
import android.os.SystemClock;
import java.lang.Runnable;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;

public final class nc2 implements su1	// class@001fac from classes.dex
{
    public final t67 a;
    public final ou1 b;
    public final if1 c;
    public final si4 d;
    public final hs3 e;
    public final uv1 f;
    public final i70 g;
    public final Scheduler h;
    public final Scheduler i;
    public final fv1 j;
    public final Runnable k;
    public long l;
    public final ym5 m;

    public void nc2(t67 p0,ou1 p1,lf1 p2,si4 p3,o11 p4,hs3 p5,uv1 p6,i70 p7,vw1 p8,Scheduler p9,fv1 p10,am0 p11){
       l72 b;
       qj6 oqj6;
       co5.o(p5, "logger");
       co5.o(p7, "clientContextIdManager");
       co5.o(p9, "timeoutScheduler");
       co5.o(p10, "clock");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       this.j = p10;
       this.k = p11;
       ym5 oym5 = new ym5();
       this.m = oym5;
       int a = Flowable.a;
       ap5.E(a, "capacity");
       y82 oy82 = new a92(oym5, a, co5.f).q(p8);
       mf1 omf1 = new mf1(2, this);
       ap5.E(2, "prefetch");
       if (oy82 instanceof c36) {
          if ((oy82 = oy82.get()) == null) {
             b = l72.b;
          label_006d :
             b.subscribe(new mc2(this, 0), new mc2(this, 1));
             return;
          }else {
             oqj6 = new qj6(oy82, omf1, 1);
          }
       }else {
          oqj6 = new p62(oy82, omf1);
       }
       b = oqj6;
       goto label_006d ;
    }
    public static final void a(nc2 p0,ba5 p1){
       ba5 d1;
       ba5 c;
       int i1;
       p0.getClass();
       nc2 d = p0.d;
       d.getClass();
       ba5 a = p1.a;
       co5.o(a, "eventName");
       TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
       Iterator iterator = d.b.iterator();
       if (!iterator.hasNext()) {
          Iterator iterator1 = d.b.iterator();
          if (!iterator1.hasNext()) {
             r45 or45 = p0.b.a.a();
             int i = 0;
             if ((d1 = p1.d) != null) {
                byte[] uobyteArray = ((c = p1.c) != null && c.length())? 0: 1;
                if (!i1) {
                   p0.d(p1, c);
                }else if(d1 != null){
                   c = (or45.c() && !or45.b().isEmpty())? 1: 0;
                   if (!c) {
                      p0.c.d(a, pv1.w);
                      Object[] objArray = new Object[]{a};
                      p0.e.d(kg4.q(objArray, 1, "An authenticated event %s was dropped by EventSender because the SDK failed to obtain user name. Either you are trying to log an authenticated event before login happens, or you are trying to log before EventSender is been properly initialized.\n\nFor more information see: https://backstage.spotify.net/docs/gabito-docs/event-delivery-sdks/android/limitations/#music-app-only-sending-authenticated-events or reach out to #gabito-users slack channel.\n", "format\(format, *args\)"));
                      et5 uoet5 = RejectedClientEventNonAuth.h();
                      uoet5.c(a);
                      uoet5.d("UNKNOWN_OWNER");
                      uobyteArray = uoet5.build().toByteArray();
                      co5.l(uobyteArray, "buildUnknownOwnerEvent\(\n…          \).toByteArray\(\)");
                      d1 = new ba5("RejectedClientEventNonAuth", uobyteArray, null, false, p1.e);
                      p0.d(objArray, null);
                   }
                }
                if (d1 == null) {
                   p0.d(p1, null);
                }else {
                   p0.d(p1, or45.b());
                }
             }else {
             }
             return;
          }else {
             tp2.v(iterator1.next());
             throw null;
          }
       }else {
          tp2.v(iterator.next());
          throw null;
       }
    }
    public final void b(String p0,String p1,byte[] p2){
       ba5 pv1.v;
       co5.o(p2, "payload");
       int i = av6.g0(p0, "NonAuth", false) ^ 0x01;
       if (p1 == null || !i) {
          p1 = null;
       }
       this.c.d(p0, pv1.v);
       this.g.getClass();
       pv1.v = new ba5(p0, p2, p1, i, null);
       this.m.onNext(pv1.v);
       return;
    }
    public final void c(String p0,byte[] p1){
       co5.o(p1, "payload");
       this.b(p0, null, p1);
    }
    public final void d(ba5 p0,String p1){
       nc2 onc2 = this;
       ba5 uoba5 = p0;
       ba5 b = uoba5.b;
       int i = 1;
       int i1 = 0;
       int i2 = 5120;
       int i3 = (b.length <= i2)? 1: 0;
       ba5 a = uoba5.a;
       if (i3) {
          onc2.a.h(uoba5.f, a, p1, uoba5.e, uoba5.d, b);
          nc2 f = onc2.f;
          f.getClass();
          co5.o(a, "eventName");
          if (f.b.contains(a)) {
             onc2.j.getClass();
             long l = SystemClock.elapsedRealtime();
             if (((l - onc2.l) - 0x7530) >= 0) {
                onc2.l = l;
                onc2.k.run();
             }
          }
       }else {
          onc2.c.d(a, pv1.w);
          et5 uoet5 = RejectedClientEventNonAuth.h();
          uoet5.c(a);
          uoet5.d("PAYLOAD_SIZE_LIMIT_EXCEEDED");
          onc2.a.h(uoba5.f, "RejectedClientEventNonAuth", null, uoba5.e, false, uoet5.build().toByteArray());
          Object[] objArray = new Object[]{a,Integer.valueOf(i2)};
          String str = String.format(Locale.US, "Size of event %s exceeds maximum allowed payload size of %d bytes", Arrays.copyOf(objArray, 2));
          co5.l(str, "format\(locale, format, *args\)");
          onc2.e.d(str);
       }
       return;
    }
}
