package p.ka2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.iv6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import java.lang.Object;
import p.vv7;
import java.lang.Thread;
import p.ja2;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.bn5;

public final class ka2 extends AtomicReference implements FlowableSubscriber, kv6, Runnable	// class@001bd5 from classes.dex
{
    public final iv6 a;
    public final Scheduler$Worker b;
    public final AtomicReference c;
    public final AtomicLong t;
    public final boolean v;
    public bn5 w;

    public void ka2(iv6 p0,Scheduler$Worker p1,Flowable p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.w = p2;
       this.c = new AtomicReference();
       this.t = new AtomicLong();
       this.v = p3 ^ 0x01;
    }
    public final void a(long p0){
       kv6 okv6;
       kv6 okv61;
       if (mv6.f(p0)) {
          ka2 tc = this.c;
          if ((okv6 = tc.get()) != null) {
             this.b(p0, okv6);
          }else {
             ka2 tt = this.t;
             vv7.a(tt, p0);
             if ((okv61 = tc.get()) != null) {
                long andSet = tt.getAndSet(0);
                if (andSet) {
                   this.b(andSet, okv61);
                }
             }
          }
       }
       return;
    }
    public final void b(long p0,kv6 p1){
       if (this.v == null && Thread.currentThread() != this.get()) {
          this.b.a(new ja2(p0, p1));
       }else {
          p1.a(p0);
       }
       return;
    }
    public final void cancel(){
       mv6.b(this.c);
       this.b.dispose();
    }
    public final void onComplete(){
       this.a.onComplete();
       this.b.dispose();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
       this.b.dispose();
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this.c, p0)) {
          long andSet = this.t.getAndSet(0);
          if (andSet) {
             this.b(andSet, p0);
          }
       }
       return;
    }
    public final void run(){
       this.lazySet(Thread.currentThread());
       ka2 tw = this.w;
       this.w = null;
       tw.subscribe(this);
    }
}
