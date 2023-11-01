package p.qu5;
import p.hv6;
import p.ou5;
import java.lang.Object;
import p.pu5;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.System;
import p.ak4;
import java.io.Serializable;
import p.nu5;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import java.lang.Class;
import p.mu5;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;

public final class qu5 extends hv6	// class@002419 from classes.dex
{
    public final nu5 a;
    public final AtomicReference b;
    public boolean c;
    public static final ou5[] t;
    public static final ou5[] v;
    public static final Object[] w;

    static {
       ou5[] oou5Array = new ou5[0];
       qu5.t = oou5Array;
       oou5Array = new ou5[0];
       qu5.v = oou5Array;
       Object[] objArray = new Object[0];
       qu5.w = objArray;
    }
    public void qu5(pu5 p0){
       super();
       this.a = p0;
       this.b = new AtomicReference(qu5.t);
    }
    public final void a(ou5 p0){
       ou5[] oou5Array;
       while (true) {
          qu5 tb = this.b;
          if ((oou5Array = tb.get()) != qu5.v) {
             ou5[] t = qu5.t;
             if (oou5Array == t) {
                break ;
             }else {
                int len = oou5Array.length;
                int i = 0;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      if (oou5Array[i1] == p0) {
                      label_001f :
                         if (i1 < 0) {
                            return;
                         }
                         int i2 = 1;
                         if (len != i2) {
                            int i3 = len - 1;
                            t = new ou5[i3];
                            System.arraycopy(oou5Array, i, t, i, i1);
                            int i4 = i1 + 1;
                            len = len - i1;
                            len = len - i2;
                            System.arraycopy(oou5Array, i4, t, i1, len);
                         }
                         while (true) {
                            if (tb.compareAndSet(oou5Array, t)) {
                               i = 1;
                            }else {
                               if (tb.get() == oou5Array) {
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
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       ak4 a = ak4.a;
       qu5 ta = this.a;
       qu5 oqu5 = ta;
       oqu5.a(a);
       ta.compareAndSet(null, a);
       ou5[] andSet = this.b.getAndSet(qu5.v);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          oqu5.b(andSet[i]);
       }
       return;
    }
    public final void onError(Throwable p0){
       iw1.c(p0, "onError called with a null Throwable.");
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          yj4 oyj4 = new yj4(p0);
          qu5 ta = this.a;
          qu5 oqu5 = ta;
          oqu5.a(oyj4);
          ta.compareAndSet(null, oyj4);
          ou5[] andSet = this.b.getAndSet(qu5.v);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             oqu5.b(andSet[i]);
          }
          return;
       }
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       if (this.c != null) {
          return;
       }
       qu5 ta = this.a;
       ta.getClass();
       mu5 omu5 = new mu5(p0);
       p0 = ta.t;
       ta.t = omu5;
       ta.b = ta.b + 1;
       p0.set(omu5);
       if ((p0 = ta.b) > ta.a) {
          p0--;
          ta.b = p0;
          ta.c = ta.c.get();
       }
       p0 = this.b.get();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          ta.b(p0[i]);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (this.c != null) {
          p0.dispose();
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       int i;
       ou5 oou5 = new ou5(p0, this);
       p0.onSubscribe(oou5);
       while (true) {
          qu5 tb = this.b;
          ou5[] oou5Array = tb.get();
          i = 0;
          if (oou5Array == qu5.v) {
             break ;
          }else {
             int len = oou5Array.length;
             int i1 = len + 1;
             ou5[] oou5Array1 = new ou5[i1];
             System.arraycopy(oou5Array, i, oou5Array1, i, len);
             oou5Array1[len] = oou5;
             while (true) {
                if (tb.compareAndSet(oou5Array, oou5Array1)) {
                   i = 1;
                }else {
                   if (tb.get() == oou5Array) {
                      continue ;
                   }
                }
                if (i) {
                   i = 1;
                }else {
                   continue ;
                }
             }
             this.a(oou5);
             return;
          }
       }
       if (i && oou5.t != null) {
       }else {
          this.a.b(oou5);
          return;
       }
    }
}
