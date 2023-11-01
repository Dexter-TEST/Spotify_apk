package p.qa2;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import p.yf2;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import p.pa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Observable;
import p.io2;
import p.vx4;
import io.reactivex.rxjava3.core.Observer;

public final class qa2 extends Completable	// class@002361 from classes.dex
{
    public final int a;
    public final yf2 b;
    public final boolean c;
    public final Object t;

    public void qa2(Object p0,yf2 p1,boolean p2,int p3){
       this.a = p3;
       super();
       this.t = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void o(CompletableObserver p0){
       qa2 tc = this.c;
       qa2 tb = this.b;
       qa2 tt = this.t;
       switch (this.a){
           case 0:
           default:
             if (!io2.y(tt, tb, p0)) {
                tt.subscribe(new vx4(p0, tb, tc));
             }
             return;
       }
       tt.subscribe(new pa2(p0, tb, tc));
       return;
    }
}
