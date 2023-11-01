package p.fr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Long;
import java.lang.Throwable;
import p.cd1;

public final class fr4 implements Observer, Disposable	// class@001622 from classes.dex
{
    public final Observer a;
    public Disposable b;
    public long c;

    public void fr4(Observer p0){
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
       fr4 ta = this.a;
       ta.onNext(Long.valueOf(this.c));
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.c = this.c + 1;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
