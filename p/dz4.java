package p.dz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import p.ec7;
import java.lang.Throwable;
import p.f37;
import java.util.Iterator;
import p.hv6;
import p.cd1;

public final class dz4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@0013e8 from classes.dex
{
    public final Observer a;
    public final long b;
    public final long c;
    public final int t;
    public final ArrayDeque v;
    public final AtomicBoolean w;
    public long x;
    public long y;
    public Disposable z;

    public void dz4(Observer p0,long p1,long p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = new ArrayDeque();
       this.w = new AtomicBoolean();
       this.lazySet(1);
    }
    public void dispose(){
       if (this.w.compareAndSet(false, true)) {
          this.run();
       }
       return;
    }
    public boolean isDisposed(){
       return this.w.get();
    }
    public final void onComplete(){
       dz4 tv = this.v;
       while (!tv.isEmpty()) {
          tv.poll().onComplete();
       }
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       dz4 tv = this.v;
       while (!tv.isEmpty()) {
          tv.poll().onError(p0);
       }
       this.a.onError(p0);
       return;
    }
    public final void onNext(Object p0){
       f37 uof37;
       dz4 tv = this.v;
       dz4 tx = this.x;
       dz4 tc = this.c;
       dz4 tw = this.w;
       if (!((tx % tc)) && !tw.get()) {
          this.getAndIncrement();
          ec7 uoec7 = ec7.a(this.t, this);
          uof37 = new f37(uoec7);
          tv.offer(uoec7);
          this.a.onNext(uof37);
       }else {
          uof37 = null;
       }
       long l = this.y + 1;
       Iterator iterator = tv.iterator();
       while (iterator.hasNext()) {
          iterator.next().onNext(p0);
       }
       if ((l - this.b) >= 0) {
          tv.poll().onComplete();
          if (tv.isEmpty() && tw.get()) {
             return;
          }else {
             this.y = l - tc;
          }
       }else {
          this.y = l;
       }
       this.x = tx + 1;
       if (uof37 != null && uof37.a()) {
          uof37.b.onComplete();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.z, p0)) {
          this.z = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       if (!this.decrementAndGet()) {
          this.z.dispose();
       }
       return;
    }
}
