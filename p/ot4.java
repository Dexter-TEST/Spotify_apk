package p.ot4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import p.yf2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p.pt4;
import p.qt4;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.gq6;
import p.co5;
import p.cd1;

public final class ot4 extends AtomicInteger implements Observer, Disposable	// class@002188 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final yf2 c;
    public final int t;
    public final boolean v;
    public final ConcurrentHashMap w;
    public Disposable x;
    public final AtomicBoolean y;
    public static final Object z;

    static {
       ot4.z = new Object();
    }
    public void ot4(Observer p0,yf2 p1,yf2 p2,int p3,boolean p4){
       super();
       this.y = new AtomicBoolean();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = new ConcurrentHashMap();
       this.lazySet(1);
    }
    public void dispose(){
       if (this.y.compareAndSet(false, true) && !this.decrementAndGet()) {
          this.x.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.y.get();
    }
    public final void onComplete(){
       ot4 tw = this.w;
       tw.clear();
       Iterator iterator = new ArrayList(tw.values()).iterator();
       while (iterator.hasNext()) {
          pt4 b = iterator.next().b;
          b.v = true;
          b.a();
       }
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       this.w.clear();
       Iterator iterator = new ArrayList(this.w.values()).iterator();
       while (iterator.hasNext()) {
          pt4 b = iterator.next().b;
          b.w = p0;
          b.v = true;
          b.a();
       }
       this.a.onError(p0);
       return;
    }
    public final void onNext(Object p0){
       ot4 ta = this.a;
       Object obj = this.b.apply(p0);
       Object z = ot4.z;
       Object obj1 = (obj != null)? obj: z;
       ot4 tw = this.w;
       pt4 opt4 = tw.get(obj1);
       int i = 0;
       if (opt4 == null) {
          if (this.y.get()) {
             return;
          }else {
             pt4 opt41 = new pt4(obj, new qt4(this.t, this, obj, this.v));
             tw.put(obj1, opt41);
             this.getAndIncrement();
             opt4 = opt41;
             obj1 = 1;
          }
       }else {
          obj1 = 0;
       }
       p0 = this.c.apply(p0);
       Objects.requireNonNull(p0, "The value supplied is null");
       pt4 b = opt4.b;
       b.b.offer(p0);
       b.a();
       if (obj1) {
          ta.onNext(opt4);
          p0 = opt4.b.z;
          if (!p0.get() && p0.compareAndSet(i, 2)) {
             i = 1;
          }
          if (i) {
             if (obj == null) {
                obj = z;
             }
             this.w.remove(obj);
             if (!this.decrementAndGet()) {
                this.x.dispose();
             }
             p0 = opt4.b;
             p0.v = true;
             p0.a();
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
