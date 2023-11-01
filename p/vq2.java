package p.vq2;
import p.cp7;
import p.wq0;
import p.p91;
import p.l91;
import p.en6;
import p.kb1;
import p.cq0;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Math;
import p.qp2;
import p.bq0;
import java.lang.String;
import java.lang.StringBuilder;

public final class vq2 extends cp7	// class@002a44 from classes.dex
{
    public static final int[] k;

    static {
       int[] ointArray = new int[2];
       vq2.k = ointArray;
    }
    public void vq2(wq0 p0){
       super(p0);
       p0.e = 4;
       p0.e = 5;
       this.f = 0;
    }
    public static void m(int[] p0,int p1,int p2,int p3,int p4,float p5,int p6){
       p2 = p2 - p1;
       p4 = p4 - p3;
       if (p6 != -1) {
          if (p6) {
             if (p6 == 1) {
                p0[0] = p2;
                p0[1] = (int)(((float)p2 * p5) + 0x3f000000);
             }
          }else {
             p0[0] = (int)(((float)p4 * p5) + 0x3f000000);
             p0[1] = p4;
          }
       }else {
          p1 = (int)(((float)p4 * p5) + 0x3f000000);
          int i = (int)(((float)p2 / p5) + 0x3f000000);
          if (p1 <= p2) {
             p0[0] = p1;
             p0[1] = p4;
          }else if(i <= p4){
             p0[0] = p2;
             p0[1] = i;
          }
       }
       return;
    }
    public final void a(l91 p0){
       cp7 e;
       wq0 r;
       cp7 b1;
       int i4;
       int i5;
       int i6;
       wq0 y;
       wq0 x;
       int i12;
       float f1;
       cp7 uocp7 = this;
       int i = 0;
       int i1 = 3;
       if (en6.A(uocp7.j) != i1) {
          e = uocp7.e;
          cp7 h = uocp7.h;
          cp7 i2 = uocp7.i;
          int i3 = 1;
          float f = 0x3f000000;
          if (e.j == null && uocp7.d == i1) {
             cp7 b = uocp7.b;
             if ((r = b.r) != 2) {
                if (r == i1) {
                   r = b.s;
                   i4 = -1;
                   if (r != null && r != i1) {
                      if ((r = b.Y) != i4) {
                         if (r != null) {
                            if (r != i3) {
                               i5 = 0;
                            label_005c :
                               e.d(i5);
                            }else {
                               f1 = (float)b.e.e.g;
                               x = b.X;
                            }
                         }else {
                            f1 = (float)b.e.e.g / b.X;
                         label_005a :
                            i5 = (int)(f1 + f);
                            goto label_005c ;
                         }
                      }else {
                         f1 = (float)b.e.e.g;
                         x = b.X;
                      }
                      f1 = f1 * x;
                      goto label_005a ;
                   }else {
                      r = b.e;
                      cp7 h1 = r.h;
                      cp7 i7 = r.i;
                      int i8 = (b.I.f != null)? 1: 0;
                      int i9 = (b.J.f != null)? 1: 0;
                      int i10 = (b.K.f != null)? 1: 0;
                      int i11 = (b.L.f != null)? 1: 0;
                      y = b.Y;
                      if (i8 && (i9 && (i10 && i11))) {
                         x = b.X;
                         int[] k = vq2.k;
                         if (h1.j != null && i7.j != null) {
                            if (h.c != null && i2.c != null) {
                               vq2.m(k, (h.l.get(i).g + h.f), (i2.l.get(i).g - i2.f), (h1.g + h1.f), (i7.g - i7.f), x, y);
                               e.d(k[i]);
                               uocp7.b.e.e.d(k[i3]);
                            }
                            return;
                         }else {
                            p91 l2 = h1.l;
                            if (h.j != null && i2.j != null) {
                               if (h1.c != null && i7.c != null) {
                                  vq2.m(k, (h.g + h.f), (i2.g - i2.f), (l2.get(i).g + h1.f), (i7.l.get(i).g - i7.f), x, y);
                                  e.d(k[i]);
                                  uocp7.b.e.e.d(k[i3]);
                               }else {
                                  return;
                               }
                            }
                            if (h.c != null && (i2.c != null && (h1.c != null && i7.c != null))) {
                               vq2.m(k, (h.l.get(i).g + h.f), (i2.l.get(i).g - i2.f), (l2.get(i).g + h1.f), (i7.l.get(i).g - i7.f), x, y);
                               e.d(k[i]);
                               uocp7.b.e.e.d(k[i3]);
                            }else {
                               return;
                            }
                         }
                      }else if(i8 && i10){
                         if (h.c != null && i2.c != null) {
                            x = b.X;
                            i6 = h.l.get(i).g + h.f;
                            i12 = i2.l.get(i).g - i2.f;
                            if (y != i4 && y != null) {
                               if (y == i3) {
                                  i1 = uocp7.g((i12 - i6), i);
                                  i6 = (int)(((float)i1 / x) + f);
                                  i4 = uocp7.g(i6, i3);
                                  if (i6 != i4) {
                                     i1 = (int)(((float)i4 * x) + f);
                                  }
                                  e.d(i1);
                                  uocp7.b.e.e.d(i4);
                               }
                            }else {
                               i1 = uocp7.g((i12 - i6), i);
                               i6 = (int)(((float)i1 * x) + f);
                               i4 = uocp7.g(i6, i3);
                               if (i6 != i4) {
                                  i1 = (int)(((float)i4 / x) + f);
                               }
                               e.d(i1);
                               uocp7.b.e.e.d(i4);
                            }
                         }else {
                            return;
                         }
                      }else if(i9 && i11){
                         if (h1.c != null && i7.c != null) {
                            x = b.X;
                            i8 = h1.l.get(i).g + h1.f;
                            i12 = i7.l.get(i).g - i7.f;
                            if (y != i4) {
                               if (y != null) {
                                  if (y == i3) {
                                  label_026a :
                                     i1 = uocp7.g((i12 - i8), i3);
                                     i6 = (int)(((float)i1 / x) + f);
                                     i4 = uocp7.g(i6, i);
                                     if (i6 != i4) {
                                        i1 = (int)(((float)i4 * x) + f);
                                     }
                                     e.d(i4);
                                     uocp7.b.e.e.d(i1);
                                  }
                               }else {
                                  i1 = uocp7.g((i12 - i8), i3);
                                  i6 = (int)(((float)i1 * x) + f);
                                  i4 = uocp7.g(i6, i);
                                  if (i6 != i4) {
                                     i1 = (int)(((float)i4 / x) + f);
                                  }
                                  e.d(i4);
                                  uocp7.b.e.e.d(i1);
                               }
                            }else {
                               goto label_026a ;
                            }
                         }else {
                            return;
                         }
                      }
                   }
                }
             }else if((y = b.U) != null){
                b1 = y.d.e;
                if (b1.j != null) {
                   e.d((int)(((float)b1.g * b.w) + f));
                }
             }
          }
          if (h.c != null && i2.c != null) {
             if (h.j != null && (i2.j != null && e.j != null)) {
                return;
             }else {
                p91 l = h.l;
                p91 l1 = i2.l;
                if (e.j == null && uocp7.d == 3) {
                   b1 = uocp7.b;
                   if (b1.r == null && !b1.y()) {
                      i1 = l.get(i).g + h.f;
                      i = l1.get(i).g + i2.f;
                      h.d(i1);
                      i2.d(i);
                      e.d((i - i1));
                      return;
                   }
                }
                if (e.j == null && (uocp7.d == 3 && (uocp7.a == i3 && (l.size() > 0 && l1.size() > 0)))) {
                   cp7 b2 = uocp7.b;
                   wq0 v = b2.v;
                   i1 = Math.max(b2.u, Math.min(((l1.get(i).g + i2.f) - (l.get(i).g + h.f)), e.m));
                   if (v > null) {
                      i1 = Math.min(v, i1);
                   }
                   e.d(i1);
                }
                if (e.j == null) {
                   return;
                }else {
                   p91 op91 = l.get(i);
                   p91 op911 = l1.get(i);
                   l = op91.g;
                   i3 = h.f + l;
                   l1 = op911.g;
                   i4 = i2.f + l1;
                   wq0 e0 = uocp7.b.e0;
                   if (op91 == op911) {
                      e0 = 0x3f000000;
                   }else {
                      i5 = i3;
                      i6 = i4;
                   }
                   h.d((int)(((float)((l1 - l) - e.g) * e0) + ((float)l + f)));
                   i2.d((h.g + e.g));
                }
             }
          }
          return;
       }else {
          e = uocp7.b;
          uocp7.l(e.I, e.K, i);
          return;
       }
    }
    public final void d(){
       wq0 u;
       int i4;
       wq0 q;
       cq0 f;
       p91 op91;
       object oobject1;
       wq0 r;
       wq0 q1;
       cq0 f1;
       wq0 e;
       int i5;
       cp7 tb = this.b;
       cp7 te = this.e;
       if (tb.a != null) {
          te.d(tb.r());
       }
       cp7 ti = this.i;
       cp7 th = this.h;
       int i = 1;
       int i1 = 4;
       int i2 = 3;
       if (te.j == null) {
          tb = this.b;
          int i3 = tb.T[0];
          this.d = i3;
          if (i3 != i2) {
             if (i3 == i1 && ((u = tb.U) != null && ((i4 = u.T[0]) == i && i4 != i1))) {
                cp7.b(th, u.d.h, this.b.I.e());
                cp7.b(ti, u.d.i, (- this.b.K.e()));
                te.d(((u.r() - this.b.I.e()) - this.b.K.e()));
                return;
             }else if(i3 == i){
                te.d(tb.r());
             }
          }
       }else if(this.d == i1){
          tb = this.b;
          if ((r = tb.U) != null && ((i5 = r.T[0]) == i && i5 != i1)) {
             cp7.b(th, r.d.h, tb.I.e());
             cp7.b(ti, r.d.i, (- this.b.K.e()));
             return;
          }
       }
       if (te.j != null) {
          tb = this.b;
          if (tb.a != null) {
             q = tb.Q;
             object oobject = q[0];
             if ((f = oobject.f) != null && q[i].f != null) {
                if (tb.y()) {
                   th.f = this.b.Q[0].e();
                   ti.f = - this.b.Q[i].e();
                }else if((op91 = cp7.h(this.b.Q[0])) != null){
                   cp7.b(th, op91, this.b.Q[0].e());
                }
                if ((op91 = cp7.h(this.b.Q[i])) != null) {
                   cp7.b(ti, op91, (- this.b.Q[i].e()));
                }
                th.b = i;
                ti.b = i;
             }else if(f != null){
                if ((op91 = cp7.h(oobject)) != null) {
                   cp7.b(th, op91, this.b.Q[0].e());
                   cp7.b(ti, th, te.g);
                }
             }else {
                oobject1 = q[i];
                if (oobject1.f != null) {
                   if ((op91 = cp7.h(oobject1)) != null) {
                      cp7.b(ti, op91, (- this.b.Q[i].e()));
                      cp7.b(th, ti, (- te.g));
                   }
                }else if(!tb instanceof qp2 && (tb.U != null && tb.j(bq0.w).f == null)){
                   tb = this.b;
                   cp7.b(th, tb.U.d.h, tb.s());
                   cp7.b(ti, th, te.g);
                }
             }
          }else if(this.d == i2){
             tb = this.b;
             r = tb.r;
             p91 k = te.k;
             p91 l = te.l;
             if (r != 2) {
                if (r == i2) {
                   if (tb.s == i2) {
                      th.a = this;
                      ti.a = this;
                      q1 = tb.e;
                      q1.h.a = this;
                      q1.i.a = this;
                      te.a = this;
                      if (tb.z()) {
                         l.add(this.b.e.e);
                         this.b.e.e.k.add(te);
                         e = this.b.e;
                         e.e.a = this;
                         l.add(e.h);
                         l.add(this.b.e.i);
                         this.b.e.h.k.add(te);
                         this.b.e.i.k.add(te);
                      }else if(this.b.y()){
                         this.b.e.e.l.add(te);
                         k.add(this.b.e.e);
                      }else {
                         this.b.e.e.l.add(te);
                      }
                   }else {
                      tb = tb.e.e;
                      l.add(tb);
                      tb.k.add(te);
                      this.b.e.h.k.add(te);
                      this.b.e.i.k.add(te);
                      te.b = i;
                      k.add(th);
                      k.add(ti);
                      th.l.add(te);
                      ti.l.add(te);
                   }
                }
             }else if((e = tb.U) == null){
                tb = e.e.e;
                l.add(tb);
                tb.k.add(te);
                te.b = i;
                k.add(th);
                k.add(ti);
             }
          }
          tb = this.b;
          q1 = tb.Q;
          object oobject2 = q1[0];
          if ((f1 = oobject2.f) != null && q1[i].f != null) {
             if (tb.y()) {
                th.f = this.b.Q[0].e();
                ti.f = - this.b.Q[i].e();
             }else {
                op91 = cp7.h(this.b.Q[0]);
                p91 op911 = cp7.h(this.b.Q[i]);
                if (op91 != null) {
                   op91.b(this);
                }
                if (op911 != null) {
                   op911.b(this);
                }
                this.j = i1;
             }
          }else if(f1 != null){
             if ((op91 = cp7.h(oobject2)) != null) {
                cp7.b(th, op91, this.b.Q[0].e());
                this.c(ti, th, i, te);
             }
          }else {
             oobject1 = q1[i];
             if (oobject1.f != null) {
                if ((op91 = cp7.h(oobject1)) != null) {
                   cp7.b(ti, op91, (- this.b.Q[i].e()));
                   this.c(th, ti, -1, te);
                }
             }else if(!tb instanceof qp2 && (q = tb.U) != null){
                cp7.b(th, q.d.h, tb.s());
                this.c(ti, th, i, te);
             }
          }
       }else {
       }
       return;
    }
    public final void e(){
       cp7 th = this.h;
       if (th.j != null) {
          this.b.Z = th.g;
       }
       return;
    }
    public final void f(){
       this.c = null;
       this.h.c();
       this.i.c();
       this.e.c();
       this.g = false;
    }
    public final boolean k(){
       if (this.d != 3) {
          return true;
       }
       if (this.b.r == null) {
          return true;
       }
       return false;
    }
    public final void n(){
       this.g = false;
       cp7 th = this.h;
       th.c();
       th.j = false;
       th = this.i;
       th.c();
       th.j = false;
       this.e.j = false;
    }
    public final String toString(){
       return "HorizontalRun "+this.b.i0;
    }
}
