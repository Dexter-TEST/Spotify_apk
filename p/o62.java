package p.o62;
import p.kv6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import p.m62;
import p.iv6;

public final class o62 extends AtomicBoolean implements kv6	// class@0020b9 from classes.dex
{
    public final iv6 a;
    public final Object b;

    public void o62(Object p0,m62 p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public final void a(long p0){
       if ((p0) > 0 && this.compareAndSet(false, true)) {
          o62 ta = this.a;
          ta.onNext(this.b);
          ta.onComplete();
       }
       return;
    }
    public final void cancel(){
    }
}
