package p.k20;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;

public abstract class k20 extends CountDownLatch implements Observer, Disposable	// class@001b8e from classes.dex
{
    public Object a;
    public Throwable b;
    public Disposable c;
    public boolean t;

    public void k20(){
       super(1);
    }
    public final Object a(){
       k20 tb;
       if (this.getCount()) {
          try{
             this.await();
          }catch(java.lang.InterruptedException e0){
             this.dispose();
             throw iw1.f(e0);
          }
       }
       if ((tb = this.b) == null) {
          return this.a;
       }else {
          throw iw1.f(tb);
       }
    }
    public final void dispose(){
       k20 tc;
       this.t = true;
       if ((tc = this.c) != null) {
          tc.dispose();
       }
       return;
    }
    public final boolean isDisposed(){
       return this.t;
    }
    public final void onComplete(){
       this.countDown();
    }
    public final void onSubscribe(Disposable p0){
       this.c = p0;
       if (this.t != null) {
          p0.dispose();
       }
       return;
    }
}
