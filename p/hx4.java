package p.hx4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.gx4;
import p.cy4;

public final class hx4 extends z1	// class@0018df from classes.dex
{
    public final int b;
    public final int c;

    public void hx4(ObservableSource p0,int p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       hx4 tc = this.c;
       switch (this.b){
           case 0:
           default:
             ta.subscribe(new cy4(p0, tc));
             return;
       }
       ta.subscribe(new gx4(p0, tc));
       return;
    }
}
