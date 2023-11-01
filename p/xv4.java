package p.xv4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import p.kz4;
import p.gy4;
import p.cd1;
import p.rn;
import p.xe7;
import p.ow4;
import p.yv4;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import java.lang.Object;
import p.jz4;
import p.kf6;

public final class xv4 extends AtomicReference implements Observer	// class@002cf6 from classes.dex
{
    public final int a;
    public final AtomicInteger b;

    public void xv4(AtomicInteger p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public void xv4(kz4 p0){
       this.a = 3;
       super();
       this.b = p0;
    }
    public final void onComplete(){
       xv4 tb;
       switch (this.a){
           case 0:
             tb = this.b;
             cd1.a(tb.w);
             xe7.K(tb.a, tb, tb.c);
             return;
           case 1:
             tb = this.b;
             cd1.a(tb.w);
             xe7.K(tb.a, tb, tb.c);
             return;
           case 2:
             tb = this.b;
             cd1.a(tb.b);
             xe7.K(tb.a, tb, tb.t);
             return;
           default:
             tb = this.b;
             tb.D = true;
             tb.a();
             return;
       }
    }
    public final void onError(Throwable p0){
       xv4 tb;
       switch (this.a){
           case 0:
             tb = this.b;
             cd1.a(tb.w);
             xe7.L(tb.a, p0, tb, tb.c);
             return;
           case 1:
             tb = this.b;
             cd1.a(tb.w);
             xe7.L(tb.a, p0, tb, tb.c);
             return;
           case 2:
             tb = this.b;
             cd1.a(tb.b);
             xe7.L(tb.a, p0, tb, tb.t);
             return;
           default:
             tb = this.b;
             tb.F.dispose();
             tb.v.dispose();
             if (tb.E.a(p0)) {
                tb.C = true;
                tb.a();
             }
             return;
       }
    }
    public final void onNext(Object p0){
       xv4 tb = this.b;
       switch (this.a){
           case 0:
             tb.a();
             return;
           case 1:
             tb.a();
             return;
           case 2:
             cd1.a(this);
             cd1.a(tb.b);
             xe7.K(tb.a, tb, tb.t);
             return;
           default:
             tb.y.offer(new jz4(p0));
             tb.a();
             return;
       }
    }
    public final void onSubscribe(Disposable p0){
       switch (this.a){
           case 0:
             cd1.e(this, p0);
             return;
           case 1:
             cd1.e(this, p0);
             return;
           case 2:
             cd1.e(this, p0);
             return;
           default:
             cd1.e(this, p0);
             return;
       }
    }
}
