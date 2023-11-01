package p.vv4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.fx4;
import p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.uv4;
import p.by4;

public final class vv4 extends z1	// class@002a72 from classes.dex
{
    public final int b;
    public final long c;

    public void vv4(ObservableSource p0,long p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       vv4 tc = this.c;
       switch (this.b){
           case 0:
             ra6 ora6 = new ra6();
             p0.onSubscribe(ora6);
             int i = Long.MAX_VALUE;
             long l = (tc - i)? tc - 1: i;
             uv4 v0 = new uv4(p0, l, ora6, this.a);
             v0.a();
             return;
             break;
           case 1:
           default:
             ta.subscribe(new by4(p0, tc));
             return;
       }
       ta.subscribe(new fx4(p0, tc));
       return;
    }
}
