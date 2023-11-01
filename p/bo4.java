package p.bo4;
import java.lang.String;
import java.lang.Double;

public abstract class bo4	// class@001104 from classes.dex
{
    public static final int[] a;

    static {
       String.valueOf(Integer.MIN_VALUE);
       String.valueOf(Long.MIN_VALUE);
       int[] ointArray = new int[1000];
       bo4.a = ointArray;
       int i = 0;
       int i1 = 0;
       while (i < 10) {
          int i2 = 0;
          while (i2 < 10) {
             int i3 = 0;
             while (i3 < 10) {
                int i4 = i + 48;
                i4 = i4 << 16;
                int i5 = i2 + 48;
                i5 = i5 << 8;
                i4 = i4 | i5;
                i5 = i3 + 48;
                i4 = i4 | i5;
                int i6 = i1 + 1;
                bo4.a[i1] = i4;
                i3 = i3 + 1;
                i1 = i6;
             }
             i2 = i2 + 1;
          }
          i = i + 1;
       }
    }
    public static boolean a(double p0){
       boolean b = (!Double.isNaN(p0) && !Double.isInfinite(p0))? false: true;
       return b;
    }
}
