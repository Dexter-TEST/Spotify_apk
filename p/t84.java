package p.t84;
import p.vb3;
import java.lang.Object;
import p.u84;

public final class t84 implements vb3	// class@00271e from classes.dex
{
    public static final t84 a;

    static {
       t84.a = new t84();
    }
    public void t84(){
       super();
    }
    public final boolean isInRange(int p0){
       u84 t;
       int i = 1;
       if (p0 != i) {
          if (p0 != 2) {
             p0 = (p0 != 3)? 0: u84.t;
          }else {
             t = u84.c;
          }
       }else {
          t = u84.b;
       }
       if (p0 == null) {
          i = false;
       }
       return i;
    }
}
