package p.ep4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.cp4;
import io.reactivex.rxjava3.core.SingleObserver;
import p.dp4;
import io.reactivex.rxjava3.core.Observer;
import p.ip4;

public final class ep4 extends Single implements rh2	// class@0014d1 from classes.dex
{
    public final int a;
    public final ObservableSource b;
    public final bi5 c;

    public void ep4(ObservableSource p0,bi5 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Observable a(){
       ep4 tb = this.b;
       ep4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return new cp4(tb, tc, 1);
       }
       return new cp4(tb, tc, 0);
    }
    public final void subscribeActual(SingleObserver p0){
       ep4 tb = this.b;
       ep4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new ip4(p0, tc));
             return;
       }
       tb.subscribe(new dp4(p0, tc));
       return;
    }
}
