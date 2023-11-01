package p.wr4;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import p.vw4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.xr4;
import java.lang.Throwable;
import p.vx5;
import java.lang.NullPointerException;
import java.lang.String;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.bx5;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Class;

public final class wr4 implements Observer	// class@002b90 from classes.dex
{
    public final int a;
    public final Observer b;

    public void wr4(Observer p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onComplete(){
       wr4 tb = this.b;
       switch (this.a){
           case 0:
             tb.b.onComplete();
             return;
           case 1:
             tb.t.dispose();
             tb.a();
             return;
           default:
             tb.onComplete();
             return;
       }
    }
    public final void onError(Throwable p0){
       wr4 tb = this.b;
       switch (this.a){
           case 0:
             tb.b.onError(p0);
             return;
           case 1:
             tb.t.dispose();
             tb.a.onError(p0);
             return;
           default:
             if (p0 == null) {
                throw new NullPointerException("error == null");
             }
             tb.onNext(new vx5(null, 0, p0));
             tb.onComplete();
             return;
       }
    }
    public final void onNext(Object p0){
       wr4 tb = this.b;
       switch (this.a){
           case 0:
             tb.b.onNext(p0);
             return;
           case 1:
             tb.b();
             return;
           default:
             if (p0 == null) {
                throw new NullPointerException("response == null");
             }
             tb.onNext(new vx5(p0, 0, null));
             return;
       }
    }
    public final void onSubscribe(Disposable p0){
       wr4 tb = this.b;
       switch (this.a){
           case 0:
             xr4 c = tb.c;
             c.getClass();
             cd1.d(c, p0);
             return;
           case 1:
             cd1.e(tb.c, p0);
             return;
           default:
             tb.onSubscribe(p0);
             return;
       }
    }
}
