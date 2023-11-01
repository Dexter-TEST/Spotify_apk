package p.rn0;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Runtime;
import java.lang.String;
import java.lang.Integer;
import p.qn0;
import p.k16;
import java.util.concurrent.ThreadFactory;
import p.cj4;
import java.lang.Math;
import p.pn0;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.on0;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import p.h36;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledFuture;
import p.l0;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.jl1;
import p.ua3;
import java.util.concurrent.ScheduledExecutorService;
import p.g36;

public final class rn0 extends Scheduler	// class@00251c from classes.dex
{
    public final AtomicReference c;
    public static final pn0 d;
    public static final k16 e;
    public static final int f;
    public static final qn0 g;

    static {
       int i2;
       int i = Runtime.getRuntime().availableProcessors();
       int i1 = 0;
       if ((i2 = Integer.getInteger("rx3.computation-threads", i1).intValue()) > 0 && i2 <= i) {
          i = i2;
       }
       rn0.f = i;
       pn0 qn0 i3 = new qn0(new k16("RxComputationShutdown"));
       rn0.g = i3;
       i3.dispose();
       k16 ok16 = new k16(Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), "RxComputationThreadPool", 1);
       rn0.e = ok16;
       i3 = new pn0(i1, ok16);
       rn0.d = i3;
       i3 = i3.b;
       i2 = i3.length;
       for (; i1 < i2; i1 = i1 + 1) {
          i3[i1].dispose();
       }
    }
    public void rn0(){
       int len;
       super();
       pn0 d = rn0.d;
       this.c = new AtomicReference(d);
       pn0 opn0 = new pn0(rn0.f, rn0.e);
       while (true) {
          rn0 tc = this.c;
          int i = 0;
          if (tc.compareAndSet(d, opn0)) {
             d = 1;
          }else {
             if (tc.get() != d) {
                len = 0;
             }
          }
          if (!d) {
             opn0 = opn0.b;
             len = opn0.length;
             for (; i < len; i = i + 1) {
                opn0[i].dispose();
             }
          }
          break ;
       }
       return;
    }
    public final Scheduler$Worker b(){
       return new on0(this.c.get().a());
    }
    public final Disposable d(Runnable p0,long p1,TimeUnit p2){
       h36 oh36;
       try{
          qn0 oqn0 = this.c.get().a();
          oqn0.getClass();
          Objects.requireNonNull(p0, "run is null");
          oh36 = new h36(p0, true);
          cj4 a = oqn0.a;
          Future uFuture = ((p1) <= 0)? a.submit(oh36): a.schedule(oh36, p1, p2);
          oh36.a(uFuture);
       }catch(java.util.concurrent.RejectedExecutionException e5){
          RxJavaPlugins.c(e5);
          oh36 = jl1.a;
       }
       return oh36;
    }
    public final Disposable e(Runnable p0,long p1,long p2,TimeUnit p3){
       ua3 oua31;
       qn0 oqn0 = this.c.get().a();
       oqn0.getClass();
       Objects.requireNonNull(p0, "run is null");
       cj4 a = oqn0.a;
       int i = 0;
       if ((p2 - i) <= 0) {
          try{
             ua3 oua3 = new ua3(p0, a);
             Future uFuture = ((p1 - i) <= 0)? a.submit(oua3): a.schedule(oua3, p1, p3);
             oua3.a(uFuture);
             oua31 = oua3;
          }catch(java.util.concurrent.RejectedExecutionException e10){
             RxJavaPlugins.c(e10);
          }
       }else {
          g36 og36 = new g36(p0, true);
          g36 og361 = og36;
          long l = p1;
          long l1 = p2;
          try{
             int i1 = p3;
             og36.a(a.scheduleAtFixedRate(og361, l, l1, i1));
             oua31 = og36;
          }catch(java.util.concurrent.RejectedExecutionException e10){
             RxJavaPlugins.c(e10);
          }
       }
       return jl1.a;
    }
}
