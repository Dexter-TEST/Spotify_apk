package p.u17;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.t17;
import java.lang.Object;
import p.ul7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class u17 implements Observer, Disposable, MaybeObserver, SingleObserver, CompletableObserver	// class@002825 from classes.dex
{
    public final CountDownLatch a;
    public final ul7 b;
    public final ul7 c;
    public boolean t;
    public final Observer v;
    public final AtomicReference w;

    public void u17(){
       super();
       this.b = new ul7();
       this.c = new ul7();
       this.a = new CountDownLatch(1);
       this.w = new AtomicReference();
       this.v = t17.a;
    }
    public final void dispose(){
       cd1.a(this.w);
    }
    public final boolean isDisposed(){
       return cd1.b(this.w.get());
    }
    public final void onComplete(){
       u17 ta = this.a;
       if (this.t == null) {
          this.t = true;
          if (this.w.get() == null) {
             this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       Thread.currentThread();
       this.v.onComplete();
       ta.countDown();
       return;
    }
    public final void onError(Throwable p0){
       u17 ta = this.a;
       u17 tc = this.c;
       if (this.t == null) {
          this.t = true;
          if (this.w.get() == null) {
             tc.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       Thread.currentThread();
       if (p0 == null) {
          tc.add(new NullPointerException("onError received a null Throwable"));
       }else {
          tc.add(p0);
       }
       this.v.onError(p0);
       ta.countDown();
       return;
    }
    public final void onNext(Object p0){
       u17 tc = this.c;
       if (this.t == null) {
          this.t = true;
          if (this.w.get() == null) {
             tc.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       Thread.currentThread();
       this.b.add(p0);
       if (p0 == null) {
          tc.add(new NullPointerException("onNext received a null value"));
       }
       this.v.onNext(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       int i;
       Thread.currentThread();
       u17 tc = this.c;
       if (p0 == null) {
          tc.add(new NullPointerException("onSubscribe received a null Subscription"));
          return;
       }else {
          u17 tw = this.w;
          while (true) {
             if (tw.compareAndSet(null, p0)) {
                i = 1;
             }else {
                if (tw.get() != null) {
                   i = 0;
                }
             }
             if (!i) {
                p0.dispose();
                if (tw.get() != cd1.a) {
                   tc.add(new IllegalStateException("onSubscribe received multiple subscriptions: "+p0));
                   break ;
                }
                break ;
             }else {
                this.v.onSubscribe(p0);
                return;
             }
          }
          return;
       }
    }
    public final void onSuccess(Object p0){
       this.onNext(p0);
       this.onComplete();
    }
}
