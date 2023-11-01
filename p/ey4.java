package p.ey4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import p.gq6;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Long;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import p.cd1;

public final class ey4 extends AtomicBoolean implements Observer, Disposable	// class@001521 from classes.dex
{
    public Throwable A;
    public final Observer a;
    public final long b;
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;
    public final gq6 w;
    public final boolean x;
    public Disposable y;
    public boolean z;

    public void ey4(int p0,long p1,long p2,Observer p3,Scheduler p4,TimeUnit p5,boolean p6){
       super();
       this.a = p3;
       this.b = p1;
       this.c = p2;
       this.t = p5;
       this.v = p4;
       this.w = new gq6(p0);
       this.x = p6;
    }
    public final void a(){
       ey4 tA;
       Object obj;
       ey4 tA1;
       Long longx;
       if (!this.compareAndSet(false, true)) {
          return;
       }
       ey4 ta = this.a;
       ey4 tw = this.w;
       ey4 tx = this.x;
       this.v.getClass();
       long l = Scheduler.a(this.t) - this.c;
       while (true) {
          if (this.z != null) {
             tw.clear();
             return;
          }else if(tx == null && (tA = this.A) != null){
             tw.clear();
             ta.onError(tA);
             return;
          }else if((obj = tw.poll()) == null){
             int i = 1;
          }else {
             longx = 0;
          }
          if (i) {
             if ((tA1 = this.A) != null) {
                ta.onError(tA1);
                break ;
             }else {
                ta.onComplete();
                break ;
             }
          }else {
             longx = tw.poll();
             if ((obj.longValue() - l) < 0) {
                continue ;
             }else {
                ta.onNext(longx);
             }
          }
       }
       return;
    }
    public void dispose(){
       if (this.z == null) {
          this.z = true;
          this.y.dispose();
          if (this.compareAndSet(false, true)) {
             this.w.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.z;
    }
    public final void onComplete(){
       this.a();
    }
    public final void onError(Throwable p0){
       this.A = p0;
       this.a();
    }
    public final void onNext(Object p0){
       long l3;
       int i1;
       this.v.getClass();
       long l = Scheduler.a(this.t);
       ey4 tb = this.b;
       int i = (!(tb - Long.MAX_VALUE))? 1: 0;
       ey4 tw = this.w;
       tw.a(Long.valueOf(l), p0);
       while (!tw.isEmpty()) {
          long l1 = l - this.c;
          if ((tw.c().longValue() - l1) > 0) {
             if (!i) {
                p0 = tw.y;
                long l2 = p0.get();
                while (true) {
                   l1 = tw.a.get();
                   l3 = p0.get();
                   if (!(l2 - l3)) {
                      break ;
                   }else {
                      l2 = l3;
                   }
                }
                l1 = l1 - l3;
                if (((i1 = (int)l1 >> 1)) <= 0) {
                }
             }else {
                break ;
             }
          }
          tw.poll();
          tw.poll();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.y, p0)) {
          this.y = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
