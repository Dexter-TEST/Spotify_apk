package p.tk6;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleObserver;
import p.sk6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class tk6 extends Single	// class@00278d from classes.dex
{
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public void tk6(long p0,TimeUnit p1,Scheduler p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void subscribeActual(SingleObserver p0){
       sk6 osk6 = new sk6(p0);
       p0.onSubscribe(osk6);
       cd1.c(osk6, this.c.d(osk6, this.a, this.b));
    }
}
