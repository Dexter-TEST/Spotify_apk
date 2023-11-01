package p.pp4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.op4;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.fn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class pp4 extends AtomicReference implements Observer, Disposable	// class@0022a7 from classes.dex
{
    public final op4 a;
    public final long b;

    public void pp4(op4 p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.a.a(this, this.b);
       }
       return;
    }
    public final void onError(Throwable p0){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          pp4 ta = this.a;
          cd1.a(ta.w);
          ta.v.b(this);
          ta.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.get();
       cd1 a = cd1.a;
       if (p0 != a) {
          this.lazySet(a);
          p0.dispose();
          this.a.a(this, this.b);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
