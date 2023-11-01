package p.oj6;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.nj6;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import p.kj6;

public final class oj6 extends Observable	// class@002133 from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final yf2 c;

    public void oj6(SingleSource p0,yf2 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       oj6 tb = this.b;
       oj6 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new kj6(p0, tc));
             return;
       }
       nj6 onj6 = new nj6(p0, tc);
       p0.onSubscribe(onj6);
       tb.subscribe(onj6);
       return;
    }
}
