package p.z15;
import p.yf2;
import p.a25;
import java.lang.Object;
import p.sn6;
import java.lang.Class;
import java.lang.String;
import p.co3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import p.tk0;
import p.r45;
import p.ja3;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Completable;

public final class z15 implements yf2	// class@002e6c from classes.dex
{
    public final int a;
    public final a25 b;

    public void z15(a25 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       z15 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             return Completable.j(new ja3(tb, 2, p0));
       }
       tb.getClass();
       if ("expired".equals(p0.a)) {
          p0 = tb.a;
          p0 = p0.c.s(p0.i, Boolean.TRUE);
       }else {
          p0 = tk0.a;
       }
       return p0;
    }
}
