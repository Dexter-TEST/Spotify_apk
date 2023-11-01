package p.el0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fl0;
import java.lang.Object;
import p.b5;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.ir0;
import p.hn0;
import p.jl1;

public final class el0 implements CompletableObserver, Disposable	// class@0014a9 from classes.dex
{
    public final CompletableObserver a;
    public Disposable b;
    public final fl0 c;

    public void el0(fl0 p0,CompletableObserver p1){
       this.c = p0;
       super();
       this.a = p1;
    }
    public void dispose(){
       this.c.x.run();
       this.b.dispose();
       return;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       el0 ta = this.a;
       el0 tc = this.c;
       if (this.b == cd1.a) {
          return;
       }
       tc.t.run();
       tc.v.run();
       ta.onComplete();
       tc.w.run();
       return;
    }
    public final void onError(Throwable p0){
       el0 tc = this.c;
       if (this.b == cd1.a) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          tc.c.accept(p0);
          tc.v.run();
          this.a.onError(p0);
          tc.w.run();
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       el0 ta = this.a;
       this.c.b.accept(p0);
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          ta.onSubscribe(this);
       }
       return;
    }
}
