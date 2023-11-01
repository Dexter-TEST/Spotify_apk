package p.ha2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import p.kv6;
import p.mv6;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class ha2 implements FlowableSubscriber, Disposable	// class@001810 from classes.dex
{
    public final SingleObserver a;
    public final Object b;
    public kv6 c;
    public boolean t;
    public Object v;

    public void ha2(SingleObserver p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.cancel();
       this.c = mv6.a;
    }
    public boolean isDisposed(){
       boolean b = (this.c == mv6.a)? true: false;
       return b;
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.c = mv6.a;
       ha2 tv = this.v;
       this.v = null;
       if (tv == null) {
          tv = this.b;
       }
       ha2 ta = this.a;
       if (tv != null) {
          ta.onSuccess(tv);
       }else {
          ta.onError(new NoSuchElementException());
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.c = mv6.a;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       if (this.v != null) {
          this.t = true;
          this.c.cancel();
          this.c = mv6.a;
          this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.v = p0;
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
