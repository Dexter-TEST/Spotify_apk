package p.vw1;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Executor;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.tw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p.h36;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p.l0;
import p.sw1;
import p.fn0;
import p.rw1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.jl1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p.qw1;
import p.uw1;
import p.iz7;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.g36;

public final class vw1 extends Scheduler	// class@002a78 from classes.dex
{
    public final boolean c;
    public final boolean d;
    public final Executor e;

    public void vw1(Executor p0,boolean p1,boolean p2){
       super();
       this.e = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Scheduler$Worker b(){
       return new tw1(this.e, this.c, this.d);
    }
    public final Disposable c(Runnable p0){
       vw1 te = this.e;
       String str = "run is null";
       try{
          Objects.requireNonNull(p0, str);
          vw1 tc = this.c;
          if (te instanceof ExecutorService) {
             h36 oh36 = new h36(p0, tc);
             oh36.a(te.submit(oh36));
             return oh36;
          }else if(tc != null){
             sw1 osw1 = new sw1(p0, null);
             te.execute(osw1);
             return osw1;
          }else {
             rw1 orw1 = new rw1(p0);
             te.execute(orw1);
             return orw1;
          }
       }catch(java.util.concurrent.RejectedExecutionException e4){
          RxJavaPlugins.c(e4);
          return jl1.a;
       }
    }
    public final Disposable d(Runnable p0,long p1,TimeUnit p2){
       Objects.requireNonNull(p0, "run is null");
       vw1 te = this.e;
       if (te instanceof ScheduledExecutorService) {
          try{
             h36 oh36 = new h36(p0, this.c);
             oh36.a(te.schedule(oh36, p1, p2));
             return oh36;
          }catch(java.util.concurrent.RejectedExecutionException e4){
             RxJavaPlugins.c(e4);
             return jl1.a;
          }
       }else {
          qw1 oqw1 = new qw1(p0);
          qw1 a = oqw1.a;
          a.getClass();
          cd1.c(a, uw1.a.d(new iz7(this, oqw1, 25), p1, p2));
          return oqw1;
       }
    }
    public final Disposable e(Runnable p0,long p1,long p2,TimeUnit p3){
       vw1 te = this.e;
       if (!te instanceof ScheduledExecutorService) {
          return super.e(p0, p1, p2, p3);
       }
       String str = "run is null";
       try{
          Objects.requireNonNull(p0, str);
          g36 og36 = new g36(p0, this.c);
          og36.a(te.scheduleAtFixedRate(og36, p1, p2, p3));
          return og36;
       }catch(java.util.concurrent.RejectedExecutionException e10){
          RxJavaPlugins.c(e10);
          return jl1.a;
       }
    }
}
