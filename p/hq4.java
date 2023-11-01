package p.hq4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;
import p.hh2;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.f37;
import java.util.stream.Collector;
import p.ds4;
import p.zv6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.jl1;
import java.util.function.Supplier;
import p.zo4;
import java.util.function.BiConsumer;
import java.util.function.Function;
import p.gq4;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.String;
import p.iw1;
import java.util.Collection;
import p.yy4;

public final class hq4 extends Single implements rh2	// class@0018a2 from classes.dex
{
    public final int a;
    public final ObservableSource b;
    public final Object c;

    public void hq4(ObservableSource p0,int p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = new hh2(p1);
    }
    public void hq4(ObservableSource p0,Object p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Observable a(){
       hq4 tc = this.c;
       hq4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new ds4(tb, tc, 6);
       }
       return new f37(tb, 1, tc);
    }
    public final void subscribeActual(SingleObserver p0){
       hq4 tb = this.b;
       hq4 tc = this.c;
       switch (this.a){
           case 0:
             break;
           default:
             Object obj = tc.get();
             iw1.c(obj, "The collectionSupplier returned a null Collection.");
             tb.subscribe(new yy4(p0, obj));
             return;
       }
       tb.subscribe(new gq4(p0, zo4.k(zo4.o(tc)), zo4.m(tc), zo4.n(tc)));
       return;
    }
}
