package p.ku5;
import p.oe1;
import p.r95;
import p.bn2;
import p.my;
import p.or0;
import p.bw3;
import p.sy;
import p.tq5;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Path;
import java.lang.Class;
import p.qy;
import p.rd;
import p.z52;
import p.wd;
import p.lr7;
import android.graphics.RectF;
import p.qr0;
import java.util.List;
import java.lang.Float;
import android.graphics.Canvas;
import p.wa4;

public final class ku5 implements oe1, r95, bn2, my, or0	// class@001c87 from classes.dex
{
    public final Matrix a;
    public final Path b;
    public final bw3 c;
    public final sy d;
    public final boolean e;
    public final z52 f;
    public final z52 g;
    public final lr7 h;
    public qr0 i;

    public void ku5(bw3 p0,sy p1,tq5 p2){
       super();
       this.a = new Matrix();
       this.b = new Path();
       this.c = p0;
       this.d = p1;
       p2.getClass();
       this.e = p2.c;
       qy oqy = p2.b.a();
       this.f = oqy;
       p1.f(oqy);
       oqy.a(this);
       oqy = p2.d.a();
       this.g = oqy;
       p1.f(oqy);
       oqy.a(this);
       tq5 e = p2.e;
       e.getClass();
       lr7 olr7 = new lr7(e);
       this.h = olr7;
       olr7.a(p1);
       olr7.b(this);
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       this.i.a(p0, p1, p2);
    }
    public final void b(){
       this.c.invalidateSelf();
    }
    public final void c(List p0,List p1){
       this.i.c(p0, p1);
    }
    public final Path d(){
       Path path = this.i.d();
       ku5 tb = this.b;
       tb.reset();
       float f = this.g.e().floatValue();
       int i = (int)this.f.e().floatValue();
       while ((i = i - 1) >= 0) {
          ku5 ta = this.a;
          float f1 = (float)i + f;
          ta.set(this.h.g(f1));
          tb.addPath(path, ta);
       }
       return tb;
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       float f = this.f.e().floatValue();
       float f1 = this.g.e().floatValue();
       ku5 th = this.h;
       float f2 = th.m.e().floatValue() / 100.00f;
       float f3 = th.n.e().floatValue() / 100.00f;
       int i = (int)f;
       while ((i = i - 1) >= 0) {
          ku5 ta = this.a;
          ta.set(p1);
          float f4 = (float)i;
          float f5 = f4 + f1;
          ta.preConcat(th.g(f5));
          f4 = f4 / f;
          float f6 = f3 - f2;
          f6 = f6 * f4;
          f6 = f6 + f2;
          f6 = f6 * (float)p2;
          this.i.e(p0, ta, (int)f6);
       }
       return;
    }
}
