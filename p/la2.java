package p.la2;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import p.iv6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.ka2;
import p.kv6;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class la2 extends p0	// class@001d14 from classes.dex
{
    public final Scheduler c;
    public final boolean t;

    public void la2(Flowable p0,Scheduler p1,boolean p2){
       super(p0);
       this.c = p1;
       this.t = p2;
    }
    public final void u(iv6 p0){
       Scheduler$Worker worker = this.c.b();
       ka2 oka2 = new ka2(p0, worker, this.b, this.t);
       p0.onSubscribe(oka2);
       worker.a(oka2);
    }
}
