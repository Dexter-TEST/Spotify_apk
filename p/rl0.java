package p.rl0;
import io.reactivex.rxjava3.core.Completable;
import p.zv6;
import p.yf2;
import p.ir0;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ql0;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class rl0 extends Completable	// class@00250a from classes.dex
{
    public final zv6 a;
    public final yf2 b;
    public final ir0 c;
    public final boolean t;

    public void rl0(zv6 p0,yf2 p1,ir0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = true;
    }
    public final void o(CompletableObserver p0){
       Object obj = this.a.get();
       Object obj1 = this.b.apply(obj);
       Objects.requireNonNull(obj1, "The completableFunction returned a null CompletableSource");
       obj1.subscribe(new ql0(p0, obj, this.c, this.t));
    }
}
