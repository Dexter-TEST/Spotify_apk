package p.mw4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.bi5;
import p.ra6;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import java.lang.Object;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class mw4 extends AtomicInteger implements Observer	// class@001f1b from classes.dex
{
    public final Observer a;
    public final ra6 b;
    public final ObservableSource c;
    public final bi5 t;
    public long v;

    public void mw4(Observer p0,long p1,bi5 p2,ra6 p3,ObservableSource p4){
       super();
       this.a = p0;
       this.b = p3;
       this.c = p4;
       this.t = p2;
       this.v = p1;
    }
    public final void a(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.b.isDisposed()) {
                return;
             }
             this.c.subscribe(this);
             if (i = - i) {
             }
          }
       }
       return;
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       mw4 tv = this.v;
       if (tv - Long.MAX_VALUE) {
          this.v = tv - 1;
       }
       mw4 ta = this.a;
       if (!(tv)) {
          ta.onError(p0);
       }else if(!this.t.test(p0)){
          ta.onError(p0);
          return;
       }else {
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       mw4 tb = this.b;
       tb.getClass();
       cd1.c(tb, p0);
    }
}
