package p.u0;
import java.lang.Runnable;
import p.x0;
import p.am3;
import java.lang.Object;
import p.ty0;

public final class u0 implements Runnable	// class@00281e from classes.dex
{
    public final x0 a;
    public final am3 b;

    public void u0(x0 p0,am3 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       if (this.a.a != this) {
          return;
       }
       if (x0.w.e(this.a, this, x0.f(this.b))) {
          x0.c(this.a);
       }
       return;
    }
}
