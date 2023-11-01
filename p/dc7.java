package p.dc7;
import p.zz;
import p.ec7;
import p.gq6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public final class dc7 extends zz	// class@001322 from classes.dex
{
    public final ec7 a;

    public void dc7(ec7 p0){
       this.a = p0;
       super();
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       p0.A = true;
       return 2;
    }
    public final void clear(){
       this.a.a.clear();
    }
    public void dispose(){
       if (this.a.v == null) {
          this.a.v = true;
          this.a.b();
          Object obj = null;
          this.a.b.lazySet(obj);
          if (!this.a.z.getAndIncrement()) {
             this.a.b.lazySet(obj);
             dc7 ta = this.a;
             if (ta.A == null) {
                ta.a.clear();
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.a.v;
    }
    public final boolean isEmpty(){
       return this.a.a.isEmpty();
    }
    public final Object poll(){
       return this.a.a.poll();
    }
}
