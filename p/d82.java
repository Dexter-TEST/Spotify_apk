package p.d82;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Future;
import p.iv6;
import p.x81;
import p.kv6;
import java.lang.Object;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import java.lang.Throwable;
import p.co5;
import java.util.concurrent.atomic.AtomicInteger;
import p.va2;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class d82 extends Flowable	// class@0012f8 from classes.dex
{
    public final int b;
    public final long c;
    public final TimeUnit t;
    public final Object v;

    public void d82(long p0,TimeUnit p1,Scheduler p2){
       this.b = 1;
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
    }
    public void d82(Future p0,long p1,TimeUnit p2){
       this.b = 0;
       super();
       this.v = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void u(iv6 p0){
       d82 tc = this.c;
       d82 tv = this.v;
       d82 tt = this.t;
       switch (this.b){
           case 0:
             break;
           default:
             va2 ova2 = new va2(p0);
             p0.onSubscribe(ova2);
             cd1.f(ova2, tv.d(ova2, tc, tt));
             return;
       }
       x81 ox81 = new x81(p0);
       p0.onSubscribe(ox81);
       Object obj = (tt != null)? tv.get(tc, tt): tv.get();
       if (obj == null) {
          p0.onError(iw1.b("The future returned a null value."));
       }else {
          ox81.d(obj);
       }
       return;
    }
}
