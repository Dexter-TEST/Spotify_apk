package p.c52;
import java.util.concurrent.Callable;
import p.p25;
import java.util.concurrent.ExecutorService;
import p.es;
import p.ny0;
import java.lang.Object;
import p.b52;
import p.i52;
import p.i51;
import p.m07;
import p.if7;
import p.b7;
import java.lang.Class;
import p.o07;
import java.util.concurrent.Executor;
import p.bu0;
import p.a28;
import p.xq7;
import p.pv6;
import p.oy6;
import p.nc4;
import p.iz7;
import java.lang.Runnable;

public final class c52 implements Callable	// class@00119b from classes.dex
{
    public final p25 a;
    public final ExecutorService b;
    public final es c;
    public final boolean t;
    public final ny0 v;

    public void c52(p25 p0,ExecutorService p1,es p2,boolean p3,ny0 p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       super();
    }
    public final Object call(){
       c52 tb = this.b;
       c52 tc = this.c;
       c52 ta = this.a;
       p25 b = ta.b;
       b.a();
       b = ta.m;
       m07 a = b.h.a;
       i51 f = b.f;
       _monitor_enter(f);
       m07 a1 = b.g.a;
       _monitor_exit(f);
       m07 f1 = new m07();
       b7 uob7 = new b7(16, f1);
       a.getClass();
       oy6 mt7 a2 = o07.a;
       a.h(a2, uob7);
       a1.getClass();
       a1.h(a2, uob7);
       a2 = new oy6(ta, b.c.b, tc, tb, 5);
       f1.a.g(tb, new xq7(ta, tc)).g(tb, a2);
       if (this.t != null) {
          c52 tv = this.v;
          tv.getClass();
          tv.l.execute(new iz7(new nc4(tv, 5, this.c), 6, new m07()));
       }
       return null;
    }
}
