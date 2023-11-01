package p.ww4;
import p.on5;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class ww4 extends AtomicInteger implements on5, Runnable	// class@002bbd from classes.dex
{
    public final Observer a;
    public final Object b;

    public void ww4(Observer p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int b(int p0){
       if (!((p0 & 1))) {
          return 0;
       }
       this.lazySet(1);
       return 1;
    }
    public final void clear(){
       this.lazySet(3);
    }
    public void dispose(){
       this.set(3);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == 3)? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = true;
       if (this.get() != b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final Object poll(){
       if (this.get() != 1) {
          return null;
       }
       this.lazySet(3);
       return this.b;
    }
    public final void run(){
       if (!this.get() && this.compareAndSet(0, 2)) {
          ww4 ta = this.a;
          ta.onNext(this.b);
          if (this.get() == 2) {
             this.lazySet(3);
             ta.onComplete();
          }
       }
       return;
    }
}
