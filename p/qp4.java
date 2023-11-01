package p.qp4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import java.lang.Object;
import java.lang.Iterable;
import p.zv6;
import io.reactivex.rxjava3.core.Observer;
import p.qy4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.oy4;
import p.ry4;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.py4;
import p.tu4;
import p.op4;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.Throwable;
import p.co5;
import p.jl1;
import p.nr4;
import p.mf1;
import p.sz4;

public final class qp4 extends z1	// class@0023ec from classes.dex
{
    public final int b;
    public final yf2 c;
    public final Object t;
    public final Object v;

    public void qp4(ObservableSource p0,ObservableSource p1,yf2 p2,Object p3,int p4){
       this.b = p4;
       super(p0);
       this.v = p1;
       this.c = p2;
       this.t = p3;
    }
    public void qp4(ObservableSource p0,Iterable p1,yf2 p2){
       this.b = 3;
       super(p0);
       this.t = null;
       this.v = p1;
       this.c = p2;
    }
    public void qp4(ObservableSource p0,yf2 p1,yf2 p2,zv6 p3){
       this.b = 1;
       super(p0);
       this.c = p1;
       this.v = p2;
       this.t = p3;
    }
    public void qp4(ObservableSource p0,ObservableSource[] p1,yf2 p2){
       this.b = 3;
       super(p0);
       this.t = p1;
       this.v = null;
       this.c = p2;
    }
    public final void subscribeActual(Observer p0){
       oy4 ooy4;
       int i;
       int i1;
       z1 ta = this.a;
       qp4 tc = this.c;
       qp4 tt = this.t;
       qp4 tv = this.v;
       switch (this.b){
           case 0:
             op4 oop4 = new op4(p0, tv, tc, tt);
             p0.onSubscribe(oop4);
             ta.subscribe(oop4);
             return;
           case 1:
             ta.subscribe(new tu4(p0, tc, tv, tt));
             return;
           case 2:
             if (tt == null) {
                qy4 oqy4 = new qy4(p0, tc);
                p0.onSubscribe(oqy4);
                if (tv != null) {
                   ooy4 = new oy4(0, oqy4);
                   qy4 c = oqy4.c;
                   c.getClass();
                   if (cd1.c(c, ooy4)) {
                      tv.subscribe(ooy4);
                   }
                }
                ta.subscribe(oqy4);
             }else {
                py4 opy4 = new py4(tt, p0, tc);
                p0.onSubscribe(opy4);
                if (tv != null) {
                   ooy4 = new oy4(0, opy4);
                   py4 c1 = opy4.c;
                   c1.getClass();
                   if (cd1.c(c1, ooy4)) {
                      tv.subscribe(ooy4);
                   }
                }
                ta.subscribe(opy4);
             }
             return;
             break;
           default:
             if (tt == null) {
                ObservableSource[] observableSo = new ObservableSource[8];
                Iterator iterator = tv.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   ObservableSource observableSo1 = iterator.next();
                   if (i == observableSo.length) {
                      i1 = i >> 1;
                      i1 = i1 + i;
                      observableSo = Arrays.copyOf(observableSo, i1);
                   }
                   i1 = i + 1;
                   observableSo[i] = observableSo1;
                   i = i1;
                }
                tt = observableSo;
             }else {
                i = tt.length;
             }
             if (!i) {
                new nr4(ta, new mf1(25, this), 3).subscribeActual(p0);
             }else {
                sz4 osz4 = new sz4(p0, tc, i);
                p0.onSubscribe(osz4);
                osz4.subscribe(tt, i);
                ta.subscribe(osz4);
             }
             return;
       }
    }
}
