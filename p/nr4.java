package p.nr4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import p.an5;
import p.db6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.yv4;
import p.hv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.kg4;
import p.lv4;
import p.kv4;
import java.util.concurrent.atomic.AtomicReference;
import p.fv4;
import p.ev4;
import p.uu4;
import p.et4;
import p.yr4;
import p.mr4;
import p.ab6;
import p.ow4;

public final class nr4 extends z1	// class@002034 from classes.dex
{
    public final int b;
    public final yf2 c;

    public void nr4(ObservableSource p0,yf2 p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       an5 uoan5;
       Object obj1;
       db6 uodb6;
       String str = "The handler returned a null ObservableSource";
       z1 ta = this.a;
       nr4 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new mr4(new ab6(p0), tc));
             return;
           case 1:
             ta.subscribe(new yr4(p0, tc));
             return;
           case 2:
             ta.subscribe(new et4(p0, tc));
             return;
           case 3:
             ta.subscribe(new uu4(p0, tc, 1));
             return;
           case 4:
             ev4 uoev4 = new ev4(p0, tc);
             p0.onSubscribe(uoev4.c);
             ta.subscribe(uoev4);
             return;
           case 5:
             ta.subscribe(new fv4(p0, tc));
             return;
           case 6:
             uoan5 = new an5();
             Object obj = tc.apply(uoan5);
             Objects.requireNonNull(obj, "The selector returned a null ObservableSource");
             lv4 olv4 = new lv4(p0);
             obj.subscribe(olv4);
             ta.subscribe(new kv4(uoan5, olv4, 0));
             return;
             break;
           case 7:
             uoan5 = new an5();
             if (!uoan5 instanceof db6) {
                uodb6 = new db6(uoan5);
             }
             obj1 = tc.apply(uoan5);
             Objects.requireNonNull(obj1, str);
             yv4 oyv4 = new yv4(p0, uoan5, ta);
             p0.onSubscribe(oyv4);
             obj1.subscribe(oyv4.v);
             oyv4.a();
             return;
             break;
           default:
             uoan5 = new an5();
             if (!uoan5 instanceof db6) {
                uodb6 = new db6(uoan5);
             }
             obj1 = tc.apply(uoan5);
             Objects.requireNonNull(obj1, str);
             ow4 oow4 = new ow4(p0, uoan5, ta);
             p0.onSubscribe(oow4);
             obj1.subscribe(oow4.v);
             oow4.a();
             return;
       }
    }
}
