package p.fs4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ir0;
import p.b5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;
import p.cd1;

public final class fs4 implements Observer, Disposable	// class@00162b from classes.dex
{
    public final Observer a;
    public final ir0 b;
    public final ir0 c;
    public final b5 t;
    public final b5 v;
    public Disposable w;
    public boolean x;

    public void fs4(Observer p0,ir0 p1,ir0 p2,b5 p3,b5 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public void dispose(){
       this.w.dispose();
    }
    public boolean isDisposed(){
       return this.w.isDisposed();
    }
    public final void onComplete(){
       if (this.x != null) {
          return;
       }
       this.t.run();
       this.x = true;
       this.a.onComplete();
       this.v.run();
       return;
    }
    public final void onError(Throwable p0){
       if (this.x != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.x = true;
          this.c.accept(p0);
          this.a.onError(p0);
          this.v.run();
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.x != null) {
          return;
       }
       this.b.accept(p0);
       this.a.onNext(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
