package p.tp4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import p.ny4;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import p.yw4;
import p.w00;
import java.lang.Throwable;
import p.kg4;
import p.dd1;
import p.ir0;
import p.b5;
import p.bs4;
import p.yf2;
import p.y00;
import p.iw1;
import java.util.Collection;
import p.as4;
import p.cq4;
import p.u00;
import p.sp4;
import p.ab6;
import p.rz4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kv4;

public final class tp4 extends z1	// class@0027b7 from classes.dex
{
    public final int b;
    public final Object c;
    public final Object t;

    public void tp4(ObservableSource p0,Object p1,Object p2,int p3){
       this.b = p3;
       super(p0);
       this.t = p1;
       this.c = p2;
    }
    public void tp4(ObservableSource p0,Object p1,Object p2,int p3,int p4){
       this.b = p3;
       super(p0);
       this.c = p1;
       this.t = p2;
    }
    public final void subscribeActual(Observer p0){
       Object obj;
       z1 ta = this.a;
       tp4 tt = this.t;
       tp4 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new sp4(new ab6(p0), tc, tt));
             return;
           case 1:
             obj = tc.get();
             Objects.requireNonNull(obj, "The initialSupplier returned a null value");
             ta.subscribe(new cq4(p0, obj, tt));
             return;
             break;
           case 2:
             obj = tc.get();
             iw1.c(obj, "The collectionSupplier returned a null Collection.");
             ta.subscribe(new as4(p0, tt, obj));
             return;
             break;
           case 3:
             ta.subscribe(new bs4(p0, tt, tc));
             return;
           case 4:
             ta.subscribe(new dd1(p0, tt, tc));
             return;
           case 5:
             obj = tc.get();
             Objects.requireNonNull(obj, "The seed supplied is null");
             ta.subscribe(new yw4(p0, tt, obj));
             return;
             break;
           case 6:
             ta.subscribe(new ny4(p0, tc, tt));
             return;
           default:
             ab6 uoab6 = new ab6(p0);
             rz4 orz4 = new rz4(uoab6, tc);
             uoab6.onSubscribe(orz4);
             tt.subscribe(new kv4(this, orz4));
             ta.subscribe(orz4);
             return;
       }
    }
}
