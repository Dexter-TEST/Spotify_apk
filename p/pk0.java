package p.pk0;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.lang.Throwable;
import java.lang.Object;
import p.cd1;
import java.lang.String;
import java.lang.Class;

public final class pk0 extends AtomicReference implements CompletableEmitter, Disposable	// class@002278 from classes.dex
{
    public final CompletableObserver a;

    public void pk0(CompletableObserver p0){
       super();
       this.a = p0;
    }
    public final boolean a(Throwable p0){
       Disposable andSet;
       cd1 a = cd1.a;
       if (this.get() == a || (andSet = this.getAndSet(a)) == a) {
          return false;
       }
       this.a.onError(p0);
       if (andSet != null) {
          andSet.dispose();
       }
       return true;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final String toString(){
       Object[] objArray = new Object[]{pk0.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
}
