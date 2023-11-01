package p.of1;
import p.lf1;
import p.hs3;
import p.t00;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.fn0;
import p.ir2;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.yf2;
import p.jc7;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Long;
import p.az5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.mf1;
import io.reactivex.rxjava3.core.Completable;
import p.nf1;
import p.hs0;
import p.b5;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class of1	// class@00210a from classes.dex
{
    public final if1 a;
    public final hs3 b;
    public final Observable c;
    public final long d;
    public final fn0 e;

    public void of1(lf1 p0,hs3 p1,t00 p2){
       co5.o(p1, "logger");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = 30;
       this.e = new fn0();
    }
    public final void a(){
       of1 te = this.e;
       if (!te.g()) {
          of1 td = this.d;
          Disposable uDisposable = Observable.combineLatest(Observable.interval(td, td, TimeUnit.SECONDS, s36.b).startWithItem(Long.valueOf(0)), this.c.filter(ir2.b0).map(ir2.G).startWithItem(jc7.a), az5.v).skip(1).observeOn(s36.c).concatMapCompletable(new mf1(0, this)).subscribe(new nf1(this, 0), new hs0(4, this));
          co5.l(uDisposable, "override fun schedule\(\) …ed yet \"\)\n        }\n    }");
          co5.o(te, "<this>");
          te.c(uDisposable);
       }else {
          this.b.a("Failed to call DroppedEventsSchedulerImpl.schedule\(\): not stopped yet ");
       }
       return;
    }
}
