package p.an5;
import p.hv6;
import p.zm5;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.System;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;

public final class an5 extends hv6	// class@000fb9 from classes.dex
{
    public final AtomicReference a;
    public Throwable b;
    public static final zm5[] c;
    public static final zm5[] t;

    static {
       zm5[] ozm5Array = new zm5[0];
       an5.c = ozm5Array;
       zm5[] ozm5Array1 = new zm5[0];
       an5.t = ozm5Array1;
    }
    public void an5(){
       super();
       this.a = new AtomicReference(an5.t);
    }
    public final void a(zm5 p0){
       zm5[] ozm5Array;
       while (true) {
          an5 ta = this.a;
          if ((ozm5Array = ta.get()) != an5.c) {
             zm5[] t = an5.t;
             if (ozm5Array == t) {
                break ;
             }else {
                int len = ozm5Array.length;
                int i = 0;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      if (ozm5Array[i1] == p0) {
                      label_001f :
                         if (i1 < 0) {
                            return;
                         }
                         int i2 = 1;
                         if (len != i2) {
                            int i3 = len - 1;
                            t = new zm5[i3];
                            System.arraycopy(ozm5Array, i, t, i, i1);
                            int i4 = i1 + 1;
                            len = len - i1;
                            len = len - i2;
                            System.arraycopy(ozm5Array, i4, t, i1, len);
                         }
                         while (true) {
                            if (ta.compareAndSet(ozm5Array, t)) {
                               i = 1;
                            }else {
                               if (ta.get() == ozm5Array) {
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
       an5 ta = this.a;
       zm5[] c = an5.c;
       if (ta.get() == c) {
          return;
       }
       zm5[] andSet = ta.getAndSet(c);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (!oobject.get()) {
             oobject.a.onComplete();
          }
          i = i + 1;
       }
       return;
    }
    public final void onError(Throwable p0){
       iw1.c(p0, "onError called with a null Throwable.");
       an5 ta = this.a;
       zm5[] c = an5.c;
       if (ta.get() == c) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.b = p0;
          zm5[] andSet = ta.getAndSet(c);
          int len = andSet.length;
          int i = 0;
          while (i < len) {
             object oobject = andSet[i];
             if (oobject.get()) {
                RxJavaPlugins.c(p0);
             }else {
                oobject.a.onError(p0);
             }
             i = i + 1;
          }
          return;
       }
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       zm5[] ozm5Array = this.a.get();
       int len = ozm5Array.length;
       int i = 0;
       while (i < len) {
          object oobject = ozm5Array[i];
          if (!oobject.get()) {
             oobject.a.onNext(p0);
          }
          i = i + 1;
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (this.a.get() == an5.c) {
          p0.dispose();
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       an5 tb;
       zm5 ozm5 = new zm5(p0, this);
       p0.onSubscribe(ozm5);
       while (true) {
          an5 ta = this.a;
          zm5[] ozm5Array = ta.get();
          int i = 0;
          if (ozm5Array == an5.c) {
             break ;
          }else {
             int len = ozm5Array.length;
             int i1 = len + 1;
             zm5[] ozm5Array1 = new zm5[i1];
             System.arraycopy(ozm5Array, i, ozm5Array1, i, len);
             ozm5Array1[len] = ozm5;
             while (true) {
                if (ta.compareAndSet(ozm5Array, ozm5Array1)) {
                   i = 1;
                }else {
                   if (ta.get() == ozm5Array) {
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
          if (ozm5.isDisposed()) {
             this.a(ozm5);
          }
       }else if((tb = this.b) != null){
          p0.onError(tb);
       }else {
          p0.onComplete();
       }
       return;
    }
}
