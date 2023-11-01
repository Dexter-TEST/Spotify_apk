package p.s62;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import p.yu4;
import p.rn;
import p.cd1;
import java.util.concurrent.atomic.AtomicInteger;
import p.uq4;
import p.t62;
import p.ro1;
import p.kv6;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;

public final class s62 extends AtomicReference implements SingleObserver	// class@0025c8 from classes.dex
{
    public final int a;
    public final Object b;

    public void s62(int p0,Object p1){
       this.a = p0;
       this.b = p1;
    }
    public final void onError(Throwable p0){
       s62 tb;
       switch (this.a){
           case 0:
             tb = this.b;
             if (tb.a.a(p0)) {
                if (tb.c != ro1.c) {
                   tb.v.cancel();
                }
                tb.G = 0;
                tb.b();
             }
             return;
             break;
           case 1:
           case 2:
             tb = this.b;
             if (tb.t.a(p0)) {
                cd1.a(tb.b);
                if (!tb.getAndIncrement()) {
                   tb.a();
                }
             }
             return;
             break;
           default:
             this.b.onError(p0);
             return;
       }
       this.b.e(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       switch (this.a){
           case 0:
             cd1.c(this, p0);
             return;
           case 1:
             cd1.c(this, p0);
             return;
           case 2:
             cd1.e(this, p0);
             return;
           default:
             cd1.e(this, p0);
             return;
       }
    }
    public final void onSuccess(Object p0){
       s62 tb;
       switch (this.a){
           case 0:
             tb = this.b;
             tb.F = p0;
             tb.G = 2;
             tb.b();
             return;
           case 1:
             this.b.f(p0);
             return;
           case 2:
             tb = this.b;
             if (tb.compareAndSet(0, 1)) {
                tb.a.onNext(p0);
                tb.z = 2;
             }else {
                tb.w = p0;
                tb.z = 1;
                if (tb.getAndIncrement()) {
                label_0029 :
                   return;
                }
             }
             tb.a();
             goto label_0029 ;
             break;
           default:
             this.b.onSuccess(p0);
             return;
       }
    }
}
