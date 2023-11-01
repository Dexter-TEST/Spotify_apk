package p.q0;
import p.x0;
import java.lang.Throwable;
import java.lang.Object;

public final class q0	// class@00230c from classes.dex
{
    public final boolean a;
    public final Throwable b;
    public static final q0 c;
    public static final q0 d;

    static {
       if (x0.t) {
          q0.d = null;
          q0.c = null;
       }else {
          q0.d = new q0(null, false);
          q0.c = new q0(null, true);
       }
    }
    public void q0(Throwable p0,boolean p1){
       super();
       this.a = p1;
       this.b = p0;
    }
}
