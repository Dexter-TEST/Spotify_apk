package p.c30;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.AssertionError;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.bx5;
import p.cs2;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class c30 implements Observer	// class@00018d from classes2.dex
{
    public final Observer a;
    public boolean b;

    public void c30(Observer p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       if (this.b == null) {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b == null) {
          this.a.onError(p0);
       }else {
          AssertionError uAssertionEr = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
          uAssertionEr.initCause(p0);
          RxJavaPlugins.c(uAssertionEr);
       }
       return;
    }
    public final void onNext(Object p0){
       c30 ta = this.a;
       if (p0.a()) {
          ta.onNext(p0.b);
       }else {
          this.b = true;
          ta.onError(new cs2(p0));
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.a.onSubscribe(p0);
    }
}
