package p.t0;
import p.ty0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.x0;
import p.s0;
import java.lang.Object;
import p.w0;
import java.lang.Thread;

public final class t0 extends ty0	// class@0026d9 from classes.dex
{
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;

    public void t0(AtomicReferenceFieldUpdater p0,AtomicReferenceFieldUpdater p1,AtomicReferenceFieldUpdater p2,AtomicReferenceFieldUpdater p3,AtomicReferenceFieldUpdater p4){
       super(0);
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
    }
    public final boolean d(x0 p0,s0 p1,s0 p2){
       boolean b;
       while (true) {
          t0 tp = this.p;
          if (tp.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (tp.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean e(x0 p0,Object p1,Object p2){
       boolean b;
       while (true) {
          t0 tq = this.q;
          if (tq.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (tq.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean f(x0 p0,w0 p1,w0 p2){
       boolean b;
       while (true) {
          t0 to = this.o;
          if (to.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (to.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final void t(w0 p0,w0 p1){
       this.n.lazySet(p0, p1);
    }
    public final void u(w0 p0,Thread p1){
       this.m.lazySet(p0, p1);
    }
}
