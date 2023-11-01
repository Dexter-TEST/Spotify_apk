package p.lq4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import p.cd1;
import p.wq4;
import p.nq4;
import p.mq4;
import p.xq4;
import java.lang.Throwable;
import p.rn;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;

public final class lq4 extends AtomicReference implements Observer	// class@001da3 from classes.dex
{
    public final int a;
    public final Observer b;
    public final AtomicInteger c;

    public void lq4(Observer p0,AtomicInteger p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       switch (this.a){
           case 0:
             cd1.a(this);
             return;
           case 1:
             cd1.a(this);
             return;
           case 2:
             cd1.a(this);
             return;
           default:
             cd1.a(this);
             return;
       }
    }
    public final void onComplete(){
       lq4 tc;
       switch (this.a){
           case 0:
             tc = this.c;
             tc.z = false;
             tc.a();
             return;
           case 1:
             tc = this.c;
             tc.x = false;
             tc.a();
             return;
           case 2:
             tc = this.c;
             tc.A = false;
             tc.a();
             return;
           default:
             tc = this.c;
             tc.y = false;
             tc.a();
             return;
       }
    }
    public final void onError(Throwable p0){
       lq4 tc;
       switch (this.a){
           case 0:
             tc = this.c;
             if (tc.t.a(p0)) {
                if (tc.w == null) {
                   tc.y.dispose();
                }
                tc.z = false;
                tc.a();
             }
             return;
             break;
           case 1:
           case 2:
             tc = this.c;
             if (tc.t.a(p0)) {
                if (tc.w == null) {
                   tc.z.dispose();
                }
                tc.A = false;
                tc.a();
             }
             return;
             break;
           default:
             this.c.dispose();
             this.b.onError(p0);
             return;
       }
       this.c.dispose();
       this.b.onError(p0);
       return;
    }
    public final void onNext(Object p0){
       lq4 tb = this.b;
       switch (this.a){
           case 0:
             tb.onNext(p0);
             return;
           case 1:
             tb.onNext(p0);
             return;
           case 2:
             tb.onNext(p0);
             return;
           default:
             tb.onNext(p0);
             return;
       }
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
             cd1.c(this, p0);
             return;
           default:
             cd1.c(this, p0);
             return;
       }
    }
}
