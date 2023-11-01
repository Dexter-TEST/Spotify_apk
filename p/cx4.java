package p.cx4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import p.y00;
import io.reactivex.rxjava3.core.Observable;
import p.vq4;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import p.bx4;
import io.reactivex.rxjava3.disposables.Disposable;

public final class cx4 extends Single implements rh2	// class@001297 from classes.dex
{
    public final ObservableSource a;
    public final ObservableSource b;
    public final y00 c;
    public final int t;

    public void cx4(ObservableSource p0,ObservableSource p1,y00 p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final Observable a(){
       vq4 v6 = new vq4(this.a, this.b, this.c, this.t, 3);
       return v6;
    }
    public final void subscribeActual(SingleObserver p0){
       bx4 v6 = new bx4(p0, this.t, this.a, this.b, this.c);
       p0.onSubscribe(v6);
       v6.subscribe();
    }
}
