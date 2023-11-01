package p.ia2;
import p.qh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Flowable;
import p.ga2;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ha2;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class ia2 extends Single implements qh2	// class@001954 from classes.dex
{
    public final Flowable a;
    public final Object b;

    public void ia2(Flowable p0){
       super();
       this.a = p0;
       this.b = null;
    }
    public final Flowable b(){
       return new ga2(this.a, this.b);
    }
    public final void subscribeActual(SingleObserver p0){
       this.a.subscribe(new ha2(p0, this.b));
    }
}
