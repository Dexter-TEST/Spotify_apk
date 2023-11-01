package p.c92;
import p.ir0;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.iv6;
import p.b92;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class c92 extends p0 implements ir0	// class@0011bf from classes.dex
{
    public final c92 c;

    public void c92(Flowable p0){
       super(p0);
       this.c = this;
    }
    public final void accept(Object p0){
    }
    public final void u(iv6 p0){
       this.b.subscribe(new b92(p0, this.c));
    }
}
