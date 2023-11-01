package p.m77;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.k77;
import p.jl1;
import p.l77;
import java.lang.Long;
import java.lang.Object;
import p.iz7;
import p.m5;
import p.et0;

public final class m77 extends Scheduler$Worker	// class@001e3f from classes.dex
{
    public final PriorityBlockingQueue a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public boolean t;

    public void m77(){
       super();
       this.a = new PriorityBlockingQueue();
       this.b = new AtomicInteger();
       this.c = new AtomicInteger();
    }
    public final Disposable a(Runnable p0){
       return this.d(p0, Scheduler.a(TimeUnit.MILLISECONDS));
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       p1 = p2.toMillis(p1) + Scheduler.a(TimeUnit.MILLISECONDS);
       return this.d(new k77(p0, this, p1), p1);
    }
    public final Disposable d(Runnable p0,long p1){
       l77 ol771;
       jl1 a = jl1.a;
       if (this.t != null) {
          return a;
       }
       l77 ol77 = new l77(p0, Long.valueOf(p1), this.c.incrementAndGet());
       this.a.add(ol77);
       if (this.b.getAndIncrement()) {
          return et0.f(new iz7(this, ol77, 26));
       }
       int i = 1;
       while (true) {
          if (this.t != null) {
             this.a.clear();
             return a;
          }else if((ol771 = this.a.poll()) == null){
             if (!(i = - i)) {
                break ;
             }
          }else if(ol771.t == null){
             ol771.a.run();
          }
       }
       return a;
    }
    public void dispose(){
       this.t = true;
    }
    public boolean isDisposed(){
       return this.t;
    }
}
