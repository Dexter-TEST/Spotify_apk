package p.te0;
import p.oe3;
import p.wb0;
import java.lang.Object;
import java.lang.Throwable;
import p.jc7;
import p.ve3;
import p.re3;
import java.lang.Class;
import java.util.concurrent.CancellationException;
import p.gc1;

public final class te0 extends oe3	// class@002751 from classes.dex
{
    public final wb0 v;

    public void te0(wb0 p0){
       super();
       this.v = p0;
    }
    public final Object invoke(Object p0){
       this.l(p0);
       return jc7.a;
    }
    public final void l(Throwable p0){
       te0 tv = this.v;
       tv.getClass();
       CancellationException uCancellatio = this.k().o();
       int i = (!tv.s())? 0: tv.t.k(uCancellatio);
       if (!i) {
          tv.l(uCancellatio);
          if (!tv.s()) {
             tv.m();
          }
       }
       return;
    }
}
