package p.pk7;
import p.ng2;
import p.ww6;
import p.qk7;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.eb3;
import coil.request.ViewTargetRequestDelegate;
import p.me3;
import p.io2;
import p.dk3;
import p.vj3;

public final class pk7 extends ww6 implements ng2	// class@00227f from classes.dex
{
    public final qk7 v;

    public void pk7(qk7 p0,au0 p1){
       this.v = p0;
       super(p1);
    }
    public final Object b(Object p0,Object p1){
       p1 = jc7.a;
       this.c(p0, p1).f(p1);
       return p1;
    }
    public final au0 c(Object p0,au0 p1){
       return new pk7(this.v, p1);
    }
    public final Object f(Object p0){
       qk7 t;
       eb3.G(p0);
       p0 = this.v;
       if ((t = p0.t) != null) {
          io2.e(t.v);
          ViewTargetRequestDelegate c = t.c;
          ViewTargetRequestDelegate t1 = t.t;
          if (c instanceof dk3) {
             t1.c(c);
          }
          t1.c(t);
       }
       p0.t = null;
       return jc7.a;
    }
}
