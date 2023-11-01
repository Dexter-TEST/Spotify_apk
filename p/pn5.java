package p.pn5;
import io.reactivex.rxjava3.core.Observer;
import p.a27;
import p.ab6;
import p.kf6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yh6;
import p.xh6;
import p.eo5;

public abstract class pn5 extends a27 implements Observer	// class@002296 from classes.dex
{
    public final Observer c;
    public final xh6 t;
    public boolean v;
    public boolean w;

    public void pn5(ab6 p0,kf6 p1){
       super(9, 0);
       this.c = p0;
       this.t = p1;
    }
    public abstract void j(Observer p0,Object p1);
    public final boolean k(){
       boolean b = (!this.b.getAndIncrement())? true: false;
       return b;
    }
    public final void l(Collection p0,Disposable p1){
       a27 tb = this.b;
       a27 uoa27 = tb;
       pn5 tc = this.c;
       pn5 tt = this.t;
       if (!uoa27.get() && uoa27.compareAndSet(0, 1)) {
          this.j(tc, p0);
          if (!tb.addAndGet(-1)) {
             return;
          }
       }else {
          tt.offer(p0);
          if (!this.k()) {
             return;
          }
       }
       eo5.j(tt, tc, p1, this);
       return;
    }
    public final void m(Collection p0,Disposable p1){
       a27 tb = this.b;
       a27 uoa27 = tb;
       pn5 tc = this.c;
       pn5 tt = this.t;
       if (!uoa27.get() && uoa27.compareAndSet(0, 1)) {
          if (tt.isEmpty()) {
             this.j(tc, p0);
             if (!tb.addAndGet(-1)) {
                return;
             }
          }else {
             tt.offer(p0);
          }
       }else {
          tt.offer(p0);
          if (!this.k()) {
             return;
          }
       }
       eo5.j(tt, tc, p1, this);
       return;
    }
}
