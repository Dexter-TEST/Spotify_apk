package p.r27;
import p.sd7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;

public final class r27 implements sd7	// class@002465 from classes.dex
{
    public static final r27 b;

    static {
       r27.b = new r27();
    }
    public void r27(){
       super();
    }
    public final boolean a(String p0){
       co5.o(p0, "segment");
       return true;
    }
    public final boolean b(String p0){
       co5.o(p0, "segment");
       boolean b = false;
       int i = 0;
       while (true) {
          int i1 = 1;
          if (i < p0.length()) {
             if (p0.charAt(i) == '#') {
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
