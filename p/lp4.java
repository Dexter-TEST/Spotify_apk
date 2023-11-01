package p.lp4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p.zv6;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import p.iw1;
import java.util.Collection;
import p.co5;
import java.util.Iterator;
import p.cd1;

public final class lp4 extends AtomicBoolean implements Observer, Disposable	// class@001d9a from classes.dex
{
    public final Observer a;
    public final int b;
    public final int c;
    public final zv6 t;
    public Disposable v;
    public final ArrayDeque w;
    public long x;

    public void lp4(Observer p0,int p1,int p2,zv6 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.w = new ArrayDeque();
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onComplete(){
       lp4 ta;
       while (true) {
          lp4 tw = this.w;
          ta = this.a;
          if (!tw.isEmpty()) {
             ta.onNext(tw.poll());
          }else {
             break ;
          }
       }
       ta.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       this.w.clear();
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       Iterator obj;
       lp4 tx = this.x;
       this.x = 1 + tx;
       lp4 tw = this.w;
       lp4 ta = this.a;
       if (!((tx % (long)this.c))) {
          obj = this.t.get();
          iw1.c(obj, "The bufferSupplier returned a null Collection.");
          tw.offer(obj);
       }
       obj = tw.iterator();
       while (obj.hasNext()) {
          Collection uCollection = obj.next();
          uCollection.add(p0);
          if (this.b <= uCollection.size()) {
             obj.remove();
             ta.onNext(uCollection);
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
