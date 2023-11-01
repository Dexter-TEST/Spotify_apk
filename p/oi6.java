package p.oi6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import p.bn5;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ni6;
import p.iv6;
import p.mk6;
import io.reactivex.rxjava3.disposables.Disposable;

public final class oi6 extends Single	// class@00212a from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final bn5 c;

    public void oi6(SingleSource p0,bn5 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       oi6 tc = this.c;
       oi6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             mk6 omk6 = new mk6(p0);
             p0.onSubscribe(omk6);
             tc.subscribe(omk6.b);
             tb.subscribe(omk6);
             return;
       }
       tc.subscribe(new ni6(p0, tb));
       return;
    }
}
