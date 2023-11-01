package p.xc1;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.m0;
import p.ir0;
import p.b5;
import p.ad1;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class xc1 extends m0 implements SingleObserver, MaybeObserver, CompletableObserver	// class@002c4a from classes.dex
{
    public final ir0 t;

    public void xc1(ir0 p0,ir0 p1,b5 p2,ad1 p3){
       super(p2, p1, p3);
       this.t = p0;
    }
    public final void onSuccess(Object p0){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.t.accept(p0);
       }
       this.a();
       return;
    }
}
