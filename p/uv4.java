package p.uv4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.ra6;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class uv4 extends AtomicInteger implements Observer	// class@00292b from classes.dex
{
    public final Observer a;
    public final ra6 b;
    public final ObservableSource c;
    public long t;

    public void uv4(Observer p0,long p1,ra6 p2,ObservableSource p3){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.t = p1;
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
       uv4 tt = this.t;
       if (tt - Long.MAX_VALUE) {
          this.t = tt - 1;
       }
       if (tt) {
          this.a();
       }else {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       uv4 tb = this.b;
       tb.getClass();
       cd1.c(tb, p0);
    }
}
