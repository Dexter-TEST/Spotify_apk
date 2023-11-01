package p.qt4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicInteger;
import p.ot4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.gq6;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Class;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.String;
import p.jl1;

public final class qt4 extends AtomicInteger implements Disposable, ObservableSource	// class@00240f from classes.dex
{
    public final Object a;
    public final gq6 b;
    public final ot4 c;
    public final boolean t;
    public boolean v;
    public Throwable w;
    public final AtomicBoolean x;
    public final AtomicReference y;
    public final AtomicInteger z;

    public void qt4(int p0,ot4 p1,Object p2,boolean p3){
       super();
       this.x = new AtomicBoolean();
       this.y = new AtomicReference();
       this.z = new AtomicInteger();
       this.b = new gq6(p0);
       this.c = p1;
       this.a = p2;
       this.t = p3;
    }
    public final void a(){
       int i2;
       int i3;
       qt4 ta;
       if (this.getAndIncrement()) {
          return;
       }
       qt4 tb = this.b;
       qt4 tt = this.t;
       Observer observer = this.y.get();
       int i = 1;
    label_0015 :
       if (observer != null) {
          while (true) {
             qt4 tv = this.v;
             Object obj = tb.poll();
             int i1 = 0;
             if (obj == null) {
                i2 = 1;
             label_0023 :
                qt4 tb1 = this.b;
                qt4 ty = this.y;
                if (this.x.get()) {
                   tb1.clear();
                   ty.lazySet(null);
                   if (!(i3 = this.z.get() & 0x02)) {
                      tv = this.c;
                      tv.getClass();
                      if ((ta = this.a) == null) {
                         ta = ot4.z;
                      }
                      tv.w.remove(ta);
                      if (!tv.decrementAndGet()) {
                         tv.x.dispose();
                      }
                   }
                }else if(tv != null){
                   if (tt != null) {
                      if (i2) {
                         tv = this.w;
                         ty.lazySet(null);
                         if (tv != null) {
                            observer.onError(tv);
                         }else {
                            observer.onComplete();
                         }
                      }else if(ta){
                         break ;
                      }else if(i2){
                         observer.onNext(obj);
                      }
                   }else if((tv = this.w) != null){
                      tb1.clear();
                      ty.lazySet(null);
                      observer.onError(tv);
                   }else if(i2){
                      ty.lazySet(null);
                      observer.onComplete();
                   }else {
                   }
                }else {
                }
                ta = 1;
             }else {
                i2 = 0;
                goto label_0023 ;
             }
          }
          return;
       }
       if (!(i = - i)) {
          return;
       }else if(observer == null){
          observer = this.y.get();
          goto label_0015 ;
       }else {
          goto label_0015 ;
       }
    }
    public void dispose(){
       qt4 ta;
       if (this.x.compareAndSet(false, true) && !this.getAndIncrement()) {
          this.y.lazySet(null);
          if (!((this.z.get() & 0x02))) {
             qt4 tc = this.c;
             tc.getClass();
             if ((ta = this.a) == null) {
                ta = ot4.z;
             }
             tc.w.remove(ta);
             if (!tc.decrementAndGet()) {
                tc.x.dispose();
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.x.get();
    }
    public void subscribe(Observer p0){
       int i1;
       while (true) {
          qt4 tz = this.z;
          int i = tz.get();
          if (i1 = i & 0x01) {
             p0.onSubscribe(jl1.a);
             p0.onError(new IllegalStateException("Only one Observer allowed!"));
             return;
          }else {
             i1 = i | 0x01;
             if (tz.compareAndSet(i, i1)) {
                p0.onSubscribe(this);
                tz = this.y;
                tz.lazySet(p0);
                if (this.x.get()) {
                   tz.lazySet(null);
                   break ;
                }else {
                   this.a();
                   break ;
                }
             }
          }
       }
       return;
    }
}
