package p.ps4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import p.qs4;
import java.lang.Throwable;
import p.rn;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import p.gq6;
import p.yh6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.on5;
import p.vn5;

public final class ps4 extends AtomicReference implements Observer	// class@0022c1 from classes.dex
{
    public final qs4 a;
    public boolean b;
    public yh6 c;
    public int t;

    public void ps4(qs4 p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       this.b = true;
       this.a.c();
    }
    public final void onError(Throwable p0){
       if (this.a.y.a(p0)) {
          ps4 ta = this.a;
          if (ta.c == null) {
             ta.b();
          }
          this.b = true;
          this.a.c();
       }
       return;
    }
    public final void onNext(Object p0){
       ps4 tc;
       if (this.t == null) {
          ps4 ta = this.a;
          if (!ta.get() && ta.compareAndSet(0, 1)) {
             ta.a.onNext(p0);
             if (ta.decrementAndGet()) {
                ta.d();
             }
          }else if((tc = this.c) == null){
             tc = new gq6(ta.v);
             this.c = tc;
          }
          tc.offer(p0);
          if (!ta.getAndIncrement()) {
          }
       }else {
          this.a.c();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0) && p0 instanceof on5) {
          int i = p0.b(7);
          boolean b = true;
          if (i == b) {
             this.t = i;
             this.c = p0;
             this.b = b;
             this.a.c();
             return;
          }else if(i == 2){
             this.t = i;
             this.c = p0;
          }
       }
       return;
    }
}
