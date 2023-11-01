package p.tq3;
import p.vi7;
import p.ce2;
import p.jo6;
import java.lang.Object;
import p.rq3;
import p.mn;
import p.xz4;
import p.sq3;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.IllegalStateException;

public final class tq3 extends vi7	// class@0027bf from classes.dex
{
    public final jo6 t;
    public boolean v;
    public static final ce2 w;

    static {
       tq3.w = new ce2(1);
    }
    public void tq3(){
       super();
       this.t = new jo6();
       this.v = false;
    }
    public final void b(){
       rq3 p;
       mn b;
       tq3 tt = this.t;
       int i = tt.g();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             rq3 orq3 = tt.h(i1);
             rq3 n = orq3.n;
             n.a();
             n.d = true;
             if ((p = orq3.p) != null) {
                orq3.j(p);
                if (p.b != null) {
                   p.a.getClass();
                }
             }
             if ((b = n.b) != null) {
                if (b == orq3) {
                   n.b = null;
                   n.e = true;
                   n.c = false;
                   n.d = false;
                   n.f = false;
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }else {
                throw new IllegalStateException("No listener register");
             }
          }else {
             jo6 t = tt.t;
             jo6 c = tt.c;
             for (int i2 = 0; i2 < t; i2 = i2 + 1) {
                c[i2] = null;
             }
             tt.t = 0;
             tt.a = false;
             return;
          }
       }
       throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
