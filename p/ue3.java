package p.ue3;
import p.qn;
import kotlinx.coroutines.internal.a;
import p.ve3;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.co5;
import p.bx6;
import p.eb3;

public final class ue3 extends qn	// class@002895 from classes.dex
{
    public final a b;
    public a c;
    public final ve3 d;
    public final Object e;

    public void ue3(a p0,ve3 p1,Object p2){
       this.d = p1;
       this.e = p2;
       super();
       this.b = p0;
    }
    public final void b(Object p0,Object p1){
       int i = 0;
       int i1 = (p1 == null)? 1: 0;
       ue3 tb = this.b;
       ue3 oue3 = (i1)? tb: this.c;
       if (oue3 != null) {
          AtomicReferenceFieldUpdater a = a.a;
          while (true) {
             if (a.compareAndSet(p0, this, oue3)) {
                i = 1;
             }else {
                if (a.get(p0) == this) {
                   continue ;
                }
             }
             if (i && i1) {
                p0 = this.c;
                co5.i(p0);
                tb.e(p0);
                break ;
             }
          }
       }
       return;
    }
    public final bx6 c(Object p0){
       int i = (this.d.t() == this.e)? 1: 0;
       i = (i)? null: eb3.y;
       return i;
    }
}
