package p.rn;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import p.iv6;

public final class rn extends AtomicReference	// class@002524 from classes.dex
{

    public void rn(){
       super();
    }
    public final boolean a(Throwable p0){
       if (iw1.a(this, p0)) {
          return true;
       }
       RxJavaPlugins.c(p0);
       return false;
    }
    public final void b(){
       Throwable throwable;
       if ((throwable = iw1.d(this)) != null && throwable != iw1.a) {
          RxJavaPlugins.c(throwable);
       }
       return;
    }
    public final void c(CompletableObserver p0){
       Throwable throwable;
       if ((throwable = iw1.d(this)) == null) {
          p0.onComplete();
       }else if(throwable != iw1.a){
          p0.onError(throwable);
       }
       return;
    }
    public final void d(Observer p0){
       Throwable throwable;
       if ((throwable = iw1.d(this)) == null) {
          p0.onComplete();
       }else if(throwable != iw1.a){
          p0.onError(throwable);
       }
       return;
    }
    public final void e(iv6 p0){
       Throwable throwable;
       if ((throwable = iw1.d(this)) == null) {
          p0.onComplete();
       }else if(throwable != iw1.a){
          p0.onError(throwable);
       }
       return;
    }
}
