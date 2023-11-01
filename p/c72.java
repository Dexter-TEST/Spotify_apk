package p.c72;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.d72;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.vv7;
import p.ya4;
import java.lang.String;
import java.lang.Throwable;
import p.cd1;

public final class c72 extends AtomicReference implements Runnable, Disposable	// class@0011ad from classes.dex
{
    public final Object a;
    public final long b;
    public final d72 c;
    public final AtomicBoolean t;

    public void c72(Object p0,long p1,d72 p2){
       super();
       this.t = new AtomicBoolean();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       if (this.t.compareAndSet(false, true)) {
          c72 tc = this.c;
          c72 ta = this.a;
          if (!(this.b - tc.x)) {
             if (tc.get()) {
                tc.a.onNext(ta);
                vv7.H(tc, 1);
                this.dispose();
             }else {
                tc.cancel();
                tc.a.onError(new ya4("Could not deliver value due to lack of requests"));
             }
          }
       }
       return;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void run(){
       this.a();
    }
}
