package p.ny4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import p.z47;
import p.cd1;

public final class ny4 implements Observer, Disposable	// class@002073 from classes.dex
{
    public final Observer a;
    public final TimeUnit b;
    public final Scheduler c;
    public long t;
    public Disposable v;

    public void ny4(Observer p0,TimeUnit p1,Scheduler p2){
       super();
       this.a = p0;
       this.c = p2;
       this.b = p1;
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.c.getClass();
       ny4 tb = this.b;
       long l = Scheduler.a(tb);
       ny4 tt = this.t;
       this.t = l;
       l = l - tt;
       this.a.onNext(new z47(p0, l, tb));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.c.getClass();
          this.t = Scheduler.a(this.b);
          this.a.onSubscribe(this);
       }
       return;
    }
}
