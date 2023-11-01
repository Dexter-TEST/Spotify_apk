package p.ew4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.bw4;
import p.dw4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.System;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ew4 extends AtomicReference implements Observer, Disposable	// class@00150f from classes.dex
{
    public final dw4 a;
    public boolean b;
    public final AtomicReference c;
    public final AtomicBoolean t;
    public final AtomicReference v;
    public static final bw4[] w;
    public static final bw4[] x;

    static {
       bw4[] uobw4Array = new bw4[0];
       ew4.w = uobw4Array;
       bw4[] uobw4Array1 = new bw4[0];
       ew4.x = uobw4Array1;
    }
    public void ew4(dw4 p0,AtomicReference p1){
       super();
       this.a = p0;
       this.v = p1;
       this.c = new AtomicReference(ew4.w);
       this.t = new AtomicBoolean();
    }
    public final void a(bw4 p0){
       int len;
       bw4[] w;
       while (true) {
          ew4 tc = this.c;
          bw4[] uobw4Array = tc.get();
          if (!(len = uobw4Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (uobw4Array[i1].equals(p0)) {
                   label_001d :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         w = ew4.w;
                      }else {
                         int i3 = len - 1;
                         bw4[] uobw4Array1 = new bw4[i3];
                         System.arraycopy(uobw4Array, i, uobw4Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(uobw4Array, i4, uobw4Array1, i1, len);
                         w = uobw4Array1;
                      }
                      while (true) {
                         if (tc.compareAndSet(uobw4Array, w)) {
                            i = 1;
                         }else {
                            if (tc.get() == uobw4Array) {
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
                   goto label_001d ;
                }
             }
          }
       }
       return;
    }
    public void dispose(){
       ew4 tv;
       this.c.set(ew4.x);
       do {
          tv = this.v;
       } while (tv.compareAndSet(this, null) || tv.get() != this);
       cd1.a(this);
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == ew4.x)? true: false;
       return b;
    }
    public final void onComplete(){
       if (this.b == null) {
          this.b = true;
          ew4 ta = this.a;
          ta.a();
          bw4[] andSet = this.c.getAndSet(ew4.x);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(andSet[i]);
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b == null) {
          this.b = true;
          ew4 ta = this.a;
          ta.d(p0);
          bw4[] andSet = this.c.getAndSet(ew4.x);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(andSet[i]);
          }
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.b == null) {
          ew4 ta = this.a;
          ta.c(p0);
          p0 = this.c.get();
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(p0[i]);
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          bw4[] uobw4Array = this.c.get();
          int len = uobw4Array.length;
          for (int i = 0; i < len; i = i + 1) {
             this.a.g(uobw4Array[i]);
          }
       }
       return;
    }
}
