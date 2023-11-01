package p.s42;
import p.oe1;
import p.my;
import p.or0;
import p.bw3;
import p.sy;
import p.id6;
import java.lang.Object;
import android.graphics.Path;
import p.zh3;
import java.util.ArrayList;
import java.lang.Class;
import p.uv1;
import p.rd;
import p.qy;
import p.z52;
import p.o11;
import p.xe1;
import android.graphics.Path$FillType;
import p.qd;
import android.graphics.RectF;
import android.graphics.Matrix;
import p.r95;
import java.util.List;
import android.graphics.Canvas;
import p.ij0;
import p.ph3;
import java.lang.Integer;
import java.lang.Math;
import android.graphics.Paint;
import java.lang.Float;
import android.graphics.MaskFilter;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;

public final class s42 implements oe1, my, or0	// class@0025b6 from classes.dex
{
    public final Path a;
    public final zh3 b;
    public final sy c;
    public final boolean d;
    public final ArrayList e;
    public final qy f;
    public final qy g;
    public final bw3 h;
    public final z52 i;
    public float j;
    public final xe1 k;

    public void s42(bw3 p0,sy p1,id6 p2){
       qy oqy;
       id6 c;
       id6 d;
       super();
       Path path = new Path();
       this.a = path;
       this.b = new zh3(1);
       this.e = new ArrayList();
       this.c = p1;
       p2.getClass();
       this.d = p2.e;
       this.h = p0;
       if (p1.j() != null) {
          oqy = p1.j().b.a();
          this.i = oqy;
          oqy.a(this);
          p1.f(oqy);
       }
       if (p1.k() != null) {
          this.k = new xe1(this, p1, p1.k());
       }
       if ((c = p2.c) != null && (d = p2.d) != null) {
          path.setFillType(p2.b);
          oqy = c.a();
          this.f = oqy;
          oqy.a(this);
          p1.f(oqy);
          oqy = d.a();
          this.g = oqy;
          oqy.a(this);
          p1.f(oqy);
          return;
       }else {
          this.f = null;
          this.g = null;
          return;
       }
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       s42 ta = this.a;
       ta.reset();
       boolean b = false;
       int i = 0;
       while (true) {
          s42 te = this.e;
          if (i < te.size()) {
             ta.addPath(te.get(i).d(), p1);
             i = i + 1;
          }else {
             break ;
          }
       }
       ta.computeBounds(p0, b);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       return;
    }
    public final void b(){
       this.h.invalidateSelf();
    }
    public final void c(List p0,List p1){
       int i = 0;
       while (i < p1.size()) {
          or0 oor0 = p1.get(i);
          if (oor0 instanceof r95) {
             this.e.add(oor0);
          }
          i++;
       }
       return;
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       s42 ti;
       s42 te;
       sy z;
       if (this.d != null) {
          return;
       }
       s42 tf = this.f;
       int i = 0;
       tf = this.b;
       tf.setColor(((Math.max(i, Math.min(255, (int)(((((float)p2 / 0x437f0000) * (float)this.g.e().intValue()) / 100.00f) * 0x437f0000))) << 24) | (tf.i(tf.b(), tf.c()) & 0xffffff)));
       if ((ti = this.i) != null) {
          float f = ti.e().floatValue();
          if (!(0 - f)) {
             tf.setMaskFilter(null);
          }else if(this.j - f){
             te = this.c;
             if (!(f - te.y)) {
                z = te.z;
             }else {
                BlurMaskFilter uBlurMaskFil = new BlurMaskFilter((f / 2.00f), BlurMaskFilter$Blur.NORMAL);
                te.z = uBlurMaskFil;
                te.y = f;
                z = uBlurMaskFil;
             }
             tf.setMaskFilter(z);
          }
          this.j = f;
       }
       if ((ti = this.k) != null) {
          ti.a(tf);
       }
       ti = this.a;
       ti.reset();
       while (true) {
          te = this.e;
          if (i < te.size()) {
             ti.addPath(te.get(i).d(), p1);
             i = i + 1;
          }else {
             break ;
          }
       }
       p0.drawPath(ti, tf);
       return;
    }
}
