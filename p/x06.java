package p.x06;
import p.w06;
import p.vs3;
import java.lang.Throwable;
import p.ir0;
import java.lang.Object;
import p.yb7;
import java.io.IOException;
import java.lang.InterruptedException;
import p.hn0;
import p.ya4;
import p.d25;

public final class x06 extends w06	// class@002be3 from classes.dex
{
    public final Object a;

    public void x06(vs3 p0){
       this.a = p0;
       super();
    }
    public final void a(Throwable p0){
       this.a.accept(p0);
    }
    public final void accept(Object p0){
       if (p0 instanceof yb7) {
          p0 = p0.getCause();
          if (!p0 instanceof IOException && !p0 instanceof InterruptedException) {
             this.a(p0);
          }
       }else if(p0 instanceof hn0){
          this.a(p0);
       }else if(p0 instanceof ya4){
          this.a(p0);
       }else if(p0 instanceof d25){
          this.a(p0.getCause());
       }else {
          this.a(p0);
       }
       return;
    }
}
