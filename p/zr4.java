package p.zr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import p.gl1;
import java.lang.Throwable;
import p.cd1;

public final class zr4 implements Observer, Disposable	// class@002f50 from classes.dex
{
    public Observer a;
    public Disposable b;

    public void zr4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       zr4 tb = this.b;
       gl1 a = gl1.a;
       this.b = a;
       this.a = a;
       tb.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       zr4 ta = this.a;
       gl1 a = gl1.a;
       this.b = a;
       this.a = a;
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       zr4 ta = this.a;
       gl1 a = gl1.a;
       this.b = a;
       this.a = a;
       ta.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
