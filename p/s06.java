package p.s06;
import p.ir0;
import java.util.concurrent.atomic.AtomicBoolean;
import p.hr0;
import java.lang.Object;

public final class s06 implements ir0	// class@002595 from classes.dex
{
    public final AtomicBoolean a;
    public final hr0 b;

    public void s06(AtomicBoolean p0,hr0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       s06 ta = this.a;
       s06 tb = this.b;
       _monitor_enter(ta);
       if (!ta.get()) {
          tb.accept(p0);
       }
       _monitor_exit(ta);
       return;
    }
}
