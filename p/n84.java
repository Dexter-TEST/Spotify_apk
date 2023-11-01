package p.n84;
import p.vb3;
import java.lang.Object;
import p.o84;

public final class n84 implements vb3	// class@001f89 from classes.dex
{
    public static final n84 a;

    static {
       n84.a = new n84();
    }
    public void n84(){
       super();
    }
    public final boolean isInRange(int p0){
       o84 v;
       int i = 1;
       if (p0) {
          if (p0 != i) {
             if (p0 != 2) {
                p0 = (p0 != 3)? 0: o84.v;
             }else {
                v = o84.t;
             }
          }else {
             v = o84.c;
          }
       }else {
          v = o84.b;
       }
       if (p0 == null) {
          i = false;
       }
       return i;
    }
}
