package p.sj6;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bn5;
import p.tj6;
import p.iv6;
import p.m5;
import p.et0;
import java.util.concurrent.Callable;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hi6;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import p.c82;
import p.rj6;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CompletionStage;
import p.zo4;
import p.s24;

public final class sj6 extends Single	// class@002640 from classes.dex
{
    public final int a;
    public final Object b;

    public void sj6(int p0,Object p1){
       this.a = p0;
       this.b = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       sj6 tb = this.b;
       switch (this.a){
           case 0:
             c82 uoc82 = new c82(0);
             rj6 orj6 = new rj6(p0, uoc82);
             uoc82.lazySet(orj6);
             p0.onSubscribe(orj6);
             zo4.w(tb, uoc82);
             return;
           case 1:
             hi6 ohi6 = new hi6(p0);
             p0.onSubscribe(ohi6);
             tb.subscribe(ohi6);
             return;
             break;
           case 2:
             m5 om5 = et0.e();
             p0.onSubscribe(om5);
             if (!om5.isDisposed()) {
                Object obj = tb.call();
                Objects.requireNonNull(obj, "The callable returned a null value");
                if (!om5.isDisposed()) {
                   p0.onSuccess(obj);
                }
             }
             return;
             break;
           case 3:
             tb.subscribe(new tj6(p0));
             return;
           case 4:
             p0.onSubscribe(jl1.a);
             p0.onSuccess(tb);
             return;
           default:
             tb.subscribe(new s24(p0));
             return;
       }
    }
}
