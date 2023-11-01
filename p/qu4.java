package p.qu4;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.pu4;
import io.reactivex.rxjava3.core.Observer;
import p.dx4;

public final class qu4 extends Maybe	// class@002418 from classes.dex
{
    public final int a;
    public final ObservableSource b;

    public void qu4(ObservableSource p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void d(MaybeObserver p0){
       qu4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new dx4(p0));
             return;
       }
       tb.subscribe(new pu4(p0));
       return;
    }
}
