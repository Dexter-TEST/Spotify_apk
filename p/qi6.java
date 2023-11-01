package p.qi6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;
import p.pi6;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import p.fn0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cj6;

public final class qi6 extends Single	// class@0023ac from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final SingleSource c;

    public void qi6(SingleSource p0,SingleSource p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       qi6 tc = this.c;
       qi6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Object[] objArray = new Object[]{null,null};
             fn0 uofn0 = new fn0();
             p0.onSubscribe(uofn0);
             fn0 uofn01 = uofn0;
             Object[] objArray1 = objArray;
             SingleObserver singleObserv = p0;
             AtomicInteger uAtomicInteg = new AtomicInteger();
             cj6 v11 = new cj6(0, uofn01, objArray1, singleObserv, uAtomicInteg);
             tb.subscribe(v11);
             v11 = new cj6(1, uofn01, objArray1, singleObserv, uAtomicInteg);
             tc.subscribe(tb);
             return;
       }
       tc.subscribe(new pi6(p0, tb));
       return;
    }
}
