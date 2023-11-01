package p.xm5;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.ym5;
import p.mv6;
import p.vv7;

public final class xm5 extends AtomicLong implements kv6	// class@002ca8 from classes.dex
{
    public final iv6 a;
    public final ym5 b;

    public void xm5(iv6 p0,ym5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.b(this, p0);
       }
       return;
    }
    public final void cancel(){
       long l = Long.MIN_VALUE;
       if (this.getAndSet(l) - l) {
          this.b.z(this);
       }
       return;
    }
}
