package p.cj6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.fn0;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.lang.Boolean;

public final class cj6 implements SingleObserver	// class@00121d from classes.dex
{
    public final int a;
    public final fn0 b;
    public final Object[] c;
    public final SingleObserver t;
    public final AtomicInteger v;

    public void cj6(int p0,fn0 p1,Object[] p2,SingleObserver p3,AtomicInteger p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void onError(Throwable p0){
       int andSet;
       if ((andSet = this.v.getAndSet(-1)) && andSet != 1) {
          RxJavaPlugins.c(p0);
       }else {
          this.b.dispose();
          this.t.onError(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.b.c(p0);
    }
    public final void onSuccess(Object p0){
       cj6 tc = this.c;
       tc[this.a] = p0;
       if (this.v.incrementAndGet() == 2) {
          this.t.onSuccess(Boolean.valueOf(Objects.equals(tc[0], tc[1])));
       }
       return;
    }
}
