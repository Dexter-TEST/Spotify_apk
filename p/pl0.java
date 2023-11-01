package p.pl0;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.mj6;
import p.yf2;
import p.gj6;
import p.w00;
import p.aj6;
import p.ir0;
import p.b5;
import p.h34;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.rv4;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import p.co5;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.CompletableSource;
import p.kk0;
import io.reactivex.rxjava3.core.CompletableObserver;

public final class pl0 extends Single	// class@002281 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void pl0(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       super();
       this.c = p0;
       this.b = p2;
       this.t = p1;
    }
    public void pl0(Object p0,Object p1,Object p2,int p3,int p4){
       this.a = p3;
       super();
       this.c = p0;
       this.b = p1;
       this.t = p2;
    }
    public final void subscribeActual(SingleObserver p0){
       pl0 tb = this.b;
       pl0 tt = this.t;
       pl0 tc = this.c;
       switch (this.a){
           case 0:
             tc.subscribe(new kk0(this, p0));
             return;
           case 1:
             tc.subscribe(new rv4(p0, tt, tb));
             return;
           case 2:
             Object obj = tt.get();
             Objects.requireNonNull(obj, "The seedSupplier returned a null value");
             tc.subscribe(new rv4(p0, tb, obj));
             return;
             break;
           case 3:
             tc.subscribe(new h34(this, p0, 1));
             return;
           case 4:
             tc.subscribe(new aj6(p0, tt, tb));
             return;
           case 5:
             tc.subscribe(new gj6(p0, tt, tb));
             return;
           case 6:
             tc.subscribe(new mj6(p0, tt, tb));
             return;
           default:
             tc.subscribe(new h34(this, p0, 7));
             return;
       }
    }
}
