package p.d30;
import io.reactivex.rxjava3.core.Observable;
import p.x90;
import io.reactivex.rxjava3.core.Observer;
import p.c30;
import p.wr4;

public final class d30 extends Observable	// class@0001aa from classes2.dex
{
    public final int a;
    public final Observable b;

    public void d30(x90 p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void subscribeActual(Observer p0){
       d30 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new wr4(p0, 2));
             return;
       }
       tb.subscribe(new c30(p0));
       return;
    }
}
