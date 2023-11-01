package p.bl4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.jl4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.fl4;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;

public final class bl4 implements ObservableTransformer	// class@0010e9 from classes.dex
{
    public final int a;
    public final jl4 b;

    public void bl4(jl4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       bl4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 6)).s();
           case 1:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 0)).s();
           case 2:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 3)).s();
           case 3:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 1)).s();
           case 4:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 4)).s();
           case 5:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 5)).s();
           case 6:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 7)).s();
           case 7:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 9)).s();
           case 8:
             tb.getClass();
             return p0.flatMapCompletable(new fl4(tb, 8)).s();
           default:
             tb.getClass();
             return p0.flatMapSingle(new fl4(tb, 2));
       }
    }
}
