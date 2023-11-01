package p.od5;
import p.n25;
import p.f25;
import io.reactivex.rxjava3.core.MaybeEmitter;
import java.lang.Object;
import java.lang.Exception;
import p.v24;
import java.lang.Throwable;
import java.lang.Void;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;

public final class od5 implements n25, f25	// class@0020fc from classes.dex
{
    public final MaybeEmitter a;

    public void od5(MaybeEmitter p0){
       this.a = p0;
       super();
    }
    public void c(Exception p0){
       this.a.a(p0);
    }
    public void onSuccess(Object p0){
       Disposable andSet;
       p0 = new Object();
       od5 ta = this.a;
       cd1 a = cd1.a;
       if (ta.get() != a && (andSet = ta.getAndSet(a)) != a) {
          ta.a.onSuccess(p0);
          if (andSet != null) {
             andSet.dispose();
          }
       }
       return;
    }
}
