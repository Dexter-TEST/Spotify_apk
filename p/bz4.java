package p.bz4;
import io.reactivex.rxjava3.core.Observable;
import p.zv6;
import p.yf2;
import p.ir0;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.az4;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hn0;

public final class bz4 extends Observable	// class@001165 from classes.dex
{
    public final zv6 a;
    public final yf2 b;
    public final ir0 c;
    public final boolean t;

    public void bz4(zv6 p0,yf2 p1,ir0 p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       Object obj = this.a.get();
       Object obj1 = this.b.apply(obj);
       Objects.requireNonNull(obj1, "The sourceSupplier returned a null ObservableSource");
       obj1.subscribe(new az4(p0, obj, this.c, this.t));
    }
}
