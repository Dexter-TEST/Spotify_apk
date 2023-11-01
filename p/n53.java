package p.n53;
import p.xe7;
import java.lang.String;
import p.lx;
import java.util.Map;
import p.v10;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Character;

public final class n53 extends xe7	// class@001f6d from classes.dex
{
    public static final int[] F;
    public static final int[] G;
    public static final int[][] H;

    static {
       n53.F = new int[4]{1,1,1,1};
       n53.G = new int[3]{3,1,1};
       int[][] ointArray = new int[][10];
       ointArray[0] = new int[5]{1,1,3,3,1};
       ointArray[1] = new int[5]{3,1,1,1,3};
       ointArray[2] = new int[5]{1,3,1,1,3};
       ointArray[3] = new int[5]{3,3,1,1,1};
       ointArray[4] = new int[5]{1,1,3,1,3};
       ointArray[5] = new int[5]{3,1,3,1,1};
       ointArray[6] = new int[5]{1,3,3,1,1};
       ointArray[7] = new int[5]{1,1,1,3,3};
       ointArray[8] = new int[5]{3,1,1,3,1};
       ointArray[9] = new int[5]{1,3,1,3,1};
       n53.H = ointArray;
    }
    public void n53(){
       super();
    }
    public final v10 e(String p0,lx p1,int p2,int p3,Map p4){
       if (p1 == lx.y) {
          return super.e(p0, p1, p2, p3, p4);
       }
       throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(p1)));
    }
    public final boolean[] s(String p0){
       int i = p0.length();
       if ((i % 2)) {
          throw new IllegalArgumentException("The length of the input should be even");
       }
       if (i > 80) {
          throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
       }
       boolean[] uobooleanArr = new boolean[((i * 9) + 9)];
       int i1 = xe7.b(uobooleanArr, 0, n53.F, true);
       for (int i2 = 0; i2 < i; i2 = i2 + 2) {
          int i3 = Character.digit(p0.charAt(i2), 10);
          int i4 = i2 + 1;
          i4 = Character.digit(p0.charAt(i4), 10);
          int[] ointArray = new int[10];
          for (int i5 = 0; i5 < 5; i5 = i5 + 1) {
             int i6 = i5 * 2;
             int[][] h = n53.H;
             ointArray[i6] = h[i3][i5];
             i6 = i6 + true;
             ointArray[i6] = h[i4][i5];
          }
          i1 = i1 + xe7.b(uobooleanArr, i1, ointArray, true);
       }
       xe7.b(uobooleanArr, i1, n53.G, true);
       return uobooleanArr;
    }
}
