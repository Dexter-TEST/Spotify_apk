package p.tw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p.fn0;
import p.kf6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.sw1;
import p.rw1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import p.ra6;
import p.i36;
import p.ka0;
import p.ad1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Future;
import p.uw1;
import io.reactivex.rxjava3.core.Scheduler;
import p.gd1;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class tw1 extends Scheduler$Worker implements Runnable	// class@0027f3 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final Executor c;
    public final kf6 t;
    public boolean v;
    public final AtomicInteger w;
    public final fn0 x;

    public void tw1(Executor p0,boolean p1,boolean p2){
       super();
       this.w = new AtomicInteger();
       this.x = new fn0();
       this.c = p0;
       this.t = new kf6(14);
       this.a = p1;
       this.b = p2;
    }
    public final Disposable a(Runnable p0){
       sw1 osw1;
       jl1 a = jl1.a;
       if (this.v != null) {
          return a;
       }
       Objects.requireNonNull(p0, "run is null");
       if (this.a != null) {
          osw1 = new sw1(p0, this.x);
          this.x.c(osw1);
       }else {
          osw1 = new rw1(p0);
       }
       this.t.offer(osw1);
       if (!this.w.getAndIncrement()) {
          try{
             this.c.execute(this);
          }catch(java.util.concurrent.RejectedExecutionException e4){
             this.v = true;
             this.t.clear();
             RxJavaPlugins.c(e4);
             return a;
          }
       }
       return osw1;
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       if ((p1) <= 0) {
          return this.a(p0);
       }
       jl1 a = jl1.a;
       if (this.v != null) {
          return a;
       }
       ra6 ora6 = new ra6();
       ra6 ora61 = new ra6(ora6);
       Objects.requireNonNull(p0, "run is null");
       i36 oi36 = new i36(new ka0(this, ora61, p0, 13), this.x);
       this.x.c(oi36);
       tw1 tc = this.c;
       if (tc instanceof ScheduledExecutorService) {
          try{
             oi36.a(tc.schedule(oi36, p1, p2));
          }catch(java.util.concurrent.RejectedExecutionException e7){
             this.v = true;
             RxJavaPlugins.c(e7);
             return a;
          }
       }else {
          oi36.a(new gd1(uw1.a.d(oi36, p1, p2)));
       }
       cd1.c(ora6, oi36);
       return ora61;
    }
    public void dispose(){
       if (this.v == null) {
          this.v = true;
          this.x.dispose();
          if (!this.w.getAndIncrement()) {
             this.t.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final void run(){
       tw1 tt;
       Runnable runnable;
       if (this.b != null) {
          tt = this.t;
          if (this.v != null) {
             tt.clear();
          }else {
             tt.poll().run();
             if (this.v != null) {
                tt.clear();
             }else if(this.w.decrementAndGet()){
                this.c.execute(this);
             }
          }
       }else {
          tt = this.t;
          int i = 1;
          do {
             if (this.v != null) {
                tt.clear();
                break ;
             }else if((runnable = tt.poll()) == null){
                if (this.v != null) {
                   tt.clear();
                   break ;
                }
             }else {
                runnable.run();
                if (this.v != null) {
                   tt.clear();
                   break ;
                }
             }
          } while (!(i = - i));
       }
       return;
    }
}
