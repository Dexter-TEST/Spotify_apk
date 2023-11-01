package p.md6;
import p.qy;
import java.util.List;
import p.gd6;
import android.graphics.Path;
import p.ph3;
import java.lang.Object;
import android.graphics.PointF;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.String;
import p.js3;
import java.lang.Math;
import p.v01;
import p.wa4;
import p.et0;
import p.iz5;
import java.lang.Class;
import java.lang.Float;

public final class md6 extends qy	// class@001e75 from classes.dex
{
    public final gd6 h;
    public final Path i;
    public List j;

    public void md6(List p0){
       super(p0);
       this.h = new gd6();
       this.i = new Path();
    }
    public final Object f(ph3 p0,float p1){
       int i2;
       v01 ov01;
       v01 a3;
       v01 a4;
       v01 b4;
       md6 j;
       int i4;
       int i6;
       gd6 b5;
       gd6 ogd6;
       iz5 c;
       int i9;
       v01 ov012;
       gd6 ogd62;
       float f5;
       md6 omd61;
       v01 b7;
       md6 omd6 = this;
       ph3 oph3 = p0;
       float f = p1;
       ph3 b = oph3.b;
       oph3 = oph3.c;
       md6 h = omd6.h;
       if (h.b == null) {
          h.b = new PointF();
       }
       int i = 1;
       boolean b1 = (b.c == null && oph3.c == null)? false: true;
       h.c = b1;
       gd6 a = b.a;
       gd6 a1 = oph3.a;
       if (a.size() != oph3.a.size()) {
          js3.a("Curves must have the same number of control points. Shape 1: "+a.size()+"\tShape 2: "+a1.size());
       }
       int i1 = Math.min(a.size(), a1.size());
       gd6 a2 = h.a;
       if (a2.size() < i1) {
          for (i2 = a2.size(); i2 < i1; i2 = i2 + 1) {
             a2.add(new v01());
          }
       }else if(a2.size() > i1){
          for (i2 = a2.size() - i; i2 >= i1; i2 = i2 - 1) {
             i9 = a2.size() - i;
             a2.remove(i9);
          }
       }
       gd6 b2 = b.b;
       gd6 b3 = oph3.b;
       PointF y = b2.y;
       h.a(et0.l(b3.x, b2.x, f, b2.x), (((b3.y - y) * f) + y));
       for (int i3 = a2.size() - i; i3 >= 0; i3 = i3 - 1) {
          ov01 = a.get(i3);
          v01 ov011 = a1.get(i3);
          a3 = ov01.a;
          a4 = ov011.a;
          a2.get(i3).a.set(et0.l(a4.x, a3.x, f, a3.x), et0.l(a4.y, a3.y, f, a3.y));
          a4 = ov01.b;
          b4 = ov011.b;
          a2.get(i3).b.set(et0.l(b4.x, a4.x, f, a4.x), et0.l(b4.y, a4.y, f, a4.y));
          ov01 = ov01.c;
          ov011 = ov011.c;
          a2.get(i3).c.set(et0.l(ov011.x, ov01.x, f, ov01.x), et0.l(ov011.y, ov01.y, f, ov01.y));
       }
       if ((j = omd6.j) != null) {
          i3 = j.size() - i;
          while (i3 >= 0) {
             iz5 oiz5 = omd6.j.get(i3);
             oiz5.getClass();
             b2 = h.a;
             if (b2.size() > 2) {
                float f1 = oiz5.b.e().floatValue();
                if (0 - f1) {
                   gd6 a5 = h.a;
                   a2 = h.c;
                   int i5 = a5.size() - i;
                   i2 = 0;
                   while (i5 >= 0) {
                      a4 = a5.get(i5);
                      i6 = i5 - 1;
                      b4 = a5.get(iz5.f(i6, a5.size()));
                      b5 = (!i5 && a2 == null)? h.b: b4.c;
                      ogd6 = (!i5 && a2 == null)? b5: b4.b;
                      a4 = a4.a;
                      if (h.c == null && !i5) {
                         int i7 = a5.size() - i;
                         if (i5 == i7) {
                            i5 = 1;
                         label_019e :
                            i2 = (ogd6.equals(b5) && (a4.equals(b5) && !i5))? i2 + 2: i2 + 1;
                            i5 = i6;
                         }
                      }
                      i5 = 0;
                      goto label_019e ;
                   }
                   if ((c = oiz5.c) == null || c.a.size() != i2) {
                      ArrayList uArrayList = new ArrayList(i2);
                      for (i1 = 0; i1 < i2; i1 = i1 + 1) {
                         uArrayList.add(new v01());
                      }
                      oiz5.c = new gd6(new PointF(0, 0), false, uArrayList);
                   }
                   oiz5 = oiz5.c;
                   oiz5.c = a2;
                   gd6 b6 = h.b;
                   oiz5.a(b6.x, b6.y);
                   b6 = oiz5.a;
                   a5 = h.c;
                   int i8 = 0;
                   i5 = 0;
                   while (i8 < b2.size()) {
                      a3 = b2.get(i8);
                      i9 = i8 - 1;
                      a4 = b2.get(iz5.f(i9, b2.size()));
                      i6 = i8 - 2;
                      ov012 = b2.get(iz5.f(i6, b2.size()));
                      ogd6 = (!i8 && a5 == null)? h.b: a4.c;
                      b5 = (!i8 && a5 == null)? ogd6: a4.b;
                      v01 a6 = a3.a;
                      ov012 = ov012.c;
                      gd6 ogd61 = a5;
                      if (h.c == null && !i8) {
                         i1 = b2.size() - 1;
                         if (i8 == i1) {
                            a5 = 1;
                         label_0247 :
                            if (b5.equals(ogd6) && (a6.equals(ogd6) && !a5)) {
                               PointF x = ogd6.x;
                               float f2 = x - ov012.x;
                               PointF y1 = ogd6.y;
                               float f3 = y1 - ov012.y;
                               a3 = a3.c;
                               ogd62 = b2;
                               float f4 = a3.x - x;
                               f5 = a3.y - y1;
                               i4 = i3;
                               double d = (double)f4;
                               float f6 = f1 / (float)Math.hypot((double)f2, (double)f3);
                               f6 = Math.min(f6, 0x3f000000);
                               f4 = f1 / (float)Math.hypot(d, (double)f5);
                               f4 = Math.min(f4, 0x3f000000);
                               PointF x1 = ogd6.x;
                               f5 = et0.l(ov012.x, x1, f6, x1);
                               PointF y2 = ogd6.y;
                               f6 = et0.l(ov012.y, y2, f6, y2);
                               float f7 = et0.l(a3.x, x1, f4, x1);
                               f4 = et0.l(a3.y, y2, f4, y2);
                               float f8 = f5 - x1;
                               f8 = f8 * 0x3f0d4952;
                               f8 = f5 - f8;
                               float f9 = f6 - y2;
                               f9 = f9 * 0x3f0d4952;
                               f9 = f6 - f9;
                               float f10 = f7 - x1;
                               f10 = f10 * 0x3f0d4952;
                               f10 = f7 - f10;
                               f2 = f4 - y2;
                               f2 = f2 * 0x3f0d4952;
                               f2 = f4 - f2;
                               int i10 = i5 - 1;
                               b4 = b6.get(iz5.f(i10, b6.size()));
                               a6 = b6.get(i5);
                               omd61 = h;
                               b4.b.set(f5, f6);
                               b4.c.set(f5, f6);
                               if (!i8) {
                                  oiz5.a(f5, f6);
                               }
                               a6.a.set(f8, f9);
                               i5 = i5 + 1;
                               a6.b.set(f10, f2);
                               a6.c.set(f7, f4);
                               b6.get(i5).a.set(f7, f4);
                            }else {
                               i4 = i3;
                               ogd62 = b2;
                               omd61 = h;
                               int i11 = i5 - 1;
                               v01 ov013 = b6.get(iz5.f(i11, b6.size()));
                               ov01 = a4.b;
                               ov013.b.set(ov01.x, ov01.y);
                               ov01 = a4.c;
                               ov013.c.set(ov01.x, ov01.y);
                               ov013 = a3.a;
                               b6.get(i5).a.set(ov013.x, ov013.y);
                            }
                            i5 = i5 + 1;
                            i8 = i8 + 1;
                            a5 = ogd61;
                            b2 = ogd62;
                            i3 = i4;
                            h = omd61;
                         }
                      }
                      f5 = 0;
                      goto label_0247 ;
                   }
                   i4 = i3;
                   h = oiz5;
                label_0356 :
                   i3 = i4 - 1;
                   i = 1;
                   omd6 = this;
                }
             }
             i4 = i3;
             goto label_0356 ;
          }
          omd61 = h;
       }
       j = this.i;
       j.reset();
       gd6 b8 = h.b;
       j.moveTo(b8.x, b8.y);
       y = wa4.a;
       y.set(b8.x, b8.y);
       int i12 = 0;
       while (true) {
          a = h.a;
          if (i12 < a.size()) {
             v01 ov014 = a.get(i12);
             v01 a7 = ov014.a;
             v01 b9 = ov014.b;
             ov012 = ov014.c;
             if (a7.equals(y) && b9.equals(ov012)) {
                j.lineTo(ov012.x, ov012.y);
             }else {
                j.cubicTo(a7.x, a7.y, b9.x, b9.y, ov012.x, ov012.y);
             }
             y.set(ov012.x, ov012.y);
             i12 = i12 + 1;
          }else if(h.c != null){
             j.close();
          }
          return j;
       }
    }
}
