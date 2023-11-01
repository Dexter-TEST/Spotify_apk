package p.bv6;
import p.av6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.IllegalArgumentException;

public abstract class bv6 extends av6	// class@001144 from classes.dex
{

    public static final String L0(int p0,String p1){
       co5.o(p1, "<this>");
       int i = 0;
       int i1 = (p0 >= 0)? 1: 0;
       if (i1) {
          i1 = p1.length();
          if (p0 > i1) {
             p0 = i1;
          }
          String str = p1.substring(i, p0);
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
          return str;
       }else {
          throw new IllegalArgumentException(tp2.l("Requested character count ", p0, " is less than zero.").toString());
       }
    }
}
