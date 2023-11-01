package p.k72;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.ir0;
import p.fv1;
import p.b5;
import p.iv6;
import p.j72;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class k72 extends p0	// class@001bbb from classes.dex
{
    public final ir0 c;
    public final fv1 t;
    public final b5 v;

    public void k72(Flowable p0,ir0 p1,fv1 p2,b5 p3){
       super(p0);
       this.c = p1;
       this.t = p2;
       this.v = p3;
    }
    public final void u(iv6 p0){
       this.b.subscribe(new j72(p0, this.c, this.t, this.v));
    }
}
