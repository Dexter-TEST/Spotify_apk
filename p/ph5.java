package p.ph5;
import p.r95;
import p.my;
import p.or0;
import p.bw3;
import p.sy;
import p.qh5;
import java.lang.Object;
import android.graphics.Path;
import p.o93;
import java.lang.Class;
import p.qy;
import p.rd;
import p.z52;
import p.yd;
import java.util.List;
import java.util.ArrayList;
import p.v97;
import p.en6;
import java.lang.Float;
import java.lang.Math;
import android.graphics.PointF;
import p.et0;

public final class ph5 implements r95, my, or0	// class@002262 from classes.dex
{
    public final Path a;
    public final bw3 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final z52 f;
    public final qy g;
    public final z52 h;
    public final z52 i;
    public final z52 j;
    public final z52 k;
    public final z52 l;
    public final o93 m;
    public boolean n;

    public void ph5(bw3 p0,sy p1,qh5 p2){
       super();
       this.a = new Path();
       this.m = new o93();
       this.b = p0;
       p2.getClass();
       qh5 a = p2.a;
       this.c = a;
       this.d = p2.i;
       this.e = p2.j;
       qy oqy = p2.b.a();
       this.f = oqy;
       qy oqy1 = p2.c.a();
       this.g = oqy1;
       qy oqy2 = p2.d.a();
       this.h = oqy2;
       qy oqy3 = p2.f.a();
       this.j = oqy3;
       qy oqy4 = p2.h.a();
       this.l = oqy4;
       if (a == 1) {
          this.i = p2.e.a();
          this.k = p2.g.a();
       }else {
          z52 oz52 = null;
          this.i = oz52;
          this.k = oz52;
       }
       p1.f(oqy);
       p1.f(oqy1);
       p1.f(oqy2);
       p1.f(oqy3);
       p1.f(oqy4);
       if (a == 1) {
          p1.f(this.i);
          p1.f(this.k);
       }
       oqy.a(this);
       oqy1.a(this);
       oqy2.a(this);
       oqy3.a(this);
       oqy4.a(this);
       if (a == 1) {
          this.i.a(this);
          this.k.a(this);
       }
       return;
    }
    public final void b(){
       this.n = false;
       this.b.invalidateSelf();
    }
    public final void c(List p0,List p1){
       int i = 0;
       while (true) {
          ArrayList uArrayList = p0;
          if (i < uArrayList.size()) {
             or0 oor0 = uArrayList.get(i);
             if (oor0 instanceof v97 && oor0.c == 1) {
                this.m.a.add(oor0);
                oor0.f(this);
             }
             i++;
          }else {
             break ;
          }
       }
       return;
    }
    public final Path d(){
       double d3;
       float f2;
       float f3;
       double d4;
       float f4;
       double d5;
       float f5;
       float f6;
       int i1;
       ph5 oph51;
       double d9;
       float f7;
       float f8;
       float f9;
       float f10;
       double d10;
       float f11;
       double d11;
       PointF pointF;
       float f15;
       float f16;
       ph5 oph53;
       float f21;
       float f22;
       ph5 oph5 = this;
       ph5 a = oph5.a;
       if (oph5.n != null) {
          return a;
       }
       a.reset();
       boolean b = true;
       if (oph5.d != null) {
          oph5.n = b;
          return a;
       }else {
          int i = en6.A(oph5.c);
          ph5 g = oph5.g;
          ph5 l = oph5.l;
          float f = 100.00f;
          ph5 j = oph5.j;
          double d = 0x401921fb54442d18;
          double d1 = 90.00f;
          ph5 h = oph5.h;
          ph5 f1 = oph5.f;
          if (i) {
             if (i == b) {
                i = (int)Math.floor((double)f1.e().floatValue());
                double d2 = (h == null)? 0: (double)h.e().floatValue();
                d1 = Math.toRadians((d2 - d1));
                d3 = (double)i;
                f2 = l.e().floatValue() / f;
                f3 = j.e().floatValue();
                d4 = (double)f3;
                f4 = (float)(Math.cos(d1) * d4);
                f = (float)(Math.sin(d1) * d4);
                a.moveTo(f4, f);
                d5 = (double)(float)(d / d3);
                d1 = d1 + d5;
                double d6 = Math.ceil(d3);
                i = 0;
                double d7 = d5;
                while (((double)i - d6) < 0) {
                   d5 = Math.cos(d1) * d4;
                   f5 = (float)d5;
                   d5 = Math.sin(d1) * d4;
                   f6 = (float)d5;
                   if (0 - f2) {
                      i1 = i;
                      double d8 = Math.atan2((double)f, (double)f4) - 0x3ff921fb54442d18;
                      d8 = (double)(float)d8;
                      oph51 = g;
                      d9 = d1;
                      d4 = Math.atan2((double)f6, (double)f5) - 0x3ff921fb54442d18;
                      d4 = (double)(float)d4;
                      f7 = f3 * f2;
                      f7 = f7 * 0.25f;
                      f8 = (float)Math.cos(d8) * f7;
                      f9 = (float)Math.sin(d8) * f7;
                      f10 = (float)Math.cos(d4) * f7;
                      f7 = f7 * (float)Math.sin(d4);
                      f4 = f4 - f8;
                      f = f - f9;
                      f10 = f10 + f5;
                      f9 = f7 + f6;
                      d10 = d7;
                      f11 = f6;
                      d7 = d4;
                      a.cubicTo(f4, f, f10, f9, f5, f11);
                   }else {
                      i1 = i;
                      oph51 = g;
                      d9 = d1;
                      d10 = d7;
                      f11 = f6;
                      d7 = d4;
                      a.lineTo(f5, f11);
                   }
                   d11 = d9 + d10;
                   int i2 = i1 + 1;
                   f = f11;
                   d4 = d7;
                   d7 = d10;
                   g = oph51;
                   d1 = d11;
                   f4 = f5;
                   i = i2;
                   i2 = this;
                }
                pointF = g.e();
                a.offset(pointF.x, pointF.y);
                a.close();
             }
          }else {
             oph51 = g;
             f9 = f1.e().floatValue();
             double d12 = (h == null)? 0: (double)h.e().floatValue();
             d10 = Math.toRadians((d12 - d1));
             double d13 = (double)f9;
             f8 = (float)(d / d13);
             ph5 oph52 = this;
             if (oph52.e != null) {
                f8 = f8 * 0xbf800000;
             }
             f5 = f8;
             f7 = f5 / 2.00f;
             f9 = f9 - (float)(int)f9;
             if (v18 = 0 - f9) {
                d10 = d10 + (double)((0x3f800000 - f9) * f7);
             }
             float f12 = j.e().floatValue();
             f6 = oph52.i.e().floatValue();
             float f13 = ((j = oph52.k) != null)? j.e().floatValue() / f: 0;
             float f14 = (l != null)? l.e().floatValue() / f: 0;
             if (v18) {
                f4 = et0.l(f12, f6, f9, f6);
                double d14 = (double)f4;
                f15 = f4;
                f8 = (float)(Math.cos(d10) * d14);
                f4 = (float)(Math.sin(d10) * d14);
                a.moveTo(f8, f4);
                f16 = f6;
                d10 = d10 + (double)((f5 * f9) / 2.00f);
             }else {
                f16 = f6;
                d11 = (double)f12;
                f = (float)(Math.cos(d10) * d11);
                f4 = (float)(Math.sin(d10) * d11);
                a.moveTo(f, f4);
                d10 = d10 + (double)f7;
                f8 = f;
                f15 = 0;
             }
             d13 = 2.00f;
             d9 = Math.ceil(d13) * d13;
             f10 = f4;
             double d15 = d10;
             int i3 = 0;
             int i4 = 0;
             f4 = f8;
             f8 = 2.00f;
             while (true) {
                d5 = (double)i3;
                if ((d5 - d9) < 0) {
                   float f17 = (i4)? f12: f16;
                   if (v28 = 0 - f15) {
                      double d16 = d9 - d13;
                      if (!(d16 - d5)) {
                         float f18 = f5 * f9;
                         f18 = f18 / f8;
                         f8 = f18;
                      label_0220 :
                         d16 = 0x3ff0000000000000;
                         if (v28) {
                            double d17 = d9 - d16;
                            if (!(d17 - d5)) {
                               f11 = f15;
                            label_022f :
                               d13 = (double)f11;
                               float f19 = f12;
                               float f20 = f7;
                               d4 = Math.cos(d15) * d13;
                               f7 = (float)d4;
                               d13 = d13 * Math.sin(d15);
                               f11 = (float)d13;
                               f12 = 0;
                               if (!(f12 - f13) && !(f12 - f14)) {
                                  a.lineTo(f7, f11);
                                  oph53 = oph51;
                                  f21 = f8;
                                  f22 = f5;
                                  f2 = f16;
                                  f5 = f20;
                                  f3 = f19;
                                  f16 = f7;
                               }else {
                                  oph53 = oph51;
                                  f12 = f8;
                                  d3 = Math.atan2((double)f10, (double)f4) - 0x3ff921fb54442d18;
                                  d3 = (double)(float)d3;
                                  f2 = (float)Math.cos(d3);
                                  f21 = (float)Math.sin(d3);
                                  f22 = f5;
                                  float f23 = f4;
                                  d11 = Math.atan2((double)f11, (double)f7) - 0x3ff921fb54442d18;
                                  d11 = (double)(float)d11;
                                  f3 = (float)Math.cos(d11);
                                  f8 = (float)Math.sin(d11);
                                  f4 = (i4)? f13: f14;
                                  f5 = (i4)? f14: f13;
                                  float f24 = (i4)? f16: f19;
                                  float f25 = (i4)? f19: f16;
                                  f24 = f24 * f4;
                                  f4 = 0x3ef4e26d;
                                  f24 = f24 * f4;
                                  f2 = f2 * f24;
                                  f24 = f24 * f21;
                                  f25 = f25 * f5;
                                  f25 = f25 * f4;
                                  f3 = f3 * f25;
                                  f25 = f25 * f8;
                                  if (v18) {
                                     if (!i3) {
                                        f2 = f2 * f9;
                                        f24 = f24 * f9;
                                     }else {
                                        d3 = d9 - d16;
                                        if (!(d3 - d5)) {
                                           f3 = f3 * f9;
                                           f25 = f25 * f9;
                                        }
                                     }
                                  }
                                  f4 = f23 - f2;
                                  f = f10 - f24;
                                  f10 = f7 + f3;
                                  f6 = f11 + f25;
                                  f21 = f12;
                                  f2 = f16;
                                  f3 = f19;
                                  f16 = f7;
                                  f5 = f20;
                                  a.cubicTo(f4, f, f10, f6, f7, f11);
                               }
                               d15 = d15 + (double)f21;
                               i4 = i4 ^ 0x01;
                               i3 = i3 + 1;
                               f8 = 2.00f;
                               f = f11;
                               f12 = f3;
                               f7 = f5;
                               f4 = f16;
                               oph51 = oph53;
                               f5 = f22;
                               f16 = f2;
                               d13 = 2.00f;
                            }
                         }
                         f11 = f17;
                         goto label_022f ;
                      }
                   }
                   f8 = f7;
                   goto label_0220 ;
                }else {
                   break ;
                }
             }
             pointF = oph51.e();
             a.offset(pointF.x, pointF.y);
             a.close();
          }
          a.close();
          oph5 = this;
          oph5.m.a(a);
          oph5.n = true;
          return a;
       }
    }
}
