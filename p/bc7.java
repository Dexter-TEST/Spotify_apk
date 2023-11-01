package p.bc7;
import p.a00;
import p.cc7;
import p.mv6;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import p.gq6;

public final class bc7 extends a00	// class@00109c from classes.dex
{
    public final cc7 a;

    public void bc7(cc7 p0){
       this.a = p0;
       super();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          bc7 ta = this.a;
          vv7.a(ta.B, p0);
          ta.A();
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       p0.C = true;
       return 2;
    }
    public final void cancel(){
       Runnable andSet;
       if (this.a.y != null) {
          return;
       }
       this.a.y = true;
       Object obj = null;
       if ((andSet = this.a.c.getAndSet(obj)) != null) {
          andSet.run();
       }
       this.a.x.lazySet(obj);
       if (!this.a.A.getAndIncrement()) {
          this.a.x.lazySet(obj);
          bc7 ta = this.a;
          if (ta.C == null) {
             ta.b.clear();
          }
       }
       return;
    }
    public final void clear(){
       this.a.b.clear();
    }
    public final boolean isEmpty(){
       return this.a.b.isEmpty();
    }
    public final Object poll(){
       return this.a.b.poll();
    }
}
