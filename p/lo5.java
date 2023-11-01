package p.lo5;
import p.ko5;
import p.we5;
import p.ve5;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public abstract class lo5	// class@001d92 from classes.dex
{
    public static final ko5 a;
    public static final lo5 b;

    static {
       lo5.a = new ko5(0);
       lo5.b = we5.a.b();
    }
    public void lo5(){
       super();
    }
    public abstract int a(int p0);
    public abstract int b();
    public abstract int c(int p0);
    public int d(int p0,int p1){
       int i2;
       int i3;
       int i = 1;
       int i1 = (p1 > p0)? 1: 0;
       if (i1) {
          if ((i1 = p1 - p0) <= 0 && i1 != Integer.MIN_VALUE) {
             do {
                i1 = this.b();
                i3 = (p0 <= i1 && i1 < p1)? 1: 0;
             } while (i3);
             return i1;
          }else if((((- i1) & i1)) == i1){
             p1 = this.a((Integer.numberOfLeadingZeros(i1) - 31));
          }else {
             do {
                p1 = this.b() >> i;
                i2 = p1 % i1;
                p1 = p1 - i2;
                i3 = i1 - 1;
             } while ((i3 = i3 + p1) >= 0);
             p1 = i2;
          }
          return (p0 + p1);
       }else {
          Integer integer = Integer.valueOf(p0);
          Integer integer1 = Integer.valueOf(p1);
          co5.o(integer, "from");
          co5.o(integer1, "until");
          StringBuilder str = "Random range is empty: ["+integer;
          throw new IllegalArgumentException(str+", "+integer1+"\).".toString());
       }
    }
}
