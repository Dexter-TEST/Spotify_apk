package p.ml0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.fn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p.nc0;
import java.lang.Object;
import java.lang.Runnable;
import p.ll0;

public final class ml0 extends Completable	// class@001eb7 from classes.dex
{
    public final CompletableSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final CompletableSource v;

    public void ml0(CompletableSource p0,long p1,TimeUnit p2,Scheduler p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = null;
    }
    public final void o(CompletableObserver p0){
       fn0 uofn0 = new fn0();
       p0.onSubscribe(uofn0);
       AtomicBoolean uAtomicBoole = new AtomicBoolean();
       nc0 v8 = new nc0(this, uAtomicBoole, uofn0, p0, 4);
       uofn0.c(this.t.d(v8, this.b, this.c));
       this.a.subscribe(new ll0(p0, uofn0, uAtomicBoole));
    }
}
