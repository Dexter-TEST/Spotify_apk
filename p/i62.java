package p.i62;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import p.iv6;
import p.h62;
import p.kv6;

public final class i62 extends Flowable	// class@001931 from classes.dex
{
    public final bn5[] b;
    public final boolean c;

    public void i62(bn5[] p0){
       super();
       this.b = p0;
       this.c = false;
    }
    public final void u(iv6 p0){
       h62 oh62 = new h62(this.b, this.c, p0);
       p0.onSubscribe(oh62);
       oh62.onComplete();
    }
}
