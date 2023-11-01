package p.ug7;
import p.cp7;
import p.wq0;
import p.p91;
import p.l91;
import p.en6;
import p.kb1;
import java.lang.Object;
import java.util.ArrayList;
import p.cq0;
import p.sz;
import p.qp2;
import p.bq0;
import java.lang.String;
import java.lang.StringBuilder;

public final class ug7 extends cp7	// class@0028a9 from classes.dex
{
    public final p91 k;
    public sz l;

    public void ug7(wq0 p0){
       super(p0);
       p91 op91 = new p91(this);
       this.k = op91;
       this.l = null;
       this.h.e = 6;
       this.i.e = 7;
       op91.e = 8;
       this.f = 1;
    }
    public final void a(l91 p0){
       cp7 te;
       cp7 tb;
       wq0 s;
       cp7 ti;
       wq0 y;
       int i6;
       float f;
       wq0 x;
       int i = 1;
       int i1 = 3;
       if (en6.A(this.j) != i1) {
          te = this.e;
          int i2 = 0;
          if (te.c != null && (te.j == null && this.d == i1)) {
             tb = this.b;
             if ((s = tb.s) != 2) {
                if (s == i1) {
                   ti = tb.d.e;
                   if (ti.j != null) {
                      if ((y = tb.Y) != -1) {
                         if (y != null) {
                            if (y != i) {
                               i6 = 0;
                            label_004e :
                               te.d(i6);
                            }else {
                               f = (float)ti.g;
                               x = tb.X;
                            }
                         }else {
                            f = (float)ti.g * tb.X;
                         label_004c :
                            i6 = (int)(f + 0x3f000000);
                            goto label_004e ;
                         }
                      }else {
                         f = (float)ti.g;
                         x = tb.X;
                      }
                      f = f / x;
                      goto label_004c ;
                   }
                }
             }else if((s = tb.U) != null){
                ti = s.e.e;
                if (ti.j != null) {
                   te.d((int)(((float)ti.g * tb.z) + 0x3f000000));
                }
             }
          }
          tb = this.h;
          if (tb.c != null) {
             ti = this.i;
             if (ti.c != null) {
                if (tb.j != null && (ti.j != null && te.j != null)) {
                   return;
                }else {
                   p91 l = tb.l;
                   p91 l1 = ti.l;
                   if (te.j == null && this.d == i1) {
                      cp7 tb1 = this.b;
                      if (tb1.r == null && !tb1.z()) {
                         i = l.get(i2).g + tb.f;
                         i1 = l1.get(i2).g + ti.f;
                         tb.d(i);
                         ti.d(i1);
                         te.d((i1 - i));
                         return;
                      }
                   }
                   if (te.j == null && (this.d == i1 && (this.a == i && (l.size() > 0 && l1.size() > 0)))) {
                      i1 = (l1.get(i2).g + ti.f) - (l.get(i2).g + tb.f);
                      kb1 m = te.m;
                      if (i1 < m) {
                         te.d(i1);
                      }else {
                         te.d(m);
                      }
                   }
                   if (te.j == null) {
                      return;
                   }else if(l.size() > 0 && l1.size() > 0){
                      p91 op91 = l.get(i2);
                      p91 op911 = l1.get(i2);
                      p91 g = op91.g;
                      int i3 = tb.f + g;
                      l = op911.g;
                      int i4 = ti.f + l;
                      wq0 owq0 = this.b.f0;
                      if (op91 == op911) {
                         owq0 = 0x3f000000;
                      }else {
                         g = i3;
                         int i5 = i4;
                      }
                      tb.d((int)(((float)((l - g) - te.g) * owq0) + ((float)g + 0x3f000000)));
                      ti.d((tb.g + te.g));
                   }
                }
             }
          }
          return;
       }else {
          te = this.b;
          this.l(te.J, te.L, i);
          return;
       }
    }
    public final void d(){
       wq0 u;
       wq0 q;
       cq0 f;
       wq0 s;
       cq0 f1;
       wq0 u1;
       cp7 tb = this.b;
       cp7 te = this.e;
       if (tb.a != null) {
          te.d(tb.l());
       }
       cp7 ti = this.i;
       cp7 th = this.h;
       int i = 3;
       int i1 = 1;
       int i2 = 4;
       if (te.j == null) {
          tb = this.b;
          this.d = tb.T[i1];
          if (tb.E != null) {
             this.l = new sz(this);
          }
          if ((tb = this.d) != i) {
             if (tb == i2 && ((u = this.b.U) != null && u.T[i1] == i1)) {
                cp7.b(th, u.e.h, this.b.J.e());
                cp7.b(ti, u.e.i, (- this.b.L.e()));
                te.d(((u.l() - this.b.J.e()) - this.b.L.e()));
                return;
             }else if(tb == i1){
                te.d(this.b.l());
             }
          }
       }else if(this.d == i2){
          tb = this.b;
          if ((u = tb.U) != null && u.T[i1] == i1) {
             cp7.b(th, u.e.h, tb.J.e());
             cp7.b(ti, u.e.i, (- this.b.L.e()));
             return;
          }
       }
       p91 j = te.j;
       ug7 tk = this.k;
       int i3 = 2;
       if (j != null) {
          cp7 tb1 = this.b;
          if (tb1.a != null) {
             q = tb1.Q;
             object oobject = q[i3];
             if ((f = oobject.f) != null && q[i].f != null) {
                if (tb1.z()) {
                   th.f = this.b.Q[i3].e();
                   ti.f = - this.b.Q[i].e();
                }else if((j = cp7.h(this.b.Q[i3])) != null){
                   cp7.b(th, j, this.b.Q[i3].e());
                }
                if ((j = cp7.h(this.b.Q[i])) != null) {
                   cp7.b(ti, j, (- this.b.Q[i].e()));
                }
                th.b = i1;
                ti.b = i1;
                tb = this.b;
                if (tb.E != null) {
                   cp7.b(tk, th, tb.b0);
                }
             }else if(f != null){
                if ((j = cp7.h(oobject)) != null) {
                   cp7.b(th, j, this.b.Q[i3].e());
                   cp7.b(ti, th, te.g);
                   tb = this.b;
                   if (tb.E != null) {
                      cp7.b(tk, th, tb.b0);
                   }
                }
             }else {
                object oobject1 = q[i];
                if (oobject1.f != null) {
                   if ((j = cp7.h(oobject1)) != null) {
                      cp7.b(ti, j, (- this.b.Q[i].e()));
                      cp7.b(th, ti, (- te.g));
                   }
                   tb = this.b;
                   if (tb.E != null) {
                      cp7.b(tk, th, tb.b0);
                   }
                }else {
                   object oobject2 = q[i2];
                   if (oobject2.f != null) {
                      if ((j = cp7.h(oobject2)) != null) {
                         cp7.b(tk, j, 0);
                         cp7.b(th, tk, (- this.b.b0));
                         cp7.b(ti, th, te.g);
                      }
                   }else if(!tb1 instanceof qp2 && (tb1.U != null && tb1.j(bq0.w).f == null)){
                      tb = this.b;
                      cp7.b(th, tb.U.e.h, tb.t());
                      cp7.b(ti, th, te.g);
                      tb = this.b;
                      if (tb.E != null) {
                         cp7.b(tk, th, tb.b0);
                      }
                   }
                }
             }
          }else {
          label_01d7 :
             p91 l = te.l;
             if (j == null && this.d == i) {
                tb = this.b;
                s = tb.s;
                p91 k = te.k;
                if (s != i3) {
                   if (s == i && !tb.z()) {
                      tb = this.b;
                      if (tb.r != i) {
                         tb = tb.d.e;
                         l.add(tb);
                         tb.k.add(te);
                         te.b = i1;
                         k.add(th);
                         k.add(ti);
                      }
                   }
                }else if((q = tb.U) == null){
                   tb = q.e.e;
                   l.add(tb);
                   tb.k.add(te);
                   te.b = i1;
                   k.add(th);
                   k.add(ti);
                }
             }else {
                te.b(this);
             }
             tb = this.b;
             s = tb.Q;
             object oobject3 = s[i3];
             if ((f1 = oobject3.f) != null && s[i].f != null) {
                if (tb.z()) {
                   th.f = this.b.Q[i3].e();
                   ti.f = - this.b.Q[i].e();
                }else {
                   j = cp7.h(this.b.Q[i3]);
                   p91 op91 = cp7.h(this.b.Q[i]);
                   if (j != null) {
                      j.b(this);
                   }
                   if (op91 != null) {
                      op91.b(this);
                   }
                   this.j = i2;
                }
                if (this.b.E != null) {
                   this.c(tk, th, i1, this.l);
                }
             }else if(f1 != null){
                if ((j = cp7.h(oobject3)) != null) {
                   cp7.b(th, j, this.b.Q[i3].e());
                   this.c(ti, th, i1, te);
                   if (this.b.E != null) {
                      this.c(tk, th, i1, this.l);
                   }
                   if (this.d == i) {
                      tb = this.b;
                      if ((0 - tb.X) > 0) {
                         q = tb.d;
                         if (q.d == i) {
                            q.e.k.add(te);
                            l.add(this.b.d.e);
                            te.a = this;
                         }
                      }
                   }
                }
             }else {
                object oobject4 = s[i];
                if (oobject4.f != null) {
                   if ((j = cp7.h(oobject4)) != null) {
                      cp7.b(ti, j, (- this.b.Q[i].e()));
                      this.c(th, ti, -1, te);
                      if (this.b.E != null) {
                         this.c(tk, th, i1, this.l);
                      }
                   }
                }else {
                   object oobject5 = s[i2];
                   if (oobject5.f != null) {
                      if ((j = cp7.h(oobject5)) != null) {
                         cp7.b(tk, j, 0);
                         this.c(th, tk, -1, this.l);
                         this.c(ti, th, i1, te);
                      }
                   }else if(!tb instanceof qp2 && (u1 = tb.U) != null){
                      cp7.b(th, u1.e.h, tb.t());
                      this.c(ti, th, i1, te);
                      if (this.b.E != null) {
                         this.c(tk, th, i1, this.l);
                      }
                      if (this.d == i) {
                         tb = this.b;
                         if ((0 - tb.X) > 0) {
                            q = tb.d;
                            if (q.d == i) {
                               q.e.k.add(te);
                               l.add(this.b.d.e);
                               te.a = this;
                            }
                         }
                      }
                   }
                }
             }
             if (!l.size()) {
                te.c = i1;
             }
          }
       }else {
          goto label_01d7 ;
       }
       return;
    }
    public final void e(){
       cp7 th = this.h;
       if (th.j != null) {
          this.b.a0 = th.g;
       }
       return;
    }
    public final void f(){
       this.c = null;
       this.h.c();
       this.i.c();
       this.k.c();
       this.e.c();
       this.g = false;
    }
    public final boolean k(){
       if (this.d != 3) {
          return true;
       }
       if (this.b.s == null) {
          return true;
       }
       return false;
    }
    public final void m(){
       this.g = false;
       cp7 th = this.h;
       th.c();
       th.j = false;
       th = this.i;
       th.c();
       th.j = false;
       ug7 tk = this.k;
       tk.c();
       tk.j = false;
       this.e.j = false;
    }
    public final String toString(){
       return "VerticalRun "+this.b.i0;
    }
}
