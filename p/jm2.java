package p.jm2;
import p.bz;
import p.bw3;
import p.sy;
import p.im2;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import p.qd;
import p.rd;
import java.util.List;
import p.qv3;
import android.graphics.RectF;
import p.sv3;
import p.qy;
import p.my;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.lang.Long;
import java.lang.Object;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import p.yl2;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint;

public final class jm2 extends bz	// class@001b03 from classes.dex
{
    public final boolean q;
    public final qv3 r;
    public final qv3 s;
    public final RectF t;
    public final int u;
    public final int v;
    public final qy w;
    public final qy x;
    public final qy y;

    public void jm2(bw3 p0,sy p1,im2 p2){
       Paint$Cap sQUARE;
       Paint$Join join;
       Paint$Join bEVEL;
       int i = this;
       im2 oim2 = p2;
       im2 g = oim2.g;
       void ovoid = null;
       if (g == null) {
          throw ovoid;
       }
       int i1 = g - 1;
       int i2 = 1;
       if (i1) {
          sQUARE = (i1 != i2)? Paint$Cap.SQUARE: Paint$Cap.ROUND;
       }else {
          sQUARE = Paint$Cap.BUTT;
       }
       Paint$Cap uCap = sQUARE;
       if ((g = oim2.h) != null) {
          if (i1 = g - 1) {
             if (i1 != i2) {
                if (i1 != 2) {
                   join = ovoid;
                label_0031 :
                   super(p0, p1, uCap, join, oim2.i, oim2.c, oim2.f, oim2.j, oim2.k);
                   i.r = super();
                   i.s = new qv3();
                   i.t = new RectF();
                   i.u = oim2.a;
                   i.q = oim2.l;
                   i.v = (int)(p0.a.b() / 32.00f);
                   qy oqy = oim2.b.a();
                   i.w = oqy;
                   oqy.a(this);
                   p1.f(oqy);
                   oqy = oim2.d.a();
                   i.x = oqy;
                   oqy.a(this);
                   p1.f(oqy);
                   oqy = oim2.e.a();
                   i.y = oqy;
                   oqy.a(this);
                   p1.f(oqy);
                   return;
                }else {
                   bEVEL = Paint$Join.BEVEL;
                }
             }else {
                bEVEL = Paint$Join.ROUND;
             }
          }else {
             bEVEL = Paint$Join.MITER;
          }
          join = bEVEL;
          goto label_0031 ;
       }else {
          throw ovoid;
       }
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       long l;
       jm2 r;
       LinearGradient linearGradie;
       PointF pointF;
       PointF pointF1;
       yl2 oyl2;
       jm2 ojm2 = this;
       Matrix matrix = p1;
       if (ojm2.q != null) {
          return;
       }
       ojm2.a(ojm2.t, matrix, false);
       jm2 w = ojm2.w;
       jm2 y = ojm2.y;
       jm2 x = ojm2.x;
       Long longx = null;
       if (ojm2.u == 1) {
          l = (long)this.f();
          r = ojm2.r;
          if ((linearGradie = r.f(l, longx)) == null) {
             pointF = x.e();
             pointF1 = y.e();
             oyl2 = w.e();
             linearGradie = new LinearGradient(pointF.x, pointF.y, pointF1.x, pointF1.y, oyl2.b, oyl2.a, Shader$TileMode.CLAMP);
             r.h(l, linearGradie);
          }
       }else {
          l = (long)this.f();
          r = ojm2.s;
          if ((linearGradie = r.f(l, longx)) == null) {
             pointF = x.e();
             pointF1 = y.e();
             oyl2 = w.e();
             PointF x1 = pointF.x;
             PointF y1 = pointF.y;
             RadialGradient linearGradie1 = new RadialGradient(x1, y1, (float)Math.hypot((double)(pointF1.x - x1), (double)(pointF1.y - y1)), oyl2.b, oyl2.a, Shader$TileMode.CLAMP);
             r.h(l, linearGradie);
          }
       }
       linearGradie.setLocalMatrix(matrix);
       ojm2.i.setShader(linearGradie);
       super.e(p0, p1, p2);
       return;
    }
    public final int f(){
       jm2 tv = this.v;
       int i = Math.round((this.x.d * (float)tv));
       int i1 = Math.round((this.y.d * (float)tv));
       int i2 = Math.round((this.w.d * (float)tv));
       int i3 = (i)? 527 * i: 17;
       if (i1) {
          i3 = (i3 * 31) * i1;
       }
       if (i2) {
          i3 = (i3 * 31) * i2;
       }
       return i3;
    }
}
