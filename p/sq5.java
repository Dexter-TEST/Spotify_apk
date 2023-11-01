package p.sq5;
import p.my;
import p.or0;
import p.r95;
import p.bw3;
import p.sy;
import p.tq5;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.RectF;
import p.o93;
import java.lang.Class;
import p.qy;
import p.yd;
import p.rd;
import p.z52;
import java.util.List;
import java.util.ArrayList;
import p.v97;
import p.iz5;
import android.graphics.PointF;
import java.lang.Float;
import java.lang.Math;

public final class sq5 implements my, or0, r95	// class@00267e from classes.dex
{
    public final Path a;
    public final RectF b;
    public final boolean c;
    public final bw3 d;
    public final qy e;
    public final qy f;
    public final z52 g;
    public final o93 h;
    public qy i;
    public boolean j;

    public void sq5(bw3 p0,sy p1,tq5 p2){
       super();
       this.a = new Path();
       this.b = new RectF();
       this.h = new o93();
       this.i = null;
       p2.getClass();
       this.c = p2.c;
       this.d = p0;
       qy oqy = p2.d.a();
       this.e = oqy;
       qy oqy1 = p2.e.a();
       this.f = oqy1;
       qy oqy2 = p2.b.a();
       this.g = oqy2;
       p1.f(oqy);
       p1.f(oqy1);
       p1.f(oqy2);
       oqy.a(this);
       oqy1.a(this);
       oqy2.a(this);
    }
    public final void b(){
       this.j = false;
       this.d.invalidateSelf();
    }
    public final void c(List p0,List p1){
       int i = 0;
       while (true) {
          ArrayList uArrayList = p0;
          if (i < uArrayList.size()) {
             or0 oor0 = uArrayList.get(i);
             if (oor0 instanceof v97) {
                or0 oor01 = oor0;
                if (oor01.c == 1) {
                   this.h.a.add(oor01);
                   oor01.f(this);
                }else if(oor0 instanceof iz5){
                   this.i = oor0.b;
                }
             }else {
             }
             i++;
          }else {
             break ;
          }
       }
       return;
    }
    public final Path d(){
       sq5 g;
       sq5 i;
       float f6;
       float f7;
       float f9;
       sq5 osq5 = this;
       sq5 a = osq5.a;
       if (osq5.j != null) {
          return a;
       }
       a.reset();
       boolean b = true;
       if (osq5.c != null) {
          osq5.j = b;
          return a;
       }else {
          PointF pointF = osq5.f.e();
          float f = 2.00f;
          float f1 = pointF.x / f;
          float f2 = pointF.y / f;
          float f3 = 0;
          float f4 = ((g = osq5.g) == null)? 0: g.i();
          if (!(f3 - f4) && (i = osq5.i) != null) {
             f4 = Math.min(i.e().floatValue(), Math.min(f1, f2));
          }
          float f5 = Math.min(f1, f2);
          if ((f5 - f4) > 0) {
             f4 = f5;
          }
          PointF pointF1 = osq5.e.e();
          a.moveTo((pointF1.x + f1), ((pointF1.y - f2) + f4));
          a.lineTo((pointF1.x + f1), ((pointF1.y + f2) - f4));
          sq5 b1 = osq5.b;
          if ((v12 = f3 - f4) > 0) {
             f6 = pointF1.x + f1;
             f7 = f4 * f;
             float f8 = f6 - f7;
             f9 = pointF1.y + f2;
             b1.set(f8, (f9 - f7), f6, f9);
             a.arcTo(b1, f3, 90.00f, false);
          }
          a.lineTo(((pointF1.x - f1) + f4), (pointF1.y + f2));
          if (v12 > 0) {
             f9 = pointF1.x - f1;
             f3 = pointF1.y + f2;
             f6 = f4 * f;
             f7 = f3 - f6;
             b1.set(f9, f7, (f6 + f9), f3);
             a.arcTo(b1, 90.00f, 90.00f, false);
          }
          a.lineTo((pointF1.x - f1), ((pointF1.y - f2) + f4));
          if (v12 > 0) {
             f9 = pointF1.x - f1;
             f3 = pointF1.y - f2;
             f6 = f4 * f;
             f7 = f9 + f6;
             b1.set(f9, f3, f7, (f6 + f3));
             a.arcTo(b1, 180.00f, 90.00f, false);
          }
          a.lineTo(((pointF1.x + f1) - f4), (pointF1.y - f2));
          if (v12 > 0) {
             f9 = pointF1.x + f1;
             f4 = f4 * f;
             f1 = f9 - f4;
             f = pointF1.y - f2;
             b1.set(f1, f, f9, (f4 + f));
             a.arcTo(b1, 270.00f, 90.00f, false);
          }
          a.close();
          osq5.h.a(a);
          osq5.j = true;
          return a;
       }
    }
}
