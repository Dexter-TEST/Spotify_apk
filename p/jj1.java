package p.jj1;
import java.lang.Runnable;
import java.lang.Object;
import p.wk0;
import p.ca0;
import p.bx5;
import p.p61;
import p.s90;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;
import p.fa4;
import p.aq6;
import p.ks0;
import java.lang.Class;
import p.i77;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.xy5;
import p.uy;
import p.uw6;
import p.sw6;
import p.rr;
import p.r45;
import com.google.common.collect.c;
import p.e73;
import p.d1;
import p.gt0;
import p.tr;
import p.nt0;
import p.ur;
import p.te5;
import p.p94;
import p.pe0;
import p.w51;
import p.m74;
import java.lang.CharSequence;
import java.nio.charset.Charset;
import p.fo2;
import p.dw;
import p.rn1;
import p.td7;
import p.yp6;
import p.yv;
import p.xe7;
import java.lang.Boolean;
import p.ic;
import java.lang.System;
import java.lang.Long;
import p.zv;
import java.lang.Exception;
import java.util.concurrent.CyclicBarrier;
import com.spotify.clientfoundations.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import p.xe4;
import p.et3;
import android.os.Bundle;
import p.co5;
import p.mu3;
import p.tz1;
import p.oz1;
import p.e11;
import p.ny1;
import p.sm7;
import p.in5;
import java.util.List;
import p.uv1;
import p.ap5;
import java.util.concurrent.ThreadPoolExecutor;
import android.content.Context;
import p.ij1;
import p.vv7;
import p.dj1;
import p.qb2;
import p.kj1;
import p.gj1;
import java.lang.RuntimeException;

public final class jj1 implements Runnable	// class@001ae7 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void jj1(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final void run(){
       jj1 tb;
       jj1 tc;
       jj1 tt;
       ij1 oij1;
       jj1 tt1;
       c uoc;
       c uoc1;
       aq6 uoaq6;
       void ovoid = null;
       switch (this.a){
           case 0:
             tb = this.b;
             tc = this.c;
             tt = this.t;
             tb.getClass();
             if ((oij1 = vv7.j(tb.b)) != null) {
                dj1 a = oij1.a;
                qb2 t = a.t;
                _monitor_enter(t);
                a.w = tt;
                _monitor_exit(t);
                oij1.a.b(new kj1(tc, tt));
                return;
             }else {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
             }
             break;
           case 1:
             co5.o(this.b, "this$0");
             co5.o(this.c, "$sql");
             co5.o(this.t, "$inputArguments");
             throw ovoid;
           case 2:
             tb = this.b;
             tt = this.c;
             tt1 = this.t;
             co5.o(tb, "this$0");
             co5.o(tt, "$request");
             try{
                co5.o(tt1, "$values");
                tb.u(tt1, tt);
                tb.M(tt, tt1, ovoid);
             }catch(p.ny1 e3){
                tb.M(tt, ovoid, e3);
             }
             return;
             break;
           case 3:
             tb = this.b;
             tt = this.c;
             tt1 = this.t;
             co5.o(tb, "this$0");
             co5.o(tt, "$request");
             try{
                co5.o(tt1, "$extras");
                tb.u(tt1, tt);
                tb.N(tt1, tt);
             }catch(p.tz1 e1){
                tz1 a1 = e1.a;
                String str = a1.a();
                tb.M(tt, a1.t, str, String.valueOf(a1.b));
             }catch(p.ny1 e3){
                tb.M(tt, ovoid, e3.getMessage(), ovoid);
             }
             return;
             break;
           case 4:
             NativeTimerManagerThreadImpl.a(this.b, this.c, this.t);
             return;
           case 5:
             tb = this.b;
             tc = this.c;
             tt = this.t;
             tb.getClass();
             String str1 = tc.toString();
             i77 oi77 = tb.a.B();
             String str2 = tc.toString();
             oi77.a.b();
             uw6 ouw6 = oi77.f.c();
             int i = 1;
             if (str2 == null) {
                ouw6.z(i);
             }else {
                ouw6.s(i, str2);
             }
             oi77.a.c();
             ouw6.u();
             oi77.a.r();
             oi77.a.m();
             oi77.f.f(ouw6);
             if ((uoc = tt.d.f()) != null) {
                e73 uoe73 = uoc.q(0);
                int i1 = 0;
                while (uoe73.hasNext()) {
                   if ((uoc1 = uoe73.next().c.f()) != null) {
                      e73 uoe731 = uoc1.q(0);
                      while (uoe731.hasNext()) {
                         nt0 ont0 = uoe731.next();
                         ur b = ont0.b;
                         ur a2 = ont0.a;
                         if (te5.a(b)) {
                            b = p94.b.b().K(a2, pe0.a).B().toString().substring(0, 20);
                         }
                         int i2 = i1 + 1;
                         oi77.a.b();
                         oi77.a.c();
                         oi77.d.h(dw.b(i1, str1, a2, b));
                         oi77.a.r();
                         oi77.a.m();
                         if ((uoaq6 = td7.d(a2)) != null && uoaq6.b == yp6.F) {
                            yv oyv = new yv();
                            oyv.d(uoaq6.toString());
                            oyv.c(xe7.J(uoaq6.t));
                            oyv.k = uoaq6.v;
                            oyv.i = uoaq6.w;
                            oyv.a("");
                            Boolean fALSE = Boolean.FALSE;
                            oyv.f = fALSE;
                            oyv.e = fALSE;
                            tb.c.getClass();
                            oyv.g = Long.valueOf(System.currentTimeMillis());
                            oi77.u(oyv.b());
                         }
                         i1 = i2;
                      }
                   }
                }
             }
             return;
             break;
           case 6:
             tc = this.c;
             tt = this.t;
             wk0 c = this.b.c;
             if (c.b.J()) {
                tc.g(c, new IOException("Canceled"));
             }else {
                tc.j(c, tt);
             }
             return;
             break;
           default:
             this.c.g(this.b.c, this.t);
             return;
       }
    }
}
