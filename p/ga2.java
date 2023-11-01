package p.ga2;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.iv6;
import p.fa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class ga2 extends p0	// class@0016cd from classes.dex
{
    public final Object c;
    public final boolean t;

    public void ga2(Flowable p0,Object p1){
       super(p0);
       this.c = p1;
       this.t = true;
    }
    public final void u(iv6 p0){
       this.b.subscribe(new fa2(p0, this.c, this.t));
    }
}
