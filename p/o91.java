package p.o91;
import p.xq0;
import java.lang.Object;
import java.util.ArrayList;
import p.b00;
import p.p91;
import p.i06;
import p.cp7;
import p.wq0;
import java.util.Iterator;
import p.l91;
import p.ug7;
import p.ap7;
import p.cq0;
import p.kb1;
import p.vq2;
import p.jn2;
import p.kn2;
import p.nd0;
import java.util.HashSet;
import p.sp2;
import p.rp2;
import java.util.Collection;
import java.lang.Class;
import p.et0;
import java.lang.Math;
import p.iq0;

public final class o91	// class@0020d3 from classes.dex
{
    public final xq0 a;
    public boolean b;
    public boolean c;
    public final xq0 d;
    public final ArrayList e;
    public iq0 f;
    public final b00 g;
    public final ArrayList h;

    public void o91(xq0 p0){
       super();
       this.b = true;
       this.c = true;
       this.e = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       this.f = null;
       this.g = new b00();
       this.h = new ArrayList();
       this.a = p0;
       this.d = p0;
    }
    public final void a(p91 p0,int p1,int p2,ArrayList p3,i06 p4){
       l91 ol91;
       p0 = p0.d;
       if (p0.c == null) {
          o91 ta = this.a;
          if (p0 != ta.d && p0 != ta.e) {
             if (p4 == null) {
                p4 = new i06(p0);
                p3.add(p4);
             }
             p0.c = p4;
             p4.b.add(p0);
             cp7 h = p0.h;
             Iterator iterator = h.k.iterator();
             while (iterator.hasNext()) {
                ol91 = iterator.next();
                if (ol91 instanceof p91) {
                   this.a(ol91, p1, 0, p3, p4);
                }
             }
             cp7 i = p0.i;
             Iterator iterator1 = i.k.iterator();
             while (iterator1.hasNext()) {
                ol91 = iterator1.next();
                if (ol91 instanceof p91) {
                   this.a(ol91, p1, 1, p3, p4);
                }
             }
             if (p1 == 1 && p0 instanceof ug7) {
                Iterator iterator2 = p0.k.k.iterator();
                while (iterator2.hasNext()) {
                   ol91 = iterator2.next();
                   if (ol91 instanceof p91) {
                      this.a(ol91, p1, 2, p3, p4);
                   }
                }
             }
             Iterator iterator3 = h.l.iterator();
             while (iterator3.hasNext()) {
                this.a(iterator3.next(), p1, 0, p3, p4);
             }
             iterator3 = i.l.iterator();
             while (iterator3.hasNext()) {
                this.a(iterator3.next(), p1, 1, p3, p4);
             }
             if (p1 == 1 && p0 instanceof ug7) {
                Iterator iterator4 = p0.k.l.iterator();
                while (iterator4.hasNext()) {
                   this.a(iterator4.next(), p1, 2, p3, p4);
                }
             }
          }
       }
       return;
    }
    public final void b(xq0 p0){
       int i7;
       float f1;
       float f2;
       float f4;
       ap7 uoap7 = p0;
       Iterator iterator = uoap7.q0.iterator();
       while (iterator.hasNext()) {
          wq0 owq0 = iterator.next();
          wq0 t = owq0.T;
          int i = t[0];
          int i1 = t[1];
          if (owq0.h0 == 8) {
             owq0.a = true;
          }else {
             wq0 w = owq0.w;
             int i2 = 0x3f800000;
             int i3 = 3;
             int i4 = 2;
             if ((w - i2) < 0 && i == i3) {
                owq0.r = i4;
             }
             wq0 z = owq0.z;
             if ((z - i2) < 0 && i1 == i3) {
                owq0.s = i4;
             }
             if ((0 - owq0.X) > 0) {
                if (i == i3 && (i1 == i4 && i1 != 1)) {
                   owq0.r = i3;
                }else if(i1 == i3 && (i == i4 && i != 1)){
                   owq0.s = i3;
                }else if(i == i3 && i1 == i3){
                   if (owq0.r == null) {
                      owq0.r = i3;
                   }
                   if (owq0.s == null) {
                      owq0.s = i3;
                   }
                }
             }
             wq0 k = owq0.K;
             wq0 i5 = owq0.I;
             if (i == i3 && (owq0.r == 1 && (i5.f == null && k.f != null))) {
                i = 2;
             }
             wq0 l = owq0.L;
             wq0 j = owq0.J;
             i2 = (i1 == i3 && (owq0.s == 1 && (j.f == null && l.f != null)))? 2: i1;
             t = owq0.d;
             t.d = i;
             wq0 r = owq0.r;
             t.a = r;
             t = owq0.e;
             t.d = i2;
             wq0 s = owq0.s;
             t.a = s;
             i1 = 4;
             if (i != i1 && (i != 1 && (i != i4 || (i2 != i1 && (i2 != 1 && i2 != i4))))) {
                float f = 0x3f000000;
                i5 = uoap7.T;
                l = owq0.Q;
                j = 3;
                if (i == j && (i2 == i4 && i2 != 1)) {
                   if (r == j) {
                      if (i2 == i4) {
                         i3 = 2;
                         this.f(owq0, i3, 0, i3, 0);
                      }
                      i7 = owq0.l();
                      f1 = (float)i7 * owq0.X;
                      f1 = f1 + f;
                      i7 = (int)f1;
                      i3 = 1;
                      this.f(owq0, i3, i7, i3, i7);
                      owq0.d.e.d(owq0.r());
                      owq0.e.e.d(owq0.l());
                      owq0.a = true;
                   }else if(r == 1){
                      this.f(owq0, 2, 0, i2, 0);
                      owq0.d.e.m = owq0.r();
                   }else if(r == i4){
                      if ((i4 = i5[0]) == 1 || i4 == i1) {
                         f2 = w * (float)p0.r();
                         f2 = f2 + f;
                         this.f(owq0, 1, (int)f2, i2, owq0.l());
                         owq0.d.e.d(owq0.r());
                         owq0.e.e.d(owq0.l());
                         owq0.a = true;
                      }
                   }else if(l[0].f != null && l[1].f != null){
                      this.f(owq0, 2, 0, i2, 0);
                      owq0.d.e.d(owq0.r());
                      owq0.e.e.d(owq0.l());
                      owq0.a = true;
                   }
                }
                i4 = 3;
                if (i2 == i4) {
                   j = 2;
                   if (i == j || i == 1) {
                      if (s == i4) {
                         if (i == j) {
                            i3 = 2;
                            this.f(owq0, i3, 0, i3, 0);
                         }
                         i7 = owq0.r();
                         t = owq0.X;
                         if (owq0.Y == -1) {
                            f1 = 0x3f800000 / t;
                         }
                         float f3 = (float)i7 * f1;
                         f3 = f3 + f;
                         i4 = (int)f3;
                         i3 = 1;
                         this.f(owq0, i3, i7, i3, i4);
                         owq0.d.e.d(owq0.r());
                         owq0.e.e.d(owq0.l());
                         owq0.a = true;
                      }else if(s == 1){
                         this.f(owq0, i, 0, 2, 0);
                         owq0.e.e.m = owq0.l();
                      }else if(s == 2){
                         if ((i4 = i5[1]) == 1 || i4 == i1) {
                            f4 = z * (float)p0.l();
                            f4 = f4 + f;
                            this.f(owq0, i, owq0.r(), 1, (int)f4);
                            owq0.d.e.d(owq0.r());
                            owq0.e.e.d(owq0.l());
                            owq0.a = true;
                         }
                      }else if(l[2].f != null && l[3].f != null){
                         this.f(owq0, 2, 0, i2, 0);
                         owq0.d.e.d(owq0.r());
                         owq0.e.e.d(owq0.l());
                         owq0.a = true;
                      }
                   }
                }
                f1 = 3;
                if (i == f1 && i2 == f1) {
                   if (r != 1 && s != 1) {
                      f1 = 2;
                      if (s == f1 && (r == f1 && (i5[0] == 1 && i5[1] == 1))) {
                         f2 = w * (float)p0.r();
                         f2 = f2 + f;
                         f4 = z * (float)p0.l();
                         f4 = f4 + f;
                         i3 = 1;
                         this.f(owq0, i3, (int)f2, i3, (int)f4);
                         owq0.d.e.d(owq0.r());
                         owq0.e.e.d(owq0.l());
                         owq0.a = true;
                      }
                   }else {
                      i3 = 2;
                      this.f(owq0, i3, 0, i3, 0);
                      owq0.d.e.m = owq0.r();
                      owq0.e.e.m = owq0.l();
                   }
                }
             }else {
                int i6 = owq0.r();
                if (i == i1) {
                   i6 = p0.r() - i5.g;
                   i6 = i6 - k.g;
                   i7 = i6;
                   i = 1;
                }else {
                   i7 = i6;
                }
                i6 = owq0.l();
                if (i2 == i1) {
                   i1 = p0.l() - j.g;
                   i1 = i1 - l.g;
                   i4 = i1;
                   i3 = 1;
                }else {
                   i4 = i6;
                   i3 = i2;
                }
                this.f(owq0, i, i7, i3, i4);
                owq0.d.e.d(owq0.r());
                owq0.e.e.d(owq0.l());
                owq0.a = true;
             }
          }
       }
       return;
    }
    public final void c(){
       o91 te = this.e;
       te.clear();
       o91 td = this.d;
       td.d.f();
       td.e.f();
       te.add(td.d);
       te.add(td.e);
       Iterator iterator = td.q0.iterator();
       HashSet hashSet = null;
       while (true) {
          int i = 1;
          int i1 = 0;
          if (iterator.hasNext()) {
             wq0 owq0 = iterator.next();
             if (owq0 instanceof jn2) {
                te.add(new kn2(owq0));
             }else if(owq0.y()){
                if (owq0.b == null) {
                   owq0.b = new nd0(i1, owq0);
                }
                if (hashSet == null) {
                   hashSet = new HashSet();
                }
                hashSet.add(owq0.b);
             }else {
                te.add(owq0.d);
             }
             if (owq0.z()) {
                if (owq0.c == null) {
                   owq0.c = new nd0(i, owq0);
                }
                if (hashSet == null) {
                   hashSet = new HashSet();
                }
                hashSet.add(owq0.c);
             }else {
                te.add(owq0.e);
             }
             if (owq0 instanceof sp2) {
                te.add(new rp2(owq0));
             }
          }else if(hashSet != null){
             te.addAll(hashSet);
          }
          iterator = te.iterator();
          while (iterator.hasNext()) {
             iterator.next().f();
          }
          Iterator iterator1 = te.iterator();
          while (iterator1.hasNext()) {
             cp7 uocp7 = iterator1.next();
             if (uocp7.b == td) {
                continue ;
             }
             uocp7.d();
          }
          te = this.h;
          te.clear();
          td = this.a;
          this.e(td.d, i1, te);
          this.e(td.e, i, te);
          this.b = i1;
          return;
       }
    }
    public final int d(xq0 p0,int p1){
       long l1;
       o91 oo91;
       int i3;
       wq0 d;
       long l5;
       wq0 e0;
       float f3;
       long l7;
       wq0 owq0 = p0;
       int i = p1;
       o91 h = this.h;
       int i1 = h.size();
       long l = 0;
       for (int i2 = 0; i2 < i1; i1 = i3) {
          i06 a = h.get(i2).a;
          if (a instanceof nd0) {
             if (a.f != i) {
             label_0030 :
                l1 = 0;
                oo91 = h;
                i3 = i1;
             }else if(!i){
                d = owq0.d;
             }else {
                d = owq0.e;
             }
             cp7 h1 = d.h;
             wq0 d1 = (!i)? owq0.d: owq0.e;
             boolean b = a.h.l.contains(h1);
             cp7 i4 = a.i;
             boolean b1 = i4.l.contains(d1.i);
             long l2 = a.j();
             cp7 h2 = a.h;
             if (b && b1) {
                long l3 = i06.a(i4, 0);
                long l4 = i06.b(h2, 0) - l2;
                p91 f = i4.f;
                int float i5 = - f;
                oo91 = h;
                i3 = i1;
                if ((l4 - (long)i5) >= 0) {
                   l4 = l4 + (long)f;
                }
                l5 = l4;
                long l6 = - l3;
                l6 = l6 - l2;
                l3 = (long)h2.f;
                l6 = l6 - l3;
                if ((l6 - l3) >= 0) {
                   l6 = l6 - l3;
                }
                cp7 b2 = a.b;
                if (!i) {
                   e0 = b2.e0;
                }else if(i == 1){
                   e0 = b2.f0;
                }else {
                   b2.getClass();
                   e0 = 0xbf800000;
                }
                float f1 = 0x3f800000;
                if ((0 - e0) > 0) {
                   float f2 = (float)l6 / e0;
                   i5 = f1 - e0;
                   f3 = (float)l5 / i5;
                   f3 = f3 + f2;
                   l5 = (long)f3;
                }else {
                   l5 = 0;
                }
                f3 = (float)l5;
                i5 = f3 * e0;
                i5 = i5 + 0x3f000000;
                long i51 = (long)i5 + l2;
                i51 = i51 + (long)et0.l(f1, e0, f3, 0x3f000000);
                l6 = (long)h2.f + i51;
                l6 = l6 - (long)i4.f;
                l1 = l6;
             }else {
                oo91 = h;
                i3 = i1;
                if (b) {
                   l7 = (long)h2.f + l2;
                   l5 = Math.max(i06.b(h2, (long)h2.f), l7);
                }else if(b1){
                   i = - i4.f;
                   l7 = (long)i + l2;
                   l5 = - i06.a(i4, (long)i4.f);
                   l5 = Math.max(l5, l7);
                }else {
                   l7 = a.j() + (long)h2.f;
                   l7 = l7 - (long)i4.f;
                   l1 = l7;
                }
                l1 = l5;
             }
          }else if(!i){
             if (!a instanceof vq2) {
                goto label_0030 ;
             }else {
             }
          }else if(!a instanceof ug7){
             goto label_0030 ;
          }else {
          }
          l = Math.max(l, l1);
          i2 = i2 + 1;
          owq0 = p0;
          i = p1;
          h = oo91;
       }
       return (int)l;
    }
    public final void e(cp7 p0,int p1,ArrayList p2){
       cp7 i;
       l91 ol91;
       Iterator iterator = p0.h.k.iterator();
       while (true) {
          i = p0.i;
          if (iterator.hasNext()) {
             ol91 = iterator.next();
             if (ol91 instanceof p91) {
                this.a(ol91, p1, 0, p2, null);
             }else if(ol91 instanceof cp7){
                this.a(ol91.h, p1, 0, p2, null);
             }
          }else {
             break ;
          }
       }
       iterator = i.k.iterator();
       while (iterator.hasNext()) {
          ol91 = iterator.next();
          if (ol91 instanceof p91) {
             this.a(ol91, p1, 1, p2, null);
          }else if(ol91 instanceof cp7){
             this.a(ol91.i, p1, 1, p2, null);
          }
       }
       if (p1 == 1) {
          Iterator iterator1 = p0.k.k.iterator();
          while (iterator1.hasNext()) {
             l91 ol911 = iterator1.next();
             if (ol911 instanceof p91) {
                this.a(ol911, p1, 2, p2, null);
             }
          }
       }
       return;
    }
    public final void f(wq0 p0,int p1,int p2,int p3,int p4){
       o91 tg = this.g;
       tg.a = p1;
       tg.b = p3;
       tg.c = p2;
       tg.d = p4;
       this.f.b(p0, tg);
       p0.O(tg.e);
       p0.L(tg.f);
       p0.E = tg.h;
       b00 g = tg.g;
       p0.b0 = g;
       boolean b = (g > null)? true: false;
       p0.E = b;
       return;
    }
    public final void g(){
       Iterator iterator = this.a.q0.iterator();
       while (iterator.hasNext()) {
          wq0 owq0 = iterator.next();
          if (owq0.a != null) {
             continue ;
          }else {
             wq0 t = owq0.T;
             int i = 0;
             int i1 = t[i];
             int i2 = t[1];
             t = owq0.r;
             wq0 s = owq0.s;
             int i3 = 2;
             ug7 l = (i1 != i3 && (i1 != 3 && t == 1))? 0: 1;
             if (i2 == i3 || (i2 == 3 || s != 1)) {
                i = 1;
             }
             cp7 e = owq0.d.e;
             p91 j = e.j;
             cp7 e1 = owq0.e.e;
             p91 j1 = e1.j;
             if (j != null && j1 != null) {
                int i4 = 1;
                this.f(owq0, i4, e.g, i4, e1.g);
                owq0.a = true;
             }else if(j != null && i){
                this.f(owq0, 1, e.g, 2, e1.g);
                if (i2 == 3) {
                   owq0.e.e.m = owq0.l();
                }else {
                   owq0.e.e.d(owq0.l());
                   owq0.a = true;
                }
             }else if(j1 != null && t){
                this.f(owq0, 2, e.g, 1, e1.g);
                if (i1 == 3) {
                   owq0.d.e.m = owq0.r();
                }else {
                   owq0.d.e.d(owq0.r());
                   owq0.a = true;
                }
             }
             if (owq0.a != null && (l = owq0.e.l) != null) {
                l.d(owq0.b0);
             }
          }
       }
       return;
    }
}
