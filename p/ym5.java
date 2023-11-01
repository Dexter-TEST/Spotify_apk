package p.ym5;
import p.g92;
import p.xm5;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.vv7;
import p.ya4;
import p.kv6;
import java.lang.System;

public final class ym5 extends g92	// class@002de9 from classes.dex
{
    public final AtomicReference b;
    public Throwable c;
    public static final xm5[] t;
    public static final xm5[] v;

    static {
       xm5[] oxm5Array = new xm5[0];
       ym5.t = oxm5Array;
       xm5[] oxm5Array1 = new xm5[0];
       ym5.v = oxm5Array1;
    }
    public void ym5(){
       super();
       this.b = new AtomicReference(ym5.v);
    }
    public final void onComplete(){
       ym5 tb = this.b;
       xm5[] t = ym5.t;
       if (tb.get() == t) {
          return;
       }
       xm5[] andSet = tb.getAndSet(t);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (oobject.get() - Long.MIN_VALUE) {
             oobject.a.onComplete();
          }
          i = i + 1;
       }
       return;
    }
    public final void onError(Throwable p0){
       iw1.c(p0, "onError called with a null Throwable.");
       ym5 tb = this.b;
       xm5[] t = ym5.t;
       if (tb.get() == t) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = p0;
          xm5[] andSet = tb.getAndSet(t);
          int len = andSet.length;
          int i = 0;
          while (i < len) {
             object oobject = andSet[i];
             if (oobject.get() - Long.MIN_VALUE) {
                oobject.a.onError(p0);
             }else {
                RxJavaPlugins.c(p0);
             }
             i = i + 1;
          }
          return;
       }
    }
    public final void onNext(Object p0){
       xm5 a;
       iw1.c(p0, "onNext called with a null value.");
       xm5[] oxm5Array = this.b.get();
       int len = oxm5Array.length;
       int i = 0;
       while (i < len) {
          object oobject = oxm5Array[i];
          long l = oobject.get();
          if (l - Long.MIN_VALUE) {
             a = oobject.a;
             if (l) {
                a.onNext(p0);
                vv7.I(oobject, 1);
             }else {
                oobject.cancel();
                a.onError(new ya4("Could not emit value due to lack of requests"));
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (this.b.get() == ym5.t) {
          p0.cancel();
          return;
       }else {
          p0.a(Long.MAX_VALUE);
          return;
       }
    }
    public final void u(iv6 p0){
       int i;
       ym5 tc;
       xm5 oxm5 = new xm5(p0, this);
       p0.onSubscribe(oxm5);
       while (true) {
          ym5 tb = this.b;
          xm5[] oxm5Array = tb.get();
          i = 0;
          if (oxm5Array == ym5.t) {
             tb = 0;
          }else {
             int len = oxm5Array.length;
             int i1 = len + 1;
             xm5[] oxm5Array1 = new xm5[i1];
             System.arraycopy(oxm5Array, i, oxm5Array1, i, len);
             oxm5Array1[len] = oxm5;
             while (true) {
                if (tb.compareAndSet(oxm5Array, oxm5Array1)) {
                   tb = 1;
                }else {
                   if (tb.get() != oxm5Array) {
                      tb = 0;
                   }
                }
                if (tb) {
                   tb = 1;
                }else {
                   continue ;
                }
             }
          }
       }
       if (tb) {
          if (!(oxm5.get() - Long.MIN_VALUE)) {
             i = 1;
          }
          if (i) {
             this.z(oxm5);
          }
       }else if((tc = this.c) != null){
          p0.onError(tc);
       }else {
          p0.onComplete();
       }
       return;
    }
    public final void z(xm5 p0){
       xm5[] oxm5Array;
       while (true) {
          ym5 tb = this.b;
          if ((oxm5Array = tb.get()) != ym5.t) {
             xm5[] v = ym5.v;
             if (oxm5Array == v) {
                break ;
             }else {
                int len = oxm5Array.length;
                int i = 0;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      if (oxm5Array[i1] == p0) {
                      label_001f :
                         if (i1 < 0) {
                            return;
                         }
                         int i2 = 1;
                         if (len != i2) {
                            int i3 = len - 1;
                            v = new xm5[i3];
                            System.arraycopy(oxm5Array, i, v, i, i1);
                            int i4 = i1 + 1;
                            len = len - i1;
                            len = len - i2;
                            System.arraycopy(oxm5Array, i4, v, i1, len);
                         }
                         while (true) {
                            if (tb.compareAndSet(oxm5Array, v)) {
                               i = 1;
                            }else {
                               if (tb.get() == oxm5Array) {
                                  continue ;
                               }
                            }
                            if (i) {
                               break ;
                            }
                         }
                         return;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      i1 = -1;
                      goto label_001f ;
                   }
                }
             }
          }else {
          }
       }
    }
}
