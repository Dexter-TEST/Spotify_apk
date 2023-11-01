package p.er4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.dr4;
import p.yu4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;

public final class er4 extends z1	// class@0014e2 from classes.dex
{
    public final int b;
    public final SingleSource c;

    public void er4(Observable p0,SingleSource p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       er4 tc = this.c;
       switch (this.b){
           case 0:
           default:
             yu4 oyu4 = new yu4(p0);
             p0.onSubscribe(oyu4);
             ta.subscribe(oyu4);
             tc.subscribe(oyu4.c);
             return;
       }
       ta.subscribe(new dr4(p0, tc));
       return;
    }
}
