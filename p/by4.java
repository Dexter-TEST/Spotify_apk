package p.by4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.jl1;

public final class by4 implements Observer, Disposable	// class@00115d from classes.dex
{
    public final Observer a;
    public boolean b;
    public Disposable c;
    public long t;

    public void by4(Observer p0,long p1){
       super();
       this.a = p0;
       this.t = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       if (this.b == null) {
          this.b = true;
          this.c.dispose();
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.b = true;
          this.c.dispose();
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.b == null) {
          by4 tt = this.t;
          long l = tt - 1;
          this.t = l;
          if ((tt) > 0) {
             tt = (!(l))? 1: 0;
             this.a.onNext(p0);
             if (tt) {
                this.onComplete();
             }
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          by4 ta = this.a;
          if (!(this.t)) {
             this.b = true;
             p0.dispose();
             ta.onSubscribe(jl1.a);
             ta.onComplete();
          }else {
             ta.onSubscribe(this);
          }
       }
       return;
    }
}
