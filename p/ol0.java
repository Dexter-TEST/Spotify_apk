package p.ol0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observer;
import p.ht4;
import io.reactivex.rxjava3.core.CompletableObserver;

public final class ol0 extends Observable	// class@00213f from classes.dex
{
    public final int a;
    public final CompletableSource b;

    public void ol0(CompletableSource p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void subscribeActual(Observer p0){
       ol0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new ht4(p0));
             return;
       }
       tb.subscribe(new ht4(p0));
       return;
    }
}
