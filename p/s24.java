package p.s24;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Notification;
import java.lang.Throwable;
import p.cd1;
import java.lang.String;
import java.util.Objects;

public final class s24 implements SingleObserver, MaybeObserver, CompletableObserver, Disposable	// class@0025a6 from classes.dex
{
    public final SingleObserver a;
    public Disposable b;

    public void s24(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       this.a.onSuccess(Notification.b);
    }
    public final void onError(Throwable p0){
       this.a.onSuccess(Notification.a(p0));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       Objects.requireNonNull(p0, "value is null");
       this.a.onSuccess(new Notification(p0));
    }
}
