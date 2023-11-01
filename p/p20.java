package p.p20;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;

public final class p20 extends CountDownLatch implements SingleObserver, CompletableObserver, MaybeObserver	// class@0021d6 from classes.dex
{
    public Object a;
    public Throwable b;
    public Disposable c;
    public boolean t;

    public void p20(){
       super(1);
    }
    public final Object a(){
       p20 tc;
       p20 tb;
       if (this.getCount()) {
          try{
             this.await();
          }catch(java.lang.InterruptedException e0){
             this.t = true;
             if ((tc = this.c) != null) {
                tc.dispose();
             }
             throw iw1.f(e0);
          }
       }
       if ((tb = this.b) == null) {
          return this.a;
       }else {
          throw iw1.f(tb);
       }
    }
    public final void onComplete(){
       this.countDown();
    }
    public final void onError(Throwable p0){
       this.b = p0;
       this.countDown();
    }
    public final void onSubscribe(Disposable p0){
       this.c = p0;
       if (this.t != null) {
          p0.dispose();
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a = p0;
       this.countDown();
    }
}
