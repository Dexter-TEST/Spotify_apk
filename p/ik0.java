package p.ik0;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.fn0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import p.rn;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ik0 implements CompletableObserver	// class@0019ab from classes.dex
{
    public final int a;
    public final CompletableObserver b;
    public final fn0 c;
    public final Serializable t;
    public Object v;

    public void ik0(CompletableObserver p0,fn0 p1,AtomicBoolean p2){
       this.a = 0;
       super();
       this.t = p2;
       this.c = p1;
       this.b = p0;
    }
    public void ik0(CompletableObserver p0,fn0 p1,rn p2,AtomicInteger p3){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
    }
    public final void onComplete(){
       ik0 tb = this.b;
       ik0 tt = this.t;
       switch (this.a){
           case 0:
             if (tt.compareAndSet(false, true)) {
                tt = this.c;
                tt.b(this.v);
                tt.dispose();
                tb.onComplete();
             }
             break;
           default:
             if (!this.v.decrementAndGet()) {
                tt.c(tb);
             }
             return;
       }
       return;
    }
    public final void onError(Throwable p0){
       ik0 tb = this.b;
       ik0 tt = this.t;
       switch (this.a){
           case 0:
             if (tt.compareAndSet(false, true)) {
                tt = this.c;
                tt.b(this.v);
                tt.dispose();
                tb.onError(p0);
             }else {
                RxJavaPlugins.c(p0);
             }
             break;
           default:
             if (tt.a(p0) && !this.v.decrementAndGet()) {
                tt.c(tb);
             }
             return;
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       ik0 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.c(p0);
             return;
       }
       this.v = p0;
       tc.c(p0);
       return;
    }
}
