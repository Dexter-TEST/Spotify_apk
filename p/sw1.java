package p.sw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.fn0;
import p.ad1;
import java.lang.Thread;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class sw1 extends AtomicInteger implements Runnable, Disposable	// class@0026ae from classes.dex
{
    public final Runnable a;
    public final ad1 b;
    public Thread c;

    public void sw1(Runnable p0,fn0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       int i;
       sw1 tb;
       while ((i = this.get()) < 2) {
          int i1 = 4;
          if (!i) {
             if (this.compareAndSet(0, i1)) {
                if ((tb = this.b) != null) {
                   tb.b(this);
                   break ;
                }else {
                   break ;
                }
             }
          }else if(this.compareAndSet(1, 3)){
             if ((tb = this.c) != null) {
                tb.interrupt();
                this.c = null;
             }
             this.set(i1);
             if ((tb = this.b) != null) {
                tb.b(this);
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() >= 2)? true: false;
       return b;
    }
    public final void run(){
       sw1 tb;
       if (!this.get()) {
          this.c = Thread.currentThread();
          int i = 1;
          if (this.compareAndSet(0, i)) {
             int i1 = 3;
             this.a.run();
             this.c = null;
             if (this.compareAndSet(i, 2)) {
                if ((tb = this.b) != null) {
                   tb.b(this);
                }
             }else {
                while (this.get() == i1) {
                   Thread.yield();
                }
                Thread.interrupted();
             }
          }else {
             this.c = null;
          }
       }
       return;
    }
}
