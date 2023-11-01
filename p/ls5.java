package p.ls5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.m5;
import p.b5;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import java.lang.Runnable;

public abstract class ls5 extends AtomicReference implements Disposable	// class@001db5 from classes.dex
{

    public void ls5(Object p0){
       Objects.requireNonNull(p0, "value is null");
       super(p0);
    }
    public final void dispose(){
       Object andSet;
       if (this.get() != null && (andSet = this.getAndSet(null)) != null) {
          switch (this.a){
              case 0:
                andSet.run();
                break;
              default:
                andSet.run();
          }
       }
       return;
    }
    public final boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
