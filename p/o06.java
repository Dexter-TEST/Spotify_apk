package p.o06;
import io.reactivex.rxjava3.core.Observable;
import p.ir0;
import io.reactivex.rxjava3.core.Observer;
import p.n06;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import p.p06;

public final class o06 extends Observable	// class@002086 from classes.dex
{
    public final int a;
    public final ir0 b;

    public void o06(ir0 p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void subscribeActual(Observer p0){
       o06 tb = this.b;
       switch (this.a){
           case 0:
           default:
             p06 op06 = new p06(tb, p0);
             p0.onSubscribe(op06);
             tb.accept(op06);
             return;
       }
       n06 on06 = new n06(tb, p0);
       p0.onSubscribe(on06);
       tb.accept(on06);
       return;
    }
}
