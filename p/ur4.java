package p.ur4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.lang.Object;
import p.sr4;
import java.lang.Runnable;
import java.lang.Throwable;
import p.tr4;
import p.iz7;
import p.cd1;

public final class ur4 implements Observer, Disposable	// class@002907 from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public final boolean v;
    public Disposable w;

    public void ur4(Observer p0,long p1,TimeUnit p2,Scheduler$Worker p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public void dispose(){
       this.w.dispose();
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       this.t.b(new sr4(this), this.b, this.c);
    }
    public final void onError(Throwable p0){
       tr4 otr4 = new tr4(this, p0);
       ur4 tb = (this.v != null)? this.b: 0;
       this.t.b(otr4, tb, this.c);
       return;
    }
    public final void onNext(Object p0){
       this.t.b(new iz7(this, p0, 21), this.b, this.c);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
