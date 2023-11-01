package p.sy;
import p.oe1;
import p.my;
import p.bw3;
import p.ni3;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.Matrix;
import p.zh3;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import java.util.ArrayList;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.Paint;
import java.lang.Class;
import p.lr7;
import p.wd;
import java.util.List;
import p.aw1;
import java.util.Iterator;
import p.qy;
import p.z52;
import p.ry;
import java.lang.Float;
import android.graphics.Canvas;
import java.lang.Integer;
import p.w14;
import p.en6;
import java.lang.Math;
import p.mf7;
import android.os.Build$VERSION;
import java.util.Collections;
import p.uv1;
import p.o11;
import p.sv3;
import p.tb1;
import java.util.Map;
import p.f44;
import java.lang.String;
import java.util.Set;
import p.tp2;

public abstract class sy implements oe1, my	// class@0026c7 from classes.dex
{
    public final Path a;
    public final Matrix b;
    public final Matrix c;
    public final zh3 d;
    public final zh3 e;
    public final zh3 f;
    public final zh3 g;
    public final zh3 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final bw3 o;
    public final ni3 p;
    public final aw1 q;
    public z52 r;
    public sy s;
    public sy t;
    public List u;
    public final ArrayList v;
    public final lr7 w;
    public boolean x;
    public float y;
    public BlurMaskFilter z;

