package p.ok0;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.jl1;
import io.reactivex.rxjava3.core.SingleSource;
import p.vk0;
import io.reactivex.rxjava3.core.SingleObserver;
import p.m5;
import p.et0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.bn5;
import p.uk0;
import p.iv6;
import java.util.concurrent.Callable;
import p.b5;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.pk0;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import p.up0;
import io.reactivex.rxjava3.core.CompletableEmitter;
import java.lang.Iterable;
import java.util.Iterator;
import p.nk0;

public final class ok0 extends Completable	// class@002136 from classes.dex
{
    public final int a;
    public final Object b;

    public void ok0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
    }
    public final void o(CompletableObserver p0){
       m5 om5;
       jl1 a = jl1.a;
       ok0 tb = this.b;
       switch (this.a){
           case 0:
             Iterator iterator = tb.iterator();
             Objects.requireNonNull(iterator, "The iterator returned is null");
             nk0 onk0 = new nk0(p0, iterator);
             p0.onSubscribe(onk0.c);
             onk0.a();
             return;
             break;
           case 1:
             pk0 opk0 = new pk0(p0);
             p0.onSubscribe(opk0);
             tb.subscribe(opk0);
             return;
             break;
           case 2:
             Object obj = tb.get();
             Objects.requireNonNull(obj, "The completableSupplier returned a null CompletableSource");
             obj.subscribe(p0);
             return;
             break;
           case 3:
             p0.onSubscribe(a);
             p0.onError(tb);
             return;
           case 4:
             om5 = et0.e();
             p0.onSubscribe(om5);
             if (!om5.isDisposed()) {
                tb.run();
                if (!om5.isDisposed()) {
                   p0.onComplete();
                }
             }
             return;
             break;
           case 5:
             om5 = et0.e();
             p0.onSubscribe(om5);
             tb.call();
             if (!om5.isDisposed()) {
                p0.onComplete();
             }
             return;
             break;
           case 6:
             tb.subscribe(new uk0(p0));
             return;
           case 7:
             om5 = et0.e();
             p0.onSubscribe(om5);
             if (!om5.isDisposed()) {
                tb.run();
                if (!om5.isDisposed()) {
                   p0.onComplete();
                }
             }
             return;
             break;
           case 8:
             tb.subscribe(new vk0(0, p0));
             return;
           default:
             tb.subscribe(p0);
             return;
       }
    }
}
