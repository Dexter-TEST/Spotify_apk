package p.tu4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import p.zv6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import p.cd1;

public final class tu4 implements Observer, Disposable	// class@0027e4 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final yf2 c;
    public final zv6 t;
    public Disposable v;

    public void tu4(Observer p0,yf2 p1,yf2 p2,zv6 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onComplete(){
       tu4 ta = this.a;
       Object obj = this.t.get();
       Objects.requireNonNull(obj, "The onComplete ObservableSource returned is null");
       ta.onNext(obj);
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       tu4 ta = this.a;
       Object obj = this.c.apply(p0);
       Objects.requireNonNull(obj, "The onError ObservableSource returned is null");
       ta.onNext(obj);
       ta.onComplete();
    }
    public final void onNext(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The onNext ObservableSource returned is null");
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
