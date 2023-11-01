package p.ec7;
import p.hv6;
import java.lang.Runnable;
import p.gq6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.dc7;
import java.lang.String;
import p.ap5;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.IllegalStateException;
import p.jl1;

public final class ec7 extends hv6	// class@001461 from classes.dex
{
    public boolean A;
    public final gq6 a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final boolean t;
    public boolean v;
    public boolean w;
    public Throwable x;
    public final AtomicBoolean y;
    public final dc7 z;

    public void ec7(int p0,Runnable p1){
       super();
       this.a = new gq6(p0);
       this.c = new AtomicReference(p1);
       this.t = true;
       this.b = new AtomicReference();
       this.y = new AtomicBoolean();
       this.z = new dc7(this);
    }
    public static ec7 a(int p0,Runnable p1){
       ap5.E(p0, "capacityHint");
       Objects.requireNonNull(p1, "onTerminate");
       return new ec7(p0, p1);
    }
    public final void b(){
       Runnable runnable;
       ec7 tc = this.c;
       if ((runnable = tc.get()) != null) {
          while (true) {
             if (tc.compareAndSet(runnable, null)) {
                tc = 1;
             }else {
                if (tc.get() != runnable) {
                   tc = 0;
                }
             }
             if (tc) {
                runnable.run();
                break ;
             }
          }
       }
       return;
    }
    public final void c(){
       ec7 ta;
       int i3;
       ec7 tx;
       ec7 tx1;
       Object obj;
       if (this.z.getAndIncrement()) {
          return;
       }
       Observer observer = this.b.get();
       int i = 1;
       int i1 = 1;
       while (true) {
          if (observer != null) {
             if (this.A != null) {
                ta = this.a;
                int i2 = this.t ^ i;
                i3 = 1;
                do {
                   if (this.v != null) {
                      this.b.lazySet(null);
                      break ;
                   }else {
                      ec7 tw = this.w;
                      if (i2 && tw != null) {
                         if ((tx = this.x) != null) {
                            this.b.lazySet(null);
                            ta.clear();
                            observer.onError(tx);
                            tx = 1;
                         }else {
                            tx = 0;
                         }
                         if (!tx) {
                         label_0048 :
                            observer.onNext(null);
                            if (tw != null) {
                               this.b.lazySet(null);
                               if ((tx1 = this.x) != null) {
                                  observer.onError(tx1);
                                  break ;
                               }else {
                                  observer.onComplete();
                                  break ;
                               }
                            }
                         }
                      }else {
                         goto label_0048 ;
                      }
                   }
                } while (!(i3 = - i3));
             }else {
                ec7 ta1 = this.a;
                i3 = this.t ^ 0x01;
                ta = 1;
                int i4 = 1;
                do {
                   if (this.v != null) {
                      this.b.lazySet(null);
                      ta1.clear();
                      break ;
                   }else {
                      tx = this.w;
                      int i5 = ((obj = this.a.poll()) == null)? 1: 0;
                      if (tx != null) {
                         if (i3 && ta) {
                            if ((ta = this.x) != null) {
                               this.b.lazySet(null);
                               ta1.clear();
                               observer.onError(ta);
                               ta = 1;
                            }else {
                               ta = 0;
                            }
                            if (!ta) {
                               ta = 0;
                            }
                         }
                         if (i5) {
                            this.b.lazySet(null);
                            if ((tx1 = this.x) != null) {
                               observer.onError(tx1);
                               break ;
                            }else {
                               observer.onComplete();
                               break ;
                            }
                         }
                      }
                      if (i5) {
                         if (i4 = - i4) {
                            continue ;
                         }
                      }else {
                         observer.onNext(obj);
                         continue ;
                      }
                   }
                } while (!(i4 = - i4));
             }
             break ;
          }else if(!(i1 = - i1)){
             return;
          }else {
             observer = this.b.get();
          }
       }
       return;
    }
    public final void onComplete(){
       if (this.w == null && this.v == null) {
          this.w = true;
          this.b();
          this.c();
       }
       return;
    }
    public final void onError(Throwable p0){
       iw1.c(p0, "onError called with a null Throwable.");
       if (this.w == null && this.v == null) {
          this.x = p0;
          this.w = true;
          this.b();
          this.c();
          return;
       }else {
          RxJavaPlugins.c(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       if (this.w == null && this.v == null) {
          this.a.offer(p0);
          this.c();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (this.w != null || this.v != null) {
          p0.dispose();
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       if (!this.y.get() && this.y.compareAndSet(false, true)) {
          p0.onSubscribe(this.z);
          this.b.lazySet(p0);
          if (this.v != null) {
             this.b.lazySet(null);
             return;
          }else {
             this.c();
          }
       }else {
          p0.onSubscribe(jl1.a);
          p0.onError(new IllegalStateException("Only a single observer allowed."));
       }
       return;
    }
}
