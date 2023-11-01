package p.dd3;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Long;
import p.cd3;
import p.k16;
import java.util.concurrent.ThreadFactory;
import p.cj4;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Boolean;
import p.ad3;
import p.fn0;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.bd3;

public final class dd3 extends Scheduler	// class@001326 from classes.dex
{
    public final AtomicReference c;
    public static final k16 d;
    public static final k16 e;
    public static final long f;
    public static final TimeUnit g;
    public static final cd3 h;
    public static final boolean i;
    public static final ad3 j;

    static {
       ad3 v;
       dd3.g = TimeUnit.SECONDS;
       dd3.f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
       cd3 uocd3 = new cd3(new k16("RxCachedThreadSchedulerShutdown"));
       dd3.h = uocd3;
       uocd3.dispose();
       int i = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
       k16 ok16 = new k16(i, "RxCachedThreadScheduler", false);
       dd3.d = ok16;
       dd3.e = new k16(i, "RxCachedWorkerPoolEvictor", false);
       dd3.i = Boolean.getBoolean("rx3.io-scheduled-release");
       ad3 uoad3 = new ad3(0, null, ok16);
       dd3.j = uoad3;
       uoad3.c.dispose();
       if ((v = uoad3.v) != null) {
          v.cancel(1);
       }
       if ((uoad3 = uoad3.t) != null) {
          uoad3.shutdownNow();
       }
    }
    public void dd3(){
       super();
       ad3 j = dd3.j;
       this.c = new AtomicReference(j);
       ad3 uoad3 = new ad3(dd3.f, dd3.g, dd3.d);
       while (true) {
          dd3 tc = this.c;
          if (tc.compareAndSet(j, uoad3)) {
             j = 1;
          }else {
             if (tc.get() != j) {
                j = 0;
             }
          }
          if (!j) {
             uoad3.c.dispose();
             if ((j = uoad3.v) != null) {
                j.cancel(true);
             }
             if ((uoad3 = uoad3.t) != null) {
                uoad3.shutdownNow();
                break ;
             }
          }
          break ;
       }
       return;
    }
    public final Scheduler$Worker b(){
       return new bd3(this.c.get());
    }
}
