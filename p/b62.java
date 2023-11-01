package p.b62;
import p.c62;
import p.cq0;
import java.lang.Object;
import p.wq0;

public final class b62	// class@001060 from classes.dex
{
    public int a;
    public wq0 b;
    public int c;
    public cq0 d;
    public cq0 e;
    public cq0 f;
    public cq0 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final c62 r;

    public void b62(c62 p0,int p1,cq0 p2,cq0 p3,cq0 p4,cq0 p5,int p6){
       this.r = p0;
       super();
       this.b = null;
       this.c = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.a = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p0.w0;
       this.i = p0.s0;
       this.j = p0.x0;
       this.k = p0.t0;
       this.q = p6;
    }
    public final void a(wq0 p0){
       int i3;
       c62 p0;
       int i = 8;
       int i1 = 3;
       int i2 = 0;
       b62 tr = this.r;
       if (this.a == null) {
          i3 = tr.T(this.q, p0);
          if (p0.T[i2] == i1) {
             this.p = this.p + 1;
             i3 = 0;
          }
          p0 = tr.P0;
          if (p0.h0 != i) {
             i2 = p0;
          }
          this.l = (i3 + i2) + this.l;
          i3 = tr.S(this.q, p0);
          if (this.b == null || this.c < i3) {
             this.b = p0;
             this.c = i3;
             this.m = i3;
          }
       }else {
          i3 = tr.T(this.q, p0);
          int i4 = tr.S(this.q, p0);
          if (p0.T[1] == i1) {
             this.p = this.p + 1;
             i4 = 0;
          }
          p0 = tr.Q0;
          if (p0.h0 != i) {
             i2 = p0;
          }
          this.m = (i4 + i2) + this.m;
          if (this.b == null || this.c < i3) {
             this.b = p0;
             this.c = i3;
             this.l = i3;
          }
       }
       this.o = this.o + 1;
       return;
    }
    public final void b(int p0,boolean p1,boolean p2){
       int i2;
       int i7;
       int i8;
       b62 b;
       wq0 j;
       int i11;
       b62 uob621;
       wq0 owq0;
       int i12;
       int i13;
       object oobject;
       b62 uob622;
       c62 uoc62;
       float f1;
       float f2;
       wq0 k;
       c62 s0;
       wq0 j1;
       object oobject1;
       c62 k0;
       c62 g0;
       int i17;
       object oobject2;
       object oobject3;
       b62 uob62 = this;
       b62 o = uob62.o;
       int i = 0;
       int i1 = 0;
       while (true) {
          b62 r = uob62.r;
          if (i1 < o && (i2 = uob62.n + i1) < r.b1) {
             if ((oobject3 = r.a1[i2]) != null) {
                oobject3.E();
             }
             i1 = i1 + 1;
          }else if(o != null && uob62.b != null){
             i2 = (p2 && !p0)? 1: 0;
             int i3 = -1;
             int i4 = 0;
             int i5 = -1;
             int i6 = -1;
             while (i4 < o) {
                if (p1) {
                   i7 = o - 1;
                   i7 = i7 - i4;
                }else {
                   i7 = i4;
                }
                if ((i8 = uob62.n + i7) >= r.b1) {
                   break ;
                }else if((oobject2 = r.a1[i8]) != null && oobject2.h0 == null){
                   if (i5 == i3) {
                      i5 = i4;
                   }
                   i6 = i4;
                }
                i4 = i4 + 1;
             }
             if (uob62.a == null) {
                b = uob62.b;
                b.k0 = r.E0;
                b62 i9 = uob62.i;
                if (p0 > 0) {
                   i8 = i9 + r.Q0;
                }
                j = b.J;
                j.a(uob62.e, i8);
                wq0 l = b.L;
                if (p2) {
                   l.a(uob62.g, uob62.k);
                }
                if (p0 > 0) {
                   uob62.e.d.L.a(j, i);
                }
                if (r.S0 == 3 && b.E == null) {
                   int i10 = 0;
                   while (true) {
                      if (i10 < o) {
                         if (p1) {
                            i11 = o - 1;
                            i11 = i11 - i10;
                         }else {
                            i11 = i10;
                         }
                         if ((i7 = uob62.n + i11) < r.b1) {
                            uob621 = r.a1[i7];
                            if (uob621.E != null) {
                               break ;
                            }else {
                               i10 = i10 + 1;
                            }
                         }
                      }
                   }
                   owq0 = null;
                   i11 = 0;
                   while (i11 < o) {
                      if (p1) {
                         i12 = o - 1;
                         i12 = i12 - i11;
                      }else {
                         i12 = i11;
                      }
                      if ((i13 = uob62.n + i12) < r.b1) {
                         if ((oobject = r.a1[i13]) == null) {
                            uob622 = o;
                            i = 3;
                         }else {
                            wq0 i14 = oobject.I;
                            if (!i11) {
                               oobject.g(i14, uob62.d, uob62.h);
                            }
                            if (!i12) {
                               c62 d0 = r.D0;
                               float f = 0x3f800000;
                               if (p1) {
                                  uoc62 = d0;
                                  f1 = f - r.J0;
                               }else {
                                  uoc62 = d0;
                                  f1 = r.J0;
                               }
                               if (uob62.n == null) {
                                  c62 f0 = r.F0;
                                  f2 = f1;
                                  if (f0 != -1) {
                                     f1 = (p1)? 0x3f800000 - r.L0: r.L0;
                                     f = f1;
                                     d0 = f0;
                                  }else if(p2 && (d0 = r.H0) != -1){
                                     f = (p1)? 0x3f800000 - r.N0: r.N0;
                                  }else {
                                     d0 = uoc62;
                                     f = f2;
                                  }
                               }else {
                                  f2 = f1;
                               }
                               oobject.j0 = d0;
                               oobject.e0 = f;
                            }
                            i = o - 1;
                            if (i11 == i) {
                               uob622 = o;
                               oobject.g(oobject.K, uob62.f, uob62.j);
                            }else {
                               uob622 = o;
                            }
                            if (owq0 != null) {
                               k = owq0.K;
                               i14.a(k, r.P0);
                               if (i11 == i5) {
                                  o = uob62.h;
                                  if (i14.h()) {
                                     i14.h = o;
                                  }
                               }
                               k.a(i14, 0);
                               i3 = i6 + 1;
                               if (i11 == i3) {
                                  o = uob62.j;
                                  if (k.h()) {
                                     k.h = o;
                                  }
                               }
                            }
                            if (oobject != b) {
                               if ((s0 = r.S0) == 3 && (uob621.E != null && (oobject != uob621 && oobject.E != null))) {
                                  oobject.M.a(uob621.M, 0);
                               }else {
                                  j1 = oobject.J;
                                  if (s0 != null) {
                                     owq0 = oobject.L;
                                     if (s0 != 1) {
                                        if (i2) {
                                           j1.a(uob62.e, uob62.i);
                                           owq0.a(uob62.g, uob62.k);
                                        }else {
                                           int i15 = 0;
                                           j1.a(j, i15);
                                           owq0.a(l, i15);
                                        }
                                     }else {
                                        owq0.a(l, 0);
                                     }
                                  }else {
                                     j1.a(j, 0);
                                  }
                               }
                            }else {
                               k = 3;
                            }
                            owq0 = oobject;
                         }
                         i11 = i11 + 1;
                         o = uob622;
                         i13 = 3;
                      }
                   }
                }
                uob621 = b;
             }else {
                uob622 = o;
                o = uob62.b;
                o.j0 = r.D0;
                b62 h = uob62.h;
                if (p0 > 0) {
                   h = h + r.P0;
                }
                wq0 k1 = o.K;
                j1 = o.I;
                if (p1) {
                   k1.a(uob62.f, h);
                   if (p2) {
                      j1.a(uob62.d, uob62.j);
                   }
                   if (p0 > 0) {
                      uob62.f.d.I.a(k1, 0);
                   }
                }else {
                   j1.a(uob62.d, h);
                   if (p2) {
                      k1.a(uob62.f, uob62.j);
                   }
                   if (p0 > 0) {
                      uob62.d.d.K.a(j1, 0);
                   }
                }
                b = uob622;
                i = 0;
                wq0 owq01 = null;
                while (i < b && (i8 = uob62.n + i) < r.b1) {
                   if ((oobject1 = r.a1[i8]) == null) {
                      oobject1 = owq01;
                   label_02ca :
                      owq01 = 0;
                   label_02cb :
                      i11 = 1;
                   }else {
                      owq0 = oobject1.J;
                      if (!i) {
                         oobject1.g(owq0, uob62.e, uob62.i);
                         c62 e0 = r.E0;
                         k0 = r.K0;
                         if (uob62.n == null) {
                            g0 = r.G0;
                            uoc62 = e0;
                            e0 = -1;
                            if (g0 != e0) {
                               k0 = r.M0;
                            }else if(p2 && (g0 = r.I0) != e0){
                               k0 = r.O0;
                            }else {
                               g0 = uoc62;
                            }
                         }else {
                            uoc62 = e0;
                            i17 = -1;
                         }
                         oobject1.k0 = g0;
                         oobject1.f0 = k0;
                      }else {
                         i17 = -1;
                      }
                      i13 = b - 1;
                      if (i == i13) {
                         oobject1.g(oobject1.L, uob62.g, uob62.k);
                      }
                      if (owq01 != null) {
                         owq01 = owq01.L;
                         owq0.a(owq01, r.Q0);
                         if (i == i5) {
                            b62 i16 = uob62.i;
                            if (owq0.h()) {
                               owq0.h = i16;
                            }
                         }
                         owq01.a(owq0, 0);
                         i17 = i6 + 1;
                         if (i == i17) {
                            b62 k2 = uob62.k;
                            if (owq01.h()) {
                               owq01.h = k2;
                            }
                         }
                      }
                      if (oobject1 != o) {
                         owq01 = 2;
                         owq0 = oobject1.K;
                         j = oobject1.I;
                         if (p1) {
                            if ((k0 = r.R0) != null) {
                               if (k0 != 1) {
                                  if (k0 != owq01) {
                                     goto label_02ca ;
                                  }else {
                                     i7 = 0;
                                     j.a(j1, i7);
                                     owq0.a(k1, i7);
                                     goto label_02cb ;
                                  }
                               }else {
                                  j.a(j1, 0);
                                  goto label_02cb ;
                               }
                            }else {
                               owq0.a(k1, 0);
                               goto label_02cb ;
                            }
                         }else if((k0 = r.R0) != null){
                            if (k0 != 1) {
                               if (k0 == owq01) {
                                  if (i2) {
                                     j.a(uob62.d, uob62.h);
                                     owq0.a(uob62.f, uob62.j);
                                  }else {
                                     i7 = 0;
                                     j.a(j1, i7);
                                     owq0.a(k1, i7);
                                  }
                               }
                               owq01 = 0;
                            }else {
                               owq0.a(k1, 0);
                            }
                         }else {
                            j.a(j1, 0);
                         }
                      }else {
                         goto label_02ca ;
                      }
                   }
                   i = i + 1;
                   owq01 = oobject1;
                }
             }
          }
          return;
       }
    }
    public final int c(){
       if (this.a == 1) {
          return (this.m - this.r.Q0);
       }
       return this.m;
    }
    public final int d(){
       if (this.a == null) {
          return (this.l - this.r.P0);
       }
       return this.l;
    }
    public final void e(int p0){
       b62 tp;
       b62 tr;
       int i1;
       object oobject;
       int i3;
       int i4;
       int i5;
       c62 q0;
       wq0 t;
       if ((tp = this.p) == null) {
          return;
       }
       b62 to = this.o;
       c62 p0 = p0 / tp;
       int i = 0;
       while (true) {
          tr = this.r;
          if (i < to && (i1 = this.n + i) < tr.b1) {
             oobject = tr.a1[i1];
             i3 = 1;
             i5 = 1;
             q0 = 3;
             if (this.a == null) {
                if (oobject != null) {
                   t = oobject.T;
                   if (t[0] == q0 && oobject.r == null) {
                      tr.V(oobject, i3, p0, t[i5], oobject.l());
                   }
                }
             }else if(oobject != null){
                t = oobject.T;
                if (t[i5] == q0 && oobject.s == null) {
                   tr.V(oobject, t[0], oobject.r(), 1, p0);
                }
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       this.l = 0;
       this.m = 0;
       this.b = null;
       this.c = 0;
       b62 to1 = this.o;
       int i2 = 0;
       while (i2 < to1 && (i1 = this.n + i2) < tr.b1) {
          oobject = tr.a1[i1];
          i3 = 8;
          if (this.a == null) {
             i4 = oobject.r();
             p0 = tr.P0;
             if (oobject.h0 == i3) {
                p0 = 0;
             }
             i4 = i4 + p0;
             i4 = i4 + this.l;
             this.l = i4;
             i4 = tr.S(this.q, oobject);
             if (this.b == null || this.c < i4) {
                this.b = oobject;
                this.c = i4;
                this.m = i4;
             }
          }else {
             i4 = tr.T(this.q, oobject);
             i5 = tr.S(this.q, oobject);
             q0 = tr.Q0;
             if (oobject.h0 == i3) {
                q0 = 0;
             }
             i5 = i5 + q0;
             i5 = i5 + this.m;
             this.m = i5;
             if (this.b == null || this.c < i4) {
                this.b = oobject;
                this.c = i4;
                this.l = i4;
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public final void f(int p0,cq0 p1,cq0 p2,cq0 p3,cq0 p4,int p5,int p6,int p7,int p8,int p9){
       this.a = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       this.q = p9;
    }
}
