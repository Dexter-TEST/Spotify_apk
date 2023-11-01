package p.ql0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.ir0;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.hn0;

public final class ql0 extends AtomicReference implements CompletableObserver, Disposable	// class@0023c1 from classes.dex
{
    public final CompletableObserver a;
    public final ir0 b;
    public final boolean c;
    public Disposable t;

    public void ql0(CompletableObserver p0,Object p1,ir0 p2,boolean p3){
       super(p1);
       this.a = p0;
       this.b = p2;
       this.c = p3;
    }
    public final void a(){
       Object andSet;
       if ((andSet = this.getAndSet(this)) != this) {
          this.b.accept(andSet);
       }
       return;
    }
    public void dispose(){
       cd1 a = cd1.a;
       if (this.c != null) {
          this.a();
          this.t.dispose();
          this.t = a;
       }else {
          this.t.dispose();
          this.t = a;
          this.a();
       }
       return;
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       ql0 tc;
       Object andSet;
       this.t = cd1.a;
       ql0 ta = this.a;
       if ((tc = this.c) != null) {
          if ((andSet = this.getAndSet(this)) != this) {
             this.b.accept(andSet);
          }else {
             return;
          }
       }
       ta.onComplete();
       if (tc == null) {
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       ql0 tc;
       Object andSet;
       this.t = cd1.a;
       if ((tc = this.c) != null) {
          if ((andSet = this.getAndSet(this)) != this) {
             this.b.accept(andSet);
          }else {
             return;
          }
       }
       this.a.onError(p0);
       if (tc == null) {
          this.a();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
