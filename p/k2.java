package p.k2;
import p.lv1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.m2;
import java.lang.Object;
import java.lang.Thread;
import p.n2;
import p.j2;

public final class k2 extends lv1	// class@001b96 from classes.dex
{
    public final AtomicReferenceFieldUpdater P;
    public final AtomicReferenceFieldUpdater Q;
    public final AtomicReferenceFieldUpdater R;
    public final AtomicReferenceFieldUpdater S;
    public final AtomicReferenceFieldUpdater T;

    public void k2(AtomicReferenceFieldUpdater p0,AtomicReferenceFieldUpdater p1,AtomicReferenceFieldUpdater p2,AtomicReferenceFieldUpdater p3,AtomicReferenceFieldUpdater p4){
       super(0);
       this.P = p0;
       this.Q = p1;
       this.R = p2;
       this.S = p3;
       this.T = p4;
    }
    public final void E(m2 p0,m2 p1){
       this.Q.lazySet(p0, p1);
    }
    public final void F(m2 p0,Thread p1){
       this.P.lazySet(p0, p1);
    }
    public final boolean f(n2 p0,j2 p1,j2 p2){
       boolean b;
       while (true) {
          k2 tS = this.S;
          if (tS.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (tS.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean g(n2 p0,Object p1,Object p2){
       boolean b;
       while (true) {
          k2 tT = this.T;
          if (tT.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (tT.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean h(n2 p0,m2 p1,m2 p2){
       boolean b;
       while (true) {
          k2 tR = this.R;
          if (tR.compareAndSet(p0, p1, p2)) {
             b = true;
             break ;
          }else {
             if (tR.get(p0) != p1) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
}
