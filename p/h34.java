package p.h34;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import java.lang.Throwable;
import p.xi6;
import p.b5;
import p.co5;
import p.hn0;
import p.a44;
import p.u00;
import p.vi6;
import p.ir0;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.pl0;
import p.yf2;
import java.lang.NullPointerException;
import java.lang.String;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.util.Objects;
import p.y00;
import java.lang.Boolean;

public final class h34 implements SingleObserver	// class@0017d3 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void h34(Single p0,SingleObserver p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void h34(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void onError(Throwable p0){
       h34 tc = this.c;
       h34 tb = this.b;
       switch (this.a){
           case 0:
             tc.onError(p0);
             return;
           case 1:
             tb.onError(p0);
             return;
           case 2:
             tc.c.accept(p0);
             tb.onError(p0);
             return;
             break;
           case 3:
             tc.b.accept(null, p0);
             tb.onError(p0);
             return;
             break;
           case 4:
             tb.onError(p0);
             return;
           case 5:
             tc.c.run();
             tb.onError(p0);
             return;
             break;
           case 6:
             tb.onError(p0);
             return;
           default:
             h34 oh34 = tc;
             pl0 opl0 = (oh34.t != null)? tc.t.apply(p0): oh34.b;
             if (opl0 == null) {
                NullPointerException nullPointerE = new NullPointerException("Value supplied was null");
                nullPointerE.initCause(p0);
                tb.onError(nullPointerE);
             }else {
                tb.onSuccess(opl0);
             }
             return;
       }
    }
    public final void onSubscribe(Disposable p0){
       h34 tb = this.b;
       switch (this.a){
           case 0:
             cd1.c(tb, p0);
             return;
           case 1:
             tb.onSubscribe(p0);
             return;
           case 2:
             tb.onSubscribe(p0);
             return;
           case 3:
             tb.onSubscribe(p0);
             return;
           case 4:
             tb.onSubscribe(p0);
             return;
           case 5:
             tb.onSubscribe(p0);
             return;
           case 6:
             tb.onSubscribe(p0);
             return;
           default:
             tb.onSubscribe(p0);
             return;
       }
    }
    public final void onSuccess(Object p0){
       h34 tc = this.c;
       h34 tb = this.b;
       switch (this.a){
           case 0:
             tc.onSuccess(p0);
             return;
           case 1:
             tb.onSuccess(Boolean.valueOf(tc.t.test(p0, tc.b)));
             return;
             break;
           case 2:
             tb.onSuccess(p0);
             return;
           case 3:
             tc.b.accept(p0, null);
             tb.onSuccess(p0);
             return;
             break;
           case 4:
             tc.c.accept(p0);
             tb.onSuccess(p0);
             return;
             break;
           case 5:
             tc.c.run();
             tb.onSuccess(p0);
             return;
             break;
           case 6:
             p0 = tc.apply(p0);
             Objects.requireNonNull(p0, "The mapper function returned a null value.");
             tb.onSuccess(p0);
             return;
             break;
           default:
             tb.onSuccess(p0);
             return;
       }
    }
}
