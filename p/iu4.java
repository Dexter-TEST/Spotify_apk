package p.iu4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;
import p.cd1;
import java.lang.Object;
import java.lang.Long;

public final class iu4 extends AtomicReference implements Disposable, Runnable	// class@001a07 from classes.dex
{
    public final Observer a;
    public final long b;
    public long c;

    public void iu4(Observer p0,long p1,long p2){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void run(){
       if (!this.isDisposed()) {
          iu4 tc = this.c;
          iu4 ta = this.a;
          ta.onNext(Long.valueOf(tc));
          if (!(tc - this.b)) {
             if (!this.isDisposed()) {
                ta.onComplete();
             }
             cd1.a(this);
             return;
          }else {
             this.c = tc + 1;
          }
       }
       return;
    }
}
