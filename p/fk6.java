package p.fk6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleObserver;
import p.lk6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.ek6;
import p.zk6;

public final class fk6 extends Single	// class@0015e6 from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final Scheduler c;

    public void fk6(SingleSource p0,Scheduler p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       fk6 tb = this.b;
       fk6 tc = this.c;
       switch (this.a){
           case 0:
             tb.subscribe(new ek6(p0, tc));
             return;
           case 1:
             lk6 olk6 = new lk6(p0, tb);
             p0.onSubscribe(olk6);
             Disposable uDisposable = tc.c(olk6);
             olk6 = olk6.b;
             olk6.getClass();
             cd1.c(olk6, uDisposable);
             return;
           default:
             tb.subscribe(new zk6(p0, tc));
             return;
       }
    }
}
