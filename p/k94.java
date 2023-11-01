package p.k94;
import p.yf2;
import p.sg2;
import java.lang.Object;
import p.xg1;
import io.reactivex.rxjava3.core.Flowable;
import p.i72;
import p.sd5;
import p.r82;
import p.vc5;
import io.reactivex.rxjava3.core.Observable;
import p.hh1;
import p.gh1;

public final class k94 implements yf2	// class@001bcd from classes.dex
{
    public final int a;
    public final sg2 b;

    public void k94(sg2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       k94 tb = this.b;
       switch (this.a){
           case 0:
             return new r82(new r82(tb.apply(p0.F).g(), new sd5(26), i), new vc5(10, p0), 2).x();
           case 1:
             return new r82(new r82(tb.apply(p0.F).g(), new sd5(28), i), new vc5(12, p0), 2).x();
           default:
             return new r82(new r82(tb.apply(p0.F).g(), new sd5(27), i), new vc5(11, p0), 2).x();
       }
    }
}
