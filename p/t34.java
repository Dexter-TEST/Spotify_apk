package p.t34;
import p.t1;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.s34;
import p.y34;
import io.reactivex.rxjava3.disposables.Disposable;
import p.iz7;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class t34 extends t1	// class@0026f1 from classes.dex
{
    public final int b;
    public final Scheduler c;

    public void t34(MaybeSource p0,Scheduler p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void d(MaybeObserver p0){
       t1 ta = this.a;
       t34 tc = this.c;
       switch (this.b){
           case 0:
           default:
             y34 oy34 = new y34(p0);
             p0.onSubscribe(oy34);
             oy34 = oy34.a;
             oy34.getClass();
             cd1.c(oy34, tc.c(new iz7(oy34, 20, ta)));
             return;
       }
       ta.subscribe(new s34(p0, tc));
       return;
    }
}
