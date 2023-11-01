package p.gl0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.yf2;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.co5;
import p.hn0;

public final class gl0 extends AtomicReference implements CompletableObserver, Disposable	// class@00172b from classes.dex
{
    public final CompletableObserver a;
    public final yf2 b;
    public boolean c;

    public void gl0(CompletableObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       gl0 ta = this.a;
       if (this.c != null) {
          ta.onError(p0);
          return;
       }else {
          this.c = true;
          Object obj = this.b.apply(p0);
          Objects.requireNonNull(obj, "The errorMapper returned a null CompletableSource");
          obj.subscribe(this);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       cd1.c(this, p0);
    }
}
