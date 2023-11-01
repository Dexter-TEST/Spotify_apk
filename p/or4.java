package p.or4;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.pr4;
import java.util.concurrent.atomic.AtomicBoolean;
import p.cd1;
import io.reactivex.rxjava3.core.Observer;

public final class or4 extends AtomicReference implements Runnable, Disposable	// class@002176 from classes.dex
{
    public final Object a;
    public final long b;
    public final pr4 c;
    public final AtomicBoolean t;

    public void or4(Object p0,long p1,pr4 p2){
       super();
       this.t = new AtomicBoolean();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void run(){
       if (this.t.compareAndSet(false, true)) {
          or4 tc = this.c;
          or4 ta = this.a;
          if (!(this.b - tc.x)) {
             tc.a.onNext(ta);
             this.dispose();
          }
       }
       return;
    }
}
