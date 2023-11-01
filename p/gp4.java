package p.gp4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import p.fp4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class gp4 extends AtomicReference implements Observer	// class@001753 from classes.dex
{
    public final fp4 a;
    public final int b;
    public final Observer c;
    public boolean t;

    public void gp4(fp4 p0,int p1,Observer p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       gp4 tc = this.c;
       if (this.t != null) {
          tc.onComplete();
       }else if(this.a.a(this.b)){
          this.t = true;
          tc.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       gp4 tc = this.c;
       if (this.t != null) {
          tc.onError(p0);
       }else if(this.a.a(this.b)){
          this.t = true;
          tc.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       gp4 tc = this.c;
       if (this.t != null) {
          tc.onNext(p0);
       }else if(this.a.a(this.b)){
          this.t = true;
          tc.onNext(p0);
       }else {
          this.get().dispose();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
