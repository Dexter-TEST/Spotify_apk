package p.ik6;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;
import p.k16;
import java.util.concurrent.atomic.AtomicReference;
import p.n36;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.hk6;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import p.h36;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p.l0;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.jl1;
import p.ua3;
import p.g36;

public final class ik6 extends Scheduler	// class@0019b1 from classes.dex
{
    public final AtomicReference c;
    public static final k16 d;

    static {
       Executors.newScheduledThreadPool(0).shutdown();
       ik6.d = new k16(Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), "RxSingleScheduler", 1);
    }
    public void ik6(){
       super();
       AtomicReference uAtomicRefer = new AtomicReference();
       this.c = uAtomicRefer;
       ScheduledThreadPoolExecutor scheduledThr = new ScheduledThreadPoolExecutor(1, ik6.d);
       scheduledThr.setRemoveOnCancelPolicy(n36.a);
       uAtomicRefer.lazySet(scheduledThr);
    }
    public final Scheduler$Worker b(){
       return new hk6(this.c.get());
    }
    public final Disposable d(Runnable p0,long p1,TimeUnit p2){
       try{
          Objects.requireNonNull(p0, "run is null");
          h36 oh36 = new h36(p0, true);
          ik6 tc = this.c;
          Future uFuture = ((p1) <= 0)? tc.get().submit(oh36): tc.get().schedule(oh36, p1, p2);
          oh36.a(uFuture);
          return oh36;
       }catch(java.util.concurrent.RejectedExecutionException e5){
          RxJavaPlugins.c(e5);
          return jl1.a;
       }
    }
    public final Disposable e(Runnable p0,long p1,long p2,TimeUnit p3){
       Objects.requireNonNull(p0, "run is null");
       ik6 tc = this.c;
       boolean i = 0;
       if ((p2 - i) <= 0) {
          try{
             ScheduledExecutorService scheduledExe = tc.get();
             ua3 oua3 = new ua3(p0, scheduledExe);
             Future uFuture = ((p1 - i) <= 0)? scheduledExe.submit(oua3): scheduledExe.schedule(oua3, p1, p3);
             oua3.a(uFuture);
             return oua3;
          }catch(java.util.concurrent.RejectedExecutionException e10){
             RxJavaPlugins.c(e10);
             return jl1.a;
          }
       }else {
          i = true;
          try{
             g36 og36 = new g36(p0, i);
             og36.a(tc.get().scheduleAtFixedRate(og36, p1, p2, p3));
             return og36;
          }catch(java.util.concurrent.RejectedExecutionException e10){
             RxJavaPlugins.c(e10);
             return v0;
          }
       }
    }
}
