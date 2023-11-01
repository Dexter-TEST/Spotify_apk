package p.lg7;
import android.graphics.Matrix;
import java.lang.Object;
import p.pk;
import p.ig7;
import android.graphics.Path;
import p.wh6;
import android.graphics.Canvas;
import java.util.ArrayList;
import p.jg7;
import p.kg7;
import java.lang.Math;
import java.lang.Class;
import p.v95;
import p.gg7;
import android.graphics.Path$FillType;
import p.hg7;
import android.graphics.PathMeasure;
import p.xl0;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import p.og7;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;

public final class lg7	// class@001d4e from classes.dex
{
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final ig7 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final pk o;
    public static final Matrix p;

    static {
       lg7.p = new Matrix();
    }
    public void lg7(){
       super();
       this.c = new Matrix();
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 255;
       this.m = null;
       this.n = null;
       this.o = new pk();
       this.g = new ig7();
       this.a = new Path();
       this.b = new Path();
    }
    public void lg7(lg7 p0){
       lg7 m;
       super();
       this.c = new Matrix();
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 255;
       this.m = null;
       this.n = null;
       pk opk = new pk();
       this.o = opk;
       this.g = new ig7(p0.g, opk);
       this.a = new Path(p0.a);
       this.b = new Path(p0.b);
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       if ((m = p0.m) != null) {
          opk.put(m, this);
       }
       this.n = p0.n;
       return;
    }
    public final void a(ig7 p0,Matrix p1,Canvas p2,int p3,int p4){
       int i2;
       kg7 a2;
       float f6;
       boolean b2;
       Paint paint;
       hg7 n;
       xl0 b3;
       int i5;
       lg7 olg7 = this;
       ig7 oig7 = p0;
       Canvas uCanvas = p2;
       oig7.a.set(p1);
       ig7 a = oig7.a;
       a.preConcat(oig7.j);
       p2.save();
       int i = 0;
       int i1 = 0;
       while (true) {
          ig7 b = oig7.b;
          if (i1 < b.size()) {
             jg7 ojg7 = b.get(i1);
             if (ojg7 instanceof ig7) {
                this.a(ojg7, a, p2, p3, p4);
             label_0238 :
                i2 = i1;
             }else if(ojg7 instanceof kg7){
                float f = (float)p3 / olg7.j;
                float f1 = (float)p4 / olg7.k;
                float f2 = Math.min(f, f1);
                lg7 c = olg7.c;
                c.set(a);
                c.postScale(f, f1);
                float[] uofloatArray = new float[4]{0,0x3f800000,0x3f800000,0};
                a.mapVectors(uofloatArray);
                float f3 = f2;
                int i3 = 3;
                i2 = i1;
                float f4 = uofloatArray[0] * uofloatArray[i3];
                float f5 = uofloatArray[1] * uofloatArray[2];
                f4 = f4 - f5;
                f = Math.max((float)Math.hypot((double)uofloatArray[i], (double)uofloatArray[1]), (float)Math.hypot((double)uofloatArray[2], (double)uofloatArray[i3]));
                f1 = 0;
                f2 = ((f1 - f) > 0)? Math.abs(f4) / f: 0;
                if (f1 - f2) {
                   ojg7.getClass();
                   lg7 a1 = olg7.a;
                   a1.reset();
                   if ((a2 = ojg7.a) != null) {
                      v95.b(a2, a1);
                   }
                   lg7 b1 = olg7.b;
                   b1.reset();
                   if (ojg7 instanceof gg7) {
                      Path$FillType wINDING = (ojg7.c == null)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
                      b1.setFillType(wINDING);
                      b1.addPath(a1, c);
                      uCanvas.clipPath(b1);
                   }else {
                      hg7 j = ojg7.j;
                      f5 = 0x3f800000;
                      if ((f1 - j) || (f5 - ojg7.k)) {
                         hg7 l = ojg7.l;
                         f4 = j + l;
                         f4 = f4 % f5;
                         f6 = ojg7.k + l;
                         f6 = f6 % f5;
                         if (olg7.f == null) {
                            olg7.f = new PathMeasure();
                         }
                         olg7.f.setPath(a1, false);
                         f5 = olg7.f.getLength();
                         f4 = f4 * f5;
                         f6 = f6 * f5;
                         a1.reset();
                         if ((f6 - f4) > 0) {
                            b2 = true;
                            olg7.f.getSegment(f4, f5, a1, b2);
                            f5 = 0;
                            olg7.f.getSegment(f5, f6, a1, b2);
                         }else {
                            f5 = 0;
                            olg7.f.getSegment(f4, f6, a1, true);
                         }
                         a1.rLineTo(f5, f5);
                      }
                      b1.addPath(a1, c);
                      hg7 g = ojg7.g;
                      b2 = (g.c != null)? 1: 0;
                      lg7 e = (!b2 && g.b == null)? 0: 1;
                      ColorFilter uColorFilter = null;
                      f4 = 0x437f0000;
                      i3 = 255;
                      if (b2) {
                         if (olg7.e == null) {
                            paint = new Paint(1);
                            olg7.e = paint;
                            paint.setStyle(Paint$Style.FILL);
                         }
                         e = olg7.e;
                         xl0 c1 = g.c;
                         i1 = (c1 != null)? 1: 0;
                         if (i1) {
                            c1.setLocalMatrix(c);
                            e.setShader(c1);
                            f = ojg7.i * f4;
                            e.setAlpha(Math.round(f));
                         }else {
                            e.setShader(uColorFilter);
                            e.setAlpha(i3);
                            b3 = g.b;
                            i3 = Color.alpha(b3);
                            i5 = b3 & 0xffffff;
                            f6 = (float)i3 * ojg7.i;
                            i1 = (int)f6 << 24;
                            i5 = i5 | i1;
                            e.setColor(i5);
                         }
                         e.setColorFilter(uColorFilter);
                         Path$FillType wINDING1 = (ojg7.c == null)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
                         b1.setFillType(wINDING1);
                         uCanvas.drawPath(b1, e);
                      }
                      g = ojg7.e;
                      e = (g.c != null)? 1: 0;
                      e = (!e && g.b == null)? 0: 1;
                      if (e) {
                         if (olg7.d == null) {
                            i1 = 1;
                            paint = new Paint(i1);
                            olg7.d = paint;
                            paint.setStyle(Paint$Style.STROKE);
                         }else {
                            i1 = 1;
                         }
                         e = olg7.d;
                         if ((n = ojg7.n) != null) {
                            e.setStrokeJoin(n);
                         }
                         if ((n = ojg7.m) != null) {
                            e.setStrokeCap(n);
                         }
                         e.setStrokeMiter(ojg7.o);
                         xl0 c2 = g.c;
                         if (c2 == null) {
                            i1 = 0;
                         }
                         if (i1) {
                            c2.setLocalMatrix(c);
                            e.setShader(c2);
                            f = ojg7.h * f4;
                            e.setAlpha(Math.round(f));
                         }else {
                            e.setShader(uColorFilter);
                            e.setAlpha(255);
                            b3 = g.b;
                            int i4 = Color.alpha(b3);
                            i5 = b3 & 0xffffff;
                            float f8 = (float)i4 * ojg7.h;
                            i1 = (int)f8 << 24;
                            i5 = i5 | i1;
                            e.setColor(i5);
                         }
                         e.setColorFilter(uColorFilter);
                         f2 = f2 * f3;
                         float f7 = ojg7.f * f2;
                         e.setStrokeWidth(f7);
                         uCanvas.drawPath(b1, e);
                      }
                   }
                }
             }else {
                goto label_0238 ;
             }
             i1 = i2 + 1;
             i = 0;
          }else {
             break ;
          }
       }
       p2.restore();
       return;
    }
    public float getAlpha(){
       return ((float)this.getRootAlpha() / 0x437f0000);
    }
    public int getRootAlpha(){
       return this.l;
    }
    public void setAlpha(float p0){
       this.setRootAlpha((int)(p0 * 0x437f0000));
    }
    public void setRootAlpha(int p0){
       this.l = p0;
    }
}
