package p.gc7;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hv6;
import p.gq6;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import p.fc7;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.core.Observer;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.IllegalStateException;

public final class gc7 extends hv6 implements Disposable	// class@0016e4 from classes.dex
{
    public final gq6 a;
    public final boolean b;
    public final AtomicInteger c;
    public final AtomicReference t;
    public final AtomicReference v;
    public final AtomicReference w;

    public void gc7(){
       super();
       this.a = new gq6(10);
       this.b = true;
       this.w = new AtomicReference();
       this.t = new AtomicReference();
       this.c = new AtomicInteger();
       this.v = new AtomicReference();
    }
    public final void a(){
       fc7 uofc7;
       Object obj;
       int i3;
       gc7 tc = this.c;
       if (tc.getAndIncrement()) {
          return;
       }
       gc7 tv = this.v;
       gc7 tw = this.w;
       int i = 1;
       do {
          if ((uofc7 = tw.get()) != null) {
             Throwable throwable = tv.get();
             int i1 = 0;
             int i2 = (throwable != null)? 1: 0;
             gc7 ta = this.a;
             fc7 a = uofc7.a;
             if (i2 && (this.b == null && throwable != iw1.a)) {
                ta.clear();
                while (true) {
                   if (tw.compareAndSet(uofc7, null)) {
                      i1 = 1;
                   }else {
                      if (tw.get() == uofc7) {
                         continue ;
                      }
                   }
                   if (i1) {
                      a.onError(throwable);
                   }else {
                   }
                }
                return;
             }else if((obj = ta.poll()) == null){
                i3 = 1;
             }else {
                i3 = 0;
             }
             if (i2 && i3) {
                if (throwable != iw1.a) {
                   while (true) {
                      if (tw.compareAndSet(uofc7, null)) {
                         i1 = 1;
                      }else {
                         if (tw.get() == uofc7) {
                            continue ;
                         }
                      }
                      if (i1) {
                         a.onError(throwable);
                      }else {
                      }
                   }
                }else if(tw.compareAndSet(uofc7, null)){
                   i1 = 1;
                }else {
                   if (tw.get() == uofc7) {
                      continue ;
                   }
                }
                if (i1) {
                   a.onComplete();
                }
             }else if(i3){
             }else if(uofc7 == tw.get()){
                a.onNext(obj);
             }
          }else {
          }
       } while (!(i = - i));
    }
    public void dispose(){
       cd1.a(this.t);
       gc7 tv = this.v;
       hw1 a = iw1.a;
       while (true) {
          if (tv.compareAndSet(null, a)) {
             tv = 1;
          }else {
             if (tv.get() != null) {
                tv = 0;
             }
          }
          if (tv) {
             this.a();
             break ;
          }
          break ;
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.t.get());
    }
    public final void onComplete(){
       gc7 tv = this.v;
       hw1 a = iw1.a;
       while (true) {
          if (tv.compareAndSet(null, a)) {
             tv = 1;
          }else {
             if (tv.get() != null) {
                tv = 0;
             }
          }
          if (tv) {
             this.a();
             break ;
          }
          break ;
       }
       return;
    }
    public final void onError(Throwable p0){
       Objects.requireNonNull(p0, "e is null");
       gc7 tv = this.v;
       while (true) {
          if (tv.compareAndSet(null, p0)) {
             tv = 1;
          }else {
             if (tv.get() != null) {
                tv = 0;
             }
          }
          if (tv) {
             this.a();
             break ;
          }else {
             RxJavaPlugins.c(p0);
             break ;
          }
       }
       return;
    }
    public final void onNext(Object p0){
       Objects.requireNonNull(p0, "t is null");
       if (this.v.get() == null) {
          this.a.offer(p0);
          this.a();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.t, p0);
    }
    public final void subscribeActual(Observer p0){
       int i;
       fc7 uofc7 = new fc7(this, p0);
       p0.onSubscribe(uofc7);
       gc7 tw = this.w;
       while (true) {
          if (tw.compareAndSet(null, uofc7)) {
             i = 1;
          }else {
             if (tw.get() != null) {
                i = 0;
             }
          }
          if (i) {
             if (uofc7.get()) {
                do {
                } while (tw.compareAndSet(uofc7, null) || tw.get() != uofc7);
             }else {
                this.a();
                break ;
             }
          }else {
             p0.onError(new IllegalStateException("Only one Observer allowed at a time"));
             break ;
          }
          break ;
       }
       return;
    }
}
