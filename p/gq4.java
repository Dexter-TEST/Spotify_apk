package p.gq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.util.function.BiConsumer;
import java.util.function.Function;
import p.cd1;
import p.zo4;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.k11;

public final class gq4 implements Observer, Disposable	// class@00175c from classes.dex
{
    public final SingleObserver a;
    public final BiConsumer b;
    public final Function c;
    public Disposable t;
    public boolean v;
    public Object w;

    public void gq4(SingleObserver p0,Object p1,BiConsumer p2,Function p3){
       super();
       this.a = p0;
       this.w = p1;
       this.b = p2;
       this.c = p3;
    }
    public void dispose(){
       this.t.dispose();
       this.t = cd1.a;
    }
    public boolean isDisposed(){
       boolean b = (this.t == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       gq4 ta = this.a;
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.t = cd1.a;
       gq4 tw = this.w;
       this.w = null;
       Object obj = zo4.j(this.c, tw);
       Objects.requireNonNull(obj, "The finisher returned a null value");
       ta.onSuccess(obj);
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.v = true;
          this.t = cd1.a;
          this.w = null;
          this.a.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       k11.y(this.b, this.w, p0);
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
