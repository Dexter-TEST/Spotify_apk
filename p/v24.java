package p.v24;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Throwable;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import java.lang.Object;
import p.cd1;
import java.lang.Class;

public final class v24 extends AtomicReference implements MaybeEmitter, Disposable	// class@00296b from classes.dex
{
    public final MaybeObserver a;

    public void v24(MaybeObserver p0){
       super();
       this.a = p0;
    }
    public final boolean a(Throwable p0){
       NullPointerException nullPointerE;
       cd1 a;
       Disposable andSet;
       if (p0 == null) {
          nullPointerE = iw1.b("onError called with a null Throwable.");
       }
       a = cd1.a;
       if (this.get() != a && (andSet = this.getAndSet(a)) != a) {
          this.a.onError(nullPointerE);
          if (andSet != null) {
             andSet.dispose();
          }
          return true;
       }else {
          return false;
       }
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final String toString(){
       Object[] objArray = new Object[]{v24.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
}
