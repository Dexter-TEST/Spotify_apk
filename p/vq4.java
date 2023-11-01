package p.vq4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import p.zo0;
import p.vs3;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.ir0;
import p.yf2;
import p.io2;
import p.uq4;
import p.ro1;
import p.zw4;
import p.y00;
import io.reactivex.rxjava3.disposables.Disposable;

public final class vq4 extends Observable	// class@002a46 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final int t;
    public final ObservableSource v;

    public void vq4(ObservableSource p0,Object p1,Object p2,int p3,int p4){
       this.a = p4;
       super();
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void vq4(zo0 p0,vs3 p1){
       this.a = 2;
       super();
       this.v = p0;
       this.t = 1;
       this.b = p1;
       this.c = new AtomicInteger();
    }
    public final void subscribeActual(Observer p0){
       vq4 ovq4;
       uq4 v7;
       vq4 tv = this.v;
       vq4 tc = this.c;
       vq4 tb = this.b;
       switch (this.a){
           case 0:
             ovq4 = tb;
             if (!io2.z(tv, ovq4, p0)) {
                v7 = new uq4(this.t, 0, p0, ovq4, tc);
                tv.subscribe(v7);
             }
             break;
           case 1:
             ovq4 = tb;
             if (!io2.A(tv, ovq4, p0)) {
                v7 = new uq4(this.t, 1, p0, ovq4, tc);
                tv.subscribe(v7);
             }
             return;
             break;
           case 2:
             tv.subscribe(p0);
             if (tc.incrementAndGet() == this.t) {
                tv.a(tb);
             }
             return;
             break;
           default:
             zw4 tv1 = new zw4(p0, this.t, this.v, tb, tc);
             p0.onSubscribe(tv);
             tv.subscribe();
             return;
       }
       return;
    }
}
