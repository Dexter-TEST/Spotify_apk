package p.di1;
import p.r95;
import p.my;
import p.or0;
import p.bw3;
import p.sy;
import p.of0;
import java.lang.Object;
import android.graphics.Path;
import p.o93;
import java.lang.Class;
import p.qy;
import p.qd;
import p.yd;
import java.util.List;
import java.util.ArrayList;
import p.v97;
import android.graphics.PointF;

public final class di1 implements r95, my, or0	// class@00134f from classes.dex
{
    public final Path a;
    public final bw3 b;
    public final qy c;
    public final qy d;
    public final of0 e;
    public final o93 f;
    public boolean g;

    public void di1(bw3 p0,sy p1,of0 p2){
       super();
       this.a = new Path();
       this.f = new o93();
       p2.getClass();
       this.b = p0;
       qy oqy = p2.b.a();
       this.c = oqy;
       qy oqy1 = p2.a.a();
       this.d = oqy1;
       this.e = p2;
       p1.f(oqy);
       p1.f(oqy1);
       oqy.a(this);
       oqy1.a(this);
    }
    public final void b(){
       this.g = false;
       this.b.invalidateSelf();
    }
    public final void c(List p0,List p1){
       int i = 0;
       while (true) {
          ArrayList uArrayList = p0;
          if (i < uArrayList.size()) {
             or0 oor0 = uArrayList.get(i);
             if (oor0 instanceof v97 && oor0.c == 1) {
                this.f.a.add(oor0);
                oor0.f(this);
             }
             i++;
          }else {
             break ;
          }
       }
       return;
    }
    public final Path d(){
       float f6;
       float f7;
       float f9;
       di1 uodi11;
       di1 uodi1 = this;
       di1 a = uodi1.a;
       if (uodi1.g != null) {
          return a;
       }
       a.reset();
       di1 e = uodi1.e;
       if (e.d != null) {
          uodi1.g = true;
          return a;
       }else {
          PointF pointF = uodi1.c.e();
          float f = 2.00f;
          float f1 = pointF.x / f;
          float f2 = pointF.y / f;
          float f3 = 0x3f0d6239;
          float f4 = f1 * f3;
          float f5 = f2 * f3;
          a.reset();
          if (e.c != null) {
             f6 = - f2;
             a.moveTo(0, f6);
             f7 = 0 - f4;
             float f8 = - f1;
             f9 = 0 - f5;
             uodi11 = a;
             float f10 = f8;
             float f11 = f8;
             float f12 = f8;
             uodi11.cubicTo(f7, f6, f10, f9, f11, 0);
             f5 = f5 + 0;
             uodi11.cubicTo(f12, f5, f7, f2, 0, f2);
             f4 = f4 + 0;
             uodi11.cubicTo(f4, f2, f1, f5, f1, 0);
             uodi11.cubicTo(f1, f9, f4, f6, 0, f6);
          }else {
             f6 = - f2;
             a.moveTo(0, f6);
             f7 = f4 + 0;
             f9 = 0 - f5;
             uodi11 = a;
             uodi11.cubicTo(f7, f6, f1, f9, f1, 0);
             f5 = f5 + 0;
             uodi11.cubicTo(f1, f5, f7, f2, 0, f2);
             f4 = 0 - f4;
             f1 = - f1;
             uodi11.cubicTo(f4, f2, f1, f5, f1, 0);
             uodi11.cubicTo(f1, f9, f4, f6, 0, f6);
          }
          PointF pointF1 = uodi1.d.e();
          a.offset(pointF1.x, pointF1.y);
          a.close();
          uodi1.f.a(a);
          uodi1.g = true;
          return a;
       }
    }
}
