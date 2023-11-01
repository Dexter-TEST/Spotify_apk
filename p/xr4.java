package p.xr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import p.ra6;
import p.f37;
import p.wr4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class xr4 implements Observer	// class@002cd2 from classes.dex
{
    public final int a;
    public final Observer b;
    public final ra6 c;
    public boolean t;
    public final ObservableSource v;

    public void xr4(ObservableSource p0,Observer p1){
       this.a = 1;
       super();
       this.b = p1;
       this.v = p0;
       this.t = true;
       this.c = new ra6();
    }
    public void xr4(f37 p0,ra6 p1,Observer p2){
       this.a = 0;
       this.v = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public final void onComplete(){
       xr4 tv = this.v;
       switch (this.a){
           case 0:
             if (this.t == null) {
                this.t = true;
                tv.b.subscribe(new wr4(this, 0));
             }
             break;
           default:
             if (this.t != null) {
                this.t = false;
                tv.subscribe(this);
             }else {
                this.b.onComplete();
             }
             return;
       }
       return;
    }
    public final void onError(Throwable p0){
       xr4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.onError(p0);
             return;
       }
       if (this.t != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.t = true;
          tb.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       switch (this.a){
           case 0:
           default:
             if (this.t != null) {
                this.t = false;
             }
             this.b.onNext(p0);
             return;
       }
       this.onComplete();
       return;
    }
    public final void onSubscribe(Disposable p0){
       xr4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.getClass();
             cd1.d(tc, p0);
             return;
       }
       tc.getClass();
       cd1.d(tc, p0);
       return;
    }
}
