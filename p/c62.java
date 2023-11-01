package p.c62;
import p.sp2;
import p.b00;
import java.util.ArrayList;
import p.wq0;
import p.xq0;
import p.jn2;
import p.iq0;
import p.b62;
import p.cq0;
import java.lang.Object;
import java.lang.Math;
import java.util.Arrays;
import p.vk3;

public final class c62 extends sp2	// class@0011a4 from classes.dex
{
    public int A0;
    public final b00 B0;
    public iq0 C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public final ArrayList W0;
    public wq0[] X0;
    public wq0[] Y0;
    public int[] Z0;
    public wq0[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    public void c62(){
       super();
       this.s0 = 0;
       this.t0 = 0;
       this.u0 = 0;
       this.v0 = 0;
       this.w0 = 0;
       this.x0 = 0;
       this.y0 = false;
       this.z0 = 0;
       this.A0 = 0;
       this.B0 = new b00();
       this.C0 = null;
       this.D0 = -1;
       this.E0 = -1;
       this.F0 = -1;
       this.G0 = -1;
       this.H0 = -1;
       this.I0 = -1;
       this.J0 = 0x3f000000;
       this.K0 = 0x3f000000;
       this.L0 = 0x3f000000;
       this.M0 = 0x3f000000;
       this.N0 = 0x3f000000;
       this.O0 = 0x3f000000;
       this.P0 = 0;
       this.Q0 = 0;
       this.R0 = 2;
       this.S0 = 2;
       this.T0 = 0;
       this.U0 = -1;
       this.V0 = 0;
       this.W0 = new ArrayList();
       this.X0 = null;
       this.Y0 = null;
       this.Z0 = null;
       this.b1 = 0;
    }
    public final int S(int p0,wq0 p1){
       wq0 s;
       if (p1 == null) {
          return 0;
       }
       wq0 t = p1.T;
       int i = 3;
       if (t[1] == i) {
          if ((s = p1.s) == null) {
             return 0;
          }else if(s == 2){
             if ((p0 = (int)(p1.z * (float)p0)) != p1.l()) {
                p1.g = true;
                this.V(p1, t[0], p1.r(), 1, p0);
             }
             return p0;
          }else if(s == 1){
             return p1.l();
          }else if(s == i){
             return (int)(((float)p1.r() * p1.X) + 0x3f000000);
          }
       }
       return p1.l();
    }
    public final int T(int p0,wq0 p1){
       wq0 r;
       int i = 0;
       if (p1 == null) {
          return i;
       }
       wq0 t = p1.T;
       if (t[i] == 3) {
          if ((r = p1.r) == null) {
             return i;
          }else if(r == 2){
             if ((p0 = (int)(p1.w * (float)p0)) != p1.r()) {
                p1.g = true;
                this.V(p1, 1, p0, t[1], p1.l());
             }
             return p0;
          }else if(r == true){
             return p1.r();
          }else if(r == 3){
             return (int)(((float)p1.l() * p1.X) + 0x3f000000);
          }
       }
       return p1.r();
    }
    public final void U(int p0,int p1,int p2,int p3){
       wq0 u;
       c62 v0;
       int i5;
       int i6;
       object oobject;
       int[] ointArray1;
       c62 uoc62;
       c62 uoc621;
       c62 uoc622;
       c62 uoc623;
       sp2 osp22;
       boolean i10;
       int i11;
       wq0 owq01;
       wq0 owq02;
       wq0 owq03;
       c62 uoc624;
       sp2 osp23;
       b62 uob62;
       object oobject1;
       int i13;
       int i14;
       c62 u01;
       object oobject3;
       wq0 owq04;
       int i15;
       c62 t02;
       b62 uob622;
       int i16;
       c62 uoc625;
       wq0 owq05;
       wq0 owq06;
       c62 uoc626;
       Object obj;
       int i17;
       c62 uoc627;
       int i18;
       sp2 osp24;
       object oobject4;
       int[] ointArray2;
       sp2 osp25;
       int[] ointArray4;
       wq0[] owq0Array;
       int i19;
       object oobject5;
       object oobject6;
       float f1;
       sp2 osp2 = this;
       int i = 2;
       int i1 = 3;
       int i2 = 1;
       int i3 = 0;
       if (osp2.r0 > null) {
          xq0 u0 = ((u = osp2.U) != null)? u.u0: null;
          if (u0 == null) {
             u0 = 0;
          }else {
             i6 = 0;
             while (i6 < osp2.r0) {
                if ((oobject = osp2.q0[i6]) != null && !oobject instanceof jn2) {
                   i10 = oobject.k(i3);
                   i5 = oobject.k(i2);
                   uoc625 = (i10 == i1 && (oobject.r != i2 && (i5 == i1 && oobject.s != i2)))? 1: 0;
                   if (!uoc625) {
                      if (i10 == i1) {
                         i10 = 2;
                      }
                      if (i5 == i1) {
                         i5 = 2;
                      }
                      uoc625 = osp2.B0;
                      uoc625.a = i10;
                      uoc625.b = i5;
                      uoc625.c = oobject.r();
                      uoc625.d = oobject.l();
                      u0.b(oobject, uoc625);
                      oobject.O(uoc625.e);
                      oobject.L(uoc625.f);
                      b00 g = uoc625.g;
                      oobject.b0 = g;
                      i10 = (g > null)? true: false;
                      oobject.E = i10;
                   }
                }
                i6 = i6 + 1;
             }
             f1 = 1;
          }
          if (!u0) {
             osp2.z0 = i3;
             osp2.A0 = i3;
             osp2.y0 = i3;
             return;
          }
       }
       c62 w0 = osp2.w0;
       c62 x0 = osp2.x0;
       c62 s0 = osp2.s0;
       c62 t0 = osp2.t0;
       int[] ointArray = new int[i];
       int i4 = (p1 - w0) - x0;
       if ((v0 = osp2.V0) == i2) {
          i4 = (p3 - s0) - t0;
       }
       i5 = i4;
       i4 = -1;
       if (v0 == null) {
          if (osp2.D0 == i4) {
             osp2.D0 = i3;
          }
          if (osp2.E0 == i4) {
             osp2.E0 = i3;
          }
       }else if(osp2.D0 == i4){
          osp2.D0 = i3;
       }
       if (osp2.E0 == i4) {
          osp2.E0 = i3;
       }
       sp2 q0 = osp2.q0;
       i6 = 0;
       int i7 = 0;
       while (true) {
          sp2 r0 = osp2.r0;
          c62 int i8 = 8;
          if (i6 < r0) {
             if (osp2.q0[i6].h0 == i8) {
                i7 = i7 + 1;
             }
             i6 = i6 + 1;
          }else if(i7 > 0){
             q0 = new wq0[(r0 - i7)];
             i6 = 0;
             r0 = 0;
             while (i6 < osp2.r0) {
                oobject = osp2.q0[i6];
                if (oobject.h0 != i8) {
                   q0[r0] = oobject;
                   r0 = r0 + 1;
                }
                i6 = i6 + 1;
                i3 = 0;
             }
          }
          sp2 osp21 = q0;
          osp2.a1 = osp21;
          osp2.b1 = r0;
          c62 t01 = osp2.T0;
          c62 w01 = osp2.W0;
          if (t01 != null) {
             wq0 j = osp2.J;
             wq0 i9 = osp2.I;
             wq0 k = osp2.K;
             wq0 owq0 = osp2.L;
             wq0 t = osp2.T;
             if (t01 != i2) {
                if (t01 != 2) {
                   if (t01 == 3) {
                      c62 v01 = osp2.V0;
                      if (r0) {
                         w01.clear();
                         owq01 = i9;
                         owq02 = j;
                         owq03 = k;
                         uoc624 = w01;
                         uoc621 = w0;
                         osp23 = r0;
                         int i12 = i5;
                         ointArray1 = ointArray;
                         uoc62 = t0;
                         uob62 = new b62(this, v01, osp2.I, osp2.J, osp2.K, osp2.L, i12);
                         uoc624.add(uob62);
                         if (v01 == null) {
                            i8 = 0;
                            i6 = 0;
                            i7 = 0;
                            i12 = 0;
                            while (i12 < osp23) {
                               i8 = i8 + 1;
                               oobject1 = osp21[i12];
                               i5 = i12;
                               i13 = osp2.T(i5, oobject1);
                               object oobject2 = oobject1;
                               if (oobject1.T[0] == 3) {
                                  i6 = i6 + 1;
                               }
                               i14 = i6;
                               if (i7 != i5) {
                                  i6 = osp2.P0 + i7;
                                  if ((i6 = i6 + i13) <= i5) {
                                  label_0177 :
                                     j = 0;
                                  label_0178 :
                                     if (!j && (i12 > 0 && ((u01 = osp2.U0) > null && i8 > u01))) {
                                        j = 1;
                                     }
                                     if (j) {
                                        uob62 = oobject1;
                                        i12 = i5;
                                        uoc622 = x0;
                                        uoc623 = s0;
                                        oobject3 = oobject2;
                                        b62 uob621 = oobject1;
                                        owq04 = t;
                                        i = i12;
                                        uob62 = new b62(this, v01, osp2.I, osp2.J, osp2.K, osp2.L, i12);
                                        uob621.n = i;
                                        uoc624.add(uob621);
                                        uob62 = uob621;
                                        i7 = i13;
                                        i8 = 1;
                                     }else {
                                        i12 = i5;
                                        uoc622 = x0;
                                        uoc623 = s0;
                                        oobject3 = oobject2;
                                        owq04 = t;
                                        if ((i = i12) > 0) {
                                           i6 = osp2.P0 + i13;
                                           i6 = i6 + i7;
                                           i7 = i6;
                                        }else {
                                           i7 = i13;
                                        }
                                     }
                                     uob62.a(oobject3);
                                     i12 = i + 1;
                                     i6 = i14;
                                     t = owq04;
                                     x0 = uoc622;
                                     s0 = uoc623;
                                  }
                               }
                               if (uob62.b != null) {
                                  j = 1;
                                  goto label_0178 ;
                               }else {
                                  goto label_0177 ;
                               }
                            }
                            owq04 = t;
                            uoc622 = x0;
                            uoc623 = s0;
                            i15 = i12;
                         }else {
                            owq04 = t;
                            uoc622 = x0;
                            uoc623 = s0;
                            i8 = 0;
                            i6 = 0;
                            i7 = 0;
                            i = 0;
                            while (i < osp23) {
                               i6 = i6 + 1;
                               oobject3 = osp21[i];
                               i15 = i12;
                               i13 = osp2.S(i15, oobject3);
                               if (oobject3.T[1] == 3) {
                                  i8++;
                               }
                               i14 = i8;
                               if (i7 != i15) {
                                  i8 = osp2.Q0 + i7;
                                  if ((i8 = i8 + i13) <= i15) {
                                  label_0215 :
                                     i8 = 0;
                                  label_0216 :
                                     if (!i8 && (i > 0 && ((u01 = osp2.U0) > null && i6 > u01))) {
                                        i8 = 1;
                                     }
                                     if (i8) {
                                        uob62 = t0;
                                        osp24 = osp21;
                                        b62 uob623 = t0;
                                        uob62 = new b62(this, v01, osp2.I, osp2.J, osp2.K, osp2.L, i15);
                                        uob623.n = i;
                                        uoc624.add(uob623);
                                        uob62 = uob623;
                                        i7 = i13;
                                        i6 = 1;
                                     }else {
                                        osp24 = osp21;
                                        if (i > 0) {
                                           i8 = osp2.Q0 + i13;
                                           i8 = i8 + i7;
                                           i7 = i8;
                                        }else {
                                           i7 = i13;
                                        }
                                     }
                                     uob62.a(oobject3);
                                     i = i + 1;
                                     i8 = i14;
                                     osp21 = osp24;
                                     i12 = i15;
                                  }
                               }
                               if (uob62.b != null) {
                                  i8 = 1;
                                  goto label_0216 ;
                               }else {
                                  goto label_0215 ;
                               }
                            }
                            i15 = i12;
                            i6 = i8;
                         }
                         i4 = uoc624.size();
                         i8 = osp2.w0;
                         w01 = osp2.s0;
                         u01 = osp2.x0;
                         t02 = osp2.t0;
                         oobject1 = 2;
                         uoc625 = (owq04[0] != oobject1 && owq04[1] != oobject1)? 0: 1;
                         if (i6 > 0 && oobject1) {
                            i6 = 0;
                            while (i6 < i4) {
                               uob622 = uoc624.get(i6);
                               if (v01 == null) {
                                  i16 = i15 - uob622.d();
                                  uob622.e(i16);
                               }else {
                                  i16 = i15 - uob622.c();
                                  uob622.e(i16);
                               }
                               i6 = i6 + 1;
                            }
                         }
                         uoc625 = w01;
                         j = owq02;
                         owq05 = owq0;
                         owq06 = owq03;
                         i = 0;
                         i3 = 0;
                         w01 = i8;
                         i9 = owq01;
                         for (i16 = 0; i16 < i4; i4 = i18) {
                            uoc626 = t02;
                            obj = uoc624.get(i16);
                            if (v01 == null) {
                               i17 = i4 - 1;
                               if (i16 < i17) {
                                  i17 = i16 + 1;
                                  owq05 = uoc624.get(i17).b.J;
                                  uoc627 = uoc624;
                                  uoc626 = 0;
                               }else {
                                  uoc627 = uoc624;
                                  uoc626 = osp2.t0;
                                  owq05 = owq0;
                               }
                               k = obj.b.L;
                               obj.f(v01, i9, j, owq06, owq05, w01, uoc625, u01, uoc626, i15);
                               i6 = Math.max(i, obj.d());
                               i5 = obj.c() + i3;
                               if (i16 > 0) {
                                  i5 = i5 + osp2.Q0;
                               }
                               i = i6;
                               i3 = i5;
                               j = k;
                               t02 = uoc626;
                               uoc624 = uoc627;
                               uoc625 = 0;
                               i18 = i4;
                            }else {
                               uoc627 = uoc624;
                               i10 = i4 - 1;
                               if (i16 < i10) {
                                  i10 = i16 + 1;
                                  uoc624 = uoc627;
                                  i18 = i4;
                                  owq06 = uoc624.get(i10).b.I;
                                  u01 = 0;
                               }else {
                                  uoc624 = uoc627;
                                  u01 = osp2.x0;
                                  i18 = i4;
                                  owq06 = owq03;
                               }
                               u = obj.b.K;
                               obj.f(v01, i9, j, owq06, owq05, w01, uoc625, u01, uoc626, i15);
                               i8 = obj.d() + i;
                               i7 = Math.max(i3, obj.c());
                               if (i16 > 0) {
                                  i8 = i8 + osp2.P0;
                               }
                               i = i8;
                               i3 = i7;
                               t02 = uoc626;
                               w01 = 0;
                               i9 = u;
                            }
                            i16 = i16 + 1;
                         }
                         ointArray1[0] = i;
                         ointArray1[1] = i3;
                      }
                   }
                   ointArray1 = ointArray;
                   uoc62 = t0;
                   uoc621 = w0;
                   uoc622 = x0;
                   uoc623 = s0;
                }else {
                   ointArray1 = ointArray;
                   uoc62 = t0;
                   osp24 = osp21;
                   uoc621 = w0;
                   uoc622 = x0;
                   uoc623 = s0;
                   osp23 = r0;
                   i15 = i5;
                   if ((t01 = osp2.V0) == null) {
                      if ((i8 = osp2.U0) <= null) {
                         i8 = 0;
                         i6 = 0;
                         i7 = 0;
                         while (i8 < osp23) {
                            if (i8 > 0) {
                               i6 = i6 + osp2.P0;
                            }
                            if ((oobject4 = osp24[i8]) != null) {
                               if ((i10 = osp2.T(i15, oobject4) + i6) > i15) {
                                  break ;
                               }else {
                                  i7 = i7 + 1;
                                  i6 = i10;
                               }
                            }
                            i8 = i8 + 1;
                         }
                         i8 = i7;
                      }
                      v0 = i8;
                      i8 = 0;
                   }else if((i8 = osp2.U0) <= null){
                      i8 = 0;
                      i6 = 0;
                      i7 = 0;
                      while (i8 < osp23) {
                         if (i8 > 0) {
                            i6 = i6 + osp2.Q0;
                         }
                         if ((oobject4 = osp24[i8]) != null) {
                            if ((i10 = osp2.S(i15, oobject4) + i6) > i15) {
                               break ;
                            }else {
                               i7 = i7 + 1;
                               i6 = i10;
                            }
                         }
                         i8 = i8 + 1;
                      }
                      i8 = i7;
                   }
                   v0 = null;
                   if (osp2.Z0 == null) {
                      ointArray2 = new int[2];
                      osp2.Z0 = ointArray2;
                   }
                   if (!i8 && (t01 == 1 || (v0 == null && t01 == null))) {
                      i7 = p2;
                      i10 = p3;
                      t02 = t01;
                      uoc625 = i8;
                      t0 = v0;
                      osp25 = osp2;
                      osp22 = osp25;
                      osp21 = osp24;
                      int[] ointArray3 = ointArray1;
                      x0 = uoc622;
                      i8 = p0;
                      i6 = p1;
                   label_0512 :
                      i4 = i8;
                      i8 = i6;
                      i6 = i7;
                      i7 = i10;
                      u01 = t02;
                      t02 = uoc625;
                      uoc625 = t0;
                      ointArray4 = ointArray1;
                      ointArray1 = ointArray3;
                      ointArray3 = 1;
                      while (true) {
                         if (!ointArray3) {
                            if (u01 == null) {
                               p0 = i4;
                               float f = (float)osp23 / (float)uoc625;
                               p1 = i8;
                               i5 = (int)Math.ceil((double)f);
                            }else {
                               p0 = i4;
                               p1 = i8;
                               f1 = (float)osp23 / (float)t02;
                               i11 = (int)Math.ceil((double)f1);
                            }
                            if ((t01 = osp25.Y0) != null && t01.length >= uoc625) {
                               Arrays.fill(t01, null);
                            }else {
                               owq0Array = new wq0[uoc625];
                               osp25.Y0 = owq0Array;
                            }
                            if ((t01 = osp25.X0) != null && t01.length >= i5) {
                               Arrays.fill(t01, null);
                            }else {
                               owq0Array = new wq0[i5];
                               osp25.X0 = owq0Array;
                            }
                            for (i4 = 0; i4 < uoc625; i4 = i4 + 1) {
                               i8 = 0;
                               while (i8 < i5) {
                                  i19 = i8 * uoc625;
                                  i19 = i19 + i4;
                                  p2 = i6;
                                  if (u01 == 1) {
                                     i6 = i4 * i5;
                                     i19 = i6 + i8;
                                  }
                                  p3 = i7;
                                  if ((i6 = i19) >= osp21.length || (oobject5 = osp21[i6]) == null) {
                                     i19 = ointArray3;
                                  }else {
                                     i7 = osp25.T(i15, oobject5);
                                     i19 = ointArray3;
                                     if ((oobject6 = osp25.Y0[i4]) == null || oobject6.r() < i7) {
                                        osp25.Y0[i4] = oobject5;
                                     }
                                     i7 = osp25.S(i15, oobject5);
                                     if ((oobject6 = osp25.X0[i8]) == null || oobject6.l() < i7) {
                                        osp25.X0[i8] = oobject5;
                                     }
                                  }
                                  i8 = i8 + 1;
                                  i6 = p2;
                                  i7 = p3;
                                  i = i19;
                               }
                            }
                            p2 = i6;
                            p3 = i7;
                            i19 = ointArray3;
                            i4 = 0;
                            i8 = 0;
                            while (i4 < uoc625) {
                               if ((oobject5 = osp25.Y0[i4]) != null) {
                                  if (i4 > 0) {
                                     i8 = i8 + osp25.P0;
                                  }
                                  i6 = osp25.T(i15, oobject5) + i8;
                                  i8 = i6;
                               }
                               i4 = i4 + 1;
                            }
                            i4 = 0;
                            i6 = 0;
                            while (i4 < i5) {
                               if ((oobject = osp25.X0[i4]) != null) {
                                  if (i4 > 0) {
                                     i6 = i6 + osp25.Q0;
                                  }
                                  i7 = osp25.S(i15, oobject) + i6;
                                  i6 = i7;
                               }
                               i4 = i4 + 1;
                            }
                            ointArray4[0] = i8;
                            i4 = 1;
                            ointArray4[i4] = i6;
                            if (u01 == null) {
                               if (i8 > i15 && uoc625 > i4) {
                                  i11 = uoc625 - 1;
                               label_04f7 :
                                  i4 = p0;
                                  i8 = p1;
                                  i6 = p2;
                                  i7 = p3;
                                  i = i19;
                               }
                            }else if(i6 > i15 && i5 > i4){
                               i5 = i5 - 1;
                               goto label_04f7 ;
                            }
                            i8 = p0;
                            i6 = p1;
                            i7 = p2;
                            ointArray3 = ointArray1;
                            ointArray1 = ointArray4;
                            t0 = uoc625;
                            uoc625 = i5;
                            t02 = u01;
                            i10 = p3;
                            goto label_0512 ;
                         }else {
                            i8 = osp25.Z0;
                            i8[0] = uoc625;
                            i8[1] = t02;
                            i4 = i4;
                            i8 = i8;
                            i6 = i6;
                            w0 = uoc621;
                            ointArray = ointArray1;
                            t0 = uoc62;
                         label_0774 :
                            s0 = uoc623;
                            i10 = i7;
                            i7 = i6;
                            i6 = i8;
                            i8 = 1;
                         label_0806 :
                            i5 = (ointArray[0] + w0) + x0;
                            i11 = (ointArray[i8] + s0) + t0;
                            if (i4 == 0x40000000) {
                               i4 = i6;
                            }else if(i4 == Integer.MIN_VALUE){
                               i4 = Math.min(i5, i6);
                            }else if(!i4){
                               i4 = i5;
                            }else {
                               i4 = 0;
                            }
                            if (i7 == 0x40000000) {
                               i6 = i10;
                            }else if(i7 == Integer.MIN_VALUE){
                               i6 = Math.min(i11, i10);
                            }else if(!i7){
                               i6 = i11;
                            }else {
                               i6 = 0;
                            }
                            osp22.z0 = i4;
                            osp22.A0 = i6;
                            osp22.O(i4);
                            osp22.L(i6);
                            if (osp22.r0 <= null) {
                               i8 = false;
                               break ;
                            }
                            break ;
                         }
                      }
                      osp22.y0 = i8;
                      return;
                   }else {
                      i7 = p3;
                      u01 = t01;
                      t02 = i8;
                      uoc625 = v0;
                      osp25 = osp2;
                      osp22 = osp25;
                      osp21 = osp24;
                      ointArray4 = ointArray1;
                      x0 = uoc622;
                      oobject6 = 0;
                      i4 = p0;
                      i8 = p1;
                      i6 = p2;
                   }
                }
             }else {
                owq01 = i9;
                owq02 = j;
                ointArray1 = ointArray;
                uoc62 = t0;
                owq04 = t;
                owq03 = k;
                osp24 = osp21;
                uoc621 = w0;
                uoc622 = x0;
                uoc623 = s0;
                uoc624 = w01;
                osp23 = r0;
                i15 = i5;
                c62 v02 = osp2.V0;
                if (osp23 != null) {
                   uoc624.clear();
                   uob62 = new b62(this, v02, osp2.I, osp2.J, osp2.K, osp2.L, i15);
                   uoc624.add(i2);
                   if (v02 == null) {
                      i4 = 0;
                      i8 = 0;
                      i3 = 0;
                      while (i3 < osp23) {
                         oobject3 = osp24[i3];
                         i13 = osp2.T(i15, oobject3);
                         if (oobject3.T[0] == 3) {
                            i4 = i4 + 1;
                         }
                         i14 = i4;
                         if (i8 != i15) {
                            i4 = osp2.P0 + i8;
                            if ((i4 = i4 + i13) <= i15) {
                            label_059b :
                               f1 = 0;
                            label_059c :
                               if (!f1 && (i3 > 0 && ((v0 = osp2.U0) > null && !(i6 = i3 % v0)))) {
                                  f1 = 1;
                               }
                               if (f1) {
                                  uob62 = new b62(this, v02, osp2.I, osp2.J, osp2.K, osp2.L, i15);
                                  i2.n = i3;
                                  uoc624.add(i2);
                               }else if(i3 > 0){
                                  i4 = osp2.P0 + i13;
                                  i4 = i4 + i8;
                                  i8 = i4;
                               label_05ce :
                                  i2.a(oobject3);
                                  i3 = i3 + 1;
                                  i4 = i14;
                               }
                               i8 = i13;
                               goto label_05ce ;
                            }
                         }
                         if (i2.b != null) {
                            f1 = 1;
                            goto label_059c ;
                         }else {
                            goto label_059b ;
                         }
                      }
                   }else {
                      i4 = 0;
                      i8 = 0;
                      i3 = 0;
                      while (i3 < osp23) {
                         oobject3 = osp24[i3];
                         i13 = osp2.S(i15, oobject3);
                         if (oobject3.T[1] == 3) {
                            i4 = i4 + 1;
                         }
                         i19 = i4;
                         if (i8 != i15) {
                            i4 = osp2.Q0 + i8;
                            if ((i4 = i4 + i13) <= i15) {
                            label_05fc :
                               f1 = 0;
                            label_05fd :
                               if (!f1 && (i3 > 0 && ((v0 = osp2.U0) > null && !(i6 = i3 % v0)))) {
                                  f1 = 1;
                               }
                               if (f1) {
                                  uob62 = new b62(this, v02, osp2.I, osp2.J, osp2.K, osp2.L, i15);
                                  i2.n = i3;
                                  uoc624.add(i2);
                               }else if(i3 > 0){
                                  i4 = osp2.Q0 + i13;
                                  i4 = i4 + i8;
                                  i8 = i4;
                               label_0633 :
                                  i2.a(oobject3);
                                  i3 = i3 + 1;
                                  i4 = i19;
                               }
                               i8 = i13;
                               goto label_0633 ;
                            }
                         }
                         if (i2.b != null) {
                            f1 = 1;
                            goto label_05fd ;
                         }else {
                            goto label_05fc ;
                         }
                      }
                   }
                   i8 = uoc624.size();
                   v02 = osp2.w0;
                   w01 = osp2.s0;
                   u01 = osp2.x0;
                   t02 = osp2.t0;
                   uoc625 = 2;
                   uoc625 = (owq04[0] != uoc625 && owq04[1] != uoc625)? 0: 1;
                   if (i4 > 0 && uoc625) {
                      i4 = 0;
                      while (i4 < i8) {
                         uob622 = uoc624.get(i4);
                         if (v02 == null) {
                            i16 = i15 - uob622.d();
                            uob622.e(i16);
                         }else {
                            i16 = i15 - uob622.c();
                            uob622.e(i16);
                         }
                         i4 = i4 + 1;
                      }
                   }
                   uoc625 = w01;
                   u = owq01;
                   owq05 = owq0;
                   owq06 = owq03;
                   i2 = 0;
                   i3 = 0;
                   w01 = v02;
                   j = owq02;
                   for (i16 = 0; i16 < i8; i8 = i18) {
                      uoc626 = t02;
                      obj = uoc624.get(i16);
                      if (v02 == null) {
                         i17 = i8 - 1;
                         if (i16 < i17) {
                            i17 = i16 + 1;
                            owq05 = uoc624.get(i17).b.J;
                            uoc627 = uoc624;
                            osp24 = 0;
                         }else {
                            uoc627 = uoc624;
                            uoc626 = osp2.t0;
                            owq05 = owq0;
                         }
                         k = obj.b.L;
                         obj.f(v02, u, j, owq06, owq05, w01, uoc625, u01, osp24, i15);
                         i6 = Math.max(i2, obj.d());
                         i5 = obj.c() + i3;
                         if (i16 > 0) {
                            i5 = i5 + osp2.Q0;
                         }
                         i2 = i6;
                         i3 = i5;
                         j = k;
                         t02 = osp24;
                         uoc624 = uoc627;
                         uoc625 = 0;
                         i18 = i8;
                      }else {
                         uoc627 = uoc624;
                         i10 = i8 - 1;
                         if (i16 < i10) {
                            i10 = i16 + 1;
                            uoc624 = uoc627;
                            i18 = i8;
                            owq06 = uoc624.get(i10).b.I;
                            oobject4 = 0;
                         }else {
                            uoc624 = uoc627;
                            u01 = osp2.x0;
                            i18 = i8;
                            owq06 = owq03;
                         }
                         i9 = obj.b.K;
                         obj.f(v02, u, j, owq06, owq05, w01, uoc625, oobject4, uoc626, i15);
                         i4 = obj.d() + i2;
                         i7 = Math.max(i3, obj.c());
                         if (i16 > 0) {
                            i4 = i4 + osp2.P0;
                         }
                         i2 = i4;
                         u = i9;
                         i3 = i7;
                         t02 = uoc626;
                         ointArray2 = 0;
                      }
                      i16 = i16 + 1;
                   }
                   ointArray1[0] = i2;
                   ointArray1[1] = i3;
                }
             }
          }else {
             uoc624 = w01;
             ointArray1 = ointArray;
             uoc62 = t0;
             osp24 = osp21;
             uoc621 = w0;
             uoc622 = x0;
             uoc623 = s0;
             osp23 = r0;
             i15 = i5;
             v0 = osp2.V0;
             if (osp23 != null) {
                if (!uoc624.size()) {
                   uob62 = new b62(this, v0, osp2.I, osp2.J, osp2.K, osp2.L, i15);
                   uoc624.add(i);
                }else {
                   b62 uob624 = uoc624.get(0);
                   uob624.c = 0;
                   uob624.b = null;
                   uob624.l = 0;
                   uob624.m = 0;
                   uob624.n = 0;
                   uob624.o = 0;
                   uob624.p = 0;
                   uob624.f(v0, osp2.I, osp2.J, osp2.K, osp2.L, osp2.w0, osp2.s0, osp2.x0, osp2.t0, i15);
                }
                for (i4 = 0; i4 < osp23; i4 = i4 + 1) {
                   i.a(osp24[i4]);
                }
                i14 = 0;
                ointArray1[i14] = i.d();
                i8 = 1;
                ointArray1[i8] = i.c();
                i4 = p0;
                i6 = p1;
                i7 = p2;
                i10 = p3;
                osp22 = osp2;
                w0 = uoc621;
                ointArray = ointArray1;
                t0 = uoc62;
                x0 = uoc622;
                s0 = uoc623;
                goto label_0806 ;
             }
          }
          i4 = p0;
          i8 = p1;
          i6 = p2;
          i7 = p3;
          osp22 = osp2;
          w0 = uoc621;
          ointArray = ointArray1;
          t0 = uoc62;
          x0 = uoc622;
          goto label_0774 ;
       }
    }
    public final void V(wq0 p0,int p1,int p2,int p3,int p4){
       c62 tC0;
       wq0 tU;
       while ((tC0 = this.C0) == null && (tU = this.U) != null) {
          this.C0 = tU.u0;
       }
       c62 tB0 = this.B0;
       tB0.a = p1;
       tB0.b = p3;
       tB0.c = p2;
       tB0.d = p4;
       tC0.b(p0, tB0);
       p0.O(tB0.e);
       p0.L(tB0.f);
       p0.E = tB0.h;
       b00 g = tB0.g;
       p0.b0 = g;
       boolean b = (g > null)? true: false;
       p0.E = b;
       return;
    }
    public final void a(){
       object oobject;
       int i = 0;
       while (i < this.r0) {
          if ((oobject = this.q0[i]) != null) {
             oobject.F = true;
          }
          i = i + 1;
       }
       return;
    }
    public final void c(vk3 p0,boolean p1){
       wq0 tU;
       int i;
       int i1;
       b62 uob62;
       boolean i2;
       int i4;
       float f;
       object oobject;
       object oobject1;
       super.c(p0, p1);
       int b = ((tU = this.U) != null && tU.v0 != null)? true: false;
       c62 tT0 = this.T0;
       c62 tW0 = this.W0;
       if (tT0 != null) {
          if (tT0 != 1) {
             if (tT0 != 2) {
                if (tT0 == 3) {
                   i = tW0.size();
                   for (i1 = 0; i1 < i; i1 = i1 + 1) {
                      uob62 = tW0.get(i1);
                      i2 = i - 1;
                      i2 = (i1 == i2)? true: false;
                      uob62.b(i1, b, i2);
                   }
                }
             }else if(this.Z0 != null && (this.Y0 != null && this.X0 != null)){
                for (i = 0; i < this.b1; i = i + 1) {
                   this.a1[i].E();
                }
                tT0 = this.Z0;
                int i3 = tT0[0];
                i = tT0[1];
                c62 tJ0 = this.J0;
                wq0 owq0 = null;
                i2 = 0;
                while (true) {
                   i4 = 8;
                   if (i2 < i3) {
                      if (b) {
                         i1 = i3 - i2;
                         i1 = i1 - 1;
                         f = 0x3f800000 - this.J0;
                      }else {
                         f = tJ0;
                         i1 = i2;
                      }
                      if ((oobject = this.Y0[i1]) != null && oobject.h0 != i4) {
                         wq0 i5 = oobject.I;
                         if (!i2) {
                            oobject.g(i5, this.I, this.w0);
                            oobject.j0 = this.D0;
                            oobject.e0 = f;
                         }
                         int i6 = i3 - 1;
                         if (i2 == i6) {
                            oobject.g(oobject.K, this.K, this.x0);
                         }
                         if (i2 > 0 && owq0 != null) {
                            wq0 k = owq0.K;
                            oobject.g(i5, k, this.P0);
                            owq0.g(k, i5, false);
                         }
                         owq0 = oobject;
                      }
                      i2 = i2 + 1;
                      tJ0 = f;
                   }else {
                      break ;
                   }
                }
                b = 0;
                while (b < i) {
                   if ((oobject = this.X0[b]) != null && oobject.h0 != i4) {
                      wq0 j = oobject.J;
                      if (!b) {
                         oobject.g(j, this.J, this.s0);
                         oobject.k0 = this.E0;
                         oobject.f0 = this.K0;
                      }
                      int i7 = i - 1;
                      if (b == i7) {
                         oobject.g(oobject.L, this.L, this.t0);
                      }
                      if (b > 0 && owq0 != null) {
                         wq0 l = owq0.L;
                         oobject.g(j, l, this.Q0);
                         owq0.g(l, j, false);
                      }
                      owq0 = oobject;
                   }
                   b++;
                }
                b = 0;
                while (b < i3) {
                   i1 = 0;
                   while (i1 < i) {
                      int i8 = i1 * i3;
                      i8 = i8 + b;
                      if (this.V0 == 1) {
                         i8 = b * i;
                         i8 = i8 + i1;
                      }
                      c62 ta1 = this.a1;
                      if (i8 < ta1.length && ((oobject1 = ta1[i8]) != null && oobject1.h0 != i4)) {
                         object oobject2 = this.Y0[b];
                         object oobject3 = this.X0[i1];
                         if (oobject1 != oobject2) {
                            oobject1.g(oobject1.I, oobject2.I, false);
                            oobject1.g(oobject1.K, oobject2.K, false);
                         }
                         if (oobject1 != oobject3) {
                            oobject1.g(oobject1.J, oobject3.J, false);
                            oobject1.g(oobject1.L, oobject3.L, false);
                         }
                      }
                      i1 = i1 + 1;
                   }
                   b++;
                }
             }
          }else {
             i = tW0.size();
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                uob62 = tW0.get(i1);
                i2 = i - 1;
                i2 = (i1 == i2)? true: false;
                uob62.b(i1, b, i2);
             }
          }
       }else if(tW0.size() > 0){
          tW0.get(false).b(false, b, 1);
       }
       this.y0 = false;
       return;
    }
}
