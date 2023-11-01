package p.rk4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.tk4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.sk4;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;

public final class rk4 implements ObservableTransformer	// class@002505 from classes.dex
{
    public final int a;
    public final tk4 b;

    public void rk4(tk4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       rk4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return p0.flatMapCompletable(new sk4(tb, 1)).s();
           case 1:
             tb.getClass();
             return p0.flatMapCompletable(new sk4(tb, 3)).s();
           case 2:
             tb.getClass();
             return p0.flatMapCompletable(new sk4(tb, 0)).s();
           default:
             tb.getClass();
             return p0.flatMapCompletable(new sk4(tb, 2)).s();
       }
    }
}
