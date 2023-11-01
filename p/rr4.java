package p.rr4;
import io.reactivex.rxjava3.core.Observable;
import p.zv6;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import p.kg4;
import p.iw1;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;

public final class rr4 extends Observable	// class@002543 from classes.dex
{
    public final int a;
    public final zv6 b;

    public void rr4(int p0,zv6 p1){
       this.a = p0;
       this.b = p1;
    }
    public final void subscribeActual(Observer p0){
       Object obj;
       jl1 a = jl1.a;
       rr4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             obj = tb.get();
             iw1.c(obj, "Supplier returned a null Throwable.");
             p0.onSubscribe(a);
             p0.onError(obj);
             return;
       }
       obj = tb.get();
       Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
       obj.subscribe(p0);
       return;
    }
}
