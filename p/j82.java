package p.j82;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.d92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.i82;
import p.t82;

public final class j82 extends p0	// class@001a85 from classes.dex
{
    public final int c;

    public void j82(Flowable p0,int p1){
       this.c = p1;
       super(p0);
    }
    public final void u(iv6 p0){
       p0 tb = this.b;
       switch (this.c){
           case 0:
             tb.subscribe(new i82(p0));
             return;
           case 1:
             tb.subscribe(new d92(p0));
             return;
           default:
             tb.subscribe(new t82(p0, 1));
             return;
       }
    }
}
