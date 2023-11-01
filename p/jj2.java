package p.jj2;
import p.vj3;
import p.ij2;
import p.dk3;
import p.r71;
import p.ek3;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.uj3;

public final class jj2 extends vj3	// class@001ae8 from classes.dex
{
    public static final jj2 a;
    public static final ij2 b;

    static {
       jj2.a = new jj2();
       jj2.b = new ij2();
    }
    public void jj2(){
       super();
    }
    public final void a(dk3 p0){
       if (!p0 instanceof r71) {
          throw new IllegalArgumentException(p0+" must implement androidx.lifecycle.DefaultLifecycleObserver.".toString());
       }
       ij2 b = jj2.b;
       p0.onCreate(b);
       p0.onStart(b);
       p0.onResume(b);
       return;
    }
    public final uj3 b(){
       return uj3.v;
    }
    public final void c(dk3 p0){
    }
    public final String toString(){
       return "coil.request.GlobalLifecycle";
    }
}
