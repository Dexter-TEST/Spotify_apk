package p.kr4;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.concurrent.atomic.AtomicInteger;
import p.rn;
import p.gq6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.lang.NullPointerException;
import p.tb0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;

public final class kr4 extends AtomicInteger implements ObservableEmitter	// class@001c6b from classes.dex
{
    public final ObservableEmitter a;
    public final rn b;
    public final gq6 c;
    public boolean t;

    public void kr4(ObservableEmitter p0){
       super();
       this.a = p0;
       this.b = new rn();
       this.c = new gq6(16);
    }
    public final void a(){
       if (!this.getAndIncrement()) {
          this.b();
       }
       return;
    }
    public final void b(){
       Throwable throwable;
       Object obj;
       kr4 ta = this.a;
       kr4 tc = this.c;
       kr4 tb = this.b;
       int i = 1;
       while (true) {
          if (ta.isDisposed()) {
             tc.clear();
             return;
          }else if(tb.get() != null){
             tc.clear();
             if ((throwable = iw1.d(tb)) == null) {
                ta.onComplete();
                break ;
             }else if(throwable != iw1.a){
                ta.onError(throwable);
                break ;
             }
             break ;
          }else {
             kr4 tt = this.t;
             int i1 = ((obj = tc.poll()) == null)? 1: 0;
             if (tt != null && i1) {
                ta.onComplete();
                return;
             }else if(i1){
                if (!(i = - i)) {
                   return;
                }
             }else {
                ta.onNext(obj);
             }
          }
       }
       return;
    }
    public final boolean isDisposed(){
       return this.a.isDisposed();
    }
    public final void onComplete(){
       if (this.t == null && !this.a.isDisposed()) {
          this.t = true;
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.t != null || this.a.isDisposed()) {
          return;
       }
       if (p0 == null) {
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }else if(!this.get() && this.compareAndSet(0, 1)){
          this.a.onNext(p0);
          if (!this.decrementAndGet()) {
             return;
          }
       }else {
          kr4 tc = this.c;
          _monitor_enter(tc);
          tc.offer(p0);
          _monitor_exit(tc);
          if (this.getAndIncrement()) {
             return;
          }
       }
       this.b();
       return;
    }
    public final ObservableEmitter serialize(){
       return this;
    }
    public void setCancellable(tb0 p0){
       this.a.setCancellable(p0);
    }
    public final void setDisposable(Disposable p0){
       this.a.setDisposable(p0);
    }
    public final String toString(){
       return this.a.toString();
    }
    public final boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.t == null && !this.a.isDisposed()) {
          if (p0 == null) {
             nullPointerE = iw1.b("onError called with a null Throwable.");
          }
          kr4 tb = this.b;
          tb.getClass();
          if (iw1.a(tb, nullPointerE)) {
             this.t = true;
             this.a();
             return true;
          }
       }
       return false;
    }
}
