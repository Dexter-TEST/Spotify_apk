package p.l0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.FutureTask;
import p.co5;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.Future;
import java.lang.Thread;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class l0 extends AtomicReference implements Disposable	// class@001cbf from classes.dex
{
    public final Runnable a;
    public final boolean b;
    public Thread c;
    public static final FutureTask t;
    public static final FutureTask v;

    static {
       lj1 e = co5.e;
       l0.t = new FutureTask(e, null);
       l0.v = new FutureTask(e, null);
    }
    public void l0(Runnable p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Future p0){
       Future uFuture;
       while ((uFuture = this.get()) != l0.t) {
          if (uFuture == l0.v) {
             if (this.c == Thread.currentThread()) {
                p0.cancel(false);
                break ;
             }else {
                p0.cancel(this.b);
                break ;
             }
          }
          break ;
       }
       return;
    }
    public final void dispose(){
       Future uFuture;
       if ((uFuture = this.get()) != l0.t) {
          FutureTask v = l0.v;
          if (uFuture != v && (this.compareAndSet(uFuture, v) && uFuture != null)) {
             if (this.c == Thread.currentThread()) {
                uFuture.cancel(false);
             }else {
                uFuture.cancel(this.b);
             }
          }
       }
       return;
    }
    public final boolean isDisposed(){
       Future uFuture;
       boolean b = ((uFuture = this.get()) != l0.t && uFuture != l0.v)? false: true;
       return b;
    }
    public final String toString(){
       Future uFuture;
       String str;
       if ((uFuture = this.get()) == l0.t) {
          str = "Finished";
       }else if(uFuture == l0.v){
          str = "Disposed";
       }else if(this.c != null){
          str = "Running on "+this.c;
       }else {
          str = "Waiting";
       }
       return this.getClass().getSimpleName()+"["+str+"]";
    }
}
