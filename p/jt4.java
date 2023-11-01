package p.jt4;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Future;
import io.reactivex.rxjava3.core.Observer;
import p.w81;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.String;
import p.iw1;
import java.lang.Throwable;
import p.co5;
import p.wy4;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class jt4 extends Observable	// class@001b40 from classes.dex
{
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Object t;

    public void jt4(long p0,TimeUnit p1,Scheduler p2){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public void jt4(Future p0,long p1,TimeUnit p2){
       this.a = 0;
       super();
       this.t = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void subscribeActual(Observer p0){
       jt4 tb = this.b;
       jt4 tt = this.t;
       jt4 tc = this.c;
       switch (this.a){
           case 0:
             break;
           default:
             wy4 owy4 = new wy4(p0);
             p0.onSubscribe(owy4);
             cd1.f(owy4, tt.d(owy4, tb, tc));
             return;
       }
       w81 ow81 = new w81(p0);
       p0.onSubscribe(ow81);
       if (!ow81.isDisposed()) {
          Object obj = (tc != null)? tt.get(tb, tc): tt.get();
          iw1.c(obj, "Future returned a null value.");
          ow81.a(obj);
       }
       return;
    }
}
