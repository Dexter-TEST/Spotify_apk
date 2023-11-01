package p.ku4;
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
import java.util.Map;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Collection;
import java.util.Iterator;
import p.co5;

public final class ku4 extends AtomicInteger implements Disposable, tt4	// class@001c86 from classes.dex
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
       ku4.E = Integer.valueOf(1);
       ku4.F = Integer.valueOf(2);
       ku4.G = Integer.valueOf(3);
       ku4.H = Integer.valueOf(4);
    }
    public void ku4(Observer p0,yf2 p1,yf2 p2,w00 p3){
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
       ku4 tb = this.b;
       Integer g = (p0)? ku4.G: ku4.H;
       tb.a(g, p1);
       _monitor_exit(this);
       this.f();
       return;
    }
    public void dispose(){
       if (this.D == null) {
          this.D = true;
          this.c.dispose();
          if (!this.getAndIncrement()) {
             this.b.clear();
          }
       }
       return;
    }
    public final void e(Object p0,boolean p1){
       _monitor_enter(this);
       ku4 tb = this.b;
       Integer e = (p1)? ku4.E: ku4.F;
       tb.a(e, p0);
       _monitor_exit(this);
       this.f();
       return;
    }
    public final void f(){
       Integer integer;
       ku4 obj1;
       Iterator iterator;
       if (this.getAndIncrement()) {
          return;
       }
       ku4 tb = this.b;
       ku4 ta = this.a;
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
             boolean b = false;
             int i1 = (!this.A.get())? 1: 0;
             int i2 = ((integer = tb.poll()) == null)? 1: 0;
             if (i1 && i2) {
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
                Object obj = tb.poll();
                if (integer == ku4.E) {
                   ku4 tB = this.B;
                   int i3 = tB + 1;
                   this.B = i3;
                   this.t.put(Integer.valueOf(tB), obj);
                   obj1 = this.x.apply(obj);
                   Objects.requireNonNull(obj1, "The leftEnd returned a null ObservableSource");
                   ut4 out4 = new ut4(this, true, tB);
                   this.c.c(out4);
                   obj1.subscribe(out4);
                   if (this.w.get() != null) {
                      tb.clear();
                      this.c.dispose();
                      this.g(ta);
                      return;
                   }else {
                      iterator = this.v.values().iterator();
                      while (iterator.hasNext()) {
                         obj1 = this.z.apply(obj, iterator.next());
                         Objects.requireNonNull(obj1, "The resultSelector returned a null value");
                         ta.onNext(obj1);
                      }
                   }
                }else if(integer == ku4.F){
                   obj1 = this.C;
                   i2 = obj1 + 1;
                   this.C = i2;
                   this.v.put(Integer.valueOf(obj1), obj);
                   Object obj2 = this.y.apply(obj);
                   Objects.requireNonNull(obj2, "The rightEnd returned a null ObservableSource");
                   ut4 out41 = new ut4(this, b, obj1);
                   this.c.c(out41);
                   obj2.subscribe(out41);
                   if (this.w.get() != null) {
                      break ;
                   }else {
                      iterator = this.t.values().iterator();
                      while (iterator.hasNext()) {
                         Object obj3 = this.z.apply(iterator.next(), obj);
                         Objects.requireNonNull(obj3, "The resultSelector returned a null value");
                         ta.onNext(obj3);
                      }
                   }
                }else if(integer == ku4.G){
                   this.t.remove(Integer.valueOf(obj.c));
                   this.c.a(obj);
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
       this.t.clear();
       this.v.clear();
       p0.onError(iw1.d(this.w));
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
