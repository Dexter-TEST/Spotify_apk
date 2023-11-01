package p.ia5;
import p.hs3;
import p.ce7;
import p.n56;
import java.lang.Object;
import p.jl1;
import p.vu1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import p.m56;
import java.lang.String;
import p.co5;
import java.lang.Boolean;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.bi5;
import p.e16;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.ha5;
import p.vs3;
import p.b5;
import p.ir0;

public final class ia5	// class@001957 from classes.dex
{
    public final hs3 a;
    public final ce7 b;
    public final m56 c;
    public Disposable d;

    public void ia5(hs3 p0,ce7 p1,n56 p2){
       super();
       this.d = jl1.a;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public synchronized final void a(vu1 p0){
       ce7 c;
       if (this.d.isDisposed()) {
          int i = 30;
          int i1 = (this.c.b != null)? 1: 30;
          this.c.getClass();
          Observable observable = Observable.interval((long)i1, (long)i, TimeUnit.SECONDS, s36.b);
          ia5 tb = this.b;
          if (tb.a.c != null) {
             c = tb.c;
             co5.l(c, "{\n            realConnProvider\n        }");
          }else {
             c = tb.b;
             co5.l(c, "{\n            defaultConnProvider\n        }");
          }
          this.d = Observable.combineLatest(observable, c.onErrorReturnItem(Boolean.FALSE), new bm(3)).filter(new bm(2)).observeOn(s36.c).concatMapCompletable(new e16(7, p0)).subscribe(new ha5(0, this), new vs3(2, this));
       }
       return;
    }
}
