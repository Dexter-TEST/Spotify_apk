package p.vu4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Notification;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.cd1;

public final class vu4 implements Observer, Disposable	// class@002a69 from classes.dex
{
    public final Observer a;
    public Disposable b;

    public void vu4(Observer p0){
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
       vu4 ta = this.a;
       ta.onNext(Notification.b);
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       vu4 ta = this.a;
       ta.onNext(Notification.a(p0));
       ta.onComplete();
    }
    public final void onNext(Object p0){
       Objects.requireNonNull(p0, "value is null");
       this.a.onNext(new Notification(p0));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
