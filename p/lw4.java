package p.lw4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.y00;
import p.ra6;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class lw4 extends AtomicInteger implements Observer	// class@001dd8 from classes.dex
{
    public final Observer a;
    public final ra6 b;
    public final ObservableSource c;
    public final y00 t;
    public int v;

    public void lw4(Observer p0,y00 p1,ra6 p2,ObservableSource p3){
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
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       lw4 ta = this.a;
       int i = this.v + 1;
       this.v = i;
       if (!this.t.test(Integer.valueOf(i), p0)) {
          ta.onError(p0);
          return;
       }else {
          this.a();
          return;
       }
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       lw4 tb = this.b;
       tb.getClass();
       cd1.c(tb, p0);
    }
}
