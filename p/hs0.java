package p.hs0;
import p.ir0;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ge6;
import p.t37;
import p.d22;
import java.lang.String;
import java.lang.Enum;
import java.lang.Class;
import p.zz4;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.b5;
import p.xo5;
import p.n22;
import p.co5;
import p.xs6;
import p.ny3;
import p.gz3;
import p.vu5;
import p.fx3;
import com.spotify.lyrics.reportview.events.proto.LyricsErrorReportingEvent;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.gu0;
import p.hy3;
import p.gy3;
import p.iz3;
import p.ay6;
import p.dk3;
import p.vj3;
import p.dx3;
import p.n05;
import p.m05;
import com.spotify.liteoffline.offline.OfflineNotificationWorker;
import p.kv6;
import com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import p.o11;
import p.to6;
import p.ap6;
import p.zo6;
import p.wf2;
import p.w50;
import p.uo6;
import p.wn6;
import p.tn6;
import p.rn6;
import p.ic;
import java.lang.System;
import java.lang.Boolean;
import p.hs5;
import java.lang.Throwable;
import p.jc7;
import p.lf1;
import java.lang.StringBuilder;
import p.hs3;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.IllegalStateException;
import p.gs0;
import com.spotify.base.java.logging.Logger;
import p.of1;

public final class hs0 implements ir0	// class@0018af from classes.dex
{
    public final int a;
    public final Object b;

    public void hs0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(Disposable p0){
       hs0 tb = this.b;
       switch (this.a){
           case 12:
           default:
             tb.getClass();
             cd1.d(tb, p0);
             return;
       }
       tb.name();
       Object[] objArray = new Object[0];
       t37.a().getClass();
       ge6.k(objArray);
       return;
    }
    public final void accept(Object p0){
       hy3 e;
       iz3 i;
       iz3 i1;
       String str = "it";
       boolean b = true;
       hs0 tb = this.b;
       switch (this.a){
           case 0:
             this.b(p0);
             return;
           case 1:
             this.b(p0);
             return;
           case 2:
             tb.invoke();
             return;
           case 3:
             this.b(p0);
             return;
           case 4:
             this.b(p0);
             return;
           case 5:
             tb.a = b;
             return;
           case 6:
             co5.o(p0, "partnerId");
             o11 b1 = tb.b;
             b1.getClass();
             b1.a(new zo6(b1, p0));
             b1 = tb.v;
             wn6 own6 = b1.a.edit();
             own6.c(uo6.c, p0);
             b1.b.getClass();
             own6.b(uo6.d, System.currentTimeMillis());
             own6.e();
             return;
           case 7:
             tb.a = b;
             return;
           case 8:
             if (p0 instanceof m05) {
                tb.j(p0);
             }
             return;
             break;
           case 9:
             hy3 a = tb.a;
             if ((e = tb.e) != null) {
                co5.l(p0, str);
                a.getClass();
                a.a = e;
                a.b = p0;
                gu0 b2 = p0.b;
                if ((i = b2.i) != null) {
                   p0 = a.g;
                   i.c(p0.getValue());
                   if ((i1 = b2.i) != null) {
                      i1.a(p0.getValue());
                   }
                }else {
                   a.a(e, p0);
                }
                return;
             }else {
                co5.N("viewBinder");
                throw null;
             }
             break;
           case 10:
             ny3 a1 = p0.a;
             vu5 a2 = p0.d.a;
             tb.getClass();
             co5.o(a1, "trackUri");
             ny3 b3 = p0.b;
             co5.o(b3, "provider");
             p0 = p0.c;
             co5.o(p0, "providerLyricsId");
             co5.o(a2, "reportType");
             fx3 uofx3 = LyricsErrorReportingEvent.j();
             uofx3.f(a1);
             uofx3.d(b3);
             uofx3.e(p0);
             uofx3.c(a2);
             p0 = uofx3.build();
             co5.l(p0, "newBuilder\(\)\n           …
                    .build\(\)");
             tb.a.a(p0);
             return;
           case 12:
             this.a(p0);
             return;
           case 13:
             co5.l(p0, str);
             tb.a.c(p0);
             return;
           case 14:
             tb.run();
             return;
           default:
             this.a(p0);
             return;
       }
    }
    public final void b(Throwable p0){
       hs0 tb = this.b;
       switch (this.a){
           case 0:
             Object[] objArray = new Object[0];
             Logger.c(p0, "Failed to load "+tb+".imageUri", objArray);
             return;
           case 1:
             if (!tb.isDisposed()) {
                if (p0 != null) {
                   tb.onError(p0);
                }else {
                   throw new IllegalStateException("Required value was null.".toString());
                }
             }
             return;
             break;
           case 3:
             tb.b.a("Error while synchronizing dropped events file content: "+p0);
             return;
           default:
             tb.b.a("Error running DroppedEventsScheduler: "+p0.getMessage());
             return;
       }
    }
}
