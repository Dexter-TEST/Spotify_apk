package p.ex6;
import p.yf2;
import p.bh1;
import java.lang.Object;
import p.bx5;
import p.cx5;
import p.ks0;
import p.kt1;
import p.aq6;
import io.reactivex.rxjava3.core.Single;
import p.yp6;
import java.lang.String;
import p.o11;
import p.rr;
import p.bs2;
import java.lang.Throwable;
import p.xs1;
import p.eo5;

public final class ex6 implements yf2	// class@00151a from classes.dex
{
    public final int a;
    public final bh1 b;

    public void ex6(bh1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       bx5 b1;
       bh1 d;
       aq6 b2;
       ex6 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return new xs1(tb, p0);
       }
       boolean b = false;
       bx5 a = p0.a;
       if (p0.a()) {
          if ((b1 = p0.b) != null) {
             if (a.z != null) {
                b = true;
             }
             p0 = Single.just(new kt1(tb.D, b1, b));
          label_007e :
             return p0;
          }
       }else {
          cx5 t = a.t;
          if (400 == t) {
             d = tb.D;
             if ((b2 = d.b) == yp6.B || b2 == yp6.A) {
                p0 = Single.just(new kt1(d, ks0.a(d.toString()).d(), b));
                goto label_007e ;
             }
          }else if(404 == t){
             d = tb.D;
             if (d.b == yp6.y0) {
                p0 = Single.just(new kt1(d, ks0.a(d.toString()).d(), b));
                goto label_007e ;
             }
          }
       }
       p0 = Single.error(new bs2(p0));
       goto label_007e ;
    }
}
