package p.vy2;
import p.ru2;
import p.og2;
import p.ht2;
import p.fo1;
import p.c03;
import java.lang.Class;
import p.ay2;
import p.x03;
import p.ry2;
import java.lang.Object;
import p.ju2;
import p.fu2;
import java.lang.String;
import p.r45;

public final class vy2 implements ru2	// class@002a8b from classes.dex
{
    public static final fo1 a;
    public static final fo1 b;
    public static final fo1 c;
    public static final fo1 t;

    static {
       vy2.a = new fo1(c03.class, ht2.getId());
       vy2.b = new fo1(ay2.class, ht2.getId());
       vy2.c = new fo1(x03.class, ht2.getId());
       vy2.t = new fo1(ry2.class, ht2.getId());
    }
    public void vy2(){
       super();
    }
    public final int e(ju2 p0){
       p0.getClass();
       String str = p0.q().c();
       r45 or45 = vy2.a.b(str);
       if (or45.c()) {
          return or45.b().e(p0);
       }
       or45 = vy2.b.b(str);
       if (or45.c()) {
          return or45.b().e(p0);
       }
       or45 = vy2.c.b(str);
       if (or45.c()) {
          return or45.b().e(p0);
       }
       r45 or451 = vy2.t.b(str);
       int i = (or451.c())? or451.b().e(p0): 0;
       return i;
    }
}
