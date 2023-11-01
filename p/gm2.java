package p.gm2;
import p.oe1;
import p.my;
import p.or0;
import p.bw3;
import p.sv3;
import p.sy;
import p.fm2;
import java.lang.Object;
import p.qv3;
import android.graphics.Path;
import p.zh3;
import android.graphics.RectF;
import java.util.ArrayList;
import java.lang.Class;
import android.graphics.Path$FillType;
import p.qy;
import p.qd;
import p.uv1;
import p.rd;
import p.z52;
import p.o11;
import p.xe1;
import android.graphics.Matrix;
import p.r95;
import java.util.List;
import android.graphics.Canvas;
import java.lang.Long;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import p.yl2;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import java.lang.Math;
import android.graphics.Shader;
import android.graphics.Paint;
import java.lang.Float;
import android.graphics.MaskFilter;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import java.lang.Integer;
import p.wa4;

public final class gm2 implements oe1, my, or0	// class@001736 from classes.dex
{
    public final boolean a;
    public final qv3 b;
    public final qv3 c;
    public final Path d;
    public final zh3 e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final qy i;
    public final qy j;
    public final qy k;
    public final qy l;
    public final bw3 m;
    public final int n;
    public final z52 o;
    public float p;
    public final xe1 q;

    public void gm2(bw3 p0,sv3 p1,sy p2,fm2 p3){
       super();
       this.b = new qv3();
       this.c = new qv3();
       Path path = new Path();
       this.d = path;
       this.e = new zh3(1);
       this.f = new RectF();
       this.g = new ArrayList();
       this.p = 0;
       p3.getClass();
       this.a = p3.g;
       this.m = p0;
       this.h = p3.a;
       path.setFillType(p3.b);
       this.n = (int)(p1.b() / 32.00f);
       qy oqy = p3.c.a();
       this.i = oqy;
       oqy.a(this);
       p2.f(oqy);
       oqy = p3.d.a();
       this.j = oqy;
       oqy.a(this);
       p2.f(oqy);
       oqy = p3.e.a();
       this.k = oqy;
       oqy.a(this);
       p2.f(oqy);
       oqy = p3.f.a();
       this.l = oqy;
       oqy.a(this);
       p2.f(oqy);
       if (p2.j() != null) {
          oqy = p2.j().b.a();
          this.o = oqy;
          oqy.a(this);
          p2.f(oqy);
       }
       if (p2.k() != null) {
          this.q = new xe1(this, p2, p2.k());
       }
       return;
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       gm2 td = this.d;
       td.reset();
       boolean b = false;
       int i = 0;
       while (true) {
          gm2 tg = this.g;
          if (i < tg.size()) {
             td.addPath(tg.get(i).d(), p1);
             i = i + 1;
          }else {
             break ;
          }
       }
       td.computeBounds(p0, b);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       return;
    }
    public final void b(){
       this.m.invalidateSelf();
    }
    public final void c(List p0,List p1){
       int i = 0;
       while (i < p1.size()) {
          or0 oor0 = p1.get(i);
          if (oor0 instanceof r95) {
             this.g.add(oor0);
          }
          i++;
       }
       return;
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       LinearGradient linearGradie;
       gm2 o;
       PointF pointF1;
       yl2 oyl2;
       RadialGradient radialGradie;
       gm2 ogm2 = this;
       Matrix matrix = p1;
       if (ogm2.a != null) {
          return;
       }
       gm2 d = ogm2.d;
       d.reset();
       boolean b = false;
       int i = 0;
       while (true) {
          gm2 g = ogm2.g;
          if (i < g.size()) {
             d.addPath(g.get(i).d(), matrix);
             i = i + 1;
          }else {
             break ;
          }
       }
       d.computeBounds(ogm2.f, b);
       Long longx = null;
       gm2 i1 = ogm2.i;
       gm2 l = ogm2.l;
       gm2 k = ogm2.k;
       if (ogm2.h == 1) {
          long l1 = (long)this.f();
          gm2 b1 = ogm2.b;
          if ((linearGradie = b1.f(l1, longx)) == null) {
             PointF pointF = k.e();
             pointF1 = l.e();
             oyl2 = i1.e();
             LinearGradient linearGradie1 = v15;
             LinearGradient linearGradie2 = v15;
             linearGradie1 = new LinearGradient(pointF.x, pointF.y, pointF1.x, pointF1.y, oyl2.b, oyl2.a, Shader$TileMode.CLAMP);
             b1.h(l1, linearGradie2);
             linearGradie = linearGradie2;
          }
       }else {
          long l2 = (long)this.f();
          gm2 c = ogm2.c;
          if ((radialGradie = c.f(l2, longx)) != null) {
             linearGradie = radialGradie;
          }else {
             PointF pointF2 = k.e();
             pointF1 = l.e();
             oyl2 = i1.e();
             yl2 b2 = oyl2.b;
             oyl2 = oyl2.a;
             PointF x = pointF2.x;
             PointF y = pointF2.y;
             gm2 ogm21 = c;
             float f1 = (float)Math.hypot((double)(pointF1.x - x), (double)(pointF1.y - y));
             float f2 = ((f1) <= 0)? 0x3a83126f: f1;
             radialGradie = new RadialGradient(x, y, f2, b2, oyl2, Shader$TileMode.CLAMP);
             ogm21.h(l2, c);
          }
       }
       linearGradie.setLocalMatrix(matrix);
       gm2 e = ogm2.e;
       e.setShader(linearGradie);
       if ((o = ogm2.o) != null) {
          float f = o.e().floatValue();
          if (!(0 - f)) {
             e.setMaskFilter(null);
          }else if(ogm2.p - f){
             e.setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter$Blur.NORMAL));
          }
          ogm2.p = f;
       }
       if ((o = ogm2.q) != null) {
          o.a(e);
       }
       e.setAlpha(Math.max(0, Math.min(255, (int)(((((float)p2 / 0x437f0000) * (float)ogm2.j.e().intValue()) / 100.00f) * 0x437f0000))));
       p0.drawPath(d, e);
       return;
    }
    public final int f(){
       gm2 tn = this.n;
       int i = Math.round((this.k.d * (float)tn));
       int i1 = Math.round((this.l.d * (float)tn));
       int i2 = Math.round((this.i.d * (float)tn));
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
