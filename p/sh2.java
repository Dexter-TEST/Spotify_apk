package p.sh2;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.Future;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.cd1;
import java.util.concurrent.ExecutionException;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class sh2 extends CountDownLatch implements MaybeObserver, SingleObserver, CompletableObserver, Future, Disposable	// class@00262a from classes.dex
{
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public void sh2(){
       super(1);
       this.c = new AtomicReference();
    }
    public final boolean cancel(boolean p0){
       while (true) {
          sh2 tc = this.c;
          Disposable uDisposable = tc.get();
          boolean b = false;
          if (uDisposable != this) {
             cd1 a = cd1.a;
             if (uDisposable == a) {
             }
          }else {
          }
       }
    }
    public void dispose(){
    }
    public final Object get(){
       sh2 tb;
       if (this.getCount()) {
          this.await();
       }
       if (!this.isCancelled()) {
          if ((tb = this.b) == null) {
             return this.a;
          }else {
             throw new ExecutionException(tb);
          }
       }else {
          throw new CancellationException();
       }
    }
    public final Object get(long p0,TimeUnit p1){
       sh2 tb;
       if ((this.getCount()) && !this.await(p0, p1)) {
          throw new TimeoutException(iw1.e(p0, p1));
       }
       if (this.isCancelled()) {
          throw new CancellationException();
       }
       if ((tb = this.b) == null) {
          return this.a;
       }
       throw new ExecutionException(tb);
    }
    public final boolean isCancelled(){
       return cd1.b(this.c.get());
    }
    public boolean isDisposed(){
       return this.isDone();
    }
    public final boolean isDone(){
       boolean b = (!(this.getCount()))? true: false;
       return b;
    }
    public final void onComplete(){
       Disposable uDisposable;
       sh2 tc = this.c;
       if ((uDisposable = tc.get()) == cd1.a) {
          return;
       }
       do {
       } while (tc.compareAndSet(uDisposable, this) || tc.get() != uDisposable);
       this.countDown();
       return;
    }
    public final void onError(Throwable p0){
       Disposable uDisposable;
       while (true) {
          sh2 tc = this.c;
          if ((uDisposable = tc.get()) == cd1.a) {
          }else {
             this.b = p0;
             while (true) {
                if (tc.compareAndSet(uDisposable, this)) {
                   tc = 1;
                }else {
                   if (tc.get() != uDisposable) {
                      tc = 0;
                   }
                }
                if (tc) {
                }
             }
             RxJavaPlugins.c(p0);
             return;
          }
       }
       this.countDown();
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.c, p0);
    }
    public final void onSuccess(Object p0){
       Disposable uDisposable;
       sh2 tc = this.c;
       if ((uDisposable = tc.get()) == cd1.a) {
          return;
       }
       this.a = p0;
       do {
       } while (tc.compareAndSet(uDisposable, this) || tc.get() != uDisposable);
       this.countDown();
       return;
    }
}
