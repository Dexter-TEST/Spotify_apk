package p.gr4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.ab6;
import p.vu4;
import p.yt4;
import p.xt4;
import p.zr4;
import p.fr4;
import p.dy4;

public final class gr4 extends z1	// class@001764 from classes.dex
{
    public final int b;

    public void gr4(ObservableSource p0,int p1){
       this.b = p1;
       super(p0);
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       switch (this.b){
           case 0:
             ta.subscribe(new fr4(p0));
             return;
           case 1:
             ta.subscribe(new zr4(p0));
             return;
           case 2:
             ta.subscribe(new xt4(p0));
             return;
           case 3:
             ta.subscribe(new yt4(p0));
             return;
           case 4:
             ta.subscribe(new vu4(p0));
             return;
           case 5:
             ta.subscribe(new ab6(p0));
             return;
           default:
             ta.subscribe(new dy4(p0));
             return;
       }
    }
}
