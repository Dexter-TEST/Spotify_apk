package p.kn2;
import p.cp7;
import p.wq0;
import p.vq2;
import p.ug7;
import p.jn2;
import p.l91;
import p.p91;
import java.lang.Object;
import java.util.ArrayList;

public final class kn2 extends cp7	// class@001c47 from classes.dex
{

    public void kn2(wq0 p0){
       super(p0);
       p0.d.f();
       p0.e.f();
       this.f = p0.u0;
    }
    public final void a(l91 p0){
       cp7 th = this.h;
       if (th.c == null) {
          return;
       }
       if (th.j != null) {
          return;
       }
       th.d((int)(((float)th.l.get(0).g * this.b.q0) + 0x3f000000));
       return;
    }
    public final void d(){
       cp7 tb = this.b;
       cp7 uocp7 = tb;
       jn2 r0 = uocp7.r0;
       jn2 s0 = uocp7.s0;
       cp7 th = this.h;
       if (uocp7.u0 == true) {
          if (r0 != -1) {
             th.l.add(tb.U.d.h);
             this.b.U.d.h.k.add(th);
             th.f = r0;
          }else if(s0 != -1){
             th.l.add(tb.U.d.i);
             this.b.U.d.i.k.add(th);
             th.f = - s0;
          }else {
             th.b = true;
             th.l.add(tb.U.d.i);
             this.b.U.d.i.k.add(th);
          }
          this.m(this.b.d.h);
          this.m(this.b.d.i);
       }else if(r0 != -1){
          th.l.add(tb.U.e.h);
          this.b.U.e.h.k.add(th);
          th.f = r0;
       }else if(s0 != -1){
          th.l.add(tb.U.e.i);
          this.b.U.e.i.k.add(th);
          th.f = - s0;
       }else {
          th.b = true;
          th.l.add(tb.U.e.i);
          this.b.U.e.i.k.add(th);
       }
       this.m(this.b.e.h);
       this.m(this.b.e.i);
       return;
    }
    public final void e(){
       cp7 tb = this.b;
       cp7 th = this.h;
       tb.Z = (tb.u0 == 1)? th.g: th.g;
       return;
    }
    public final void f(){
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
