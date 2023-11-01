package p.t86;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.w86;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.k76;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.i76;
import java.util.Objects;
import p.up0;

public final class t86 implements ObservableTransformer	// class@002720 from classes.dex
{
    public final int a;
    public final w86 b;

    public void t86(w86 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       t86 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return p0.flatMapCompletable(new k76(tb, 1)).s();
           case 1:
             tb.getClass();
             return p0.flatMapCompletable(new k76(tb, 3)).s();
           case 2:
             tb.getClass();
             w86 v = tb.v;
             Objects.requireNonNull(v);
             return p0.map(new i76(10)).flatMapCompletable(new up0(20, v)).s();
           case 3:
             tb.getClass();
             return p0.switchMap(new k76(tb, 5));
           case 4:
             tb.getClass();
             return p0.switchMap(new k76(tb, 6));
           case 5:
             tb.getClass();
             return p0.flatMapCompletable(new k76(tb, 2)).s();
           default:
             tb.getClass();
             return p0.flatMapCompletable(new k76(tb, 4)).s();
       }
    }
}
