package p.tw4;
import p.vw4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab6;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;

public final class tw4 extends vw4	// class@0027f6 from classes.dex
{
    public final AtomicInteger v;
    public boolean w;

    public void tw4(ObservableSource p0,ab6 p1){
       super(p0, p1);
       this.v = new AtomicInteger();
    }
    public final void a(){
       Object andSet;
       this.w = true;
       if (!this.v.getAndIncrement()) {
          if ((andSet = this.getAndSet(null)) != null) {
             this.a.onNext(andSet);
          }
          this.a.onComplete();
       }
       return;
    }
    public final void b(){
       Object andSet;
       if (!this.v.getAndIncrement()) {
          do {
             tw4 tw = this.w;
             if ((andSet = this.getAndSet(null)) != null) {
                this.a.onNext(andSet);
             }
             if (tw != null) {
                this.a.onComplete();
                return;
             }
          } while (!this.v.decrementAndGet());
       }
       return;
    }
}
