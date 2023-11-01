package p.ds4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.xw4;
import p.w00;
import p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.lw4;
import p.y00;
import p.wv4;
import p.tp2;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.NullPointerException;
import java.lang.String;
import p.es4;
import p.b5;
import p.cs4;
import p.ir0;
import p.zv6;
import p.iw1;
import java.util.Collection;
import p.xy4;
import p.jl1;

public final class ds4 extends z1	// class@0013a9 from classes.dex
{
    public final int b;
    public final Object c;

    public void ds4(ObservableSource p0,Object p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       ra6 ora6;
       z1 ta = this.a;
       ds4 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new cs4(p0, tc, 0));
             return;
           case 1:
             ta.subscribe(new es4(p0, tc));
             return;
           case 2:
             try{
                tp2.v(tc);
                throw null;
             }catch(java.lang.NullPointerException e5){
                throw e5;
             }
           case 3:
             ora6 = new ra6();
             p0.onSubscribe(ora6);
             tp2.v(tc);
             wv4 owv4 = new wv4(p0, ora6, ta);
             if (!owv4.getAndIncrement()) {
                int i = 1;
                do {
                   owv4.c.subscribe(owv4);
                } while (!(i = - i));
             }
             return;
             break;
           case 4:
             ora6 = new ra6();
             p0.onSubscribe(ora6);
             new lw4(p0, tc, ora6, ta).a();
             return;
           case 5:
             ta.subscribe(new xw4(p0, tc));
             return;
           default:
             Object obj = tc.get();
             iw1.c(obj, "The collectionSupplier returned a null Collection.");
             ta.subscribe(new xy4(p0, obj));
             return;
       }
    }
}
