package p.pc6;
import p.x0;
import java.lang.Object;
import p.ty0;
import java.lang.Throwable;
import p.r0;
import java.lang.Class;
import p.am3;
import java.util.concurrent.Future;
import p.u0;
import p.lb1;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.q0;

public final class pc6 extends x0	// class@002237 from classes.dex
{

    public void pc6(){
       super();
    }
    public final boolean i(Object p0){
       boolean b;
       if (p0 == null) {
          p0 = x0.x;
       }
       if (x0.w.e(this, null, p0)) {
          x0.c(this);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean j(Throwable p0){
       boolean b;
       p0.getClass();
       if (x0.w.e(this, null, new r0(p0))) {
          x0.c(this);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean k(am3 p0){
       p0.getClass();
       x0 ta = this.a;
       boolean b = false;
       if (ta == null) {
          Object obj = null;
          if (p0.isDone()) {
             if (x0.w.e(this, obj, x0.f(p0))) {
                x0.c(this);
             }
          }else {
             u0 ou0 = new u0(this, p0);
             if (x0.w.e(this, obj, ou0)) {
                p0.a(ou0, lb1.a);
             }else {
                ta = this.a;
             label_0045 :
                if (ta instanceof q0) {
                   p0.cancel(ta.a);
                }
             }
          }
          b = true;
       }else {
          goto label_0045 ;
       }
       return b;
    }
}
