package p.xq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import p.ab6;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.lq4;
import p.yh6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;

public final class xq4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@002cca from classes.dex
{
    public boolean A;
    public int B;
    public final Observer a;
    public final yf2 b;
    public final lq4 c;
    public final int t;
    public final Scheduler$Worker v;
    public yh6 w;
    public Disposable x;
    public boolean y;
    public boolean z;

    public void xq4(ab6 p0,yf2 p1,int p2,Scheduler$Worker p3){
       super();
       this.a = p0;
       this.b = p1;
       this.t = p2;
       this.c = new lq4(p0, this, 3);
       this.v = p3;
    }
    public final void a(){
       if (this.getAndIncrement()) {
          return;
       }
       this.v.a(this);
       return;
    }
    public void dispose(){
       this.z = true;
       this.c.a();
       this.x.dispose();
       this.v.dispose();
       if (!this.getAndIncrement()) {
          this.w.clear();
       }
       return;
    }
    public boolean isDisposed(){
       return this.z;
    }
    public final void onComplete(){
       if (this.A != null) {
          return;
       }
       this.A = true;
       this.a();
       return;
    }
    public final void onError(Throwable p0){
       if (this.A != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.A = true;
          this.dispose();
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.A != null) {
          return;
       }
       if (this.B == null) {
          this.w.offer(p0);
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.x, p0)) {
          this.x = p0;
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.B = i;
                this.w = p0;
                this.A = b;
                this.a.onSubscribe(this);
                this.a();
                return;
             }else if(i == 2){
                this.B = i;
                this.w = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.w = new gq6(this.t);
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       Object obj;
       while (true) {
          if (this.z != null) {
             this.w.clear();
             return;
          }else if(this.y == null){
             xq4 tA = this.A;
             int i = ((obj = this.w.poll()) == null)? 1: 0;
             if (tA != null && i) {
                this.z = true;
                this.a.onComplete();
                this.v.dispose();
                return;
             }else if(!i){
                Object obj1 = this.b.apply(obj);
                Objects.requireNonNull(obj1, "The mapper returned a null ObservableSource");
                this.y = true;
                obj1.subscribe(this.c);
             }
          }
          if (!this.decrementAndGet()) {
             break ;
          }
       }
       return;
    }
}
