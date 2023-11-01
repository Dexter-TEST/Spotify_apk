package p.ft4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.lang.String;
import p.iw1;
import p.b5;
import io.reactivex.rxjava3.core.Observer;
import p.yb0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.w81;

public final class ft4 extends Observable implements zv6	// class@001634 from classes.dex
{
    public final int a;
    public final Object b;

    public void ft4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
    }
    public final Object get(){
       Object obj1;
       Object obj = null;
       ft4 tb = this.b;
       switch (this.a){
           case 0:
             tb.run();
             return obj;
           case 1:
             obj1 = tb.call();
             iw1.c(obj1, "The Callable returned a null value.");
             return obj1;
           case 2:
             tb.run();
             return obj;
           default:
             obj1 = tb.get();
             iw1.c(obj1, "The supplier returned a null value.");
             return obj1;
       }
    }
    public final void subscribeActual(Observer p0){
       yb0 oyb0;
       w81 ow81;
       Object obj;
       ft4 tb = this.b;
       switch (this.a){
           case 0:
             oyb0 = new yb0();
             p0.onSubscribe(oyb0);
             if (!oyb0.isDisposed()) {
                tb.run();
                if (!oyb0.isDisposed()) {
                   p0.onComplete();
                }
             }
             return;
             break;
           case 1:
             ow81 = new w81(p0);
             p0.onSubscribe(ow81);
             if (!ow81.isDisposed()) {
                obj = tb.call();
                iw1.c(obj, "Callable returned a null value.");
                ow81.a(obj);
             }
             return;
             break;
           case 2:
             oyb0 = new yb0();
             p0.onSubscribe(oyb0);
             if (!oyb0.isDisposed()) {
                tb.run();
                if (!oyb0.isDisposed()) {
                   p0.onComplete();
                }
             }
             return;
             break;
           default:
             ow81 = new w81(p0);
             p0.onSubscribe(ow81);
             if (!ow81.isDisposed()) {
                obj = tb.get();
                iw1.c(obj, "Supplier returned a null value.");
                ow81.a(obj);
             }
             return;
       }
    }
}
