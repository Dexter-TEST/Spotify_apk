package p.e62;
import p.a00;
import p.iv6;
import p.yf2;
import p.f62;
import java.lang.Object;
import p.gq6;
import java.util.concurrent.atomic.AtomicLong;
import p.rn;
import p.mv6;
import p.vv7;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.iw1;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.bn5;

public final class e62 extends a00	// class@001427 from classes.dex
{
    public boolean A;
    public final AtomicLong B;
    public boolean C;
    public final rn D;
    public final iv6 a;
    public final yf2 b;
    public final f62[] c;
    public final gq6 t;
    public final Object[] v;
    public final boolean w;
    public boolean x;
    public int y;
    public int z;

    public void e62(iv6 p0,yf2 p1,boolean p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       f62[] uof62Array = new f62[p3];
       for (int i = 0; i < p3; i++) {
          uof62Array[i] = new f62(this, i, p4);
       }
       this.c = uof62Array;
       Object[] objArray = new Object[p3];
       this.v = objArray;
       this.t = new gq6(p4);
       this.B = new AtomicLong();
       this.D = new rn();
       this.w = p2;
       return;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.B, p0);
          this.f();
       }
       return;
    }
    public final int b(int p0){
       int i = 0;
       if ((p0 & 0x04)) {
          return i;
       }
       if (p0 = p0 & 0x02) {
          i = true;
       }
       this.x = i;
       return p0;
    }
    public final void cancel(){
       this.A = true;
       this.d();
       this.f();
    }
    public final void clear(){
       this.t.clear();
    }
    public final void d(){
       e62 tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = tc[i];
          oobject.getClass();
          mv6.b(oobject);
       }
       return;
    }
    public final boolean e(boolean p0,boolean p1,iv6 p2,gq6 p3){
       Throwable throwable;
       if (this.A != null) {
          this.d();
          p3.clear();
          this.D.b();
          return true;
       }else if(p0){
          if (this.w != null) {
             if (p1) {
                this.d();
                this.D.e(p2);
                return true;
             }
          }else if((throwable = iw1.d(this.D)) != null && throwable != iw1.a){
             this.d();
             p3.clear();
             p2.onError(throwable);
             return true;
          }else if(p1){
             this.d();
             p2.onComplete();
             return true;
          }
       }
       return false;
    }
    public final void f(){
       e62 ta;
       e62 tt;
       Throwable throwable;
       boolean b;
       Object obj;
       if (this.getAndIncrement()) {
          return;
       }
       int i = 1;
       if (this.x != null) {
          ta = this.a;
          tt = this.t;
          do {
             if (this.A != null) {
                tt.clear();
                break ;
             }else if((throwable = this.D.get()) != null){
                tt.clear();
                ta.onError(throwable);
                break ;
             }else {
                e62 tC = this.C;
                if (!(b = tt.isEmpty())) {
                   ta.onNext(null);
                }
                if (tC != null && b) {
                   ta.onComplete();
                   break ;
                }
             }
          } while (!(i = - i));
       }else {
          ta = this.a;
          tt = this.t;
          int i1 = 1;
          do {
             long l = this.B.get();
             int i2 = 0;
             long l1 = i2;
             while (true) {
                if (v10 = l1 - l) {
                   e62 tC1 = this.C;
                   boolean b1 = ((obj = tt.poll()) == null)? true: false;
                   if (!this.e(tC1, b1, ta, tt)) {
                      if (b1) {
                      label_00a3 :
                         if (v10 || !this.e(this.C, tt.isEmpty(), ta, tt)) {
                            if ((l1 - i2) && (l - Long.MAX_VALUE)) {
                               long l2 = - l1;
                               this.B.addAndGet(l2);
                            }
                            if (i1 = - i1) {
                               continue ;
                            }
                         }
                      }else {
                         Object obj1 = this.b.apply(tt.poll());
                         Objects.requireNonNull(obj1, "The combiner returned a null value");
                         ta.onNext(obj1);
                         obj.a();
                         l1 = l1 + 1;
                      }
                   }
                }else {
                   goto label_00a3 ;
                }
             }
          } while (!(i1 = - i1));
       }
       return;
    }
    public final void g(int p0){
       _monitor_enter(this);
       e62 tv = this.v;
       if (tv[p0] != null) {
          if ((p0 = this.z + 1) == tv.length) {
             this.C = true;
          }else {
             this.z = p0;
             _monitor_exit(this);
             return;
          }
       }else {
          this.C = true;
       }
       _monitor_exit(this);
       this.f();
       return;
    }
    public final boolean isEmpty(){
       return this.t.isEmpty();
    }
    public final Object poll(){
       Object obj;
       e62 tt = this.t;
       if ((obj = tt.poll()) == null) {
          return null;
       }
       Object obj1 = this.b.apply(tt.poll());
       Objects.requireNonNull(obj1, "The combiner returned a null value");
       obj.a();
       return obj1;
    }
    public void subscribe(bn5[] p0,int p1){
       e62 tc = this.c;
       for (int i = 0; i < p1 && (this.C == null && this.A == null); i = i + 1) {
          p0[i].subscribe(tc[i]);
       }
       return;
    }
}
