package p.xy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;

public final class xy4 implements Observer, Disposable	// class@002d11 from classes.dex
{
    public final Observer a;
    public Disposable b;
    public Collection c;

    public void xy4(Observer p0,Collection p1){
       super();
       this.a = p0;
       this.c = p1;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       xy4 tc = this.c;
       this.c = null;
       xy4 ta = this.a;
       ta.onNext(tc);
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       this.c = null;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.c.add(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
