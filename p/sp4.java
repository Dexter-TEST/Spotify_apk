package p.sp4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.ab6;
import p.zv6;
import io.reactivex.rxjava3.core.ObservableSource;
import p.kf6;
import p.yh6;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.Collection;
import p.xh6;
import p.eo5;
import java.lang.Throwable;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import p.rp4;
import p.co5;
import p.jl1;

public final class sp4 extends pn5 implements Disposable	// class@002674 from classes.dex
{
    public rp4 A;
    public Collection B;
    public final zv6 x;
    public final ObservableSource y;
    public Disposable z;

    public void sp4(ab6 p0,zv6 p1,ObservableSource p2){
       super(p0, new kf6(14));
       this.x = p1;
       this.y = p2;
    }
    public void dispose(){
       if (this.v == null) {
          this.v = true;
          this.A.dispose();
          this.z.dispose();
          if (this.k()) {
             this.t.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final void j(Observer p0,Object p1){
       this.c.onNext(p1);
    }
    public final void onComplete(){
       sp4 tB;
       _monitor_enter(this);
       if ((tB = this.B) == null) {
          _monitor_exit(this);
          return;
       }else {
          this.B = null;
          _monitor_exit(this);
          this.t.offer(tB);
          this.w = true;
          if (this.k()) {
             eo5.j(this.t, this.c, this, this);
          }
          return;
       }
    }
    public final void onError(Throwable p0){
       this.dispose();
       this.c.onError(p0);
    }
    public final void onNext(Object p0){
       sp4 tB;
       _monitor_enter(this);
       if ((tB = this.B) == null) {
          _monitor_exit(this);
          return;
       }else {
          tB.add(p0);
          _monitor_exit(this);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.z, p0)) {
          this.z = p0;
          Object obj = this.x.get();
          Objects.requireNonNull(obj, "The buffer supplied is null");
          this.B = obj;
          rp4 orp4 = new rp4(this);
          this.A = orp4;
          this.c.onSubscribe(this);
          if (this.v == null) {
             this.y.subscribe(orp4);
          }
       }
       return;
    }
}
