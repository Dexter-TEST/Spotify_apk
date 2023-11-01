package p.h75;
import p.lv1;
import java.lang.reflect.Method;
import p.gv5;
import java.lang.Object;
import p.mp2;
import java.lang.Class;
import java.lang.String;
import p.sm2;
import java.lang.IllegalArgumentException;
import p.do5;

public final class h75 extends lv1	// class@00021f from classes2.dex
{
    public final int P;
    public final Method Q;
    public final int R;

    public void h75(Method p0,int p1,int p2){
       this.P = p2;
       super();
       this.Q = p0;
       this.R = p1;
    }
    public final void a(gv5 p0,Object p1){
       Object[] objArray;
       h75 tR = this.R;
       h75 tQ = this.Q;
       int i = 0;
       switch (this.P){
           case 0:
             break;
           default:
             if (p1 != null) {
                p0.c = p1.toString();
                return;
             }else {
                objArray = new Object[i];
                throw do5.W(tQ, tR, "@Url parameter is null.", objArray);
             }
       }
       if (p1 != null) {
          p0 = p0.f;
          p0.getClass();
          int i1 = p1.a.length / 2;
          for (; i < i1; i = i2) {
             int i2 = i + 1;
             p0.d(p1.c(i), p1.g(i));
          }
          return;
       }else {
          objArray = new Object[i];
          throw do5.W(tQ, tR, "Headers parameter must not be null.", objArray);
       }
    }
}
