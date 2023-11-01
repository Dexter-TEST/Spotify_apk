package p.uq4;
import p.vn0;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.ro1;
import p.tq4;
import java.util.concurrent.atomic.AtomicInteger;
import p.s62;
import java.lang.Object;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.yh6;
import p.rn;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;

public final class uq4 extends vn0	// class@0028ff from classes.dex
{
    public final yf2 A;
    public Object B;
    public int C;
    public final AtomicReference D;
    public final int y;
    public final Observer z;

    public void uq4(int p0,int p1,Observer p2,yf2 p3,ro1 p4){
       this.y = p1;
       if (p1 != 1) {
          super(p0, p4);
          this.z = p2;
          this.A = p3;
          this.D = new tq4(this, 0);
          return;
       }else {
          super(p0, p4);
          this.z = p2;
          this.A = p3;
          this.D = new s62(1, this);
          return;
       }
    }
    public final void a(){
       switch (this.y){
           case 0:
           default:
             this.B = null;
             return;
       }
       this.B = null;
       return;
    }
    public final void b(){
       uq4 tD = this.D;
       switch (this.y){
           case 0:
           default:
             switch (tD.a){
                 case 0:
                   cd1.a(tD);
                   break;
                 default:
                   cd1.a(tD);
             }
             return;
       }
       tD.getClass();
       cd1.a(tD);
       return;
    }
    public final void c(){
       uq4 tz;
       vn0 tc;
       vn0 tt;
       vn0 ta;
       int i;
       uq4 tC;
       vn0 tw;
       Object obj;
       int i1;
       Object obj1;
       ro1 b = ro1.b;
       ro1 a = ro1.a;
       switch (this.y){
           case 0:
             if (!this.getAndIncrement()) {
                tz = this.z;
                tc = this.c;
                tt = this.t;
                ta = this.a;
                i = 1;
                do {
                   if (this.x != null) {
                      tt.clear();
                      this.B = 0;
                   }else {
                      tC = this.C;
                      if (ta.get() != null && (tc == a && (tc != b && tC == null))) {
                         tt.clear();
                         this.B = null;
                         ta.d(tz);
                         break ;
                      }else if(tC == null){
                         tw = this.w;
                         i1 = ((obj = tt.poll()) == null)? 1: 0;
                         if (tw != null && i1) {
                            ta.d(tz);
                            break ;
                         }else if(i1){
                            obj1 = this.A.apply(obj);
                            Objects.requireNonNull(obj1, "The mapper returned a null MaybeSource");
                            this.C = 1;
                            obj1.subscribe(this.D);
                         }
                      }else if(tC == 2){
                         tC = this.B;
                         this.B = 0;
                         tz.onNext(tC);
                         this.C = 0;
                      }
                   }
                } while (!(i = - i));
             }
             return;
             break;
           default:
             if (!this.getAndIncrement()) {
                tz = this.z;
                tc = this.c;
                tt = this.t;
                ta = this.a;
                i = 1;
                do {
                   if (this.x != null) {
                      tt.clear();
                      this.B = 0;
                   }else {
                      tC = this.C;
                      if (ta.get() != null && (tc == a && (tc != b && tC == null))) {
                         tt.clear();
                         this.B = null;
                         ta.d(tz);
                         break ;
                      }else if(tC == null){
                         tw = this.w;
                         i1 = ((obj = tt.poll()) == null)? 1: 0;
                         if (tw != null && i1) {
                            ta.d(tz);
                            break ;
                         }else if(i1){
                            obj1 = this.A.apply(obj);
                            Objects.requireNonNull(obj1, "The mapper returned a null SingleSource");
                            this.C = 1;
                            obj1.subscribe(this.D);
                         }
                      }else if(tC == 2){
                         tC = this.B;
                         this.B = 0;
                         tz.onNext(tC);
                         this.C = 0;
                      }
                   }
                } while (!(i = - i));
             }
             return;
       }
    }
    public final void d(){
       uq4 tz = this.z;
       switch (this.y){
           case 0:
           default:
             tz.onSubscribe(this);
             return;
       }
       tz.onSubscribe(this);
       return;
    }
    public final void e(Throwable p0){
       ro1 c = ro1.c;
       switch (this.y){
           case 0:
             if (this.a.a(p0)) {
                if (this.c != c) {
                   this.v.dispose();
                }
                this.C = 0;
                this.c();
             }
             break;
           default:
             if (this.a.a(p0)) {
                if (this.c != c) {
                   this.v.dispose();
                }
                this.C = 0;
                this.c();
             }
             return;
       }
       return;
    }
    public final void f(Object p0){
       switch (this.y){
           case 0:
           default:
             this.B = p0;
             this.C = 2;
             this.c();
             return;
       }
       this.B = p0;
       this.C = 2;
       this.c();
       return;
    }
}
