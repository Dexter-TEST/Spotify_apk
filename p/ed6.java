package p.ed6;
import java.lang.Object;
import p.vd6;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Path;
import p.bd6;
import android.graphics.RectF;
import p.b7;
import android.graphics.Path$Direction;
import p.dd6;
import java.lang.Class;
import p.uw0;
import p.lv1;
import p.q24;
import java.util.BitSet;
import java.util.ArrayList;
import java.util.Collection;
import p.od6;
import java.lang.Math;
import android.graphics.Path$Op;

public final class ed6	// class@001467 from classes.dex
{
    public final vd6[] a;
    public final Matrix[] b;
    public final Matrix[] c;
    public final PointF d;
    public final Path e;
    public final Path f;
    public final vd6 g;
    public final float[] h;
    public final float[] i;
    public final Path j;
    public final Path k;
    public final boolean l;

    public void ed6(){
       super();
       vd6[] ovd6Array = new vd6[4];
       this.a = ovd6Array;
       Matrix[] matrixArray = new Matrix[4];
       this.b = matrixArray;
       matrixArray = new Matrix[4];
       this.c = matrixArray;
       this.d = new PointF();
       this.e = new Path();
       this.f = new Path();
       this.g = new vd6();
       float[] uofloatArray = new float[2];
       this.h = uofloatArray;
       float[] uofloatArray1 = new float[2];
       this.i = uofloatArray1;
       this.j = new Path();
       this.k = new Path();
       this.l = true;
       for (int i = 0; i < 4; i = i + 1) {
          this.a[i] = new vd6();
          this.b[i] = new Matrix();
          this.c[i] = new Matrix();
       }
       return;
    }
    public final void a(bd6 p0,float p1,RectF p2,b7 p3,Path p4){
       int i1;
       int i2;
       int i3;
       ed6 c;
       ed6 h;
       ed6 b;
       ed6 a;
       dd6 b1;
       dd6 c1;
       bd6 f1;
       bd6 b2;
       int i4;
       int i5;
       float f2;
       int i6;
       dd6 e1;
       object oobject2;
       dd6 uodd6;
       ed6 uoed61;
       float f5;
       bd6 j;
       dd6 e2;
       ed6 uoed6 = this;
       p4.rewind();
       ed6 e = uoed6.e;
       e.rewind();
       ed6 f = uoed6.f;
       f.rewind();
       RectF rectF = p2;
       f.addRect(rectF, Path$Direction.CW);
       dd6 v3 = new dd6(p0, p1, rectF, p3, p4);
       int i = 0;
       while (true) {
          i1 = 2;
          rectF = 4;
          i2 = 3;
          i3 = 1;
          c = uoed6.c;
          h = uoed6.h;
          b = uoed6.b;
          a = uoed6.a;
          b1 = v3.b;
          c1 = v3.c;
          if (i < rectF) {
             if (i != i3) {
                if (i != i1) {
                   f1 = (i != i2)? c1.f: c1.e;
                }else {
                   f1 = c1.h;
                }
             }else {
                f1 = c1.g;
             }
             if (i != i3) {
                if (i != i1) {
                   b2 = (i != i2)? c1.b: c1.a;
                }else {
                   b2 = c1.d;
                }
             }else {
                b2 = c1.c;
             }
             b2.getClass();
             b2.n(v3.a, f1.a(b1), a[i]);
             i4 = i + 1;
             i5 = i4 * 90;
             f2 = (float)i5;
             b[i].reset();
             ed6 d = uoed6.d;
             if (i != i3) {
                if (i != i1) {
                   if (i != 3) {
                      d.set(b1.right, b1.top);
                   }else {
                      d.set(b1.left, b1.top);
                   }
                }else {
                   d.set(b1.left, b1.bottom);
                }
             }else {
                d.set(b1.right, b1.bottom);
             }
             b[i].setTranslate(d.x, d.y);
             b[i].preRotate(f2);
             object oobject = a[i];
             i6 = 0;
             h[i6] = oobject.c;
             h[i3] = oobject.d;
             b[i].mapPoints(h);
             c[i].reset();
             c[i].setTranslate(h[i6], h[i3]);
             c[i].preRotate(f2);
             i1 = i4;
          }else {
             break ;
          }
       }
       i6 = 0;
       i4 = 0;
       while (i4 < rectF) {
          object oobject1 = a[i4];
          h[i6] = oobject1.a;
          h[i3] = oobject1.b;
          b[i4].mapPoints(h);
          dd6 d1 = v3.d;
          if (!i4) {
             d1.moveTo(h[i6], h[i3]);
          }else {
             d1.lineTo(h[i6], h[i3]);
          }
          a[i4].b(b[i4], d1);
          if ((e1 = v3.e) != null) {
             oobject2 = a[i4];
             oobject2.getClass();
             uodd6 = v3;
             e1.b.t.set(i4, false);
             oobject2.a(oobject2.f);
             e1.b.b[i4] = new od6(new ArrayList(oobject2.h), new Matrix(b[i4]));
          }else {
             uodd6 = v3;
          }
          int i7 = i4 + 1;
          i1 = i7 % 4;
          oobject2 = a[i4];
          h[0] = oobject2.c;
          h[1] = oobject2.d;
          b[i4].mapPoints(h);
          oobject2 = a[i1];
          int i8 = i7;
          ed6 i9 = uoed6.i;
          i9[0] = oobject2.a;
          i9[1] = oobject2.b;
          b[i1].mapPoints(i9);
          f2 = h[0] - i9[0];
          uoed61 = e;
          ed6 uoed62 = f;
          double d2 = (double)f2;
          f2 = h[1] - i9[1];
          float f3 = (float)Math.hypot(d2, (double)f2) - 0x3a83126f;
          float f4 = 0;
          f3 = Math.max(f3, f4);
          object oobject3 = a[i4];
          h[0] = oobject3.c;
          i5 = 1;
          h[i5] = oobject3.d;
          b[i4].mapPoints(h);
          if (i4 != i5 && i4 != 3) {
             f5 = b1.centerY() - h[i5];
             Math.abs(f5);
          }else {
             f5 = b1.centerX() - h[0];
             Math.abs(f5);
          }
          ed6 g = uoed6.g;
          g.d(f4, 270.00f, f4);
          dd6 uodd61 = c1;
          if (i4 != 1) {
             if (i4 != 2) {
                j = (i4 != 3)? uodd61.j: uodd61.i;
             }else {
                j = uodd61.l;
             }
          }else {
             j = uodd61.k;
          }
          j.getClass();
          g.c(f3, f4);
          e = uoed6.j;
          e.reset();
          g.b(c[i4], e);
          if (uoed6.l != null && (uoed6.b(e, i4) && !uoed6.b(e, i1))) {
             i9 = uoed62;
             e.op(e, i9, Path$Op.DIFFERENCE);
             h[0] = g.a;
             i1 = 1;
             h[i1] = g.b;
             c[i4].mapPoints(h);
             uoed61.moveTo(h[0], h[i1]);
             g.b(c[i4], uoed61);
          }else {
             i9 = uoed62;
             g.b(c[i4], d1);
          }
          dd6 uodd62 = uodd6;
          if ((e2 = uodd62.e) != null) {
             i2 = i4 + 4;
             e2.b.t.set(i2, false);
             g.a(g.f);
             e2.b.c[i4] = new od6(new ArrayList(g.h), new Matrix(c[i4]));
          }else {
             uoed6 = 0;
          }
          uoed6 = this;
          f = i9;
          i4 = i8;
          g = 4;
          i6 = 0;
          uodd61 = uodd62;
          e = uoed61;
          i3 = 1;
       }
       uoed61 = e;
       p4.close();
       uoed61.close();
       if (!uoed61.isEmpty()) {
          p4.op(uoed61, Path$Op.UNION);
       }
       return;
    }
    public final boolean b(Path p0,int p1){
       ed6 tk = this.k;
       tk.reset();
       this.a[p1].b(this.b[p1], tk);
       RectF rectF = new RectF();
       boolean b = true;
       p0.computeBounds(rectF, b);
       tk.computeBounds(rectF, b);
       p0.op(tk, Path$Op.INTERSECT);
       p0.computeBounds(rectF, b);
       if (rectF.isEmpty() && ((0x3f800000 - rectF.width()) <= 0 && (0x3f800000 - rectF.height()) > 0)) {
          b = false;
       }
       return b;
    }
}
