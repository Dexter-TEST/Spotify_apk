package p.mx4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.xr4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ab6;
import p.fk;
import p.lx4;
import p.kx4;
import p.gy4;

public final class mx4 extends z1	// class@001f24 from classes.dex
{
    public final int b;
    public final ObservableSource c;

    public void mx4(ObservableSource p0,ObservableSource p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       mx4 tc = this.c;
       switch (this.b){
           case 0:
             ab6 uoab6 = new ab6(p0);
             fk uofk = new fk();
             uoab6.onSubscribe(uofk);
             lx4 olx4 = new lx4(uoab6, uofk);
             tc.subscribe(new kx4(uofk, olx4, uoab6));
             ta.subscribe(olx4);
             return;
           case 1:
             xr4 oxr4 = new xr4(tc, p0);
             p0.onSubscribe(oxr4.c);
             ta.subscribe(oxr4);
             return;
           default:
             gy4 ogy4 = new gy4(p0);
             p0.onSubscribe(ogy4);
             tc.subscribe(ogy4.c);
             ta.subscribe(ogy4);
             return;
       }
    }
}
