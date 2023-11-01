package p.ix4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.gq6;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.Throwable;
import java.io.Serializable;
import p.cd1;

public final class ix4 extends AtomicInteger implements Observer, Disposable	// class@001a22 from classes.dex
{
    public Throwable A;
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final gq6 v;
    public final boolean w;
    public Disposable x;
    public boolean y;
    public boolean z;

    public void ix4(Observer p0,long p1,TimeUnit p2,Scheduler p3,int p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = new gq6(p4);
       this.w = p5;
    }
    public final void a(){
       Long longx;
       ix4 oix4 = this;
       if (this.getAndIncrement()) {
          return;
       }
       ix4 a = oix4.a;
       ix4 v = oix4.v;
       ix4 w = oix4.w;
       ix4 c = oix4.c;
       ix4 t = oix4.t;
       ix4 b = oix4.b;
       int i = 1;
       while (true) {
          if (oix4.y != null) {
             oix4.v.clear();
             return;
          }else {
             ix4 z = oix4.z;
             int i1 = ((longx = v.c()) == null)? 1: 0;
             t.getClass();
             long l = Scheduler.a(c);
             if (!i1) {
                l = l - b;
                if ((longx.longValue() - l) > 0) {
                   i1 = 1;
                }
             }
             if (z != null) {
                if (w != null) {
                   if (i1) {
                      if ((v = oix4.A) != null) {
                         a.onError(v);
                         break ;
                      }else {
                         a.onComplete();
                         break ;
                      }
                   }
                }else if((z = oix4.A) != null){
                   oix4.v.clear();
                   a.onError(z);
                   return;
                }else if(i1){
                   a.onComplete();
                   return;
                }
             }
             if (i1) {
                if (!(i = - i)) {
                   return;
                }
             }else {
                v.poll();
                a.onNext(v.poll());
             }
          }
       }
       return;
    }
    public void dispose(){
       if (this.y == null) {
          this.y = true;
          this.x.dispose();
          if (!this.getAndIncrement()) {
             this.v.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.y;
    }
    public final void onComplete(){
       this.z = true;
       this.a();
    }
    public final void onError(Throwable p0){
       this.A = p0;
       this.z = true;
       this.a();
    }
    public final void onNext(Object p0){
       this.t.getClass();
       this.v.a(Long.valueOf(Scheduler.a(this.c)), p0);
       this.a();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
