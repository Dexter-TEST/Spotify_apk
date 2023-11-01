package p.g2;
import p.n2;
import java.lang.Throwable;
import java.lang.Object;

public final class g2	// class@00168c from classes.dex
{
    public final Throwable a;
    public static final g2 b;
    public static final g2 c;

    static {
       if (n2.t) {
          g2.c = null;
          g2.b = null;
       }else {
          g2.c = new g2(null, false);
          g2.b = new g2(null, true);
       }
    }
    public void g2(Throwable p0,boolean p1){
       super();
       this.a = p0;
    }
}
