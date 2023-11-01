package p.gs4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class gs4 implements Observer, Disposable	// class@00176d from classes.dex
{
    public final Observer a;
    public final long b;
    public final Object c;
    public final boolean t;
    public Disposable v;
    public long w;
    public boolean x;

    public void gs4(Observer p0,long p1,Object p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onComplete(){
       gs4 tc;
       if (this.x == null) {
          this.x = true;
          gs4 ta = this.a;
          if ((tc = this.c) == null && this.t != null) {
             ta.onError(new NoSuchElementException());
          }else if(tc != null){
             ta.onNext(tc);
          }
          ta.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.x != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.x = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.x != null) {
          return;
       }
       gs4 tw = this.w;
       if (!(tw - this.b)) {
          this.x = true;
          this.v.dispose();
          tw = this.a;
          tw.onNext(p0);
          tw.onComplete();
          return;
       }else {
          this.w = tw + 1;
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
