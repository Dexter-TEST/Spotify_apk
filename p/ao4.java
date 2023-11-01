package p.ao4;
import java.lang.String;
import java.lang.Integer;
import java.lang.Long;

public abstract class ao4	// class@000fc1 from classes.dex
{
    public static final String a;

    static {
       String.valueOf(Long.MIN_VALUE).substring(1);
       ao4.a = String.valueOf(Long.MAX_VALUE);
    }
    public static int a(String p0){
       char c1;
       char c2;
       int i = 0;
       char c = p0.charAt(i);
       int i1 = p0.length();
       int i2 = 1;
       if (c == '-') {
          i = 1;
       }
       if (i) {
          if (i1 != i2 && i1 <= 10) {
             c = p0.charAt(i2);
             i2 = 2;
          }else {
             return Integer.parseInt(p0);
          }
       }else if(i1 > 9){
          return Integer.parseInt(p0);
       }
       if (c <= '9' && c >= '0') {
          int i3 = c - 48;
          if (i2 < i1) {
             int i4 = i2 + 1;
             if ((c1 = p0.charAt(i2)) <= '9' && c1 >= '0') {
                i3 = (i3 * 10) + (c1 - 48);
                if (i4 < i1) {
                   i2 = i4 + 1;
                   if ((c2 = p0.charAt(i4)) <= '9' && c2 >= '0') {
                      i3 = (i3 * 10) + (c2 - 48);
                      if (i2 < i1) {
                         while (true) {
                            i4 = i2 + 1;
                            if ((c1 = p0.charAt(i2)) > '9' || c1 < '0') {
                               return Integer.parseInt(p0);
                            }
                            i3 = i3 * 10;
                            i2 = c1 - 48;
                            i3 = i3 + i2;
                            if (i4 < i1) {
                               i2 = i4;
                            }
                         }
                      }
                   }else {
                      return Integer.parseInt(p0);
                   }
                }
             }else {
                return Integer.parseInt(p0);
             }
          }
          if (i) {
             i3 = - i3;
          }
          return i3;
       }else {
          return Integer.parseInt(p0);
       }
    }
    public static long b(String p0){
       if (p0.length() <= 9) {
          return (long)ao4.a(p0);
       }
       return Long.parseLong(p0);
    }
}
