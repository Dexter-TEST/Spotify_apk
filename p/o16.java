package p.o16;
import p.qb4;
import java.lang.Class;
import p.is3;
import p.ls3;
import java.lang.String;
import java.lang.Object;
import p.jt;
import java.util.Iterator;
import java.util.Set;
import java.lang.Exception;
import p.xt;

public final class o16 implements qb4	// class@002090 from classes.dex
{
    public final String a;
    public static final is3 b;

    static {
       o16.b = ls3.d(o16.class);
    }
    public void o16(String p0){
       super();
       this.a = p0;
    }
    public final void a(Object p0,Object p1){
       o16.b.i(this.a, p1, "Mobius \({}\) - Event received: {}");
    }
    public final void b(Object p0,jt p1){
       is3 b = o16.b;
       o16 ta = this.a;
       b.i(ta, p1.a, "Mobius \({}\) - Loop initialized, starting from model: {}");
       p0 = p1.b.iterator();
       while (p0.hasNext()) {
          b.i(ta, p0.next(), "Mobius \({}\) - Effect dispatched: {}");
       }
       return;
    }
    public final void c(Object p0,Object p1,Exception p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       o16.b.b(objArray);
    }
    public final void d(Object p0){
       o16.b.h(this.a);
    }
    public final void e(Object p0,Exception p1){
       o16.b.d(p0, p1);
    }
    public final void f(Object p0,Object p1,xt p2){
       p1 = this.a;
       is3 b = o16.b;
       if (p2.b()) {
          b.i(p1, p2.c(), "Mobius \({}\) - Model updated: {}");
       }
       p0 = p2.b.iterator();
       while (p0.hasNext()) {
          b.i(p1, p0.next(), "Mobius \({}\) - Effect dispatched: {}");
       }
       return;
    }
}
