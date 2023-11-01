package p.yl2;
import java.lang.Object;
import java.util.Arrays;
import p.b17;

public final class yl2	// class@002ddd from classes.dex
{
    public final float[] a;
    public final int[] b;

    public void yl2(float[] p0,int[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final yl2 a(float[] p0){
       int[] ointArray = new int[p0.length];
       int i = 0;
       for (int i1 = 0; i1 < p0.length; i1 = i1 + 1) {
          int i2 = p0[i1];
          yl2 ta = this.a;
          int i3 = Arrays.binarySearch(ta, i2);
          yl2 tb = this.b;
          if (i3 >= 0) {
             i2 = tb[i3];
          }else {
             i3 = i3 + 1;
             if (!(i3 = - i3)) {
                i2 = tb[i];
             }else {
                int i4 = tb.length - 1;
                if (i3 == i4) {
                   i2 = tb.length - 1;
                   i2 = tb[i2];
                }else {
                   i4 = i3 - 1;
                   int i5 = ta[i4];
                   float f = i2 - i5;
                   float f1 = ta[i3] - i5;
                   f = f / f1;
                   i2 = b17.l(tb[i4], f, tb[i3]);
                }
             }
          }
          ointArray[i1] = i2;
       }
       return new yl2(p0, ointArray);
    }
}
