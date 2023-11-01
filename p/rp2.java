package p.rp2;
import p.cp7;
import p.wq0;
import p.l91;
import p.mx;
import p.p91;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Object;
import p.sp2;

public final class rp2 extends cp7	// class@002530 from classes.dex
{

    public void rp2(wq0 p0){
       super(p0);
    }
    public final void a(l91 p0){
       cp7 tb = this.b;
       mx s0 = tb.s0;
       cp7 th = this.h;
       Iterator iterator = th.l.iterator();
       int i = 0;
       int i1 = -1;
       while (iterator.hasNext()) {
          p91 g = iterator.next().g;
          if (i1 == -1 || g < i1) {
             i1 = g;
          }
          if (i < g) {
             i = g;
          }
       }
       if (s0 != null && s0 != 2) {
          th.d((i + tb.u0));
       }else {
          th.d((i1 + tb.u0));
       }
       return;
    }
    public final void d(){
       object oobject;
       cp7 i1;
       cp7 tb = this.b;
       if (tb instanceof mx) {
          cp7 th = this.h;
          boolean b = true;
          th.b = b;
          mx s0 = tb.s0;
          mx t0 = tb.t0;
          p91 l = th.l;
          int i = 0;
          if (s0 != null) {
             if (s0 != b) {
                if (s0 != 2) {
                   if (s0 == 3) {
                      th.e = 7;
                      while (i < tb.r0) {
                         oobject = tb.q0[i];
                         if (t0 != null || oobject.h0 != 8) {
                            i1 = oobject.e.i;
                            i1.k.add(th);
                            l.add(i1);
                         }
                         i = i + 1;
                      }
                      this.m(this.b.e.h);
                      this.m(this.b.e.i);
                   }
                }else {
                   th.e = 6;
                   while (i < tb.r0) {
                      oobject = tb.q0[i];
                      if (t0 != null || oobject.h0 != 8) {
                         i1 = oobject.e.h;
                         i1.k.add(th);
                         l.add(i1);
                      }
                      i = i + 1;
                   }
                   this.m(this.b.e.h);
                   this.m(this.b.e.i);
                }
             }else {
                th.e = 5;
                while (i < tb.r0) {
                   oobject = tb.q0[i];
                   if (t0 != null || oobject.h0 != 8) {
                      i1 = oobject.d.i;
                      i1.k.add(th);
                      l.add(i1);
                   }
                   i = i + 1;
                }
                this.m(this.b.d.h);
                this.m(this.b.d.i);
             }
          }else {
             th.e = 4;
             while (i < tb.r0) {
                oobject = tb.q0[i];
                if (t0 != null || oobject.h0 != 8) {
                   i1 = oobject.d.h;
                   i1.k.add(th);
                   l.add(i1);
                }
                i = i + 1;
             }
             this.m(this.b.d.h);
             this.m(this.b.d.i);
          }
       }
       return;
    }
    public final void e(){
       cp7 tb = this.b;
       if (tb instanceof mx) {
          mx s0 = tb.s0;
          cp7 th = this.h;
          tb.a0 = (s0 != null && s0 != 1)? th.g: th.g;
       }
       return;
    }
    public final void f(){
       this.c = null;
       this.h.c();
    }
    public final boolean k(){
       return false;
    }
    public final void m(p91 p0){
       cp7 th = this.h;
       th.k.add(p0);
       p0.l.add(th);
    }
}
