package p.gu4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;
import p.cd1;
import java.lang.Object;
import java.lang.Long;

public final class gu4 extends AtomicReference implements Disposable, Runnable	// class@00177f from classes.dex
{
    public final Observer a;
    public long b;

    public void gu4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void run(){
       if (this.get() != cd1.a) {
          gu4 tb = this.b;
          this.b = 1 + tb;
          this.a.onNext(Long.valueOf(tb));
       }
       return;
    }
}
