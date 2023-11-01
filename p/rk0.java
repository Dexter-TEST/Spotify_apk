package p.rk0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.dl0;
import p.qk0;
import p.jl0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class rk0 extends Completable	// class@002501 from classes.dex
{
    public final int a;
    public final CompletableSource b;
    public final Scheduler c;

    public void rk0(CompletableSource p0,Scheduler p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void o(CompletableObserver p0){
       rk0 tb = this.b;
       rk0 tc = this.c;
       switch (this.a){
           case 0:
             tb.subscribe(new qk0(p0, tc));
             return;
           case 1:
             tb.subscribe(new dl0(p0, tc));
             return;
           default:
             jl0 ojl0 = new jl0(p0, tb);
             p0.onSubscribe(ojl0);
             Disposable uDisposable = tc.c(ojl0);
             ojl0 = ojl0.b;
             ojl0.getClass();
             cd1.c(ojl0, uDisposable);
             return;
       }
    }
}
