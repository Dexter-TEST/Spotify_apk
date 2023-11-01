package p.qr7;
import java.lang.Runnable;
import p.rr7;
import p.qq7;
import java.lang.Object;
import java.util.HashMap;
import p.pr7;
import p.d91;
import p.es3;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import p.c91;
import p.ta6;

public final class qr7 implements Runnable	// class@002400 from classes.dex
{
    public final rr7 a;
    public final qq7 b;

    public void qr7(rr7 p0,qq7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       pr7 opr7;
       rr7 d = this.a.d;
       _monitor_enter(d);
       if (this.a.b.remove(this.b) != null) {
          if ((opr7 = this.a.c.remove(this.b)) != null) {
             Objects.toString(this.b);
             es3.c().getClass();
             opr7.y.execute(new c91(opr7, 3));
          }
       }else {
          Object[] objArray = new Object[]{this.b};
          String.format("Timer with %s is already marked as complete.", objArray);
          es3.c().getClass();
       }
       _monitor_exit(d);
       return;
    }
}
