package p.w42;
import p.hr0;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Class;

public final class w42 implements hr0	// class@002ac2 from classes.dex
{
    public final hr0 a;
    public int b;
    public final ConcurrentLinkedQueue c;

    public void w42(hr0 p0){
       super();
       this.b = 1;
       this.c = new ConcurrentLinkedQueue();
       p0.getClass();
       this.a = p0;
    }
    public final void a(Object p0,boolean p1){
       _monitor_enter(this);
       if (this.b == 1 || p1) {
          this.c.add(p0);
       }
       this.b = 2;
       _monitor_exit(this);
       while (this.c.poll() != null) {
          this.a.accept(p0);
       }
       _monitor_enter(this);
       if (this.c.isEmpty()) {
          this.b = 3;
       }
       _monitor_exit(this);
       return;
    }
    public final void accept(Object p0){
       if (this.b != 3) {
          this.a(p0, true);
       }else {
          this.a.accept(p0);
       }
       return;
    }
}
