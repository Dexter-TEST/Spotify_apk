package p.mj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.yf2;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import p.vk0;
import p.co5;
import p.hn0;

public final class mj6 extends AtomicReference implements SingleObserver, Disposable	// class@001eab from classes.dex
{
    public final SingleObserver a;
    public final yf2 b;
    public final yf2 c;
    public Disposable t;

    public void mj6(SingleObserver p0,yf2 p1,yf2 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       cd1.a(this);
       this.t.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       Object obj = this.c.apply(p0);
       Objects.requireNonNull(obj, "The onErrorMapper returned a null SingleSource");
       if (!this.isDisposed()) {
          obj.subscribe(new vk0(1, this));
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The onSuccessMapper returned a null SingleSource");
       if (!this.isDisposed()) {
          p0.subscribe(new vk0(1, this));
       }
       return;
    }
}