    public void sy(bw3 p0,ni3 p1){
       super();
       this.a = new Path();
       this.b = new Matrix();
       this.c = new Matrix();
       int i = 1;
       this.d = new zh3(i);
       this.e = new zh3(PorterDuff$Mode.DST_IN, 0);
       this.f = new zh3(PorterDuff$Mode.DST_OUT, 0);
       zh3 ozh3 = new zh3(i);
       this.g = ozh3;
       this.h = new zh3(PorterDuff$Mode.CLEAR);
       this.i = new RectF();
       this.j = new RectF();
       this.k = new RectF();
       this.l = new RectF();
       this.m = new RectF();
       this.n = new Matrix();
       this.v = new ArrayList();
       this.x = i;
       this.y = 0;
       this.o = p0;
       this.p = p1;
       if (p1.u == 3) {
          ozh3.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       }else {
          ozh3.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       }
       ni3 i1 = p1.i;
       i1.getClass();
       lr7 olr7 = new lr7(i1);
       this.w = olr7;
       olr7.b(this);
       if ((i1 = p1.h) != null && !i1.isEmpty()) {
          aw1 uoaw1 = new aw1(i1);
          this.q = uoaw1;
          Iterator iterator = uoaw1.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this);
          }
          iterator = this.q.b.iterator();
          while (iterator.hasNext()) {
             qy oqy = iterator.next();
             this.f(oqy);
             oqy.a(this);
          }
       }
       sy tp = this.p;
       if (!tp.t.isEmpty()) {
          z52 oz52 = new z52(tp.t);
          this.r = oz52;
          oz52.b = i;
          oz52.a(new ry(this));
          if (0x3f800000 - this.r.e().floatValue()) {
             i = 0;
          }
          if (i != this.x) {
             this.x = i;
             this.o.invalidateSelf();
          }
          this.f(this.r);
       }else if(i != this.x){
          this.x = i;
          this.o.invalidateSelf();
       }
       return;
    }
    public void a(RectF p0,Matrix p1,boolean p2){
       sy tu;
       this.i.set(0, 0, 0, 0);
       this.g();
       sy tn = this.n;
       tn.set(p1);
       if (p2) {
          if ((tu = this.u) != null) {
             int i = tu.size();
             while ((i--) >= 0) {
                tn.preConcat(this.u.get(i).w.f());
             }
          }else if((tu = this.t) != null){
             tn.preConcat(tu.w.f());
          }
       }
       tn.preConcat(this.w.f());
       return;
    }
    public final void b(){
       this.o.invalidateSelf();
    }
    public final void c(List p0,List p1){
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       lr7 j;
       Integer integer;
       float f1;
       sy e;
       w14 ow14;
       float f2;
       float f3;
       float f4;
       Path path;
       sy osy = this;
       Canvas uCanvas = p0;
       Matrix matrix = p1;
       if (osy.x != null) {
          sy p = osy.p;
          if (p.v == null) {
             this.g();
             sy b = osy.b;
             b.reset();
             b.set(matrix);
             int i = 1;
             for (int i1 = osy.u.size() - i; i1 >= 0; i1 = i1 - 1) {
                b.preConcat(osy.u.get(i1).w.f());
             }
             sy w = osy.w;
             int i2 = ((j = w.j) != null && (integer = j.e()) != null)? integer.intValue(): 100;
             i2 = (int)(((((float)p2 / 0x437f0000) * (float)i2) / 100.00f) * 0x437f0000);
             int b1 = false;
             int i3 = (osy.s != null)? 1: 0;
             if (!i3 && !this.l()) {
                b.preConcat(w.f());
                osy.i(uCanvas, b, i2);
                this.m();
                return;
             }else {
                sy i4 = osy.i;
                osy.a(i4, b, b1);
                int i5 = (osy.s != null)? 1: 0;
                int i6 = 3;
                float f = 0;
                if (i5 && p.u != i6) {
                   p = osy.l;
                   p.set(f, f, f, f);
                   osy.s.a(p, matrix, i);
                   if (!i4.intersect(p)) {
                      i4.set(f, f, f, f);
                   }
                }
                b.preConcat(w.f());
                p = osy.k;
                p.set(f, f, f, f);
                sy a = osy.a;
                int i7 = 2;
                sy q = osy.q;
                if (this.l()) {
                   i1 = q.c.size();
                   int i9 = 0;
                   while (true) {
                      if (i9 < i1) {
                         w14 ow141 = q.c.get(i9);
                         if ((path = q.a.get(i9).e()) != null) {
                            a.set(path);
                            a.transform(b);
                            if (b1 = en6.A(ow141.a)) {
                               if (b1 != i) {
                                  if (b1 != i7) {
                                     if (b1 != i6) {
                                        e = osy.m;
                                        a.computeBounds(e, false);
                                        if (!i9) {
                                           p.set(e);
                                        }else {
                                           p.set(Math.min(p.left, e.left), Math.min(p.top, e.top), Math.max(p.right, e.right), Math.max(p.bottom, e.bottom));
                                        }
                                     }
                                  }
                               }
                            }
                            if (ow141.d == null) {
                            }
                         }
                         i9 = i9 + 1;
                         i = 1;
                         f4 = 3;
                         ow14 = 2;
                      }else if(!i4.intersect(p)){
                         f1 = 0;
                         i4.set(f1, f1, f1, f1);
                      label_0145 :
                         w = osy.j;
                         w.set(f1, f1, (float)p0.getWidth(), (float)p0.getHeight());
                         sy c = osy.c;
                         uCanvas.getMatrix(c);
                         if (!c.isIdentity()) {
                            c.invert(c);
                            c.mapRect(w);
                         }
                         if (!i4.intersect(w)) {
                            i4.set(f1, f1, f1, f1);
                         }
                         w = 0x3f800000;
                         if ((w - i4.width()) >= 0 && (w - i4.height()) >= 0) {
                            p = osy.d;
                            p.setAlpha(255);
                            mf7.e(uCanvas, i4, p, 31);
                            this.h(p0);
                            osy.i(uCanvas, b, i2);
                            i6 = 19;
                            if (this.l()) {
                               e = osy.e;
                               mf7.e(uCanvas, i4, e, i6);
                               if (Build$VERSION.SDK_INT < 28) {
                                  this.h(p0);
                               }
                               int i8 = 0;
                               while (i8 < q.c.size()) {
                                  ow14 = q.c.get(i8);
                                  qy oqy = q.a.get(i8);
                                  qy oqy1 = q.b.get(i8);
                                  i = en6.A(ow14.a);
                                  w = osy.f;
                                  ow14 = ow14.d;
                                  if (i) {
                                     if (i != 1) {
                                        if (i != 2) {
                                           if (i == 3) {
                                              if (!q.a.isEmpty()) {
                                                 i1 = 0;
                                                 while (true) {
                                                    if (i1 < q.c.size()) {
                                                       if (q.c.get(i1).a == 4) {
                                                          i1 = i1 + 1;
                                                       }
                                                    }else {
                                                       w = 1;
                                                    label_0216 :
                                                       if (w) {
                                                          p.setAlpha(255);
                                                          uCanvas.drawRect(i4, p);
                                                       }
                                                    }
                                                 }
                                              }
                                              w = 0;
                                              goto label_0216 ;
                                           }
                                        }else if(ow14 != null){
                                           mf7.e(uCanvas, i4, e, 31);
                                           uCanvas.drawRect(i4, p);
                                           f2 = (float)oqy1.e().intValue() * 2.55f;
                                           w.setAlpha((int)f2);
                                           a.set(oqy.e());
                                           a.transform(b);
                                           uCanvas.drawPath(a, w);
                                           p0.restore();
                                        }else {
                                           mf7.e(uCanvas, i4, e, 31);
                                           a.set(oqy.e());
                                           a.transform(b);
                                           f3 = (float)oqy1.e().intValue() * 2.55f;
                                           p.setAlpha((int)f3);
                                           uCanvas.drawPath(a, p);
                                           p0.restore();
                                        }
                                        c = 255;
                                     }else if(!i8){
                                        p.setColor(0xff000000);
                                        p.setAlpha(255);
                                        uCanvas.drawRect(i4, p);
                                     }else {
                                        f2 = 255;
                                     }
                                     if (ow14 != null) {
                                        mf7.e(uCanvas, i4, w, 31);
                                        uCanvas.drawRect(i4, p);
                                        f4 = (float)oqy1.e().intValue() * 2.55f;
                                        w.setAlpha((int)f4);
                                        a.set(oqy.e());
                                        a.transform(b);
                                        uCanvas.drawPath(a, w);
                                        p0.restore();
                                     }else {
                                        a.set(oqy.e());
                                        a.transform(b);
                                        uCanvas.drawPath(a, w);
                                     }
                                     ow14 = 31;
                                  }else if(ow14 != null){
                                     mf7.e(uCanvas, i4, p, 31);
                                     uCanvas.drawRect(i4, p);
                                     a.set(oqy.e());
                                     a.transform(b);
                                     f4 = (float)oqy1.e().intValue() * 2.55f;
                                     p.setAlpha((int)f4);
                                     uCanvas.drawPath(a, w);
                                     p0.restore();
                                  }else {
                                     a.set(oqy.e());
                                     a.transform(b);
                                     f3 = (float)oqy1.e().intValue() * 2.55f;
                                     p.setAlpha((int)f3);
                                     uCanvas.drawPath(a, p);
                                  }
                                  i8 = i8 + 1;
                                  oqy1 = 19;
                               }
                               p0.restore();
                            }
                            f2 = (osy.s != null)? 1: 0;
                            if (f2) {
                               mf7.e(uCanvas, i4, osy.g, 19);
                               this.h(p0);
                               osy.s.e(uCanvas, p1, i2);
                               p0.restore();
                            }
                            p0.restore();
                         }
                         this.m();
                         break ;
                      }
                   }
                }
                f1 = 0;
                goto label_0145 ;
             }
          }
       }
       return;
    }
    public final void f(qy p0){
       if (p0 == null) {
          return;
       }
       this.v.add(p0);
       return;
    }
    public final void g(){
       if (this.u != null) {
          return;
       }
       if (this.t == null) {
          this.u = Collections.emptyList();
          return;
       }else {
          this.u = new ArrayList();
          sy tt = this.t;
          while (tt != null) {
             this.u.add(tt);
             tt = tt.t;
          }
          return;
       }
    }
    public final void h(Canvas p0){
       sy ti = this.i;
       p0.drawRect((ti.left - 0x3f800000), (ti.top - 0x3f800000), (ti.right + 0x3f800000), (ti.bottom + 0x3f800000), this.h);
    }
    public abstract void i(Canvas p0,Matrix p1,int p2);
    public uv1 j(){
       return this.p.w;
    }
    public o11 k(){
       return this.p.x;
    }
    public final boolean l(){
       sy tq;
       boolean b = ((tq = this.q) != null && !tq.a.isEmpty())? true: false;
       return b;
    }
    public final void m(){
       f44 uof44;
       sv3 a = this.o.a.a;
       ni3 c = this.p.c;
       if (a.b == null) {
       }else {
          tb1 d = a.d;
          if ((uof44 = d.get(c)) == null) {
             uof44 = new f44();
             d.put(c, uof44);
          }
          int i = uof44.a + 1;
          uof44.a = i;
          if (i == Integer.MAX_VALUE) {
             uof44.a = i / 2;
          }
          if (c.equals("__container")) {
             Iterator iterator = a.c.iterator();
             if (iterator.hasNext()) {
                tp2.v(iterator.next());
                throw null;
             }
          }
       }
       return;
    }
    public void n(float p0){
       lr7 j;
       lr7 l;
       sy tq;
       sy tw = this.w;
       if ((j = tw.j) != null) {
          j.h(p0);
       }
       if ((j = tw.m) != null) {
          j.h(p0);
       }
       if ((j = tw.n) != null) {
          j.h(p0);
       }
       if ((j = tw.f) != null) {
          j.h(p0);
       }
       if ((j = tw.g) != null) {
          j.h(p0);
       }
       if ((j = tw.h) != null) {
          j.h(p0);
       }
       if ((j = tw.i) != null) {
          j.h(p0);
       }
       if ((j = tw.k) != null) {
          j.h(p0);
       }
       if ((l = tw.l) != null) {
          l.h(p0);
       }
       int i = 0;
       if ((tq = this.q) != null) {
          for (int i1 = 0; i1 < tq.a.size(); i1 = i1 + 1) {
             tq.a.get(i1).h(p0);
          }
       }
       if ((tq = this.r) != null) {
          tq.h(p0);
       }
       if ((tq = this.s) != null) {
          tq.n(p0);
       }
       tq = this.v;
       tq.size();
       for (; i < tq.size(); i = i + 1) {
          tq.get(i).h(p0);
       }
       tq.size();
       return;
    }
}
