package p.fq4;
import io.reactivex.rxjava3.core.Observer;
import p.w81;
import java.lang.Object;
import java.util.function.BiConsumer;
import java.util.function.Function;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.zo4;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.k11;

public final class fq4 extends w81 implements Observer	// class@00161a from classes.dex
{
    public final BiConsumer c;
    public final Function t;
    public Disposable v;
    public boolean w;
    public Object x;

    public void fq4(Observer p0,Object p1,BiConsumer p2,Function p3){
       super(p0);
       this.x = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       super.dispose();
       this.v.dispose();
    }
    public final void onComplete(){
       if (this.w != null) {
          return;
       }
       this.w = true;
       this.v = cd1.a;
       fq4 tx = this.x;
       this.x = null;
       Object obj = zo4.j(this.t, tx);
       Objects.requireNonNull(obj, "The finisher returned a null value");
       this.a(obj);
       return;
    }
    public final void onError(Throwable p0){
       if (this.w != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.w = true;
          this.v = cd1.a;
          this.x = null;
          this.a.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.w != null) {
          return;
       }
       k11.y(this.c, this.x, p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
