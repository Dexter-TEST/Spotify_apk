package p.rh3;
import android.view.animation.LinearInterpolator;
import java.lang.String;
import p.xq7;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import p.wa4;
import p.mf7;
import android.view.animation.PathInterpolator;
import p.s95;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Math;
import p.kg3;
import p.sv3;
import p.cg7;
import p.ph3;
import p.ug3;
import java.lang.Float;

public abstract class rh3	// class@0024e9 from classes.dex
{
    public static final LinearInterpolator a;
    public static final xq7 b;
    public static final xq7 c;

    static {
       rh3.a = new LinearInterpolator();
       String[] stringArray = new String[]{"t","s","e","o","i","h","to","ti"};
       rh3.b = xq7.f(stringArray);
       stringArray = new String[]{"x","y"};
       rh3.c = xq7.f(stringArray);
    }
    public static Interpolator a(PointF p0,PointF p1){
       PathInterpolator pathInterpol;
       float f = 0x3f800000;
       p0.x = wa4.b(p0.x, 0xbf800000, f);
       p0.y = wa4.b(p0.y, -100.00f, 100.00f);
       p1.x = wa4.b(p1.x, 0xbf800000, f);
       float f1 = wa4.b(p1.y, -100.00f, 100.00f);
       p1.y = f1;
       PointF x = p0.x;
       PointF y = p0.y;
       PointF x1 = p1.x;
       try{
          cf7 a = mf7.a;
          pathInterpol = s95.b(x, y, x1, f1);
       }catch(java.lang.IllegalArgumentException e0){
          if ("The Path cannot loop back on itself.".equals(e0.getMessage())) {
             pathInterpol = s95.b(Math.min(pathInterpol.x, f), pathInterpol.y, Math.max(p1.x, 0), p1.y);
          }else {
             pathInterpol = new LinearInterpolator();
          }
       }
       return pathInterpol;
    }
    public static ph3 b(kg3 p0,sv3 p1,float p2,cg7 p3,boolean p4,boolean p5){
       PointF pointF;
       PointF pointF2;
       int i2;
       LinearInterpolator obj;
       LinearInterpolator linearInterp;
       xq7 oxq7;
       PointF pointF5;
       PointF pointF6;
       PointF pointF7;
       float f2;
       float f4;
       int i5;
       int i6;
       Object obj1;
       Interpolator interpolator;
       Interpolator interpolator1;
       ph3 okg31;
       Interpolator interpolator2;
       Object obj3;
       kg3 okg3 = p0;
       float f = p2;
       cg7 uocg7 = p3;
       LinearInterpolator a = rh3.a;
       xq7 b = rh3.b;
       if (p4 && p5) {
          p0.f();
          pointF = null;
          PointF pointF1 = null;
          pointF2 = null;
          int i = 0;
          int i1 = 0;
          i2 = 0;
          obj = null;
          PointF pointF3 = null;
          PointF pointF4 = null;
          int i3 = 0;
          float f1 = 0;
          int i4 = 0;
          while (p0.J()) {
             xq7 c = rh3.c;
             switch (okg3.l0(b)){
                 case 0:
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF6 = i1;
                   pointF7 = i3;
                   f1 = (float)p0.g0();
                label_01cc :
                   i1 = pointF6;
                   a = linearInterp;
                   i3 = pointF7;
                   b = oxq7;
                   i = pointF5;
                   break;
                 case 1:
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF7 = i3;
                   obj = uocg7.n(okg3, f);
                label_01d7 :
                   i3 = pointF7;
                label_01d9 :
                   i = pointF5;
                label_01db :
                   a = linearInterp;
                   b = oxq7;
                   break;
                 case 2:
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF7 = i3;
                   i4 = uocg7.n(okg3, f);
                   goto label_01d7 ;
                   break;
                 case 3:
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF6 = i1;
                   pointF7 = i3;
                   if (p0.j0() == 3) {
                      p0.f();
                      f2 = 0;
                      float f3 = 0;
                      f4 = 0;
                      float f5 = 0;
                      while (p0.J()) {
                         if (i5 = okg3.l0(c)) {
                            if (i5 != 1) {
                               p0.n0();
                            }else if(p0.j0() == 7){
                               f5 = (float)p0.g0();
                               f3 = f5;
                            }else {
                               p0.b();
                               f3 = (float)p0.g0();
                               f5 = (p0.j0() == 7)? (float)p0.g0(): f3;
                               p0.x();
                            }
                         }else if(p0.j0() == 7){
                            f4 = (float)p0.g0();
                            f2 = f4;
                         }else {
                            p0.b();
                            f2 = (float)p0.g0();
                            f4 = (p0.j0() == 7)? (float)p0.g0(): f2;
                            p0.x();
                         }
                      }
                      p0.y();
                      pointF4 = new PointF(f4, f5);
                      pointF = new PointF(f2, f3);
                      goto label_01cc ;
                   }else {
                      pointF3 = ug3.b(okg3, f);
                      goto label_01cc ;
                   }
                   break;
                 case 4:
                   linearInterp = a;
                   pointF7 = i3;
                   if (p0.j0() == 3) {
                      p0.f();
                      f2 = 0;
                      float f6 = 0;
                      float f7 = 0;
                      float f8 = 0;
                      while (p0.J()) {
                         oxq7 = b;
                         if (i6 = okg3.l0(c)) {
                            pointF5 = i;
                            if (i6 != 1) {
                               p0.n0();
                            }else if(p0.j0() == 7){
                               f6 = (float)p0.g0();
                               f8 = f6;
                            }else {
                               p0.b();
                               f6 = (float)p0.g0();
                               if (p0.j0() == 7) {
                                  pointF6 = i1;
                                  f4 = (float)p0.g0();
                               }else {
                                  pointF6 = i1;
                                  f4 = f6;
                               }
                               p0.x();
                               f8 = f4;
                            }
                            pointF6 = i1;
                         }else {
                            pointF5 = i;
                            pointF6 = i1;
                            f7 = 7;
                            if (p0.j0() == f7) {
                               f2 = (float)p0.g0();
                               f7 = f2;
                            }else {
                               p0.b();
                               f2 = (float)p0.g0();
                               f7 = (p0.j0() == f7)? (float)p0.g0(): f2;
                               p0.x();
                            }
                         }
                         i1 = pointF6;
                         b = oxq7;
                         i = pointF5;
                      }
                      oxq7 = b;
                      pointF5 = i;
                      p0.y();
                      pointF2 = new PointF(f7, f8);
                      pointF1 = new PointF(f2, f6);
                      goto label_01d7 ;
                   }else {
                      oxq7 = b;
                      pointF5 = i;
                      i1 = ug3.b(okg3, f);
                      goto label_01d7 ;
                   }
                   break;
                 case 5:
                   i2 = 1;
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF7 = i3;
                   if (p0.h0() == i2) {
                      goto label_01d7 ;
                   }else {
                      i2 = 0;
                      goto label_01d7 ;
                   }
                   break;
                 case 6:
                   linearInterp = a;
                   i3 = ug3.b(okg3, f);
                   oxq7 = b;
                   pointF5 = i;
                   goto label_01d9 ;
                   break;
                 case 7:
                   linearInterp = a;
                   i = ug3.b(okg3, f);
                   oxq7 = b;
                   goto label_01db ;
                   break;
                 default:
                   linearInterp = a;
                   oxq7 = b;
                   pointF5 = i;
                   pointF7 = i3;
                   p0.n0();
                   goto label_01d7 ;
             }
          }
          linearInterp = a;
          pointF5 = i;
          pointF6 = i1;
          pointF7 = i3;
          p0.y();
          if (i2) {
             i4 = obj;
          }else if(pointF3 != null && pointF6 != null){
             interpolator2 = rh3.a(pointF3, pointF6);
          label_0211 :
             obj1 = i4;
             interpolator = null;
             interpolator1 = null;
          label_0215 :
             if (interpolator != null && interpolator1 != null) {
                pointF2 = pointF7;
                okg31 = new ph3(p1, obj, obj1, interpolator, interpolator1, f1);
             }else {
                pointF2 = pointF7;
                okg31 = new ph3(p1, obj, obj1, a, f1, 0);
             }
             okg3.o = pointF2;
             okg3.p = pointF5;
             return okg3;
          }else if(pointF != null && (pointF4 != null && (pointF1 != null && pointF2 != null))){
             interpolator = rh3.a(pointF, pointF1);
             interpolator1 = rh3.a(pointF4, pointF2);
             obj1 = i4;
             interpolator2 = 0;
             goto label_0215 ;
          }
          a = linearInterp;
          goto label_0211 ;
       }else {
          linearInterp = a;
          oxq7 = b;
          if (!p4) {
             return new ph3(uocg7.n(okg3, f));
          }
          p0.f();
          PointF pointF8 = null;
          pointF = null;
          PointF pointF9 = null;
          pointF2 = null;
          Object obj2 = null;
          i2 = 0;
          float f9 = 0;
          int i7 = 0;
          while (p0.J()) {
             xq7 oxq71 = oxq7;
             f4 = 0x3f800000;
             switch (okg3.l0(oxq71)){
                 case 0:
                   f9 = (float)p0.g0();
                label_029d :
                   oxq7 = oxq71;
                   break;
                 case 1:
                   obj2 = uocg7.n(okg3, f);
                   goto label_029d ;
                   break;
                 case 2:
                   i7 = uocg7.n(okg3, f);
                   goto label_029d ;
                   break;
                 case 3:
                   pointF2 = ug3.b(okg3, f4);
                   goto label_029d ;
                   break;
                 case 4:
                   pointF8 = ug3.b(okg3, f4);
                   goto label_029d ;
                   break;
                 case 5:
                   oxq7 = oxq71;
                   if (p0.h0() == 1) {
                      i2 = 1;
                   }else {
                      i2 = 0;
                   }
                   break;
                 case 6:
                   pointF = ug3.b(okg3, f);
                label_026c :
                   obj = 1;
                   goto label_029d ;
                   break;
                 case 7:
                   pointF9 = ug3.b(okg3, f);
                   goto label_026c ;
                   break;
                 default:
                   p0.n0();
                   goto label_029d ;
             }
          }
          p0.y();
          if (i2) {
             obj3 = obj2;
             obj = linearInterp;
          }else if(pointF2 != null && pointF8 != null){
             interpolator2 = rh3.a(pointF2, pointF8);
          }else {
             a = linearInterp;
          }
          Interpolator interpolator3 = interpolator2;
          obj3 = i7;
          ph3 okg32 = new ph3(p1, obj2, obj3, obj, f9, null);
          okg3.o = pointF;
          okg3.p = pointF9;
          return okg3;
       }
    }
}
