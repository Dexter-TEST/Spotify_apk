package p.ih0;
import p.ap5;
import java.lang.String;

public abstract class ih0 extends ap5	// class@001990 from classes.dex
{
    public static final char[] G;
    public static final int[] H;

    static {
       ih0.G = "0123456789-$:/.+ABCD".toCharArray();
       ih0.H = new int[20]{3,6,9,'`',18,'B','!','$','0','H',12,24,'E','Q','T',21,26,')',11,14};
    }
    public static boolean K(char[] p0,char p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
