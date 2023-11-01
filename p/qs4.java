package p.qs4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.ps4;
import p.yf2;
import p.rn;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import p.cd1;
import p.xh6;
import p.yh6;
import java.lang.Math;
import p.co5;
import java.lang.System;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import p.gq6;
import p.fq6;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;

public final class qs4 extends AtomicInteger implements Disposable, Observer	// class@002406 from classes.dex
{
    public final AtomicReference A;
    public Disposable B;
    public long C;
    public int D;
    public final ArrayDeque E;
    public int F;
    public final Observer a;
    public final yf2 b;
    public final boolean c;
    public final int t;
    public final int v;
    public xh6 w;
    public boolean x;
    public final rn y;
    public boolean z;
    public static final ps4[] G;
    public static final ps4[] H;

    static {
       ps4[] ops4Array = new ps4[0];
       qs4.G = ops4Array;
       ps4[] ops4Array1 = new ps4[0];
       qs4.H = ops4Array1;
    }
    public void qs4(int p0,int p1,Observer p2,yf2 p3,boolean p4){
       super();
       this.y = new rn();
       this.a = p2;
       this.b = p3;
       this.c = p4;
       this.t = p0;
       this.v = p1;
       if (p0 != Integer.MAX_VALUE) {
          this.E = new ArrayDeque(p0);
       }
       this.A = new AtomicReference(qs4.G);
       return;
    }
    public final boolean a(){
       if (this.z != null) {
          return true;
       }
       Throwable throwable = this.y.get();
       if (this.c != null || throwable == null) {
          return false;
       }
       this.b();
       this.y.d(this.a);
       return true;
    }
    public final boolean b(){
       this.B.dispose();
       ps4[] h = qs4.H;
       ps4[] andSet = this.A.getAndSet(h);
       int i = 0;
       if (andSet == h) {
          return i;
       }
       int len = andSet.length;
       for (; i < len; i = i + 1) {
          object oobject = andSet[i];
          oobject.getClass();
          cd1.a(oobject);
       }
       return true;
    }
    public final void c(){
       if (!this.getAndIncrement()) {
          this.d();
       }
       return;
    }
    public final void d(){
       qs4 obj;
       int i2;
       ps4 c;
       ps4 obj1;
       qs4 ta = this.a;
       int i = 1;
       while (true) {
          if (this.a()) {
             return;
          }
          qs4 tw = this.w;
          int i1 = 0;
          if (tw != null) {
             while (true) {
                if (this.a()) {
                   return;
                }
                if ((obj = tw.poll()) != null) {
                   ta.onNext(obj);
                   i1 = i1 + 1;
                }
             }
             return;
          }
          tw = Integer.MAX_VALUE;
          if (i1) {
             if (this.t != tw) {
                this.g(i1);
             }else {
                continue ;
             }
          }else {
             obj = this.x;
             qs4 tw1 = this.w;
             ps4[] ops4Array = this.A.get();
             int len = ops4Array.length;
             if (this.t != tw) {
                _monitor_enter(this);
                i2 = this.E.size();
                _monitor_exit(this);
             }else {
                i2 = 0;
             }
             if (obj != null && (tw1 == null && (!tw1.isEmpty() || (len || i2)))) {
                this.y.d(this.a);
                return;
             }else if(len){
                int i3 = len - 1;
                i3 = Math.min(i3, this.D);
                int i4 = 0;
                while (true) {
                   if (i4 < len) {
                      if (this.a()) {
                         return;
                      }else {
                         object oobject = ops4Array[i3];
                         if ((c = oobject.c) != null) {
                            while (true) {
                               if ((obj1 = c.poll()) != null) {
                                  ta.onNext(obj1);
                                  if (this.a()) {
                                     return;
                                  }
                                  continue ;
                               }
                            }
                         }
                         obj1 = oobject.c;
                         if (oobject.b != null && (obj1 == null && !obj1.isEmpty())) {
                            this.e(oobject);
                            i1 = i1 + 1;
                         }
                         if ((i3 = i3 + 1) == len) {
                            i3 = 0;
                         }
                         i4 = i4 + 1;
                      }
                   }else {
                      this.D = i3;
                   }
                }
             }
             if (i1) {
                if (this.t != tw) {
                   this.g(i1);
                   continue ;
                }else {
                   continue ;
                }
             }else if(!(i = - i)){
             }else {
                continue ;
             }
          }
       }
    }
    public void dispose(){
       this.z = true;
       if (this.b()) {
          this.y.b();
       }
       return;
    }
    public final void e(ps4 p0){
       ps4[] g;
       do {
          qs4 tA = this.A;
          ps4[] ops4Array = tA.get();
          int len = ops4Array.length;
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                if (ops4Array[i1] == p0) {
                label_0016 :
                   if (i1 < 0) {
                      break ;
                   }else {
                      int i2 = 1;
                      if (len == i2) {
                         g = qs4.G;
                      }else {
                         int i3 = len - 1;
                         ps4[] ops4Array1 = new ps4[i3];
                         System.arraycopy(ops4Array, i, ops4Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(ops4Array, i4, ops4Array1, i1, len);
                         g = ops4Array1;
                      }
                      while (true) {
                         if (tA.compareAndSet(ops4Array, g)) {
                            i = 1;
                         }else {
                            if (tA.get() == ops4Array) {
                               continue ;
                            }
                         }
                         if (i) {
                            return;
                         }
                         continue ;
                      }
                      return;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = -1;
                goto label_0016 ;
             }
          }
       } while (i);
    }
    public final void f(ObservableSource p0){
       int i2;
       qs4 tw;
       ps4[] ops4Array;
       while (true) {
          int i = 0;
          if (p0 instanceof zv6) {
             int i1 = Integer.MAX_VALUE;
             if ((p0 = p0.get()) != null) {
                if (!this.get() && this.compareAndSet(i, 1)) {
                   this.a.onNext(p0);
                   if (this.decrementAndGet()) {
                   label_004e :
                      this.d();
                   }
                }else if((tw = this.w) == null){
                   tw = (this.t == i1)? new gq6(this.v): new fq6(this.t);
                   this.w = tw;
                }
                tw.offer(p0);
                if (this.getAndIncrement()) {
                   i2 = 0;
                label_005f :
                   if (i2 && this.t != i1) {
                      _monitor_enter(this);
                      if ((i2 = this.E.poll()) == null) {
                         i1 = this.F - 1;
                         this.F = i1;
                         i = 1;
                      }
                      _monitor_exit(this);
                      if (i) {
                         this.c();
                         break ;
                      }
                   }
                }else {
                   goto label_004e ;
                }
             }
             i2 = 1;
             goto label_005f ;
          }else {
             this.C = this.C + 1;
             ps4 ops4 = new ps4(this);
             while (true) {
                tw = this.A;
                if ((ops4Array = tw.get()) == qs4.H) {
                   cd1.a(ops4);
                }else {
                   int len = ops4Array.length;
                   int i3 = len + 1;
                   ps4[] ops4Array1 = new ps4[i3];
                   System.arraycopy(ops4Array, i, ops4Array1, i, len);
                   ops4Array1[len] = ops4;
                   while (true) {
                      if (tw.compareAndSet(ops4Array, ops4Array1)) {
                         tw = 1;
                      }else {
                         if (tw.get() != ops4Array) {
                            tw = 0;
                         }
                      }
                      if (tw) {
                         i = 1;
                      }else {
                         continue ;
                      }
                   }
                }
             }
             if (i) {
                p0.subscribe(ops4);
             }
          }
          break ;
       }
       return;
    }
    public final void g(int p0){
       ObservableSource observableSo;
       while (true) {
          int i = p0 - 1;
          if (p0) {
             _monitor_enter(this);
             if ((observableSo = this.E.poll()) == null) {
                observableSo = this.F - 1;
                this.F = observableSo;
                _monitor_exit(this);
             }else {
                _monitor_exit(this);
                this.f(observableSo);
             }
             observableSo = i;
          }else {
             break ;
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.z;
    }
    public final void onComplete(){
       if (this.x != null) {
          return;
       }
       this.x = true;
       this.c();
       return;
    }
    public final void onError(Throwable p0){
       if (this.x != null) {
          RxJavaPlugins.c(p0);
          return;
       }else if(this.y.a(p0)){
          this.x = true;
          this.c();
       }
       return;
    }
    public final void onNext(Object p0){
       qs4 tF;
       if (this.x != null) {
          return;
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null ObservableSource");
       if (this.t != Integer.MAX_VALUE) {
          _monitor_enter(this);
          if ((tF = this.F) == this.t) {
             this.E.offer(p0);
             _monitor_exit(this);
             return;
          }else {
             this.F = tF + 1;
             _monitor_exit(this);
          }
       }
       this.f(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.B, p0)) {
          this.B = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
