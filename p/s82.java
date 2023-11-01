package p.s82;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import p.pq4;
import p.t82;
import p.rn;
import p.iv6;
import p.wu4;
import io.reactivex.rxjava3.core.Observer;
import p.xe7;
import java.lang.Throwable;
import p.vn0;
import p.ro1;
import io.reactivex.rxjava3.disposables.Disposable;
import p.mv6;
import p.cd1;

public final class s82 extends AtomicReference implements CompletableObserver	// class@0025d9 from classes.dex
{
    public final int a;
    public final AtomicInteger b;

    public void s82(AtomicInteger p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void onComplete(){
       s82 tb;
       boolean b = true;
       switch (this.a){
           case 0:
             tb = this.b;
             tb.t = b;
             if (tb.c != null) {
                t82 b1 = tb.b;
                t82 y = tb.y;
                if (!tb.getAndIncrement()) {
                   y.e(b1);
                }
             }
             return;
             break;
           case 1:
           default:
             tb = this.b;
             tb.w = b;
             if (tb.v != null) {
                xe7.K(tb.a, tb, tb.t);
             }
             return;
       }
       tb = this.b;
       tb.B = false;
       tb.c();
       return;
    }
    public final void onError(Throwable p0){
       s82 tb;
       switch (this.a){
           case 0:
           case 1:
             tb = this.b;
             if (tb.a.a(p0)) {
                if (tb.c != ro1.c) {
                   tb.v.dispose();
                }
                tb.B = false;
                tb.c();
             }
             return;
             break;
           default:
             tb = this.b;
             cd1.a(tb.b);
             xe7.L(tb.a, p0, tb, tb.t);
             return;
       }
       tb = this.b;
       mv6.b(tb.w);
       xe7.M(tb.b, p0, tb, tb.y);
       return;
    }
    public final void onSubscribe(Disposable p0){
       switch (this.a){
           case 0:
             cd1.e(this, p0);
             return;
           case 1:
             cd1.c(this, p0);
             return;
           default:
             cd1.e(this, p0);
             return;
       }
    }
}
