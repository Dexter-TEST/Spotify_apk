package p.gc3;
import p.ng2;
import p.ww6;
import p.wf2;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.eb3;
import p.xw0;
import p.r37;
import p.me3;
import p.ej4;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.lang.Throwable;

public final class gc3 extends ww6 implements ng2	// class@0016e0 from classes.dex
{
    public Object v;
    public final wf2 w;

    public void gc3(wf2 p0,au0 p1){
       this.w = p0;
       super(p1);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       gc3 ogc3 = new gc3(this.w, p1);
       ogc3.v = p0;
       return ogc3;
    }
    public final Object f(Object p0){
       eb3.G(p0);
       p0 = this.v.c();
       try{
          gc3 tw = this.w;
          r37 or37 = new r37(ej4.E(p0));
          or37.c();
          or37.a();
          return tw.invoke();
       }catch(java.lang.InterruptedException e3){
          throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
       }
    }
}
