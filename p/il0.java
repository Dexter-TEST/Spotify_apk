package p.il0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Completable;
import p.hl0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.System;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class il0 extends Completable implements CompletableObserver	// class@0019b4 from classes.dex
{
    public final AtomicReference a;
    public final AtomicBoolean b;
    public Throwable c;
    public static final hl0[] t;
    public static final hl0[] v;

    static {
       hl0[] ohl0Array = new hl0[0];
       il0.t = ohl0Array;
       hl0[] ohl0Array1 = new hl0[0];
       il0.v = ohl0Array1;
    }
    public void il0(){
       super();
       this.b = new AtomicBoolean();
       this.a = new AtomicReference(il0.t);
    }
    public final void o(CompletableObserver p0){
       il0 tc;
       hl0 ohl0 = new hl0(p0, this);
       p0.onSubscribe(ohl0);
       while (true) {
          il0 ta = this.a;
          hl0[] ohl0Array = ta.get();
          int i = 0;
          if (ohl0Array == il0.v) {
             break ;
          }else {
             int len = ohl0Array.length;
             int i1 = len + 1;
             hl0[] ohl0Array1 = new hl0[i1];
             System.arraycopy(ohl0Array, i, ohl0Array1, i, len);
             ohl0Array1[len] = ohl0;
             while (true) {
                if (ta.compareAndSet(ohl0Array, ohl0Array1)) {
                   i = 1;
                }else {
                   if (ta.get() == ohl0Array) {
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
          if (ohl0.isDisposed()) {
             this.v(ohl0);
          }
       }else if((tc = this.c) != null){
          p0.onError(tc);
       }else {
          p0.onComplete();
       }
       return;
    }
    public final void onComplete(){
       boolean b = false;
       if (this.b.compareAndSet(b, true)) {
          hl0[] andSet = this.a.getAndSet(il0.v);
          int len = andSet.length;
          for (; b < len; b = b + 1) {
             andSet[b].a.onComplete();
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       iw1.c(p0, "onError called with a null Throwable.");
       boolean b = false;
       if (this.b.compareAndSet(b, true)) {
          this.c = p0;
          hl0[] andSet = this.a.getAndSet(il0.v);
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
       if (this.a.get() == il0.v) {
          p0.dispose();
       }
       return;
    }
    public final void v(hl0 p0){
       int len;
       hl0[] t;
       while (true) {
          il0 ta = this.a;
          hl0[] ohl0Array = ta.get();
          if (!(len = ohl0Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (ohl0Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         t = il0.t;
                      }else {
                         int i3 = len - 1;
                         hl0[] ohl0Array1 = new hl0[i3];
                         System.arraycopy(ohl0Array, i, ohl0Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(ohl0Array, i4, ohl0Array1, i1, len);
                         t = ohl0Array1;
                      }
                      while (true) {
                         if (ta.compareAndSet(ohl0Array, t)) {
                            i = 1;
                         }else {
                            if (ta.get() == ohl0Array) {
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
