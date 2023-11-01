package p.ea2;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.bi5;
import p.iv6;
import p.lv6;
import p.kv6;
import p.da2;

public final class ea2 extends p0	// class@00144a from classes.dex
{
    public final bi5 c;
    public final long t;

    public void ea2(Flowable p0,long p1,bi5 p2){
       super(p0);
       this.c = p2;
       this.t = p1;
    }
    public final void u(iv6 p0){
       lv6 olv6 = new lv6();
       p0.onSubscribe(olv6);
       da2 v7 = new da2(p0, this.t, this.c, olv6, this.b);
       v7.a();
    }
}
