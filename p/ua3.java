package p.ua3;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.FutureTask;
import p.co5;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ua3 implements Callable, Disposable	// class@002872 from classes.dex
{
    public final Runnable a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final ExecutorService t;
    public Thread v;
    public static final FutureTask w;

    static {
       ua3.w = new FutureTask(co5.e, null);
    }
    public void ua3(Runnable p0,ScheduledExecutorService p1){
       super();
       this.a = p0;
       this.c = new AtomicReference();
       this.b = new AtomicReference();
       this.t = p1;
    }
    public final void a(Future p0){
       boolean b;
       while (true) {
          ua3 tc = this.c;
          Future uFuture = tc.get();
          b = false;
          if (uFuture == ua3.w) {
             if (this.v != Thread.currentThread()) {
                b = true;
                break ;
             }
             break ;
          }else if(tc.compareAndSet(uFuture, p0)){
             b = true;
          }else {
             if (tc.get() == uFuture) {
                continue ;
             }
          }
          if (b) {
             return;
          }
          continue ;
       }
       p0.cancel(b);
       return;
    }
    public final Object call(){
       this.v = Thread.currentThread();
       this.a.run();
       this.v = null;
       Future uFuture = this.t.submit(this);
       do {
          ua3 tb = this.b;
          Future uFuture1 = tb.get();
          boolean b = false;
          if (uFuture1 == ua3.w) {
             if (this.v != Thread.currentThread()) {
                b = true;
             }
             uFuture.cancel(b);
             break ;
          }else if(tb.compareAndSet(uFuture1, uFuture)){
             b = true;
          }else {
             if (tb.get() == uFuture1) {
                continue ;
             }
          }
          if (!b) {
             continue ;
          }
          break ;
       } while (b);
       return null;
    }
    public void dispose(){
       FutureTask w = ua3.w;
       Future andSet = this.c.getAndSet(w);
       boolean b = true;
       if (andSet != null && andSet != w) {
          boolean b1 = (this.v != Thread.currentThread())? true: false;
          andSet.cancel(b1);
       }
       if ((andSet = this.b.getAndSet(w)) != null && andSet != w) {
          if (this.v == Thread.currentThread()) {
             b = false;
          }
          andSet.cancel(b);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == ua3.w)? true: false;
       return b;
    }
}
