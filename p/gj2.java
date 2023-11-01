package p.gj2;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;

public final class gj2 implements sd7	// class@00171b from classes.dex
{
    public static final gj2 b;

    static {
       gj2.b = new gj2();
    }
    public void gj2(){
       super();
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       boolean b = (p0.length() > 0)? true: false;
       return b;
    }
    public final boolean b(String p0){
       char c;
       co5.o(p0, "segment");
       boolean b = false;
       int i = 0;
       while (true) {
          int i1 = 1;
          if (i < p0.length()) {
             if ((c = p0.charAt(i)) == '?' || c == '#') {
                i1 = 0;
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
