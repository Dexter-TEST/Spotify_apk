package p.cp7;
import p.l91;
import p.wq0;
import java.lang.Object;
import p.kb1;
import p.p91;
import java.util.ArrayList;
import p.cq0;
import java.lang.Enum;
import p.ug7;
import java.lang.Math;

public abstract class cp7 implements l91	// class@001254 from classes.dex
{
    public int a;
    public wq0 b;
    public i06 c;
    public int d;
    public final kb1 e;
    public int f;
    public boolean g;
    public final p91 h;
    public final p91 i;
    public int j;

    public void cp7(wq0 p0){
       super();
       this.e = new kb1(this);
       this.f = 0;
       this.g = false;
       this.h = new p91(this);
       this.i = new p91(this);
       this.j = 1;
       this.b = p0;
    }
    public static void b(p91 p0,p91 p1,int p2){
       p0.l.add(p1);
       p0.f = p2;
       p1.k.add(p0);
    }
    public static p91 h(cq0 p0){
       p0 = p0.f;
       p91 op91 = null;
       if (p0 == null) {
          return op91;
       }
       int i = p0.e.ordinal();
       p0 = p0.d;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      op91 = p0.e.k;
                   }
                }else {
                   op91 = p0.e.i;
                }
             }else {
                op91 = p0.d.i;
             }
          }else {
             op91 = p0.e.h;
          }
       }else {
          op91 = p0.d.h;
       }
       return op91;
    }
    public static p91 i(cq0 p0,int p1){
       int i;
       p0 = p0.f;
       p91 op91 = null;
       if (p0 == null) {
          return op91;
       }
       cq0 d = p0.d;
       wq0 d1 = (!p1)? d.d: d.e;
       if ((i = p0.e.ordinal()) != 1 && i != 2) {
          if (i == 3 || i == 4) {
             op91 = d1.i;
          }
       }else {
          op91 = d1.h;
       }
       return op91;
    }
    public abstract void a(l91 p0);
    public final void c(p91 p0,p91 p1,int p2,kb1 p3){
       p0.l.add(p1);
       p0.l.add(this.e);
       p0.h = p2;
       p0.i = p3;
       p1.k.add(p0);
       p3.k.add(p0);
    }
    public abstract void d();
    public abstract void e();
    public abstract void f();
    public final int g(int p0,int p1){
       cp7 tb;
       wq0 v;
       if (!p1) {
          tb = this.b;
          v = tb.v;
          tb = Math.max(tb.u, p0);
          if (v > null) {
             tb = Math.min(v, p0);
          }
          if (tb != p0) {
          label_0027 :
             p0 = tb;
          }
       }else {
          tb = this.b;
          v = tb.y;
          tb = Math.max(tb.x, p0);
          if (v > null) {
             tb = Math.min(v, p0);
          }
          if (tb != p0) {
             goto label_0027 ;
          }
       }
       return p0;
    }
    public long j(){
       cp7 te = this.e;
       if (te.j != null) {
          return (long)te.g;
       }
       return 0;
    }
    public abstract boolean k();
    public final void l(cq0 p0,cq0 p1,int p2){
       cp7 ta;
       cp7 ti;
       wq0 e0;
       wq0 x;
       wq0 u;
       p91 op91 = cp7.h(p0);
       p91 op911 = cp7.h(p1);
       if (op91.j != null && op911.j != null) {
          int i = p0.e() + op91.g;
          int i1 = op911.g - p1.e();
          int i2 = i1 - i;
          cp7 te = this.e;
          if (te.j == null) {
             int i3 = 3;
             if (this.d == i3) {
                if ((ta = this.a) != null) {
                   int i4 = 1;
                   if (ta != i4) {
                      if (ta != 2) {
                         if (ta == i3) {
                            ta = this.b;
                            wq0 d = ta.d;
                            if (d.d == i3 && d.a == i3) {
                               wq0 e = ta.e;
                               if (e.d != i3 || e.a != i3) {
                               }
                            }else if(!p2){
                               d = ta.e;
                            }
                            ti = d.e;
                            if (ti.j != null) {
                               x = ta.X;
                               int i5 = (p2 == i4)? (int)(((float)ti.g / x) + 0x3f000000): (int)((x * (float)ti.g) + 0x3f000000);
                               te.d(i5);
                            }
                         }
                      }else {
                         ta = this.b;
                         if ((u = ta.U) != null) {
                            u = (!p2)? u.d: u.e;
                            ti = u.e;
                            if (ti.j != null) {
                               x = (!p2)? ta.w: ta.z;
                               te.d(this.g((int)(((float)ti.g * x) + 0x3f000000), p2));
                            }
                         }
                      }
                   }else {
                      te.d(Math.min(this.g(te.m, p2), i2));
                   }
                }else {
                   te.d(this.g(i2, p2));
                }
             }
          }
          if (te.j == null) {
             return;
          }else {
             p91 g = te.g;
             ti = this.i;
             cp7 th = this.h;
             if (g == i2) {
                th.d(i);
                ti.d(i1);
                return;
             }else if(!p2){
                e0 = this.b.e0;
             }else {
                e0 = this.b.f0;
             }
             if (op91 == op911) {
                i = op91.g;
                i1 = op911.g;
                e0 = 0x3f000000;
             }
             th.d((int)(((float)((i1 - i) - g) * e0) + ((float)i + 0x3f000000)));
             ti.d((th.g + te.g));
          }
       }
       return;
    }
}
