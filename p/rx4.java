package p.rx4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import p.sx4;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.iw1;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yh6;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;

public final class rx4 extends AtomicReference implements Observer	// class@002578 from classes.dex
{
    public final sx4 a;
    public final long b;
    public final int c;
    public yh6 t;
    public boolean v;

    public void rx4(sx4 p0,long p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       if (!(this.b - this.a.A)) {
          this.v = true;
          this.a.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       rx4 ta = this.a;
       ta.getClass();
       if (!(this.b - ta.A)) {
          sx4 v = ta.v;
          v.getClass();
          if (iw1.a(v, p0)) {
             if (ta.t == null) {
                ta.y.dispose();
                ta.w = true;
             }
             this.v = true;
             ta.a();
          label_002d :
             return;
          }
       }
       RxJavaPlugins.c(p0);
       goto label_002d ;
    }
    public final void onNext(Object p0){
       if (!(this.b - this.a.A)) {
          if (p0 != null) {
             this.t.offer(p0);
          }
          this.a.a();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          if (p0 instanceof on5) {
             int i = p0.b(7);
             boolean b = true;
             if (i == b) {
                this.t = p0;
                this.v = b;
                this.a.a();
                return;
             }else if(i == 2){
                this.t = p0;
                return;
             }
          }
          this.t = new gq6(this.c);
       }
       return;
    }
}
