package p.w24;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Object;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import p.o34;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.MaybeSource;
import java.lang.Throwable;
import p.co5;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;
import p.v24;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import p.up0;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.core.SingleSource;
import p.p34;
import io.reactivex.rxjava3.core.SingleObserver;

public final class w24 extends Maybe	// class@002ab2 from classes.dex
{
    public final int a;
    public final Object b;

    public void w24(int p0,Object p1){
       this.a = p0;
       this.b = p1;
    }
    public final void d(MaybeObserver p0){
       w24 tb = this.b;
       switch (this.a){
           case 0:
             v24 ov24 = new v24(p0);
             p0.onSubscribe(ov24);
             tb.subscribe(ov24);
             return;
             break;
           case 1:
             Object obj = tb.get();
             Objects.requireNonNull(obj, "The maybeSupplier returned a null MaybeSource");
             obj.subscribe(p0);
             return;
             break;
           case 2:
             tb.subscribe(new o34(p0));
             return;
           default:
             tb.subscribe(new p34(p0));
             return;
       }
    }
}
