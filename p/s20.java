package p.s20;
import java.util.Iterator;
import p.ed1;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Notification;
import p.yj4;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import java.lang.Object;
import java.util.NoSuchElementException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class s20 extends ed1 implements Iterator	// class@0025a2 from classes.dex
{
    public Notification b;
    public final Semaphore c;
    public final AtomicReference t;

    public void s20(){
       super();
       this.c = new Semaphore(0);
       this.t = new AtomicReference();
    }
    public final boolean hasNext(){
       s20 tb;
       if ((tb = this.b) != null && tb.a instanceof yj4) {
          throw iw1.f(tb.b());
       }
       if (tb == null) {
          try{
             this.c.acquire();
             Notification andSet = this.t.getAndSet(null);
             this.b = andSet;
             if (andSet.a instanceof yj4) {
                throw iw1.f(andSet.b());
             }
          }catch(java.lang.InterruptedException e0){
             this.dispose();
             this.b = Notification.a(e0);
             throw iw1.f(e0);
          }
       }
       return this.b.c();
    }
    public final Object next(){
       Notification a;
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       if ((a = this.b.a) == null || a instanceof yj4) {
          a = null;
       }
       this.b = null;
       return a;
    }
    public final void onComplete(){
    }
    public final void onError(Throwable p0){
       RxJavaPlugins.c(p0);
    }
    public final void onNext(Object p0){
       int i = (this.t.getAndSet(p0) == null)? 1: 0;
       if (i) {
          this.c.release();
       }
       return;
    }
    public final void remove(){
       throw new UnsupportedOperationException("Read-only iterator.");
    }
}
