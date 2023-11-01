package p.vn0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.ro1;
import p.rn;
import p.yh6;
import java.lang.Throwable;
import java.lang.Object;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;

public abstract class vn0 extends AtomicInteger implements Observer, Disposable	// class@002a28 from classes.dex
{
    public final rn a;
    public final int b;
    public final ro1 c;
    public yh6 t;
    public Disposable v;
    public boolean w;
    public boolean x;

    public void vn0(int p0,ro1 p1){
       super();
       this.c = p1;
       this.a = new rn();
       this.b = p0;
    }
    public void a(){
    }
    public abstract void b();
    public abstract void c();
    public abstract void d();
    public final void dispose(){
       this.x = true;
       this.v.dispose();
       this.b();
       this.a.b();
       if (!this.getAndIncrement()) {
          this.t.clear();
          this.a();
       }
       return;
    }
    public final boolean isDisposed(){
       return this.x;
    }
    public final void onComplete(){
       this.w = true;
       this.c();
    }
    public final void onError(Throwable p0){
       if (this.a.a(p0)) {
          if (this.c == ro1.a) {
             this.b();
          }
          this.w = true;
          this.c();
       }
       return;
    }
    public final void onNext(Object p0){
       if (p0 != null) {
          this.t.offer(p0);
       }
       this.c();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          if (p0 instanceof on5) {
             int i = p0.b(7);
             boolean b = true;
             if (i == b) {
                this.t = p0;
                this.w = b;
                this.d();
                this.c();
                return;
             }else if(i == 2){
                this.t = p0;
                this.d();
                return;
             }
          }
          this.t = new gq6(this.b);
          this.d();
       }
       return;
    }
}
