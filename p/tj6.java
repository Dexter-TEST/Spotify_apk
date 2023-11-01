package p.tj6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import p.kv6;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IndexOutOfBoundsException;
import p.mv6;

public final class tj6 implements FlowableSubscriber, Disposable	// class@002784 from classes.dex
{
    public final SingleObserver a;
    public kv6 b;
    public Object c;
    public boolean t;
    public boolean v;

    public void tj6(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.v = true;
       this.b.cancel();
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       tj6 tc = this.c;
       this.c = null;
       tj6 ta = this.a;
       if (tc == null) {
          ta.onError(new NoSuchElementException("The source Publisher is empty"));
       }else {
          ta.onSuccess(tc);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.c = null;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       if (this.c != null) {
          this.b.cancel();
          this.t = true;
          this.c = null;
          this.a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
       }else {
          this.c = p0;
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
