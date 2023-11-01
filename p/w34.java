package p.w34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.x34;
import java.lang.Object;
import java.lang.Throwable;
import p.ir0;
import p.co5;
import p.hn0;
import p.cd1;
import p.b5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.jl1;

public final class w34 implements MaybeObserver, Disposable	// class@002abb from classes.dex
{
    public final MaybeObserver a;
    public final x34 b;
    public Disposable c;

    public void w34(MaybeObserver p0,x34 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Throwable p0){
       w34 tb = this.b;
       tb.t.accept(p0);
       this.c = cd1.a;
       this.a.onError(p0);
       tb.w.run();
       return;
    }
    public void dispose(){
       this.b.x.run();
       this.c.dispose();
       this.c = cd1.a;
       return;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       w34 tb = this.b;
       cd1 a = cd1.a;
       if (this.c == a) {
          return;
       }
       tb.v.run();
       this.c = a;
       this.a.onComplete();
       tb.w.run();
       return;
    }
    public final void onError(Throwable p0){
       if (this.c == cd1.a) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.a(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       w34 ta = this.a;
       if (cd1.g(this.c, p0)) {
          this.b.b.accept(p0);
          this.c = p0;
          ta.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       w34 tb = this.b;
       cd1 a = cd1.a;
       if (this.c == a) {
          return;
       }
       tb.c.accept(p0);
       this.c = a;
       this.a.onSuccess(p0);
       tb.w.run();
       return;
    }
}
