package p.t00;
import p.hv6;
import p.s00;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import java.util.Objects;
import p.ak4;
import p.yj4;
import java.lang.System;
import p.iw1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;

public final class t00 extends hv6	// class@0026d1 from classes.dex
{
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock t;
    public final AtomicReference v;
    public long w;
    public static final s00[] x;
    public static final s00[] y;

    static {
       s00[] os00Array = new s00[0];
       t00.x = os00Array;
       s00[] os00Array1 = new s00[0];
       t00.y = os00Array1;
    }
    public void t00(Object p0){
       super();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.c = reentrantRea.readLock();
       this.t = reentrantRea.writeLock();
       this.b = new AtomicReference(t00.x);
       this.a = new AtomicReference(p0);
       this.v = new AtomicReference();
    }
    public static t00 a(){
       return new t00(null);
    }
    public static t00 b(Object p0){
       Objects.requireNonNull(p0, "defaultValue is null");
       return new t00(p0);
    }
    public final Object c(){
       Object obj = this.a.get();
       if (!ak4.c(obj) && !obj instanceof yj4) {
          return obj;
       }
       return null;
    }
    public final void d(s00 p0){
       int len;
       s00[] x;
       while (true) {
          t00 tb = this.b;
          s00[] os00Array = tb.get();
          if (!(len = os00Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (os00Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         x = t00.x;
                      }else {
                         int i3 = len - 1;
                         s00[] os00Array1 = new s00[i3];
                         System.arraycopy(os00Array, i, os00Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(os00Array, i4, os00Array1, i1, len);
                         x = os00Array1;
                      }
                      while (true) {
                         if (tb.compareAndSet(os00Array, x)) {
                            i = 1;
                         }else {
                            if (tb.get() == os00Array) {
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
    public final void onComplete(){
       ak4 a1;
       t00 tv = this.v;
       hw1 a = iw1.a;
       while (true) {
          int i = 0;
          if (tv.compareAndSet(null, a)) {
             tv = 1;
          }else {
             if (tv.get() != null) {
                a1 = 0;
             }
          }
          if (!tv) {
             break ;
          }else {
             a1 = ak4.a;
             t00 tt = this.t;
             tt.lock();
             this.w = this.w + 1;
             this.a.lazySet(a1);
             tt.unlock();
             s00[] andSet = this.b.getAndSet(t00.y);
             int len = andSet.length;
             for (; i < len; i = i + 1) {
                andSet[i].b(this.w, a1);
             }
             return;
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       yj4 oyj4;
       iw1.c(p0, "onError called with a null Throwable.");
       t00 tv = this.v;
       while (true) {
          int i = 0;
          if (tv.compareAndSet(null, p0)) {
             tv = 1;
          }else {
             if (tv.get() != null) {
                oyj4 = 0;
             }
          }
          if (!tv) {
             break ;
          }else {
             oyj4 = new yj4(p0);
             t00 tt = this.t;
             tt.lock();
             this.w = this.w + 1;
             this.a.lazySet(oyj4);
             tt.unlock();
             s00[] andSet = this.b.getAndSet(t00.y);
             int len = andSet.length;
             for (; i < len; i = i + 1) {
                andSet[i].b(this.w, oyj4);
             }
             return;
          }
       }
       RxJavaPlugins.c(p0);
       return;
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       if (this.v.get() != null) {
          return;
       }
       t00 tt = this.t;
       tt.lock();
       this.w = this.w + 1;
       this.a.lazySet(p0);
       tt.unlock();
       s00[] os00Array = this.b.get();
       int len = os00Array.length;
       for (int i = 0; i < len; i = i + 1) {
          os00Array[i].b(this.w, p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (this.v.get() != null) {
          p0.dispose();
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       t00 tb;
       boolean b;
       Throwable throwable;
       s00 os00 = new s00(p0, this);
       p0.onSubscribe(os00);
       while (true) {
          tb = this.b;
          s00[] os00Array = tb.get();
          b = false;
          if (os00Array == t00.y) {
             tb = 0;
          }else {
             int len = os00Array.length;
             int i = len + 1;
             s00[] os00Array1 = new s00[i];
             System.arraycopy(os00Array, b, os00Array1, b, len);
             os00Array1[len] = os00;
             while (true) {
                if (tb.compareAndSet(os00Array, os00Array1)) {
                   tb = 1;
                }else {
                   if (tb.get() != os00Array) {
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
          if (os00.x != null) {
             this.d(os00);
          }else if(os00.x != null){
             _monitor_enter(os00);
             if (os00.x != null) {
                _monitor_exit(os00);
             }else if(os00.c != null){
                _monitor_exit(os00);
             }else {
                s00 b1 = os00.b;
                tb = b1.c;
                tb.lock();
                os00.y = b1.w;
                b1 = b1.a.get();
                tb.unlock();
                if (b1 != null) {
                   b = true;
                }
                os00.t = b;
                os00.c = true;
                _monitor_exit(os00);
                if (b1 != null && !os00.test(b1)) {
                   os00.a();
                }
             }
          }
       }else if((throwable = this.v.get()) == iw1.a){
          p0.onComplete();
       }else {
          p0.onError(throwable);
       }
       return;
    }
}
