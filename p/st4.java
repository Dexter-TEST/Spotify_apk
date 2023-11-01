package p.st4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.tt4;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.w00;
import p.fn0;
import p.gq6;
import io.reactivex.rxjava3.core.Observable;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.vt4;
import p.ut4;
import java.io.Serializable;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;
import p.ec7;
import java.lang.Runnable;
import java.util.Map;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;

public final class st4 extends AtomicInteger implements Disposable, tt4	// class@002697 from classes.dex
{
    public final AtomicInteger A;
    public int B;
    public int C;
    public boolean D;
    public final Observer a;
    public final gq6 b;
    public final fn0 c;
    public final LinkedHashMap t;
    public final LinkedHashMap v;
    public final AtomicReference w;
    public final yf2 x;
    public final yf2 y;
    public final w00 z;
    public static final Integer E;
    public static final Integer F;
    public static final Integer G;
    public static final Integer H;

    static {
       st4.E = Integer.valueOf(1);
       st4.F = Integer.valueOf(2);
       st4.G = Integer.valueOf(3);
       st4.H = Integer.valueOf(4);
    }
    public void st4(Observer p0,yf2 p1,yf2 p2,w00 p3){
       super();
       this.a = p0;
       this.c = new fn0();
       this.b = new gq6(Observable.bufferSize());
       this.t = new LinkedHashMap();
       this.v = new LinkedHashMap();
       this.w = new AtomicReference();
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = new AtomicInteger(2);
    }
    public final void a(Throwable p0){
       if (iw1.a(this.w, p0)) {
          this.f();
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void b(Throwable p0){
       if (iw1.a(this.w, p0)) {
          this.A.decrementAndGet();
          this.f();
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void c(vt4 p0){
       this.c.b(p0);
       this.A.decrementAndGet();
       this.f();
    }
    public final void d(boolean p0,ut4 p1){
       _monitor_enter(this);
       st4 tb = this.b;
       Integer g = (p0)? st4.G: st4.H;
       tb.a(g, p1);
       _monitor_exit(this);
       this.f();
       return;
    }
    public void dispose(){
       if (this.D != null) {
          return;
       }
       this.D = true;
       this.c.dispose();
       if (!this.getAndIncrement()) {
          this.b.clear();
       }
       return;
    }
    public final void e(Object p0,boolean p1){
       _monitor_enter(this);
       st4 tb = this.b;
       Integer e = (p1)? st4.E: st4.F;
       tb.a(e, p0);
       _monitor_exit(this);
       this.f();
       return;
    }
    public final void f(){
       Integer integer;
       ec7 uoec7;
       st4 tB;
       Object obj1;
       ut4 out4;
       if (this.getAndIncrement()) {
          return;
       }
       st4 tb = this.b;
       st4 ta = this.a;
       boolean b = true;
       int i = 1;
       while (true) {
          if (this.D != null) {
             tb.clear();
             return;
          }else if(this.w.get() != null){
             tb.clear();
             this.c.dispose();
             this.g(ta);
             return;
          }else {
             boolean b1 = false;
             int i1 = (!this.A.get())? 1: 0;
             int i2 = ((integer = tb.poll()) == null)? 1: 0;
             if (i1 && i2) {
                Iterator iterator = this.t.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().onComplete();
                }
                this.t.clear();
                this.v.clear();
                this.c.dispose();
                ta.onComplete();
                return;
             }else if(i2){
                if (!(i = - i)) {
                   return;
                }
             }else {
                Iterator obj = tb.poll();
                if (integer == st4.E) {
                   uoec7 = new ec7(Observable.bufferSize(), null);
                   tB = this.B;
                   i2 = tB + 1;
                   this.B = i2;
                   this.t.put(Integer.valueOf(tB), uoec7);
                   obj1 = this.x.apply(obj);
                   Objects.requireNonNull(obj1, "The leftEnd returned a null ObservableSource");
                   out4 = new ut4(this, b, tB);
                   this.c.c(out4);
                   obj1.subscribe(out4);
                   if (this.w.get() != null) {
                      tb.clear();
                      this.c.dispose();
                      this.g(ta);
                      return;
                   }else {
                      obj = this.z.apply(obj, uoec7);
                      Objects.requireNonNull(obj, "The resultSelector returned a null value");
                      ta.onNext(obj);
                      obj = this.v.values().iterator();
                      while (obj.hasNext()) {
                         uoec7.onNext(obj.next());
                      }
                   }
                }else if(integer == st4.F){
                   tB = this.C;
                   i2 = tB + 1;
                   this.C = i2;
                   this.v.put(Integer.valueOf(tB), obj);
                   obj1 = this.y.apply(obj);
                   Objects.requireNonNull(obj1, "The rightEnd returned a null ObservableSource");
                   out4 = new ut4(this, b1, tB);
                   this.c.c(out4);
                   obj1.subscribe(out4);
                   if (this.w.get() != null) {
                      break ;
                   }else {
                      Iterator iterator1 = this.t.values().iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().onNext(obj);
                      }
                   }
                }else if(integer == st4.G){
                   uoec7 = this.t.remove(Integer.valueOf(obj.c));
                   this.c.a(obj);
                   if (uoec7 != null) {
                      uoec7.onComplete();
                   }
                }else {
                   this.v.remove(Integer.valueOf(obj.c));
                   this.c.a(obj);
                }
             }
          }
       }
       tb.clear();
       this.c.dispose();
       this.g(ta);
       return;
    }
    public final void g(Observer p0){
       Throwable throwable = iw1.d(this.w);
       st4 tt = this.t;
       Iterator iterator = tt.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(throwable);
       }
       tt.clear();
       this.v.clear();
       p0.onError(throwable);
       return;
    }
    public final void h(Throwable p0,Observer p1,gq6 p2){
       co5.M(p0);
       iw1.a(this.w, p0);
       p2.clear();
       this.c.dispose();
       this.g(p1);
    }
    public boolean isDisposed(){
       return this.D;
    }
}
