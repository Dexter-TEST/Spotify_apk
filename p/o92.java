package p.o92;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.lv6;
import p.kv6;
import p.n92;

public final class o92 extends p0	// class@0020d4 from classes.dex
{
    public final long c;

    public void o92(Flowable p0,long p1){
       super(p0);
       this.c = p1;
    }
    public final void u(iv6 p0){
       lv6 olv6 = new lv6();
       p0.onSubscribe(olv6);
       o92 tc = this.c;
       long l = Long.MAX_VALUE;
       if (tc - l) {
          l = tc - 1;
       }
       n92 v6 = new n92(p0, l, olv6, this.b);
       v6.a();
       return;
    }
}
