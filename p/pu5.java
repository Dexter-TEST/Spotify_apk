package p.pu5;
import p.nu5;
import java.util.concurrent.atomic.AtomicReference;
import p.mu5;
import java.lang.Object;
import java.io.Serializable;
import p.ou5;
import java.util.concurrent.atomic.AtomicInteger;
import p.ak4;
import io.reactivex.rxjava3.core.Observer;
import p.yj4;
import java.lang.Throwable;

public final class pu5 extends AtomicReference implements nu5	// class@0022d4 from classes.dex
{
    public final int a;
    public int b;
    public mu5 c;
    public mu5 t;
    public boolean v;

    public void pu5(){
       super();
       this.a = 256;
       mu5 omu5 = new mu5(null);
       this.t = omu5;
       this.c = omu5;
    }
    public final void a(Serializable p0){
       mu5 omu5 = new mu5(p0);
       pu5 tt = this.t;
       this.t = omu5;
       this.b = this.b + 1;
       tt.lazySet(omu5);
       tt = this.c;
       if (tt.a != null) {
          omu5 = new mu5(null);
          omu5.lazySet(tt.get());
          this.c = omu5;
       }
       this.v = true;
       return;
    }
    public final void b(ou5 p0){
       ou5 c;
       mu5 omu5;
       if (p0.getAndIncrement()) {
          return;
       }
       ou5 a = p0.a;
       if ((c = p0.c) == null) {
          c = this.c;
       }
       int i = 1;
       while (true) {
          if (p0.t != null) {
             p0.c = null;
             return;
          }else if((omu5 = c.get()) == null){
             if (c.get() != null) {
                continue ;
             }else {
                p0.c = c;
                if (!(i = - i)) {
                   return;
                }
             }
          }else {
             mu5 a1 = omu5.a;
             if (this.v != null && omu5.get() == null) {
                if (ak4.c(a1)) {
                   a.onComplete();
                   break ;
                }else {
                   a.onError(a1.a);
                   break ;
                }
             }else {
                a.onNext(a1);
                a1 = omu5;
             }
          }
       }
       p0.c = null;
       p0.t = true;
       return;
    }
}
