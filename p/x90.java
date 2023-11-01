package p.x90;
import io.reactivex.rxjava3.core.Observable;
import p.e15;
import io.reactivex.rxjava3.core.Observer;
import p.s90;
import p.w90;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ca0;
import p.y90;
import p.bx5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;

public final class x90 extends Observable	// class@0003b7 from classes2.dex
{
    public final int a;
    public final s90 b;

    public void x90(e15 p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void subscribeActual(Observer p0){
       s90 os90;
       x90 tb = this.b;
       switch (this.a){
           case 0:
             os90 = tb.clone();
             w90 ow90 = new w90(os90, p0);
             p0.onSubscribe(ow90);
             if (!ow90.isDisposed()) {
                os90.x(ow90);
             }
             return;
             break;
           default:
             os90 = tb.clone();
             y90 oy90 = new y90(os90);
             p0.onSubscribe(oy90);
             if (!oy90.isDisposed()) {
                bx5 uobx5 = os90.b();
                if (!oy90.isDisposed()) {
                   p0.onNext(uobx5);
                }
                if (!oy90.isDisposed()) {
                   p0.onComplete();
                }
             }
       }
       return;
    }
}
