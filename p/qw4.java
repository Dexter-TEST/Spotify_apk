package p.qw4;
import p.rw4;
import p.ab6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;

public final class qw4 extends rw4	// class@00242a from classes.dex
{

    public void qw4(ab6 p0,long p1,TimeUnit p2,Scheduler p3){
       super(p0, p1, p2, p3);
    }
    public final void a(){
       this.a.onComplete();
    }
    public final void run(){
       Object andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          this.a.onNext(andSet);
       }
       return;
    }
}
