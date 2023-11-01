package p.e15;
import p.s90;
import p.lv5;
import java.lang.Object;
import p.r90;
import p.su0;
import p.lp5;
import p.t90;
import java.lang.Class;
import p.gv5;
import java.lang.String;
import p.ps2;
import p.mp2;
import p.u54;
import java.util.ArrayList;
import p.lv1;
import p.os2;
import p.co5;
import p.qc2;
import p.pc2;
import p.je4;
import p.he4;
import p.ev5;
import p.fv5;
import p.dv5;
import p.sm2;
import p.zu5;
import p.wc3;
import java.lang.reflect.Method;
import p.bv5;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.kg4;
import p.en6;
import p.bx5;
import p.cx5;
import java.lang.IllegalStateException;
import java.io.IOException;
import java.lang.RuntimeException;
import java.lang.Error;
import java.lang.Throwable;
import p.do5;
import p.ax5;
import p.d15;
import p.fx5;
import p.c15;
import p.ex5;
import p.e70;
import p.g70;
import p.f70;
import p.ca0;
import p.b15;
import p.da0;

public final class e15 implements s90	// class@0001c8 from classes2.dex
{
    public final lv5 a;
    public final Object[] b;
    public final r90 c;
    public final su0 t;
    public boolean v;
    public t90 w;
    public Throwable x;
    public boolean y;

    public void e15(lv5 p0,Object[] p1,r90 p2,su0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final boolean J(){
       e15 tw;
       boolean b = true;
       if (this.v != null) {
          return b;
       }
       _monitor_enter(this);
       if ((tw = this.w) == null || tw.G == null) {
          b = false;
       }
       _monitor_exit(this);
       return b;
    }
    public final t90 a(){
       gv5 v4;
       ps2 ops2;
       gv5 k;
       gv5 j1;
       t90 ot90;
       os2 oos2;
       e15 ta = this.a;
       ta.getClass();
       e15 tb = this.b;
       int len = tb.length;
       lv5 j = ta.j;
       if (len != j.length) {
          throw new IllegalArgumentException(en6.o(kg4.r("Argument count \(", len, "\) doesn\'t match expected count \("), j.length, "\)"));
       }
       if ((v4 = new gv5(ta.c, ta.b, ta.d, ta.e, ta.f, ta.g, ta.h, ta.i)) != null) {
          len = len - 1;
       }
       ArrayList uArrayList = new ArrayList(len);
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          uArrayList.add(tb[i1]);
          j[i1].a(v4, tb[i1]);
       }
       gv5 d = v4.d;
       u54 ou54 = null;
       if (d != null) {
          ops2 = d.b();
       }else {
          d = v4.c;
          k = v4.b;
          k.getClass();
          co5.o(d, "link");
          ops2 = ((oos2 = k.g(d)) == null)? ou54: oos2.b();
          if (ops2 == null) {
             throw new IllegalArgumentException("Malformed URL. Base: "+k+", Relative: "+v4.c);
          }
       }
       if ((k = v4.k) == null) {
          if ((j1 = v4.j) != null) {
             k = new qc2(j1.a, j1.b);
          }else if((j1 = v4.i) != null){
             k = j1.a();
          }else if(v4.h != null){
             byte[] uobyteArray = new byte[i];
             k = fv5.c(ou54, uobyteArray);
          }
       }
       gv5 g = v4.g;
       gv5 f = v4.f;
       if (g != null) {
          if (k != null) {
             k = new dv5(k, g);
          }else {
             f.b("Content-Type", g.a);
          }
       }
       g = v4.e;
       g.getClass();
       g.a = ops2;
       g.c = f.e().d();
       g.e(v4.a, k);
       g.f(wc3.class, new wc3(ta.a, uArrayList));
       if ((ot90 = this.c.a(g.b())) != null) {
          return ot90;
       }else {
          throw new NullPointerException("Call.Factory returned null.");
       }
    }
    public final bx5 b(){
       _monitor_enter(this);
       if (this.y != null) {
          throw new IllegalStateException("Already executed.");
       }
       this.y = true;
       t90 ot90 = this.c();
       _monitor_exit(this);
       if (this.v != null) {
          ot90.cancel();
       }
       return this.d(ot90.f());
    }
    public final t90 c(){
       e15 tw;
       if ((tw = this.w) != null) {
          return tw;
       }
       if ((tw = this.x) != null) {
          if (tw instanceof IOException) {
             throw tw;
          }
          if (tw instanceof RuntimeException) {
             throw tw;
          }
          throw tw;
       }else {
          try{
             t90 ot90 = this.a();
             this.w = ot90;
             return ot90;
          }catch(java.lang.RuntimeException e0){
          }catch(java.lang.Error e0){
          }catch(java.io.IOException e0){
          }
          do5.v0(e0);
          this.x = e0;
          throw e0;
       }
    }
    public final void cancel(){
       this.v = true;
       _monitor_enter(this);
       e15 tw = this.w;
       _monitor_exit(this);
       if (tw != null) {
          tw.cancel();
       }
       return;
    }
    public final Object clone(){
       return new e15(this.a, this.b, this.c, this.t);
    }
    public final s90 clone(){
       return new e15(this.a, this.b, this.c, this.t);
    }
    public final bx5 d(cx5 p0){
       cx5 t;
       c15 uoc15;
       c15 t1;
       ax5 uoax5 = new ax5(p0);
       p0 = p0.x;
       uoax5.g = new d15(p0.x(), p0.f());
       cx5 uocx5 = uoax5.a();
       if ((t = uocx5.t) >= 200 && t < 300) {
          if (t != 204 && t != 205) {
             try{
                uoc15 = new c15(p0);
                p0 = this.t.a(uoc15);
                if (uocx5.x()) {
                   return new bx5(uocx5, p0, null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
             }catch(java.lang.RuntimeException e8){
                if ((t1 = uoc15.t) == null) {
                   throw e8;
                }
                throw t1;
             }
          }else {
             p0.close();
             if (uocx5.x()) {
                return new bx5(uocx5, null, null);
             }
             throw new IllegalArgumentException("rawResponse must be successful response");
          }
       }else {
          e70 uoe70 = new e70();
          p0.y().L(uoe70);
          ex5 uoex5 = new ex5(p0.x(), p0.f(), uoe70);
          if (uocx5.x()) {
             throw new IllegalArgumentException("rawResponse should not be successful response");
          }
          p0.close();
          return new bx5(uocx5, null, uoex5);
       }
    }
    public final void x(ca0 p0){
       _monitor_enter(this);
       if (this.y != null) {
          throw new IllegalStateException("Already executed.");
       }
       this.y = true;
       e15 tw = this.w;
       e15 tx = this.x;
       if (tw == null && tx == null) {
          t90 ot90 = this.a();
          this.w = ot90;
          tw = ot90;
       }
       _monitor_exit(this);
       if (tx != null) {
          p0.g(this, tx);
          return;
       }else if(this.v != null){
          tw.cancel();
       }
       tw.e(new b15(this, p0));
       return;
    }
    public synchronized final bv5 y(){
       try{
          return this.c().b;
       }catch(java.io.IOException e0){
          throw new RuntimeException("Unable to create request.", e0);
       }
    }
}
