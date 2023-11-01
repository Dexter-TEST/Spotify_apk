package p.xq0;
import p.ap7;
import p.t63;
import p.o91;
import p.vk3;
import p.md0;
import java.util.HashSet;
import p.b00;
import p.wq0;
import p.iq0;
import p.jn2;
import p.mx;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Math;
import p.xe7;
import p.cq0;
import p.ty0;
import p.c62;
import p.w51;
import p.sp2;
import java.util.Iterator;
import p.bp7;
import p.bq0;
import java.lang.Class;
import java.lang.ref.Reference;
import p.fn6;
import java.lang.Throwable;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.PrintStream;
import p.oy6;
import java.util.Arrays;
import p.ye7;
import p.cp7;
import p.kb1;
import p.p91;
import p.nd0;

public final class xq0 extends ap7	// class@002cc6 from classes.dex
{
    public int A0;
    public md0[] B0;
    public md0[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final b00 L0;
    public final t63 r0;
    public final o91 s0;
    public int t0;
    public iq0 u0;
    public boolean v0;
    public final vk3 w0;
    public int x0;
    public int y0;
    public int z0;

    public void xq0(){
       super();
       this.r0 = new t63(this);
       this.s0 = new o91(this);
       this.u0 = null;
       this.v0 = false;
       this.w0 = new vk3();
       this.z0 = 0;
       this.A0 = 0;
       md0[] omd0Array = new md0[4];
       this.B0 = omd0Array;
       md0[] omd0Array1 = new md0[4];
       this.C0 = omd0Array1;
       this.D0 = 257;
       this.E0 = false;
       this.F0 = false;
       this.G0 = null;
       this.H0 = null;
       this.I0 = null;
       this.J0 = null;
       this.K0 = new HashSet();
       this.L0 = new b00();
    }
    public static void V(wq0 p0,iq0 p1,b00 p2){
       b00 c;
       b00 d;
       if (p1 == null) {
          return;
       }
       if (p0.h0 != 8 && (!p0 instanceof jn2 && !p0 instanceof mx)) {
          wq0 t = p0.T;
          p2.a = t[0];
          int i = 1;
          p2.b = t[i];
          p2.c = p0.r();
          p2.d = p0.l();
          p2.i = false;
          p2.j = 0;
          int i1 = 3;
          t = (p2.a == i1)? 1: 0;
          i1 = (p2.b == i1)? 1: 0;
          int i2 = 0;
          int i3 = (t && (i2 - p0.X) > 0)? 1: 0;
          i2 = (i1 && (i2 - p0.X) > 0)? 1: 0;
          if (t && (p0.u(0) && (p0.r == null && !i3))) {
             p2.a = 2;
             if (i1 && p0.s == null) {
                p2.a = i;
             }
             t = 0;
          }
          if (i1 && (p0.u(i) && (p0.s == null && !i2))) {
             p2.b = 2;
             if (t && p0.r == null) {
                p2.b = i;
             }
             i1 = 0;
          }
          if (p0.B()) {
             p2.a = i;
             t = 0;
          }
          if (p0.C()) {
             p2.b = i;
             i1 = 0;
          }
          wq0 t1 = p0.t;
          if (i3) {
             if (t1[0] == 4) {
                p2.a = i;
             }else if(!i1){
                if (p2.b == i) {
                   d = p2.d;
                }else {
                   p2.a = 2;
                   p1.b(p0, p2);
                   d = p2.f;
                }
                p2.a = i;
                p2.c = (int)(p0.X * (float)d);
             }
          }
          if (i2) {
             if (t1[i] == 4) {
                p2.b = i;
             }else if(!t){
                if (p2.a == i) {
                   c = p2.c;
                }else {
                   p2.b = 2;
                   p1.b(p0, p2);
                   c = p2.e;
                }
                p2.b = i;
                if (p0.Y == -1) {
                   p2.d = (int)((float)c / p0.X);
                }else {
                   p2.d = (int)(p0.X * (float)c);
                }
             }
          }
          p1.b(p0, p2);
          p0.O(p2.e);
          p0.L(p2.f);
          p0.E = p2.h;
          b00 g = p2.g;
          p0.b0 = g;
          if (g <= null) {
             i = false;
          }
          p0.E = i;
          p2.j = 0;
          return;
       }else {
          p2.e = 0;
          p2.f = 0;
          return;
       }
    }
    public final void D(){
       this.w0.t();
       this.x0 = 0;
       this.y0 = 0;
       super.D();
    }
    public final void P(boolean p0,boolean p1){
       super.P(p0, p1);
       int i = this.q0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.q0.get(i1).P(p0, p1);
       }
       return;
    }
    public final void R(){
       int i8;
       int i9;
       int i10;
       xq0 v0;
       wq0 owq0;
       ArrayList obj;
       int i12;
       wq0 owq01;
       int i13;
       float f1;
       int i14;
       wq0 owq02;
       int i15;
       int i17;
       wq0 owq03;
       int i18;
       int i19;
       int i20;
       int i21;
       xq0 oxq0;
       wq0 owq04;
       cq0 uocq0;
       wq0 owq05;
       int i23;
       sp2 obj1;
       xq0 oxq01;
       Iterator obj2;
       bp7 uobp71;
       cq0 a;
       cq0 a1;
       Iterator iterator;
       sp2 osp2;
       bp7 uobp73;
       bp7 uobp74;
       ap7 uoap7 = this;
       int i = 0;
       uoap7.Z = i;
       uoap7.a0 = i;
       uoap7.E0 = i;
       uoap7.F0 = i;
       int i1 = uoap7.q0.size();
       int i2 = Math.max(i, this.r());
       int i3 = Math.max(i, this.l());
       wq0 t = uoap7.T;
       int i4 = 1;
       int i5 = t[i4];
       int i6 = t[i];
       wq0 j = uoap7.J;
       wq0 i7 = uoap7.I;
       if (uoap7.t0 == null && xe7.r(uoap7.D0, i4)) {
          xq0 u0 = uoap7.u0;
          i8 = t[i];
          i9 = t[i4];
          this.F();
          ap7 q0 = uoap7.q0;
          i10 = q0.size();
          for (; i < i10; i = i + 1) {
             q0.get(i).F();
          }
          v0 = uoap7.v0;
          if (i8 == i4) {
             uoap7.J(0, this.r());
          }else {
             i4 = 0;
             i7.l(i4);
             uoap7.Z = i4;
          }
          i4 = 0;
          i8 = 0;
          int i11 = 0;
          while (i4 < i10) {
             owq0 = i7;
             obj = q0.get(i4);
             i12 = i3;
             if (obj instanceof jn2) {
                owq01 = t;
                if (obj.u0 == 1) {
                   jn2 r0 = obj.r0;
                   t = -1;
                   if (r0 != t) {
                      obj.R(r0);
                   }else if(obj.s0 != t && this.B()){
                      i3 = this.r() - obj.s0;
                      obj.R(i3);
                   }else if(this.B()){
                      float f = obj.q0 * (float)this.r();
                      f = f + 0x3f000000;
                      obj.R((int)f);
                   }
                   i8 = 1;
                }
             }else {
                owq01 = t;
                if (obj instanceof mx && !obj.T()) {
                   i11 = 1;
                }
             }
             i4 = i4 + 1;
             i3 = i12;
             i7 = owq0;
             t = owq01;
          }
          i12 = i3;
          owq01 = t;
          owq0 = i7;
          if (i8) {
             i3 = 0;
             while (i3 < i10) {
                t = q0.get(i3);
                if (t instanceof jn2 && t.u0 == 1) {
                   ty0.m(0, t, u0, v0);
                }else {
                   i4 = 0;
                }
                i3 = i3 + 1;
             }
          }
          ty0.m(0, uoap7, u0, v0);
          if (i11) {
             i3 = 0;
             while (i3 < i10) {
                t = q0.get(i3);
                if (t instanceof mx && (!t.T() && t.S())) {
                   ty0.m(1, t, u0, v0);
                }
                i3 = i3 + 1;
             }
          }
          if (i9 == 1) {
             uoap7.K(0, this.l());
          }else {
             i13 = 0;
             j.l(i13);
             uoap7.a0 = i13;
          }
          i3 = 0;
          t = 0;
          i4 = 0;
          while (i3 < i10) {
             i7 = q0.get(i3);
             if (i7 instanceof jn2) {
                if (i7.u0 == null) {
                   jn2 r01 = i7.r0;
                   i8 = -1;
                   if (r01 != i8) {
                      i7.R(r01);
                   }else if(i7.s0 != i8 && this.C()){
                      i13 = this.l() - i7.s0;
                      i7.R(i13);
                   }else if(this.C()){
                      f1 = i7.q0 * (float)this.l();
                      f1 = f1 + 0x3f000000;
                      i7.R((int)f1);
                   }
                   r01 = 1;
                }
             }else if(i7 instanceof mx && i7.T() == 1){
                i4 = 1;
             }
             i3 = i3 + 1;
          }
          if (t) {
             i3 = 0;
             while (i3 < i10) {
                t = q0.get(i3);
                if (t instanceof jn2 && t.u0 == null) {
                   ty0.A(1, t, u0);
                }
                i3 = i3 + 1;
             }
          }
          ty0.A(0, uoap7, u0);
          if (i4) {
             i3 = 0;
             while (i3 < i10) {
                t = q0.get(i3);
                if (t instanceof mx) {
                   i14 = 1;
                   if (t.T() == i14 && t.S()) {
                      ty0.A(i14, t, u0);
                   }
                }
                i3 = i3 + 1;
             }
          }
          i3 = 0;
          while (i3 < i10) {
             t = q0.get(i3);
             if (t.A() && ty0.c(t)) {
                xq0.V(t, u0, ty0.b);
                if (t instanceof jn2) {
                   if (t.u0 == null) {
                      ty0.A(0, t, u0);
                   }else {
                      ty0.m(0, t, u0, v0);
                   }
                }else {
                   i4 = 0;
                   ty0.m(i4, t, u0, v0);
                   ty0.A(i4, t, u0);
                }
             }
             i3 = i3 + 1;
          }
          i = 0;
          while (i < i1) {
             owq02 = uoap7.q0.get(i);
             if (owq02.A() && (!owq02 instanceof jn2 && (!owq02 instanceof mx && (!owq02 instanceof c62 && owq02.F == null)))) {
                i13 = 1;
                i15 = owq02.k(i13);
                i10 = 3;
                f1 = (owq02.k(0) == i10 && (owq02.r != i13 && (i15 == i10 && owq02.s != i13)))? 1: 0;
                if (!f1) {
                   xq0.V(owq02, uoap7.u0, new b00());
                }
             }
             i = i + 1;
          }
       }else {
          i12 = i3;
          owq01 = t;
          i23 = i7;
       }
       v0 = uoap7.w0;
       owq02 = 2;
       if (i1 > owq02 && (i6 == owq02 && (i5 != owq02 || !xe7.r(uoap7.D0, 1024)))) {
          xq0 u01 = uoap7.u0;
          ap7 q01 = uoap7.q0;
          i10 = q01.size();
          int i16 = 0;
          while (true) {
             if (i16 < i10) {
                i7 = q01.get(i16);
                i8 = 0;
                i17 = 1;
                t = i7.T;
                owq03 = j;
                if (!w51.X(owq01[i8], owq01[i17], t[i8], t[i17]) || i7 instanceof c62) {
                   i18 = i2;
                   i19 = i1;
                   i20 = i5;
                   i21 = i6;
                   i2 = 0;
                   oxq0 = v0;
                label_060e :
                   if (i2) {
                      if ((i = i21) == 2) {
                         if ((i1 = i18) < this.r() && i1 > 0) {
                            uoap7.O(i1);
                            uoap7.E0 = true;
                         }else {
                            i2 = this.r();
                         label_062e :
                            if ((i3 = i20) == 2) {
                               if ((i13 = i12) < this.l() && i13 > 0) {
                                  uoap7.L(i13);
                                  uoap7.F0 = true;
                               }else {
                                  i1 = this.l();
                               label_064c :
                                  i13 = i1;
                                  i1 = i2;
                                  i2 = 1;
                               label_0667 :
                                  i4 = 64;
                                  i5 = (!uoap7.W(i4) && !uoap7.W(128))? 0: 1;
                                  oxq0.getClass();
                                  i15 = false;
                                  oxq0.g = i15;
                                  if (uoap7.D0 != null && i5) {
                                     i5 = true;
                                     oxq0.g = i5;
                                  }else {
                                     i5 = 1;
                                  }
                                  ap7 q02 = uoap7.q0;
                                  j = 2;
                                  i5 = (owq01[i15] != j && owq01[i5] != j)? 0: 1;
                                  uoap7.z0 = i15;
                                  uoap7.A0 = i15;
                                  i16 = i19;
                                  i15 = 0;
                                  while (i15 < i16) {
                                     j = uoap7.q0.get(i15);
                                     if (j instanceof ap7) {
                                        j.R();
                                     }
                                     i15 = i15 + 1;
                                  }
                                  i15 = uoap7.W(i4);
                                  int i22 = i2;
                                  i2 = 0;
                                  i14 = 1;
                                  while (i14) {
                                     i9 = i2 + 1;
                                     try{
                                        oxq0.t();
                                        i8 = 0;
                                        uoap7.z0 = i8;
                                        uoap7.A0 = i8;
                                        uoap7.h(oxq0);
                                        for (i2 = 0; i2 < i16; i2 = i2 + 1) {
                                           uoap7.q0.get(i2).h(oxq0);
                                        }
                                        try{
                                           uoap7.T(oxq0);
                                           xq0 g0 = uoap7.G0;
                                           i14 = 5;
                                           if (g0 != null && g0.get() != null) {
                                              uocq0 = uoap7.G0.get();
                                              try{
                                                 owq04 = owq03;
                                                 oxq0.f(oxq0.k(uocq0), oxq0.k(owq04), 0, i14);
                                                 uoap7.G0 = null;
                                              }catch(java.lang.Exception e0){
                                                 owq03 = 0;
                                              }
                                           label_0734 :
                                              u01 = 0;
                                              i14 = 1;
                                           }
                                           try{
                                              if ((g0 = uoap7.I0) != null && g0.get() != null) {
                                                 oxq0.f(oxq0.k(uoap7.L), oxq0.k(uoap7.I0.get()), 0, i14);
                                                 uoap7.I0 = null;
                                              }
                                              try{
                                                 if ((g0 = uoap7.H0) != null && g0.get() != null) {
                                                    uocq0 = uoap7.H0.get();
                                                    try{
                                                       owq05 = owq0;
                                                       oxq0.f(oxq0.k(uocq0), oxq0.k(owq05), 0, i14);
                                                       uoap7.H0 = null;
                                                    }catch(java.lang.Exception e0){
                                                       i23 = 0;
                                                       goto label_0734 ;
                                                    }
                                                 }
                                                 if ((g0 = uoap7.J0) != null && g0.get() != null) {
                                                    oxq0.f(oxq0.k(uoap7.K), oxq0.k(uoap7.J0.get()), 0, i14);
                                                    uoap7.J0 = null;
                                                 }else {
                                                    owq05 = 0;
                                                 }
                                                 oxq0.p();
                                                 i12 = 1;
                                              label_07aa :
                                                 boolean[] x = xe7.x;
                                                 if (i12) {
                                                    x[2] = false;
                                                    i14 = uoap7.W(64);
                                                    uoap7.Q(oxq0, i14);
                                                    i8 = uoap7.q0.size();
                                                    i4 = 0;
                                                    i12 = 0;
                                                    while (i4 < i8) {
                                                       i20 = i8;
                                                       owq04 = uoap7.q0.get(i4);
                                                       owq04.Q(oxq0, i14);
                                                       i19 = i14;
                                                       i18 = i22;
                                                       i22 = -1;
                                                       i14 = (owq04.h == i22 && owq04.i == i22)? 0: 1;
                                                       if (i14) {
                                                          i12 = 1;
                                                       }
                                                       i4 = i4 + 1;
                                                       i8 = i20;
                                                       i14 = i19;
                                                       i22 = i18;
                                                    }
                                                    i18 = i22;
                                                    i22 = -1;
                                                 }else {
                                                    i18 = i22;
                                                    uoap7.Q(oxq0, i15);
                                                    for (i4 = 0; i4 < i16; i4 = i4 + 1) {
                                                       uoap7.q0.get(i4).Q(oxq0, i15);
                                                    }
                                                    i12 = 0;
                                                 }
                                                 u01 = 8;
                                                 if (i5 && (i9 < u01 && x[2])) {
                                                    i2 = 0;
                                                    i14 = 0;
                                                    i8 = 0;
                                                    while (i2 < i16) {
                                                       j = uoap7.q0.get(i2);
                                                       i4 = j.r() + j.Z;
                                                       i14 = Math.max(i14, i4);
                                                       i22 = j.l() + j.a0;
                                                       i8 = Math.max(i8, i22);
                                                       i2 = i2 + 1;
                                                       i22 = -1;
                                                    }
                                                    i2 = Math.max(uoap7.c0, i14);
                                                    i4 = Math.max(uoap7.d0, i8);
                                                    i22 = 2;
                                                    if (i == i22 && this.r() < i2) {
                                                       uoap7.O(i2);
                                                       owq01[0] = i22;
                                                       i12 = 1;
                                                       i18 = 1;
                                                    }
                                                    if (i3 == i22 && this.l() < i4) {
                                                       uoap7.L(i4);
                                                       owq01[1] = i22;
                                                       i12 = 1;
                                                       i18 = 1;
                                                    }
                                                 }
                                                 if ((i2 = Math.max(uoap7.c0, this.r())) > this.r()) {
                                                    uoap7.O(i2);
                                                    i4 = 1;
                                                    owq01[0] = i4;
                                                    i17 = 1;
                                                    i12 = 1;
                                                 }else {
                                                    i4 = 1;
                                                    i17 = i18;
                                                 }
                                                 if ((i2 = Math.max(uoap7.d0, this.l())) > this.l()) {
                                                    uoap7.L(i2);
                                                    owq01[i4] = i4;
                                                    x = 1;
                                                    i12 = 1;
                                                 }else {
                                                    i2 = i17;
                                                 }
                                                 if (!x) {
                                                    i22 = 0;
                                                    if (owq01[i22] == 2 && (i1 > 0 && this.r() > i1)) {
                                                       uoap7.E0 = i4;
                                                       owq01[i22] = i4;
                                                       uoap7.O(i1);
                                                       x = 1;
                                                       i12 = 1;
                                                    }
                                                    if (owq01[i4] == 2 && (i13 > 0 && this.l() > i13)) {
                                                       uoap7.F0 = i4;
                                                       owq01[i4] = i4;
                                                       uoap7.L(i13);
                                                       x = 8;
                                                       u01 = 1;
                                                       i22 = 1;
                                                    label_08e7 :
                                                       if (i9 > x) {
                                                          u01 = 0;
                                                       }
                                                       i14 = u01;
                                                       i2 = i9;
                                                       u01 = 64;
                                                    }
                                                 }else {
                                                    i14 = 2;
                                                 }
                                                 i22 = x;
                                                 i4 = i12;
                                                 x = 8;
                                                 goto label_08e7 ;
                                              }catch(java.lang.Exception e0){
                                                 goto label_0734 ;
                                              }
                                           }catch(java.lang.Exception e0){
                                           }catch(java.lang.Exception e0){
                                              goto label_0734 ;
                                           }
                                        }catch(java.lang.Exception e0){
                                        }catch(java.lang.Exception e0){
                                        }
                                     }catch(java.lang.Exception e0){
                                        u01 = 0;
                                     }
                                     e0.printStackTrace();
                                     i12 = i14;
                                     System.out.println("EXCEPTION : ".append(e0).toString());
                                     goto label_07aa ;
                                  }
                                  uoap7.q0 = q02;
                                  if (i22) {
                                     owq01[0] = i;
                                     owq01[1] = i3;
                                  }
                               }
                            }else {
                               i13 = i12;
                            }
                            i1 = i13;
                            goto label_064c ;
                         }
                      }else {
                         i1 = i18;
                      }
                      i2 = i1;
                      goto label_062e ;
                   }else {
                      i13 = i12;
                      i3 = i20;
                      i1 = i18;
                      i = i21;
                   }
                }else {
                   i16 = i16 + 1;
                   j = owq03;
                   owq02 = 2;
                }
             }else {
                owq03 = j;
                i3 = 0;
                ArrayList uArrayList = null;
                ArrayList uArrayList1 = null;
                ArrayList uArrayList2 = null;
                obj = null;
                ArrayList uArrayList3 = null;
                ArrayList uArrayList4 = null;
                while (i3 < i10) {
                   i19 = i1;
                   obj1 = q01.get(i3);
                   i20 = i5;
                   i18 = i2;
                   i17 = 1;
                   i21 = i6;
                   wq0 t1 = obj1.T;
                   oxq01 = v0;
                   if (!w51.X(owq01[0], owq01[i17], t1[0], t1[i17])) {
                      xq0.V(obj1, u01, uoap7.L0);
                   }
                   if (v0 = obj1 instanceof jn2) {
                      obj2 = obj1;
                      if (obj2.u0 == null) {
                         if (uArrayList2 == null) {
                            uArrayList2 = new ArrayList();
                         }
                         uArrayList2.add(obj2);
                      }
                      if (obj2.u0 == 1) {
                         if (uArrayList == null) {
                            uArrayList = new ArrayList();
                         }
                         uArrayList.add(obj2);
                      }
                   }
                   if (obj1 instanceof sp2) {
                      if (obj1 instanceof mx) {
                         obj2 = obj1;
                         if (!obj2.T()) {
                            if (uArrayList1 == null) {
                               uArrayList1 = new ArrayList();
                            }
                            uArrayList1.add(obj2);
                         }
                         if (obj2.T() == 1) {
                            if (obj == null) {
                               obj = new ArrayList();
                            }
                            obj.add(obj2);
                         }
                      }else {
                         obj2 = obj1;
                         if (uArrayList1 == null) {
                            uArrayList1 = new ArrayList();
                         }
                         uArrayList1.add(obj2);
                         if (obj == null) {
                            obj = new ArrayList();
                         }
                         obj.add(obj2);
                      }
                   }
                   if (obj1.I.f == null && (obj1.K.f == null && (!i2 && !obj1 instanceof mx))) {
                      if (uArrayList3 == null) {
                         uArrayList3 = new ArrayList();
                      }
                      uArrayList3.add(obj1);
                   }
                   if (obj1.J.f == null && (obj1.L.f == null && (obj1.M.f == null && (!i2 && !obj1 instanceof mx)))) {
                      if (uArrayList4 == null) {
                         uArrayList4 = new ArrayList();
                      }
                      uArrayList4.add(obj1);
                   }
                   i3 = i3 + 1;
                   i5 = i20;
                   i1 = i19;
                   i2 = i18;
                   i6 = i21;
                   v0 = oxq01;
                }
                i18 = i2;
                oxq01 = v0;
                i19 = i1;
                i20 = i5;
                i21 = i6;
                ArrayList uArrayList5 = new ArrayList();
                if (uArrayList != null) {
                   obj2 = uArrayList.iterator();
                   while (obj2.hasNext()) {
                      w51.r(obj2.next(), 0, uArrayList5, null);
                   }
                }
                bp7 uobp7 = null;
                i13 = 0;
                if (uArrayList1 != null) {
                   obj2 = uArrayList1.iterator();
                   while (obj2.hasNext()) {
                      obj1 = obj2.next();
                      uobp71 = w51.r(obj1, i13, uArrayList5, uobp7);
                      obj1.R(i13, uobp71, uArrayList5);
                      uobp71.a(uArrayList5);
                      uArrayList = 0;
                   }
                }
                if ((a = uoap7.j(bq0.a).a) != null) {
                   obj2 = a.iterator();
                   while (obj2.hasNext()) {
                      w51.r(obj2.next().d, 0, uArrayList5, null);
                   }
                }
                if ((a = uoap7.j(bq0.c).a) != null) {
                   obj2 = a.iterator();
                   while (obj2.hasNext()) {
                      w51.r(obj2.next().d, 0, uArrayList5, null);
                   }
                }
                bq0 w = bq0.w;
                if ((a1 = uoap7.j(w).a) != null) {
                   iterator = a1.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next().d, 0, uArrayList5, null);
                   }
                }
                bp7 uobp72 = null;
                i4 = 0;
                if (uArrayList3 != null) {
                   iterator = uArrayList3.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next(), i4, uArrayList5, uobp72);
                   }
                }
                if (uArrayList2 != null) {
                   iterator = uArrayList2.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next(), 1, uArrayList5, uobp72);
                   }
                }
                i4 = 1;
                if (obj != null) {
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      osp2 = iterator.next();
                      uobp73 = w51.r(osp2, i4, uArrayList5, uobp72);
                      osp2.R(i4, uobp73, uArrayList5);
                      uobp73.a(uArrayList5);
                      uobp71 = 1;
                   }
                }
                if ((a1 = uoap7.j(bq0.b).a) != null) {
                   iterator = a1.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next().d, 1, uArrayList5, null);
                   }
                }
                if ((a1 = uoap7.j(bq0.v).a) != null) {
                   iterator = a1.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next().d, 1, uArrayList5, null);
                   }
                }
                if ((a1 = uoap7.j(bq0.t).a) != null) {
                   iterator = a1.iterator();
                   while (iterator.hasNext()) {
                      w51.r(iterator.next().d, 1, uArrayList5, null);
                   }
                }
                if ((a = uoap7.j(w).a) != null) {
                   obj2 = a.iterator();
                   while (obj2.hasNext()) {
                      w51.r(obj2.next().d, 1, uArrayList5, null);
                   }
                }
                uobp7 = null;
                i13 = 1;
                if (uArrayList4 != null) {
                   obj2 = uArrayList4.iterator();
                   while (obj2.hasNext()) {
                      w51.r(obj2.next(), i13, uArrayList5, uobp7);
                   }
                }
                i = 0;
                while (i < i10) {
                   wq0 owq06 = q01.get(i);
                   owq02 = owq06.T;
                   uobp71 = 3;
                   osp2 = (owq02[0] == uobp71 && owq02[i13] == uobp71)? 1: 0;
                   if (osp2) {
                      owq02 = owq06.o0;
                      i13 = uArrayList5.size();
                      i5 = 0;
                      while (true) {
                         if (i5 < i13) {
                            uobp74 = uArrayList5.get(i5);
                            if (owq02 == uobp74.b) {
                            label_0567 :
                               owq06 = owq06.p0;
                               i3 = uArrayList5.size();
                               i13 = 0;
                               while (true) {
                                  if (i13 < i3) {
                                     uobp73 = uArrayList5.get(i13);
                                     if (owq06 == uobp73.b) {
                                     label_057f :
                                        if (uobp74 != null && uobp73 != null) {
                                           uobp74.c(0, uobp73);
                                           uobp73.c = 2;
                                           uArrayList5.remove(uobp74);
                                        }
                                     }else {
                                        i13 = i13 + 1;
                                     }
                                  }else {
                                     uobp73 = null;
                                     goto label_057f ;
                                  }
                               }
                            }else {
                               i5 = i5 + 1;
                            }
                         }else {
                            uobp74 = null;
                            goto label_0567 ;
                         }
                      }
                   }
                   i = i + 1;
                   i13 = 1;
                }
                i1 = 1;
                if (uArrayList5.size() <= i1) {
                   oxq0 = oxq01;
                }else {
                   i = 0;
                   if (owq01[i] == 2) {
                      Iterator iterator1 = uArrayList5.iterator();
                      i13 = 0;
                      uobp71 = 0;
                      while (iterator1.hasNext()) {
                         uobp73 = iterator1.next();
                         if (uobp73.c == i1) {
                            oxq0 = oxq01;
                         }else {
                            oxq0 = oxq01;
                            if ((i15 = uobp73.b(oxq0, i)) > i13) {
                               uobp71 = uobp73;
                               i13 = i15;
                            }
                         }
                         oxq01 = oxq0;
                         i = 0;
                      }
                      oxq0 = oxq01;
                      if (uobp71 != null) {
                         uoap7.M(i1);
                         uoap7.O(i13);
                      label_05d7 :
                         if (owq01[i1] == 2) {
                            Iterator iterator2 = uArrayList5.iterator();
                            i = 0;
                            iterator1 = 0;
                            while (iterator2.hasNext()) {
                               uobp72 = iterator2.next();
                               if (uobp72.c == null || (i5 = uobp72.b(oxq0, i1)) <= i) {
                                  continue ;
                               }
                               uobp7 = uobp72;
                               i = i5;
                            }
                            if (iterator1 != null) {
                               uoap7.N(i1);
                               uoap7.L(i);
                            label_0606 :
                               if (uobp71 != null || iterator1 != null) {
                                  iterator2 = 1;
                                  goto label_060e ;
                               }
                            }
                         }
                         uobp7 = null;
                         goto label_0606 ;
                      }
                   }else {
                      oxq0 = oxq01;
                   }
                   uobp71 = null;
                   goto label_05d7 ;
                }
                uArrayList5 = 0;
                goto label_060e ;
             }
          }
          uoap7.G(oxq0.l);
          return;
       }else {
          i19 = i1;
          i3 = i5;
          owq03 = j;
          i13 = i12;
          i1 = i2;
          oxq0 = v0;
          i = i6;
       }
       uocq0 = 0;
       goto label_0667 ;
    }
    public final void S(int p0,wq0 p1){
       xq0 tC0;
       if (!p0) {
          tC0 = this.C0;
          if (((this.z0 + 1)) >= tC0.length) {
             this.C0 = Arrays.copyOf(tC0, (tC0.length * 2));
          }
          tC0 = this.z0;
          p0[tC0] = new md0(p1, 0, this.v0);
          this.z0 = tC0 + 1;
       }else if(p0 == 1){
          tC0 = this.B0;
          if (((this.A0 + 1)) >= tC0.length) {
             this.B0 = Arrays.copyOf(tC0, (tC0.length * 2));
          }
          tC0 = this.A0;
          p0[tC0] = new md0(p1, 1, this.v0);
          this.A0 = tC0 + 1;
       }
       return;
    }
    public final void T(vk3 p0){
       wq0 owq0;
       wq0 s;
       int i3;
       object oobject;
       mx s0;
       Iterator iterator;
       wq0 owq01;
       boolean b = this.W(64);
       this.c(p0, b);
       int i = this.q0.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          owq0 = this.q0.get(i1);
          s = owq0.S;
          s[0] = false;
          s[1] = false;
          if (owq0 instanceof mx) {
             i2 = 1;
          }
          i1 = i1 + 1;
       }
       i1 = 2;
       if (i2) {
          i2 = 0;
          while (i2 < i) {
             owq0 = this.q0.get(i2);
             if (owq0 instanceof mx) {
                i3 = 0;
                while (i3 < owq0.r0) {
                   oobject = owq0.q0[i3];
                   if (owq0.t0 != null || oobject.d()) {
                      if ((s0 = owq0.s0) != null && s0 != 1) {
                         if (s0 == i1 || s0 == 3) {
                            oobject.S[1] = 1;
                         }
                      }else {
                         oobject.S[0] = 1;
                      }
                   }
                   i3 = i3 + 1;
                }
             }
             i2 = i2 + 1;
          }
       }
       xq0 tK0 = this.K0;
       tK0.clear();
       int i4 = 0;
       while (i4 < i) {
          s = this.q0.get(i4);
          s.getClass();
          oobject = (!s instanceof c62 && !s instanceof jn2)? 0: 1;
          if (oobject) {
             if (s instanceof c62) {
                tK0.add(s);
             }else {
                s.c(p0, b);
             }
          }
          i4 = i4 + 1;
       }
       while (tK0.size() > 0) {
          i4 = tK0.size();
          iterator = tK0.iterator();
          while (iterator.hasNext()) {
             owq01 = iterator.next();
             int i5 = 0;
             while (true) {
                if (i5 < owq01.r0) {
                   if (tK0.contains(owq01.q0[i5])) {
                      i5 = 1;
                   label_00ce :
                      if (i5) {
                         owq01.c(p0, b);
                         tK0.remove(owq01);
                      }else {
                         continue ;
                      }
                   }else {
                      i5 = i5 + 1;
                   }
                }else {
                   i5 = 0;
                   goto label_00ce ;
                }
             }
          }
          if (i4 == tK0.size()) {
             Iterator iterator1 = tK0.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().c(p0, b);
             }
             tK0.clear();
          }else {
             continue ;
          }
       }
       if (vk3.p) {
          HashSet hashSet = new HashSet();
          i4 = 0;
          while (i4 < i) {
             s = this.q0.get(i4);
             s.getClass();
             owq01 = (!s instanceof c62 && !s instanceof jn2)? 0: 1;
             if (!owq01) {
                hashSet.add(s);
             }
             i4 = i4 + 1;
          }
          int i6 = (this.T[0] == i1)? 0: 1;
          this.b(this, p0, hashSet, i6, false);
          Iterator iterator2 = hashSet.iterator();
          while (iterator2.hasNext()) {
             wq0 owq02 = iterator2.next();
             xe7.h(this, p0, owq02);
             owq02.c(p0, b);
          }
       }else {
          i2 = 0;
          while (i2 < i) {
             owq0 = this.q0.get(i2);
             if (owq0 instanceof xq0) {
                s = owq0.T;
                int i7 = s[0];
                i3 = s[1];
                if (i7 == i1) {
                   owq0.M(1);
                }
                if (i3 == i1) {
                   owq0.N(1);
                }
                owq0.c(p0, b);
                if (i7 == i1) {
                   owq0.M(i7);
                }
                if (i3 == i1) {
                   owq0.N(i3);
                }
             }else {
                xe7.h(this, p0, owq0);
                iterator = (!owq0 instanceof c62 && !owq0 instanceof jn2)? 0: 1;
                if (!iterator) {
                   owq0.c(p0, b);
                }
             }
             i2 = i2 + 1;
          }
       }
       if (this.z0 > null) {
          ye7.c(this, p0, null, false);
       }
       if (this.A0 > null) {
          ye7.c(this, p0, null, 1);
       }
       return;
    }
    public final boolean U(int p0,boolean p1){
       cp7 uocp71;
       int i = 1;
       int i1 = p1 & i;
       xq0 ts0 = this.s0;
       o91 a = ts0.a;
       int i2 = a.k(0);
       int i3 = a.k(i);
       int i4 = a.s();
       int i5 = a.t();
       o91 e = ts0.e;
       if (i1) {
          int i6 = 2;
          if (i2 == i6 || i3 == i6) {
             Iterator iterator = e.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   cp7 uocp7 = iterator.next();
                   if (uocp7.f == p0 && !uocp7.k()) {
                      i1 = 0;
                   }
                }
                if (!p0) {
                   if (i1 && i2 == i6) {
                      a.M(i);
                      a.O(ts0.d(a, 0));
                      a.d.e.d(a.r());
                   }
                }else if(i1 && i3 == i6){
                   a.N(i);
                   a.L(ts0.d(a, i));
                   a.e.e.d(a.l());
                }
             }
             a.M(i2);
             a.N(i3);
             return i;
          }
       }
       i1 = 4;
       wq0 t = a.T;
       if (!p0) {
          if ((i5 = t[0]) == i || i5 == i1) {
             i1 = a.r() + i4;
             a.d.i.d(i1);
             a.d.e.d((i1 - i4));
          label_00ad :
             i1 = 1;
          label_00ae :
             ts0.g();
             Iterator iterator1 = e.iterator();
             while (iterator1.hasNext()) {
                uocp71 = iterator1.next();
                if (uocp71.f != p0 || (uocp71.b == a && uocp71.g == null)) {
                   continue ;
                }
                uocp71.e();
             }
             iterator1 = e.iterator();
             while (iterator1.hasNext()) {
                uocp71 = iterator1.next();
                if (uocp71.f != p0 || (!i1 && (uocp71.b == a || (uocp71.h.j != null || (uocp71.i.j == null || (!uocp71 instanceof nd0 && uocp71.e.j == null)))))) {
                }else {
                   i = false;
                }
             }
          }
       }else if((i4 = t[i]) != i && i4 != i1){
          i1 = a.l() + i5;
          a.e.i.d(i1);
          a.e.e.d((i1 - i5));
          goto label_00ad ;
       }
       i1 = 0;
       goto label_00ae ;
    }
    public final boolean W(int p0){
       boolean b = (((this.D0 & p0)) == p0)? true: false;
       return b;
    }
    public final void o(StringBuilder p0){
       p0 = p0+this.j+":{\n"+"  actualWidth:"+this.V+"\n"+"  actualHeight:"+this.W+"\n";
       Iterator iterator = this.q0.iterator();
       while (iterator.hasNext()) {
          iterator.next().o(p0);
          p0 = p0.append(",\n");
       }
       p0+"}";
       return;
    }
}
