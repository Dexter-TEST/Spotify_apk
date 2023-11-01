package p.bd3;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.ad3;
import java.util.concurrent.atomic.AtomicBoolean;
import p.fn0;
import p.dd3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import p.cd3;
import java.util.concurrent.ThreadFactory;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import p.jl1;
import p.ad1;
import p.i36;
import p.cj4;
import java.lang.Class;
import java.lang.System;

public final class bd3 extends Scheduler$Worker implements Runnable	// class@0010a1 from classes.dex
{
    public final fn0 a;
    public final ad3 b;
    public final cd3 c;
    public final AtomicBoolean t;

    public void bd3(ad3 p0){
       cd3 h;
       cd3 uocd3;
       super();
       this.t = new AtomicBoolean();
       this.b = p0;
       this.a = new fn0();
       ad3 c = p0.c;
       if (c.isDisposed()) {
          h = dd3.h;
       }else {
          while (true) {
             ad3 b = p0.b;
             if (!b.isEmpty()) {
                if ((uocd3 = b.poll()) == null) {
                   continue ;
                }
             }else {
                uocd3 = new cd3(p0.w);
                c.c(uocd3);
             }
             h = uocd3;
             break ;
          }
       }
       this.c = h;
       return;
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       if (this.a.isDisposed()) {
          return jl1.a;
       }
       return this.c.d(p0, p1, p2, this.a);
    }
    public void dispose(){
       if (this.t.compareAndSet(false, true)) {
          this.a.dispose();
          if (dd3.i) {
             this.c.d(this, 0, TimeUnit.NANOSECONDS, null);
          }else {
             bd3 tb = this.b;
             tb.getClass();
             bd3 tc = this.c;
             tc.c = System.nanoTime() + tb.a;
             tb.b.offer(tc);
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.t.get();
    }
    public final void run(){
       bd3 tb = this.b;
       tb.getClass();
       bd3 tc = this.c;
       tc.c = System.nanoTime() + tb.a;
       tb.b.offer(tc);
    }
}
