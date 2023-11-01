package p.lb4;
import p.ob4;
import p.kb4;
import p.kd7;
import p.xo0;
import p.j93;
import p.qb4;
import p.xk5;
import java.lang.Object;
import java.lang.Class;
import p.nv1;
import p.nb1;
import p.bm;
import p.rb4;
import java.util.Set;
import java.util.Collections;
import p.jt;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.ss3;
import p.er7;
import p.b7;
import p.wb4;
import java.lang.Iterable;

public final class lb4 implements ob4	// class@001d1f from classes.dex
{
    public final kd7 a;
    public final xo0 b;
    public final j93 c;
    public final xo0 d;
    public final xk5 e;
    public final xk5 f;
    public final qb4 g;
    public static final kb4 h;

    static {
       lb4.h = new kb4();
    }
    public void lb4(kd7 p0,xo0 p1,j93 p2,xo0 p3,qb4 p4,xk5 p5,xk5 p6){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       this.c = p2;
       p3.getClass();
       this.d = p3;
       p5.getClass();
       this.e = p5;
       p6.getClass();
       this.f = p6;
       p4.getClass();
       this.g = p4;
    }
    public final lb4 a(xk5 p0){
       lb4 v8 = new lb4(this.a, this.b, this.c, this.d, this.g, this.e, p0);
       return v8;
    }
    public final lb4 b(xk5 p0){
       lb4 v8 = new lb4(this.a, this.b, this.c, this.d, this.g, p0, this.f);
       return v8;
    }
    public final lb4 c(nv1 p0){
       lb4 v8 = new lb4(this.a, this.b, this.c, new nb1(p0), this.g, this.e, this.f);
       return v8;
    }
    public final lb4 d(bm p0){
       lb4 v8 = new lb4(this.a, this.b, p0, this.d, this.g, this.e, this.f);
       return v8;
    }
    public final lb4 e(qb4 p0){
       lb4 v8 = new lb4(this.a, this.b, this.c, this.d, p0, this.e, this.f);
       return v8;
    }
    public final rb4 f(Object p0){
       lb4 tc;
       Set set = Collections.emptySet();
       if ((tc = this.c) != null) {
          lb4 tg = this.g;
          tg.getClass();
          p0.getClass();
          try{
             tg.d(p0);
             jt ojt = tc.c(p0);
             tg.b(p0, ojt);
             p0 = ojt.a;
             set = ojt.b;
          }catch(java.lang.Exception e1){
             set.e(p0, e1);
             if (e1 instanceof RuntimeException) {
                throw e1;
             }else {
                throw new RuntimeException(e1);
             }
          }
       }
       return this.g(p0, set);
    }
    public final rb4 g(Object p0,Set p1){
       Object obj = this.e.get();
       obj.getClass();
       Object obj1 = this.f.get();
       obj1.getClass();
       p0.getClass();
       p1.getClass();
       lb4 tb = this.b;
       tb.getClass();
       lb4 td = this.d;
       td.getClass();
       rb4 v1 = new rb4(new b7(new wb4(new ss3(this.a, this.g), p0)), p0, p1, tb, td, obj, obj1);
       return v1;
    }
}
