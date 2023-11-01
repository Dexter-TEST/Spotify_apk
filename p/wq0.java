package p.wq0;
import java.lang.Object;
import java.util.HashMap;
import p.cq0;
import p.bq0;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;
import p.xq0;
import java.lang.Class;
import p.oy6;
import p.cp7;
import p.p91;
import p.vk3;
import java.lang.Math;
import java.util.HashSet;
import p.xe7;
import java.util.Iterator;
import p.fn6;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p.ug7;
import p.rk;
import p.qk;
import p.mx;
import p.jn2;
import p.vq2;
import java.lang.Enum;
import java.lang.AssertionError;

public class wq0	// class@002b85 from classes.dex
{
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final cq0 I;
    public final cq0 J;
    public final cq0 K;
    public final cq0 L;
    public final cq0 M;
    public final cq0 N;
    public final cq0 O;
    public final cq0 P;
    public final cq0[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public final int[] T;
    public wq0 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public nd0 b;
    public int b0;
    public nd0 c;
    public int c0;
    public vq2 d;
    public int d0;
    public ug7 e;
    public float e0;
    public final boolean[] f;
    public float f0;
    public boolean g;
    public Object g0;
    public int h;
    public int h0;
    public int i;
    public String i0;
    public String j;
    public int j0;
    public boolean k;
    public int k0;
    public boolean l;
    public final float[] l0;
    public boolean m;
    public final wq0[] m0;
    public boolean n;
    public final wq0[] n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public void wq0(){
       super();
       this.a = false;
       this.d = null;
       this.e = null;
       this.f = new boolean[2]{0x01,0x01};
       this.g = true;
       this.h = -1;
       this.i = -1;
       HashMap hashMap = new HashMap();
       this.k = false;
       this.l = false;
       this.m = false;
       this.n = false;
       this.o = -1;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       int[] ointArray = new int[2];
       this.t = ointArray;
       this.u = 0;
       this.v = 0;
       this.w = 0x3f800000;
       this.x = 0;
       this.y = 0;
       this.z = 0x3f800000;
       this.A = -1;
       this.B = 0x3f800000;
       this.C = new int[2]{0x7fffffff,0x7fffffff};
       this.D = Float.NaN;
       this.E = false;
       this.F = false;
       this.G = 0;
       this.H = 0;
       cq0 uocq0 = new cq0(this, bq0.a);
       this.I = uocq0;
       cq0 uocq01 = new cq0(this, bq0.b);
       this.J = uocq01;
       cq0 uocq02 = new cq0(this, bq0.c);
       this.K = uocq02;
       cq0 uocq03 = new cq0(this, bq0.t);
       this.L = uocq03;
       cq0 uocq04 = new cq0(this, bq0.v);
       this.M = uocq04;
       cq0 uocq05 = new cq0(this, bq0.x);
       this.N = uocq05;
       cq0 uocq06 = new cq0(this, bq0.y);
       this.O = uocq06;
       cq0 uocq07 = new cq0(this, bq0.w);
       this.P = uocq07;
       cq0[] uocq0Array = new cq0[]{uocq0,uocq02,uocq01,uocq03,uocq04,uocq07};
       this.Q = uocq0Array;
       ArrayList uArrayList = new ArrayList();
       this.R = uArrayList;
       boolean[] uobooleanArr = new boolean[2];
       this.S = uobooleanArr;
       this.T = new int[2]{1,1};
       this.U = null;
       this.V = 0;
       this.W = 0;
       this.X = 0;
       this.Y = -1;
       this.Z = 0;
       this.a0 = 0;
       this.b0 = 0;
       this.e0 = 0x3f000000;
       this.f0 = 0x3f000000;
       this.h0 = 0;
       this.i0 = null;
       this.j0 = 0;
       this.k0 = 0;
       this.l0 = new float[2]{0xbf800000,0xbf800000};
       wq0[] owq0Array = new wq0[]{null,null};
       this.m0 = owq0Array;
       wq0[] owq0Array1 = new wq0[]{null,null};
       this.n0 = owq0Array1;
       this.o0 = -1;
       this.p0 = -1;
       uArrayList.add(uocq0);
       uArrayList.add(uocq01);
       uArrayList.add(uocq02);
       uArrayList.add(uocq03);
       uArrayList.add(uocq05);
       uArrayList.add(uocq06);
       uArrayList.add(uocq07);
       uArrayList.add(uocq04);
    }
    public static void H(int p0,int p1,String p2,StringBuilder p3){
       if (p0 == p1) {
          return;
       }
       p3+p2+" :   "+p0+",\n";
       return;
    }
    public static void I(StringBuilder p0,String p1,float p2,float p3){
       if (!(p3 - p2)) {
          return;
       }
       p0+p1+" :   "+p2+",\n";
       return;
    }
    public static void p(StringBuilder p0,String p1,int p2,int p3,int p4,int p5,int p6,float p7,int p8){
       p0 = p0+p1+" :  {\n";
       p1 = en6.y(p8);
       if ("FIXED".equals(p1)) {
       }else {
          p0 = p0+"      behavior"+" :   "+p1+",\n";
       }
       wq0.H(p2, 0, "      size", p0);
       wq0.H(p3, 0, "      min", p0);
       wq0.H(p4, Integer.MAX_VALUE, "      max", p0);
       wq0.H(p5, 0, "      matchMin", p0);
       wq0.H(p6, 0, "      matchDef", p0);
       wq0.I(p0, "      matchPercent", p7, 0x3f800000);
       p0+"    },\n";
       return;
    }
    public static void q(StringBuilder p0,String p1,cq0 p2){
       if (p2.f == null) {
          return;
       }
       p0 = p0+"    "+p1+" : [ \'"+p2.f+"\'";
       if (p2.h != Integer.MIN_VALUE || p2.g != null) {
          p1 = ",";
          p0 = p0+p1+p2.g;
          if (p2.h != Integer.MIN_VALUE) {
             p0 = p0+p1+p2.h+p1;
          }
       }
       p0+" ] ,\n";
       return;
    }
    public final boolean A(){
       boolean b = (this.g != null && this.h0 != 8)? true: false;
       return b;
    }
    public boolean B(){
       boolean b = (this.k == null && (this.I.c == null && this.K.c != null))? false: true;
       return b;
    }
    public boolean C(){
       boolean b = (this.l == null && (this.J.c == null && this.L.c != null))? false: true;
       return b;
    }
    public void D(){
       this.I.j();
       this.J.j();
       this.K.j();
       this.L.j();
       this.M.j();
       this.N.j();
       this.O.j();
       this.P.j();
       this.U = null;
       this.D = Float.NaN;
       this.V = 0;
       this.W = 0;
       this.X = 0;
       this.Y = -1;
       this.Z = 0;
       this.a0 = 0;
       this.b0 = 0;
       this.c0 = 0;
       this.d0 = 0;
       this.e0 = 0x3f000000;
       this.f0 = 0x3f000000;
       wq0 tT = this.T;
       tT[0] = 1;
       tT[1] = 1;
       this.g0 = null;
       this.h0 = 0;
       this.j0 = 0;
       this.k0 = 0;
       wq0 tl0 = this.l0;
       tl0[0] = 0xbf800000;
       tl0[1] = 0xbf800000;
       this.o = -1;
       this.p = -1;
       tl0 = this.C;
       tl0[0] = Integer.MAX_VALUE;
       tl0[1] = Integer.MAX_VALUE;
       this.r = 0;
       this.s = 0;
       this.w = 0x3f800000;
       this.z = 0x3f800000;
       this.v = Integer.MAX_VALUE;
       this.y = Integer.MAX_VALUE;
       this.u = 0;
       this.x = 0;
       this.A = -1;
       this.B = 0x3f800000;
       tl0 = this.f;
       tl0[0] = 1;
       tl0[1] = 1;
       this.F = false;
       tl0 = this.S;
       tl0[0] = 0;
       tl0[1] = 0;
       this.g = true;
       tl0 = this.t;
       tl0[0] = 0;
       tl0[1] = 0;
       this.h = -1;
       this.i = -1;
    }
    public final void E(){
       wq0 tU;
       if ((tU = this.U) != null && tU instanceof xq0) {
          tU.getClass();
       }
       tU = this.R;
       int i = tU.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          tU.get(i1).j();
       }
       return;
    }
    public final void F(){
       this.k = false;
       this.l = false;
       this.m = false;
       this.n = false;
       wq0 tR = this.R;
       int i = tR.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          cq0 uocq0 = tR.get(i1);
          uocq0.c = false;
          uocq0.b = 0;
       }
       return;
    }
    public void G(oy6 p0){
       this.I.k();
       this.J.k();
       this.K.k();
       this.L.k();
       this.M.k();
       this.P.k();
       this.N.k();
       this.O.k();
    }
    public final void J(int p0,int p1){
       if (this.k != null) {
          return;
       }
       this.I.l(p0);
       this.K.l(p1);
       this.Z = p0;
       this.V = p1 - p0;
       this.k = true;
       return;
    }
    public final void K(int p0,int p1){
       if (this.l != null) {
          return;
       }
       this.J.l(p0);
       this.L.l(p1);
       this.a0 = p0;
       this.W = p1 - p0;
       if (this.E != null) {
          this.M.l((p0 + this.b0));
       }
       this.l = true;
       return;
    }
    public final void L(int p0){
       this.W = p0;
       wq0 td0 = this.d0;
       if (p0 < td0) {
          this.W = td0;
       }
       return;
    }
    public final void M(int p0){
       this.T[0] = p0;
    }
    public final void N(int p0){
       this.T[1] = p0;
    }
    public final void O(int p0){
       this.V = p0;
       wq0 tc0 = this.c0;
       if (p0 < tc0) {
          this.V = tc0;
       }
       return;
    }
    public void P(boolean p0,boolean p1){
       wq0 tV;
       wq0 td = this.d;
       int i = p0 & td.g;
       wq0 te = this.e;
       int i1 = p1 & te.g;
       p91 g = td.h.g;
       p91 g1 = te.h.g;
       p91 g2 = td.i.g;
       p91 g3 = te.i.g;
       int i2 = g3 - g1;
       if (((g2 - g)) < 0 || (i2 < 0 || (g == Integer.MIN_VALUE || (g == Integer.MAX_VALUE || (g1 == Integer.MIN_VALUE || (g1 == Integer.MAX_VALUE || (g2 == Integer.MIN_VALUE || (g2 == Integer.MAX_VALUE || (g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE))))))))) {
          g2 = 0;
          g3 = 0;
          g = 0;
          g1 = 0;
       }
       int i3 = g2 - g;
       int i4 = g3 - g1;
       if (i) {
          this.Z = g;
       }
       if (i1) {
          this.a0 = g1;
       }
       if (this.h0 == 8) {
          this.V = 0;
          this.W = 0;
          return;
       }else {
          wq0 tT = this.T;
          if (i) {
             if (tT[0] == 1) {
                tV = this.V;
                if (i3 < tV) {
                   i3 = tV;
                }
             }
             this.V = i3;
             tV = this.c0;
             if (i3 < tV) {
                this.V = tV;
             }
          }
          if (i1) {
             if (tT[1] == 1) {
                tV = this.W;
                if (i4 < tV) {
                   i4 = tV;
                }
             }
             this.W = i4;
             tV = this.d0;
             if (i4 < tV) {
                this.W = tV;
             }
          }
          return;
       }
    }
    public void Q(vk3 p0,boolean p1){
       wq0 td;
       cp7 i4;
       wq0 te;
       cp7 i5;
       int i8;
       wq0 owq0;
       wq0 owq01;
       p0.getClass();
       int i = vk3.n(this.I);
       int i1 = vk3.n(this.J);
       int i2 = vk3.n(this.K);
       int i3 = vk3.n(this.L);
       if (p1 && (td = this.d) != null) {
          cp7 h = td.h;
          if (h.j != null) {
             i4 = td.i;
             if (i4.j != null) {
                i = h.g;
                i2 = i4.g;
             }
          }
       }
       if (p1 && (te = this.e) != null) {
          i4 = te.h;
          if (i4.j != null) {
             i5 = te.i;
             if (i5.j != null) {
                i1 = i4.g;
                i3 = i5.g;
             }
          }
       }
       int i6 = i3 - i1;
       int i7 = 0;
       if (((i2 - i)) >= 0 && i6 >= 0) {
          i5 = Integer.MIN_VALUE;
          if (i != i5) {
             i6 = Integer.MAX_VALUE;
             if (i != i6 && (i1 != i5 && (i1 != i6 && (i2 != i5 && (i2 != i6 && (i3 != i5 && i3 != i6)))))) {
             label_0069 :
                i2 = i2 - i;
                i3 = i3 - i1;
                this.Z = i;
                this.a0 = i1;
                if (this.h0 == 8) {
                   this.V = i7;
                   this.W = i7;
                }else {
                   wq0 tT = this.T;
                   if ((i8 = tT[i7]) == 1) {
                      td = this.V;
                      if (i2 < td) {
                         owq0 = td;
                      }
                   }
                   if (tT[1] == 1) {
                      td = this.W;
                      if (i3 < td) {
                         owq01 = td;
                      }
                   }
                   this.V = owq0;
                   this.W = owq01;
                   td = this.d0;
                   if (owq01 < td) {
                      this.W = td;
                   }
                   td = this.c0;
                   if (owq0 < td) {
                      this.V = td;
                   }
                   if ((td = this.v) > null && i8 == 3) {
                      this.V = Math.min(this.V, td);
                   }
                   if ((te = this.y) > null && tT[1] == 3) {
                      this.W = Math.min(this.W, te);
                   }
                   tT = this.V;
                   if (owq0 != tT) {
                      this.h = tT;
                   }
                   tT = this.W;
                   if (owq01 != tT) {
                      this.i = tT;
                   }
                }
                return;
             }
          }
       }
       i = 0;
       i1 = 0;
       i2 = 0;
       i3 = 0;
       goto label_0069 ;
    }
    public final void b(xq0 p0,vk3 p1,HashSet p2,int p3,boolean p4){
       cq0 a;
       Iterator iterator;
       if (p4) {
          if (!p2.contains(this)) {
             return;
          }else {
             xe7.h(p0, p1, this);
             p2.remove(this);
             this.c(p1, p0.W(64));
          }
       }
       if (!p3) {
          if ((a = this.I.a) != null) {
             iterator = a.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.b(p0, p1, p2, p3, true);
             }
          }
          if ((a = this.K.a) != null) {
             iterator = a.iterator();
             while (iterator.hasNext()) {
                iterator.next().d.b(p0, p1, p2, p3, true);
             }
          }
       }else if((a = this.J.a) != null){
          iterator = a.iterator();
          while (iterator.hasNext()) {
             iterator.next().d.b(p0, p1, p2, p3, true);
          }
       }
       if ((a = this.L.a) != null) {
          iterator = a.iterator();
          while (iterator.hasNext()) {
             iterator.next().d.b(p0, p1, p2, p3, true);
          }
       }
       if ((a = this.M.a) != null) {
          iterator = a.iterator();
          while (iterator.hasNext()) {
             iterator.next().d.b(p0, p1, p2, p3, true);
          }
       }
       return;
    }
    public void c(vk3 p0,boolean p1){
       boolean i3;
       int i5;
       int i6;
       wq0 owq01;
       cq0 a;
       xq0 h0;
       wq0 e;
       wq0 owq02;
       cp7 h;
       int i7;
       int b;
       boolean i8;
       boolean b1;
       boolean b2;
       boolean b3;
       wq0 owq06;
       int i12;
       wq0 owq07;
       wq0 owq08;
       int i13;
       int i14;
       int i15;
       vk3 ovk31;
       fn6 uofn610;
       fn6 uofn611;
       fn6 uofn612;
       fn6 uofn614;
       wq0 owq010;
       fn6 uofn615;
       wq0 owq011;
       fn6 uofn616;
       wq0 owq012;
       wq0 owq013;
       fn6 uofn617;
       fn6 uofn618;
       fn6 uofn619;
       int i22;
       int i23;
       boolean b8;
       fn6 uofn620;
       fn6 uofn621;
       float f1;
       rk ork;
       vk3 ovk32;
       bq0 a1;
       wq0 owq0 = this;
       vk3 ovk3 = p0;
       wq0 i = owq0.I;
       fn6 uofn6 = ovk3.k(i);
       wq0 k = owq0.K;
       fn6 uofn61 = ovk3.k(k);
       wq0 j = owq0.J;
       fn6 uofn62 = ovk3.k(j);
       wq0 l = owq0.L;
       fn6 uofn63 = ovk3.k(l);
       wq0 m = owq0.M;
       fn6 uofn64 = ovk3.k(m);
       wq0 u = owq0.U;
       boolean i1 = 2;
       int i2 = 0;
       if (u != null) {
          u = u.T;
          i3 = (u[i2] == i1)? 1: 0;
          i2 = 1;
          int i4 = (u[i2] == i1)? 1: 0;
          if ((u = owq0.q) != i2) {
             if (u != i1) {
                if (u != 3) {
                   i5 = i3;
                   i6 = i4;
                }else {
                label_004e :
                   uofn612 = 0;
                label_0050 :
                   i6 = uofn612;
                   i5 = 0;
                }
             }else {
                goto label_0050 ;
             }
          }else {
             i5 = i3;
             i6 = 0;
          }
       }else {
          goto label_004e ;
       }
       wq0 s = owq0.S;
       if (owq0.h0 == 8) {
          u = owq0.R;
          i1 = u.size();
          i2 = 0;
          while (true) {
             if (i2 < i1) {
                owq01 = u;
                a = ((a = u.get(i2).a) == null || a.size() <= 0)? 0: 1;
                if (a) {
                   a = 1;
                label_0087 :
                   if (!a && (!s[0] && !s[1])) {
                      return;
                   }
                }else {
                   i2 = i2 + 1;
                   u = owq01;
                }
             }else {
                ork = 0;
                goto label_0087 ;
             }
          }
          owq0.k = false;
          owq0.l = false;
          return;
       }
       if ((u = owq0.k) != null || owq0.l != null) {
          if (u != null) {
             ovk3.d(uofn6, owq0.Z);
             ovk3.d(uofn61, (owq0.Z + owq0.V));
             if (i5 && (u = owq0.U) != null) {
                if ((h0 = u.H0) == null || (h0.get() == null || i.d() > u.H0.get().d())) {
                   u.H0 = new WeakReference(i);
                }
                if ((h0 = u.J0) == null || (h0.get() == null || k.d() > u.J0.get().d())) {
                   u.J0 = new WeakReference(k);
                }
             }
          }
          if (owq0.l != null) {
             ovk3.d(uofn62, owq0.a0);
             ovk3.d(uofn63, (owq0.a0 + owq0.W));
             a = ((a = m.a) == null || a.size() <= 0)? 0: 1;
             if (a) {
                ovk3.d(uofn64, (owq0.a0 + owq0.b0));
             }
             if (i6 && (u = owq0.U) != null) {
                if ((h0 = u.G0) == null || (h0.get() == null || j.d() > u.G0.get().d())) {
                   u.G0 = new WeakReference(j);
                }
                if ((h0 = u.I0) == null || (h0.get() == null || l.d() > u.I0.get().d())) {
                   u.I0 = new WeakReference(l);
                }
             }
          }
          if (owq0.k != null && owq0.l != null) {
             owq0.k = false;
             owq0.l = false;
             return;
          }
       }
       wq0 f = owq0.f;
       if (p1 && ((u = owq0.d) != null && (e = owq0.e) != null)) {
          owq02 = s;
          h = u.h;
          owq01 = m;
          if (h.j != null && (u.i.j != null && (e.h.j != null && e.i.j != null))) {
             ovk3.d(uofn6, h.g);
             ovk3.d(uofn61, owq0.d.i.g);
             ovk3.d(uofn62, owq0.e.h.g);
             ovk3.d(uofn63, owq0.e.i.g);
             ovk3.d(uofn64, owq0.e.k.g);
             if (owq0.U != null) {
                if (i5) {
                   i7 = 0;
                   if (f[i7] && !this.y()) {
                      ovk3.f(ovk3.k(owq0.U.K), uofn61, i7, 8);
                   }
                }
                if (i6 && (f[1] && !this.z())) {
                   ovk3.f(ovk3.k(owq0.U.L), uofn63, 0, 8);
                }
             }
             b = false;
          }
       }else {
          owq02 = s;
          owq01 = m;
       }
       if (owq0.U != null) {
          i8 = 0;
          if (owq0.x(i8)) {
             owq0.U.S(i8, owq0);
             i8 = 1;
          }else {
             i8 = this.y();
          }
          i1 = 1;
          if (owq0.x(i1)) {
             owq0.U.S(i1, owq0);
             e = 1;
          }else {
             i1 = this.z();
          }
          if (!i8 && (i5 && (owq0.h0 != 8 && (i.f == null && k.f == null)))) {
             b1 = i8;
             ovk3.f(ovk3.k(owq0.U.K), uofn61, 0, 1);
          }else {
             b1 = i8;
          }
          if (!e && (i6 && (owq0.h0 != 8 && (j.f == null && (l.f == null && owq01 == null))))) {
             ovk3.f(ovk3.k(owq0.U.L), uofn63, 0, 1);
          }
          b2 = e;
          b3 = b1;
       }else {
          b2 = false;
          b3 = 0;
       }
       u = owq0.V;
       e = owq0.c0;
       if (u >= e) {
          e = u;
       }
       s = owq0.W;
       m = owq0.d0;
       if (s >= m) {
          m = s;
       }
       fn6 uofn65 = uofn62;
       wq0 t = owq0.T;
       wq0 owq03 = e;
       i1 = t[0];
       fn6 uofn66 = uofn64;
       uofn64 = 3;
       wq0 owq04 = m;
       int i9 = 1;
       int i10 = (i1 != uofn64)? 1: 0;
       int i11 = t[i9];
       fn6 uofn67 = uofn63;
       uofn64 = (i11 != uofn64)? 1: 0;
       wq0 y = owq0.Y;
       owq0.A = y;
       wq0 owq05 = f;
       f = owq0.X;
       owq0.B = f;
       fn6 uofn68 = uofn61;
       wq0 r = owq0.r;
       fn6 uofn69 = uofn6;
       wq0 s1 = owq0.s;
       if ((0 - f) > 0) {
          owq06 = t;
          if (owq0.h0 != 8) {
             t = 3;
             if (i1 == t && r == null) {
                r = 3;
             }
             if (i11 == t && s1 == null) {
                s1 = 3;
             }
             if (i1 == t && (i11 == t && (r == t && s1 == t))) {
                t = -1;
                if (y == t) {
                   if (i10 && !uofn64) {
                      owq0.A = 0;
                   }else if(!i10 && uofn64){
                      owq0.A = 1;
                      if (y == t) {
                         owq0.B = 0x3f800000 / f;
                      }
                   }
                }
                if (owq0.A == null && (!j.h() && l.h())) {
                   owq0.A = 1;
                }else if(owq0.A == 1 && (!i.h() && k.h())){
                   owq0.A = 0;
                }
                if (owq0.A == -1 && (!j.h() && (l.h() && (i.h() && k.h())))) {
                   if (j.h() && l.h()) {
                      owq0.A = 0;
                   }else if(i.h() && k.h()){
                      owq0.B = 0x3f800000 / owq0.B;
                      owq0.A = 1;
                   }
                }
                if (owq0.A == -1) {
                   if ((i = owq0.u) > null && owq0.x == null) {
                      owq0.A = 0;
                   }else if(i == null && owq0.x > null){
                      owq0.B = 0x3f800000 / owq0.B;
                      owq0.A = 1;
                   }
                }
             }else {
                ovk32 = 3;
                if (i1 == ovk32 && r == ovk32) {
                   owq0.A = 0;
                   i1 = (int)(f * (float)s);
                   if (i11 != ovk32) {
                      owq08 = s1;
                      i12 = owq04;
                      owq07 = 4;
                   }else {
                      f1 = 0x3f800000;
                   label_03e4 :
                      m = owq04;
                   label_03e6 :
                      i12 = m;
                      owq07 = r;
                      owq08 = s1;
                      i13 = 1;
                   }
                }else if(i11 == ovk32 && s1 == ovk32){
                   owq0.A = 1;
                   if (y == -1) {
                      owq0.B = 0x3f800000 / f;
                   }else {
                      f1 = 0x3f800000;
                   }
                   i11 = (int)(owq0.B * (float)u);
                   if (i1 != ovk32) {
                      i12 = i11;
                      owq07 = r;
                      e = owq03;
                      i13 = 0;
                      owq08 = 4;
                   }else {
                      e = owq03;
                      goto label_03e6 ;
                   }
                }
             }
             e = owq03;
             goto label_03e4 ;
          }else {
          label_03f1 :
             owq07 = r;
             owq08 = s1;
             e = owq03;
             i12 = owq04;
             i13 = 0;
          }
       }else {
          owq06 = t;
          goto label_03f1 ;
       }
       i = owq0.t;
       i[0] = owq07;
       i[1] = owq08;
       if (i13) {
          i = owq0.A;
          k = -1;
          if (i == null || i == k) {
             i14 = 1;
          label_0414 :
             if (i13 && ((i = owq0.A) == 1 && i != k)) {
                i7 = 0;
                i15 = 1;
             }else {
                i7 = 0;
                i15 = 0;
             }
             boolean b4 = (owq06[i7] == 2 && owq0 instanceof xq0)? true: false;
             int i16 = (b4)? 0: e;
             wq0 p = owq0.P;
             int i17 = p.h() ^ 0x01;
             boolean b5 = owq02[0];
             boolean b6 = owq02[1];
             r = owq0.C;
             if (owq0.o != 2 && owq0.k == null) {
                if (p1 && (i = owq0.d) != null) {
                   cp7 h1 = i.h;
                   if (h1.j != null && i.i.j != null) {
                      if (p1) {
                         ovk31 = p0;
                         uofn611 = uofn69;
                         ovk31.d(uofn611, h1.g);
                         uofn610 = uofn68;
                         ovk31.d(uofn610, owq0.d.i.g);
                         if (owq0.U != null && i5) {
                            i7 = 0;
                            if (owq05[i7] && !this.y()) {
                               ovk31.f(ovk31.k(owq0.U.K), uofn610, i7, 8);
                            label_049c :
                               uofn617 = uofn610;
                               uofn618 = uofn611;
                               owq011 = l;
                               owq013 = r;
                               owq010 = owq01;
                               uofn616 = uofn65;
                               uofn614 = uofn66;
                               uofn615 = uofn67;
                               owq012 = owq06;
                            label_0571 :
                               owq06 = p;
                            label_0573 :
                               if (p1) {
                                  owq0 = this;
                                  if ((i = owq0.e) != null) {
                                     h1 = i.h;
                                     if (h1.j != null && i.i.j != null) {
                                        ovk3 = p0;
                                        uofn6 = uofn616;
                                        ovk3.d(uofn6, h1.g);
                                        uofn61 = uofn615;
                                        ovk3.d(uofn61, owq0.e.i.g);
                                        uofn619 = uofn614;
                                        ovk3.d(uofn619, owq0.e.k.g);
                                        if ((i = owq0.U) != null && (!b2 && i6)) {
                                           i22 = 1;
                                           if (owq05[i22]) {
                                              b = 8;
                                              i23 = 0;
                                              ovk3.f(ovk3.k(i.L), uofn61, i23, b);
                                           }else {
                                              b = 8;
                                              i23 = 0;
                                           }
                                        }else {
                                           b = 8;
                                           i23 = 0;
                                           i22 = 1;
                                        }
                                        h = 0;
                                     label_05e6 :
                                        i8 = 2;
                                        uofn610 = (owq0.p == i8)? 0: h;
                                        if (uofn610 && owq0.l == null) {
                                           b4 = (owq012[i22] == i8 && owq0 instanceof xq0)? true: false;
                                           if (b4) {
                                              i12 = 0;
                                           }
                                           uofn64 = ((i = owq0.U) != null)? ovk3.k(i.L): null;
                                           uofn610 = ((i = owq0.U) != null)? ovk3.k(i.J): null;
                                           if ((i = owq0.b0) > null || owq0.h0 == b) {
                                              u = owq010;
                                              if (u.f != null) {
                                                 ovk3.e(uofn619, uofn6, i, b);
                                                 ovk3.e(uofn619, ovk3.k(u.f), u.e(), b);
                                                 if (i6) {
                                                    ovk3.f(uofn64, ovk3.k(owq011), i23, 5);
                                                 }
                                                 b8 = false;
                                              label_065d :
                                                 i3 = owq05[i22];
                                                 i11 = owq012[i22];
                                                 e = owq0.J;
                                                 u = owq0.L;
                                                 k = owq0.a0;
                                                 i = owq0.d0;
                                                 i9 = owq013[i22];
                                                 j = owq0.f0;
                                                 uofn612 = (owq012[i23] == 3)? 1: 0;
                                                 uofn620 = uofn61;
                                                 uofn621 = uofn6;
                                                 this.e(p0, 0, i6, i5, i3, uofn610, uofn64, i11, b4, e, u, k, i12, i, i9, j, i15, uofn612, b2, b3, b6, owq08, owq07, owq0.x, owq0.y, owq0.z, b8);
                                              }else if(owq0.h0 == b){
                                                 ovk3.e(uofn619, uofn6, u.e(), b);
                                              }else {
                                                 ovk3.e(uofn619, uofn6, i, b);
                                              }
                                           }
                                           b8 = i17;
                                           goto label_065d ;
                                        }else {
                                           uofn620 = uofn61;
                                           uofn621 = uofn6;
                                        }
                                        if (i13) {
                                           i = this;
                                           f1 = 0xbf800000;
                                           if (i.A == 1) {
                                              k = i.B;
                                              ork = p0.l();
                                              ork.d.d(uofn620, f1);
                                              ork.d.d(uofn621, 0x3f800000);
                                              ork.d.d(uofn617, k);
                                              ork.d.d(uofn618, (- k));
                                              ovk32 = p0;
                                              ovk32.c(ork);
                                           }else {
                                              ovk32 = p0;
                                              u = i.B;
                                              rk ork2 = p0.l();
                                              ork2.d.d(uofn617, f1);
                                              ork2.d.d(uofn618, 0x3f800000);
                                              ork2.d.d(uofn620, u);
                                              ork2.d.d(uofn621, (- u));
                                              ovk32.c(ork2);
                                           }
                                        }else {
                                           i = this;
                                           ovk32 = p0;
                                        }
                                        if (owq06.h()) {
                                           j = owq06;
                                           a = j.f.d;
                                           a1 = bq0.a;
                                           bq0 b9 = bq0.b;
                                           bq0 c = bq0.c;
                                           bq0 t1 = bq0.t;
                                           rk ork1 = p0.l();
                                           double d = (double)(float)Math.toRadians((double)(i.D + 90.00f));
                                           double d1 = (double)j.e();
                                           ork1.d.d(ovk32.k(a.j(b9)), 0x3f000000);
                                           ork1.d.d(ovk32.k(a.j(t1)), 0x3f000000);
                                           ork1.d.d(ovk32.k(i.j(b9)), 0xbf000000);
                                           ork1.d.d(ovk32.k(i.j(t1)), 0xbf000000);
                                           ork1.b = - (float)(Math.sin(d) * d1);
                                           ovk32.c(ork1);
                                           ork = p0.l();
                                           ork.d.d(ovk32.k(a.j(a1)), 0x3f000000);
                                           ork.d.d(ovk32.k(a.j(c)), 0x3f000000);
                                           ork.d.d(ovk32.k(i.j(a1)), 0xbf000000);
                                           ork.d.d(ovk32.k(i.j(c)), 0xbf000000);
                                           ork.b = - (float)(Math.cos(d) * d1);
                                           ovk32.c(ork);
                                        }
                                        i.k = false;
                                        i.l = false;
                                        return;
                                     }
                                  }
                                  ovk3 = p0;
                                  uofn619 = uofn614;
                                  uofn61 = uofn615;
                                  uofn6 = uofn616;
                                  b = 8;
                                  i23 = 0;
                                  i22 = 1;
                               }else {
                                  b = 8;
                                  i23 = 0;
                                  i22 = 1;
                                  owq0 = this;
                                  ovk3 = p0;
                                  uofn619 = uofn614;
                                  uofn61 = uofn615;
                                  uofn6 = uofn616;
                               }
                               a1 = 1;
                               goto label_05e6 ;
                            }
                         }
                         a1 = 8;
                         goto label_049c ;
                      }else {
                         i22 = p0;
                      }
                   }
                }
                ovk31 = p0;
                uofn610 = uofn68;
                uofn611 = uofn69;
                uofn612 = ((i = owq0.U) != null)? ovk31.k(i.K): 0;
                fn6 uofn613 = ((i = owq0.U) != null)? ovk31.k(i.I): 0;
                int i18 = 0;
                boolean b7 = owq05[i18];
                int i19 = owq06[i18];
                u = owq0.I;
                k = owq0.K;
                i = owq0.Z;
                int i20 = r[i18];
                wq0 owq09 = owq0.c0;
                j = owq0.e0;
                int i21 = (owq06[1] == 3)? 1: 0;
                uofn614 = uofn66;
                owq010 = owq01;
                uofn615 = uofn67;
                owq011 = l;
                uofn616 = uofn65;
                owq012 = owq06;
                owq013 = r;
                uofn617 = uofn610;
                uofn618 = uofn611;
                owq06 = p;
                this.e(p0, 1, i5, i6, b7, uofn613, uofn612, i19, b4, u, k, i, i16, owq09, i20, j, i14, i21, b3, b2, b5, owq07, owq08, owq0.u, owq0.v, owq0.w, i17);
                goto label_0573 ;
             }
             owq011 = l;
             owq010 = owq01;
             uofn616 = uofn65;
             uofn614 = uofn66;
             uofn615 = uofn67;
             uofn617 = uofn68;
             uofn618 = uofn69;
             owq012 = owq06;
             owq013 = r;
             goto label_0571 ;
          }
       }else {
          ovk32 = -1;
       }
       i14 = 0;
       goto label_0414 ;
    }
    public boolean d(){
       boolean b = (this.h0 != 8)? true: false;
       return b;
    }
    public final void e(vk3 p0,boolean p1,boolean p2,boolean p3,boolean p4,fn6 p5,fn6 p6,int p7,boolean p8,cq0 p9,cq0 p10,int p11,int p12,int p13,int p14,float p15,boolean p16,boolean p17,boolean p18,boolean p19,boolean p20,int p21,int p22,int p23,int p24,float p25,boolean p26){
       wq0 owq01;
       int b3;
       int i9;
       fn6 uofn65;
       fn6 uofn66;
       fn6 uofn67;
       int i10;
       cq0 f1;
       fn6 uofn68;
       int i12;
       int i13;
       int i14;
       int i15;
       int i16;
       cq0 uocq01;
       cq0 uocq02;
       fn6 uofn69;
       fn6 uofn610;
       wq0 owq02;
       wq0 owq03;
       int i17;
       int i19;
       fn6 uofn612;
       cq0 e;
       fn6 uofn613;
       wq0 owq0 = this;
       vk3 ovk3 = p0;
       fn6 obj = p9;
       cq0 obj1 = p10;
       int i = p13;
       int i1 = p14;
       int i2 = p23;
       int i3 = p24;
       float f = p25;
       fn6 uofn6 = ovk3.k(obj);
       fn6 uofn61 = ovk3.k(obj1);
       fn6 uofn62 = ovk3.k(obj.f);
       fn6 uofn63 = ovk3.k(obj1.f);
       int b = p9.h();
       int b1 = p10.h();
       int b2 = owq0.P.h();
       int i4 = (b1)? b + 1: b;
       if (b2) {
          i4 = i4 + 1;
       }
       int i5 = i4;
       obj1 = (p16)? 3: p21;
       if (p7) {
          fn6 uofn64 = uofn63;
          int i6 = p7 - 1;
          int i7 = 1;
          wq0 owq04 = (i6 && (i6 != i7 && (i6 == 2 && obj1 != 4)))? 1: 0;
          wq0 h = owq0.h;
          int i8 = i6;
          i6 = -1;
          if (h != i6 && p1) {
             owq0.h = i6;
             owq01 = h;
             i8 = 0;
          }
          if ((h = owq0.i) != i6 && !p1) {
             owq0.i = i6;
             i8 = 0;
          }else {
             h = owq01;
          }
          owq01 = h;
          if (owq0.h0 == 8) {
             i6 = 0;
             i8 = 0;
          }else {
             owq04 = owq01;
          }
          if (p26) {
             if (!b && (!b1 && !b2)) {
                ovk3.d(uofn6, p11);
             }else if(b && !b1){
                b3 = b2;
                b2 = 8;
                ovk3.e(uofn6, uofn62, p9.e(), b2);
             label_00af :
                if (!i8) {
                   if (p8) {
                      ovk3.e(uofn61, uofn6, 0, 3);
                      if (i > 0) {
                         ovk3.f(uofn61, uofn6, i, b2);
                      }
                      if (i1 < Integer.MAX_VALUE) {
                         ovk3.g(uofn61, uofn6, i1, b2);
                      }
                   }else {
                      ovk3.e(uofn61, uofn6, i6, b2);
                   }
                }else if(i5 != 2 && (!p16 && (obj1 == 1 && obj1))){
                   int i11 = Math.max(i2, i6);
                   if (i3 > 0) {
                      i11 = Math.min(i3, i11);
                   }
                   ovk3.e(uofn61, uofn6, i11, 8);
                   i7 = p4;
                   i9 = i5;
                   b2 = i2;
                   i8 = 0;
                label_01ab :
                   if (p26 && !p18) {
                      if (!b && (!b1 && !b3)) {
                         obj1 = p10;
                         uofn67 = uofn61;
                         i10 = i7;
                         uofn68 = uofn64;
                      label_01be :
                         uofn65 = 5;
                         i1 = p2;
                      }else if(b && !b1){
                         f1 = obj.f.d;
                         f1 = (p2 && f1 instanceof mx)? 8: 5;
                         obj1 = p10;
                         uofn67 = uofn61;
                         i10 = i7;
                         uofn68 = uofn64;
                         i7 = f1;
                         i1 = p2;
                      label_04b1 :
                         if (i1 && i10) {
                            if (obj1.f != null) {
                               i1 = p10.e();
                               uofn66 = p6;
                            }else {
                               uofn66 = p6;
                               i1 = 0;
                            }
                            if (uofn68 != uofn66) {
                               ovk3.f(uofn66, uofn67, i1, i7);
                            }
                         }
                         return;
                      }else if(!b && b1){
                         uofn63 = uofn64;
                         ovk3.e(uofn61, uofn63, (- p10.e()), 8);
                         if (p2) {
                            ovk3.f(uofn6, p5, 0, 5);
                         }
                      }else {
                         i11 = p5;
                         uofn63 = uofn64;
                         if (b && b1) {
                            cq0 d = obj.f.d;
                            cq0 uocq0 = p10;
                            f1 = uocq0.f.d;
                            wq0 u = owq0.U;
                            b = 6;
                            if (i8) {
                               if (!obj1) {
                                  if (!i3 && !b2) {
                                     if (uofn62.w != null && uofn63.w != null) {
                                        ovk3.e(uofn6, uofn62, p9.e(), 8);
                                        ovk3.e(uofn61, uofn63, (- p10.e()), 8);
                                        return;
                                     }else {
                                        i12 = 8;
                                        b1 = 8;
                                        uofn64 = 0;
                                        b3 = 1;
                                        i9 = 0;
                                     }
                                  }else {
                                     i12 = 5;
                                     b1 = 5;
                                     i19 = 1;
                                     b3 = 0;
                                     i9 = 1;
                                  }
                                  if (!d instanceof mx && !f1 instanceof mx) {
                                     i = b1;
                                     i13 = b3;
                                     uofn66 = 6;
                                     b1 = obj1;
                                     b3 = uofn64;
                                     i19 = i12;
                                  }else {
                                     i = b1;
                                     i13 = b3;
                                     uofn66 = 6;
                                     b1 = obj1;
                                     b3 = uofn64;
                                     uofn64 = 4;
                                  }
                               }else if(obj1 == 2){
                                  if (!d instanceof mx && !f1 instanceof mx) {
                                     b1 = obj1;
                                     uofn66 = 6;
                                     uocq01 = 5;
                                     i19 = 5;
                                  label_028b :
                                     b3 = 1;
                                     i9 = 1;
                                     i13 = 0;
                                  }else {
                                     b1 = obj1;
                                     uofn66 = 6;
                                     uocq01 = 5;
                                  }
                               }else if(obj1 == 1){
                                  b1 = obj1;
                                  uofn66 = 6;
                                  uocq01 = 8;
                               }else if(obj1 == 3){
                                  b1 = obj1;
                                  if (owq0.A == -1) {
                                     i14 = p6;
                                     if (p19) {
                                        uofn66 = (p2)? 5: 4;
                                     }else {
                                        uofn66 = 8;
                                     }
                                     uocq01 = 8;
                                  label_02ad :
                                     i19 = 5;
                                  }else if(p16){
                                     uofn66 = ((i14 = p22) != 2 && i14 != 1)? 0: 1;
                                     if (!uofn66) {
                                        uofn66 = 8;
                                        i14 = 5;
                                     }else {
                                        uofn66 = 5;
                                        i14 = 4;
                                     }
                                     i = uofn66;
                                     i19 = i14;
                                     uofn66 = 6;
                                     b3 = 1;
                                     i9 = 1;
                                     i13 = 1;
                                  }else if(i3 > 0){
                                     i14 = p6;
                                     uofn66 = 6;
                                     uocq01 = 5;
                                     goto label_02ad ;
                                  }else if(!i3 && !b2){
                                     if (!p19) {
                                        i14 = p6;
                                        uofn66 = 6;
                                        uocq01 = 5;
                                        i19 = 8;
                                     }else if(d != u && f1 != u){
                                        uofn66 = 4;
                                     }else {
                                        uofn66 = 5;
                                     }
                                     i14 = p6;
                                     i = uofn66;
                                     uofn66 = 6;
                                  }else {
                                     i14 = p6;
                                     uofn66 = 6;
                                     uocq01 = 5;
                                  }
                                  i19 = 4;
                                  b3 = 1;
                                  i9 = 1;
                                  i13 = 1;
                               }else {
                                  b1 = obj1;
                                  i14 = p6;
                                  uofn66 = 6;
                                  uocq01 = 5;
                                  i19 = 4;
                                  b3 = 0;
                                  i9 = 0;
                               label_0358 :
                                  i13 = 0;
                               }
                               i19 = 4;
                               goto label_028b ;
                               i14 = p6;
                            }else {
                               b1 = obj1;
                               if (uofn62.w != null && uofn63.w != null) {
                                  p0.b(uofn6, uofn62, p9.e(), p15, uofn63, uofn61, p10.e(), 8);
                                  if (p2 && i7) {
                                     if (uocq0.f != null) {
                                        i7 = p10.e();
                                        uofn612 = p6;
                                     }else {
                                        uofn612 = p6;
                                        i7 = 0;
                                     }
                                     if (uofn63 != uofn612) {
                                        ovk3.f(uofn612, uofn61, i7, 5);
                                     }
                                  }
                                  return;
                               }else {
                                  i14 = p6;
                                  uofn66 = 6;
                                  uocq01 = 5;
                                  i19 = 4;
                                  b3 = 1;
                                  i9 = 1;
                                  goto label_0358 ;
                               }
                            }
                            if (i9 && (uofn62 == uofn63 && d != u)) {
                               i9 = 0;
                               i15 = 0;
                            }else {
                               i15 = i9;
                               i9 = 1;
                            }
                            if (b3) {
                               if (!i8 && (!p17 && (!p19 && (uofn62 == i11 && uofn63 == i14)))) {
                                  i = 0;
                                  i9 = 8;
                                  i16 = 0;
                               }else {
                                  b3 = i;
                                  i16 = i9;
                                  i = p2;
                                  i9 = uofn66;
                               }
                               uocq01 = f1;
                               obj1 = uocq0;
                               i10 = i7;
                               uocq02 = d;
                               p7 = b2;
                               uofn69 = uofn63;
                               uofn610 = uofn62;
                               owq02 = u;
                               uofn61 = uofn61;
                               obj = uofn6;
                               p0.b(uofn6, uofn62, p9.e(), p15, uofn63, uofn61, p10.e(), i9);
                               i1 = i;
                               i3 = 8;
                               i9 = i16;
                            }else {
                               obj1 = uocq0;
                               uofn69 = uofn63;
                               fn6 uofn611 = uofn61;
                               i10 = i7;
                               p7 = b2;
                               owq02 = u;
                               i3 = i;
                               uocq01 = f1;
                               uocq02 = d;
                               uofn610 = uofn62;
                               obj = uofn6;
                               i1 = p2;
                            }
                            if (owq0.h0 == 8) {
                               uocq0 = ((uocq0 = obj1.a) == null || uocq0.size() <= 0)? 0: 1;
                               if (!uocq0) {
                                  return;
                               }
                            }
                            if (i15) {
                               if (i1) {
                                  uofn68 = uofn69;
                                  if (uofn610 != uofn68 && (!i8 && (uocq02 instanceof mx && !uocq01 instanceof mx))) {
                                     i3 = 6;
                                  }
                               }else {
                                  uofn68 = uofn69;
                               }
                               ovk3.f(obj, uofn610, p9.e(), i3);
                               uofn67 = uofn61;
                               ovk3.g(uofn67, uofn68, (- p10.e()), i3);
                            }else {
                               uofn68 = uofn69;
                               uofn67 = uofn61;
                            }
                            if (i1 && (p20 && (!uocq02 instanceof mx && !uocq01 instanceof mx))) {
                               owq03 = owq02;
                               if (uocq01 != owq03) {
                                  i3 = 6;
                                  i6 = 6;
                                  i17 = 1;
                               label_0426 :
                                  if (i17) {
                                     if (i13 && (!p19 && !p3)) {
                                        if (uocq02 != owq03 && uocq01 != owq03) {
                                           b = i6;
                                        }
                                        if (uocq02 instanceof jn2 || uocq01 instanceof jn2) {
                                           b = 5;
                                        }
                                        if (uocq02 instanceof mx || uocq01 instanceof mx) {
                                           b = 5;
                                        }
                                        int i18 = (p19)? 5: b;
                                        i6 = Math.max(i18, i6);
                                     }
                                     if (i1) {
                                        i3 = Math.min(i3, i6);
                                        i7 = (p16 && (!p19 && (uocq02 == owq03 && uocq01 != owq03)))? 4: i3;
                                     }else {
                                        i7 = i6;
                                     }
                                     ovk3.e(obj, uofn610, p9.e(), i7);
                                     ovk3.e(uofn67, uofn68, (- p10.e()), i7);
                                  }
                                  if (i1) {
                                     uofn65 = p5;
                                     uofn66 = uofn610;
                                     i6 = (uofn65 == uofn66)? p9.e(): 0;
                                     if (uofn66 != uofn65) {
                                        ovk3.f(obj, uofn65, i6, 5);
                                     }
                                  }
                                  if (i1 && (i8 && (!p13 && !p7))) {
                                     if (i8 && b1 == 3) {
                                        ovk3.f(uofn67, obj, 0, 8);
                                     }else {
                                        ovk3.f(uofn67, obj, 0, 5);
                                     }
                                  }
                                  owq03 = 5;
                               }
                            }else {
                               owq03 = owq02;
                            }
                            i6 = uofn64;
                            i17 = i9;
                            goto label_0426 ;
                         }
                      }
                      obj1 = p10;
                      uofn68 = uofn63;
                      uofn67 = uofn61;
                      i10 = i7;
                      goto label_01be ;
                      i7 = 5;
                      goto label_04b1 ;
                   }else {
                      uofn65 = p5;
                      uofn66 = p6;
                      uofn67 = uofn61;
                      obj = uofn6;
                      i10 = i7;
                      i5 = 3;
                      if (i9 < 2 && (p2 && i10)) {
                         ovk3.f(obj, uofn65, 0, 8);
                         wq0 m = owq0.M;
                         h = (!p1 && m.f != null)? 0: 1;
                         if (!p1 && (f1 = m.f) != null) {
                            f1 = f1.d;
                            if (0 - f1.X) {
                               m = f1.T;
                               if (m[0] == i5 && m[1] == i5) {
                                  h = 1;
                               }
                            }
                            h = 0;
                         }
                         if (h) {
                            ovk3.f(uofn66, uofn67, 0, 8);
                         }
                      }
                      return;
                   }
                }else {
                   uocq02 = -2;
                   if (i2 == uocq02) {
                      i2 = i6;
                   }
                   if (i3 == uocq02) {
                      i3 = i6;
                   }
                   if (i6 > null && obj1 != 1) {
                      i6 = 0;
                   }
                   if (i2 > 0) {
                      ovk3.f(uofn61, uofn6, i2, 8);
                      i6 = Math.max(i6, i2);
                   }
                   if (i3 > 0) {
                      uocq02 = (p2 && obj1 == 1)? 0: 1;
                      if (uocq02) {
                         i7 = 8;
                         ovk3.g(uofn61, uofn6, i3, i7);
                      }else {
                         i7 = 8;
                      }
                      i6 = Math.min(i6, i3);
                   }else {
                      i7 = 8;
                   }
                   if (obj1 == 1) {
                      if (p2) {
                         ovk3.e(uofn61, uofn6, i6, i7);
                      }else if(p18){
                         ovk3.e(uofn61, uofn6, i6, 5);
                         ovk3.g(uofn61, uofn6, i6, i7);
                      }else {
                         ovk3.e(uofn61, uofn6, i6, 5);
                         ovk3.g(uofn61, uofn6, i6, i7);
                      }
                   }else if(obj1 == 2){
                      bq0 b4 = bq0.b;
                      bq0 t = bq0.t;
                      if ((e = obj.e) != b4 && e != t) {
                         uofn63 = ovk3.k(owq0.U.j(bq0.a));
                         uofn613 = ovk3.k(owq0.U.j(bq0.c));
                      }else {
                         uofn63 = ovk3.k(owq0.U.j(b4));
                         uofn613 = ovk3.k(owq0.U.j(t));
                      }
                      rk ork = p0.l();
                      i9 = i5;
                      ork.d.d(uofn61, 0xbf800000);
                      ork.d.d(uofn6, 0x3f800000);
                      ork.d.d(uofn613, f);
                      ork.d.d(uofn63, (- f));
                      ovk3.c(ork);
                      if (p2) {
                         i8 = 0;
                      }
                      i7 = p4;
                   label_00ce :
                      b2 = i2;
                      goto label_01ab ;
                   }else {
                      i9 = i5;
                      b2 = i2;
                      uofn613 = 1;
                      goto label_01ab ;
                   }
                }
                i7 = p4;
                i9 = i5;
                goto label_00ce ;
             }
          }
          b3 = b2;
          b2 = 8;
          goto label_00af ;
       }else {
          throw null;
       }
    }
    public final void f(bq0 p0,wq0 p1,bq0 p2,int p3){
       cq0 uocq0;
       cq0 uocq01;
       cq0 uocq04;
       bq0 w = bq0.w;
       bq0 y = bq0.y;
       bq0 x = bq0.x;
       bq0 a = bq0.a;
       bq0 b = bq0.b;
       bq0 c = bq0.c;
       bq0 t = bq0.t;
       int i = 0;
       if (p0 == w) {
          if (p2 == w) {
             uocq0 = this.j(a);
             uocq01 = this.j(c);
             cq0 uocq02 = this.j(b);
             cq0 uocq03 = this.j(t);
             int i1 = 1;
             if (uocq0 != null && (uocq0.h() || (uocq01 != null && uocq01.h()))) {
                uocq0 = 0;
             }else {
                this.f(a, p1, a, i);
                this.f(c, p1, c, i);
                uocq0 = 1;
             }
             if (uocq02 != null && (uocq02.h() || (uocq03 != null && uocq03.h()))) {
                i1 = 0;
             }else {
                this.f(b, p1, b, i);
                this.f(t, p1, t, i);
             }
             if (uocq0 && i1) {
                this.j(w).a(p1.j(w), i);
             }else if(uocq0){
                this.j(x).a(p1.j(x), i);
             }else if(i1){
                this.j(y).a(p1.j(y), i);
             }
          }else if(p2 != a && p2 != c){
             if (p2 == b || p2 == t) {
                this.f(b, p1, p2, i);
                this.f(t, p1, p2, i);
                this.j(w).a(p1.j(p2), i);
             }
          }else {
             this.f(a, p1, p2, i);
             this.f(c, p1, p2, i);
             this.j(w).a(p1.j(p2), i);
          }
       }else if(p0 == x && (p2 == a && p2 != c)){
          uocq04 = p1.j(p2);
          this.j(a).a(uocq04, i);
          this.j(c).a(uocq04, i);
          this.j(x).a(uocq04, i);
       }else if(p0 == y && (p2 == b && p2 != t)){
          uocq0 = p1.j(p2);
          this.j(b).a(uocq0, i);
          this.j(t).a(uocq0, i);
          this.j(y).a(uocq0, i);
       }else if(p0 == x && p2 == x){
          this.j(a).a(p1.j(a), i);
          this.j(c).a(p1.j(c), i);
          this.j(x).a(p1.j(p2), i);
       }else if(p0 == y && p2 == y){
          this.j(b).a(p1.j(b), i);
          this.j(t).a(p1.j(t), i);
          this.j(y).a(p1.j(p2), i);
       }else {
          cq0 uocq05 = this.j(p0);
          uocq04 = p1.j(p2);
          if (uocq05.i(uocq04)) {
             p2 = bq0.v;
             if (p0 == p2) {
                uocq0 = this.j(b);
                uocq01 = this.j(t);
                if (uocq0 != null) {
                   uocq0.j();
                }
                if (uocq01 != null) {
                   uocq01.j();
                }
             }else if(p0 != b && p0 != t){
                if (p0 == a || p0 == c) {
                   uocq01 = this.j(w);
                   if (uocq01.f != uocq04) {
                      uocq01.j();
                   }
                   uocq0 = this.j(p0).f();
                   uocq01 = this.j(x);
                   if (uocq01.h()) {
                      uocq0.j();
                      uocq01.j();
                   }
                }
             }else if((uocq01 = this.j(p2)) != null){
                uocq01.j();
             }
             uocq01 = this.j(w);
             if (uocq01.f != uocq04) {
                uocq01.j();
             }
             uocq0 = this.j(p0).f();
             uocq01 = this.j(y);
             if (uocq01.h()) {
                uocq0.j();
                uocq01.j();
             }
             uocq05.a(uocq04, p3);
          }
       }
       return;
    }
    public final void g(cq0 p0,cq0 p1,int p2){
       if (p0.d == this) {
          this.f(p0.e, p1.d, p1.e, p2);
       }
       return;
    }
    public final void h(vk3 p0){
       p0.k(this.I);
       p0.k(this.J);
       p0.k(this.K);
       p0.k(this.L);
       if (this.b0 > null) {
          p0.k(this.M);
       }
       return;
    }
    public final void i(){
       if (this.d == null) {
          this.d = new vq2(this);
       }
       if (this.e == null) {
          this.e = new ug7(this);
       }
       return;
    }
    public cq0 j(bq0 p0){
       switch (p0.ordinal()){
           case 0:
             return null;
           case 1:
             return this.I;
           case 2:
             return this.J;
           case 3:
             return this.K;
           case 4:
             return this.L;
           case 5:
             return this.M;
           case 6:
             return this.P;
           case 7:
             return this.N;
           case 8:
             return this.O;
           default:
             throw new AssertionError(p0.name());
       }
    }
    public final int k(int p0){
       wq0 tT = this.T;
       if (!p0) {
          return tT[0];
       }
       if (p0 == 1) {
          return tT[1];
       }
       return 0;
    }
    public final int l(){
       if (this.h0 == 8) {
          return 0;
       }
       return this.W;
    }
    public final wq0 m(int p0){
       wq0 tK;
       cq0 f;
       if (!p0) {
          tK = this.K;
          if ((f = tK.f) != null && f.f == tK) {
             return f.d;
          }
       }else if(p0 == 1){
          tK = this.L;
          if ((f = tK.f) != null && f.f == tK) {
             return f.d;
          }
       }
       return null;
    }
    public final wq0 n(int p0){
       wq0 tI;
       cq0 f;
       if (!p0) {
          tI = this.I;
          if ((f = tI.f) != null && f.f == tI) {
             return f.d;
          }
       }else if(p0 == 1){
          tI = this.J;
          if ((f = tI.f) != null && f.f == tI) {
             return f.d;
          }
       }
       return null;
    }
    public void o(StringBuilder p0){
       wq0 owq0 = this;
       StringBuilder str = p0+"  "+owq0.j+":{\n"+"    actualWidth:"+owq0.V+"\n"+"    actualHeight:"+owq0.W+"\n"+"    actualLeft:"+owq0.Z+"\n"+"    actualTop:"+owq0.a0+"\n";
       wq0.q(str, "left", owq0.I);
       wq0.q(str, "top", owq0.J);
       wq0.q(str, "right", owq0.K);
       wq0.q(str, "bottom", owq0.L);
       wq0.q(str, "baseline", owq0.M);
       wq0.q(str, "centerX", owq0.N);
       wq0.q(str, "centerY", owq0.O);
       wq0 c = owq0.C;
       wq0 t = owq0.T;
       wq0 l0 = owq0.l0;
       wq0.p(p0, "    width", owq0.V, owq0.c0, c[0], owq0.u, owq0.r, owq0.w, t[0]);
       wq0.p(p0, "    height", owq0.W, owq0.d0, c[1], owq0.x, owq0.s, owq0.z, t[1]);
       wq0 x = owq0.X;
       wq0 y = owq0.Y;
       if (!(0 - x)) {
       }else {
          str = str+"    dimensionRatio"+" :  ["+x+","+y+""+"],\n";
       }
       wq0.I(str, "    horizontalBias", owq0.e0, 0x3f000000);
       wq0.I(str, "    verticalBias", owq0.f0, 0x3f000000);
       wq0.H(owq0.j0, 0, "    horizontalChainStyle", str);
       wq0.H(owq0.k0, 0, "    verticalChainStyle", str);
       str+"  }";
       return;
    }
    public final int r(){
       if (this.h0 == 8) {
          return 0;
       }
       return this.V;
    }
    public final int s(){
       wq0 tU;
       if ((tU = this.U) != null && tU instanceof xq0) {
          return (tU.x0 + this.Z);
       }
       return this.Z;
    }
    public final int t(){
       wq0 tU;
       if ((tU = this.U) != null && tU instanceof xq0) {
          return (tU.y0 + this.a0);
       }
       return this.a0;
    }
    public String toString(){
       String str = "";
       StringBuilder str1 = en6.r(str);
       if (this.i0 != null) {
          str = en6.p("id: ", this.i0, " ");
       }
       return en6.o(str1+str+"\("+this.Z+", "+this.a0+"\) - \("+this.V+" x ", this.W, "\)");
    }
    public final boolean u(int p0){
       int i;
       boolean b = true;
       if (!p0) {
          p0 = (this.I.f != null)? 1: 0;
          i = (this.K.f != null)? 1: 0;
          if (((p0 + i)) >= 2) {
             b = false;
          }
          return b;
       }else if(this.J.f != null){
          p0 = 1;
       }else {
          p0 = 0;
       }
       i = (this.L.f != null)? 1: 0;
       p0 = p0 + i;
       i = (this.M.f != null)? 1: 0;
       if (((p0 + i)) >= 2) {
          b = false;
       }
       return b;
    }
    public final boolean v(int p0,int p1){
       wq0 tI;
       cq0 f;
       wq0 tK;
       cq0 f1;
       boolean b = true;
       if (!p0) {
          tI = this.I;
          if ((f = tI.f) != null && f.c != null) {
             tK = this.K;
             if ((f1 = tK.f) != null && f1.c != null) {
                if ((((f1.d() - tK.e()) - (tI.e() + tI.f.d()))) < p1) {
                   b = false;
                }
                return b;
             }
          }
       }else {
          tI = this.J;
          if ((f = tI.f) != null && f.c != null) {
             tK = this.L;
             if ((f1 = tK.f) != null && f1.c != null) {
                if ((((f1.d() - tK.e()) - (tI.e() + tI.f.d()))) < p1) {
                   b = false;
                }
                return b;
             }
          }
       }
       return false;
    }
    public final void w(bq0 p0,wq0 p1,bq0 p2,int p3,int p4){
       this.j(p0).b(p1.j(p2), p3, p4, true);
    }
    public final boolean x(int p0){
       cq0 f;
       int i;
       cq0 f1;
       p0 = p0 * 2;
       wq0 tQ = this.Q;
       object oobject = tQ[p0];
       if ((f = oobject.f) != null && f.f != oobject) {
          i = 1;
          object oobject1 = tQ[(p0 + i)];
          if ((f1 = oobject1.f) != null && f1.f == oobject1) {
          label_001c :
             return i;
          }
       }
       i = false;
       goto label_001c ;
    }
    public final boolean y(){
       cq0 f;
       wq0 tI = this.I;
       if ((f = tI.f) == null || f.f != tI) {
          tI = this.K;
          if ((f = tI.f) == null || f.f != tI) {
             return false;
          }
       }
       return true;
    }
    public final boolean z(){
       cq0 f;
       wq0 tJ = this.J;
       if ((f = tJ.f) == null || f.f != tJ) {
          tJ = this.L;
          if ((f = tJ.f) == null || f.f != tJ) {
             return false;
          }
       }
       return true;
    }
}
