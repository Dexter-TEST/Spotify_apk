package p.pw4;
import p.rw4;
import p.ab6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;

public final class pw4 extends rw4	// class@0022e4 from classes.dex
{
    public final AtomicInteger x;

    public void pw4(ab6 p0,long p1,TimeUnit p2,Scheduler p3){
       super(p0, p1, p2, p3);
       this.x = new AtomicInteger(1);
    }
    public final void a(){
       Object andSet = this.getAndSet(null);
       rw4 ta = this.a;
       if (andSet != null) {
          ta.onNext(andSet);
       }
       if (!this.x.decrementAndGet()) {
          ta.onComplete();
       }
       return;
    }
    public final void run(){
       pw4 tx = this.x;
       if (tx.incrementAndGet() == 2) {
          Object andSet = this.getAndSet(null);
          rw4 ta = this.a;
          if (andSet != null) {
             ta.onNext(andSet);
          }
          if (!tx.decrementAndGet()) {
             ta.onComplete();
          }
       }
       return;
    }
}
