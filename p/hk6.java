package p.hk6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.ScheduledExecutorService;
import p.fn0;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.i36;
import p.ad1;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class hk6 extends Scheduler$Worker	// class@00186e from classes.dex
{
    public final ScheduledExecutorService a;
    public final fn0 b;
    public boolean c;

    public void hk6(ScheduledExecutorService p0){
       super();
       this.a = p0;
       this.b = new fn0();
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       jl1 a = jl1.a;
       if (this.c != null) {
          return a;
       }
       try{
          Objects.requireNonNull(p0, "run is null");
          i36 oi36 = new i36(p0, this.b);
          this.b.c(oi36);
          Future uFuture = ((p1) <= 0)? this.a.submit(oi36): this.a.schedule(oi36, p1, p2);
          oi36.a(uFuture);
          return oi36;
       }catch(java.util.concurrent.RejectedExecutionException e5){
          this.dispose();
          RxJavaPlugins.c(e5);
          return a;
       }
    }
    public void dispose(){
       if (this.c == null) {
          this.c = true;
          this.b.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.c;
    }
}
