package p.bz;
import p.my;
import p.or0;
import p.oe1;
import p.bw3;
import p.sy;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import p.qd;
import p.rd;
import java.util.List;
import java.lang.Object;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import p.zh3;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import p.qy;
import p.z52;
import p.uv1;
import p.o11;
import p.xe1;
import android.graphics.Matrix;
import p.az;
import p.r95;
import p.v97;
import android.graphics.Canvas;
import p.mf7;
import java.lang.ThreadLocal;
import p.jb3;
import p.ph3;
import p.wa4;
import java.lang.Math;
import java.lang.Float;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.MaskFilter;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;

public abstract class bz implements my, or0, oe1	// class@001169 from classes.dex
{
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final bw3 e;
    public final sy f;
    public final ArrayList g;
    public final float[] h;
    public final zh3 i;
    public final z52 j;
    public final qy k;
    public final ArrayList l;
    public final z52 m;
    public final z52 n;
    public float o;
    public final xe1 p;

    public void bz(bw3 p0,sy p1,Paint$Cap p2,Paint$Join p3,float p4,qd p5,rd p6,List p7,rd p8){
       bz tm;
       bz tm1;
       super();
       this.a = new PathMeasure();
       this.b = new Path();
       this.c = new Path();
       this.d = new RectF();
       this.g = new ArrayList();
       zh3 ozh3 = new zh3(1);
       this.i = ozh3;
       this.o = 0;
       this.e = p0;
       this.f = p1;
       ozh3.setStyle(Paint$Style.STROKE);
       ozh3.setStrokeCap(p2);
       ozh3.setStrokeJoin(p3);
       ozh3.setStrokeMiter(p4);
       this.k = p5.a();
       this.j = p6.a();
       this.m = (p8 == null)? null: p8.a();
       this.l = new ArrayList(p7.size());
       float[] uofloatArray = new float[p7.size()];
       this.h = uofloatArray;
       int i = 0;
       for (int i1 = 0; i1 < p7.size(); i1++) {
          this.l.add(p7.get(i1).a());
       }
       p1.f(this.k);
       p1.f(this.j);
       for (i1 = 0; i1 < this.l.size(); i1++) {
          p1.f(this.l.get(i1));
       }
       if ((tm = this.m) != null) {
          p1.f(tm);
       }
       this.k.a(this);
       this.j.a(this);
       for (; i < p7.size(); i++) {
          this.l.get(i).a(this);
       }
       if ((tm1 = this.m) != null) {
          tm1.a(this);
       }
       if (p1.j() != null) {
          qy oqy = p1.j().b.a();
          this.n = oqy;
          oqy.a(this);
          p1.f(oqy);
       }
       if (p1.k() != null) {
          this.p = new xe1(this, p1, p1.k());
       }
       return;
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       bz tb = this.b;
       tb.reset();
       boolean b = false;
       int i = 0;
       while (true) {
          bz tg = this.g;
          if (i < tg.size()) {
             az uoaz = tg.get(i);
             for (int i1 = 0; i1 < uoaz.a.size(); i1 = i1 + 1) {
                tb.addPath(uoaz.a.get(i1).d(), p1);
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       bz td = this.d;
       tb.computeBounds(td, b);
       float f = this.j.i() / 2.00f;
       td.set((td.left - f), (td.top - f), (td.right + f), (td.bottom + f));
       p0.set(td);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       return;
    }
    public final void b(){
       this.e.invalidateSelf();
    }
    public final void c(List p0,List p1){
       or0 oor0;
       int i = p0.size() - 1;
       az uoaz = null;
       v97 ov97 = uoaz;
       while (i >= 0) {
          oor0 = p0.get(i);
          if (oor0 instanceof v97 && oor0.c == 2) {
             ov97 = oor0;
          }
          i = i - 1;
       }
       if (ov97 != null) {
          ov97.f(this);
       }
       int i1 = p1.size();
       while (true) {
          i1--;
          bz tg = this.g;
          if (i1 >= 0) {
             oor0 = p1.get(i1);
             if (oor0 instanceof v97) {
                or0 oor01 = oor0;
                if (oor01.c == 2) {
                   if (uoaz != null) {
                      tg.add(uoaz);
                   }
                   oor01.f(this);
                   uoaz = new az(oor01);
                }
             }
             if (oor0 instanceof r95) {
                if (uoaz == null) {
                   uoaz = new az(ov97);
                }
                uoaz.a.add(oor0);
             }
          }else if(uoaz != null){
             tg.add(uoaz);
          }
          return;
       }
    }
    public void e(Canvas p0,Matrix p1,int p2){
       float f1;
       bz g;
       int i5;
       float f4;
       float length;
       int i6;
       float f7;
       float f8;
       float f9;
       sy z;
       bz uobz = this;
       Canvas uCanvas = p0;
       Matrix matrix = p1;
       float[] uofloatArray = mf7.d.get();
       int i = 0;
       uofloatArray[i] = 0;
       int i1 = 1;
       uofloatArray[i1] = 0;
       uofloatArray[2] = 0x471212bb;
       int i2 = 3;
       uofloatArray[i2] = 0x471a973c;
       matrix.mapPoints(uofloatArray);
       int i4 = ((uofloatArray[2] - uofloatArray[i]) && (uofloatArray[i2] - uofloatArray[i1]))? 0: 1;
       if (uofloatArray) {
          return;
       }else {
          bz k = uobz.k;
          float f = 100.00f;
          bz i3 = uobz.i;
          i3.setAlpha(Math.max(i, Math.min(255, (int)(((((float)p2 / 0x437f0000) * (float)k.i(k.b(), k.c())) / f) * 0x437f0000))));
          i3.setStrokeWidth((mf7.d(p1) * uobz.j.i()));
          if ((i3.getStrokeWidth()) <= 0) {
             return;
          }else {
             bz l = uobz.l;
             if (!l.isEmpty()) {
                f4 = mf7.d(p1);
                i5 = 0;
                while (true) {
                   bz h = uobz.h;
                   if (i5 < l.size()) {
                      length = l.get(i5).e().floatValue();
                      h[i5] = length;
                      if (!(i6 = i5 % 2)) {
                         if ((length - 0x3f800000) < 0) {
                            h[i5] = 0x3f800000;
                         }
                      }else {
                         i6 = 0x3dcccccd;
                         if ((length - i6) < 0) {
                            h[i5] = i6;
                         }
                      }
                      length = h[i5] * f4;
                      h[i5] = length;
                      i5 = i5 + 1;
                   }else if((l = uobz.m) == null){
                      f1 = 0;
                   }else {
                      f1 = l.e().floatValue() * f4;
                   }
                   i3.setPathEffect(new DashPathEffect(h, f1));
                }
             }
             if ((l = uobz.n) != null) {
                f1 = l.e().floatValue();
                if (!(0 - f1)) {
                   i3.setMaskFilter(null);
                }else if(uobz.o - f1){
                   g = uobz.f;
                   if (!(f1 - g.y)) {
                      z = g.z;
                   }else {
                      BlurMaskFilter uBlurMaskFil = new BlurMaskFilter((f1 / 2.00f), BlurMaskFilter$Blur.NORMAL);
                      g.z = uBlurMaskFil;
                      g.y = f1;
                      z = uBlurMaskFil;
                   }
                   i3.setMaskFilter(z);
                }
                uobz.o = f1;
             }
             if ((l = uobz.p) != null) {
                l.a(i3);
             }
             i4 = 0;
             while (true) {
                g = uobz.g;
                if (i4 < g.size()) {
                   az uoaz = g.get(i4);
                   bz b = uobz.b;
                   az a = uoaz.a;
                   if (uoaz.b != null) {
                      b.reset();
                      i5 = a.size();
                      while ((i5 = i5 - 1) >= 0) {
                         b.addPath(a.get(i5).d(), matrix);
                      }
                      uoaz = uoaz.b;
                      float f2 = uoaz.d.e().floatValue() / f;
                      float f3 = uoaz.e.e().floatValue() / f;
                      f4 = uoaz.f.e().floatValue() / 360.00f;
                      if ((f2 - 0x3c23d70a) < 0 && (0x3f7d70a4 - f3) > 0) {
                         uCanvas.drawPath(b, i3);
                      }else {
                         bz a1 = uobz.a;
                         a1.setPath(b, i);
                         length = a1.getLength();
                         while (a1.nextContour()) {
                            length = a1.getLength() + length;
                         }
                         f4 = f4 * length;
                         f2 = (f2 * length) + f4;
                         f3 = (f3 * length) + f4;
                         f4 = Math.min(f3, ((f2 + length) - 0x3f800000));
                         i6 = a.size() - 1;
                         float f5 = 0;
                         while (i6 >= 0) {
                            k = uobz.c;
                            k.set(a.get(i6).d());
                            k.transform(matrix);
                            a1.setPath(k, i);
                            float length1 = a1.getLength();
                            if ((length - f4) > 0) {
                               float f6 = f4 - length;
                               if (((f7 = f5 + length1)) < 0 && (f5 - f6) < 0) {
                                  if ((length - f2) > 0) {
                                     f7 = f2 - length;
                                     f7 = f7 / length1;
                                     f8 = f7;
                                  }else {
                                     f8 = 0;
                                  }
                                  f9 = f6 / length1;
                                  mf7.a(k, f8, Math.min(f9, 0x3f800000), 0);
                                  uCanvas.drawPath(k, i3);
                               }else {
                               label_0207 :
                                  f9 = f5 + length1;
                                  if ((f9 - f2) >= 0 && (f4 - f5) <= 0) {
                                     if ((f9 - f4) <= 0 && (f2 - f5) < 0) {
                                        uCanvas.drawPath(k, i3);
                                     }else if((f2 - f5) < 0){
                                        f8 = 0;
                                     }else {
                                        f8 = f2 - f5;
                                        f8 = f8 / length1;
                                     }
                                     if ((f9 - f4) > 0) {
                                        f9 = 0x3f800000;
                                     }else {
                                        f9 = f4 - f5;
                                        f9 = f9 / length1;
                                     }
                                     mf7.a(k, f8, f9, 0);
                                     uCanvas.drawPath(k, i3);
                                  }
                               }
                            }else {
                               goto label_0207 ;
                            }
                            f5 = f5 + length1;
                            i6 = i6 - 1;
                            uobz = this;
                            i = false;
                            f = 0x42c80000;
                         }
                      }
                      i = 1;
                   }else {
                      b.reset();
                      for (int i7 = a.size() - 1; i7 >= 0; i7 = i7 - 1) {
                         b.addPath(a.get(i7).d(), matrix);
                      }
                      uCanvas.drawPath(b, i3);
                   }
                   i4 = i4 + 1;
                   uobz = this;
                   i = false;
                   f = 100.00f;
                }else {
                   break ;
                }
             }
             return;
          }
       }
    }
}
