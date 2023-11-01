package p.b26;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import p.jl1;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.iw1;
import p.cd1;

public final class b26 implements Observer, Disposable	// class@00103f from classes.dex
{
    public final Observer a;
    public Disposable b;
    public boolean c;

    public void b26(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       b26 ta = this.a;
       if (this.b == null) {
          ta.onSubscribe(jl1.a);
          ta.onError(new NullPointerException("Subscription not set!"));
          return;
       }else {
          ta.onComplete();
          return;
       }
    }
    public final void onError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          b26 ta = this.a;
          if (this.b == null) {
             ta.onSubscribe(jl1.a);
             Throwable[] throwableArr = new Throwable[]{p0,new NullPointerException("Subscription not set!")};
             ta.onError(new hn0(throwableArr));
             return;
          }else if(p0 == null){
             nullPointerE = iw1.b("onError called with a null Throwable.");
          }
          ta.onError(nullPointerE);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.c != null) {
          return;
       }
       b26 ta = this.a;
       if (this.b == null) {
          this.c = true;
          ta.onSubscribe(jl1.a);
          ta.onError(new NullPointerException("Subscription not set!"));
          return;
       }else if(p0 == null){
          this.b.dispose();
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }else {
          ta.onNext(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
