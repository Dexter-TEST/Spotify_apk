package p.nx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.cd1;

public final class nx4 implements Observer, Disposable	// class@00206a from classes.dex
{
    public final Observer a;
    public final bi5 b;
    public Disposable c;
    public boolean t;

    public void nx4(Observer p0,bi5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       nx4 ta = this.a;
       if (this.t != null) {
          ta.onNext(p0);
       }else if(!this.b.test(p0)){
          this.t = true;
          ta.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
