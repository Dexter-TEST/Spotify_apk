package p.vk3;
import java.lang.Object;
import p.fn6;
import p.rk;
import p.oy6;
import p.mk5;
import p.cq0;
import p.th5;
import java.util.Arrays;
import p.qk;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.System;
import java.lang.String;
import java.io.PrintStream;
import p.ko1;

public final class vk3	// class@002a10 from classes.dex
{
    public boolean a;
    public int b;
    public final mk5 c;
    public int d;
    public int e;
    public rk[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final oy6 l;
    public fn6[] m;
    public int n;
    public rk o;
    public static boolean p = false;
    public static int q;

    public void vk3(){
       super();
       this.a = false;
       this.b = 0;
       this.d = 32;
       this.e = 32;
       this.f = null;
       this.g = false;
       boolean[] uobooleanArr = new boolean[32];
       this.h = uobooleanArr;
       this.i = 1;
       this.j = 0;
       this.k = 32;
       fn6[] uofn6Array = new fn6[vk3.q];
       this.m = uofn6Array;
       this.n = 0;
       rk[] orkArray = new rk[32];
       this.f = orkArray;
       this.s();
       oy6 ooy6 = new oy6(2);
       this.l = ooy6;
       this.c = new mk5(ooy6);
       this.o = new rk(ooy6);
    }
    public static int n(cq0 p0){
       if ((p0 = p0.i) != null) {
          return (int)(p0.v + 0x3f000000);
       }
       return 0;
    }
    public final fn6 a(int p0){
       fn6 uofn6;
       if ((uofn6 = this.l.t.a()) == null) {
          uofn6 = new fn6(p0);
          uofn6.z = p0;
       }else {
          uofn6.c();
          uofn6.z = p0;
       }
       int q = vk3.q;
       if (this.n >= q) {
          q = q * 2;
          vk3.q = q;
          this.m = Arrays.copyOf(this.m, q);
       }
       vk3 tn = this.n;
       this.n = tn + 1;
       p0[tn] = uofn6;
       return uofn6;
    }
    public final void b(fn6 p0,fn6 p1,int p2,float p3,fn6 p4,fn6 p5,int p6,int p7){
       rk ork = this.l();
       float f = 0x3f800000;
       if (p1 == p4) {
          ork.d.d(p0, f);
          ork.d.d(p5, f);
          ork.d.d(p1, -2.00f);
       }else {
          float f1 = 0xbf800000;
          if (!(0x3f000000 - p3)) {
             ork.d.d(p0, f);
             ork.d.d(p1, f1);
             ork.d.d(p4, f1);
             ork.d.d(p5, f);
             if (p2 > 0 || p6 > 0) {
                ork.b = (float)((- p2) + p6);
             }
          }else if((p3) <= 0){
             ork.d.d(p0, f1);
             ork.d.d(p1, f);
             ork.b = (float)p2;
          }else if((f - p3) >= 0){
             ork.d.d(p5, f1);
             ork.d.d(p4, f);
             ork.b = (float)(- p6);
          }else {
             float f2 = f - p3;
             ork.d.d(p0, (f2 * f));
             ork.d.d(p1, (f2 * f1));
             ork.d.d(p4, (f1 * p3));
             ork.d.d(p5, (f * p3));
             if (p2 > 0 || p6 > 0) {
                ork.b = ((float)p6 * p3) + ((float)(- p2) * f2);
             }
          }
       }
       if (p7 != 8) {
          ork.a(this, p7);
       }
       this.c(ork);
       return;
    }
    public final void c(rk p0){
       fn6 uofn6;
       fn6 uofn62;
       int i9;
       rk a;
       vk3 ovk3 = this;
       rk ork = p0;
       int i = 1;
       if (((ovk3.j + i)) >= ovk3.k || ((ovk3.i + i)) >= ovk3.e) {
          this.o();
       }
       if (ork.e == null) {
          int i1 = -1;
          if (ovk3.f.length) {
             uofn62 = 0;
             while (!uofn62) {
                int i10 = ork.d.g();
                int i11 = 0;
                while (true) {
                   rk c = ork.c;
                   if (i11 < i10) {
                      uofn6 = ork.d.h(i11);
                      if (uofn6.c != i1 || uofn6.w != null) {
                         c.add(uofn6);
                      }
                      i11 = i11 + 1;
                   }else if((i10 = c.size()) > 0){
                      i11 = 0;
                      while (i11 < i10) {
                         uofn6 = c.get(i11);
                         if (uofn6.w != null) {
                            ork.h(ovk3, uofn6, i);
                         }else {
                            ork.i(ovk3, ovk3.f[uofn6.c], i);
                         }
                         i11 = i11 + 1;
                      }
                      c.clear();
                   }else {
                      uofn62 = 1;
                   }
                }
             }
             if (ork.a != null && !ork.d.g()) {
                ork.e = i;
                ovk3.a = i;
             }
          }
          if (p0.e()) {
             return;
          }else {
             rk b = ork.b;
             if ((b) < 0) {
                ork.b = b * 0xbf800000;
                ork.d.k();
             }
             int i2 = ork.d.g();
             uofn6 = null;
             int i3 = uofn6;
             int i4 = 0;
             int i5 = 0;
             int i6 = 0;
             int i7 = 0;
             int i8 = 0;
             while (i4 < i2) {
                float f = ork.d.a(i4);
                fn6 uofn61 = ork.d.h(i4);
                if (uofn61.z == i) {
                   if (uofn6 == null) {
                      if (uofn61.C <= i) {
                      label_00c5 :
                         i6 = 1;
                      label_00c8 :
                         uofn6 = uofn61;
                         i5 = f;
                      }
                   }else if((f - i5) > 0){
                      if (uofn61.C <= i) {
                         goto label_00c5 ;
                      }
                   }else if(!i6){
                      i1 = (uofn61.C <= i)? 1: 0;
                      if (i1) {
                         uofn6 = uofn61;
                         i5 = f;
                         i6 = 1;
                      }
                   }
                   i6 = 0;
                   goto label_00c8 ;
                }else if(uofn6 == null && (f) < 0){
                   if (i3 == null) {
                      if (uofn61.C <= i) {
                      label_00ef :
                         i8 = 1;
                      label_00f2 :
                         i3 = uofn61;
                         i7 = f;
                      }
                   }else if((f - i7) > 0){
                      if (uofn61.C <= i) {
                         goto label_00ef ;
                      }
                   }else if(!i8){
                      i1 = (uofn61.C <= i)? 1: 0;
                      if (i1) {
                         i3 = uofn61;
                         i7 = f;
                         i8 = 1;
                      }
                   }
                   i8 = 0;
                   goto label_00f2 ;
                }
                i4 = i4 + 1;
                i1 = -1;
             }
             if (uofn6 == null) {
                uofn6 = i3;
             }
             if (uofn6 == null) {
                i2 = 1;
             }else {
                ork.g(uofn6);
                uofn62 = 0;
             }
             if (!ork.d.g()) {
                ork.e = i;
             }
             if (i2) {
                if (((ovk3.i + i)) >= ovk3.e) {
                   this.o();
                }
                uofn62 = ovk3.a(3);
                i9 = ovk3.b + i;
                ovk3.b = i9;
                ovk3.i = ovk3.i + i;
                uofn62.b = i9;
                vk3 l = ovk3.l;
                l.v[i9] = uofn62;
                ork.a = uofn62;
                this.h(p0);
                if (ovk3.j == (ovk3.j + i)) {
                   vk3 o = ovk3.o;
                   o.getClass();
                   o.a = null;
                   o.d.clear();
                   for (i4 = 0; i4 < ork.d.g(); i4 = i4 + 1) {
                      o.d.f(ork.d.h(i4), ork.d.a(i4), i);
                   }
                   ovk3.r(ovk3.o);
                   if (uofn62.c == -1) {
                      if (ork.a == uofn62 && (uofn62 = ork.f(null, uofn62)) != null) {
                         ork.g(uofn62);
                      }
                      if (ork.e == null) {
                         ork.a.e(ovk3, ork);
                      }
                      l.c.b(ork);
                      ovk3.j = ovk3.j - i;
                   }
                   uofn62 = 1;
                label_01a6 :
                   if ((a = ork.a) == null || (a.z != i || (ork.b) >= 0)) {
                      i = 0;
                   }
                   if (!i) {
                      return;
                   }else {
                      i9 = uofn62;
                   }
                }
             }
             uofn62 = 0;
             goto label_01a6 ;
          }
       }else {
          a = 0;
       }
       if (!i9) {
          this.h(p0);
       }
       return;
    }
    public final void d(fn6 p0,int p1){
       rk ork;
       fn6 c = p0.c;
       int i = -1;
       if (c == i) {
          p0.d(this, (float)p1);
          int i1 = 0;
          while (true) {
             p1 = this.b + 1;
             if (i1 < p1) {
                i1++;
             }else {
                break ;
             }
          }
          return;
       }else if(c != i){
          object oobject = this.f[c];
          if (oobject.e != null) {
             oobject.b = (float)p1;
          }else if(!oobject.d.g()){
             oobject.e = true;
             oobject.b = (float)p1;
          }else {
             ork = this.l();
             if (p1 < 0) {
                ork.b = (float)(p1 * -1);
                ork.d.d(p0, 0x3f800000);
             }else {
                ork.b = (float)p1;
                ork.d.d(p0, 0xbf800000);
             }
             this.c(ork);
          }
       }else {
          ork = this.l();
          ork.a = p0;
          float f = (float)p1;
          p0.v = f;
          ork.b = f;
          ork.e = true;
          this.c(ork);
       }
       return;
    }
    public final void e(fn6 p0,fn6 p1,int p2,int p3){
       if (p3 == 8 && (p1.w != null && p0.c == -1)) {
          p0.d(this, (p1.v + (float)p2));
          return;
       }else {
          rk ork = this.l();
          int i = 0;
          if (p2) {
             if (p2 < 0) {
                p2 = p2 * -1;
                i = 1;
             }
             ork.b = (float)p2;
          }
          if (!i) {
             ork.d.d(p0, 0xbf800000);
             ork.d.d(p1, 0x3f800000);
          }else {
             ork.d.d(p0, 0x3f800000);
             ork.d.d(p1, 0xbf800000);
          }
          if (p3 != 8) {
             ork.a(this, p3);
          }
          this.c(ork);
          return;
       }
    }
    public final void f(fn6 p0,fn6 p1,int p2,int p3){
       rk ork = this.l();
       fn6 uofn6 = this.m();
       uofn6.t = 0;
       ork.b(p0, p1, uofn6, p2);
       if (p3 != 8) {
          ork.d.d(this.j(p3), (float)(int)(ork.d.i(uofn6) * 0xbf800000));
       }
       this.c(ork);
       return;
    }
    public final void g(fn6 p0,fn6 p1,int p2,int p3){
       rk ork = this.l();
       fn6 uofn6 = this.m();
       uofn6.t = 0;
       ork.c(p0, p1, uofn6, p2);
       if (p3 != 8) {
          ork.d.d(this.j(p3), (float)(int)(ork.d.i(uofn6) * 0xbf800000));
       }
       this.c(ork);
       return;
    }
    public final void h(rk p0){
       object oobject;
       int i3;
       if (p0.e != null) {
          p0.a.d(this, p0.b);
       }else {
          vk3 tj1 = this.j;
          this.f[tj1] = p0;
          rk a1 = p0.a;
          a1.c = tj1;
          this.j = tj1 + 1;
          a1.e(this, p0);
       }
       if (this.a != null) {
          int i = 0;
          while (i < this.j) {
             if (this.f[i] == null) {
                System.out.println("WTF");
             }
             if ((oobject = this.f[i]) != null && oobject.e != null) {
                oobject.a.d(this, oobject.b);
                this.l.c.b(oobject);
                object oobject1 = null;
                this.f[i] = oobject1;
                int i1 = i + 1;
                int i2 = i1;
                while (true) {
                   vk3 tj = this.j;
                   if (i1 < tj) {
                      vk3 tf = this.f;
                      i3 = i1 - 1;
                      object oobject2 = tf[i1];
                      tf[i3] = oobject2;
                      rk a = oobject2.a;
                      if (a.c == i1) {
                         a.c = i3;
                      }
                      i2 = i1 + 1;
                      int i4 = i2;
                      i2 = i1;
                      i1 = i4;
                   }else if(i2 < tj){
                      this.f[i2] = oobject1;
                   }
                   i3 = tj - 1;
                   this.j = i3;
                   i = i - 1;
                }
             }
             i = i + 1;
          }
          this.a = false;
       }
       return;
    }
    public final void i(){
       for (int i = 0; i < this.j; i = i + 1) {
          object oobject = this.f[i];
          oobject.a.v = oobject.b;
       }
       return;
    }
    public final fn6 j(int p0){
       if (((this.i + 1)) >= this.e) {
          this.o();
       }
       fn6 uofn6 = this.a(4);
       int i = this.b + 1;
       this.b = i;
       this.i = this.i + 1;
       uofn6.b = i;
       uofn6.t = p0;
       p0[i] = uofn6;
       vk3 tc = this.c;
       tc.i.b = uofn6;
       fn6 y = uofn6.y;
       Arrays.fill(y, 0);
       y[uofn6.t] = 0x3f800000;
       tc.j(uofn6);
       return uofn6;
    }
    public final fn6 k(Object p0){
       fn6 uofn6 = null;
       if (p0 == null) {
          return uofn6;
       }
       if (((this.i + 1)) >= this.e) {
          this.o();
       }
       if (p0 instanceof cq0) {
          if ((uofn6 = p0.i) == null) {
             p0.k();
             uofn6 = p0.i;
          }
          p0 = uofn6.b;
          vk3 tl = this.l;
          int i = -1;
          if (p0 == i || (p0 > this.b || tl.v[p0] == null)) {
             if (p0 != i) {
                uofn6.c();
             }
             int i1 = this.b + 1;
             this.b = i1;
             this.i = this.i + 1;
             uofn6.b = i1;
             uofn6.z = 1;
             tl.v[i1] = uofn6;
          }
       }
       return uofn6;
    }
    public final rk l(){
       rk ork;
       vk3 tl = this.l;
       if ((ork = tl.c.a()) == null) {
          ork = new rk(tl);
       }else {
          ork.a = null;
          ork.d.clear();
          ork.b = 0;
          ork.e = false;
       }
       return ork;
    }
    public final fn6 m(){
       if (((this.i + 1)) >= this.e) {
          this.o();
       }
       fn6 uofn6 = this.a(3);
       int i = this.b + 1;
       this.b = i;
       this.i = this.i + 1;
       uofn6.b = i;
       this.l.v[i] = uofn6;
       return uofn6;
    }
    public final void o(){
       int i = this.d * 2;
       this.d = i;
       this.f = Arrays.copyOf(this.f, i);
       vk3 tl = this.l;
       tl.v = Arrays.copyOf(tl.v, this.d);
       tl = this.d;
       boolean[] uobooleanArr = new boolean[tl];
       this.h = uobooleanArr;
       this.e = tl;
       this.k = tl;
    }
    public final void p(){
       vk3 tc = this.c;
       if (tc.e()) {
          this.i();
          return;
       }else if(this.g != null){
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i1 < this.j) {
                if (this.f[i1].e == null) {
                label_0023 :
                   if (!i) {
                      this.q(tc);
                      break ;
                   }else {
                      this.i();
                      break ;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i = 1;
                goto label_0023 ;
             }
          }
       }else {
          this.q(tc);
       }
       return;
    }
    public final void q(mk5 p0){
       rk a;
       vk3 ovk3 = this;
       int i = 0;
       while (true) {
          int i1 = 0;
          int i2 = 1;
          if (i < ovk3.j) {
             object oobject = ovk3.f[i];
             if (oobject.a.z == i2 || (oobject.b - i1) >= 0) {
                i = i + 1;
             }else {
                i = 1;
             label_0020 :
                if (i) {
                   i = 0;
                   int i3 = 0;
                   while (!i) {
                      i3 = i3 + i2;
                      int i4 = Float.MAX_VALUE;
                      int i5 = 0;
                      int i6 = -1;
                      int i7 = -1;
                      int i8 = 0;
                      while (i5 < ovk3.j) {
                         object oobject1 = ovk3.f[i5];
                         if (oobject1.a.z != i2 && (oobject1.e == null && (oobject1.b - i1) < 0)) {
                            int i9 = oobject1.d.g();
                            int i10 = 0;
                            while (i10 < i9) {
                               fn6 uofn6 = oobject1.d.h(i10);
                               float f = oobject1.d.i(uofn6);
                               if ((f - i1) > 0) {
                                  i1 = 0;
                                  while (i1 < 9) {
                                     float f1 = uofn6.x[i1] / f;
                                     if ((f1 - i4) < 0 && (i1 == i8 || i1 > i8)) {
                                        i7 = uofn6.b;
                                        i8 = i1;
                                        i4 = f1;
                                        i6 = i5;
                                     }
                                     i1 = i1 + 1;
                                  }
                               }
                               i10 = i10 + 1;
                               i1 = 0;
                               i2 = 1;
                            }
                         }
                         i5 = i5 + 1;
                         i1 = 0;
                         i2 = 1;
                      }
                      if (i6 != -1) {
                         object oobject2 = ovk3.f[i6];
                         oobject2.a.c = -1;
                         oobject2.g(ovk3.l.v[i7]);
                         a = oobject2.a;
                         a.c = i6;
                         a.e(ovk3, oobject2);
                      }else {
                         i = 1;
                      }
                      int i11 = ovk3.i / 2;
                      if (i3 > i11) {
                         i = 1;
                      }
                      a = 0;
                      i2 = 1;
                   }
                }
                break ;
             }
          }else {
             i = 0;
             goto label_0020 ;
          }
       }
       this.r(p0);
       this.i();
       return;
    }
    public final void r(rk p0){
       rk a;
       fn6 uofn6;
       fn6 b;
       for (int i = 0; i < this.i; i = i + 1) {
          this.h[i] = false;
       }
       i = 0;
       int i1 = 0;
       while (true) {
          if (i) {
             return;
          }
          int i2 = 1;
          i1 = i1 + i2;
          int i3 = this.i * 2;
          if (i1 >= i3) {
             break ;
          }else if((a = p0.a) != null){
             this.h[a.b] = i2;
          }
          if ((uofn6 = p0.d(this.h)) != null) {
             vk3 th = this.h;
             b = uofn6.b;
             if (th[b]) {
                return;
             }else {
                th[b] = i2;
             }
          }
          if (uofn6 != null) {
             int i4 = -1;
             b = Float.MAX_VALUE;
             int i5 = 0;
             int i6 = -1;
             while (i5 < this.j) {
                object oobject = this.f[i5];
                if (oobject.a.z != i2 && (oobject.e == null && oobject.d.e(uofn6))) {
                   float f = oobject.d.i(uofn6);
                   if ((f) < 0) {
                      float f1 = - oobject.b;
                      f1 = f1 / f;
                      if ((f1 - b) < 0) {
                         i6 = i5;
                         float f2 = f1;
                      }
                   }
                }
                i5 = i5 + 1;
             }
             if (i6 > i4) {
                object oobject1 = this.f[i6];
                oobject1.a.c = i4;
                oobject1.g(uofn6);
                a = oobject1.a;
                a.c = i6;
                a.e(this, oobject1);
             }
          }else {
             i = 1;
          }
       }
       return;
    }
    public final void s(){
       object oobject;
       for (int i = 0; i < this.j; i = i + 1) {
          if ((oobject = this.f[i]) != null) {
             this.l.c.b(oobject);
          }
          this.f[i] = null;
       }
       return;
    }
    public final void t(){
       vk3 tl;
       object oobject;
       int i = 0;
       int i1 = 0;
       while (true) {
          tl = this.l;
          oy6 v = tl.v;
          if (i1 < v.length) {
             if ((oobject = v[i1]) != null) {
                oobject.c();
             }
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       oy6 t = tl.t;
       vk3 tm = this.m;
       vk3 tn = this.n;
       t.getClass();
       if (tn > tm.length) {
          tn = tm.length;
       }
       int i2 = 0;
       while (i2 < tn) {
          object oobject1 = tm[i2];
          th5 c = t.c;
          th5 b = t.b;
          if (c < b.length) {
             b[c] = oobject1;
             int i3 = c + 1;
             t.c = i3;
          }
          i2 = i2 + 1;
       }
       this.n = i;
       Arrays.fill(tl.v, null);
       this.b = i;
       vk3 tc = this.c;
       tc.h = i;
       tc.b = 0;
       this.i = 1;
       for (i1 = 0; i1 < this.j; i1 = i1 + 1) {
       }
       this.s();
       this.j = i;
       this.o = new rk(tl);
       return;
    }
}
