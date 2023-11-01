package p.wb0;
import p.vb0;
import p.ex0;
import p.ic1;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.au0;
import p.xw0;
import p.e6;
import p.zf2;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.nj4;
import p.ul0;
import p.mb0;
import p.sl0;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import p.ux5;
import p.cd2;
import p.is7;
import p.bc0;
import p.bd1;
import p.lj4;
import p.gc1;
import p.zw0;
import java.lang.Runnable;
import p.nu1;
import p.p37;
import p.xe7;
import p.dx0;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import p.ve3;
import p.te0;
import p.re3;
import p.io2;
import p.xc3;
import p.w51;
import p.cc1;
import p.bx6;
import p.jc7;

public final class wb0 extends ic1 implements vb0, ex0	// class@002aff from classes.dex
{
    private int _decision;
    private Object _state;
    public final au0 t;
    public final xw0 v;
    public bd1 w;
    public static final AtomicIntegerFieldUpdater x;
    public static final AtomicReferenceFieldUpdater y;

    static {
       wb0.x = AtomicIntegerFieldUpdater.newUpdater(wb0.class, "_decision");
       wb0.y = AtomicReferenceFieldUpdater.newUpdater(wb0.class, Object.class, "_state");
    }
    public void wb0(int p0,au0 p1){
       super(p0);
       this.t = p1;
       this.v = p1.getContext();
       this._decision = 0;
       this._state = e6.a;
    }
    public static void t(Object p0,zf2 p1){
       throw new IllegalStateException("It\'s prohibited to register multiple handlers, tried to register "+p1+", already has "+p0.toString());
    }
    public static Object w(nj4 p0,Object p1,int p2,zf2 p3){
       sl0 p0 instanceof mb0;
       if (p1 instanceof ul0) {
       }else {
          int i = 1;
          if (p2 != i && p2 != 2) {
             i = 0;
          }
          if (i && (p3 != null || p0 instanceof mb0)) {
             if (p0 instanceof mb0) {
             }else {
                p0 = null;
             }
             p0 instanceof mb0 = new sl0(p1, p0, p3, null, 16);
             p1 = p0 instanceof mb0;
          }
       }
       return p1;
    }
    public final ex0 a(){
       wb0 tt = this.t;
       if (tt instanceof ex0) {
       }else {
          tt = null;
       }
       return tt;
    }
    public final void b(Object p0,CancellationException p1){
       while (true) {
          p0 = this._state;
          if (p0 instanceof nj4) {
             throw new IllegalStateException("Not completed".toString());
          }
          if (p0 instanceof ul0) {
             return;
          }
          int i = 0;
          if (p0 instanceof sl0) {
             wb0 owb0 = p0;
             int i1 = (owb0.e != null)? 1: 0;
             if (i1 = i1 ^ 1) {
                sl0 osl0 = sl0.a(owb0, null, p1, 15);
                AtomicReferenceFieldUpdater y = wb0.y;
                while (true) {
                   if (y.compareAndSet(this, p0, osl0)) {
                      i = 1;
                   }else {
                      if (y.get(this) == p0) {
                         continue ;
                      }
                   }
                   if (i) {
                      if ((p0 = owb0.b) != null) {
                         this.i(p0, p1);
                      }
                      if ((p0 = owb0.c) != null) {
                         this.k(p0, p1);
                         break ;
                      }
                      break ;
                   }
                }
                return;
             }else {
                throw new IllegalStateException("Must be called at most once".toString());
             }
          }else {
             AtomicReferenceFieldUpdater y1 = wb0.y;
             sl0 v9 = new sl0(p0, null, null, p1, 14);
             while (true) {
                if (y1.compareAndSet(this, p0, v9)) {
                   i = 1;
                }else {
                   if (y1.get(this) == p0) {
                      continue ;
                   }
                }
                if (i) {
                   return;
                }
             }
          }
       }
    }
    public final au0 c(){
       return this.t;
    }
    public final void d(Object p0){
       Throwable throwable;
       if ((throwable = ux5.a(p0)) == null) {
       }else {
          p0 = new ul0(throwable, false);
       }
       this.v(p0, this.c, null);
       return;
    }
    public final Throwable e(Object p0){
       if ((p0 = super.e(p0)) != null) {
       }else {
          p0 = null;
       }
       return p0;
    }
    public final Object f(Object p0){
       if (p0 instanceof sl0) {
          p0 = p0.a;
       }
       return p0;
    }
    public final xw0 getContext(){
       return this.v;
    }
    public final Object h(){
       return this._state;
    }
    public final void i(mb0 p0,Throwable p1){
       p0.a(p1);
       return;
    }
    public final void j(zf2 p0,Throwable p1){
       p0.invoke(p1);
       return;
    }
    public final void k(zf2 p0,Throwable p1){
       p0.invoke(p1);
       return;
    }
    public final void l(Throwable p0){
       while (true) {
          wb0 t_state = this._state;
          if (!t_state instanceof nj4) {
             return;
          }
          boolean b = t_state instanceof mb0;
          bc0 uobc0 = new bc0(this, p0, b);
          AtomicReferenceFieldUpdater y = wb0.y;
          while (true) {
             if (y.compareAndSet(this, t_state, uobc0)) {
                uobc0 = 1;
             }else {
                if (y.get(this) != t_state) {
                   uobc0 = 0;
                }
             }
             if (uobc0) {
                if (b) {
                }else {
                   t_state = null;
                }
                if (t_state != null) {
                   this.i(t_state, p0);
                }
                if (!this.s()) {
                   this.m();
                   break ;
                }
                break ;
             }
          }
          this.n(this.c);
          return;
       }
    }
    public final void m(){
       wb0 tw;
       if ((tw = this.w) == null) {
          return;
       }
       tw.dispose();
       this.w = lj4.a;
       return;
    }
    public final void n(int p0){
       ic1 tc;
       xw0 context;
       while (true) {
          wb0 t_decision = this._decision;
          int i = 2;
          int i1 = 0;
          if (t_decision != null) {
             if (t_decision == 1) {
                t_decision = 0;
             }else {
                throw new IllegalStateException("Already resumed".toString());
             }
          }else {
             if (wb0.x.compareAndSet(this, i1, i)) {
                context = 1;
             }
          }
          if (t_decision) {
             return;
          }else {
             t_decision = this.t;
             boolean b = (p0 == 4)? true: false;
             if (!b && t_decision instanceof gc1) {
                nu1 onu1 = (p0 != 1 && p0 != i)? 0: 1;
                i = ((tc = this.c) != 1 && tc != i)? 0: 1;
                if (p0 == i) {
                   gc1 t = t_decision.t;
                   context = t_decision.getContext();
                   if (t.h0()) {
                      t.g0(context, this);
                      break ;
                   }else {
                      onu1 = p37.a();
                      if ((onu1.c - 0x100000000) >= 0) {
                         i1 = 1;
                      }
                      if (i1) {
                         onu1.k0(this);
                         break ;
                      }else {
                         onu1.m0(1);
                         xe7.X(this, this.t, 1);
                         do {
                         } while (!onu1.n0());
                         onu1.j0();
                      }
                   }
                }else {
                label_008b :
                   xe7.X(this, t_decision, b);
                   break ;
                }
             }else {
                goto label_008b ;
             }
             break ;
          }
       }
       return;
    }
    public final Object o(){
       wb0 tt;
       Throwable throwable;
       ic1 tc;
       me3 ome3;
       CancellationException uCancellatio;
       boolean b = this.s();
       while (true) {
          wb0 t_decision = this._decision;
          int i = 2;
          int i1 = 0;
          if (t_decision != null) {
             if (t_decision == i) {
                t_decision = 0;
             }else {
                throw new IllegalStateException("Already suspended".toString());
             }
          }else {
             if (wb0.x.compareAndSet(this, i1, 1)) {
                uCancellatio = 1;
             }
          }
          gc1 ogc1 = null;
          if (t_decision) {
             if (this.w == null) {
                this.q();
             }
             if (b) {
                tt = this.t;
                if (tt instanceof gc1) {
                   ogc1 = tt;
                }
                if (ogc1 != null && (throwable = ogc1.m(this)) != null) {
                   this.m();
                   this.l(throwable);
                   break ;
                }
             }
             break ;
          }else if(b){
             tt = this.t;
             if (tt instanceof gc1) {
                ogc1 = tt;
             }
             if (ogc1 != null && (throwable = ogc1.m(this)) != null) {
                this.m();
                this.l(throwable);
             }
          }
          tt = this._state;
          if (!tt instanceof ul0) {
             if ((tc = this.c) == 1 || tc == i) {
                i1 = 1;
             }
             if (i1 && ((ome3 = this.v.f(gg1.y)) != null && !ome3.b())) {
                uCancellatio = ome3.o();
                this.b(tt, uCancellatio);
                throw uCancellatio;
             }else {
                return this.f(tt);
             }
          }else {
             throw tt.a;
          }
       }
       return dx0.a;
    }
    public final void p(){
       bd1 uobd1;
       if ((uobd1 = this.q()) == null) {
          return;
       }
       if ((this._state instanceof nj4 ^ 0x01)) {
          uobd1.dispose();
          this.w = lj4.a;
       }
       return;
    }
    public final bd1 q(){
       me3 ome3;
       if ((ome3 = this.v.f(gg1.y)) == null) {
          return null;
       }
       bd1 uobd1 = io2.n(ome3, true, new te0(this), 2);
       this.w = uobd1;
       return uobd1;
    }
    public final void r(zf2 p0){
       AtomicReferenceFieldUpdater y;
       sl0 e;
       sl0 osl0;
       xc3 oxc3 = (p0 instanceof mb0)? p0: new xc3(p0);
       while (true) {
          wb0 t_state = this._state;
          int i = 0;
          if (t_state instanceof e6) {
             y = wb0.y;
             while (true) {
                if (y.compareAndSet(this, t_state, oxc3)) {
                   i = 1;
                }else {
                   if (y.get(this) == t_state) {
                      continue ;
                   }
                }
                if (i) {
                   return;
                }
                continue ;
             }
          }else {
             Throwable throwable = null;
             if (!t_state instanceof mb0) {
                if (v1 = t_state instanceof ul0) {
                   wb0 owb0 = t_state;
                   owb0.getClass();
                   if (ul0.b.compareAndSet(owb0, i, 1)) {
                      if (t_state instanceof bc0) {
                         if (!v1) {
                            owb0 = throwable;
                         }
                         if (owb0 != null) {
                            throwable = owb0.a;
                         }
                         this.j(p0, throwable);
                         break ;
                      }
                      break ;
                   }else {
                      wb0.t(t_state, p0);
                      throw throwable;
                   }
                }else if(t_state instanceof sl0){
                   wb0 owb01 = t_state;
                   if (owb01.b == null) {
                      int i1 = ((e = owb01.e) != null)? 1: 0;
                      if (i1) {
                         this.j(p0, e);
                         return;
                      }else {
                         osl0 = sl0.a(owb01, oxc3, throwable, 29);
                         AtomicReferenceFieldUpdater y1 = wb0.y;
                         while (true) {
                            if (y1.compareAndSet(this, t_state, osl0)) {
                               i = 1;
                            }else {
                               if (y1.get(this) == t_state) {
                                  continue ;
                               }
                            }
                            if (i) {
                               return;
                            }else {
                               continue ;
                            }
                         }
                         return;
                      }
                   }else {
                      wb0.t(t_state, p0);
                      throw throwable;
                   }
                }else {
                   osl0 = new sl0(t_state, oxc3, null, null, 28);
                   y = wb0.y;
                   while (true) {
                      if (y.compareAndSet(this, t_state, v10)) {
                         i = 1;
                      }else {
                         if (y.get(this) == t_state) {
                            continue ;
                         }
                      }
                      if (i) {
                         return;
                      }else {
                         continue ;
                      }
                   }
                }
             }else {
                wb0.t(t_state, p0);
                throw throwable;
             }
          }
       }
    }
    public final boolean s(){
       boolean b = true;
       int i = (this.c == 2)? 1: 0;
       if (!i || !this.t.j()) {
          b = false;
       }
       return b;
    }
    public final String toString(){
       String str1;
       StringBuilder str = "CancellableContinuation\("+w51.U(this.t)+"\){";
       wb0 t_state = this._state;
       if (t_state instanceof nj4) {
          str1 = "Active";
       }else if(t_state instanceof bc0){
          str1 = "Cancelled";
       }else {
          str1 = "Completed";
       }
       return str+str1+"}@"+w51.x(this);
    }
    public final boolean u(){
       wb0 t_state = this._state;
       if (t_state instanceof sl0 && t_state.d != null) {
          this.m();
          return false;
       }else {
          this._decision = 0;
          this._state = e6.a;
          return true;
       }
    }
    public final void v(Object p0,int p1,zf2 p2){
       while (true) {
          wb0 t_state = this._state;
          int i = 1;
          if (t_state instanceof nj4) {
             Object obj = wb0.w(t_state, p0, p1, p2);
             AtomicReferenceFieldUpdater y = wb0.y;
             while (true) {
                if (!y.compareAndSet(this, t_state, obj)) {
                   if (y.get(this) != t_state) {
                      i = 0;
                   }
                }
                if (i) {
                   if (!this.s()) {
                      this.m();
                      break ;
                   }
                   break ;
                }else {
                   continue ;
                }
             }
             this.n(p1);
             return;
          }else if(t_state instanceof bc0){
             t_state.getClass();
             if (bc0.c.compareAndSet(t_state, 0, i)) {
                if (p2 != null) {
                   this.k(p2, t_state.a);
                }
                return;
             }
          }
          throw new IllegalStateException("Already resumed, but proposed with update "+p0.toString());
       }
    }
    public final bx6 x(cc1 p0){
       bx6 w;
       jc7 a = jc7.a;
       while (true) {
          wb0 t_state = this._state;
          w = is7.w;
          if (t_state instanceof nj4) {
             Object obj = wb0.w(t_state, a, this.c, p0);
             AtomicReferenceFieldUpdater y = wb0.y;
             while (true) {
                if (y.compareAndSet(this, t_state, obj)) {
                   t_state = 1;
                }else {
                   if (y.get(this) != t_state) {
                      t_state = 0;
                   }
                }
                if (t_state) {
                   if (!this.s()) {
                      this.m();
                      break ;
                   }
                }else {
                   continue ;
                }
             }
          }else {
             w = null;
             break ;
          }
          break ;
       }
       return w;
    }
}
