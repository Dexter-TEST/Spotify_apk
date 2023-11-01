package p.rq5;
import android.animation.TypeEvaluator;
import java.lang.Object;
import android.graphics.Rect;
import p.v95;
import p.vv7;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class rq5 implements TypeEvaluator	// class@00253c from classes.dex
{
    public final int a;
    public v95[] b;

    public void rq5(int p0){
       this.a = p0;
       super();
    }
    public final Object evaluate(float p0,Object p1,Object p2){
       int i1;
       rq5 tb;
       Rect rect;
       switch (this.a){
           case 0:
             break;
           default:
             if (!vv7.e(p1, p2)) {
                throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
             }
             if (!vv7.e(this.b, p1)) {
                this.b = vv7.n(p1);
             }
             i1 = 0;
             while (i1 < p1.length) {
                object oobject = this.b[i1];
                object oobject1 = p1[i1];
                object oobject2 = p2[i1];
                oobject.getClass();
                oobject.a = oobject1.a;
                int i4 = 0;
                while (true) {
                   v95 b = oobject1.b;
                   if (i4 < b.length) {
                      float f = 0x3f800000 - p0;
                      f = f * b[i4];
                      float f1 = oobject2.b[i4] * p0;
                      f1 = f1 + f;
                      oobject.b[i4] = f1;
                      i4 = i4 + 1;
                   }else {
                      break ;
                   }
                }
                i1 = i1 + 1;
             }
             return this.b;
       }
       Rect left = p1.left;
       int i = left + (int)((float)(p2.left - left) * p0);
       Rect top = p1.top;
       i1 = top + (int)((float)(p2.top - top) * p0);
       Rect right = p1.right;
       int i2 = right + (int)((float)(p2.right - right) * p0);
       p1 = p1.bottom;
       int i3 = p1 + (int)((float)(p2.bottom - p1) * p0);
       if ((tb = this.b) == null) {
          rect = new Rect(i, i1, i2, i3);
       }else {
          tb.set(i, i1, i2, i3);
          rect = this.b;
       }
       return rect;
    }
}
