package p.p00;
import p.g92;
import java.lang.Object;
import p.o00;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import p.iw1;
import p.ak4;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yj4;
import p.kv6;
import p.iv6;
import java.lang.System;

public final class p00 extends g92	// class@0021c2 from classes.dex
{
    public final AtomicReference b;
    public final Lock c;
    public final Lock t;
    public final AtomicReference v;
    public final AtomicReference w;
    public long x;
    public static final o00[] A;
    public static final Object[] y;
    public static final o00[] z;

    static {
       Object[] objArray = new Object[0];
       p00.y = objArray;
       o00[] oo00Array = new o00[0];
       p00.z = oo00Array;
       o00[] oo00Array1 = new o00[0];
       p00.A = oo00Array1;
    }
    public void p00(){
       super();
       this.v = new AtomicReference();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.c = reentrantRea.readLock();
       this.t = reentrantRea.writeLock();
       this.b = new AtomicReference(p00.z);
       this.w = new AtomicReference();
    }
    public final void onComplete(){
       ak4 a1;
       p00 tw = this.w;
       hw1 a = iw1.a;
       while (true) {
          int i = 0;
          if (tw.compareAndSet(null, a)) {
             tw = 1;
          }else {
             if (tw.get() != null) {
                a1 = 0;
             }
          }
          if (!tw) {
             break ;
          }else {
             a1 = ak4.a;
             p00 tt = this.t;
             tt.lock();
             this.x = this.x + 1;
             this.v.lazySet(a1);
             tt.unlock();
             o00[] andSet = this.b.getAndSet(p00.A);
             int len = andSet.length;
             for (; i < len; i = i + 1) {
                andSet[i].c(this.x, a1);
             }
             return;
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       yj4 oyj4;
       iw1.c(p0, "onError called with a null Throwable.");
       p00 tw = this.w;
       while (true) {
          int i = 0;
          if (tw.compareAndSet(null, p0)) {
             tw = 1;
          }else {
             if (tw.get() != null) {
                oyj4 = 0;
             }
          }
          if (!tw) {
             break ;
          }else {
             oyj4 = new yj4(p0);
             p00 tt = this.t;
             tt.lock();
             this.x = this.x + 1;
             this.v.lazySet(oyj4);
             tt.unlock();
             o00[] andSet = this.b.getAndSet(p00.A);
             int len = andSet.length;
             for (; i < len; i = i + 1) {
                andSet[i].c(this.x, oyj4);
             }
             return;
          }
       }
       RxJavaPlugins.c(p0);
       return;
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       if (this.w.get() != null) {
          return;
       }
       p00 tt = this.t;
       tt.lock();
       this.x = this.x + 1;
       this.v.lazySet(p0);
       tt.unlock();
       o00[] oo00Array = this.b.get();
       int len = oo00Array.length;
       for (int i = 0; i < len; i = i + 1) {
          oo00Array[i].c(this.x, p0);
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (this.w.get() != null) {
          p0.cancel();
          return;
       }else {
          p0.a(Long.MAX_VALUE);
          return;
       }
    }
    public final void u(iv6 p0){
       p00 tb;
       boolean b;
       Throwable throwable;
       o00 oo00 = new o00(p0, this);
       p0.onSubscribe(oo00);
       while (true) {
          tb = this.b;
          o00[] oo00Array = tb.get();
          b = false;
          if (oo00Array == p00.A) {
             tb = 0;
          }else {
             int len = oo00Array.length;
             int i = len + 1;
             o00[] oo00Array1 = new o00[i];
             System.arraycopy(oo00Array, b, oo00Array1, b, len);
             oo00Array1[len] = oo00;
             while (true) {
                if (tb.compareAndSet(oo00Array, oo00Array1)) {
                   tb = 1;
                }else {
                   if (tb.get() != oo00Array) {
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
          if (oo00.x != null) {
             this.z(oo00);
          }else if(oo00.x != null){
             _monitor_enter(oo00);
             if (oo00.x != null) {
                _monitor_exit(oo00);
             }else if(oo00.c != null){
                _monitor_exit(oo00);
             }else {
                o00 b1 = oo00.b;
                tb = b1.c;
                tb.lock();
                oo00.y = b1.x;
                b1 = b1.v.get();
                tb.unlock();
                if (b1 != null) {
                   b = true;
                }
                oo00.t = b;
                oo00.c = true;
                _monitor_exit(oo00);
                if (b1 != null && !oo00.test(b1)) {
                   oo00.b();
                }
             }
          }
       }else if((throwable = this.w.get()) == iw1.a){
          p0.onComplete();
       }else {
          p0.onError(throwable);
       }
       return;
    }
    public final void z(o00 p0){
       int len;
       o00[] z;
       while (true) {
          p00 tb = this.b;
          o00[] oo00Array = tb.get();
          if (!(len = oo00Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (oo00Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         z = p00.z;
                      }else {
                         int i3 = len - 1;
                         o00[] oo00Array1 = new o00[i3];
                         System.arraycopy(oo00Array, i, oo00Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(oo00Array, i4, oo00Array1, i1, len);
                         z = oo00Array1;
                      }
                      while (true) {
                         if (tb.compareAndSet(oo00Array, z)) {
                            i = 1;
                         }else {
                            if (tb.get() == oo00Array) {
                               continue ;
                            }
                         }
                         if (i) {
                         }
                      }
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0019 ;
                }
             }
          }
       }
       return;
    }
}
