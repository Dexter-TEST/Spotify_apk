package p.fl0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ir0;
import p.lb;
import p.b5;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.el0;

public final class fl0 extends Completable	// class@0015e9 from classes.dex
{
    public final CompletableSource a;
    public final ir0 b;
    public final ir0 c;
    public final b5 t;
    public final b5 v;
    public final b5 w;
    public final b5 x;

    public void fl0(CompletableSource p0,ir0 p1,ir0 p2,lb p3,lb p4,b5 p5,b5 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public final void o(CompletableObserver p0){
       this.a.subscribe(new el0(this, p0));
    }
}
