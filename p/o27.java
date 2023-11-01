package p.o27;
import p.sy;
import p.bw3;
import p.ni3;
import java.lang.StringBuilder;
import android.graphics.RectF;
import android.graphics.Matrix;
import p.m27;
import java.util.HashMap;
import p.qv3;
import java.util.ArrayList;
import p.l27;
import p.a27;
import java.util.List;
import p.my;
import p.qy;
import p.j8;
import p.qd;
import p.rd;
import p.z52;
import java.lang.String;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Path;
import java.lang.Object;
import java.util.Arrays;
import p.id1;
import p.mf7;
import android.graphics.PointF;
import p.en6;
import p.sv3;
import android.graphics.Rect;
import java.util.Map;
import p.ib2;
import java.lang.Integer;
import p.lr7;
import java.lang.Float;
import p.jo6;
import p.n27;
import p.tp2;
import p.jb2;
import p.kd6;
import p.qr0;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import p.i77;
import p.li5;
import android.graphics.Typeface;
import android.content.res.AssetManager;
import java.lang.CharSequence;
import java.lang.Character;
import p.do5;
import java.lang.Long;

public final class o27 extends sy	// class@00209a from classes.dex
{
    public final StringBuilder A;
    public final RectF B;
    public final Matrix C;
    public final m27 D;
    public final m27 E;
    public final HashMap F;
    public final qv3 G;
    public final ArrayList H;
    public final l27 I;
    public final bw3 J;
    public final sv3 K;
    public final qy L;
    public final qy M;
    public final z52 N;
    public final z52 O;

