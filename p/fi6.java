package p.fi6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.Single;
import p.ei6;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.System;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class fi6 extends Single implements SingleObserver	// class@0015d4 from classes.dex
{
    public final SingleSource a;
    public final AtomicInteger b;
    public final AtomicReference c;
    public Object t;
    public Throwable v;
    public static final ei6[] w;
    public static final ei6[] x;

    static {
       ei6[] uoei6Array = new ei6[0];
       fi6.w = uoei6Array;
       ei6[] uoei6Array1 = new ei6[0];
       fi6.x = uoei6Array1;
    }
    public void fi6(SingleSource p0){
       super();
       this.a = p0;
       this.b = new AtomicInteger();
       this.c = new AtomicReference(fi6.w);
    }
    public final void c(ei6 p0){
       int len;
       ei6[] w;
       while (true) {
          fi6 tc = this.c;
          ei6[] uoei6Array = tc.get();
          if (!(len = uoei6Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (uoei6Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         w = fi6.w;
                      }else {
                         int i3 = len - 1;
                         ei6[] uoei6Array1 = new ei6[i3];
                         System.arraycopy(uoei6Array, i, uoei6Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(uoei6Array, i4, uoei6Array1, i1, len);
                         w = uoei6Array1;
                      }
                      while (true) {
                         if (tc.compareAndSet(uoei6Array, w)) {
                            i = 1;
                         }else {
                            if (tc.get() == uoei6Array) {
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
    public final void onError(Throwable p0){
       this.v = p0;
       ei6[] andSet = this.c.getAndSet(fi6.x);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (!oobject.isDisposed()) {
             oobject.a.onError(p0);
          }
          i = i + 1;
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
    }
    public void onSuccess(Object p0){
       this.t = p0;
       ei6[] andSet = this.c.getAndSet(fi6.x);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (!oobject.isDisposed()) {
             oobject.a.onSuccess(p0);
          }
          i = i + 1;
       }
       return;
    }
    public final void subscribeActual(SingleObserver p0){
       fi6 tv;
       ei6 uoei6 = new ei6(p0, this);
       p0.onSubscribe(uoei6);
       while (true) {
          fi6 tc = this.c;
          ei6[] uoei6Array = tc.get();
          int i = 0;
          if (uoei6Array == fi6.x) {
             break ;
          }else {
             int len = uoei6Array.length;
             int i1 = len + 1;
             ei6[] uoei6Array1 = new ei6[i1];
             System.arraycopy(uoei6Array, i, uoei6Array1, i, len);
             uoei6Array1[len] = uoei6;
             while (true) {
                if (tc.compareAndSet(uoei6Array, uoei6Array1)) {
                   i = 1;
                }else {
                   if (tc.get() == uoei6Array) {
                      continue ;
                   }
                }
                if (i) {
                   i = 1;
                }else {
                   continue ;
                }
             }
          }
       }
       if (i) {
          if (uoei6.isDisposed()) {
             this.c(uoei6);
          }
          if (!this.b.getAndIncrement()) {
             this.a.subscribe(this);
          }
          return;
       }else if((tv = this.v) != null){
          p0.onError(tv);
       }else {
          p0.onSuccess(this.t);
       }
       return;
    }
}
