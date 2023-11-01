package p.n34;
import p.zv6;
import io.reactivex.rxjava3.core.Maybe;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.m5;
import p.et0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class n34 extends Maybe implements zv6	// class@001f5c from classes.dex
{
    public final Callable a;

    public void n34(Callable p0){
       super();
       this.a = p0;
    }
    public final void d(MaybeObserver p0){
       m5 om5 = et0.e();
       p0.onSubscribe(om5);
       if (!om5.isDisposed()) {
          Object obj = this.a.call();
          if (!om5.isDisposed()) {
             if (obj == null) {
                p0.onComplete();
             }else {
                p0.onSuccess(obj);
             }
          }
       }
       return;
    }
    public final Object get(){
       return this.a.call();
    }
}
