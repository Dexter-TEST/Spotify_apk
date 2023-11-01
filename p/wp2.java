package p.wp2;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;

public final class wp2 implements sd7	// class@002b7e from classes.dex
{
    public static final wp2 b;

    static {
       wp2.b = new wp2();
    }
    public void wp2(){
       super();
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       boolean b = (p0.length() == 16)? true: false;
       return b;
    }
    public final boolean b(String p0){
       co5.o(p0, "segment");
       boolean b = false;
       int i = 0;
       while (true) {
          int i1 = 1;
          if (i < p0.length()) {
             char c = p0.charAt(i);
             int i2 = (48 <= c && c < ':')? 1: 0;
             if (!i2) {
                i2 = (97 <= c && c < 'g')? 1: 0;
                if (!i2) {
                   c = (65 <= c && c < 'G')? 1: 0;
                   if (!c) {
                      i1 = 0;
                   }
                }
             }
             if (!i1) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
}
