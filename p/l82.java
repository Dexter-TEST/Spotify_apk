package p.l82;
import p.qh2;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import p.j82;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.k82;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class l82 extends Completable implements qh2	// class@001d01 from classes.dex
{
    public final Flowable a;

    public void l82(Flowable p0){
       super();
       this.a = p0;
    }
    public final Flowable b(){
       return new j82(this.a, 0);
    }
    public final void o(CompletableObserver p0){
       this.a.subscribe(new k82(p0));
    }
}
