package p.ei3;
import p.bi3;
import p.jw3;
import p.oo5;
import p.i77;
import p.di3;
import p.am2;
import p.ng3;
import p.nq5;
import p.z04;

public final class ei3 extends bi3	// class@0001d8 from classes2.dex
{
    public final jw3 m;
    public final ng3 n;
    public final di3 o;
    public final i77 p;
    public final i77 q;

    public void ei3(jw3 p0,oo5 p1,int p2,int p3,int p4){
       bi3 td;
       super(p4);
       this.p = new i77(this);
       this.q = new i77(this);
       this.m = p0;
       this.n = p1;
       this.o = new di3(this, p2, p3);
       bi3 tb = this.b;
       int i = 0;
       tb[i] = i;
       tb[1] = i;
       tb[2] = i;
       tb[3] = i;
       tb.b = i;
       int i1 = 0;
       while (true) {
          td = this.d;
          if (i1 < td.length) {
             ng3.e(td[i1]);
             i1++;
          }else {
             break ;
          }
       }
       ng3.e(this.e);
       ng3.e(this.f);
       ng3.e(this.g);
       ng3.e(this.h);
       i1 = 0;
       while (true) {
          td = this.i;
          if (i1 < td.length) {
             ng3.e(td[i1]);
             i1++;
          }else {
             break ;
          }
       }
       i1 = 0;
       while (true) {
          td = this.j;
          if (i1 < td.length) {
             ng3.e(td[i1]);
             i1++;
          }else {
             break ;
          }
       }
       i1 = 0;
       while (true) {
          td = this.k;
          if (i1 < td.length) {
             ng3.e(td[i1]);
             i1++;
          }else {
             break ;
          }
       }
       ng3.e(this.l);
       while (true) {
          di3 t = this.o.t;
          if (i < t.length) {
             ng3.e(t[i].a);
             i++;
          }else {
             break ;
          }
       }
       this.p.x();
       this.q.x();
       return;
    }
    public final void a(){
       jw3 g;
       ei3 tn;
       int i7;
       int i8;
       int i9;
       am2 b;
       int i12;
       ei3 tm = this.m;
       if ((g = tm.g) > null) {
          tm.e(tm.h, g);
       }
       while (true) {
          g = tm.d;
          int i = 0;
          int i1 = 1;
          if (g < tm.f) {
             int i2 = 1;
          label_0016 :
             tn = this.n;
             if (i2) {
                int i3 = g & this.a;
                bi3 tc = this.c;
                int i4 = 9;
                int i5 = 3;
                int i6 = 7;
                if (!tn.a(this.d[tc.b], i3)) {
                   ei3 to = this.o;
                   ei3 m = to.v.m;
                   jw3 d = m.d;
                   i7 = d + 0;
                   i7 = i7 - 1;
                   if (d <= null) {
                      i7 = i7 + m.b;
                   }
                   i2 = m.i[i7] & 0x00ff;
                   z04 a = to.a;
                   i8 = a - 8;
                   i2 = i2 >> i8;
                   i9 = d & to.b;
                   i9 = i9 << a;
                   i2 = i2 + i9;
                   object oobject = to.t[i2];
                   di3 v = oobject.c.v;
                   m = (v.c.b < i6)? 1: 0;
                   i8 = 256;
                   if (m) {
                      do {
                         i3 = i1 << 1;
                      } while ((i1 = i3 | oobject.c.v.n.a(oobject.a, i1)) >= i8);
                   }else {
                      i2 = v.b[i];
                      to = v.m;
                      d = to.d;
                      i6 = d - i2;
                      i6 = i6 - 1;
                      if (i2 >= d) {
                         i6 = i6 + to.b;
                      }
                      i3 = to.i[i6] & 0x00ff;
                      i2 = 256;
                      i9 = 1;
                      do {
                         i3 = i3 << i1;
                         i6 = i3 & i2;
                         int i10 = i2 + i6;
                         i10 = i10 + i9;
                         int i11 = oobject.c.v.n.a(oobject.a, i10);
                         i9 = i9 << i1;
                         i9 = i9 | i11;
                         i11 = i11 - 0;
                         i6 = ~ i6;
                         i6 = i6 ^ i11;
                         i2 = i2 & i6;
                      } while (i9 >= i8);
                      i1 = i9;
                   }
                   v = oobject.c.v;
                   m = v.m;
                   jw3 d1 = m.d;
                   i6 = d1 + 1;
                   m.d = i6;
                   m.i[d1] = (byte)i1;
                   if (m.e < i6) {
                      m.e = i6;
                   }
                   bi3 c = v.c;
                   if ((b = c.b) > i5) {
                      i = (b <= i4)? b - 3: b - 6;
                   }
                   c.b = i;
                }else {
                   i8 = 2;
                   bi3 tb = this.b;
                   if (!tn.a(this.e, tc.b)) {
                      if (tc.b >= i6) {
                         i6 = 10;
                      }
                      tc.b = i6;
                      tb[i5] = tb[i8];
                      tb[i8] = tb[i1];
                      tb[i1] = tb[i];
                      if ((i7 = this.p.p(i3)) < 6) {
                         i5 = i7 - 2;
                      }
                      if ((i3 = tn.b(this.j[i5])) < 4) {
                         tb[i] = i3;
                      }else {
                         i2 = i3 >> 1;
                         i2 = i2 - i1;
                         i4 = i3 & 0x01;
                         i4 = i4 | i8;
                         i12 = i4 << i2;
                         tb[i] = i12;
                         if (i3 < 14) {
                            i3 = i3 - 4;
                            object oobject1 = this.k[i3];
                            i2 = 1;
                            i4 = 0;
                            i5 = 0;
                            while (true) {
                               i6 = tn.a(oobject1, i2);
                               i2 = i2 << i1;
                               i2 = i2 | i6;
                               i8 = i4 + 1;
                               i4 = i6 << i4;
                               i5 = i5 | i4;
                               if (i2 >= oobject1.length) {
                                  break ;
                               }else {
                                  i4 = i8;
                               }
                            }
                            i3 = i5 | i12;
                            tb[i] = i3;
                         }else {
                            i2 = i2 - 4;
                            i3 = 0;
                            do {
                               tn.f();
                               i4 = tn.b >> i1;
                               tn.b = i4;
                               ng3 c1 = tn.c;
                               i6 = c1 - i4;
                               i6 = i6 >> 31;
                               i8 = i6 - 1;
                               i4 = i4 & i8;
                               i5 = c1 - i4;
                               tn.c = i5;
                               i3 = i3 << i1;
                               i4 = i6 - 1;
                               i3 = i3 | i4;
                            } while (!(i2 = i2 - 1));
                            i3 = i3 << 4;
                            i4 = i3 | i12;
                            tb[i] = i4;
                            i3 = 1;
                            i2 = 0;
                            i5 = 0;
                            while (true) {
                               bi3 tl = this.l;
                               i8 = tn.a(tl, i3);
                               i3 = i3 << i1;
                               i3 = i3 | i8;
                               i12 = i2 + 1;
                               i2 = i8 << i2;
                               i5 = i5 | i2;
                               if (i3 >= tl.length) {
                                  break ;
                               }else {
                                  i2 = i12;
                               }
                            }
                            i3 = i4 | i5;
                            tb[i] = i3;
                         }
                      }
                   }else {
                      i12 = 11;
                      if (!tn.a(this.f, tc.b)) {
                         if (!tn.a(this.i[tc.b], i3)) {
                            if (tc.b >= i6) {
                               i4 = 11;
                            }
                            tc.b = i4;
                         label_01eb :
                            i7 = i1;
                         }
                      }else if(!tn.a(this.g, tc.b)){
                         i9 = tb[i1];
                      }else if(!tn.a(this.h, tc.b)){
                         i9 = tb[i8];
                      }else {
                         i9 = tb[i5];
                         tb[i5] = tb[i8];
                      }
                      tb[i8] = tb[i1];
                      tb[i1] = tb[i];
                      tb[i] = i9;
                      if (tc.b < i6) {
                         i12 = 8;
                      }
                      tc.b = i12;
                      i1 = this.q.p(i3);
                      goto label_01eb ;
                   }
                   tm.e(tb[i], i7);
                }
             }else {
                break ;
             }
          }else {
             b = 0;
             goto label_0016 ;
          }
       }
       tn.f();
       return;
    }
}