    public void o27(bw3 p0,ni3 p1){
       ni3 r;
       j8 b;
       qy oqy;
       j8 v;
       super(p0, p1);
       this.A = new StringBuilder(2);
       this.B = new RectF();
       this.C = new Matrix();
       this.D = new m27(0);
       this.E = new m27(1);
       this.F = new HashMap();
       this.G = new qv3();
       this.H = new ArrayList();
       this.J = p0;
       this.K = p1.b;
       l27 ol27 = new l27(p1.q.b);
       this.I = ol27;
       ol27.a(this);
       this.f(ol27);
       if ((r = p1.r) != null && (b = r.b) != null) {
          oqy = b.a();
          this.L = oqy;
          oqy.a(this);
          this.f(oqy);
       }
       if (r != null && (b = r.c) != null) {
          oqy = b.a();
          this.M = oqy;
          oqy.a(this);
          this.f(oqy);
       }
       if (r != null && (b = r.t) != null) {
          oqy = b.a();
          this.N = oqy;
          oqy.a(this);
          this.f(oqy);
       }
       if (r != null && (v = r.v) != null) {
          qy oqy1 = v.a();
          this.O = oqy1;
          oqy1.a(this);
          this.f(oqy1);
       }
       return;
    }
    public static void o(String p0,m27 p1,Canvas p2){
       if (!p1.getColor()) {
          return;
       }
       if (p1.getStyle() == Paint$Style.STROKE && !(0 - p1.getStrokeWidth())) {
          return;
       }
       p2.drawText(p0, 0, p0.length(), 0, 0, p1);
       return;
    }
    public static void p(Path p0,m27 p1,Canvas p2){
       if (!p1.getColor()) {
          return;
       }
       if (p1.getStyle() == Paint$Style.STROKE && !(0 - p1.getStrokeWidth())) {
          return;
       }
       p2.drawPath(p0, p1);
       return;
    }
    public static List r(String p0){
       return Arrays.asList(p0.replaceAll("\r\n", "\r").replaceAll("\x03", "\r").replaceAll("\n", "\r").split("\r"));
    }
    public static void s(Canvas p0,id1 p1,int p2,float p3){
       int i;
       id1 l = p1.l;
       id1 m = p1.m;
       float f = mf7.c();
       float f1 = 0;
       float f2 = (l == null)? 0: (p1.f * f) + l.y;
       float f3 = (((float)p2 * p1.f) * f) + f2;
       float f4 = (l == null)? 0: l.x;
       if (m != null) {
          f1 = m.x;
       }
       if (i = en6.A(p1.d)) {
          if (i != 1) {
             if (i == 2) {
                p0.translate((((f1 / 2.00f) + f4) - (p3 / 2.00f)), f3);
             }
          }else {
             p0.translate(((f4 + f1) - p3), f3);
          }
       }else {
          p0.translate(f4, f3);
       }
       return;
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       super.a(p0, p1, p2);
       o27 tK = this.K;
       p0.set(0, 0, (float)tK.i.width(), (float)tK.i.height());
    }
    public final void i(Canvas p0,Matrix p1,int p2){
       Object obj1;
       o27 l;
       lr7 j;
       float f2;
       int i1;
       int i3;
       Object obj2;
       float f5;
       ib2 oib2;
       List list2;
       int i6;
       n27 on27;
       int i7;
       boolean i8;
       List list3;
       jb2 i9;
       n27 on271;
       ib2 oib21;
       o27 oo272;
       o27 f6;
       List list4;
       int i10;
       float i9;
       i77 oi77;
       Typeface typeface;
       Object obj3;
       ib2 obj4;
       int i14;
       int i15;
       PointF pointF;
       o27 oo27 = this;
       Canvas uCanvas = p0;
       Object obj = oo27.I.e();
       o27 k = oo27.K;
       if ((obj1 = k.e.get(obj.b)) == null) {
          return;
       }
       p0.save();
       p0.concat(p1);
       o27 d = oo27.D;
       if ((l = oo27.L) != null) {
          d.setColor(l.e().intValue());
       }else {
          d.setColor(obj.h);
       }
       o27 e = oo27.E;
       if ((l = oo27.M) != null) {
          e.setColor(l.e().intValue());
       }else {
          e.setColor(obj.i);
       }
       int i = ((j = oo27.w.j) == null)? 100: j.e().intValue();
       i = (((i * 255) / 100) * p2) / 255;
       d.setAlpha(i);
       e.setAlpha(i);
       if ((l = oo27.N) != null) {
          e.setStrokeWidth(l.e().floatValue());
       }else {
          e.setStrokeWidth((mf7.c() * obj.j));
       }
       o27 j1 = oo27.J;
       i = (j1.a.f.g() > 0)? 1: 0;
       float f = 100.00f;
       o27 o = oo27.O;
       float f1 = 10.00f;
       ib2 b = obj1.b;
       ib2 a = obj1.a;
       if (i) {
          f2 = obj.c / f;
          mf7.d(p1);
          List list = o27.r(obj.a);
          i = list.size();
          float f3 = (float)obj.e / f1;
          if (o != null) {
             f3 = f3 + o.e().floatValue();
          }
          float f4 = f3;
          i1 = 0;
          int i2 = 0;
          i3 = -1;
          while (i1 < i) {
             String str = list.get(i1);
             id1 m = ((m = obj.m) == null)? 0: m.x;
             int i4 = i;
             List list1 = list;
             int i5 = i1;
             obj2 = obj1;
             f5 = f2;
             o27 oo271 = e;
             oib2 = a;
             list2 = this.t(str, m, obj1, f2, f4, 1);
             i6 = 0;
             while (i6 < list2.size()) {
                on27 = list2.get(i6);
                i7 = i3 + 1;
                p0.save();
                o27.s(uCanvas, obj, i7, on27.b);
                on27 = on27.a;
                i1 = 0;
                Integer integer = i2;
                while (i1 < on27.length()) {
                   i8 = on27.charAt(i1) * 31;
                   list3 = list2;
                   i = tp2.g(oib2, i8, 31);
                   i8 = b.hashCode() + i;
                   if ((i9 = k.f.e(i8, integer)) == null) {
                      on271 = on27;
                      p2 = i7;
                      oib21 = b;
                      oo272 = oo271;
                   }else {
                      f6 = oo27.F;
                      if (f6.containsKey(i9)) {
                         list4 = f6.get(i9);
                         on271 = on27;
                         p2 = i7;
                         oib21 = b;
                      }else {
                         jb2 a1 = i9.a;
                         on271 = on27;
                         i10 = a1.size();
                         p2 = i7;
                         ArrayList uArrayList = new ArrayList(i10);
                         oib21 = b;
                         for (int i11 = 0; i11 < i10; i10 = i10) {
                            uArrayList.add(new qr0(j1, oo27, a1.get(i11), k));
                            i11 = i11 + 1;
                         }
                         f6.put(i9, uArrayList);
                         list4 = uArrayList;
                      }
                      i10 = 0;
                      while (i10 < list4.size()) {
                         Path path = list4.get(i10).d();
                         path.computeBounds(oo27.B, false);
                         o27 c = oo27.C;
                         c.reset();
                         float f7 = - obj.g;
                         f7 = f7 * mf7.c();
                         List list5 = list4;
                         c.preTranslate(0, f7);
                         c.preScale(f5, f5);
                         path.transform(c);
                         if (obj.k != null) {
                            o27.p(path, d, uCanvas);
                            oo272 = oo271;
                            o27.p(path, oo272, uCanvas);
                         }else {
                            oo272 = oo271;
                            o27.p(path, oo272, uCanvas);
                            o27.p(path, d, uCanvas);
                         }
                         i10 = i10 + 1;
                         oo271 = oo272;
                         list4 = list5;
                      }
                      oo272 = oo271;
                      i9 = (float)i9.c * f5;
                      float f8 = mf7.c() * i9;
                      f8 = f8 + f4;
                      uCanvas.translate(f8, 0);
                   }
                   i1 = i1 + 1;
                   integer = null;
                   list2 = list3;
                   i7 = p2;
                   oo271 = oo272;
                   on27 = on271;
                   b = oib21;
                }
                p0.restore();
                i6 = i6 + 1;
                on271 = 0;
                i3 = i7;
                b = b;
             }
             i1 = i5 + 1;
             on271 = 0;
             f4 = f5;
             a = oib2;
             e = oo271;
             b = b;
             i = i4;
             list = list1;
             obj1 = obj2;
          }
       }else {
          obj2 = obj1;
          oib21 = b;
          oo272 = e;
          oib2 = a;
          if (j1.getCallback() == null) {
             oi77 = null;
          }else if(j1.x == null){
             j1.x = new i77(j1.getCallback());
          }
          oi77 = j1.x;
          if (oi77 != null) {
             i77 a2 = oi77.a;
             a2.b = oib2;
             ib2 oib22 = oib21;
             a2.c = oib22;
             if ((typeface = oi77.b.get(a2)) != null) {
                obj3 = obj2;
             }else if((typeface = oi77.c.get(oib2)) != null){
                obj3 = obj2;
             }else {
                tp2.v(oi77.e);
                tp2.v(oi77.e);
                obj3 = obj2;
                if ((obj4 = obj3.c) == null) {
                   typeface = Typeface.createFromAsset(oi77.d, "fonts/"+oib2+oi77.f);
                   oi77.c.put(oib2, typeface);
                }
             }
             i8 = oib22.contains("Italic");
             i14 = oib22.contains("Bold");
             if (i8 && i14) {
                i14 = 3;
             }else if(i8){
                i14 = 2;
             }else if(i14){
                i14 = 1;
             }else {
                i14 = 0;
             }
             if (typeface.getStyle() != i14) {
                typeface = Typeface.create(typeface, i14);
             }
             oi77.b.put(oi77.a, typeface);
          }else {
             obj3 = obj2;
             typeface = null;
          }
          if (typeface == null) {
             obj4 = obj3.c;
          }
          if (typeface != null) {
             StringBuilder id1 a3 = obj.a;
             d.setTypeface(typeface);
             id1 c1 = obj.c;
             d.setTextSize((mf7.c() * c1));
             oo272.setTypeface(d.getTypeface());
             oo272.setTextSize(d.getTextSize());
             f2 = (float)obj.e / f1;
             if (o != null) {
                f2 = f2 + o.e().floatValue();
             }
             f5 = ((mf7.c() * f2) * c1) / f;
             List list6 = o27.r(a3);
             int i12 = list6.size();
             int i13 = -1;
             for (i8 = 0; i8 < i12; i8 = i3 + 1) {
                obj4 = list6.get(i8);
                f = ((a3 = obj.m) == null)? 0: a3.x;
                i3 = i8;
                list2 = this.t(obj4, f, obj3, 0, f5, 0);
                i6 = 0;
                while (i6 < list2.size()) {
                   on27 = list2.get(i6);
                   i7 = i13 + 1;
                   p0.save();
                   o27.s(uCanvas, obj, i7, on27.b);
                   on27 = on27.a;
                   i1 = 0;
                   while (i1 < on27.length()) {
                      i14 = on27.codePointAt(i1);
                      i8 = Character.charCount(i14) + i1;
                      list3 = list2;
                      while (true) {
                         if (i8 < on27.length()) {
                            i = on27.codePointAt(i8);
                            p2 = i7;
                            obj2 = obj3;
                            PointF x = (Character.getType(i) != 16 && (Character.getType(i) != 27 && (Character.getType(i) != 6 && (Character.getType(i) != 28 && (Character.getType(i) != 8 && Character.getType(i) != 19)))))? 0: 1;
                            if (!x) {
                            label_03d7 :
                               list2 = list6;
                               i7 = i12;
                               long l1 = (long)i14;
                               f6 = oo27.G;
                               if (f6.a != null) {
                                  f6.e();
                               }
                               List list7 = list2;
                               a3 = (do5.e(f6.b, f6.t, l1) >= 0)? 1: 0;
                               if (a3) {
                                  a3 = f6.f(l1, null);
                                  i15 = i7;
                               }else {
                                  l = oo27.A;
                                  l.setLength(0);
                                  int i16 = i1;
                                  while (i16 < i8) {
                                     i15 = on27.codePointAt(i16);
                                     a3 = l.appendCodePoint(i15);
                                     i16 = i16 + Character.charCount(i15);
                                     i7 = i7;
                                  }
                                  i15 = i7;
                                  a3 = l.toString();
                                  f6.h(l1, a3);
                               }
                               i1 = i1 + a3.length();
                               if (obj.k != null) {
                                  o27.o(a3, d, uCanvas);
                                  o27.o(a3, oo272, uCanvas);
                               }else {
                                  o27.o(a3, oo272, uCanvas);
                                  o27.o(a3, d, uCanvas);
                               }
                               i9 = d.measureText(a3) + f5;
                               uCanvas.translate(i9, 0);
                               list2 = list3;
                               i7 = p2;
                               list6 = list7;
                               i12 = i15;
                               obj3 = obj2;
                            }else {
                               i8 = i8 + Character.charCount(i);
                               i14 = i14 * 31;
                               i14 = i14 + i;
                               i7 = p2;
                               obj3 = obj2;
                            }
                         }else {
                            p2 = i7;
                            obj2 = obj3;
                            goto label_03d7 ;
                         }
                      }
                   }
                   p0.restore();
                   i6 = i6 + 1;
                   i13 = i7;
                }
             }
          }
       }
       p0.restore();
       return;
    }
    public final n27 q(int p0){
       o27 tH = this.H;
       for (int i = tH.size(); i < p0; i = i + 1) {
          tH.add(new n27());
       }
       p0--;
       return tH.get(p0);
    }
    public final List t(String p0,float p1,ib2 p2,float p3,float p4,boolean p5){
       int i5;
       jb2 ojb2;
       float f4;
       String str1;
       float f5;
       o27 oo27 = this;
       String str = p0;
       ib2 oib2 = p2;
       int i = 0;
       float f = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       float f1 = 0;
       int i4 = 0;
       float f2 = 0;
       while (i < p0.length()) {
          char c = str.charAt(i);
          if (p5) {
             i5 = c * 31;
             int i6 = oib2.b.hashCode() + tp2.g(oib2.a, i5, 31);
             if ((ojb2 = oo27.K.f.e(i6, null)) != null) {
                float f3 = (float)ojb2.c * p3;
                f4 = mf7.c() * f3;
                f4 = f4 + p4;
             label_0057 :
                f3 = 32;
                if (c == f3) {
                   i3 = 1;
                   f2 = f4;
                }else if(i3){
                   i3 = 0;
                   i4 = i;
                   f1 = f4;
                }else {
                   f1 = f1 + f4;
                }
                f = f + f4;
                if ((0 - p1) > 0 && ((p1 - f) >= 0 && c != f3)) {
                   i1 = i1 + 1;
                   n27 on27 = oo27.q(i1);
                   if (i4 == i2) {
                      str1 = str.substring(i2, i);
                      String str2 = str1.trim();
                      i4 = str2.length() - str1.length();
                      f5 = (float)i4 * f2;
                      f = f - f4;
                      f = f - f5;
                      on27.a = str2;
                      on27.b = f;
                      i2 = i;
                      i4 = i2;
                      f = f4;
                      f1 = f;
                   }else {
                      i5 = i4 - 1;
                      str1 = str.substring(i2, i5);
                      String str3 = str1.trim();
                      i2 = str1.length() - str3.length();
                      f5 = (float)i2 * f2;
                      f = f - f1;
                      f = f - f5;
                      f = f - f2;
                      on27.a = str3;
                      on27.b = f;
                      f = f1;
                      i2 = i4;
                   }
                }
             }
          }else {
             i5 = i + 1;
             f4 = oo27.D.measureText(str.substring(i, i5)) + p4;
             goto label_0057 ;
          }
          i = i + 1;
       }
       if ((0 - f) > 0) {
          i1 = i1 + 1;
          n27 on271 = oo27.q(i1);
          on271.a = str.substring(i2);
          on271.b = f;
       }
       return oo27.H.subList(0, i1);
    }
}
