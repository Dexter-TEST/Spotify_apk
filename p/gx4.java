package p.gx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.lang.Throwable;
import java.lang.Object;
import java.util.AbstractCollection;
import p.cd1;

public final class gx4 extends ArrayDeque implements Observer, Disposable	// class@00179a from classes.dex
{
    public final Observer a;
    public final int b;
    public Disposable c;

    public void gx4(Observer p0,int p1){
       super(p1);
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
       if (this.b == this.size()) {
          this.a.onNext(this.poll());
       }
       this.offer(p0);
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
