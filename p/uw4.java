package p.uw4;
import p.vw4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab6;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;

public final class uw4 extends vw4	// class@002934 from classes.dex
{

    public void uw4(ObservableSource p0,ab6 p1){
       super(p0, p1);
    }
    public final void a(){
       this.a.onComplete();
    }
    public final void b(){
       Object andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          this.a.onNext(andSet);
       }
       return;
    }
}
