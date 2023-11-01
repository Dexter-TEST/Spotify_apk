package p.zl2;
import p.qh3;
import java.util.List;
import java.lang.Object;
import p.ph3;
import p.yl2;
import p.f36;
import android.graphics.PointF;
import java.lang.Class;
import p.wa4;
import p.et0;
import p.b17;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import p.en6;
import java.lang.IllegalStateException;
import p.qy;

public final class zl2 extends qh3	// class@002f1b from classes.dex
{
    public final int h;
    public final Object i;

    public void zl2(int p0,List p1){
       ph3 b;
       this.h = p0;
       if (p0 != 1) {
          if (p0 != 2) {
             super(p1);
             p0 = 0;
             if ((b = p1.get(p0).b) != null) {
                p0 = b.b.length;
             }
             float[] uofloatArray = new float[p0];
             int[] ointArray = new int[p0];
             this.i = new yl2(uofloatArray, ointArray);
             return;
          }else {
             super(p1);
             this.i = new f36(0x3f800000, 0x3f800000);
             return;
          }
       }else {
          super(p1);
          this.i = new PointF();
          return;
       }
    }
    public final Object f(ph3 p0,float p1){
       ph3 b = p0.b;
       zl2 ti = this.i;
       switch (this.h){
           case 0:
             p0 = p0.c;
             ti.getClass();
             yl2 b1 = b.b;
             yl2 b2 = p0.b;
             if (b1.length != b2.length) {
                throw new IllegalArgumentException(en6.o("Cannot interpolate between gradients. Lengths vary \("+b1.length+" vs ", b2.length, "\)"));
             }
             for (int i = 0; i < b1.length; i = i + 1) {
                ti.a[i] = et0.l(p0.a[i], b.a[i], p1, b.a[i]);
                ti.b[i] = b17.l(b1[i], p1, b2[i]);
             }
             return ti;
             break;
           case 1:
           default:
             if (b == null || (p0 = p0.c) == null) {
                throw new IllegalStateException("Missing values for keyframe.");
             }
             ti.a = et0.l(p0.a, b.a, p1, b.a);
             ti.b = et0.l(p0.b, b.b, p1, b.b);
             return ti;
       }
       return this.i(p0, p1, p1);
    }
    public final Object g(ph3 p0,float p1,float p2,float p3){
       switch (this.h){
           case 1:
           default:
             super.g(p0, p1, p2, p3);
             throw null;
       }
       return this.i(p0, p2, p3);
    }
    public final PointF i(ph3 p0,float p1,float p2){
       ph3 b;
       if ((b = p0.b) == null || (p0 = p0.c) == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       zl2 ti = this.i;
       PointF y = b.y;
       ti.set(et0.l(p0.x, b.x, p1, b.x), (((p0.y - y) * p2) + y));
       return ti;
    }
}
