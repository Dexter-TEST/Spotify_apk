package p.q20;
import io.reactivex.rxjava3.core.Observer;
import java.util.Iterator;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.gq6;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import p.cd1;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class q20 extends AtomicReference implements Observer, Iterator, Disposable	// class@002317 from classes.dex
{
    public final gq6 a;
    public final ReentrantLock b;
    public final Condition c;
    public boolean t;
    public Throwable v;

    public void q20(int p0){
       super();
       this.a = new gq6(p0);
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.b = reentrantLoc;
       this.c = reentrantLoc.newCondition();
    }
    public final void a(){
       q20 tb = this.b;
       tb.lock();
       this.c.signalAll();
       tb.unlock();
    }
    public void dispose(){
       cd1.a(this);
       this.a();
    }
    public final boolean hasNext(){
       q20 tv;
       while (true) {
          if (this.isDisposed()) {
             if ((tv = this.v) == null) {
                return false;
             }else {
                throw iw1.f(tv);
             }
          }else {
             boolean b = this.a.isEmpty();
             if (this.t != null) {
                if ((tv = this.v) == null) {
                   if (b) {
                      return false;
                   }
                }else {
                   break ;
                }
             }
             if (b) {
                try{
                   this.b.lock();
                   while (this.t == null && (this.a.isEmpty() && !this.isDisposed())) {
                      this.c.await();
                   }
                   this.b.unlock();
                }catch(java.lang.InterruptedException e0){
                   cd1.a(this);
                   this.a();
                   throw iw1.f(e0);
                }
             }else {
                return true;
             }
          }
       }
       throw iw1.f(tv);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final Object next(){
       if (this.hasNext()) {
          return this.a.poll();
       }
       throw new NoSuchElementException();
    }
    public final void onComplete(){
       this.t = true;
       this.a();
    }
    public final void onError(Throwable p0){
       this.v = p0;
       this.t = true;
       this.a();
    }
    public final void onNext(Object p0){
       this.a.offer(p0);
       this.a();
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void remove(){
       throw new UnsupportedOperationException("remove");
    }
}
