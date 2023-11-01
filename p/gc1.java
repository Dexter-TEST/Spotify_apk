package p.gc1;
import p.ex0;
import p.au0;
import p.ic1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.zw0;
import p.du0;
import p.w51;
import p.xw0;
import java.util.concurrent.CancellationException;
import p.vl0;
import p.zf2;
import java.lang.Throwable;
import p.ux5;
import p.ul0;
import java.lang.Runnable;
import p.nu1;
import p.p37;
import p.wb0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.co5;
import p.vb0;
import java.lang.IllegalArgumentException;

public final class gc1 extends ic1 implements ex0, au0	// class@0016de from classes.dex
{
    private Object _reusableCancellableContinuation;
    public final zw0 t;
    public final au0 v;
    public Object w;
    public final Object x;
    public static final AtomicReferenceFieldUpdater y;

    static {
       gc1.y = AtomicReferenceFieldUpdater.newUpdater(gc1.class, Object.class, "_reusableCancellableContinuation");
    }
    public void gc1(zw0 p0,du0 p1){
       super(-1);
       this.t = p0;
       this.v = p1;
       this.w = w51.c;
       this.x = w51.T(this.getContext());
       this._reusableCancellableContinuation = null;
    }
    public final ex0 a(){
       gc1 tv = this.v;
       if (tv instanceof ex0) {
       }else {
          tv = null;
       }
       return tv;
    }
    public final void b(Object p0,CancellationException p1){
       if (p0 instanceof vl0) {
          p0.b.invoke(p1);
       }
       return;
    }
    public final au0 c(){
       return this;
    }
    public final void d(Object p0){
       gc1 tv = this.v;
       xw0 context = tv.getContext();
       Throwable throwable = ux5.a(p0);
       int i = 0;
       ul0 oul0 = (throwable == null)? p0: new ul0(throwable, i);
       gc1 tt = this.t;
       if (tt.h0()) {
          this.w = oul0;
          this.c = i;
          tt.g0(context, this);
       }else {
          nu1 onu1 = p37.a();
          boolean b = true;
          int i1 = ((onu1.c - 0x100000000) >= 0)? 1: 0;
          if (i1) {
             this.w = oul0;
             this.c = i;
             onu1.k0(this);
          }else {
             onu1.m0(b);
             xw0 context1 = this.getContext();
             tv.d(p0);
             w51.N(context1, w51.W(context1, this.x));
             do {
             } while (!onu1.n0());
             onu1.j0();
          }
       }
       return;
    }
    public final xw0 getContext(){
       return this.v.getContext();
    }
    public final Object h(){
       gc1 tw = this.w;
       this.w = w51.c;
       return tw;
    }
    public final wb0 i(){
       gc1 t_reusableCa;
       while (true) {
          t_reusableCa = this._reusableCancellableContinuation;
          bx6 t = w51.t;
          if (t_reusableCa == null) {
          }else if(t_reusableCa instanceof wb0){
             AtomicReferenceFieldUpdater y = gc1.y;
             while (true) {
                if (y.compareAndSet(this, t_reusableCa, t)) {
                   t = 1;
                }else {
                   if (y.get(this) != t_reusableCa) {
                      t = 0;
                   }else {
                      continue ;
                   }
                }
                if (t) {
                   return t_reusableCa;
                }
             }
             this._reusableCancellableContinuation = t;
             return null;
          }else if(t_reusableCa != t && !t_reusableCa instanceof Throwable){
             break ;
          }
       }
       throw new IllegalStateException("Inconsistent state "+t_reusableCa.toString());
    }
    public final boolean j(){
       boolean b = (this._reusableCancellableContinuation != null)? true: false;
       return b;
    }
    public final boolean k(CancellationException p0){
       do {
          gc1 t_reusableCa = this._reusableCancellableContinuation;
          bx6 t = w51.t;
          boolean b = true;
          boolean b1 = false;
          if (co5.c(t_reusableCa, t)) {
             AtomicReferenceFieldUpdater y = gc1.y;
             while (true) {
                if (y.compareAndSet(this, t, p0)) {
                   b1 = 1;
                }else {
                   if (y.get(this) == t) {
                      continue ;
                   }
                }
                if (b1) {
                   break ;
                }else {
                   continue ;
                }
             }
             return b;
          }else if(t_reusableCa instanceof Throwable){
             return b;
          }else {
             AtomicReferenceFieldUpdater y1 = gc1.y;
          label_0026 :
             if (!y1.compareAndSet(this, t_reusableCa, null)) {
                if (y1.get(this) != t_reusableCa) {
                   b = false;
                }else {
                   goto label_0026 ;
                }
             }
             if (b) {
                return b1;
             }else {
                continue ;
             }
          }
       } while (b1);
    }
    public final void l(){
       gc1 t_reusableCa = this._reusableCancellableContinuation;
       if (t_reusableCa instanceof wb0) {
       }else {
          t_reusableCa = null;
       }
       if (t_reusableCa != null) {
          t_reusableCa.m();
       }
       return;
    }
    public final Throwable m(vb0 p0){
       do {
          gc1 t_reusableCa = this._reusableCancellableContinuation;
          bx6 t = w51.t;
          Throwable throwable = null;
          int i = 0;
          if (t_reusableCa == t) {
             AtomicReferenceFieldUpdater y = gc1.y;
             while (true) {
                if (y.compareAndSet(this, t, p0)) {
                   i = 1;
                }else {
                   if (y.get(this) == t) {
                      continue ;
                   }
                }
                if (i) {
                   break ;
                }else {
                   continue ;
                }
             }
             return throwable;
          }else if(t_reusableCa instanceof Throwable){
             AtomicReferenceFieldUpdater y1 = gc1.y;
             while (true) {
                if (y1.compareAndSet(this, t_reusableCa, throwable)) {
                   i = 1;
                }else {
                   if (y1.get(this) == t_reusableCa) {
                      continue ;
                   }
                }
                if (i) {
                }else {
                   throw new IllegalArgumentException("Failed requirement.".toString());
                }
             }
             return t_reusableCa;
          }else {
             throw new IllegalStateException("Inconsistent state "+t_reusableCa.toString());
          }
       } while (i);
    }
    public final String toString(){
       return "DispatchedContinuation["+this.t+", "+w51.U(this.v)+']';
    }
}
