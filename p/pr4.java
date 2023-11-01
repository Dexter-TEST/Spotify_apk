package p.pr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ab6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.lang.Object;
import p.or4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class pr4 implements Observer, Disposable	// class@0022b8 from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public Disposable v;
    public or4 w;
    public long x;
    public boolean y;

    public void pr4(ab6 p0,long p1,TimeUnit p2,Scheduler$Worker p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       this.v.dispose();
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       pr4 tw;
       if (this.y != null) {
          return;
       }
       this.y = true;
       if ((tw = this.w) != null) {
          tw.dispose();
       }
       if (tw != null) {
          tw.run();
       }
       this.a.onComplete();
       this.t.dispose();
       return;
    }
    public final void onError(Throwable p0){
       pr4 tw;
       if (this.y != null) {
          RxJavaPlugins.c(p0);
          return;
       }else if((tw = this.w) != null){
          tw.dispose();
       }
       this.y = true;
       this.a.onError(p0);
       this.t.dispose();
       return;
    }
    public final void onNext(Object p0){
       pr4 tw;
       if (this.y != null) {
          return;
       }
       long l = this.x + 1;
       this.x = l;
       if ((tw = this.w) != null) {
          tw.dispose();
       }
       or4 oor4 = new or4(p0, l, this);
       this.w = oor4;
       cd1.c(oor4, this.t.b(oor4, this.b, this.c));
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
