package p.tq4;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import p.uq4;
import p.xu4;
import java.lang.Throwable;
import p.rn;
import p.cd1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;

public final class tq4 extends AtomicReference implements MaybeObserver	// class@0027c0 from classes.dex
{
    public final int a;
    public final AtomicInteger b;

    public void tq4(AtomicInteger p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void onComplete(){
       tq4 tb;
       switch (this.a){
           case 0:
           default:
             tb = this.b;
             tb.z = 2;
             if (!tb.getAndIncrement()) {
                tb.a();
             }
             return;
       }
       tb = this.b;
       tb.C = 0;
       tb.c();
       return;
    }
    public final void onError(Throwable p0){
       tq4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (tb.t.a(p0)) {
                cd1.a(tb.b);
                if (!tb.getAndIncrement()) {
                   tb.a();
                }
             }
             return;
       }
       tb.e(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       switch (this.a){
           case 0:
           default:
             cd1.e(this, p0);
             return;
       }
       cd1.c(this, p0);
       return;
    }
    public final void onSuccess(Object p0){
       switch (this.a){
           case 0:
           default:
             tq4 tb = this.b;
             if (tb.compareAndSet(0, 1)) {
                tb.a.onNext(p0);
                tb.z = 2;
             }else {
                tb.w = p0;
                tb.z = 1;
                if (tb.getAndIncrement()) {
                label_0031 :
                   return;
                }
             }
             tb.a();
             goto label_0031 ;
       }
       this.b.f(p0);
       return;
    }
}
