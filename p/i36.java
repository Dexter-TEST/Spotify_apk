package p.i36;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Object;
import p.ad1;
import java.util.concurrent.Future;
import java.lang.Thread;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public final class i36 extends AtomicReferenceArray implements Runnable, Callable, Disposable	// class@00191a from classes.dex
{
    public final Runnable a;
    public static final Object b;
    public static final Object c;
    public static final Object t;
    public static final Object v;

    static {
       i36.b = new Object();
       i36.c = new Object();
       i36.t = new Object();
       i36.v = new Object();
    }
    public void i36(Runnable p0,ad1 p1){
       super(3);
       this.a = p0;
       this.lazySet(0, p1);
    }
    public final void a(Future p0){
       Object obj;
       while (true) {
          int i = 1;
          if ((obj = this.get(i)) == i36.v) {
             return;
          }
          if (obj == i36.c) {
             p0.cancel(false);
             return;
          }else if(obj == i36.t){
             p0.cancel(i);
             return;
          }else if(this.compareAndSet(i, obj, p0)){
             break ;
          }
       }
       return;
    }
    public final Object call(){
       this.run();
       return null;
    }
    public void dispose(){
       Object obj;
       Object v;
       Object obj1;
       boolean b;
       while (true) {
          int i = 1;
          obj = this.get(i);
          v = i36.v;
          if (obj != v) {
             Object c = i36.c;
             if (obj != c) {
                Object t = i36.t;
                if (obj == t) {
                   break ;
                }else if(this.get(2) != Thread.currentThread()){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   c = t;
                }
                if (this.compareAndSet(i, obj, c)) {
                   if (obj != null) {
                      obj.cancel(b);
                      break ;
                   }else {
                      break ;
                   }
                }
             }else {
                break ;
             }
          }else {
             break ;
          }
       }
       while ((obj1 = this.get(0)) != v) {
          obj = i36.b;
          if (obj1 != obj && obj1 != null) {
             if (this.compareAndSet(0, obj1, obj)) {
                obj1.b(this);
                break ;
             }
          }else {
             break ;
          }
       }
       return;
    }
    public boolean isDisposed(){
       Object obj;
       int i = 0;
       if ((obj = this.get(i)) == i36.b || obj == i36.v) {
          i = true;
       }
       return i;
    }
    public final void run(){
       Object obj;
       Object obj1;
       Object t = i36.t;
       Object c = i36.c;
       Object v = i36.v;
       this.lazySet(2, Thread.currentThread());
       this.a.run();
       if ((obj = this.get(0)) != i36.b && (this.compareAndSet(0, obj, v) && obj != null)) {
          obj.b(this);
       }
       do {
       } while ((obj1 = this.get(1)) != c && (obj1 != t && !this.compareAndSet(1, obj1, v)));
       this.lazySet(2, null);
       return;
    }
    public final String toString(){
       String obj;
       Object obj1;
       if ((obj = this.get(1)) == i36.v) {
          obj = "Finished";
       }else if(obj == i36.c){
          obj = "Disposed\(Sync\)";
       }else if(obj == i36.t){
          obj = "Disposed\(Async\)";
       }else if((obj1 = this.get(2)) == null){
          obj = "Waiting";
       }else {
          obj = "Running on "+obj1;
       }
       return i36.class.getSimpleName()+"["+obj+"]";
    }
}
