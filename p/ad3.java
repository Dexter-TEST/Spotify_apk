package p.ad3;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.fn0;
import p.dd3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.lang.System;
import java.util.Iterator;
import p.cd3;
import io.reactivex.rxjava3.disposables.Disposable;

public final class ad3 implements Runnable	// class@000f5e from classes.dex
{
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final fn0 c;
    public final ScheduledExecutorService t;
    public final ScheduledFuture v;
    public final ThreadFactory w;

    public void ad3(long p0,TimeUnit p1,ThreadFactory p2){
       ScheduledExecutorService scheduledExe;
       ScheduledFuture scheduledFut;
       super();
       p0 = (p1 != null)? p1.toNanos(p0): 0;
       long l = p0;
       this.a = l;
       this.b = new ConcurrentLinkedQueue();
       this.c = new fn0();
       this.w = p2;
       if (p1 != null) {
          scheduledExe = Executors.newScheduledThreadPool(1, dd3.e);
          scheduledFut = scheduledExe.scheduleWithFixedDelay(this, l, l, TimeUnit.NANOSECONDS);
       }else {
          scheduledExe = null;
          scheduledFut = scheduledExe;
       }
       this.t = scheduledExe;
       this.v = scheduledFut;
       return;
    }
    public final void run(){
       ad3 tb = this.b;
       if (!tb.isEmpty()) {
          long l = System.nanoTime();
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             cd3 uocd3 = iterator.next();
             if ((uocd3.c - l) <= 0) {
                if (tb.remove(uocd3)) {
                   this.c.a(uocd3);
                }
             }
          }
       }
       return;
    }
}
