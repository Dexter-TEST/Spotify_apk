package p.cb7;
import p.ap5;
import java.lang.Object;
import java.lang.System;
import java.lang.CharSequence;
import java.lang.Character;
import p.sc2;
import p.ep5;

public abstract class cb7 extends ap5	// class@0011d7 from classes.dex
{
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[][] J;
    public static final int[][] K;

    static {
       cb7.G = new int[3]{1,1,1};
       cb7.H = new int[5]{1,1,1,1,1};
       int i = 6;
       cb7.I = new int[i]{1,1,1,1,1,1};
       int i1 = 10;
       int[][] ointArray = new int[][i1];
       int i2 = 4;
       ointArray[0] = new int[i2]{3,2,1,1};
       ointArray[1] = new int[i2]{2,2,2,1};
       ointArray[2] = new int[i2]{2,1,2,2};
       ointArray[3] = new int[i2]{1,4,1,1};
       ointArray[i2] = new int[i2]{1,1,3,2};
       ointArray[5] = new int[i2]{1,2,3,1};
       ointArray[i] = new int[i2]{1,1,1,4};
       ointArray[7] = new int[i2]{1,3,1,2};
       ointArray[8] = new int[i2]{1,2,1,3};
       ointArray[9] = new int[i2]{3,1,1,2};
       cb7.J = ointArray;
       int[][] ointArray1 = new int[][20];
       cb7.K = ointArray1;
       System.arraycopy(ointArray, 0, ointArray1, 0, i1);
       for (; i1 < 20; i1 = i1 + 1) {
          i = i1 - 10;
          object oobject = cb7.J[i];
          int[] ointArray2 = new int[oobject.length];
          for (int i3 = 0; i3 < oobject.length; i3 = i3 + 1) {
             i2 = oobject.length - i3;
             i2 = i2 - 1;
             ointArray2[i3] = oobject[i2];
          }
          cb7.K[i1] = ointArray2;
       }
    }
    public static boolean K(CharSequence p0){
       int i;
       if (!(i = p0.length())) {
          return false;
       }
       i = i - 1;
       if (cb7.L(p0.subSequence(false, i)) == Character.digit(p0.charAt(i), 10)) {
          return 1;
       }
       return false;
    }
    public static int L(CharSequence p0){
       int i3;
       sc2 osc2;
       int i = p0.length();
       int i1 = i - 1;
       int i2 = 0;
       while (true) {
          if (i1 >= 0) {
             if ((i3 = p0.charAt(i1) - 48) >= 0 && i3 <= 9) {
                i2 = i2 + i3;
                i1 = i1 - 2;
             }else if(ep5.a){
                osc2 = new sc2();
                break ;
             }else {
                osc2 = sc2.c;
                break ;
             }
          }else {
             i2 = i2 * 3;
             while (true) {
                if ((i = i - 2) < 0) {
                   return ((i2 - 1000) % 10);
                }
                if ((i1 = p0.charAt(i) - 48) >= 0 && i1 <= 9) {
                   i2 = i2 + i1;
                }else if(ep5.a){
                   osc2 = new sc2();
                }else {
                   osc2 = sc2.c;
                }
             }
             throw osc2;
          }
       }
       throw osc2;
    }
}
