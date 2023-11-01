package p.qx4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.px4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.iz7;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.zy4;

public final class qx4 extends z1	// class@002433 from classes.dex
{
    public final int b;
    public final Scheduler c;

    public void qx4(ObservableSource p0,Scheduler p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       qx4 tc = this.c;
       switch (this.b){
           case 0:
           default:
             this.a.subscribe(new zy4(p0, tc));
             return;
       }
       px4 opx4 = new px4(p0);
       p0.onSubscribe(opx4);
       cd1.e(opx4, tc.c(new iz7(this, opx4, 22)));
       return;
    }
}
