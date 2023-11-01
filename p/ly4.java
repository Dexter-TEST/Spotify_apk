package p.ly4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;

public final class ly4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@001dea from classes.dex
{
    public boolean A;
    public boolean B;
    public boolean C;
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public final boolean v;
    public final AtomicReference w;
    public Disposable x;
    public boolean y;
    public Throwable z;

    public void ly4(Observer p0,long p1,TimeUnit p2,Scheduler$Worker p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = new AtomicReference();
    }
    public final void a(){
       ly4 ty;
       if (this.getAndIncrement()) {
          return;
       }
       ly4 tw = this.w;
       ly4 ta = this.a;
       boolean b = true;
       int i = 1;
       while (true) {
          Object obj = null;
          if (this.A != null) {
             tw.lazySet(obj);
             return;
          }else if((ty = this.y) != null && this.z != null){
             tw.lazySet(obj);
             ta.onError(this.z);
             this.t.dispose();
             return;
          }else {
             boolean b1 = false;
             int i1 = (tw.get() == null)? 1: 0;
             if (ty != null) {
                Object andSet = tw.getAndSet(obj);
                if (!i1 && this.v != null) {
                   ta.onNext(andSet);
                   break ;
                }
                break ;
             }else if(i1){
                if (this.B != null) {
                   this.C = b1;
                   this.B = b1;
                }
             }else if(this.C != null && this.B == null){
                ta.onNext(tw.getAndSet(obj));
                this.B = b1;
                this.C = b;
                this.t.b(this, this.b, this.c);
             }
             if (!(i = - i)) {
                return;
             }
          }
       }
       ta.onComplete();
       this.t.dispose();
       return;
    }
    public void dispose(){
       this.A = true;
       this.x.dispose();
       this.t.dispose();
       if (!this.getAndIncrement()) {
          this.w.lazySet(null);
       }
       return;
    }
    public boolean isDisposed(){
       return this.A;
    }
    public final void onComplete(){
       this.y = true;
       this.a();
    }
    public final void onError(Throwable p0){
       this.z = p0;
       this.y = true;
       this.a();
    }
    public final void onNext(Object p0){
       this.w.set(p0);
       this.a();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       this.B = true;
       this.a();
    }
}
