package p.iz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.kz4;
import p.ec7;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p.cd1;
import java.lang.Object;
import p.kf6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Class;
import p.fn0;
import p.rn;

public final class iz4 extends Observable implements Observer, Disposable	// class@001a34 from classes.dex
{
    public final kz4 a;
    public final ec7 b;
    public final AtomicReference c;
    public final AtomicBoolean t;

    public void iz4(kz4 p0,ec7 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new AtomicReference();
       this.t = new AtomicBoolean();
    }
    public void dispose(){
       cd1.a(this.c);
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       iz4 ta = this.a;
       ta.y.offer(this);
       ta.a();
    }
    public final void onError(Throwable p0){
       if (this.isDisposed()) {
          RxJavaPlugins.c(p0);
       }else {
          iz4 ta = this.a;
          ta.F.dispose();
          kz4 w = ta.w;
          w.getClass();
          cd1.a(w);
          ta.v.dispose();
          if (ta.E.a(p0)) {
             ta.C = true;
             ta.a();
          }
       }
       return;
    }
    public final void onNext(Object p0){
       if (cd1.a(this.c)) {
          p0 = this.a;
          p0.y.offer(this);
          p0.a();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.c, p0);
    }
    public final void subscribeActual(Observer p0){
       this.b.subscribe(p0);
       this.t.set(true);
    }
}
