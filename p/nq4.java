package p.nq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.ab6;
import p.yf2;
import p.lq4;
import p.yh6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;

public final class nq4 extends AtomicInteger implements Observer, Disposable	// class@00202c from classes.dex
{
    public int A;
    public final Observer a;
    public final yf2 b;
    public final lq4 c;
    public final int t;
    public yh6 v;
    public Disposable w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void nq4(ab6 p0,yf2 p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.t = p2;
       this.c = new lq4(p0, this, 1);
    }
    public final void a(){
       Object obj;
       if (this.getAndIncrement()) {
          return;
       }
       while (true) {
          if (this.y != null) {
             this.v.clear();
             return;
          }else if(this.x == null){
             nq4 tz = this.z;
             int i = ((obj = this.v.poll()) == null)? 1: 0;
             if (tz != null && i) {
                this.y = true;
                this.a.onComplete();
                return;
             }else if(!i){
                Object obj1 = this.b.apply(obj);
                Objects.requireNonNull(obj1, "The mapper returned a null ObservableSource");
                this.x = true;
                obj1.subscribe(this.c);
             }
          }
          if (!this.decrementAndGet()) {
             break ;
          }
       }
       return;
    }
    public void dispose(){
       this.y = true;
       this.c.a();
       this.w.dispose();
       if (!this.getAndIncrement()) {
          this.v.clear();
       }
       return;
    }
    public boolean isDisposed(){
       return this.y;
    }
    public final void onComplete(){
       if (this.z != null) {
          return;
       }
       this.z = true;
       this.a();
       return;
    }
    public final void onError(Throwable p0){
       if (this.z != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.z = true;
          this.dispose();
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.z != null) {
          return;
       }
       if (this.A == null) {
          this.v.offer(p0);
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.A = i;
                this.v = p0;
                this.z = b;
                this.a.onSubscribe(this);
                this.a();
                return;
             }else if(i == 2){
                this.A = i;
                this.v = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.v = new gq6(this.t);
          this.a.onSubscribe(this);
       }
       return;
    }
}
