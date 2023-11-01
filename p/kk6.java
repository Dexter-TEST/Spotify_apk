package p.kk6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.Single;
import p.jk6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.System;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;

public final class kk6 extends Single implements SingleObserver	// class@001c30 from classes.dex
{
    public final AtomicReference a;
    public final AtomicBoolean b;
    public Object c;
    public Throwable t;
    public static final jk6[] v;
    public static final jk6[] w;

    static {
       jk6[] ojk6Array = new jk6[0];
       kk6.v = ojk6Array;
       jk6[] ojk6Array1 = new jk6[0];
       kk6.w = ojk6Array1;
    }
    public void kk6(){
       super();
       this.b = new AtomicBoolean();
       this.a = new AtomicReference(kk6.v);
    }
    public final void c(jk6 p0){
       int len;
       jk6[] v;
       while (true) {
          kk6 ta = this.a;
          jk6[] ojk6Array = ta.get();
          if (!(len = ojk6Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (ojk6Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         v = kk6.v;
                      }else {
                         int i3 = len - 1;
                         jk6[] ojk6Array1 = new jk6[i3];
                         System.arraycopy(ojk6Array, i, ojk6Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(ojk6Array, i4, ojk6Array1, i1, len);
                         v = ojk6Array1;
                      }
                      while (true) {
                         if (ta.compareAndSet(ojk6Array, v)) {
                            i = 1;
                         }else {
                            if (ta.get() == ojk6Array) {
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
       iw1.c(p0, "onError called with a null Throwable.");
       boolean b = false;
       if (this.b.compareAndSet(b, true)) {
          this.t = p0;
          jk6[] andSet = this.a.getAndSet(kk6.w);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].a.onError(p0);
          }
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (this.a.get() == kk6.w) {
          p0.dispose();
       }
       return;
    }
    public void onSuccess(Object p0){
       iw1.c(p0, "onSuccess called with a null value.");
       boolean b = false;
       if (this.b.compareAndSet(b, true)) {
          this.c = p0;
          jk6[] andSet = this.a.getAndSet(kk6.w);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].a.onSuccess(p0);
          }
       }
       return;
    }
    public final void subscribeActual(SingleObserver p0){
       kk6 tt;
       jk6 ojk6 = new jk6(p0, this);
       p0.onSubscribe(ojk6);
       while (true) {
          kk6 ta = this.a;
          jk6[] ojk6Array = ta.get();
          int i = 0;
          if (ojk6Array == kk6.w) {
             break ;
          }else {
             int len = ojk6Array.length;
             int i1 = len + 1;
             jk6[] ojk6Array1 = new jk6[i1];
             System.arraycopy(ojk6Array, i, ojk6Array1, i, len);
             ojk6Array1[len] = ojk6;
             while (true) {
                if (ta.compareAndSet(ojk6Array, ojk6Array1)) {
                   i = 1;
                }else {
                   if (ta.get() == ojk6Array) {
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
          if (ojk6.isDisposed()) {
             this.c(ojk6);
          }
       }else if((tt = this.t) != null){
          p0.onError(tt);
       }else {
          p0.onSuccess(this.c);
       }
       return;
    }
}
