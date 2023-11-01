package p.nd0;
import p.cp7;
import p.wq0;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;
import p.xq0;
import p.l91;
import p.p91;
import p.kb1;
import java.lang.Math;
import p.cq0;
import java.lang.String;
import java.lang.StringBuilder;

public final class nd0 extends cp7	// class@001fb3 from classes.dex
{
    public final ArrayList k;
    public int l;

    public void nd0(int p0,wq0 p1){
       cp7 tf1;
       super(p1);
       this.k = new ArrayList();
       this.f = p0;
       cp7 tb = this.b;
       for (wq0 owq0 = tb.n(p0); owq0 != null; owq0 = owq0.n(this.f)) {
          tb = owq0;
       }
       this.b = tb;
       cp7 tf = this.f;
       int i = 0;
       if (tf == null) {
          owq0 = tb.d;
       }else if(tf == 1){
          owq0 = tb.e;
       }else {
          owq0 = i;
       }
       nd0 tk = this.k;
       tk.add(owq0);
       for (owq0 = tb.m(this.f); owq0 != null; owq0 = owq0.m(this.f)) {
          if ((tb = this.f) == null) {
             tb = owq0.d;
          }else if(tb == 1){
             tb = owq0.e;
          }else {
             tb = i;
          }
          tk.add(tb);
       }
       Iterator iterator = tk.iterator();
       while (iterator.hasNext()) {
          tb = iterator.next();
          if ((tf1 = this.f) == null) {
             tb.b = this;
          }else if(tf1 == 1){
             tb.c = this;
          }
       }
       iterator = (this.f == null && this.b.U.v0 != null)? 1: 0;
       if (iterator && tk.size() > 1) {
          this.b = tk.get((tk.size() - 1)).b;
       }
       owq0 = (this.f == null)? this.b.j0: this.b.k0;
       this.l = owq0;
       return;
    }
    public final void a(l91 p0){
       int i8;
       float f;
       nd0 obj;
       nd0 ond0;
       int i12;
       cp7 e;
       p91 op91;
       int i13;
       p91 op911;
       int i14;
       int i15;
       nd0 obj1;
       cp7 b1;
       int i16;
       xq0 oxq0;
       float f3;
       int i17;
       wq0 v;
       wq0 u1;
       int i18;
       int i19;
       cp7 uocp71;
       p91 g1;
       cp7 uocp7 = this;
       cp7 h = uocp7.h;
       if (h.j != null) {
          cp7 i = uocp7.i;
          if (i.j != null) {
             wq0 u = uocp7.b.U;
             xq0 v0 = (u instanceof xq0)? u.v0: null;
             int i1 = i.g - h.g;
             nd0 k = uocp7.k;
             int i2 = k.size();
             int i3 = 0;
             while (true) {
                int i4 = -1;
                int i5 = 8;
                if (i3 < i2) {
                   if (k.get(i3).b.h0 == i5) {
                      i3 = i3 + 1;
                   }else {
                   label_003f :
                      int i6 = i2 - 1;
                      int i7 = i6;
                      while (i7 >= 0) {
                         if (k.get(i7).b.h0 == i5) {
                            i7 = i7 - 1;
                         }else {
                            i4 = i7;
                         }
                      }
                      i7 = 0;
                      while (true) {
                         if (i7 < 2) {
                            i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            f = 0;
                            while (true) {
                               if (i9 < i2) {
                                  obj = k.get(i9);
                                  cp7 b = obj.b;
                                  ond0 = k;
                                  if (b.h0 == i5) {
                                     i12 = i3;
                                  }else {
                                     i11 = i11 + 1;
                                     if (i9 > 0 && i9 >= i3) {
                                        i8 = i8 + obj.h.f;
                                     }
                                     e = obj.e;
                                     op91 = e.g;
                                     i12 = i3;
                                     i3 = (obj.d != 3)? 1: 0;
                                     if (i3) {
                                        if ((e = uocp7.f) == null && b.d.e.j == null) {
                                           return;
                                        }else if(e == 1 && b.e.e.j == null){
                                           return;
                                        }else {
                                           i13 = i3;
                                        }
                                     }else {
                                        i13 = i3;
                                        if (obj.a == 1 && !i7) {
                                           op911 = e.m;
                                           i10 = i10 + 1;
                                        }else if(e.j != null){
                                           op911 = op91;
                                        }
                                        i13 = 1;
                                     label_00c8 :
                                        if (!i13) {
                                           i10 = i10 + 1;
                                           i14 = b.l0[uocp7.f];
                                           if ((0 - i14) >= 0) {
                                              f = f + i14;
                                           }
                                        }else {
                                           i8 = i8 + op911;
                                        }
                                        if (i9 < i6 && i9 < i4) {
                                           i14 = - obj.i.f;
                                           i8 = i8 + i14;
                                        }
                                     }
                                     op911 = op91;
                                     goto label_00c8 ;
                                  }
                                  i9 = i9 + 1;
                                  k = ond0;
                                  i3 = i12;
                                  i5 = 8;
                               }else {
                                  ond0 = k;
                                  i12 = i3;
                                  if (i8 >= i1 && i10) {
                                     i7 = i7 + 1;
                                     k = ond0;
                                     i3 = i12;
                                     u1 = 8;
                                  }else {
                                     i14 = i10;
                                     i15 = i11;
                                  label_0110 :
                                     p91 g = h.g;
                                     if (v0 != null) {
                                        g = i.g;
                                     }
                                     float f1 = 0x3f000000;
                                     if (i8 > i1) {
                                        i3 = (int)(((float)(i8 - i1) / 2.00f) + f1);
                                        g = (v0 != null)? g + i3: g - i3;
                                     }
                                     if (i14 > 0) {
                                        float f2 = (float)(i1 - i8);
                                        i5 = (int)((f2 / (float)i14) + f1);
                                        i7 = 0;
                                        i9 = 0;
                                        while (i7 < i2) {
                                           obj = ond0;
                                           obj1 = obj.get(i7);
                                           i10 = i5;
                                           b1 = obj1.b;
                                           i16 = i8;
                                           op91 = g;
                                           if (b1.h0 != 8 && obj1.d == 3) {
                                              h = obj1.e;
                                              if (h.j == null) {
                                                 if ((0 - f) > 0) {
                                                    oxq0 = v0;
                                                    float f4 = b1.l0[uocp7.f] * f2;
                                                    f4 = f4 / f;
                                                    f4 = f4 + 0x3f000000;
                                                    i17 = (int)f4;
                                                 }else {
                                                    oxq0 = v0;
                                                    i17 = i10;
                                                 }
                                                 if (uocp7.f == null) {
                                                    v = b1.v;
                                                    u1 = b1.u;
                                                 }else {
                                                    v = b1.y;
                                                    u1 = b1.x;
                                                 }
                                                 f3 = f2;
                                                 i18 = (obj1.a == 1)? Math.min(i17, h.m): i17;
                                                 i18 = Math.max(u1, i18);
                                                 if (v > null) {
                                                    i18 = Math.min(v, i18);
                                                 }
                                                 if (i18 != i17) {
                                                    i9 = i9 + 1;
                                                    i17 = i18;
                                                 }
                                                 h.d(i17);
                                              label_01a6 :
                                                 i7 = i7 + 1;
                                                 i5 = i10;
                                                 i8 = i16;
                                                 g = op91;
                                                 v0 = oxq0;
                                                 f2 = f3;
                                                 ond0 = obj;
                                              }
                                           }
                                           oxq0 = v0;
                                           f3 = f2;
                                           goto label_01a6 ;
                                        }
                                        op91 = g;
                                        oxq0 = v0;
                                        obj = ond0;
                                        i16 = i8;
                                        if (i9 > 0) {
                                           i14 = i14 - i9;
                                           i19 = 0;
                                           i18 = 0;
                                           while (i19 < i2) {
                                              uocp71 = obj.get(i19);
                                              if (uocp71.b.h0 == 8) {
                                                 i3 = i12;
                                              }else {
                                                 i3 = i12;
                                                 if (i19 > 0 && i19 >= i3) {
                                                    i18 = i18 + uocp71.h.f;
                                                 }
                                                 i18 = i18 + uocp71.e.g;
                                                 if (i19 < i6 && i19 < i4) {
                                                    i17 = - uocp71.i.f;
                                                    i18 = i18 + i17;
                                                 }
                                              }
                                              i19 = i19 + 1;
                                              i12 = i3;
                                           }
                                           i3 = i12;
                                           i8 = i18;
                                        }else {
                                           i3 = i12;
                                           i8 = i16;
                                        }
                                        i18 = 2;
                                        if (uocp7.l == i18 && !i9) {
                                           uocp7.l = 0;
                                        }else {
                                           i19 = 0;
                                        }
                                     }else {
                                        op91 = g;
                                        oxq0 = v0;
                                        obj = ond0;
                                        i3 = i12;
                                        i18 = 2;
                                        i16 = i8;
                                     }
                                     if (i8 > i1) {
                                        uocp7.l = i18;
                                     }
                                     if (i15 > 0 && (!i14 && i3 == i4)) {
                                        uocp7.l = i18;
                                     }
                                     obj1 = uocp7.l;
                                     i17 = 1;
                                     if (obj1 == i17) {
                                        if (i15 > i17) {
                                           i1 = (i1 - i8) / (i15 - i17);
                                        }else if(i15 == i17){
                                           i1 = (i1 - i8) / 2;
                                        }else {
                                           i1 = 0;
                                        }
                                        if (i14 > 0) {
                                           i1 = 0;
                                        }
                                        g = op91;
                                        i14 = 0;
                                        while (i14 < i2) {
                                           if (oxq0 != null) {
                                              i18 = i14 + 1;
                                              i18 = i2 - i18;
                                           }else {
                                              i18 = i14;
                                           }
                                           i = obj.get(i18);
                                           e = i.i;
                                           b1 = i.h;
                                           if (i.b.h0 == 8) {
                                              b1.d(g);
                                              e.d(g);
                                           }else if(i14 > 0){
                                              i19 = (oxq0 != null)? g - i1: g + i1;
                                           }
                                           if (i14 > 0 && i14 >= i3) {
                                              i19 = (oxq0 != null)? i19 - b1.f: i19 + b1.f;
                                           }
                                           if (oxq0 != null) {
                                              e.d(i19);
                                           }else {
                                              b1.d(i19);
                                           }
                                           uocp71 = i.e;
                                           g1 = uocp71.g;
                                           if (i.d == 3 && i.a == 1) {
                                              g1 = uocp71.m;
                                           }
                                           i19 = (oxq0 != null)? i19 - g1: i19 + g1;
                                           if (oxq0 != null) {
                                              b1.d(i19);
                                           }else {
                                              e.d(i19);
                                           }
                                           i.g = true;
                                           if (i14 < i6 && i14 < i4) {
                                              if (oxq0 != null) {
                                                 i18 = - e.f;
                                                 i19 = i19 - i18;
                                              }else {
                                                 i18 = - e.f;
                                                 i19 = i19 + i18;
                                              }
                                           }
                                           i14 = i14 + 1;
                                        }
                                     }else if(obj1 == null){
                                        i1 = (i1 - i8) / (i15 + 1);
                                        if (i14 > 0) {
                                           i1 = 0;
                                        }
                                        g = op91;
                                        i14 = 0;
                                        while (i14 < i2) {
                                           if (oxq0 != null) {
                                              i18 = i14 + 1;
                                              i18 = i2 - i18;
                                           }else {
                                              i18 = i14;
                                           }
                                           i = obj.get(i18);
                                           e = i.i;
                                           b1 = i.h;
                                           if (i.b.h0 == 8) {
                                              b1.d(g);
                                              e.d(g);
                                           }else if(oxq0 != null){
                                              i19 = g - i1;
                                           }else {
                                              i19 = g + i1;
                                           }
                                           if (i14 > 0 && i14 >= i3) {
                                              i19 = (oxq0 != null)? i19 - b1.f: i19 + b1.f;
                                           }
                                           if (oxq0 != null) {
                                              e.d(i19);
                                           }else {
                                              b1.d(i19);
                                           }
                                           uocp71 = i.e;
                                           g1 = uocp71.g;
                                           if (i.d == 3 && i.a == 1) {
                                              i7 = Math.min(g1, uocp71.m);
                                           }
                                           i19 = (oxq0 != null)? i19 - i7: i19 + i7;
                                           if (oxq0 != null) {
                                              b1.d(i19);
                                           }else {
                                              e.d(i19);
                                           }
                                           if (i14 < i6 && i14 < i4) {
                                              if (oxq0 != null) {
                                                 i18 = - e.f;
                                                 i19 = i19 - i18;
                                              }else {
                                                 i18 = - e.f;
                                                 i19 = i19 + i18;
                                              }
                                           }
                                           i14 = i14 + 1;
                                        }
                                     }else if(obj1 == 2){
                                        wq0 e0 = (uocp7.f == null)? uocp7.b.e0: uocp7.b.f0;
                                        if (oxq0 != null) {
                                           e0 = 0x3f800000 - e0;
                                        }
                                        if ((i18 = (int)(((float)(i1 - i8) * e0) + 0x3f000000)) < 0 || i14 > 0) {
                                           i18 = 0;
                                        }
                                        i18 = (oxq0 != null)? op91 - i18: op91 + i18;
                                        i14 = 0;
                                        while (i14 < i2) {
                                           if (oxq0 != null) {
                                              i19 = i14 + 1;
                                              i19 = i2 - i19;
                                           }else {
                                              i19 = i14;
                                           }
                                           h = obj.get(i19);
                                           cp7 i20 = h.i;
                                           e = h.h;
                                           if (h.b.h0 == 8) {
                                              e.d(i18);
                                              i20.d(i18);
                                              i9 = 3;
                                           }else if(i14 > 0 && i14 >= i3){
                                              i18 = (oxq0 != null)? i18 - e.f: i18 + e.f;
                                           }
                                           if (oxq0 != null) {
                                              i20.d(i18);
                                           }else {
                                              e.d(i18);
                                           }
                                           uocp71 = h.e;
                                           g1 = uocp71.g;
                                           if (h.d == 3) {
                                              if (h.a == 1) {
                                                 kb1 m = uocp71.m;
                                              }
                                           }else {
                                              v = 1;
                                           }
                                           i18 = (oxq0 != null)? i18 - m: i18 + m;
                                           if (oxq0 != null) {
                                              e.d(i18);
                                           }else {
                                              i20.d(i18);
                                           }
                                           if (i14 < i6 && i14 < i4) {
                                              if (oxq0 != null) {
                                                 i19 = - i20.f;
                                                 i18 = i18 - i19;
                                              }else {
                                                 i19 = - i20.f;
                                                 i18 = i18 + i19;
                                              }
                                           }
                                           i14 = i14 + 1;
                                        }
                                     }
                                  }
                               }
                            }
                         }else {
                            ond0 = k;
                            i12 = i3;
                            i14 = 0;
                            i15 = 0;
                            i8 = 0;
                            f = 0;
                            goto label_0110 ;
                         }
                      }
                   }
                }else {
                   i3 = -1;
                   goto label_003f ;
                }
             }
          }
       }
       return;
    }
    public final void d(){
       wq0 i3;
       wq0 k;
       wq0 owq0;
       p91 op911;
       int i4;
       wq0 owq01;
       nd0 tk = this.k;
       Iterator iterator = tk.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       int i = tk.size();
       int i1 = 1;
       if (i < i1) {
          return;
       }
       int i2 = 0;
       cp7 b = tk.get(i2).b;
       cp7 b1 = tk.get((i - i1)).b;
       cp7 ti = this.i;
       cp7 th = this.h;
       if (this.f == null) {
          i3 = b.I;
          k = b1.K;
          p91 op91 = cp7.i(i3, i2);
          i = i3.e();
          if ((owq0 = this.m()) != null) {
             i = owq0.I.e();
          }
          if (op91 != null) {
             cp7.b(th, op91, i);
          }
          op911 = cp7.i(k, i2);
          i4 = k.e();
          if ((owq01 = this.n()) != null) {
             i4 = owq01.K.e();
          }
          if (op911 != null) {
             cp7.b(ti, op911, (- i4));
          }
       }else {
          i3 = b.J;
          k = b1.L;
          p91 op912 = cp7.i(i3, i1);
          i = i3.e();
          if ((owq0 = this.m()) != null) {
             i = owq0.J.e();
          }
          if (op912 != null) {
             cp7.b(th, op912, i);
          }
          op911 = cp7.i(k, i1);
          i4 = k.e();
          if ((owq01 = this.n()) != null) {
             i4 = owq01.L.e();
          }
          if (op911 != null) {
             cp7.b(ti, op911, (- i4));
          }
       }
       th.a = this;
       ti.a = this;
       return;
    }
    public final void e(){
       int i = 0;
       while (true) {
          nd0 tk = this.k;
          if (i < tk.size()) {
             tk.get(i).e();
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final void f(){
       this.c = null;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public final long j(){
       nd0 tk = this.k;
       int i = tk.size();
       long l = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          cp7 uocp7 = tk.get(i1);
          l = l + (long)uocp7.h.f;
          long l1 = uocp7.j() + l;
          l = (long)uocp7.i.f + l1;
       }
       return l;
    }
    public final boolean k(){
       nd0 tk = this.k;
       int i = tk.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!tk.get(i1).k()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public final wq0 m(){
       cp7 b;
       int i = 0;
       while (true) {
          nd0 tk = this.k;
          if (i >= tk.size()) {
             return null;
          }
          b = tk.get(i).b;
          if (b.h0 != 8) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return b;
    }
    public final wq0 n(){
       cp7 b;
       nd0 tk = this.k;
       int i = tk.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          b = tk.get(i).b;
          if (b.h0 != 8) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return b;
    }
    public final String toString(){
       StringBuilder str = "ChainRun ";
       String str1 = (this.f == null)? "horizontal : ": "vertical : ";
       str = str+str1;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          str = str.append("<").append(iterator.next()).append("> ");
       }
       return str;
    }
}
