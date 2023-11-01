package p.mx;
import p.sp2;
import p.wq0;
import p.bq0;
import p.cq0;
import java.lang.Math;
import p.vk3;
import java.lang.Object;
import p.fn6;
import p.rk;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;
import p.kg4;

public final class mx extends sp2	// class@001f28 from classes.dex
{
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    public void mx(){
       super();
       this.s0 = 0;
       this.t0 = true;
       this.u0 = 0;
       this.v0 = false;
    }
    public final boolean B(){
       return this.v0;
    }
    public final boolean C(){
       return this.v0;
    }
    public final boolean S(){
       object oobject;
       mx ts0;
       mx ts01;
       mx ts02;
       mx ts03;
       int i = 0;
       int i1 = 0;
       int i2 = 1;
       while (true) {
          sp2 tr0 = this.r0;
          if (i1 < tr0) {
             oobject = this.q0[i1];
             if (this.t0 != null || (oobject.d() && ((ts0 = this.s0) == null || (ts0 == true && (!oobject.B() || ((ts0 = this.s0) == 2 || (ts0 == 3 && !oobject.C()))))))) {
                i2 = 0;
             }
             i1 = i1 + 1;
          }else if(i2 && tr0 > null){
             i1 = 0;
             i2 = 0;
             while (i < this.r0) {
                oobject = this.q0[i];
                if (this.t0 != null || oobject.d()) {
                   bq0 t = bq0.t;
                   bq0 b = bq0.b;
                   bq0 c = bq0.c;
                   bq0 a = bq0.a;
                   if (!i2) {
                      if ((ts01 = this.s0) == null) {
                         i1 = oobject.j(a).d();
                      }else if(ts01 == true){
                         i1 = oobject.j(c).d();
                      }else if(ts01 == 2){
                         i1 = oobject.j(b).d();
                      }else if(ts01 == 3){
                         i1 = oobject.j(t).d();
                      }
                      ts01 = 1;
                   }
                   if ((ts02 = this.s0) == null) {
                      i1 = Math.min(i1, oobject.j(a).d());
                   }else if(ts02 == true){
                      i1 = Math.max(i1, oobject.j(c).d());
                   }else if(ts02 == 2){
                      i1 = Math.min(i1, oobject.j(b).d());
                   }else if(ts02 == 3){
                      i1 = Math.max(i1, oobject.j(t).d());
                   }
                }
                i = i + 1;
             }
             i1 = i1 + this.u0;
             if ((ts03 = this.s0) != null && ts03 != true) {
                this.K(i1, i1);
             }else {
                this.J(i1, i1);
             }
             this.v0 = true;
             return true;
          }else {
             return i;
          }
       }
    }
    public final int T(){
       mx ts0;
       if ((ts0 = this.s0) == null || ts0 == 1) {
          return 0;
       }
       if (ts0 != 2 && ts0 != 3) {
          return -1;
       }
       return 1;
    }
    public final void c(vk3 p0,boolean p1){
       object oobject;
       mx s0;
       mx s01;
       mx s02;
       cq0 f;
       int i7;
       wq0 owq0 = this;
       vk3 ovk3 = p0;
       wq0 q = owq0.Q;
       int i = 0;
       wq0 i1 = owq0.I;
       q[i] = i1;
       int i2 = 2;
       wq0 j = owq0.J;
       q[i2] = j;
       int i3 = 1;
       wq0 k = owq0.K;
       q[i3] = k;
       int i4 = 3;
       wq0 l = owq0.L;
       q[i4] = l;
       for (int i5 = 0; i5 < q.length; i5 = i5 + 1) {
          oobject = q[i5];
          oobject.i = ovk3.k(oobject);
       }
       if ((s0 = owq0.s0) >= null && s0 < 4) {
          object oobject1 = q[s0];
          if (owq0.v0 == null) {
             this.S();
          }
          if (owq0.v0 != null) {
             owq0.v0 = i;
             if ((s01 = owq0.s0) != null && s01 != i3) {
                if (s01 == i2 || s01 == i4) {
                   ovk3.d(j.i, owq0.a0);
                   ovk3.d(l.i, owq0.a0);
                }
             }else {
                ovk3.d(i1.i, owq0.Z);
                ovk3.d(k.i, owq0.Z);
             }
             return;
          }else {
             i5 = 0;
             while (true) {
                if (i5 < owq0.r0) {
                   object oobject2 = owq0.q0[i5];
                   if (owq0.t0 == null && (!oobject2.d() || ((s02 = owq0.s0) != null && (s02 != i3 || (oobject2.T[i] != i4 || (oobject2.I.f == null || (oobject2.K.f == null && (s02 != i2 && (s02 != i4 || (oobject2.T[i3] != i4 || (oobject2.J.f == null || oobject2.L.f == null))))))))))) {
                      i5 = i5 + 1;
                   }else {
                      s0 = 1;
                   label_00b1 :
                      int i6 = (!i1.g() && !k.g())? 0: 1;
                      rk ork = (!j.g() && !l.g())? 0: 1;
                      s0 = (!s0 && ((s0 = owq0.s0) == null && (oobject2 || (s0 == i2 && (s02 || (s0 == i3 && (oobject2 || (s0 == i4 && s02))))))))? 1: 0;
                      i5 = (!s0)? 4: 5;
                      i6 = 0;
                      while (i6 < owq0.r0) {
                         object oobject3 = owq0.q0[i6];
                         if (owq0.t0 != null || oobject3.d()) {
                            fn6 uofn6 = ovk3.k(oobject3.Q[owq0.s0]);
                            mx s03 = owq0.s0;
                            oobject3 = oobject3.Q[s03];
                            oobject3.i = uofn6;
                            i3 = ((f = oobject3.f) != null && f.d == owq0)? oobject3.g + i: 0;
                            if (s03 != null && s03 != i2) {
                               int i8 = owq0.u0 + i3;
                               rk ork1 = p0.l();
                               fn6 uofn62 = p0.m();
                               uofn62.t = i;
                               ork1.b(oobject1.i, uofn6, uofn62, i8);
                               ovk3.c(ork1);
                            }else {
                               i7 = owq0.u0 - i3;
                               ork = p0.l();
                               fn6 uofn61 = p0.m();
                               uofn61.t = i;
                               ork.c(oobject1.i, uofn6, uofn61, i7);
                               ovk3.c(ork);
                            }
                            i7 = owq0.u0 + i3;
                            ovk3.e(oobject1.i, uofn6, i7, i5);
                         }
                         i6 = i6 + 1;
                         i2 = 2;
                         oobject = 4;
                      }
                      s01 = owq0.s0;
                      i2 = 8;
                      if (s01 == null) {
                         ovk3.e(k.i, i1.i, i, i2);
                         ovk3.e(i1.i, owq0.U.K.i, i, 4);
                         ovk3.e(i1.i, owq0.U.I.i, i, i);
                      }else if(s01 == 1){
                         ovk3.e(i1.i, k.i, i, i2);
                         ovk3.e(i1.i, owq0.U.I.i, i, 4);
                         ovk3.e(i1.i, owq0.U.K.i, i, i);
                      }else if(s01 == 2){
                         ovk3.e(l.i, j.i, i, i2);
                         ovk3.e(j.i, owq0.U.L.i, i, 4);
                         ovk3.e(j.i, owq0.U.J.i, i, i);
                      }else if(s01 == 3){
                         ovk3.e(j.i, l.i, i, i2);
                         ovk3.e(j.i, owq0.U.J.i, i, 4);
                         ovk3.e(j.i, owq0.U.L.i, i, i);
                      }
                   }
                }else {
                   s0 = 0;
                   goto label_00b1 ;
                }
             }
          }
       }
       return;
    }
    public final boolean d(){
       return true;
    }
    public final String toString(){
       String str = en6.p("[Barrier] ", this.i0, " {");
       for (int i = 0; i < this.r0; i = i + 1) {
          object oobject = this.q0[i];
          if (i > 0) {
             str = kg4.l(str, ", ");
          }
          str = en6.r(str).append(oobject.i0).toString();
       }
       return kg4.l(str, "}");
    }
}
