package p.l84;
import p.vb3;
import java.lang.Object;
import p.m84;

public final class l84 implements vb3	// class@001d03 from classes.dex
{
    public static final l84 a;

    static {
       l84.a = new l84();
    }
    public void l84(){
       super();
    }
    public final boolean isInRange(int p0){
       m84 t;
       int i = 1;
       if (p0) {
          if (p0 != i) {
             p0 = (p0 != 2)? 0: m84.t;
          }else {
             t = m84.c;
          }
       }else {
          t = m84.b;
       }
       if (p0 == null) {
          i = false;
       }
       return i;
    }
}
