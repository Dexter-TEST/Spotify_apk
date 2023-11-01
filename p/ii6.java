package p.ii6;
import io.reactivex.rxjava3.core.Single;
import p.zv6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import p.iw1;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import p.m5;
import p.et0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ii6 extends Single	// class@00199f from classes.dex
{
    public final int a;
    public final zv6 b;

    public void ii6(int p0,zv6 p1){
       this.a = p0;
       this.b = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       Object obj;
       jl1 a = jl1.a;
       ii6 tb = this.b;
       switch (this.a){
           case 0:
             obj = tb.get();
             Objects.requireNonNull(obj, "The singleSupplier returned a null SingleSource");
             obj.subscribe(p0);
             return;
             break;
           case 1:
             obj = tb.get();
             iw1.c(obj, "Supplier returned a null Throwable.");
             p0.onSubscribe(a);
             p0.onError(obj);
             return;
             break;
           default:
             m5 om5 = et0.e();
             p0.onSubscribe(om5);
             if (!om5.isDisposed()) {
                obj = tb.get();
                Objects.requireNonNull(obj, "The supplier returned a null value");
                if (!om5.isDisposed()) {
                   p0.onSuccess(obj);
                }
             }
       }
       return;
    }
}
