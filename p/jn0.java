package p.jn0;
import p.sy;
import p.bw3;
import p.ni3;
import java.util.List;
import p.sv3;
import java.util.ArrayList;
import android.graphics.RectF;
import android.graphics.Paint;
import p.qy;
import p.rd;
import p.z52;
import p.my;
import p.qv3;
import java.lang.Object;
import p.en6;
import java.lang.String;
import p.tp2;
import p.js3;
import p.o27;
import p.nd6;
import p.pn4;
import p.c63;
import java.util.Map;
import java.lang.Long;
import android.graphics.Matrix;
import android.graphics.Canvas;
import java.lang.Class;
import java.lang.Float;

public final class jn0 extends sy	// class@001b0a from classes.dex
{
    public final z52 A;
    public final ArrayList B;
    public final RectF C;
    public final RectF D;
    public float E;
    public boolean F;

    public void jn0(bw3 p0,ni3 p1,List p2,sv3 p3){
       int i2;
       int i3;
       sy osy;
       sy osy1;
       sy osy2;
       super(p0, p1);
       this.B = new ArrayList();
       this.C = new RectF();
       this.D = new RectF();
       Paint paint = new Paint();
       this.F = true;
       if ((p1 = p1.s) != null) {
          qy oqy = p1.a();
          this.A = oqy;
          this.f(oqy);
          oqy.a(this);
       }else {
          this.A = null;
       }
       qv3 oqv3 = new qv3(p3.h.size());
       int i = p2.size() - true;
       int i1 = 0;
       while (true) {
          i2 = 0;
          if (i >= 0) {
             ni3 oni3 = p2.get(i);
             if (i3 = en6.A(oni3.e)) {
                if (i3 != 1) {
                   if (i3 != 2) {
                      if (i3 != 3) {
                         if (i3 != 4) {
                            if (i3 != 5) {
                               js3.a("Unknown layer type ".concat(tp2.C(oni3.e)));
                               osy = null;
                            }else {
                               osy = new o27(p0, oni3);
                            }
                         }else {
                            osy = new nd6(p3, p0, this, oni3);
                         }
                      }else {
                         osy = new pn4(p0, oni3);
                      }
                   }else {
                      osy = new c63(p0, oni3, i2);
                   }
                }else {
                   osy = new c63(p0, oni3, true);
                }
             }else {
                osy = new jn0(p0, oni3, p3.c.get(oni3.g), p3);
             }
             if (osy != null) {
                oqv3.h(osy.p.d, osy);
                if (i1 != null) {
                   i1.s = osy;
                   i1 = 0;
                }else {
                   this.B.add(i2, osy);
                   if ((i2 = en6.A(oni3.u)) == 1 || i2 == 2) {
                      i1 = osy;
                   }
                }
             }
             i = i - 1;
          }else {
             break ;
          }
       }
       while (i2 < oqv3.j()) {
          if ((osy1 = oqv3.f(oqv3.g(i2), null)) != null && (osy2 = oqv3.f(osy1.p.f, null)) != null) {
             osy1.t = osy2;
          }
          i2 = i2 + 1;
       }
       return;
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       super.a(p0, p1, p2);
       jn0 tB = this.B;
       for (int i = tB.size() - 1; i >= 0; i--) {
          jn0 tC = this.C;
          tC.set(0, 0, 0, 0);
          tB.get(i).a(tC, this.n, 1);
          p0.union(tC);
       }
       return;
    }
    public final void i(Canvas p0,Matrix p1,int p2){
       jn0 tD = this.D;
       sy tp = this.p;
       tD.set(0, 0, tp.o, tp.p);
       p1.mapRect(tD);
       this.o.getClass();
       p0.save();
       jn0 tB = this.B;
       int i = tB.size() - 1;
       while (i >= 0) {
          boolean i1 = (this.F == null && "__container".equals(tp.c))? 1: 0;
          i1 = (!i1 && !tD.isEmpty())? p0.clipRect(tD): true;
          if (i1) {
             tB.get(i).e(p0, p1, p2);
          }
          i = i - 1;
       }
       p0.restore();
       return;
    }
    public final void n(float p0){
       bw3 a;
       this.E = p0;
       super.n(p0);
       jn0 tA = this.A;
       sy tp = this.p;
       if (tA != null) {
          a = this.o.a;
          a = ((tA.e().floatValue() * tp.b.l) - tp.b.j) / ((a.k - a.j) + 0.01f);
       }
       if (tA == null) {
          ni3 b = tp.b;
          a = a - (tp.n / (b.k - b.j));
       }
       if ((0 - tp.m) && !"__container".equals(tp.c)) {
          a = a / tp.m;
       }
       tA = this.B;
       int i = tA.size();
       while ((i = i - 1) >= 0) {
          tA.get(i).n(a);
       }
       return;
    }
}
