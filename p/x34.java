package p.x34;
import p.t1;
import p.k34;
import p.mb;
import p.ks3;
import p.lb;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.w34;

public final class x34 extends t1	// class@002bfe from classes.dex
{
    public final ir0 b;
    public final ir0 c;
    public final ir0 t;
    public final b5 v;
    public final b5 w;
    public final b5 x;

    public void x34(k34 p0,mb p1,mb p2,ks3 p3,lb p4,lb p5,lb p6){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public final void d(MaybeObserver p0){
       this.a.subscribe(new w34(p0, this));
    }
}
