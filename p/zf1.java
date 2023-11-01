package p.zf1;
import p.cb7;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class zf1 extends cb7	// class@002ee4 from classes.dex
{
    public static final int[] L;
    public static final int[][] M;

    static {
       zf1.L = new int[10]{0,11,13,14,19,25,28,21,22,26};
       int[][] ointArray = new int[][2]{new int[10]{'8','4','2','1',',','&','#','*',')','%'},new int[10]{7,11,13,14,19,25,28,21,22,26}};
       zf1.M = ointArray;
    }
    public static String M(String p0){
       char[] uocharArray = new char[6];
       int i = 0;
       p0.getChars(1, 7, uocharArray, i);
       StringBuilder str = new StringBuilder(12)+p0.charAt(i);
       int i1 = 5;
       char c = uocharArray[i1];
       switch (c){
           case '0':
           case '2':
           case '1':
             str = str+uocharArray+c+"0000"+uocharArray;
             break;
           case '3':
             str = str+uocharArray+"00000"+uocharArray;
             break;
           case '4':
             str = str+uocharArray+"00000"+uocharArray[4];
             break;
           default:
             str = str+uocharArray+"0000"+c;
       }
       if (p0.length() >= 8) {
          str = str+p0.charAt(7);
       }
       return str;
    }
}
