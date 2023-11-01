package p.nk0;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import p.ra6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class nk0 extends AtomicInteger implements CompletableObserver	// class@001ff2 from classes.dex
{
    public final CompletableObserver a;
    public final Iterator b;
    public final ra6 c;

    public void nk0(CompletableObserver p0,Iterator p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ra6();
    }
    public final void a(){
       nk0 ta = this.a;
       nk0 tc = this.c;
       if (tc.isDisposed()) {
          return;
       }
       if (this.getAndIncrement()) {
          return;
       }
       nk0 tb = this.b;
       while (true) {
          if (tc.isDisposed()) {
             return;
          }
          if (!tb.hasNext()) {
             ta.onComplete();
             return;
          }else {
             Object obj = tb.next();
             Objects.requireNonNull(obj, "The CompletableSource returned is null");
             obj.subscribe(this);
             if (!this.decrementAndGet()) {
                break ;
             }
          }
       }
       return;
    }
    public final void onComplete(){
       this.a();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       nk0 tc = this.c;
       tc.getClass();
       cd1.c(tc, p0);
    }
}
