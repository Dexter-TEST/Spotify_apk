package p.cy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Throwable;
import java.util.AbstractCollection;
import p.cd1;

public final class cy4 extends ArrayDeque implements Observer, Disposable	// class@0012a0 from classes.dex
{
    public final Observer a;
    public final int b;
    public Disposable c;
    public boolean t;

    public void cy4(Observer p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.t == null) {
          this.t = true;
          this.c.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.t;
    }
    public final void onComplete(){
       Object obj;
       cy4 ta = this.a;
       while (true) {
          if (this.t != null) {
             return;
          }
          if ((obj = this.poll()) == null) {
             break ;
          }else {
             ta.onNext(obj);
          }
       }
       ta.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       if (this.b == this.size()) {
          this.poll();
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
